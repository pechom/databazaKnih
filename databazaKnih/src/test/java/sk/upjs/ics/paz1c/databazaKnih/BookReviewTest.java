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
public class BookReviewTest {
    
    public BookReviewTest() {
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
     * Test of getBook method, of class BookReview.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        BookReview instance = new BookReview();
        Book expResult = null;
        Book result = instance.getBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBook method, of class BookReview.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        Book book = null;
        BookReview instance = new BookReview();
        instance.setBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class BookReview.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        BookReview instance = new BookReview();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class BookReview.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        BookReview instance = new BookReview();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class BookReview.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        BookReview instance = new BookReview();
        int expResult = 0;
        int result = instance.getRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class BookReview.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        int rating = 0;
        BookReview instance = new BookReview();
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReview method, of class BookReview.
     */
    @Test
    public void testGetReview() {
        System.out.println("getReview");
        BookReview instance = new BookReview();
        String expResult = "";
        String result = instance.getReview();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReview method, of class BookReview.
     */
    @Test
    public void testSetReview() {
        System.out.println("setReview");
        String review = "";
        BookReview instance = new BookReview();
        instance.setReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class BookReview.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        BookReview instance = new BookReview();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class BookReview.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        BookReview instance = new BookReview();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsActive method, of class BookReview.
     */
    @Test
    public void testIsIsActive() {
        System.out.println("isIsActive");
        BookReview instance = new BookReview();
        boolean expResult = false;
        boolean result = instance.isIsActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsActive method, of class BookReview.
     */
    @Test
    public void testSetIsActive() {
        System.out.println("setIsActive");
        boolean isActive = false;
        BookReview instance = new BookReview();
        instance.setIsActive(isActive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
