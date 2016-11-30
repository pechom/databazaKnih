package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface BookReviewManager {

    List<BookReview> getAllReviews();

    List<BookReview> getReviewsByBook(Book book);

    List<BookReview> getReviewsByUser(User user);

    List<BookReview> getReviewsFromRating(int rating);

    List<BookReview> getReviewsToRating(int rating);

    List<BookReview> getReviewsFromToRating(int from, int to);

    void addUser(BookReview review, User user);

    void removeUserFromReview(BookReview review);

    void addBook(BookReview review, Book book);

    void removeBookFromReview(BookReview review);

    List<BookReview> removeUser(User user);

    List<BookReview> removeBook(Book book);

    List<BookReview> deleteReviewsWithBook(Book book);

    List<BookReview> deleteReviewsWithUser(User user);

    void insertReview(BookReview review);

    void deleteReview(int id);

    void undeleteReview(int id);

    void updateReview(BookReview bookReview);

    BookReview findById(int id);
}
