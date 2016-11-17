/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

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
public class AuthorReviewTest {
    
    public AuthorReviewTest() {
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
     * Test of getId method, of class AuthorReview.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AuthorReview instance = new AuthorReview();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class AuthorReview.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        AuthorReview instance = new AuthorReview();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class AuthorReview.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        AuthorReview instance = new AuthorReview();
        Author expResult = null;
        Author result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class AuthorReview.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        Author author = null;
        AuthorReview instance = new AuthorReview();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class AuthorReview.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        AuthorReview instance = new AuthorReview();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class AuthorReview.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        AuthorReview instance = new AuthorReview();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class AuthorReview.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        AuthorReview instance = new AuthorReview();
        int expResult = 0;
        int result = instance.getRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class AuthorReview.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        int rating = 0;
        AuthorReview instance = new AuthorReview();
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReview method, of class AuthorReview.
     */
    @Test
    public void testGetReview() {
        System.out.println("getReview");
        AuthorReview instance = new AuthorReview();
        String expResult = "";
        String result = instance.getReview();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReview method, of class AuthorReview.
     */
    @Test
    public void testSetReview() {
        System.out.println("setReview");
        String review = "";
        AuthorReview instance = new AuthorReview();
        instance.setReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
