/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peťo Chomič
 */
public class UserManagerTest {
    
    public UserManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllUsers method, of class UserManager.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdmins method, of class UserManager.
     */
    @Test
    public void testGetAdmins() {
        System.out.println("getAdmins");
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.getAdmins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNonAdmins method, of class UserManager.
     */
    @Test
    public void testGetNonAdmins() {
        System.out.println("getNonAdmins");
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.getNonAdmins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class UserManager.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        User user = null;
        String typedPassword = "";
        UserManager instance = new UserManagerImpl();
        Boolean expResult = null;
        Boolean result = instance.checkPassword(user, typedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersByUsername method, of class UserManager.
     */
    @Test
    public void testGetUsersByUsername() {
        System.out.println("getUsersByUsername");
        String login = "";
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.getUsersByUsername(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersByName method, of class UserManager.
     */
    @Test
    public void testGetUsersByName() {
        System.out.println("getUsersByName");
        String name = "";
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.getUsersByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersBySurname method, of class UserManager.
     */
    @Test
    public void testGetUsersBySurname() {
        System.out.println("getUsersBySurname");
        String name = "";
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.getUsersBySurname(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByMail method, of class UserManager.
     */
    @Test
    public void testGetUserByMail() {
        System.out.println("getUserByMail");
        String mail = "";
        UserManager instance = new UserManagerImpl();
        User expResult = null;
        User result = instance.getUserByMail(mail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteInactiveUsers method, of class UserManager.
     */
    @Test
    public void testDeleteInactiveUsers() {
        System.out.println("DeleteInactiveUsers");
        UserManager instance = new UserManagerImpl();
        instance.DeleteInactiveUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class UserManager.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        Book book = null;
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.deleteBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReadBooksToUser method, of class UserManager.
     */
    @Test
    public void testAddReadBooksToUser() {
        System.out.println("addReadBooksToUser");
        List<Book> books = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addReadBooksToUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReadBooksFromUser method, of class UserManager.
     */
    @Test
    public void testDeleteReadBooksFromUser() {
        System.out.println("deleteReadBooksFromUser");
        List<Book> books = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteReadBooksFromUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteBooksToUser method, of class UserManager.
     */
    @Test
    public void testAddFavoriteBooksToUser() {
        System.out.println("addFavoriteBooksToUser");
        List<Book> books = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addFavoriteBooksToUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteBooksFromUser method, of class UserManager.
     */
    @Test
    public void testDeleteFavoriteBooksFromUser() {
        System.out.println("deleteFavoriteBooksFromUser");
        List<Book> books = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteFavoriteBooksFromUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWantedBooksToUser method, of class UserManager.
     */
    @Test
    public void testAddWantedBooksToUser() {
        System.out.println("addWantedBooksToUser");
        List<Book> books = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addWantedBooksToUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWantedBooksFromUser method, of class UserManager.
     */
    @Test
    public void testDeleteWantedBooksFromUser() {
        System.out.println("deleteWantedBooksFromUser");
        List<Book> books = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteWantedBooksFromUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class UserManager.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Author author = null;
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.removeAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteAuthorsToUser method, of class UserManager.
     */
    @Test
    public void testAddFavoriteAuthorsToUser() {
        System.out.println("addFavoriteAuthorsToUser");
        List<Author> authors = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addFavoriteAuthorsToUser(authors, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteAuthorsFromUser method, of class UserManager.
     */
    @Test
    public void testDeleteFavoriteAuthorsFromUser() {
        System.out.println("deleteFavoriteAuthorsFromUser");
        List<Author> authors = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteFavoriteAuthorsFromUser(authors, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFriendsToUser method, of class UserManager.
     */
    @Test
    public void testAddFriendsToUser() {
        System.out.println("addFriendsToUser");
        List<User> friends = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addFriendsToUser(friends, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFriendsFromUser method, of class UserManager.
     */
    @Test
    public void testDeleteFriendsFromUser() {
        System.out.println("deleteFriendsFromUser");
        List<User> friends = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteFriendsFromUser(friends, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteReviewers method, of class UserManager.
     */
    @Test
    public void testAddFavoriteReviewers() {
        System.out.println("addFavoriteReviewers");
        List<User> reviewers = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addFavoriteReviewers(reviewers, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteReviewers method, of class UserManager.
     */
    @Test
    public void testDeleteFavoriteReviewers() {
        System.out.println("deleteFavoriteReviewers");
        List<User> reviewers = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteFavoriteReviewers(reviewers, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBookReview method, of class UserManager.
     */
    @Test
    public void testAddBookReview() {
        System.out.println("addBookReview");
        BookReview bookReview = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addBookReview(bookReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBookReview method, of class UserManager.
     */
    @Test
    public void testDeleteBookReview() {
        System.out.println("deleteBookReview");
        BookReview bookReview = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteBookReview(bookReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorReview method, of class UserManager.
     */
    @Test
    public void testAddAuthorReview() {
        System.out.println("addAuthorReview");
        AuthorReview authorReview = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addAuthorReview(authorReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthorReview method, of class UserManager.
     */
    @Test
    public void testDeleteAuthorReview() {
        System.out.println("deleteAuthorReview");
        AuthorReview authorReview = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteAuthorReview(authorReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReadingBooksToUser method, of class UserManager.
     */
    @Test
    public void testAddReadingBooksToUser() {
        System.out.println("addReadingBooksToUser");
        List<Map<Book, Integer>> reading = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addReadingBooksToUser(reading, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReadingBooksFromUser method, of class UserManager.
     */
    @Test
    public void testDeleteReadingBooksFromUser() {
        System.out.println("deleteReadingBooksFromUser");
        List<Map<Book, Integer>> reading = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteReadingBooksFromUser(reading, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNoteBooksToUser method, of class UserManager.
     */
    @Test
    public void testAddNoteBooksToUser() {
        System.out.println("addNoteBooksToUser");
        List<Map<Book, String>> notebooks = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.addNoteBooksToUser(notebooks, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNoteBooksFromUser method, of class UserManager.
     */
    @Test
    public void testDeleteNoteBooksFromUser() {
        System.out.println("deleteNoteBooksFromUser");
        List<Map<Book, String>> notebooks = null;
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.deleteNoteBooksFromUser(notebooks, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class UserManager.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        UserManager instance = new UserManagerImpl();
        List<User> expResult = null;
        List<User> result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class UserManager.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.insertUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserManager.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int id = 0;
        UserManager instance = new UserManagerImpl();
        instance.deleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteUser method, of class UserManager.
     */
    @Test
    public void testUndeleteUser() {
        System.out.println("undeleteUser");
        int id = 0;
        UserManager instance = new UserManagerImpl();
        instance.undeleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserManager.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        UserManager instance = new UserManagerImpl();
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class UserManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        UserManager instance = new UserManagerImpl();
        User expResult = null;
        User result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserManagerImpl implements UserManager {

        public List<User> getAllUsers() {
            return null;
        }

        public List<User> getAdmins() {
            return null;
        }

        public List<User> getNonAdmins() {
            return null;
        }

        public Boolean checkPassword(User user, String typedPassword) {
            return null;
        }

        public List<User> getUsersByUsername(String login) {
            return null;
        }

        public List<User> getUsersByName(String name) {
            return null;
        }

        public List<User> getUsersBySurname(String name) {
            return null;
        }

        public User getUserByMail(String mail) {
            return null;
        }

        public void DeleteInactiveUsers() {
        }

        public List<User> deleteBook(Book book) {
            return null;
        }

        public void addReadBooksToUser(List<Book> books, User user) {
        }

        public void deleteReadBooksFromUser(List<Book> books, User user) {
        }

        public void addFavoriteBooksToUser(List<Book> books, User user) {
        }

        public void deleteFavoriteBooksFromUser(List<Book> books, User user) {
        }

        public void addWantedBooksToUser(List<Book> books, User user) {
        }

        public void deleteWantedBooksFromUser(List<Book> books, User user) {
        }

        public List<User> removeAuthor(Author author) {
            return null;
        }

        public void addFavoriteAuthorsToUser(List<Author> authors, User user) {
        }

        public void deleteFavoriteAuthorsFromUser(List<Author> authors, User user) {
        }

        public void addFriendsToUser(List<User> friends, User user) {
        }

        public void deleteFriendsFromUser(List<User> friends, User user) {
        }

        public void addFavoriteReviewers(List<User> reviewers, User user) {
        }

        public void deleteFavoriteReviewers(List<User> reviewers, User user) {
        }

        public void addBookReview(BookReview bookReview, User user) {
        }

        public void deleteBookReview(BookReview bookReview, User user) {
        }

        public void addAuthorReview(AuthorReview authorReview, User user) {
        }

        public void deleteAuthorReview(AuthorReview authorReview, User user) {
        }

        public void addReadingBooksToUser(List<Map<Book, Integer>> reading, User user) {
        }

        public void deleteReadingBooksFromUser(List<Map<Book, Integer>> reading, User user) {
        }

        public void addNoteBooksToUser(List<Map<Book, String>> notebooks, User user) {
        }

        public void deleteNoteBooksFromUser(List<Map<Book, String>> notebooks, User user) {
        }

        public List<User> removeUser(User user) {
            return null;
        }

        public void insertUser(User user) {
        }

        public void deleteUser(int id) {
        }

        public void undeleteUser(int id) {
        }

        public void updateUser(User user) {
        }

        public User findById(int id) {
            return null;
        }
    }
    
}
