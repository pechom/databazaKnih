package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
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

public class MysqlBookDao implements InterfaceBookDao {

    private JdbcTemplate jdbcTemplate;
    private BookRowMapper bookRowMapper = new BookRowMapper();

    public MysqlBookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> getAllBooks() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKS, bookRowMapper);

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKS, new ResultSetExtractor<List<Book>>() {
            @Override
            public List<Book> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Book> books = new ArrayList<>();
                Map<Integer, Author> authors = new HashMap<>();
                Map<Integer, BookReview> reviews = new HashMap<>();
                Map<Integer, Genre> genres = new HashMap<>();
                Map<Integer, Tag> tags = new HashMap<>();

                Book book = null;
                while (rs.next()) {
                    int id = rs.getInt("idbook");
                    if (book == null || book.getId() != id) {
                        book = new Book();
                        book.setAverageOfReviews(rs.getDouble("averageOfReviews"));
                        book.setBayesianAverage(rs.getDouble("bayesianAverage"));
                        book.setDescription(rs.getString("description"));
                        book.setISBN(rs.getInt("ISBN"));
                        book.setId(id);
                        book.setName(rs.getString("name"));
                        book.setNumberInChart(rs.getInt("numberInChart"));
                        book.setNumberOfPages(rs.getInt("numberOfPages"));
                        book.setNumberOfReviews(rs.getInt("numberOfReviews"));
                        book.setVerificationStatus(rs.getBoolean("verificationStatus"));
                        book.setYear(rs.getInt("year"));
                        book.setIsActive(rs.getBoolean("isActive"));

                        book.setBookReviews(new ArrayList<>());
                        book.setGenres(new ArrayList<>());
                        book.setTags(new ArrayList<>());
                        books.add(book);

                        int reviewid = rs.getInt("bookreview_idbookreview");
                        if (rs.wasNull()) {
                            BookReview review = reviews.get(reviewid);
                            if (review == null) {
                                review = ObjectFactory.INSTANCE.getBookReviewDao().findById(reviewid);
                            }
                            if (review.isIsActive()) {
                                book.getBookReviews().add(review);
                            }
                        }

                        int genreid = rs.getInt("genre_idgenre");
                        if (rs.wasNull()) {
                            Genre genre = genres.get(genreid);
                            if (genre == null) {
                                genre = ObjectFactory.INSTANCE.getGenreDao().findById(genreid);
                                genres.put(genreid, genre);
                            }
                            if (genre.isIsActive()) {
                                book.getGenres().add(genre);
                            }
                        }

                        int tagid = rs.getInt("tag_idtag");
                        if (rs.wasNull()) {
                            Tag tag = tags.get(tagid);
                            if (tag == null) {
                                tag = ObjectFactory.INSTANCE.getTagDao().findById(tagid);
                                tags.put(tagid, tag);
                            }
                            if (tag.isIsActive()) {
                                book.getTags().add(tag);
                            }
                        }

                        int authorid = rs.getInt("author_idauthor");
                        if (rs.wasNull()) {
                            Author author = authors.get(authorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                                authors.put(authorid, author);
                            }
                            if (author.isIsActive()) {
                                book.setAuthor(author);
                            }
                        }
                    }
                }
                return books;
            }
        });
    }

    @Override
    public void insertBook(Book book) {
        jdbcTemplate.update(SqlQueries.INSERT_BOOK, book.getName(), book.getYear(),
                book.getNumberOfPages(), book.getISBN(), book.getDescription(),
                book.getNumberOfReviews(), book.getAverageOfReviews(),
                book.isVerificationStatus(), book.getNumberInChart(),
                book.getBayesianAverage(), book.isIsActive());
    }

    @Override
    public void deleteBook(int id) {
        Book book = findById(id);
        book.setIsActive(false);
        updateBook(book);
    }

    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_BOOK_BY_ID + id, new ResultSetExtractor<Book>() {
            @Override
            public Book extractData(ResultSet rs) throws SQLException, DataAccessException {
                Book book = null;
                while (rs.next()) {
                    if (book == null || book.getId() != id) {
                        book = new Book();
                        book.setId(id);
                        book.setAverageOfReviews(rs.getDouble("averageOfReviews"));
                        book.setBayesianAverage(rs.getDouble("bayesianAverage"));
                        book.setDescription(rs.getString("description"));
                        book.setISBN(rs.getInt("ISBN"));
                        book.setName(rs.getString("name"));
                        book.setNumberInChart(rs.getInt("numberInChart"));
                        book.setNumberOfPages(rs.getInt("numberOfPages"));
                        book.setNumberOfReviews(rs.getInt("numberOfReviews"));
                        book.setVerificationStatus(rs.getBoolean("verificationStatus"));
                        book.setYear(rs.getInt("year"));
                        book.setIsActive(rs.getBoolean("isActive"));

                        book.setBookReviews(new ArrayList<>());
                        book.setGenres(new ArrayList<>());
                        book.setTags(new ArrayList<>());

                        int genreid = rs.getInt("genre_idgenre");
                        int reviewid = rs.getInt("bookreview_idbookreview");
                        int tagid = rs.getInt("tag_idtag");
                        int authorid = rs.getInt("author_idauthor");
                        Genre genre = ObjectFactory.INSTANCE.getGenreDao().findById(genreid);
                        if (genre.isIsActive()) {
                            book.getGenres().add(genre);
                        }
                        BookReview review = ObjectFactory.INSTANCE.getBookReviewDao().findById(reviewid);
                        if (review.isIsActive()) {
                            book.getBookReviews().add(review);
                        }
                        Tag tag = ObjectFactory.INSTANCE.getTagDao().findById(tagid);
                        if (tag.isIsActive()) {
                            book.getTags().add(tag);
                        }
                        Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                        if (author.isIsActive()) {
                            book.setAuthor(author);
                        }

                    }
                }
                return book;
            }
        });
    }

    @Override
    public void undeleteBook(int id) {
        Book book = findById(id);
        book.setIsActive(true);
        updateBook(book);
    }

}
