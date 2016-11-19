package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
//metody s reviews ako select podla zanru, roku, stavu, tagu, narodnosti od aj do...

public class DefaultAuthorReviewManager implements AuthorReviewManager{

    private InterfaceAuthorReviewDao authorReviewDao = MySQLDaoFactory.INSTANCE.getAuthorReviewDao();

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
