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
public class DefaultAuthorReviewManagerTest {
    
    public DefaultAuthorReviewManagerTest() {
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
     * Test of getAllReviews method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        AuthorReview review = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        AuthorReview authorReview = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.updateReview(authorReview);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        AuthorReview expResult = null;
        AuthorReview result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByAuthor method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testGetReviewsByAuthor() {
        System.out.println("getReviewsByAuthor");
        Author author = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsByAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByUser method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testGetReviewsByUser() {
        System.out.println("getReviewsByUser");
        User user = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsByUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromRating method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testGetReviewsFromRating() {
        System.out.println("getReviewsFromRating");
        int rating = 0;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsFromRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsToRating method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testGetReviewsToRating() {
        System.out.println("getReviewsToRating");
        int rating = 0;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsToRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromToRating method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testGetReviewsFromToRating() {
        System.out.println("getReviewsFromToRating");
        int from = 0;
        int to = 0;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsFromToRating(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthor method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testAddAuthor() {
        System.out.println("addAuthor");
        AuthorReview review = null;
        Author author = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.addAuthor(review, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        AuthorReview review = null;
        User user = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.addUser(review, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteReviewsWithAuthor method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testDeleteReviewsWithAuthor() {
        System.out.println("DeleteReviewsWithAuthor");
        Author author = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.DeleteReviewsWithAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithUser method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testDeleteReviewsWithUser() {
        System.out.println("deleteReviewsWithUser");
        User user = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.deleteReviewsWithUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteReview method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testUndeleteReview() {
        System.out.println("undeleteReview");
        int id = 0;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.undeleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Author author = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.removeAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromReview method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testRemoveAuthorFromReview() {
        System.out.println("removeAuthorFromReview");
        AuthorReview review = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.removeAuthorFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUserFromReview method, of class DefaultAuthorReviewManager.
     */
    @Test
    public void testRemoveUserFromReview() {
        System.out.println("removeUserFromReview");
        AuthorReview review = null;
        DefaultAuthorReviewManager instance = new DefaultAuthorReviewManager();
        instance.removeUserFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
