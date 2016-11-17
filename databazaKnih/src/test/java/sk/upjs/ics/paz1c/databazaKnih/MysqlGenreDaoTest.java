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
public class MysqlGenreDaoTest {
    
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
        int id = 0;
        MysqlGenreDao instance = null;
        instance.updateGenre(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
