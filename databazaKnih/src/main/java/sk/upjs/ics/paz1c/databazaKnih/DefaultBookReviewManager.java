package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public class DefaultBookReviewManager implements BookReviewsManager {
    //tu budu metody na reviews podla autorov, uzivatelov, knih

    private InterfaceBookReviewDao bookReviewDao = MySQLDaoFactory.INSTANCE.getBookReviewDao();

    @Override
    public List<BookReview> getAllReviews() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertReview(BookReview review) {
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
