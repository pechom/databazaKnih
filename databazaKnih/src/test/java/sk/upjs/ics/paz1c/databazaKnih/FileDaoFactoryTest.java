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
public class FileDaoFactoryTest {
    
    public FileDaoFactoryTest() {
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
     * Test of values method, of class FileDaoFactory.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        FileDaoFactory[] expResult = null;
        FileDaoFactory[] result = FileDaoFactory.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class FileDaoFactory.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        FileDaoFactory expResult = null;
        FileDaoFactory result = FileDaoFactory.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDao method, of class FileDaoFactory.
     */
    @Test
    public void testGetUserDao() {
        System.out.println("getUserDao");
        FileDaoFactory instance = null;
        InterfaceUserDao expResult = null;
        InterfaceUserDao result = instance.getUserDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookDao method, of class FileDaoFactory.
     */
    @Test
    public void testGetBookDao() {
        System.out.println("getBookDao");
        FileDaoFactory instance = null;
        InterfaceBookDao expResult = null;
        InterfaceBookDao result = instance.getBookDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorDao method, of class FileDaoFactory.
     */
    @Test
    public void testGetAuthorDao() {
        System.out.println("getAuthorDao");
        FileDaoFactory instance = null;
        InterfaceAuthorDao expResult = null;
        InterfaceAuthorDao result = instance.getAuthorDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserGroupDao method, of class FileDaoFactory.
     */
    @Test
    public void testGetUserGroupDao() {
        System.out.println("getUserGroupDao");
        FileDaoFactory instance = null;
        InterfaceUserGroupDao expResult = null;
        InterfaceUserGroupDao result = instance.getUserGroupDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
