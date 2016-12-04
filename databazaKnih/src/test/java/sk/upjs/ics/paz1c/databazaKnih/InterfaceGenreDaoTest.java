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
public class InterfaceGenreDaoTest {
    
    public InterfaceGenreDaoTest() {
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
     * Test of getAllGenre method, of class InterfaceGenreDao.
     */
    @Test
    public void testGetAllGenre() {
        System.out.println("getAllGenre");
        InterfaceGenreDao instance = new InterfaceGenreDaoImpl();
        List<Genre> expResult = null;
        List<Genre> result = instance.getAllGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertGenre method, of class InterfaceGenreDao.
     */
    @Test
    public void testInsertGenre() {
        System.out.println("insertGenre");
        Genre genre = null;
        InterfaceGenreDao instance = new InterfaceGenreDaoImpl();
        instance.insertGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteGenre method, of class InterfaceGenreDao.
     */
    @Test
    public void testDeleteGenre() {
        System.out.println("deleteGenre");
        int id = 0;
        InterfaceGenreDao instance = new InterfaceGenreDaoImpl();
        instance.deleteGenre(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteGenre method, of class InterfaceGenreDao.
     */
    @Test
    public void testUndeleteGenre() {
        System.out.println("undeleteGenre");
        int id = 0;
        InterfaceGenreDao instance = new InterfaceGenreDaoImpl();
        instance.undeleteGenre(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGenre method, of class InterfaceGenreDao.
     */
    @Test
    public void testUpdateGenre() {
        System.out.println("updateGenre");
        Genre genre = null;
        InterfaceGenreDao instance = new InterfaceGenreDaoImpl();
        instance.updateGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class InterfaceGenreDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        InterfaceGenreDao instance = new InterfaceGenreDaoImpl();
        Genre expResult = null;
        Genre result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfaceGenreDaoImpl implements InterfaceGenreDao {

        public List<Genre> getAllGenre() {
            return null;
        }

        public void insertGenre(Genre genre) {
        }

        public void deleteGenre(int id) {
        }

        public void undeleteGenre(int id) {
        }

        public void updateGenre(Genre genre) {
        }

        public Genre findById(int id) {
            return null;
        }
    }
    
}
