package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import java.util.Map;

public interface InterfaceUserDao {

    List<User> getAllUsers();

    void insertUser(User user);

    void deleteUser(int id);

    void undeleteUser(int id);

    void updateUser(User user);

    User findById(int id);

    void addReadBookToUser(int idbook, int iduser);

    void deleteReadBookFromUser(int idbook, int iduser);

    void addFavoriteBookToUser(int idbook, int iduser);

    void deleteFavoriteBookFromUser(int idbook, int iduser);

    void addWantedBookToUser(int idbook, int iduser);

    void deleteWantedBookFromUser(int idbook, int iduser);

    void removeAuthor(int idauthor);

    void addFavoriteAuthorToUser(int idauthor, int iduser);

    void deleteFavoriteAuthorFromUser(int idauthor, int iduser);

    void addFriendToUser(int idfriend, int iduser);

    void deleteFriendFromUser(int idfriend, int iduser);

    void addFavoriteReviewerToUser(int idreviewer, int iduser);

    void deleteFavoriteReviewerFromUser(int idreviewer, int iduser);

    void deleteBookReviewFromUser(int idreview, int iduser);

    void deleteAuthorReviewFromUser(int idreview, int iduser);

    void addReadingBooksToUser(Map<Book, Integer> reading, int iduser);

    void deleteReadingBooksFromUser(Map<Book, Integer> reading, int iduser);

    void addNoteBooksToUser(Map<Book, String> notebook, int iduser);

    void deleteNoteBooksFromUser(Map<Book, String> notebook, int iduser);

    void changePassword(User user);

}
