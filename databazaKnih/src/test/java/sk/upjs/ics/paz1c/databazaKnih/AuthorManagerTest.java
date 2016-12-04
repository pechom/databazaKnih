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
public class AuthorManagerTest {
    
    public AuthorManagerTest() {
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
     * Test of getAllAuthors method, of class AuthorManager.
     */
    @Test
    public void testGetAllAuthors() {
        System.out.println("getAllAuthors");
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAllAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerificatedAuthors method, of class AuthorManager.
     */
    @Test
    public void testGetVerificatedAuthors() {
        System.out.println("getVerificatedAuthors");
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getVerificatedAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotVerificatedAuthors method, of class AuthorManager.
     */
    @Test
    public void testGetNotVerificatedAuthors() {
        System.out.println("getNotVerificatedAuthors");
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getNotVerificatedAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByName method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsByName() {
        System.out.println("getAuthorsByName");
        String name = "";
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByGenres method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsByGenres() {
        System.out.println("getAuthorsByGenres");
        List<Genre> genres = null;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByAllGenres method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsByAllGenres() {
        System.out.println("getAuthorsByAllGenres");
        List<Genre> genres = null;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByAllGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromBirth method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsFromBirth() {
        System.out.println("getAuthorsFromBirth");
        int year = 0;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromBirth(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsToBirth method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsToBirth() {
        System.out.println("getAuthorsToBirth");
        int year = 0;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsToBirth(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromToBirth method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsFromToBirth() {
        System.out.println("getAuthorsFromToBirth");
        int from = 0;
        int to = 0;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromToBirth(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromDeath method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsFromDeath() {
        System.out.println("getAuthorsFromDeath");
        int year = 0;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromDeath(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsToDeath method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsToDeath() {
        System.out.println("getAuthorsToDeath");
        int year = 0;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsToDeath(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsFromToDeath method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsFromToDeath() {
        System.out.println("getAuthorsFromToDeath");
        int from = 0;
        int to = 0;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsFromToDeath(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsByNationality method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsByNationality() {
        System.out.println("getAuthorsByNationality");
        String nationality = "";
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsByNationality(nationality);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorsBySex method, of class AuthorManager.
     */
    @Test
    public void testGetAuthorsBySex() {
        System.out.println("getAuthorsBySex");
        String sex = "";
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAuthorsBySex(sex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliveAuthors method, of class AuthorManager.
     */
    @Test
    public void testGetAliveAuthors() {
        System.out.println("getAliveAuthors");
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAliveAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeadAuthors method, of class AuthorManager.
     */
    @Test
    public void testGetDeadAuthors() {
        System.out.println("getDeadAuthors");
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getDeadAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBooksToAuthor method, of class AuthorManager.
     */
    @Test
    public void testAddBooksToAuthor() {
        System.out.println("addBooksToAuthor");
        List<Book> books = null;
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.addBooksToAuthor(books, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBooksFromAuthor method, of class AuthorManager.
     */
    @Test
    public void testRemoveBooksFromAuthor() {
        System.out.println("removeBooksFromAuthor");
        List<Book> books = null;
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.removeBooksFromAuthor(books, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGenresToAuthor method, of class AuthorManager.
     */
    @Test
    public void testAddGenresToAuthor() {
        System.out.println("addGenresToAuthor");
        List<Genre> genres = null;
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.addGenresToAuthor(genres, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenresFromAuthor method, of class AuthorManager.
     */
    @Test
    public void testRemoveGenresFromAuthor() {
        System.out.println("removeGenresFromAuthor");
        List<Genre> genres = null;
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.removeGenresFromAuthor(genres, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenre method, of class AuthorManager.
     */
    @Test
    public void testRemoveGenre() {
        System.out.println("removeGenre");
        Genre genre = null;
        AuthorManager instance = new AuthorManagerImpl();
        List<Author> expResult = null;
        List<Author> result = instance.removeGenre(genre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReview method, of class AuthorManager.
     */
    @Test
    public void testAddReview() {
        System.out.println("addReview");
        AuthorReview review = null;
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.addReview(review, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReview method, of class AuthorManager.
     */
    @Test
    public void testRemoveReview() {
        System.out.println("removeReview");
        AuthorReview review = null;
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.removeReview(review, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllReviews method, of class AuthorManager.
     */
    @Test
    public void testRemoveAllReviews() {
        System.out.println("removeAllReviews");
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.removeAllReviews(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAuthor method, of class AuthorManager.
     */
    @Test
    public void testInsertAuthor() {
        System.out.println("insertAuthor");
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.insertAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthor method, of class AuthorManager.
     */
    @Test
    public void testDeleteAuthor() {
        System.out.println("deleteAuthor");
        int id = 0;
        AuthorManager instance = new AuthorManagerImpl();
        instance.deleteAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteAuthor method, of class AuthorManager.
     */
    @Test
    public void testUndeleteAuthor() {
        System.out.println("undeleteAuthor");
        int id = 0;
        AuthorManager instance = new AuthorManagerImpl();
        instance.undeleteAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthor method, of class AuthorManager.
     */
    @Test
    public void testUpdateAuthor() {
        System.out.println("updateAuthor");
        Author author = null;
        AuthorManager instance = new AuthorManagerImpl();
        instance.updateAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class AuthorManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        AuthorManager instance = new AuthorManagerImpl();
        Author expResult = null;
        Author result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AuthorManagerImpl implements AuthorManager {

        public List<Author> getAllAuthors() {
            return null;
        }

        public List<Author> getVerificatedAuthors() {
            return null;
        }

        public List<Author> getNotVerificatedAuthors() {
            return null;
        }

        public List<Author> getAuthorsByName(String name) {
            return null;
        }

        public List<Author> getAuthorsByGenres(List<Genre> genres) {
            return null;
        }

        public List<Author> getAuthorsByAllGenres(List<Genre> genres) {
            return null;
        }

        public List<Author> getAuthorsFromBirth(int year) {
            return null;
        }

        public List<Author> getAuthorsToBirth(int year) {
            return null;
        }

        public List<Author> getAuthorsFromToBirth(int from, int to) {
            return null;
        }

        public List<Author> getAuthorsFromDeath(int year) {
            return null;
        }

        public List<Author> getAuthorsToDeath(int year) {
            return null;
        }

        public List<Author> getAuthorsFromToDeath(int from, int to) {
            return null;
        }

        public List<Author> getAuthorsByNationality(String nationality) {
            return null;
        }

        public List<Author> getAuthorsBySex(String sex) {
            return null;
        }

        public List<Author> getAliveAuthors() {
            return null;
        }

        public List<Author> getDeadAuthors() {
            return null;
        }

        public void addBooksToAuthor(List<Book> books, Author author) {
        }

        public void removeBooksFromAuthor(List<Book> books, Author author) {
        }

        public void addGenresToAuthor(List<Genre> genres, Author author) {
        }

        public void removeGenresFromAuthor(List<Genre> genres, Author author) {
        }

        public List<Author> removeGenre(Genre genre) {
            return null;
        }

        public void addReview(AuthorReview review, Author author) {
        }

        public void removeReview(AuthorReview review, Author author) {
        }

        public void removeAllReviews(Author author) {
        }

        public void insertAuthor(Author author) {
        }

        public void deleteAuthor(int id) {
        }

        public void undeleteAuthor(int id) {
        }

        public void updateAuthor(Author author) {
        }

        public Author findById(int id) {
            return null;
        }
    }
    
}
