package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import java.util.Map;

public interface UserManager {

    List<User> getAllUsers();

    List<User> getActiveUsers();

    List<User> getAdmins();

    List<User> getNonAdmins();

    Boolean checkPassword(User user, String typedPassword);//porovnam to co zadal user s jeho heslom

    List<User> getUsersByUsername(String login);

    List<User> getUsersByName(String name);

    List<User> getUsersBySurname(String name);

    User getUserByMail(String mail);//kazdy user musi mat iny mail

    void DeleteInactiveUsers();//ti ktori sa neprihlasili viac ako rok

    void deleteBook(Book book);//vymaze knihu zo vsetkych tabuliek vsetkych uivatelov

    void addReadBooksToUser(List<Book> books, User user);

    void deleteReadBooksFromUser(List<Book> books, User user);

    void addFavoriteBooksToUser(List<Book> books, User user);

    void deleteFavoriteBooksFromUser(List<Book> books, User user);

    void addWantedBooksToUser(List<Book> books, User user);

    void deleteWantedBooksFromUser(List<Book> books, User user);

    void removeAuthor(Author author);//odstrani autora zo vsetkych userov

    void addFavoriteAuthorsToUser(List<Author> authors, User user);

    void deleteFavoriteAuthorsFromUser(List<Author> authors, User user);

    void addFriendsToUser(List<User> friends, User user);

    void deleteFriendsFromUser(List<User> friends, User user);

    void addFavoriteReviewers(List<User> reviewers, User user);

    void deleteFavoriteReviewers(List<User> reviewers, User user);

    void addBookReviews(List<BookReview> bookReviews, User user);

    void deleteBookReviews(List<BookReview> bookReviews, User user);

    void addAuthorReviews(List<AuthorReview> authorReviews, User user);

    void deleteAuthorReviews(List<AuthorReview> authorReviews, User user);

    void addReadingBooksToUser(List<Map<Book, Integer>> reading, User user);

    void deleteReadingBooksFromUser(List<Map<Book, Integer>> reading, User user);

    void insertUser(User user);

    void deleteUser(int id);//odstrani ho aj z tabuliek ostatnych userov aj zo vsetkych ostatnych objetov

    void undeleteUser(User user);

    void updateUser(User user);

    User findById(int id);//z usera sa budu potom podla potrby tahat parametre

}
