package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
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
        List<AuthorReview> reviews = getAllReviews();
        List<AuthorReview> authorReviews = new ArrayList<>();
        for (AuthorReview review : reviews) {
            if ((review.getAuthor() != null) && (review.getAuthor().equals(author))) {
                authorReviews.add(review);
            }
        }
        return authorReviews;
    }

    @Override
    public List<AuthorReview> getReviewsByUser(User user) {
        List<AuthorReview> reviews = getAllReviews();
        List<AuthorReview> userReviews = new ArrayList<>();
        for (AuthorReview review : reviews) {
            if ((review.getUser() != null) && (review.getUser().equals(user))) {
                userReviews.add(review);
            }
        }
        return userReviews;
    }

    @Override
    public List<AuthorReview> getReviewsFromRating(int rating) {
        List<AuthorReview> reviews = getAllReviews();
        List<AuthorReview> ratingReviews = new ArrayList<>();
        for (AuthorReview review : reviews) {
            if ((review.getRating() != 0) && (review.getRating() >= rating)) {
                ratingReviews.add(review);
            }
        }
        return ratingReviews;
    }

    @Override
    public List<AuthorReview> getReviewsToRating(int rating) {
        List<AuthorReview> reviews = getAllReviews();
        List<AuthorReview> ratingReviews = new ArrayList<>();
        for (AuthorReview review : reviews) {
            if ((review.getRating() != 0) && (review.getRating() <= rating)) {
                ratingReviews.add(review);
            }
        }
        return ratingReviews;
    }

    @Override
    public List<AuthorReview> getReviewsFromToRating(int from, int to) {
        List<AuthorReview> reviews = getAllReviews();
        List<AuthorReview> ratingReviews = new ArrayList<>();
        for (AuthorReview review : reviews) {
            if ((review.getRating() != 0) && (review.getRating() >= from) && (review.getRating() <= to)) {
                ratingReviews.add(review);
            }
        }
        return ratingReviews;
    }

    @Override
    public void DeleteReviewsWithAuthor(Author author) {
        List<AuthorReview> reviews = getAllReviews();
        for (AuthorReview review : reviews) {
            if ((review.getAuthor() != null) && (review.getAuthor().equals(author))) {
                review.setAuthor(null);
            }
        }
        authorReviewDao.deleteReviewsWithAuthor(author.getId());
    }

    @Override
    public void deleteReviewsWithUser(User user) {
        List<AuthorReview> reviews = getAllReviews();
        for (AuthorReview review : reviews) {
            if ((review.getUser() != null) && (review.getUser().equals(user))) {
                review.setUser(null);
            }
        }
        authorReviewDao.deleteReviewsWithUser(user.getId());
    }

    @Override
    public void undeleteReview(int id) {
        authorReviewDao.undeleteReview(id);
    }

}
