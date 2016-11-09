package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlAuthorReviewDao implements InterfaceAuthorReviewDao {

    JdbcTemplate jdbcTemplate;

    public MysqlAuthorReviewDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AuthorReview> getAllReviews() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertReview(AuthorReview review) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteReview(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateReview(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
