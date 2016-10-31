/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
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
public class BookTest {
    
    public BookTest() {
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
     * Test of getName method, of class Book.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Book.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Book instance = new Book();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class Book.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "";
        Book instance = new Book();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Book.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Book.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        Book instance = new Book();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenres method, of class Book.
     */
    @Test
    public void testGetGenres() {
        System.out.println("getGenres");
        Book instance = new Book();
        List<String> expResult = null;
        List<String> result = instance.getGenres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenres method, of class Book.
     */
    @Test
    public void testSetGenres() {
        System.out.println("setGenres");
        ArrayList<String> genres = null;
        Book instance = new Book();
        instance.setGenres(genres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfPages method, of class Book.
     */
    @Test
    public void testGetNumberOfPages() {
        System.out.println("getNumberOfPages");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getNumberOfPages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfPages method, of class Book.
     */
    @Test
    public void testSetNumberOfPages() {
        System.out.println("setNumberOfPages");
        int numberOfPages = 0;
        Book instance = new Book();
        instance.setNumberOfPages(numberOfPages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getISBN method, of class Book.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getISBN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setISBN method, of class Book.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        int ISBN = 0;
        Book instance = new Book();
        instance.setISBN(ISBN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTags method, of class Book.
     */
    @Test
    public void testGetTags() {
        System.out.println("getTags");
        Book instance = new Book();
        List<String> expResult = null;
        List<String> result = instance.getTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTags method, of class Book.
     */
    @Test
    public void testSetTags() {
        System.out.println("setTags");
        ArrayList<String> tags = null;
        Book instance = new Book();
        instance.setTags(tags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Book.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Book.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Book instance = new Book();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfReviews method, of class Book.
     */
    @Test
    public void testGetNumberOfReviews() {
        System.out.println("getNumberOfReviews");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getNumberOfReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfReviews method, of class Book.
     */
    @Test
    public void testSetNumberOfReviews() {
        System.out.println("setNumberOfReviews");
        int numberOfReviews = 0;
        Book instance = new Book();
        instance.setNumberOfReviews(numberOfReviews);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverageOfReviews method, of class Book.
     */
    @Test
    public void testGetAverageOfReviews() {
        System.out.println("getAverageOfReviews");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getAverageOfReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAverageOfReviews method, of class Book.
     */
    @Test
    public void testSetAverageOfReviews() {
        System.out.println("setAverageOfReviews");
        int averageOfReviews = 0;
        Book instance = new Book();
        instance.setAverageOfReviews(averageOfReviews);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberInChart method, of class Book.
     */
    @Test
    public void testGetNumberInChart() {
        System.out.println("getNumberInChart");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.getNumberInChart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberInChart method, of class Book.
     */
    @Test
    public void testSetNumberInChart() {
        System.out.println("setNumberInChart");
        int numberInChart = 0;
        Book instance = new Book();
        instance.setNumberInChart(numberInChart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVerificationStatus method, of class Book.
     */
    @Test
    public void testIsVerificationStatus() {
        System.out.println("isVerificationStatus");
        Book instance = new Book();
        boolean expResult = false;
        boolean result = instance.isVerificationStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerificationStatus method, of class Book.
     */
    @Test
    public void testSetVerificationStatus() {
        System.out.println("setVerificationStatus");
        boolean verificationStatus = false;
        Book instance = new Book();
        instance.setVerificationStatus(verificationStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIssuedStatus method, of class Book.
     */
    @Test
    public void testIsIssuedStatus() {
        System.out.println("isIssuedStatus");
        Book instance = new Book();
        boolean expResult = false;
        boolean result = instance.isIssuedStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIssuedStatus method, of class Book.
     */
    @Test
    public void testSetIssuedStatus() {
        System.out.println("setIssuedStatus");
        boolean issuedStatus = false;
        Book instance = new Book();
        instance.setIssuedStatus(issuedStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
