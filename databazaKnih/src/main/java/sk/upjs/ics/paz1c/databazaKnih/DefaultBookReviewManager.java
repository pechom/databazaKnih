package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
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
        List<BookReview> reviews = getAllReviews();
        List<BookReview> bookReviews = new ArrayList<>();
        for (BookReview review : reviews) {
            if ((review.getBook() != 0) && (review.getBook() == (book.getId()))) {
                bookReviews.add(review);
            }
        }
        return bookReviews;
    }

    @Override
    public List<BookReview> getReviewsByUser(User user) {
        List<BookReview> reviews = getAllReviews();
        List<BookReview> userReviews = new ArrayList<>();
        for (BookReview review : reviews) {
            if ((review.getUser() != 0) && (review.getUser() == (user.getId()))) {
                userReviews.add(review);
            }
        }
        return userReviews;
    }

    @Override
    public List<BookReview> getReviewsFromRating(int rating) {
        List<BookReview> reviews = getAllReviews();
        List<BookReview> ratingReviews = new ArrayList<>();
        for (BookReview review : reviews) {
            if ((review.getRating() != 0) && (review.getRating() >= rating)) {
                ratingReviews.add(review);
            }
        }
        return ratingReviews;
    }

    @Override
    public List<BookReview> getReviewsToRating(int rating) {
        List<BookReview> reviews = getAllReviews();
        List<BookReview> ratingReviews = new ArrayList<>();
        for (BookReview review : reviews) {
            if ((review.getRating() != 0) && (review.getRating() <= rating)) {
                ratingReviews.add(review);
            }
        }
        return ratingReviews;
    }

    @Override
    public List<BookReview> getReviewsFromToRating(int from, int to) {
        List<BookReview> reviews = getAllReviews();
        List<BookReview> ratingReviews = new ArrayList<>();
        for (BookReview review : reviews) {
            if ((review.getRating() != 0) && (review.getRating() >= from) && (review.getRating() <= to)) {
                ratingReviews.add(review);
            }
        }
        return ratingReviews;
    }

    @Override
    public List<BookReview> removeUser(User user) {
        List<BookReview> reviews = getAllReviews();
        List<BookReview> removed = new ArrayList<>();
        for (BookReview review : reviews) {
            if ((review.getUser() != 0) && (review.getUser() == (user.getId()))) {
                review.setUser(0);
                updateReview(review);
                removed.add(review);
            }
        }
        return removed;
    }

    @Override
    public void DeleteReviewsWithBook(Book book) {
        List<BookReview> reviews = getAllReviews();
        for (BookReview review : reviews) {
            if ((review.getBook() != 0) && (review.getBook() == (book.getId()))) {
                review.setBook(0);
            }
        }
        bookReviewDao.deleteReviewsWithBook(book.getId());
    }

    @Override
    public void deleteReviewsWithUser(User user) {
        List<BookReview> reviews = getAllReviews();
        for (BookReview review : reviews) {
            if ((review.getUser() != 0) && (review.getUser() == (user.getId()))) {
                review.setUser(0);
            }
        }
        bookReviewDao.deleteReviewsWithUser(user.getId());
    }

    @Override
    public void undeleteReview(int id) {
        bookReviewDao.undeleteReview(id);
    }

    @Override
    public void removeBookFromReview(BookReview review) {
        review.setBook(0);
        updateReview(review);
    }

}
