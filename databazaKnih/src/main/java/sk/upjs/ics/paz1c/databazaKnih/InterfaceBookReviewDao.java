package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceBookReviewDao {

    List<BookReview> getAllReviews();

    void insertReview(BookReview review);

    void deleteReview(int id);

    void undeleteReview(int id);

    void updateReview(BookReview review);

    void deleteReviewsWithBook(int idbook);

    void deleteReviewsWithUser(int iduser);

    BookReview findById(int id);
}
