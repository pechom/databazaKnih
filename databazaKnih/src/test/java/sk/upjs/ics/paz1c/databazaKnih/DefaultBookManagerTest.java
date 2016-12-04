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
public class DefaultBookManagerTest {
    
    public DefaultBookManagerTest() {
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
     * Test of getAllBooks method, of class DefaultBookManager.
     */
    @Test
    public void testGetAllBooks() {
        System.out.println("getAllBooks");
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getAllBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertBook method, of class DefaultBookManager.
     */
    @Test
    public void testInsertBook() {
        System.out.println("insertBook");
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.insertBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class DefaultBookManager.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        int id = 0;
        DefaultBookManager instance = new DefaultBookManager();
        instance.deleteBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class DefaultBookManager.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.updateBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DefaultBookManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        DefaultBookManager instance = new DefaultBookManager();
        Book expResult = null;
        Book result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerificatedBooks method, of class DefaultBookManager.
     */
    @Test
    public void testGetVerificatedBooks() {
        System.out.println("getVerificatedBooks");
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getVerificatedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotVerificatedBooks method, of class DefaultBookManager.
     */
    @Test
    public void testGetNotVerificatedBooks() {
        System.out.println("getNotVerificatedBooks");
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getNotVerificatedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByName method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksByName() {
        System.out.println("GetBooksByName");
        String name = "";
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByAuthor method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksByAuthor() {
        System.out.println("GetBooksByAuthor");
        Author author = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromYear method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromYear() {
        System.out.println("getBooksFromYear");
        int year = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromYear(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToYear method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksToYear() {
        System.out.println("getBooksToYear");
        int year = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToYear(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToYear method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromToYear() {
        System.out.println("getBooksFromToYear");
        int from = 0;
        int to = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToYear(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByGenres method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksByGenres() {
        System.out.println("GetBooksByGenres");
        List<Genre> genres = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromPages method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromPages() {
        System.out.println("getBooksFromPages");
        int pages = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromPages(pages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToPages method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksToPages() {
        System.out.println("getBooksToPages");
        int pages = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToPages(pages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToPages method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromToPages() {
        System.out.println("getBooksFromToPages");
        int from = 0;
        int to = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToPages(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookByISBN method, of class DefaultBookManager.
     */
    @Test
    public void testGetBookByISBN() {
        System.out.println("getBookByISBN");
        int ISBN = 0;
        DefaultBookManager instance = new DefaultBookManager();
        Book expResult = null;
        Book result = instance.getBookByISBN(ISBN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByTags method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksByTags() {
        System.out.println("GetBooksByTags");
        List<Tag> tags = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByTags(tags);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksFromReviews method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromReviews() {
        System.out.println("GetBooksFromReviews");
        int numberOfReviews = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksFromReviews(numberOfReviews);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromAverage method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromAverage() {
        System.out.println("getBooksFromAverage");
        int average = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromAverage(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToAverage method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksToAverage() {
        System.out.println("getBooksToAverage");
        int average = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToAverage(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToAverage method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromToAverage() {
        System.out.println("getBooksFromToAverage");
        int from = 0;
        int to = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToAverage(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromChart method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromChart() {
        System.out.println("getBooksFromChart");
        int chart = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromChart(chart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToChart method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksToChart() {
        System.out.println("getBooksToChart");
        int chart = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToChart(chart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToChart method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromToChart() {
        System.out.println("getBooksFromToChart");
        int from = 0;
        int to = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToChart(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromBayesian method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromBayesian() {
        System.out.println("getBooksFromBayesian");
        int average = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromBayesian(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToBayesian method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksToBayesian() {
        System.out.println("getBooksToBayesian");
        int average = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToBayesian(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToBayesian method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksFromToBayesian() {
        System.out.println("getBooksFromToBayesian");
        int from = 0;
        int to = 0;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToBayesian(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorToBook method, of class DefaultBookManager.
     */
    @Test
    public void testAddAuthorToBook() {
        System.out.println("addAuthorToBook");
        Book book = null;
        Author author = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.addAuthorToBook(book, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromBook method, of class DefaultBookManager.
     */
    @Test
    public void testRemoveAuthorFromBook() {
        System.out.println("removeAuthorFromBook");
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.removeAuthorFromBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class DefaultBookManager.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Author author = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.removeAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGenresToBook method, of class DefaultBookManager.
     */
    @Test
    public void testAddGenresToBook() {
        System.out.println("addGenresToBook");
        List<Genre> genres = null;
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.addGenresToBook(genres, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenresFromBook method, of class DefaultBookManager.
     */
    @Test
    public void testRemoveGenresFromBook() {
        System.out.println("removeGenresFromBook");
        List<Genre> genres = null;
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.removeGenresFromBook(genres, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenre method, of class DefaultBookManager.
     */
    @Test
    public void testRemoveGenre() {
        System.out.println("removeGenre");
        Genre genre = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.removeGenre(genre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTagsToBook method, of class DefaultBookManager.
     */
    @Test
    public void testAddTagsToBook() {
        System.out.println("addTagsToBook");
        List<Tag> tags = null;
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.addTagsToBook(tags, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTagsFromBook method, of class DefaultBookManager.
     */
    @Test
    public void testRemoveTagsFromBook() {
        System.out.println("removeTagsFromBook");
        List<Tag> tags = null;
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.removeTagsFromBook(tags, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTag method, of class DefaultBookManager.
     */
    @Test
    public void testRemoveTag() {
        System.out.println("removeTag");
        Tag tag = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.removeTag(tag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReview method, of class DefaultBookManager.
     */
    @Test
    public void testAddReview() {
        System.out.println("addReview");
        BookReview review = null;
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.addReview(review, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReview method, of class DefaultBookManager.
     */
    @Test
    public void testRemoveReview() {
        System.out.println("removeReview");
        BookReview review = null;
        Book book = null;
        DefaultBookManager instance = new DefaultBookManager();
        instance.removeReview(review, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAndInsertBayesian method, of class DefaultBookManager.
     */
    @Test
    public void testCalculateAndInsertBayesian() {
        System.out.println("calculateAndInsertBayesian");
        Book book = null;
        int constant = 0;
        DefaultBookManager instance = new DefaultBookManager();
        instance.calculateAndInsertBayesian(book, constant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteBook method, of class DefaultBookManager.
     */
    @Test
    public void testUndeleteBook() {
        System.out.println("undeleteBook");
        int id = 0;
        DefaultBookManager instance = new DefaultBookManager();
        instance.undeleteBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByAllGenres method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksByAllGenres() {
        System.out.println("GetBooksByAllGenres");
        List<Genre> genres = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByAllGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByAllTags method, of class DefaultBookManager.
     */
    @Test
    public void testGetBooksByAllTags() {
        System.out.println("GetBooksByAllTags");
        List<Tag> tags = null;
        DefaultBookManager instance = new DefaultBookManager();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByAllTags(tags);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeChart method, of class DefaultBookManager.
     */
    @Test
    public void testMakeChart() {
        System.out.println("makeChart");
        DefaultBookManager instance = new DefaultBookManager();
        instance.makeChart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
