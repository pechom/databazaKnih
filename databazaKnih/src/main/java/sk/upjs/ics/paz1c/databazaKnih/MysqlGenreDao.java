package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlGenreDao implements InterfaceGenreDao {

    private JdbcTemplate jdbcTemplate;
    private GenreRowMapper genreRowMapper = new GenreRowMapper();

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

                        int authorid = rs.getInt("author_idauthor");
                        if (rs.wasNull()) {
                            Author author = authors.get(authorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                                authors.put(authorid, author);
                            }
                            genre.getAuthorsWithGenre().add(author);
                        }

                        int bookid = rs.getInt("book_idbook");
                        if (rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                                books.put(bookid, book);
                            }
                            genre.getBooksWithGenre().add(book);
                        }
                    }
                }
                return genres;
            }
        });
    }

    @Override
    public void insertGenre(Genre genre) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteGenre(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateGenre(Genre genre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Genre findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_GENRE_BY_ID, new ResultSetExtractor<Genre>() {
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
                    int authorid = rs.getInt("author_idauthor");
                    Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                    int bookid = rs.getInt("book_idbook");
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                    genre.getAuthorsWithGenre().add(author);
                    genre.getBooksWithGenre().add(book);
                }
                return genre;
            }
        });
    }

}
