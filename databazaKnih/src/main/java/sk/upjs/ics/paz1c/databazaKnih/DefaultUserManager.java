package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody s uzivatelmi neprihlaseni viac ako rok, filtre na parametre
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DefaultUserManager implements UserManager {

    private InterfaceUserDao userDao = ObjectFactory.INSTANCE.getUserDao();

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public List<User> removeUser(User user) {
        List<User> removed = new ArrayList<>();
        List<User> users = getAllUsers();
        for (User user1 : users) {
            if (user1.getFriends().contains(user.getId())) {
                user1.getFriends().remove(user.getId());
                userDao.deleteFriendFromUser(user.getId(), user.getId());
                if (!removed.contains(user1)) {
                    removed.add(user1);
                }
            }
            if (user1.getFavoriteReviewers().contains(user.getId())) {
                user1.getFavoriteReviewers().remove(user.getId());
                userDao.deleteFavoriteReviewerFromUser(user.getId(), user.getId());
                if (!removed.contains(user1)) {
                    removed.add(user1);
                }
            }
        }
        return removed;
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public Boolean checkNameAndPassword(String username, String typedPassword) {
        User checked = null;
        for (User user : getAllUsers()) {
            if ((user.getUserName() != null) && (user.getUserName().equals(username))) {
                checked = user;
                break;
            }
        }
        if (checked == null) {
            return false;
        } else {
            return checked.checkPassword(typedPassword);
        }
    }

    @Override
    public void DeleteInactiveUsers() {
        List<User> users = getAllUsers();
        for (User user : users) {
            if ((user.getLastLogin() != null) && (LocalDateTime.now().minusYears(1).isAfter(user.getLastLogin()))) {
                deleteUser(user.getId());
            }
        }
    }

    @Override
    public List<User> deleteBook(Book book) {
        List<User> users = getAllUsers();
        List<User> removed = new ArrayList<>();
        for (User user : users) {
            if (user.getReadBooks().contains(book.getId())) {
                user.getReadBooks().remove(book.getId());
                userDao.deleteReadBookFromUser(book.getId(), user.getId());
                if (!removed.contains(user)) {
                    removed.add(user);
                }
            }
            if (user.getFavoriteBooks().contains(book.getId())) {
                user.getFavoriteBooks().remove(book.getId());
                userDao.deleteFavoriteBookFromUser(book.getId(), user.getId());
                if (!removed.contains(user)) {
                    removed.add(user);
                }
            }
            if (user.getWantedBooks().contains(book.getId())) {
                user.getWantedBooks().remove(book.getId());
                userDao.deleteWantedBookFromUser(book.getId(), user.getId());
                if (!removed.contains(user)) {
                    removed.add(user);
                }
            }
            for (Map<Integer, Integer> reading : user.getReading()) {
                if (reading.containsKey(book.getId())) {
                    user.getReading().remove(reading);
                    userDao.deleteReadingBooksFromUser(reading, user.getId());
                    if (!removed.contains(user)) {
                        removed.add(user);
                    }
                }
            }
            for (Map<Integer, String> notebook : user.getNote()) {
                if (notebook.containsKey(book.getId())) {
                    user.getNote().remove(notebook);
                    userDao.deleteNoteBooksFromUser(notebook, user.getId());
                    if (!removed.contains(user)) {
                        removed.add(user);
                    }
                }
            }
        }
        return removed;
    }

    @Override
    public void addReadBooksToUser(List<Integer> books, User user) {
        for (int book : books) {
            if (!user.getReadBooks().contains(book)) {
                user.getReadBooks().add(book);
                userDao.addReadBookToUser(book, user.getId());
            }
        }
    }

    @Override
    public void deleteReadBooksFromUser(List<Integer> books, User user) {
        for (int book : books) {
            if (user.getReadBooks().contains(book)) {
                user.getReadBooks().remove(book);
                userDao.deleteReadBookFromUser(book, user.getId());
            }
        }
    }

    @Override
    public void addFavoriteBooksToUser(List<Integer> books, User user) {
        for (int book : books) {
            if (!user.getFavoriteBooks().contains(book)) {
                user.getFavoriteBooks().add(book);
                userDao.addFavoriteBookToUser(book, user.getId());
            }
        }
    }

    @Override
    public void deleteFavoriteBooksFromUser(List<Integer> books, User user) {
        for (int book : books) {
            if (user.getFavoriteBooks().contains(book)) {
                user.getFavoriteBooks().remove(book);
                userDao.deleteFavoriteBookFromUser(book, user.getId());
            }
        }
    }

    @Override
    public void addWantedBooksToUser(List<Integer> books, User user) {
        for (int book : books) {
            if (!user.getWantedBooks().contains(book)) {
                user.getWantedBooks().add(book);
                userDao.addWantedBookToUser(book, user.getId());
            }
        }
    }

    @Override
    public void deleteWantedBooksFromUser(List<Integer> books, User user) {
        for (int book : books) {
            if (user.getWantedBooks().contains(book)) {
                user.getWantedBooks().remove(book);
                userDao.deleteWantedBookFromUser(book, user.getId());
            }
        }
    }

    @Override
    public List<User> removeAuthor(Author author) {
        List<User> users = getAllUsers();
        List<User> removed = new ArrayList<>();
        for (User user : users) {
            if (user.getFavoriteAuthors().contains(author.getId())) {
                user.getFavoriteAuthors().remove(author.getId());
                removed.add(user);
            }
        }
        userDao.removeAuthor(author.getId());
        return removed;
    }

    @Override
    public void addFavoriteAuthorsToUser(List<Integer> authors, User user) {
        for (int author : authors) {
            if (!user.getFavoriteAuthors().contains(author)) {
                user.getFavoriteAuthors().add(author);
                userDao.addFavoriteAuthorToUser(author, user.getId());
            }
        }
    }

    @Override
    public void deleteFavoriteAuthorsFromUser(List<Integer> authors, User user) {
        for (int author : authors) {
            if (user.getFavoriteAuthors().contains(author)) {
                user.getFavoriteAuthors().remove(author);
                userDao.deleteFavoriteAuthorFromUser(author, user.getId());
            }
        }
    }

    @Override
    public void addFriendsToUser(List<Integer> friends, User user) {
        for (int friend : friends) {
            if (!user.getFriends().contains(friend)) {
                user.getFriends().add(friend);
                userDao.addFriendToUser(friend, user.getId());
            }
        }
    }

    @Override
    public void deleteFriendsFromUser(List<Integer> friends, User user) {
        for (int friend : friends) {
            if (user.getFriends().contains(friend)) {
                user.getFriends().remove(friend);
                userDao.deleteFriendFromUser(friend, user.getId());
            }
        }
    }

    @Override
    public void addFavoriteReviewers(List<Integer> reviewers, User user) {
        for (int reviewer : reviewers) {
            if (!user.getFavoriteReviewers().contains(reviewer)) {
                user.getFavoriteReviewers().add(reviewer);
                userDao.addFavoriteReviewerToUser(reviewer, user.getId());
            }
        }
    }

    @Override
    public void deleteFavoriteReviewers(List<Integer> reviewers, User user) {
        for (int reviewer : reviewers) {
            if (user.getFavoriteReviewers().contains(reviewer)) {
                user.getFavoriteReviewers().remove(reviewer);
                userDao.deleteFavoriteReviewerFromUser(reviewer, user.getId());
            }
        }
    }

    @Override
    public void deleteBookReview(BookReview bookReview, User user) {
        if (user.getBookReviews().contains(bookReview.getId())) {
            user.getBookReviews().remove(bookReview.getId());
            userDao.deleteBookReviewFromUser(bookReview.getId(), user.getId());
        }
    }

    @Override
    public void deleteAuthorReview(AuthorReview authorReview, User user) {
        if (user.getAuthorReviews().contains(authorReview.getId())) {
            user.getAuthorReviews().remove(authorReview.getId());
            userDao.deleteAuthorReviewFromUser(authorReview.getId(), user.getId());
        }
    }

    @Override
    public void undeleteUser(int id) {
        userDao.undeleteUser(id);
    }

    @Override
    public void addReadingBookToUser(Map<Integer, Integer> reading, User user) {
        if (!user.getReading().contains(reading)) {
            user.getReading().add(reading);
            userDao.addReadingBooksToUser(reading, user.getId());

        }
    }

    @Override
    public void deleteReadingBookFromUser(Map<Integer, Integer> reading, User user) {
        if (user.getReading().contains(reading)) {
            user.getReading().remove(reading);
            userDao.deleteReadingBooksFromUser(reading, user.getId());

        }
    }

    @Override
    public void addNoteBookToUser(Map<Integer, String> notebook, User user) {
        if (!user.getNote().contains(notebook)) {
            user.getNote().add(notebook);
            userDao.addNoteBooksToUser(notebook, user.getId());
        }
    }

    @Override
    public void deleteNoteBookFromUser(Map<Integer, String> notebook, User user) {
        if (user.getNote().contains(notebook)) {
            user.getNote().remove(notebook);
            userDao.deleteNoteBooksFromUser(notebook, user.getId());
        }
    }

    @Override
    public void changePassword(User user, String typedPassword) {// meni aj salt a passwordHash
        user.setPassword(typedPassword);
        userDao.changePassword(user);
    }

    @Override
    public List<User> getAdmins(List<User> users) {

        List<User> admins = new ArrayList<>();
        for (User user : users) {
            if (user.isIsAdmin()) {
                admins.add(user);
            }
        }
        return admins;
    }

    @Override
    public List<User> getNonAdmins(List<User> users) {

        List<User> nonAdmins = new ArrayList<>();
        for (User user : users) {
            if (!user.isIsAdmin()) {
                nonAdmins.add(user);
            }
        }
        return nonAdmins;
    }

    @Override
    public List<User> getUsersByUsername(String login, List<User> users) {

        List<User> named = new ArrayList<>();
        for (User user : users) {
            if ((user.getUserName() != null) && (user.getUserName().equalsIgnoreCase(login))) {
                named.add(user);
            }
        }
        return named;
    }

    @Override
    public List<User> getUsersByName(String name, List<User> users) {

        List<User> named = new ArrayList<>();
        for (User user : users) {
            if ((user.getName() != null) && (user.getName().equalsIgnoreCase(name))) {
                named.add(user);
            }
        }
        return named;
    }

    @Override
    public List<User> getUsersBySurname(String name, List<User> users) {

        List<User> named = new ArrayList<>();
        for (User user : users) {
            if ((user.getSurname() != null) && (user.getSurname().equalsIgnoreCase(name))) {
                named.add(user);
            }
        }
        return named;
    }

    @Override
    public User getUserByMail(String mail, List<User> users) {

        User mailUser = null;
        for (User user : users) {
            if ((user.getMail() != null) && (user.getMail().equals(mail))) {
                mailUser = user;
                break;
            }
        }
        return mailUser;
    }

    @Override
    public void addReadBookToUser(Book book, User user) {

        if (!user.getReadBooks().contains(book.getId())) {
            user.getReadBooks().add(book.getId());
            updateUser(user);
        }
    }

    @Override
    public void deleteReadBookFromUser(Book book, User user) {

        if (user.getReadBooks().contains(book.getId())) {
            user.getReadBooks().remove(book.getId());
            updateUser(user);
        }
    }

    @Override
    public void addFavoriteBookToUser(Book book, User user) {

        if (!user.getFavoriteBooks().contains(book.getId())) {
            user.getFavoriteBooks().add(book.getId());
            updateUser(user);
        }
    }

    @Override
    public void deleteFavoriteBookFromUser(Book book, User user) {

        if (user.getFavoriteBooks().contains(book.getId())) {
            user.getFavoriteBooks().remove(book.getId());
            updateUser(user);
        }
    }

    @Override
    public void addWantedBookToUser(Book book, User user) {

        if (!user.getWantedBooks().contains(book.getId())) {
            user.getWantedBooks().add(book.getId());
            updateUser(user);
        }
    }

    @Override
    public void deleteWantedBookFromUser(Book book, User user) {

        if (user.getWantedBooks().contains(book.getId())) {
            user.getWantedBooks().remove(book.getId());
            updateUser(user);
        }
    }

    @Override
    public void addFavoriteAuthorToUser(Author author, User user) {

        if (!user.getFavoriteAuthors().contains(author.getId())) {
            user.getFavoriteAuthors().add(author.getId());
            updateUser(user);
        }
    }

    @Override
    public void deleteFavoriteAuthorFromUser(Author author, User user) {

        if (user.getFavoriteAuthors().contains(author.getId())) {
            user.getFavoriteAuthors().remove(author.getId());
            updateUser(user);
        }
    }

    @Override
    public void addFriendToUser(User friend, User user) {

        if (!user.getFriends().contains(friend.getId())) {
            user.getFriends().add(friend.getId());
            updateUser(user);
        }
    }

    @Override
    public void deleteFriendFromUser(User friend, User user) {

        if (user.getFriends().contains(friend.getId())) {
            user.getFriends().remove(friend.getId());
            updateUser(user);
        }
    }

    @Override
    public void addFavoriteReviewer(User reviewer, User user) {

        if (!user.getFavoriteReviewers().contains(reviewer.getId())) {
            user.getFavoriteReviewers().add(reviewer.getId());
            updateUser(user);
        }
    }

    @Override
    public void deleteFavoriteReviewer(User reviewer, User user) {

        if (user.getFavoriteReviewers().contains(reviewer.getId())) {
            user.getFavoriteReviewers().remove(reviewer.getId());
            updateUser(user);
        }
    }

    @Override
    public void addBookReview(BookReview bookReview, User user) {
        if (!user.getBookReviews().contains(bookReview.getId())) {
            user.getBookReviews().add(bookReview.getId());
            updateUser(user);
        }
    }

    @Override
    public void addAuthorReview(AuthorReview authorReview, User user) {
        if (!user.getAuthorReviews().contains(authorReview.getId())) {
            user.getAuthorReviews().add(authorReview.getId());
            updateUser(user);
        }
    }
        @Override
    public User getUserByUsername(String login) {
        List<User> users = getAllUsers();
        User named = null;
        for (User user : users) {
            if ((user.getUserName() != null) && (user.getUserName().equalsIgnoreCase(login))) {
                named = user;
                break;
            }
        }
        return named;
    }
    
    @Override
    public User getUserByMail(String mail) {
List<User> users = getAllUsers();
        User mailUser = null;
        for (User user : users) {
            if ((user.getMail() != null) && (user.getMail().equals(mail))) {
                mailUser = user;
                break;
            }
        }
        return mailUser;
    }
}
