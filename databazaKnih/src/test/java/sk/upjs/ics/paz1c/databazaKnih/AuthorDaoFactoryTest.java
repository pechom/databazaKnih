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
public class AuthorDaoFactoryTest {
    
    public AuthorDaoFactoryTest() {
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
     * Test of values method, of class AuthorDaoFactory.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        AuthorDaoFactory[] expResult = null;
        AuthorDaoFactory[] result = AuthorDaoFactory.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class AuthorDaoFactory.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        AuthorDaoFactory expResult = null;
        AuthorDaoFactory result = AuthorDaoFactory.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorDao method, of class AuthorDaoFactory.
     */
    @Test
    public void testGetAuthorDao() {
        System.out.println("getAuthorDao");
        AuthorDaoFactory instance = null;
        InterfaceAuthorDao expResult = null;
        InterfaceAuthorDao result = instance.getAuthorDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
