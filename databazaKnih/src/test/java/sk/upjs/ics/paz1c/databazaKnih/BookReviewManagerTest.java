/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
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
public class BookReviewManagerTest {
    
    public BookReviewManagerTest() {
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
     * Test of getAllReviews method, of class BookReviewManager.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByBook method, of class BookReviewManager.
     */
    @Test
    public void testGetReviewsByBook() {
        System.out.println("getReviewsByBook");
        Book book = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsByBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByUser method, of class BookReviewManager.
     */
    @Test
    public void testGetReviewsByUser() {
        System.out.println("getReviewsByUser");
        User user = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsByUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromRating method, of class BookReviewManager.
     */
    @Test
    public void testGetReviewsFromRating() {
        System.out.println("getReviewsFromRating");
        int rating = 0;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsFromRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsToRating method, of class BookReviewManager.
     */
    @Test
    public void testGetReviewsToRating() {
        System.out.println("getReviewsToRating");
        int rating = 0;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsToRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromToRating method, of class BookReviewManager.
     */
    @Test
    public void testGetReviewsFromToRating() {
        System.out.println("getReviewsFromToRating");
        int from = 0;
        int to = 0;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsFromToRating(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class BookReviewManager.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        BookReview review = null;
        User user = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.addUser(review, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUserFromReview method, of class BookReviewManager.
     */
    @Test
    public void testRemoveUserFromReview() {
        System.out.println("removeUserFromReview");
        BookReview review = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.removeUserFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class BookReviewManager.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        BookReview review = null;
        Book book = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.addBook(review, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromReview method, of class BookReviewManager.
     */
    @Test
    public void testRemoveBookFromReview() {
        System.out.println("removeBookFromReview");
        BookReview review = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.removeBookFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class BookReviewManager.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class BookReviewManager.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Book book = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.removeBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithBook method, of class BookReviewManager.
     */
    @Test
    public void testDeleteReviewsWithBook() {
        System.out.println("deleteReviewsWithBook");
        Book book = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.deleteReviewsWithBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithUser method, of class BookReviewManager.
     */
    @Test
    public void testDeleteReviewsWithUser() {
        System.out.println("deleteReviewsWithUser");
        User user = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.deleteReviewsWithUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class BookReviewManager.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        BookReview review = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class BookReviewManager.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteReview method, of class BookReviewManager.
     */
    @Test
    public void testUndeleteReview() {
        System.out.println("undeleteReview");
        int id = 0;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.undeleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class BookReviewManager.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        BookReview bookReview = null;
        BookReviewManager instance = new BookReviewManagerImpl();
        instance.updateReview(bookReview);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class BookReviewManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        BookReviewManager instance = new BookReviewManagerImpl();
        BookReview expResult = null;
        BookReview result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BookReviewManagerImpl implements BookReviewManager {

        public List<BookReview> getAllReviews() {
            return null;
        }

        public List<BookReview> getReviewsByBook(Book book) {
            return null;
        }

        public List<BookReview> getReviewsByUser(User user) {
            return null;
        }

        public List<BookReview> getReviewsFromRating(int rating) {
            return null;
        }

        public List<BookReview> getReviewsToRating(int rating) {
            return null;
        }

        public List<BookReview> getReviewsFromToRating(int from, int to) {
            return null;
        }

        public void addUser(BookReview review, User user) {
        }

        public void removeUserFromReview(BookReview review) {
        }

        public void addBook(BookReview review, Book book) {
        }

        public void removeBookFromReview(BookReview review) {
        }

        public List<BookReview> removeUser(User user) {
            return null;
        }

        public List<BookReview> removeBook(Book book) {
            return null;
        }

        public List<BookReview> deleteReviewsWithBook(Book book) {
            return null;
        }

        public List<BookReview> deleteReviewsWithUser(User user) {
            return null;
        }

        public void insertReview(BookReview review) {
        }

        public void deleteReview(int id) {
        }

        public void undeleteReview(int id) {
        }

        public void updateReview(BookReview bookReview) {
        }

        public BookReview findById(int id) {
            return null;
        }
    }
    
}
