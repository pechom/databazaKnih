package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import java.util.Map;

public interface UserManager {

    List<User> getAllUsers();

    List<User> getAdmins();

    List<User> getNonAdmins();

    Boolean checkNameAndPassword(String userName, String typedPassword);//porovnam to co zadal user s jeho heslom

    User getUserByUsername(String login);

    List<User> getUsersByName(String name);

    List<User> getUsersBySurname(String name);

    User getUserByMail(String mail);//kazdy user musi mat iny mail

    void DeleteInactiveUsers();//ti ktori sa neprihlasili viac ako rok

    List<User> deleteBook(Book book);//vymaze knihu zo vsetkych tabuliek vsetkych uivatelov

    void addReadBooksToUser(List<Book> books, User user);

    void deleteReadBooksFromUser(List<Book> books, User user);

    void addFavoriteBooksToUser(List<Book> books, User user);

    void deleteFavoriteBooksFromUser(List<Book> books, User user);

    void addWantedBooksToUser(List<Book> books, User user);

    void deleteWantedBooksFromUser(List<Book> books, User user);

    List<User> removeAuthor(Author author);//odstrani autora zo vsetkych userov

    void addFavoriteAuthorsToUser(List<Author> authors, User user);

    void deleteFavoriteAuthorsFromUser(List<Author> authors, User user);

    void addFriendsToUser(List<User> friends, User user);

    void deleteFriendsFromUser(List<User> friends, User user);

    void addFavoriteReviewers(List<User> reviewers, User user);

    void deleteFavoriteReviewers(List<User> reviewers, User user);

    void addBookReview(BookReview bookReview, User user);

    void deleteBookReview(BookReview bookReview, User user);

    void addAuthorReview(AuthorReview authorReview, User user);

    void deleteAuthorReview(AuthorReview authorReview, User user);

    void addReadingBooksToUser(List<Map<Book, Integer>> reading, User user);

    void deleteReadingBooksFromUser(List<Map<Book, Integer>> reading, User user);

    void addNoteBooksToUser(List<Map<Book, String>> notebooks, User user);

    void deleteNoteBooksFromUser(List<Map<Book, String>> notebooks, User user);

    List<User> removeUser(User user); // odstrani usera zo vsetkych userov

    void insertUser(User user);

    void deleteUser(int id);//odstrani ho aj z tabuliek ostatnych userov aj zo vsetkych ostatnych objetov

    void undeleteUser(int id);

    void updateUser(User user);

    User findById(int id);//z usera sa budu potom podla potrby tahat parametre
    
    void changePassword(User user, String typedPassword);

}
