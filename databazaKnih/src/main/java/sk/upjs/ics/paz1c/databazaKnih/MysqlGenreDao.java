package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_GENRES, new ResultSetExtractor<List<Genre>>() {
            @Override
            public List<Genre> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Genre> genres = new ArrayList<>();
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
                            genre.getAuthorsWithGenre().add(authorid);
                        }

                        int bookid = rs.getInt("genreofbook.book_idbook");
                        if (!rs.wasNull()) {
                            genre.getBooksWithGenre().add(bookid);

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
//        Genre genre = findById(id);
//        genre.setIsActive(false);
//        updateGenre(genre);
        jdbcTemplate.update(SqlQueries.UPDATE_GENRE, id);
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
                        genre.getAuthorsWithGenre().add(authorid);
                    }

                    int bookid = rs.getInt("genreofbook.book_idbook");
                    if (!rs.wasNull()) {
                        genre.getBooksWithGenre().add(bookid);

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
