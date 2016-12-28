package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import java.util.Map;

public interface UserManager {

    List<User> getAllUsers();

    Boolean checkNameAndPassword(String userName, String typedPassword);//porovnam to co zadal user s jeho heslom

    void DeleteInactiveUsers();//ti ktori sa neprihlasili viac ako rok

    List<User> deleteBook(Book book);//vymaze knihu zo vsetkych tabuliek vsetkych uivatelov

    void addReadBooksToUser(List<Integer> books, User user);

    void deleteReadBooksFromUser(List<Integer> books, User user);

    void addFavoriteBooksToUser(List<Integer> books, User user);

    void deleteFavoriteBooksFromUser(List<Integer> books, User user);

    void addWantedBooksToUser(List<Integer> books, User user);

    void deleteWantedBooksFromUser(List<Integer> books, User user);

    List<User> removeAuthor(Author author);//odstrani autora zo vsetkych userov

    void addFavoriteAuthorsToUser(List<Integer> authors, User user);

    void deleteFavoriteAuthorsFromUser(List<Integer> authors, User user);

    void addFriendsToUser(List<Integer> friends, User user);

    void deleteFriendsFromUser(List<Integer> friends, User user);

    void addFavoriteReviewers(List<Integer> reviewers, User user);

    void deleteFavoriteReviewers(List<Integer> reviewers, User user);

    void deleteBookReview(BookReview bookReview, User user);

    void deleteAuthorReview(AuthorReview authorReview, User user);

    void addReadingBookToUser(Map<Integer, Integer> reading, User user);

    void deleteReadingBookFromUser(Map<Integer, Integer> reading, User user);

    void addNoteBookToUser(Map<Integer, String> notebooks, User user);

    void deleteNoteBookFromUser(Map<Integer, String> notebooks, User user);

    List<User> removeUser(User user); // odstrani usera zo vsetkych userov

    void insertUser(User user);

    void deleteUser(int id);//odstrani ho aj z tabuliek ostatnych userov aj zo vsetkych ostatnych objetov

    void undeleteUser(int id);

    void updateUser(User user);

    User findById(int id);//z usera sa budu potom podla potreby tahat parametre

    void changePassword(User user, String typedPassword);

    List<User> getAdmins(List<User> users);

    List<User> getNonAdmins(List<User> users);

    List<User> getUsersByUsername(String login, List<User> users);

    List<User> getUsersByName(String name, List<User> users);

    List<User> getUsersBySurname(String name, List<User> users);

    User getUserByMail(String mail, List<User> users);//kazdy user musi mat iny mail

    void addReadBookToUser(Book book, User user);

    void deleteReadBookFromUser(Book book, User user);

    void addFavoriteBookToUser(Book book, User user);

    void deleteFavoriteBookFromUser(Book book, User user);

    void addWantedBookToUser(Book book, User user);

    void deleteWantedBookFromUser(Book book, User user);

    void addFavoriteAuthorToUser(Author author, User user);

    void deleteFavoriteAuthorFromUser(Author author, User user);

    void addFriendToUser(User friend, User user);

    void deleteFriendFromUser(User friend, User user);

    void addFavoriteReviewer(User reviewer, User user);

    void deleteFavoriteReviewer(User reviewer, User user);

    void addBookReview(BookReview bookReview, User user);

    void addAuthorReview(AuthorReview authorReview, User user);

}
