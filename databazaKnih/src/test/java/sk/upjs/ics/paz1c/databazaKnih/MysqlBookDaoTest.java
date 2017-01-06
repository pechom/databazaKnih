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
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Peťo Chomič
 */
public class MysqlBookDaoTest {

    private InterfaceBookDao bookDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlBookDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllBooks method, of class MysqlBookDao.
     */
    @Test
    public void testGetAllBooks() {
        System.out.println("getAllBooks");
        MysqlBookDao instance = null;
        List<Book> expResult = null;
        List<Book> result = instance.getAllBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertBook method, of class MysqlBookDao.
     */
    @Test
    public void testInsertBook() {
        System.out.println("insertBook");
        Book book = null;
        MysqlBookDao instance = null;
        instance.insertBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class MysqlBookDao.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        int id = 0;
        MysqlBookDao instance = null;
        instance.deleteBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class MysqlBookDao.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Book book = null;
        MysqlBookDao instance = null;
        instance.updateBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlBookDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlBookDao instance = null;
        Book expResult = null;
        Book result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteBook method, of class MysqlBookDao.
     */
    @Test
    public void testUndeleteBook() {
        System.out.println("undeleteBook");
        int id = 0;
        MysqlBookDao instance = null;
        instance.undeleteBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorToBook method, of class MysqlBookDao.
     */
    @Test
    public void testAddAuthorToBook() {
        System.out.println("addAuthorToBook");
        int idauthor = 0;
        int idbook = 0;
        MysqlBookDao instance = null;
        instance.addAuthorToBook(idauthor, idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveAuthorFromBook() {
        System.out.println("removeAuthorFromBook");
        int idbook = 0;
        MysqlBookDao instance = null;
        instance.removeAuthorFromBook(idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        int idauthor = 0;
        MysqlBookDao instance = null;
        instance.removeAuthor(idauthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGenreToBook method, of class MysqlBookDao.
     */
    @Test
    public void testAddGenreToBook() {
        System.out.println("addGenreToBook");
        int idgenre = 0;
        int idbook = 0;
        MysqlBookDao instance = null;
        instance.addGenreToBook(idgenre, idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenreFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveGenreFromBook() {
        System.out.println("removeGenreFromBook");
        int idgenre = 0;
        int idbook = 0;
        MysqlBookDao instance = null;
        instance.removeGenreFromBook(idgenre, idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenre method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveGenre() {
        System.out.println("removeGenre");
        int idgenre = 0;
        MysqlBookDao instance = null;
        instance.removeGenre(idgenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTagToBook method, of class MysqlBookDao.
     */
    @Test
    public void testAddTagToBook() {
        System.out.println("addTagToBook");
        int idtag = 0;
        int idbook = 0;
        MysqlBookDao instance = null;
        instance.addTagToBook(idtag, idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTagFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveTagFromBook() {
        System.out.println("removeTagFromBook");
        int idtag = 0;
        int idbook = 0;
        MysqlBookDao instance = null;
        instance.removeTagFromBook(idtag, idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTag method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveTag() {
        System.out.println("removeTag");
        int idtag = 0;
        MysqlBookDao instance = null;
        instance.removeTag(idtag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReviewToBook method, of class MysqlBookDao.
     */
    @Test
    public void testAddReviewToBook() {
        System.out.println("addReviewToBook");
        int idreview = 0;
        Book book = null;
        MysqlBookDao instance = null;
        instance.addReviewToBook(idreview, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReviewFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveReviewFromBook() {
        System.out.println("removeReviewFromBook");
        int idreview = 0;
        Book book = null;
        MysqlBookDao instance = null;
        instance.removeReviewFromBook(idreview, book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReviewsFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveReviewsFromBook() {
        System.out.println("removeReviewsFromBook");
        int idbook = 0;
        MysqlBookDao instance = null;
        instance.removeReviewsFromBook(idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
