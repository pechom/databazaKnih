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
public class MySQLDaoFactoryTest {
    
    public MySQLDaoFactoryTest() {
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
     * Test of values method, of class MySQLDaoFactory.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        MySQLDaoFactory[] expResult = null;
        MySQLDaoFactory[] result = MySQLDaoFactory.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class MySQLDaoFactory.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        MySQLDaoFactory expResult = null;
        MySQLDaoFactory result = MySQLDaoFactory.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetUserDao() {
        System.out.println("getUserDao");
        MySQLDaoFactory instance = null;
        InterfaceUserDao expResult = null;
        InterfaceUserDao result = instance.getUserDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetBookDao() {
        System.out.println("getBookDao");
        MySQLDaoFactory instance = null;
        InterfaceBookDao expResult = null;
        InterfaceBookDao result = instance.getBookDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetAuthorDao() {
        System.out.println("getAuthorDao");
        MySQLDaoFactory instance = null;
        InterfaceAuthorDao expResult = null;
        InterfaceAuthorDao result = instance.getAuthorDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserGroupDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetUserGroupDao() {
        System.out.println("getUserGroupDao");
        MySQLDaoFactory instance = null;
        InterfaceUserGroupDao expResult = null;
        InterfaceUserGroupDao result = instance.getUserGroupDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookReviewDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetBookReviewDao() {
        System.out.println("getBookReviewDao");
        MySQLDaoFactory instance = null;
        InterfaceBookReviewDao expResult = null;
        InterfaceBookReviewDao result = instance.getBookReviewDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorReviewDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetAuthorReviewDao() {
        System.out.println("getAuthorReviewDao");
        MySQLDaoFactory instance = null;
        InterfaceAuthorReviewDao expResult = null;
        InterfaceAuthorReviewDao result = instance.getAuthorReviewDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTagDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetTagDao() {
        System.out.println("getTagDao");
        MySQLDaoFactory instance = null;
        InterfaceTagDao expResult = null;
        InterfaceTagDao result = instance.getTagDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestDao method, of class MySQLDaoFactory.
     */
    @Test
    public void testGetRequestDao() {
        System.out.println("getRequestDao");
        MySQLDaoFactory instance = null;
        InterfaceRequestDao expResult = null;
        InterfaceRequestDao result = instance.getRequestDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
