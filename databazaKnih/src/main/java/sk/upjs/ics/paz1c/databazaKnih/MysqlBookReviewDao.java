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

public class MysqlBookReviewDao implements InterfaceBookReviewDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlBookReviewDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BookReview> getAllReviews() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKREVIEWS, bookReviewRowMapper);

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKREVIEWS, new ResultSetExtractor<List<BookReview>>() {

            @Override
            public List<BookReview> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<BookReview> reviews = new ArrayList<>();
                Map<Integer, Book> books = new HashMap<>();
                Map<Integer, User> users = new HashMap<>();
                BookReview bookReview = null;
                while (rs.next()) {
                    int id = rs.getInt("bookreview");
                    if (bookReview == null || bookReview.getId() != id) {
                        bookReview = new BookReview();
                        bookReview.setId(id);
                        bookReview.setRating(rs.getInt("rating"));
                        bookReview.setReview(rs.getString("review"));
                        reviews.add(bookReview);

                        int bookid = rs.getInt("book_idbook");
                        if (rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                                books.put(bookid, book);
                            }
                            if (book.isIsActive()) {
                                bookReview.setBook(book);
                            }
                        }

                        int userid = rs.getInt("user_iduser");
                        if (rs.wasNull()) {
                            User user = users.get(userid);
                            if (user == null) {
                                user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                                users.put(userid, user);
                            }
                            if (user.isIsActive()) {
                                bookReview.setUser(user);
                            }
                        }
                    }
                }
                return reviews;
            }
        });
    }

    @Override
    public void insertReview(BookReview review) {
        jdbcTemplate.update(SqlQueries.INSERT_BOOKREVIEW, review.getRating(),
                review.getReview(), review.isIsActive(),
                review.getBook().getId(), review.getUser().getId());
    }

    @Override
    public void deleteReview(int id) {
        BookReview bookReview = findById(id);
        bookReview.setIsActive(false);
        updateReview(bookReview);
        jdbcTemplate.update(SqlQueries.DELETE_BOOKREVIEW, id);
    }

    @Override
    public void updateReview(BookReview review) {
        jdbcTemplate.update(SqlQueries.UPDATE_BOOKREVIEW, review.getRating(),
                review.getReview(), review.isIsActive(), review.getId());
    }

    @Override
    public BookReview findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_BOOKREVIEW_BY_ID + id, new ResultSetExtractor<BookReview>() {

            @Override
            public BookReview extractData(ResultSet rs) throws SQLException, DataAccessException {
                BookReview bookReview = null;
                while (rs.next()) {
                    if (bookReview == null || bookReview.getId() != id) {
                        bookReview = new BookReview();
                        bookReview.setId(id);
                        bookReview.setRating(rs.getInt("rating"));
                        bookReview.setReview(rs.getString("review"));

                    }
                    int bookid = rs.getInt("book_idbook");
                    int userid = rs.getInt("user_iduser");
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                    if (book.isIsActive()) {
                        bookReview.setBook(book);
                    }
                    User user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                    if (user.isIsActive()) {
                        bookReview.setUser(user);
                    }
                }

                return bookReview;
            }
        });
    }

    @Override
    public void undeleteReview(int id) {
        BookReview bookReview = findById(id);
        bookReview.setIsActive(true);
        updateReview(bookReview);
    }

    @Override
    public void deleteReviewsWithBook(int idbook) {
        jdbcTemplate.update(SqlQueries.DELETE_BOOKREVIEWS_WITH_BOOK, idbook);
    }

    @Override
    public void deleteReviewsWithUser(int iduser) {
        jdbcTemplate.update(SqlQueries.DELETE_BOOKREVIEWS_WITH_USER, iduser);
    }

}
