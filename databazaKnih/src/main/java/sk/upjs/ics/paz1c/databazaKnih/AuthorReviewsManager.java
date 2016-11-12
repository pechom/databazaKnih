package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface AuthorReviewsManager {

    List<AuthorReview> getAllReviews();

    void insertReview(AuthorReview review);

    void deleteReview(int id);

    void updateReview(int id);
}
