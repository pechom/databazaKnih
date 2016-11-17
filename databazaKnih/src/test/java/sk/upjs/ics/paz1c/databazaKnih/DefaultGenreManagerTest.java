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
public class DefaultGenreManagerTest {
    
    public DefaultGenreManagerTest() {
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
     * Test of getAllGenre method, of class DefaultGenreManager.
     */
    @Test
    public void testGetAllGenre() {
        System.out.println("getAllGenre");
        DefaultGenreManager instance = new DefaultGenreManager();
        List<Genre> expResult = null;
        List<Genre> result = instance.getAllGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertGenre method, of class DefaultGenreManager.
     */
    @Test
    public void testInsertGenre() {
        System.out.println("insertGenre");
        Genre genre = null;
        DefaultGenreManager instance = new DefaultGenreManager();
        instance.insertGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteGenre method, of class DefaultGenreManager.
     */
    @Test
    public void testDeleteGenre() {
        System.out.println("deleteGenre");
        int id = 0;
        DefaultGenreManager instance = new DefaultGenreManager();
        instance.deleteGenre(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGenre method, of class DefaultGenreManager.
     */
    @Test
    public void testUpdateGenre() {
        System.out.println("updateGenre");
        int id = 0;
        DefaultGenreManager instance = new DefaultGenreManager();
        instance.updateGenre(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
