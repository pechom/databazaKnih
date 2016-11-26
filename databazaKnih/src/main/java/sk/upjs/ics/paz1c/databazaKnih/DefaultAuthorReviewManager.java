package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
//metody na filtre na parametre.

public class DefaultAuthorReviewManager implements AuthorReviewManager {

    private InterfaceAuthorReviewDao authorReviewDao = ObjectFactory.INSTANCE.getAuthorReviewDao();

    @Override
    public List<AuthorReview> getAllReviews() {
        return authorReviewDao.getAllReviews();
    }

    @Override
    public void insertReview(AuthorReview review) {
        authorReviewDao.insertReview(review);
    }

    @Override
    public void deleteReview(int id) {
        authorReviewDao.deleteReview(id);
    }

    @Override
    public void updateReview(AuthorReview authorReview) {
        authorReviewDao.updateReview(authorReview);
    }

    @Override
    public AuthorReview findById(int id) {
        return authorReviewDao.findById(id);
    }

    @Override
    public List<AuthorReview> getReviewsByAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AuthorReview> getReviewsByUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AuthorReview> getReviewsFromRating(int rating) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AuthorReview> getReviewsToRating(int rating) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AuthorReview> getReviewsFromToRating(int from, int to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrUpdateAuthor(AuthorReview review, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrUpdateUser(AuthorReview review, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteReviewsWithAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteReviewsWithUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
