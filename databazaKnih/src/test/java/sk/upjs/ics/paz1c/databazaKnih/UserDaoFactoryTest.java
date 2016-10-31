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
public class UserDaoFactoryTest {
    
    public UserDaoFactoryTest() {
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
     * Test of values method, of class UserDaoFactory.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        UserDaoFactory[] expResult = null;
        UserDaoFactory[] result = UserDaoFactory.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class UserDaoFactory.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        UserDaoFactory expResult = null;
        UserDaoFactory result = UserDaoFactory.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDao method, of class UserDaoFactory.
     */
    @Test
    public void testGetUserDao() {
        System.out.println("getUserDao");
        UserDaoFactory instance = null;
        InterfaceUserDao expResult = null;
        InterfaceUserDao result = instance.getUserDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
