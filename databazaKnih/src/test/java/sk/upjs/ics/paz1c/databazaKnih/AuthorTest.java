/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.Date;
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
public class AuthorTest {
    
    public AuthorTest() {
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
     * Test of getAuthorReviews method, of class Author.
     */
    @Test
    public void testGetAuthorReviews() {
        System.out.println("getAuthorReviews");
        Author instance = new Author();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getAuthorReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorReviews method, of class Author.
     */
    @Test
    public void testSetAuthorReviews() {
        System.out.println("setAuthorReviews");
        List<AuthorReview> authorReviews = null;
        Author instance = new Author();
        instance.setAuthorReviews(authorReviews);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Author.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Author instance = new Author();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Author.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Author instance = new Author();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooks method, of class Author.
     */
    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        Author instance = new Author();
        List<Book> expResult = null;
        List<Book> result = instance.getBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBooks method, of class Author.
     */
    @Test
    public void testSetBooks() {
        System.out.println("setBooks");
        ArrayList<Book> books = null;
        Author instance = new Author();
        instance.setBooks(books);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenres method, of class Author.
     */
    @Test
    public void testGetGenres() {
        System.out.println("getGenres");
        Author instance = new Author();
        List<String> expResult = null;
        List<String> result = instance.getGenres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenres method, of class Author.
     */
    @Test
    public void testSetGenres() {
        System.out.println("setGenres");
        ArrayList<String> genres = null;
        Author instance = new Author();
        instance.setGenres(genres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberInChart method, of class Author.
     */
    @Test
    public void testGetNumberInChart() {
        System.out.println("getNumberInChart");
        Author instance = new Author();
        int expResult = 0;
        int result = instance.getNumberInChart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberInChart method, of class Author.
     */
    @Test
    public void testSetNumberInChart() {
        System.out.println("setNumberInChart");
        int numberInChart = 0;
        Author instance = new Author();
        instance.setNumberInChart(numberInChart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirth method, of class Author.
     */
    @Test
    public void testGetBirth() {
        System.out.println("getBirth");
        Author instance = new Author();
        Date expResult = null;
        Date result = instance.getBirth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirth method, of class Author.
     */
    @Test
    public void testSetBirth() {
        System.out.println("setBirth");
        Date birth = null;
        Author instance = new Author();
        instance.setBirth(birth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeath method, of class Author.
     */
    @Test
    public void testGetDeath() {
        System.out.println("getDeath");
        Author instance = new Author();
        Date expResult = null;
        Date result = instance.getDeath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeath method, of class Author.
     */
    @Test
    public void testSetDeath() {
        System.out.println("setDeath");
        Date death = null;
        Author instance = new Author();
        instance.setDeath(death);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNationality method, of class Author.
     */
    @Test
    public void testGetNationality() {
        System.out.println("getNationality");
        Author instance = new Author();
        String expResult = "";
        String result = instance.getNationality();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNationality method, of class Author.
     */
    @Test
    public void testSetNationality() {
        System.out.println("setNationality");
        String nationality = "";
        Author instance = new Author();
        instance.setNationality(nationality);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSex method, of class Author.
     */
    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Author instance = new Author();
        String expResult = "";
        String result = instance.getSex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSex method, of class Author.
     */
    @Test
    public void testSetSex() {
        System.out.println("setSex");
        String sex = "";
        Author instance = new Author();
        instance.setSex(sex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBiography method, of class Author.
     */
    @Test
    public void testGetBiography() {
        System.out.println("getBiography");
        Author instance = new Author();
        String expResult = "";
        String result = instance.getBiography();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBiography method, of class Author.
     */
    @Test
    public void testSetBiography() {
        System.out.println("setBiography");
        String biography = "";
        Author instance = new Author();
        instance.setBiography(biography);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVerificationStatus method, of class Author.
     */
    @Test
    public void testIsVerificationStatus() {
        System.out.println("isVerificationStatus");
        Author instance = new Author();
        boolean expResult = false;
        boolean result = instance.isVerificationStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerificationStatus method, of class Author.
     */
    @Test
    public void testSetVerificationStatus() {
        System.out.println("setVerificationStatus");
        boolean verificationStatus = false;
        Author instance = new Author();
        instance.setVerificationStatus(verificationStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLifeStatus method, of class Author.
     */
    @Test
    public void testIsLifeStatus() {
        System.out.println("isLifeStatus");
        Author instance = new Author();
        boolean expResult = false;
        boolean result = instance.isLifeStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLifeStatus method, of class Author.
     */
    @Test
    public void testSetLifeStatus() {
        System.out.println("setLifeStatus");
        boolean lifeStatus = false;
        Author instance = new Author();
        instance.setLifeStatus(lifeStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
