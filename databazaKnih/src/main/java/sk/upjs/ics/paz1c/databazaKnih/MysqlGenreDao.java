package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MysqlGenreDao implements InterfaceGenreDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlGenreDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Genre> getAllGenre() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_GENRES, genreRowMapper);

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_GENRES, new ResultSetExtractor<List<Genre>>() {
            @Override
            public List<Genre> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Genre> genres = new ArrayList<>();
                Map<Integer, Author> authors = new HashMap<>();
                Map<Integer, Book> books = new HashMap<>();
                Genre genre = null;
                while (rs.next()) {
                    int id = rs.getInt("idgenre");
                    if (genre == null || genre.getId() != id) {
                        genre = new Genre();
                        genre.setId(id);
                        genre.setName(rs.getString("name"));
                        genre.setIsActive(rs.getBoolean("isActive"));

                        genre.setAuthorsWithGenre(new ArrayList<>());
                        genre.setBooksWithGenre(new ArrayList<>());
                        genres.add(genre);

                        int authorid = rs.getInt("genreofauthor.author_idauthor");
                        if (!rs.wasNull()) {
                            Author author = authors.get(authorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                            }
                            if (author != null) {
                                authors.put(authorid, author);

                                if (author.isIsActive()) {
                                    genre.getAuthorsWithGenre().add(author);
                                }
                            }
                        }

                        int bookid = rs.getInt("genreofbook.book_idbook");
                        if (!rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                            }
                            if (book != null) {
                                books.put(bookid, book);

                                if (book.isIsActive()) {
                                    genre.getBooksWithGenre().add(book);
                                }
                            }
                        }
                    }
                }
                return genres;
            }
        });
    }

    @Override
    public void insertGenre(Genre genre) {
        jdbcTemplate.update(SqlQueries.INSERT_GENRE, genre.getName(), genre.isIsActive());
    }

    @Override
    public void deleteGenre(int id) {
        Genre genre = findById(id);
        genre.setIsActive(false);
        updateGenre(genre);
    }

    @Override
    public void updateGenre(Genre genre) {
        jdbcTemplate.update(SqlQueries.UPDATE_GENRE, genre.getName(),
                genre.isIsActive(), genre.getId());
    }

    @Override
    public Genre findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_GENRE_BY_ID + id, new ResultSetExtractor<Genre>() {
            @Override
            public Genre extractData(ResultSet rs) throws SQLException, DataAccessException {
                Genre genre = null;
                while (rs.next()) {
                    if (genre == null || genre.getId() != id) {
                        genre = new Genre();
                        genre.setId(id);
                        genre.setName(rs.getString("name"));
                        genre.setIsActive(rs.getBoolean("isActive"));
                        genre.setAuthorsWithGenre(new ArrayList<>());
                        genre.setBooksWithGenre(new ArrayList<>());
                    }
                    int authorid = rs.getInt("genreofauthor.author_idauthor");
                    if (!rs.wasNull()) {
                        Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);

                        if (author != null) {
                            if (author.isIsActive()) {
                                genre.getAuthorsWithGenre().add(author);
                            }
                        }
                    }
                    int bookid = rs.getInt("genreofbook.book_idbook");
                    if (!rs.wasNull()) {
                        Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                        if (book != null) {
                            if (book.isIsActive()) {
                                genre.getBooksWithGenre().add(book);
                            }
                        }
                    }
                }
                return genre;
            }
        });
    }

    @Override
    public void undeleteGenre(int id) {
        Genre genre = findById(id);
        genre.setIsActive(true);
        updateGenre(genre);
    }

    @Override
    public void addBookToGenre(int idbook, int idgenre) {
        jdbcTemplate.update(SqlQueries.ADD_BOOK_TO_GENRE, idbook, idgenre);
    }

    @Override
    public void removeBookFromGenre(int idbook, int idgenre) {
        jdbcTemplate.update(SqlQueries.REMOVE_BOOK_FROM_GENRE, idbook, idgenre);
    }

    @Override
    public void removeBook(int idbook) {
        jdbcTemplate.update(SqlQueries.REMOVE_BOOK_FROM_ALL_GENRES, idbook);
    }

    @Override
    public void addAuthorToGenre(int idauthor, int idgenre) {
        jdbcTemplate.update(SqlQueries.ADD_AUTHOR_TO_GENRE, idgenre, idauthor);
    }

    @Override
    public void removeAuthorFromGenre(int idauthor, int idgenre) {
        jdbcTemplate.update(SqlQueries.REMOVE_AUTHOR_FROM_GENRE, idauthor, idgenre);
    }

    @Override
    public void removeAuthor(int idauthor) {
        jdbcTemplate.update(SqlQueries.REMOVE_AUTHOR_FROM_ALL_GENRES, idauthor);
    }

}
