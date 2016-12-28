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

public class MysqlBookDao implements InterfaceBookDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlBookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> getAllBooks() {

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKS, new ResultSetExtractor<List<Book>>() {
            @Override
            public List<Book> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Book> books = new ArrayList<>();

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

                        int reviewid = rs.getInt("bookreview.idbookreview");
                        if (!rs.wasNull()) {
                            book.getBookReviews().add(reviewid);
                        }

                        int genreid = rs.getInt("genreofbook.genre_idgenre");
                        if (!rs.wasNull()) {
                            book.getGenres().add(genreid);

                        }

                        int tagid = rs.getInt("tagofbook.tag_idtag");
                        if (!rs.wasNull()) {
                            book.getTags().add(tagid);
                        }

                        int authorid = rs.getInt("authorofbook.author_idauthor");
                        if (!rs.wasNull()) {
                            book.setAuthor(authorid);
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
        jdbcTemplate.update(SqlQueries.UPDATE_BOOK, book.getName(), book.getYear(),
                book.getNumberOfPages(), book.getISBN(), book.getDescription(),
                book.getNumberOfReviews(), book.getAverageOfReviews(),
                book.isVerificationStatus(), book.getNumberInChart(),
                book.getBayesianAverage(), book.isIsActive(), book.getId());
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

                       int reviewid = rs.getInt("bookreview.idbookreview");
                        if (!rs.wasNull()) {
                            book.getBookReviews().add(reviewid);
                        }

                        int genreid = rs.getInt("genreofbook.genre_idgenre");
                        if (!rs.wasNull()) {
                            book.getGenres().add(genreid);

                        }

                        int tagid = rs.getInt("tagofbook.tag_idtag");
                        if (!rs.wasNull()) {
                            book.getTags().add(tagid);
                        }

                        int authorid = rs.getInt("authorofbook.author_idauthor");
                        if (!rs.wasNull()) {
                            book.setAuthor(authorid);
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

    @Override
    public void addAuthorToBook(int idauthor, int idbook) {
        jdbcTemplate.update(SqlQueries.ADD_AUTHOR_TO_BOOK, idbook, idauthor);
    }

    @Override
    public void removeAuthorFromBook(int idbook) {
        jdbcTemplate.update(SqlQueries.REMOVE_AUTHOR_FROM_BOOK, idbook);
    }

    @Override
    public void removeAuthor(int idauthor) {
        jdbcTemplate.update(SqlQueries.REMOVE_AUTHOR_FROM_ALL_BOOKS, idauthor);
    }

    @Override
    public void addGenreToBook(int idgenre, int idbook) {
        jdbcTemplate.update(SqlQueries.ADD_GENRE_TO_BOOK, idbook, idgenre);
    }

    @Override
    public void removeGenreFromBook(int idgenre, int idbook) {
        jdbcTemplate.update(SqlQueries.REMOVE_GENRE_FROM_BOOK, idbook, idgenre);
    }

    @Override
    public void removeGenre(int idgenre) {
        jdbcTemplate.update(SqlQueries.REMOVE_GENRE_FROM_ALL_BOOKS, idgenre);
    }

    @Override
    public void addTagToBook(int idtag, int idbook) {
        jdbcTemplate.update(SqlQueries.ADD_TAG_TO_BOOK, idtag, idbook);
    }

    @Override
    public void removeTagFromBook(int idtag, int idbook) {
        jdbcTemplate.update(SqlQueries.REMOVE_TAG_FROM_BOOK, idbook, idtag);
    }

    @Override
    public void removeTag(int idtag) {
        jdbcTemplate.update(SqlQueries.REMOVE_TAG_FROM_ALL_BOOKS, idtag);
    }

    @Override
    public void addReviewToBook(int idreview, Book book) {
        jdbcTemplate.update(SqlQueries.ADD_REVIEW_TO_BOOK, book.getNumberOfReviews(),
                book.getAverageOfReviews(), book.getBayesianAverage(),
                book.getNumberInChart(), book.getId());
    }

    @Override
    public void removeReviewFromBook(int idreview, Book book) {
        jdbcTemplate.update(SqlQueries.REMOVE_REVIEW_FROM_BOOK, book.getNumberOfReviews(),
                book.getAverageOfReviews(), book.getBayesianAverage(),
                book.getNumberInChart(), book.getId());
    }

    @Override
    public void removeReviewsFromBook(int idbook) {
        jdbcTemplate.update(SqlQueries.REMOVE_TAG_FROM_ALL_BOOKS, idbook);
    }

}
