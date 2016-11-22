package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
//metody na filtre na parametre

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
}
