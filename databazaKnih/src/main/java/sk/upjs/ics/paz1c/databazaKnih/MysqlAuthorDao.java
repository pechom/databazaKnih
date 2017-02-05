package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MysqlAuthorDao implements InterfaceAuthorDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlAuthorDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Author> getAllAuthors() {

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORS, new ResultSetExtractor<List<Author>>() {
            @Override
            public List<Author> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Author> authors = new ArrayList<>();

                Author author = null;
                while (rs.next()) {
                    int id = rs.getInt("idauthor");
                    if (author == null || author.getId() != id) {
                        author = new Author();
                        author.setId(id);
                        author.setBiography(rs.getString("biography"));
                        author.setBirth(rs.getInt("birth"));
                        author.setDeath(rs.getInt("death"));
                        author.setLifeStatus(rs.getBoolean("lifeStatus"));
                        author.setName(rs.getString("name"));
                        author.setNationality(rs.getString("nationality"));
                        author.setSex(rs.getString("sex"));
                        author.setVerificationStatus(rs.getBoolean("verificationStatus"));
                        author.setIsActive(rs.getBoolean("isActive"));

                        author.setAuthorReviews(new ArrayList<>());
                        author.setBooks(new ArrayList<>());
                        author.setGenres(new ArrayList<>());

                        authors.add(author);

                        int bookid = rs.getInt("authorofbook.book_idbook");
                        if (!rs.wasNull()) {
                            author.getBooks().add(bookid);
                        }
                        int genreid = rs.getInt("genreofauthor.genre_idgenre");
                        if (!rs.wasNull()) {
                            author.getGenres().add(genreid);
                        }
                        int reviewid = rs.getInt("authorreview.idauthorreview");
                        if (!rs.wasNull()) {
                            author.getAuthorReviews().add(reviewid);
                        }

                    }

                }
                return authors;
            }
        });
    }

    @Override

    public void insertAuthor(Author author) {
        jdbcTemplate.update(SqlQueries.INSERT_AUTHOR, author.getName(),
                author.getBirth(), author.getDeath(), author.getNationality(),
                author.getSex(), author.getBiography(), author.isVerificationStatus(),
                author.isLifeStatus(), author.isIsActive());
    }

    @Override
    public void deleteAuthor(int id) {
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, id);
    }

    @Override
    public void updateAuthor(Author author) {
        jdbcTemplate.update(SqlQueries.UPDATE_AUTHOR, author.getName(),
                author.getBirth(), author.getDeath(), author.getNationality(),
                author.getSex(), author.getBiography(), author.isVerificationStatus(),
                author.isLifeStatus(), author.isIsActive(), author.getId());
    }

    @Override
    public Author findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_AUTHOR_BY_ID + id, new ResultSetExtractor<Author>() {
            @Override
            public Author extractData(ResultSet rs) throws SQLException, DataAccessException {
                Author author = null;
                while (rs.next()) {
                    if (author == null || author.getId() != id) {
                        author = new Author();
                        author.setId(id);
                        author.setBiography(rs.getString("biography"));
                        author.setBirth(rs.getInt("birth"));
                        author.setDeath(rs.getInt("death"));
                        author.setLifeStatus(rs.getBoolean("lifeStatus"));
                        author.setName(rs.getString("name"));
                        author.setNationality(rs.getString("nationality"));
                        author.setSex(rs.getString("sex"));
                        author.setVerificationStatus(rs.getBoolean("verificationStatus"));
                        author.setIsActive(rs.getBoolean("isActive"));

                        author.setAuthorReviews(new ArrayList<>());
                        author.setBooks(new ArrayList<>());
                        author.setGenres(new ArrayList<>());

                    }
                    int bookid = rs.getInt("authorofbook.book_idbook");
                    if (!rs.wasNull()) {
                        author.getBooks().add(bookid);
                    }
                    int genreid = rs.getInt("genreofauthor.genre_idgenre");
                    if (!rs.wasNull()) {
                        author.getGenres().add(genreid);
                    }
                    int reviewid = rs.getInt("authorreview.idauthorreview");
                    if (!rs.wasNull()) {
                        author.getAuthorReviews().add(reviewid);
                    }
                }
                return author;
            }
        });
    }

    @Override
    public void undeleteAuthor(int id) {
        Author author = findById(id);
        author.setIsActive(true);
        updateAuthor(author);
    }

    @Override
    public void addBookToAuthor(int bookid, int authorid) {
        jdbcTemplate.update(SqlQueries.ADD_BOOK_TO_AUTHOR, bookid, authorid);
    }

    @Override
    public void removeBookFromAuthor(int bookid, int authorid) {
        jdbcTemplate.update(SqlQueries.REMOVE_BOOK_FROM_AUTHOR, bookid, authorid);
    }

    @Override
    public void addGenreToAuthor(int genreid, int authorid) {
        jdbcTemplate.update(SqlQueries.ADD_GENRE_TO_AUTHOR, genreid, authorid);
    }

    @Override
    public void removeGenreFromAuthor(int genreid, int authorid) {
        jdbcTemplate.update(SqlQueries.REMOVE_GENRE_FROM_AUTHOR, genreid, authorid);
    }

    @Override
    public void removeGenre(int genreid) {
        jdbcTemplate.update(SqlQueries.REMOVE_GENRE_FROM_ALL_AUTHORS, genreid);
    }

    @Override
    public void removeReviews(int authorid) {
        jdbcTemplate.update(SqlQueries.REMOVE_ALL_REVIEWS_FROM_AUTHOR, authorid);
    }
}
