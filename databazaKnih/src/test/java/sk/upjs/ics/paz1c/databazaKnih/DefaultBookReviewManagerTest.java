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
public class DefaultBookReviewManagerTest {
    
    public DefaultBookReviewManagerTest() {
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
     * Test of getAllReviews method, of class DefaultBookReviewManager.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class DefaultBookReviewManager.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        BookReview review = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class DefaultBookReviewManager.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class DefaultBookReviewManager.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        BookReview review = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.updateReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DefaultBookReviewManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        BookReview expResult = null;
        BookReview result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByBook method, of class DefaultBookReviewManager.
     */
    @Test
    public void testGetReviewsByBook() {
        System.out.println("getReviewsByBook");
        Book book = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsByBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByUser method, of class DefaultBookReviewManager.
     */
    @Test
    public void testGetReviewsByUser() {
        System.out.println("getReviewsByUser");
        User user = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsByUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromRating method, of class DefaultBookReviewManager.
     */
    @Test
    public void testGetReviewsFromRating() {
        System.out.println("getReviewsFromRating");
        int rating = 0;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsFromRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsToRating method, of class DefaultBookReviewManager.
     */
    @Test
    public void testGetReviewsToRating() {
        System.out.println("getReviewsToRating");
        int rating = 0;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsToRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromToRating method, of class DefaultBookReviewManager.
     */
    @Test
    public void testGetReviewsFromToRating() {
        System.out.println("getReviewsFromToRating");
        int from = 0;
        int to = 0;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getReviewsFromToRating(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class DefaultBookReviewManager.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        BookReview review = null;
        User user = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.addUser(review, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class DefaultBookReviewManager.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        BookReview review = null;
        Book book = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.addBook(review, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class DefaultBookReviewManager.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class DefaultBookReviewManager.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Book book = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.removeBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithBook method, of class DefaultBookReviewManager.
     */
    @Test
    public void testDeleteReviewsWithBook() {
        System.out.println("deleteReviewsWithBook");
        Book book = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.deleteReviewsWithBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithUser method, of class DefaultBookReviewManager.
     */
    @Test
    public void testDeleteReviewsWithUser() {
        System.out.println("deleteReviewsWithUser");
        User user = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.deleteReviewsWithUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteReview method, of class DefaultBookReviewManager.
     */
    @Test
    public void testUndeleteReview() {
        System.out.println("undeleteReview");
        int id = 0;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.undeleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUserFromReview method, of class DefaultBookReviewManager.
     */
    @Test
    public void testRemoveUserFromReview() {
        System.out.println("removeUserFromReview");
        BookReview review = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.removeUserFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromReview method, of class DefaultBookReviewManager.
     */
    @Test
    public void testRemoveBookFromReview() {
        System.out.println("removeBookFromReview");
        BookReview review = null;
        DefaultBookReviewManager instance = new DefaultBookReviewManager();
        instance.removeBookFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
