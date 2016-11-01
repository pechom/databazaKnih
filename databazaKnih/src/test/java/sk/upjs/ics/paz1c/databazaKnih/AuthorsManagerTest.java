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
public class AuthorsManagerTest {

    public AuthorsManagerTest() {
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
     * Test of getAllAuthors method, of class AuthorsManager.
     */
    @Test
    public void testGetAllAuthors() {
        System.out.println("getAllAuthors");
        AuthorsManager instance = new AuthorsManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAllAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAuthor method, of class AuthorsManager.
     */
    @Test
    public void testInsertAuthor() {
        System.out.println("insertAuthor");
        Author author = null;
        AuthorsManager instance = new AuthorsManagerImpl();
        instance.insertAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthor method, of class AuthorsManager.
     */
    @Test
    public void testDeleteAuthor() {
        System.out.println("deleteAuthor");
        Author author = null;
        AuthorsManager instance = new AuthorsManagerImpl();
        instance.deleteAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthor method, of class AuthorsManager.
     */
    @Test
    public void testUpdateAuthor() {
        System.out.println("updateAuthor");
        Author author = null;
        AuthorsManager instance = new AuthorsManagerImpl();
        instance.updateAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AuthorsManagerImpl implements AuthorsManager {

        public List<Author> getAllAuthors() {
            return null;
        }

        public void insertAuthor(Author author) {
        }

        public void deleteAuthor(Author author) {
        }

        public void updateAuthor(Author author) {
        }
    }
}
