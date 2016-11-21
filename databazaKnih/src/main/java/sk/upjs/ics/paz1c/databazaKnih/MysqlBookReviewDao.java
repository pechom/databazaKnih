package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlBookReviewDao implements InterfaceBookReviewDao {

    private JdbcTemplate jdbcTemplate;
    private BookReviewRowMapper bookReviewRowMapper = new BookReviewRowMapper();

    public MysqlBookReviewDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BookReview> getAllReviews() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKREVIEWS, bookReviewRowMapper);
    }

    @Override
    public void insertReview(BookReview review) {
         SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteReview(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void updateReview(BookReview review) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BookReview findById(int id) {
       try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_BOOKREVIEW_BY_ID, bookReviewRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
