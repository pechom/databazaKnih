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
public class DefaultUserManagerTest {
    
    public DefaultUserManagerTest() {
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
     * Test of getAllUsers method, of class DefaultUserManager.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class DefaultUserManager.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.insertUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int id = 0;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class DefaultUserManager.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DefaultUserManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        DefaultUserManager instance = new DefaultUserManager();
        User expResult = null;
        User result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class DefaultUserManager.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdmins method, of class DefaultUserManager.
     */
    @Test
    public void testGetAdmins() {
        System.out.println("getAdmins");
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.getAdmins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNonAdmins method, of class DefaultUserManager.
     */
    @Test
    public void testGetNonAdmins() {
        System.out.println("getNonAdmins");
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.getNonAdmins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class DefaultUserManager.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        User user = null;
        String typedPassword = "";
        DefaultUserManager instance = new DefaultUserManager();
        Boolean expResult = null;
        Boolean result = instance.checkPassword(user, typedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersByUsername method, of class DefaultUserManager.
     */
    @Test
    public void testGetUsersByUsername() {
        System.out.println("getUsersByUsername");
        String login = "";
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.getUsersByUsername(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersByName method, of class DefaultUserManager.
     */
    @Test
    public void testGetUsersByName() {
        System.out.println("getUsersByName");
        String name = "";
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.getUsersByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersBySurname method, of class DefaultUserManager.
     */
    @Test
    public void testGetUsersBySurname() {
        System.out.println("getUsersBySurname");
        String name = "";
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.getUsersBySurname(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByMail method, of class DefaultUserManager.
     */
    @Test
    public void testGetUserByMail() {
        System.out.println("getUserByMail");
        String mail = "";
        DefaultUserManager instance = new DefaultUserManager();
        User expResult = null;
        User result = instance.getUserByMail(mail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteInactiveUsers method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteInactiveUsers() {
        System.out.println("DeleteInactiveUsers");
        DefaultUserManager instance = new DefaultUserManager();
        instance.DeleteInactiveUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        Book book = null;
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.deleteBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReadBooksToUser method, of class DefaultUserManager.
     */
    @Test
    public void testAddReadBooksToUser() {
        System.out.println("addReadBooksToUser");
        List<Book> books = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addReadBooksToUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReadBooksFromUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteReadBooksFromUser() {
        System.out.println("deleteReadBooksFromUser");
        List<Book> books = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteReadBooksFromUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteBooksToUser method, of class DefaultUserManager.
     */
    @Test
    public void testAddFavoriteBooksToUser() {
        System.out.println("addFavoriteBooksToUser");
        List<Book> books = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addFavoriteBooksToUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteBooksFromUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteFavoriteBooksFromUser() {
        System.out.println("deleteFavoriteBooksFromUser");
        List<Book> books = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteFavoriteBooksFromUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWantedBooksToUser method, of class DefaultUserManager.
     */
    @Test
    public void testAddWantedBooksToUser() {
        System.out.println("addWantedBooksToUser");
        List<Book> books = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addWantedBooksToUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWantedBooksFromUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteWantedBooksFromUser() {
        System.out.println("deleteWantedBooksFromUser");
        List<Book> books = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteWantedBooksFromUser(books, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class DefaultUserManager.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Author author = null;
        DefaultUserManager instance = new DefaultUserManager();
        List<User> expResult = null;
        List<User> result = instance.removeAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteAuthorsToUser method, of class DefaultUserManager.
     */
    @Test
    public void testAddFavoriteAuthorsToUser() {
        System.out.println("addFavoriteAuthorsToUser");
        List<Author> authors = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addFavoriteAuthorsToUser(authors, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteAuthorsFromUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteFavoriteAuthorsFromUser() {
        System.out.println("deleteFavoriteAuthorsFromUser");
        List<Author> authors = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteFavoriteAuthorsFromUser(authors, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFriendsToUser method, of class DefaultUserManager.
     */
    @Test
    public void testAddFriendsToUser() {
        System.out.println("addFriendsToUser");
        List<User> friends = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addFriendsToUser(friends, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFriendsFromUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteFriendsFromUser() {
        System.out.println("deleteFriendsFromUser");
        List<User> friends = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteFriendsFromUser(friends, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteReviewers method, of class DefaultUserManager.
     */
    @Test
    public void testAddFavoriteReviewers() {
        System.out.println("addFavoriteReviewers");
        List<User> reviewers = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addFavoriteReviewers(reviewers, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteReviewers method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteFavoriteReviewers() {
        System.out.println("deleteFavoriteReviewers");
        List<User> reviewers = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteFavoriteReviewers(reviewers, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBookReview method, of class DefaultUserManager.
     */
    @Test
    public void testAddBookReview() {
        System.out.println("addBookReview");
        BookReview bookReview = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addBookReview(bookReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBookReview method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteBookReview() {
        System.out.println("deleteBookReview");
        BookReview bookReview = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteBookReview(bookReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorReview method, of class DefaultUserManager.
     */
    @Test
    public void testAddAuthorReview() {
        System.out.println("addAuthorReview");
        AuthorReview authorReview = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addAuthorReview(authorReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthorReview method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteAuthorReview() {
        System.out.println("deleteAuthorReview");
        AuthorReview authorReview = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteAuthorReview(authorReview, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteUser method, of class DefaultUserManager.
     */
    @Test
    public void testUndeleteUser() {
        System.out.println("undeleteUser");
        int id = 0;
        DefaultUserManager instance = new DefaultUserManager();
        instance.undeleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReadingBooksToUser method, of class DefaultUserManager.
     */
    @Test
    public void testAddReadingBooksToUser() {
        System.out.println("addReadingBooksToUser");
        List<Map<Book, Integer>> reading = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addReadingBooksToUser(reading, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReadingBooksFromUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteReadingBooksFromUser() {
        System.out.println("deleteReadingBooksFromUser");
        List<Map<Book, Integer>> reading = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteReadingBooksFromUser(reading, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNoteBooksToUser method, of class DefaultUserManager.
     */
    @Test
    public void testAddNoteBooksToUser() {
        System.out.println("addNoteBooksToUser");
        List<Map<Book, String>> notebooks = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.addNoteBooksToUser(notebooks, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNoteBooksFromUser method, of class DefaultUserManager.
     */
    @Test
    public void testDeleteNoteBooksFromUser() {
        System.out.println("deleteNoteBooksFromUser");
        List<Map<Book, String>> notebooks = null;
        User user = null;
        DefaultUserManager instance = new DefaultUserManager();
        instance.deleteNoteBooksFromUser(notebooks, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
