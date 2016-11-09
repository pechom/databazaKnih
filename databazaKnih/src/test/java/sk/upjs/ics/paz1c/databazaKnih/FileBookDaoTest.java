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
public class FileBookDaoTest {
    
    public FileBookDaoTest() {
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
     * Test of getAllBooks method, of class FileBookDao.
     */
    @Test
    public void testGetAllBooks() {
        System.out.println("getAllBooks");
        FileBookDao instance = new FileBookDao();
        List<Book> expResult = null;
        List<Book> result = instance.getAllBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertBook method, of class FileBookDao.
     */
    @Test
    public void testInsertBook() {
        System.out.println("insertBook");
        Book book = null;
        FileBookDao instance = new FileBookDao();
        instance.insertBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class FileBookDao.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        int id = 0;
        FileBookDao instance = new FileBookDao();
        instance.deleteBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class FileBookDao.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        int id = 0;
        FileBookDao instance = new FileBookDao();
        instance.updateBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
