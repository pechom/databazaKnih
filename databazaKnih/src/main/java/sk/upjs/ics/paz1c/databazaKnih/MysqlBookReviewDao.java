package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKREVIEWS, new ResultSetExtractor<List<BookReview>>() {

            @Override
            public List<BookReview> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<BookReview> reviews = new ArrayList<>();
                BookReview bookReview = null;
                while (rs.next()) {
                    int id = rs.getInt("idbookreview");
                    if (bookReview == null || bookReview.getId() != id) {
                        bookReview = new BookReview();
                        bookReview.setId(id);
                        bookReview.setIsActive(rs.getBoolean("isActive"));
                        bookReview.setRating(rs.getInt("rating"));
                        bookReview.setReview(rs.getString("review"));
                        reviews.add(bookReview);
                    }
                    int bookid = rs.getInt("book_idbook");
                    if (!rs.wasNull()) {
                        bookReview.setBook(bookid);
                    } else {
                        bookReview.setBook(0);
                    }

                    int userid = rs.getInt("user_iduser");
                    if (!rs.wasNull()) {
                        bookReview.setUser(userid);
                    } else {
                        bookReview.setUser(0);
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
                review.getBook(), review.getUser());
    }

    @Override
    public void deleteReview(int id) {
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
                        bookReview.setIsActive(rs.getBoolean("isActive"));
                        bookReview.setRating(rs.getInt("rating"));
                        bookReview.setReview(rs.getString("review"));

                    }
                    int bookid = rs.getInt("book_idbook");
                    if (!rs.wasNull()) {
                        bookReview.setBook(bookid);
                    } else {
                        bookReview.setBook(0);
                    }

                    int userid = rs.getInt("user_iduser");
                    if (!rs.wasNull()) {
                        bookReview.setUser(userid);
                    } else {
                        bookReview.setUser(0);
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
