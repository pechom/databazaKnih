package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlAuthorReviewDao implements InterfaceAuthorReviewDao {

    private JdbcTemplate jdbcTemplate;
    private AuthorReviewRowMapper authorReviewRowMapper = new AuthorReviewRowMapper();

    public MysqlAuthorReviewDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AuthorReview> getAllReviews() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORREVIEWS, authorReviewRowMapper);
    }

    @Override
    public void insertReview(AuthorReview review) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteReview(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateReview(AuthorReview review) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AuthorReview findById(int id) {
        try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_AUTHORREVIEW_BY_ID, authorReviewRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
