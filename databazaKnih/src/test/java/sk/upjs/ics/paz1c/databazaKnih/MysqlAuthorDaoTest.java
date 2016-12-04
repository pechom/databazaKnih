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
public class MysqlAuthorDaoTest {
    
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
        MysqlAuthorDao instance = null;
        List<Author> expResult = null;
        List<Author> result = instance.getAllAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testInsertAuthor() {
        System.out.println("insertAuthor");
        Author author = null;
        MysqlAuthorDao instance = null;
        instance.insertAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthor method, of class MysqlAuthorDao.
     */
    @Test
    public void testDeleteAuthor() {
        System.out.println("deleteAuthor");
        int id = 0;
        MysqlAuthorDao instance = null;
        instance.deleteAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    
}
