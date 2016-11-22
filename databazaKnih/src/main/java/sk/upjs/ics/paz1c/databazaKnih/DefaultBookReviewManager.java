package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public class DefaultBookReviewManager implements BookReviewManager {
    //tu budu metody na filtre na parametre

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

}
