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
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Peťo Chomič
 */
public class MysqlAuthorDaoTest {

    private InterfaceAuthorDao authorDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlAuthorDaoTest() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllAuthors method, of class MysqlAuthorDao.
     */
    @Test
    public void testGetAllAuthors() {
        System.out.println("getAllAuthors");
        List<Author> expResult = new ArrayList<>();
        Author jano = new Author();
        Author pali = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        pali.setName("Pali");
        pali.setIsActive(true);
        expResult.add(pali);
        expResult.add(jano);
        authorDao.insertAuthor(jano);
        authorDao.insertAuthor(pali);
        List<Author> result = authorDao.getAllAuthors();
        assertEquals(expResult.size(), result.size());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, result.get(1).getId());
    }

    /**
     * Test of insertAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testInsertAuthor() {
        System.out.println("insertAuthor");
        Author jano = new Author();
        jano.setName("Jano");
        JdbcTemplate template = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
        MysqlAuthorDao dao = new MysqlAuthorDao(template);
        //authorDao.insertAuthor(jano);
        dao.insertAuthor(jano);
        //Author author = authorDao.findById(1); // kedze je jediny v databaze musi mat id 1
        Author author = dao.findById(1);
        assertEquals(jano.getName(), author.getName());

    }

    /**
     * Test of deleteAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testDeleteAuthor() {
        // tu som skoncil
        System.out.println("deleteAuthor");
        Author jano = new Author();
        jano.setName("Jano");
        authorDao.insertAuthor(jano);
        authorDao.deleteAuthor(1);
        List<Author> autori = new ArrayList<>();

    }

    /**
     * Test of updateAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testUpdateAuthor() {
        System.out.println("updateAuthor");
        Author author = null;
        MysqlAuthorDao instance = null;
        instance.updateAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlAuthorDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlAuthorDao instance = null;
        Author expResult = null;
        Author result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testUndeleteAuthor() {
        System.out.println("undeleteAuthor");
        int id = 0;
        MysqlAuthorDao instance = null;
        instance.undeleteAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBookToAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testAddBookToAuthor() {
        System.out.println("addBookToAuthor");
        int bookid = 0;
        int authorid = 0;
        MysqlAuthorDao instance = null;
        instance.addBookToAuthor(bookid, authorid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testRemoveBookFromAuthor() {
        System.out.println("removeBookFromAuthor");
        int bookid = 0;
        int authorid = 0;
        MysqlAuthorDao instance = null;
        instance.removeBookFromAuthor(bookid, authorid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGenreToAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testAddGenreToAuthor() {
        System.out.println("addGenreToAuthor");
        int genreid = 0;
        int authorid = 0;
        MysqlAuthorDao instance = null;
        instance.addGenreToAuthor(genreid, authorid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenreFromAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testRemoveGenreFromAuthor() {
        System.out.println("removeGenreFromAuthor");
        int genreid = 0;
        int authorid = 0;
        MysqlAuthorDao instance = null;
        instance.removeGenreFromAuthor(genreid, authorid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGenre method, of class MysqlAuthorDao.
     */
    @Test
    public void testRemoveGenre() {
        System.out.println("removeGenre");
        int genreid = 0;
        MysqlAuthorDao instance = null;
        instance.removeGenre(genreid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReviews method, of class MysqlAuthorDao.
     */
    @Test
    public void testRemoveReviews() {
        System.out.println("removeReviews");
        int authorid = 0;
        MysqlAuthorDao instance = null;
        instance.removeReviews(authorid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
