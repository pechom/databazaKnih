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
public class BookManagerTest {
    
    public BookManagerTest() {
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
     * Test of getAllBooks method, of class BookManager.
     */
    @Test
    public void testGetAllBooks() {
        System.out.println("getAllBooks");
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getAllBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerificatedBooks method, of class BookManager.
     */
    @Test
    public void testGetVerificatedBooks() {
        System.out.println("getVerificatedBooks");
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getVerificatedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotVerificatedBooks method, of class BookManager.
     */
    @Test
    public void testGetNotVerificatedBooks() {
        System.out.println("getNotVerificatedBooks");
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getNotVerificatedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByName method, of class BookManager.
     */
    @Test
    public void testGetBooksByName() {
        System.out.println("GetBooksByName");
        String name = "";
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByAuthor method, of class BookManager.
     */
    @Test
    public void testGetBooksByAuthor() {
        System.out.println("GetBooksByAuthor");
        Author author = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromYear method, of class BookManager.
     */
    @Test
    public void testGetBooksFromYear() {
        System.out.println("getBooksFromYear");
        int year = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromYear(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToYear method, of class BookManager.
     */
    @Test
    public void testGetBooksToYear() {
        System.out.println("getBooksToYear");
        int year = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToYear(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToYear method, of class BookManager.
     */
    @Test
    public void testGetBooksFromToYear() {
        System.out.println("getBooksFromToYear");
        int from = 0;
        int to = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToYear(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByGenres method, of class BookManager.
     */
    @Test
    public void testGetBooksByGenres() {
        System.out.println("GetBooksByGenres");
        List<Genre> genres = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByAllGenres method, of class BookManager.
     */
    @Test
    public void testGetBooksByAllGenres() {
        System.out.println("GetBooksByAllGenres");
        List<Genre> genres = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByAllGenres(genres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromPages method, of class BookManager.
     */
    @Test
    public void testGetBooksFromPages() {
        System.out.println("getBooksFromPages");
        int pages = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromPages(pages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToPages method, of class BookManager.
     */
    @Test
    public void testGetBooksToPages() {
        System.out.println("getBooksToPages");
        int pages = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToPages(pages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToPages method, of class BookManager.
     */
    @Test
    public void testGetBooksFromToPages() {
        System.out.println("getBooksFromToPages");
        int from = 0;
        int to = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToPages(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookByISBN method, of class BookManager.
     */
    @Test
    public void testGetBookByISBN() {
        System.out.println("getBookByISBN");
        int ISBN = 0;
        BookManager instance = new BookManagerImpl();
        Book expResult = null;
        Book result = instance.getBookByISBN(ISBN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByTags method, of class BookManager.
     */
    @Test
    public void testGetBooksByTags() {
        System.out.println("GetBooksByTags");
        List<Tag> tags = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByTags(tags);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksByAllTags method, of class BookManager.
     */
    @Test
    public void testGetBooksByAllTags() {
        System.out.println("GetBooksByAllTags");
        List<Tag> tags = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksByAllTags(tags);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBooksFromReviews method, of class BookManager.
     */
    @Test
    public void testGetBooksFromReviews() {
        System.out.println("GetBooksFromReviews");
        int numberOfReviews = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.GetBooksFromReviews(numberOfReviews);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromAverage method, of class BookManager.
     */
    @Test
    public void testGetBooksFromAverage() {
        System.out.println("getBooksFromAverage");
        int average = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromAverage(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToAverage method, of class BookManager.
     */
    @Test
    public void testGetBooksToAverage() {
        System.out.println("getBooksToAverage");
        int average = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToAverage(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToAverage method, of class BookManager.
     */
    @Test
    public void testGetBooksFromToAverage() {
        System.out.println("getBooksFromToAverage");
        int from = 0;
        int to = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToAverage(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromChart method, of class BookManager.
     */
    @Test
    public void testGetBooksFromChart() {
        System.out.println("getBooksFromChart");
        int chart = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromChart(chart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToChart method, of class BookManager.
     */
    @Test
    public void testGetBooksToChart() {
        System.out.println("getBooksToChart");
        int chart = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToChart(chart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToChart method, of class BookManager.
     */
    @Test
    public void testGetBooksFromToChart() {
        System.out.println("getBooksFromToChart");
        int from = 0;
        int to = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToChart(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromBayesian method, of class BookManager.
     */
    @Test
    public void testGetBooksFromBayesian() {
        System.out.println("getBooksFromBayesian");
        int average = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromBayesian(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksToBayesian method, of class BookManager.
     */
    @Test
    public void testGetBooksToBayesian() {
        System.out.println("getBooksToBayesian");
        int average = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksToBayesian(average);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksFromToBayesian method, of class BookManager.
     */
    @Test
    public void testGetBooksFromToBayesian() {
        System.out.println("getBooksFromToBayesian");
        int from = 0;
        int to = 0;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksFromToBayesian(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeChart method, of class BookManager.
     */
    @Test
    public void testMakeChart() {
        System.out.println("makeChart");
        BookManager instance = new BookManagerImpl();
        instance.makeChart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorToBook method, of class BookManager.
     */
    @Test
    public void testAddAuthorToBook() {
        System.out.println("addAuthorToBook");
        Book book = null;
        Author author = null;
        BookManager instance = new BookManagerImpl();
        instance.addAuthorToBook(book, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromBook method, of class BookManager.
     */
    @Test
    public void testRemoveAuthorFromBook() {
        System.out.println("removeAuthorFromBook");
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.removeAuthorFromBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class BookManager.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Author author = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.removeAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGenresToBook method, of class BookManager.
     */
    @Test
    public void testAddGenresToBook() {
        System.out.println("addGenresToBook");
        List<Genre> genres = null;
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.addGenresToBook(genres, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenresFromBook method, of class BookManager.
     */
    @Test
    public void testRemoveGenresFromBook() {
        System.out.println("removeGenresFromBook");
        List<Genre> genres = null;
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.removeGenresFromBook(genres, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenre method, of class BookManager.
     */
    @Test
    public void testRemoveGenre() {
        System.out.println("removeGenre");
        Genre genre = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.removeGenre(genre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTagsToBook method, of class BookManager.
     */
    @Test
    public void testAddTagsToBook() {
        System.out.println("addTagsToBook");
        List<Tag> tags = null;
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.addTagsToBook(tags, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTagsFromBook method, of class BookManager.
     */
    @Test
    public void testRemoveTagsFromBook() {
        System.out.println("removeTagsFromBook");
        List<Tag> tags = null;
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.removeTagsFromBook(tags, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTag method, of class BookManager.
     */
    @Test
    public void testRemoveTag() {
        System.out.println("removeTag");
        Tag tag = null;
        BookManager instance = new BookManagerImpl();
        List<Book> expResult = null;
        List<Book> result = instance.removeTag(tag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReview method, of class BookManager.
     */
    @Test
    public void testAddReview() {
        System.out.println("addReview");
        BookReview review = null;
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.addReview(review, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReview method, of class BookManager.
     */
    @Test
    public void testRemoveReview() {
        System.out.println("removeReview");
        BookReview review = null;
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.removeReview(review, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAndInsertBayesian method, of class BookManager.
     */
    @Test
    public void testCalculateAndInsertBayesian() {
        System.out.println("calculateAndInsertBayesian");
        Book book = null;
        int constant = 0;
        BookManager instance = new BookManagerImpl();
        instance.calculateAndInsertBayesian(book, constant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertBook method, of class BookManager.
     */
    @Test
    public void testInsertBook() {
        System.out.println("insertBook");
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.insertBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class BookManager.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        int id = 0;
        BookManager instance = new BookManagerImpl();
        instance.deleteBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteBook method, of class BookManager.
     */
    @Test
    public void testUndeleteBook() {
        System.out.println("undeleteBook");
        int id = 0;
        BookManager instance = new BookManagerImpl();
        instance.undeleteBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class BookManager.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Book book = null;
        BookManager instance = new BookManagerImpl();
        instance.updateBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class BookManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        BookManager instance = new BookManagerImpl();
        Book expResult = null;
        Book result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BookManagerImpl implements BookManager {

        public List<Book> getAllBooks() {
            return null;
        }

        public List<Book> getVerificatedBooks() {
            return null;
        }

        public List<Book> getNotVerificatedBooks() {
            return null;
        }

        public List<Book> GetBooksByName(String name) {
            return null;
        }

        public List<Book> GetBooksByAuthor(Author author) {
            return null;
        }

        public List<Book> getBooksFromYear(int year) {
            return null;
        }

        public List<Book> getBooksToYear(int year) {
            return null;
        }

        public List<Book> getBooksFromToYear(int from, int to) {
            return null;
        }

        public List<Book> GetBooksByGenres(List<Genre> genres) {
            return null;
        }

        public List<Book> GetBooksByAllGenres(List<Genre> genres) {
            return null;
        }

        public List<Book> getBooksFromPages(int pages) {
            return null;
        }

        public List<Book> getBooksToPages(int pages) {
            return null;
        }

        public List<Book> getBooksFromToPages(int from, int to) {
            return null;
        }

        public Book getBookByISBN(int ISBN) {
            return null;
        }

        public List<Book> GetBooksByTags(List<Tag> tags) {
            return null;
        }

        public List<Book> GetBooksByAllTags(List<Tag> tags) {
            return null;
        }

        public List<Book> GetBooksFromReviews(int numberOfReviews) {
            return null;
        }

        public List<Book> getBooksFromAverage(int average) {
            return null;
        }

        public List<Book> getBooksToAverage(int average) {
            return null;
        }

        public List<Book> getBooksFromToAverage(int from, int to) {
            return null;
        }

        public List<Book> getBooksFromChart(int chart) {
            return null;
        }

        public List<Book> getBooksToChart(int chart) {
            return null;
        }

        public List<Book> getBooksFromToChart(int from, int to) {
            return null;
        }

        public List<Book> getBooksFromBayesian(int average) {
            return null;
        }

        public List<Book> getBooksToBayesian(int average) {
            return null;
        }

        public List<Book> getBooksFromToBayesian(int from, int to) {
            return null;
        }

        public void makeChart() {
        }

        public void addAuthorToBook(Book book, Author author) {
        }

        public void removeAuthorFromBook(Book book) {
        }

        public List<Book> removeAuthor(Author author) {
            return null;
        }

        public void addGenresToBook(List<Genre> genres, Book book) {
        }

        public void removeGenresFromBook(List<Genre> genres, Book book) {
        }

        public List<Book> removeGenre(Genre genre) {
            return null;
        }

        public void addTagsToBook(List<Tag> tags, Book book) {
        }

        public void removeTagsFromBook(List<Tag> tags, Book book) {
        }

        public List<Book> removeTag(Tag tag) {
            return null;
        }

        public void addReview(BookReview review, Book book) {
        }

        public void removeReview(BookReview review, Book book) {
        }

        public void calculateAndInsertBayesian(Book book, int constant) {
        }

        public void insertBook(Book book) {
        }

        public void deleteBook(int id) {
        }

        public void undeleteBook(int id) {
        }

        public void updateBook(Book book) {
        }

        public Book findById(int id) {
            return null;
        }
    }
    
}
