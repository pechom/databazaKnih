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
public class GenreTest {
    
    public GenreTest() {
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
     * Test of getId method, of class Genre.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Genre instance = new Genre();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Genre.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Genre instance = new Genre();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Genre.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Genre instance = new Genre();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Genre.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Genre instance = new Genre();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksWithGenre method, of class Genre.
     */
    @Test
    public void testGetBooksWithGenre() {
        System.out.println("getBooksWithGenre");
        Genre instance = new Genre();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksWithGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBooksWithGenre method, of class Genre.
     */
    @Test
    public void testSetBooksWithGenre() {
        System.out.println("setBooksWithGenre");
        List<Book> booksWithGenre = null;
        Genre instance = new Genre();
        instance.setBooksWithGenre(booksWithGenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsWithGenre method, of class Genre.
     */
    @Test
    public void testGetAuthorsWithGenre() {
        System.out.println("getAuthorsWithGenre");
        Genre instance = new Genre();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsWithGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorsWithGenre method, of class Genre.
     */
    @Test
    public void testSetAuthorsWithGenre() {
        System.out.println("setAuthorsWithGenre");
        List<Author> authorsWithGenre = null;
        Genre instance = new Genre();
        instance.setAuthorsWithGenre(authorsWithGenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsActive method, of class Genre.
     */
    @Test
    public void testIsIsActive() {
        System.out.println("isIsActive");
        Genre instance = new Genre();
        boolean expResult = false;
        boolean result = instance.isIsActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsActive method, of class Genre.
     */
    @Test
    public void testSetIsActive() {
        System.out.println("setIsActive");
        boolean isActive = false;
        Genre instance = new Genre();
        instance.setIsActive(isActive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
