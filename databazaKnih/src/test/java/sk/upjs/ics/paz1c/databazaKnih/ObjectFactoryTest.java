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
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Peťo Chomič
 */
public class ObjectFactoryTest {
    
    public ObjectFactoryTest() {
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
     * Test of values method, of class ObjectFactory.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ObjectFactory[] expResult = null;
        ObjectFactory[] result = ObjectFactory.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class ObjectFactory.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        ObjectFactory expResult = null;
        ObjectFactory result = ObjectFactory.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJdbcTemplate method, of class ObjectFactory.
     */
    @Test
    public void testGetJdbcTemplate() {
        System.out.println("getJdbcTemplate");
        ObjectFactory instance = null;
        JdbcTemplate expResult = null;
        JdbcTemplate result = instance.getJdbcTemplate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDao method, of class ObjectFactory.
     */
    @Test
    public void testGetUserDao() {
        System.out.println("getUserDao");
        ObjectFactory instance = null;
        InterfaceUserDao expResult = null;
        InterfaceUserDao result = instance.getUserDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookDao method, of class ObjectFactory.
     */
    @Test
    public void testGetBookDao() {
        System.out.println("getBookDao");
        ObjectFactory instance = null;
        InterfaceBookDao expResult = null;
        InterfaceBookDao result = instance.getBookDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorDao method, of class ObjectFactory.
     */
    @Test
    public void testGetAuthorDao() {
        System.out.println("getAuthorDao");
        ObjectFactory instance = null;
        InterfaceAuthorDao expResult = null;
        InterfaceAuthorDao result = instance.getAuthorDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookReviewDao method, of class ObjectFactory.
     */
    @Test
    public void testGetBookReviewDao() {
        System.out.println("getBookReviewDao");
        ObjectFactory instance = null;
        InterfaceBookReviewDao expResult = null;
        InterfaceBookReviewDao result = instance.getBookReviewDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorReviewDao method, of class ObjectFactory.
     */
    @Test
    public void testGetAuthorReviewDao() {
        System.out.println("getAuthorReviewDao");
        ObjectFactory instance = null;
        InterfaceAuthorReviewDao expResult = null;
        InterfaceAuthorReviewDao result = instance.getAuthorReviewDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTagDao method, of class ObjectFactory.
     */
    @Test
    public void testGetTagDao() {
        System.out.println("getTagDao");
        ObjectFactory instance = null;
        InterfaceTagDao expResult = null;
        InterfaceTagDao result = instance.getTagDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestDao method, of class ObjectFactory.
     */
    @Test
    public void testGetRequestDao() {
        System.out.println("getRequestDao");
        ObjectFactory instance = null;
        InterfaceRequestDao expResult = null;
        InterfaceRequestDao result = instance.getRequestDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenreDao method, of class ObjectFactory.
     */
    @Test
    public void testGetGenreDao() {
        System.out.println("getGenreDao");
        ObjectFactory instance = null;
        InterfaceGenreDao expResult = null;
        InterfaceGenreDao result = instance.getGenreDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
