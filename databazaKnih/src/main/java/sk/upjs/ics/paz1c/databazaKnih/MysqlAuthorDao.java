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

public class MysqlAuthorDao implements InterfaceAuthorDao {

    private JdbcTemplate jdbcTemplate;
    private AuthorRowMapper authorRowMapper = new AuthorRowMapper();

    public MysqlAuthorDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Author> getAllAuthors() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORS, authorRowMapper);

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORS, new ResultSetExtractor<List<Author>>() {
            @Override
            public List<Author> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Author> authors = new ArrayList<>();
                Map<Integer, Book> books = new HashMap<>();
                Map<Integer, Genre> genres = new HashMap<>();
                Map<Integer, AuthorReview> reviews = new HashMap<>();
                Author author = null;
                while (rs.next()) {
                    int id = rs.getInt("idauthor");
                    if (author == null || author.getId() != id) {
                        author = new Author();
                        author.setBiography(rs.getString("biography"));
                        author.setBirth(rs.getDate("birth"));
                        author.setDeath(rs.getDate("death"));
                        author.setId(id);
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
                        int bookid = rs.getInt("book_idbook");
                        if (rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                                books.put(bookid, book);
                            }
                            author.getBooks().add(book);
                        }

                        int genreid = rs.getInt("genre_idgenre");
                        if (rs.wasNull()) {
                            Genre genre = genres.get(genreid);
                            if (genre == null) {
                                genre = ObjectFactory.INSTANCE.getGenreDao().findById(genreid);
                                genres.put(genreid, genre);
                            }
                            author.getGenres().add(genre);
                        }

                        int reviewid = rs.getInt("authorreview_idauthorreview");
                        if (rs.wasNull()) {
                            AuthorReview review = reviews.get(reviewid);
                            if (review == null) {
                                review = ObjectFactory.INSTANCE.getAuthorReviewDao().findById(reviewid);
                                reviews.put(reviewid, review);
                            }
                            author.getAuthorReviews().add(review);
                        }
                    }
                }
                return authors;
            }
        });
    }

    @Override
    public void insertAuthor(Author author) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_AUTHOR_BY_ID+id, new ResultSetExtractor<Author>() {
            @Override
            public Author extractData(ResultSet rs) throws SQLException, DataAccessException {
                Author author = null;
                while (rs.next()) {
                    if (author == null || author.getId() != id) {
                        author = new Author();
                        author.setId(id);
                        author.setBiography(rs.getString("biography"));
                        author.setBirth(rs.getDate("birth"));
                        author.setDeath(rs.getDate("death"));
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
                    int bookid = rs.getInt("book_idbook");
                    int genreid = rs.getInt("genre_idgenre");
                    int reviewid = rs.getInt("authorreview_idauthorreview");
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                    author.getBooks().add(book);
                    Genre genre = ObjectFactory.INSTANCE.getGenreDao().findById(genreid);
                    author.getGenres().add(genre);
                    AuthorReview  review = ObjectFactory.INSTANCE.getAuthorReviewDao().findById(reviewid);
                    author.getAuthorReviews().add(review);
                }
                return author;
            }
        });
    }
}
