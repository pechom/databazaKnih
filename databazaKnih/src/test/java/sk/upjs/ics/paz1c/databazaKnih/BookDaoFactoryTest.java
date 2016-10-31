/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

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
public class BookDaoFactoryTest {
    
    public BookDaoFactoryTest() {
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
     * Test of values method, of class BookDaoFactory.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        BookDaoFactory[] expResult = null;
        BookDaoFactory[] result = BookDaoFactory.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class BookDaoFactory.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        BookDaoFactory expResult = null;
        BookDaoFactory result = BookDaoFactory.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookDao method, of class BookDaoFactory.
     */
    @Test
    public void testGetBookDao() {
        System.out.println("getBookDao");
        BookDaoFactory instance = null;
        InterfaceBookDao expResult = null;
        InterfaceBookDao result = instance.getBookDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
