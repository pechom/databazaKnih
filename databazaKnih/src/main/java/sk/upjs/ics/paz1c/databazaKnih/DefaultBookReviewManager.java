package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public class DefaultBookReviewManager implements BookReviewManager {
    //tu budu metody na filtre na parametre.

    private InterfaceBookReviewDao bookReviewDao = ObjectFactory.INSTANCE.getBookReviewDao();

    @Override
    public List<BookReview> getAllReviews() {
        return bookReviewDao.getAllReviews();
    }

    @Override
    public void insertReview(BookReview review) {
        bookReviewDao.insertReview(review);
    }

    @Override
    public void deleteReview(int id) {
        bookReviewDao.deleteReview(id);
    }

    @Override
    public void updateReview(BookReview review) {
        bookReviewDao.updateReview(review);
    }

    @Override
    public BookReview findById(int id) {
        return bookReviewDao.findById(id);
    }

    @Override
    public List<BookReview> getReviewsByBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookReview> getReviewsByUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookReview> getReviewsFromRating(int rating) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookReview> getReviewsToRating(int rating) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookReview> getReviewsFromToRating(int from, int to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrUpdateUser(BookReview review, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrUpdateBook(BookReview review, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteReviewsWithBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteReviewsWithUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undeleteReview(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
