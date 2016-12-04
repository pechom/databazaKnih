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
public class DefaultAuthorManagerTest {
    
    public DefaultAuthorManagerTest() {
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
     * Test of getAllAuthors method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAllAuthors() {
        System.out.println("getAllAuthors");
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAllAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testInsertAuthor() {
        System.out.println("insertAuthor");
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.insertAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testDeleteAuthor() {
        System.out.println("deleteAuthor");
        int id = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.deleteAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testUpdateAuthor() {
        System.out.println("updateAuthor");
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.updateAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DefaultAuthorManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        Author expResult = null;
        Author result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerificatedAuthors method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetVerificatedAuthors() {
        System.out.println("getVerificatedAuthors");
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getVerificatedAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotVerificatedAuthors method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetNotVerificatedAuthors() {
        System.out.println("getNotVerificatedAuthors");
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getNotVerificatedAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByName method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsByName() {
        System.out.println("getAuthorsByName");
        String name = "";
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByGenres method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsByGenres() {
        System.out.println("getAuthorsByGenres");
        List<Genre> genres = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromBirth method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsFromBirth() {
        System.out.println("getAuthorsFromBirth");
        int year = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromBirth(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsToBirth method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsToBirth() {
        System.out.println("getAuthorsToBirth");
        int year = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsToBirth(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromToBirth method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsFromToBirth() {
        System.out.println("getAuthorsFromToBirth");
        int from = 0;
        int to = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromToBirth(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromDeath method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsFromDeath() {
        System.out.println("getAuthorsFromDeath");
        int year = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromDeath(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsToDeath method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsToDeath() {
        System.out.println("getAuthorsToDeath");
        int year = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsToDeath(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromToDeath method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsFromToDeath() {
        System.out.println("getAuthorsFromToDeath");
        int from = 0;
        int to = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromToDeath(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByNationality method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsByNationality() {
        System.out.println("getAuthorsByNationality");
        String nationality = "";
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByNationality(nationality);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsBySex method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsBySex() {
        System.out.println("getAuthorsBySex");
        String sex = "";
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsBySex(sex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBooksToAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testAddBooksToAuthor() {
        System.out.println("addBooksToAuthor");
        List<Book> books = null;
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.addBooksToAuthor(books, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBooksFromAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testRemoveBooksFromAuthor() {
        System.out.println("removeBooksFromAuthor");
        List<Book> books = null;
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.removeBooksFromAuthor(books, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGenresToAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testAddGenresToAuthor() {
        System.out.println("addGenresToAuthor");
        List<Genre> genres = null;
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.addGenresToAuthor(genres, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenresFromAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testRemoveGenresFromAuthor() {
        System.out.println("removeGenresFromAuthor");
        List<Genre> genres = null;
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.removeGenresFromAuthor(genres, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenre method, of class DefaultAuthorManager.
     */
    @Test
    public void testRemoveGenre() {
        System.out.println("removeGenre");
        Genre genre = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.removeGenre(genre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReview method, of class DefaultAuthorManager.
     */
    @Test
    public void testAddReview() {
        System.out.println("addReview");
        AuthorReview review = null;
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.addReview(review, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReview method, of class DefaultAuthorManager.
     */
    @Test
    public void testRemoveReview() {
        System.out.println("removeReview");
        AuthorReview review = null;
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.removeReview(review, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteAuthor method, of class DefaultAuthorManager.
     */
    @Test
    public void testUndeleteAuthor() {
        System.out.println("undeleteAuthor");
        int id = 0;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.undeleteAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByAllGenres method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAuthorsByAllGenres() {
        System.out.println("getAuthorsByAllGenres");
        List<Genre> genres = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByAllGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliveAuthors method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetAliveAuthors() {
        System.out.println("getAliveAuthors");
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getAliveAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeadAuthors method, of class DefaultAuthorManager.
     */
    @Test
    public void testGetDeadAuthors() {
        System.out.println("getDeadAuthors");
        DefaultAuthorManager instance = new DefaultAuthorManager();
        List<Author> expResult = null;
        List<Author> result = instance.getDeadAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllReviews method, of class DefaultAuthorManager.
     */
    @Test
    public void testRemoveAllReviews() {
        System.out.println("removeAllReviews");
        Author author = null;
        DefaultAuthorManager instance = new DefaultAuthorManager();
        instance.removeAllReviews(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
