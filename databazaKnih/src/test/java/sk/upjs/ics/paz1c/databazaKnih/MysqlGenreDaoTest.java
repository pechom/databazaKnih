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
public class MysqlGenreDaoTest {

    private InterfaceGenreDao genreDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlGenreDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        genreDao = ObjectFactoryNaTesty.INSTANCE.getGenreDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testGetAllGenre() {
        System.out.println("getAllGenre");
        MysqlGenreDao instance = null;
        List<Genre> expResult = null;
        List<Genre> result = instance.getAllGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testInsertGenre() {
        System.out.println("insertGenre");
        Genre genre = null;
        MysqlGenreDao instance = null;
        instance.insertGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testDeleteGenre() {
        System.out.println("deleteGenre");
        int id = 0;
        MysqlGenreDao instance = null;
        instance.deleteGenre(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testUpdateGenre() {
        System.out.println("updateGenre");
        Genre genre = null;
        MysqlGenreDao instance = null;
        instance.updateGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlGenreDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlGenreDao instance = null;
        Genre expResult = null;
        Genre result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of addBookToGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testAddBookToGenre() {
        System.out.println("addBookToGenre");
        int idbook = 0;
        int idgenre = 0;
        MysqlGenreDao instance = null;
        instance.addBookToGenre(idbook, idgenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveBookFromGenre() {
        System.out.println("removeBookFromGenre");
        int idbook = 0;
        int idgenre = 0;
        MysqlGenreDao instance = null;
        instance.removeBookFromGenre(idbook, idgenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        int idbook = 0;
        MysqlGenreDao instance = null;
        instance.removeBook(idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorToGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testAddAuthorToGenre() {
        System.out.println("addAuthorToGenre");
        int idauthor = 0;
        int idgenre = 0;
        MysqlGenreDao instance = null;
        instance.addAuthorToGenre(idauthor, idgenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveAuthorFromGenre() {
        System.out.println("removeAuthorFromGenre");
        int idauthor = 0;
        int idgenre = 0;
        MysqlGenreDao instance = null;
        instance.removeAuthorFromGenre(idauthor, idgenre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        int idauthor = 0;
        MysqlGenreDao instance = null;
        instance.removeAuthor(idauthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
