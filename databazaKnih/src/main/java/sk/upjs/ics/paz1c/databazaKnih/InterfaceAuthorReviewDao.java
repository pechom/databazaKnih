package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceAuthorReviewDao {

    List<AuthorReview> getAllReviews();

    void insertReview(AuthorReview review);

    void deleteReview(int id);

    void undeleteReview(int id);

    void updateReview(AuthorReview review);

    void deleteReviewsWithAuthor(int idauthor);

    void deleteReviewsWithUser(int iduser);

    AuthorReview findById(int id);

}
