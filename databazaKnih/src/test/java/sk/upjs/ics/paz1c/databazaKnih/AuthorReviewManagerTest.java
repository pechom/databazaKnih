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
public class AuthorReviewManagerTest {
    
    public AuthorReviewManagerTest() {
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
     * Test of getAllReviews method, of class AuthorReviewManager.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByAuthor method, of class AuthorReviewManager.
     */
    @Test
    public void testGetReviewsByAuthor() {
        System.out.println("getReviewsByAuthor");
        Author author = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsByAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsByUser method, of class AuthorReviewManager.
     */
    @Test
    public void testGetReviewsByUser() {
        System.out.println("getReviewsByUser");
        User user = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsByUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromRating method, of class AuthorReviewManager.
     */
    @Test
    public void testGetReviewsFromRating() {
        System.out.println("getReviewsFromRating");
        int rating = 0;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsFromRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsToRating method, of class AuthorReviewManager.
     */
    @Test
    public void testGetReviewsToRating() {
        System.out.println("getReviewsToRating");
        int rating = 0;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsToRating(rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewsFromToRating method, of class AuthorReviewManager.
     */
    @Test
    public void testGetReviewsFromToRating() {
        System.out.println("getReviewsFromToRating");
        int from = 0;
        int to = 0;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getReviewsFromToRating(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthor method, of class AuthorReviewManager.
     */
    @Test
    public void testAddAuthor() {
        System.out.println("addAuthor");
        AuthorReview review = null;
        Author author = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.addAuthor(review, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromReview method, of class AuthorReviewManager.
     */
    @Test
    public void testRemoveAuthorFromReview() {
        System.out.println("removeAuthorFromReview");
        AuthorReview review = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.removeAuthorFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class AuthorReviewManager.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Author author = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.removeAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class AuthorReviewManager.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        AuthorReview review = null;
        User user = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.addUser(review, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUserFromReview method, of class AuthorReviewManager.
     */
    @Test
    public void testRemoveUserFromReview() {
        System.out.println("removeUserFromReview");
        AuthorReview review = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.removeUserFromReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class AuthorReviewManager.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteReviewsWithAuthor method, of class AuthorReviewManager.
     */
    @Test
    public void testDeleteReviewsWithAuthor() {
        System.out.println("DeleteReviewsWithAuthor");
        Author author = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.DeleteReviewsWithAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithUser method, of class AuthorReviewManager.
     */
    @Test
    public void testDeleteReviewsWithUser() {
        System.out.println("deleteReviewsWithUser");
        User user = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.deleteReviewsWithUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class AuthorReviewManager.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        AuthorReview review = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class AuthorReviewManager.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteReview method, of class AuthorReviewManager.
     */
    @Test
    public void testUndeleteReview() {
        System.out.println("undeleteReview");
        int id = 0;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.undeleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class AuthorReviewManager.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        AuthorReview authorReview = null;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        instance.updateReview(authorReview);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class AuthorReviewManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        AuthorReviewManager instance = new AuthorReviewManagerImpl();
        AuthorReview expResult = null;
        AuthorReview result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AuthorReviewManagerImpl implements AuthorReviewManager {

        public List<AuthorReview> getAllReviews() {
            return null;
        }

        public List<AuthorReview> getReviewsByAuthor(Author author) {
            return null;
        }

        public List<AuthorReview> getReviewsByUser(User user) {
            return null;
        }

        public List<AuthorReview> getReviewsFromRating(int rating) {
            return null;
        }

        public List<AuthorReview> getReviewsToRating(int rating) {
            return null;
        }

        public List<AuthorReview> getReviewsFromToRating(int from, int to) {
            return null;
        }

        public void addAuthor(AuthorReview review, Author author) {
        }

        public void removeAuthorFromReview(AuthorReview review) {
        }

        public List<AuthorReview> removeAuthor(Author author) {
            return null;
        }

        public void addUser(AuthorReview review, User user) {
        }

        public void removeUserFromReview(AuthorReview review) {
        }

        public List<AuthorReview> removeUser(User user) {
            return null;
        }

        public List<AuthorReview> DeleteReviewsWithAuthor(Author author) {
            return null;
        }

        public List<AuthorReview> deleteReviewsWithUser(User user) {
            return null;
        }

        public void insertReview(AuthorReview review) {
        }

        public void deleteReview(int id) {
        }

        public void undeleteReview(int id) {
        }

        public void updateReview(AuthorReview authorReview) {
        }

        public AuthorReview findById(int id) {
            return null;
        }
    }
    
}
