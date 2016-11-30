package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface AuthorReviewManager {

    List<AuthorReview> getAllReviews();

    List<AuthorReview> getReviewsByAuthor(Author author);

    List<AuthorReview> getReviewsByUser(User user);

    List<AuthorReview> getReviewsFromRating(int rating);

    List<AuthorReview> getReviewsToRating(int rating);

    List<AuthorReview> getReviewsFromToRating(int from, int to);

    void addAuthor(AuthorReview review, Author author);

    void removeAuthorFromReview(AuthorReview review);

    List<AuthorReview> removeAuthor(Author author);

    void addUser(AuthorReview review, User user);

    void removeUserFromReview(AuthorReview review);

    List<AuthorReview> removeUser(User user);

    List<AuthorReview> DeleteReviewsWithAuthor(Author author);

    List<AuthorReview> deleteReviewsWithUser(User user);

    void insertReview(AuthorReview review);

    void deleteReview(int id);

    void undeleteReview(int id);

    void updateReview(AuthorReview authorReview);

    AuthorReview findById(int id);// podla potreby sa z neho budu tahat parametre
}
