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
public class UserGroupTest {
    
    public UserGroupTest() {
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
     * Test of getId method, of class UserGroup.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        UserGroup instance = new UserGroup();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class UserGroup.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        UserGroup instance = new UserGroup();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class UserGroup.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserGroup instance = new UserGroup();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class UserGroup.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        UserGroup instance = new UserGroup();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrivileges method, of class UserGroup.
     */
    @Test
    public void testGetPrivileges() {
        System.out.println("getPrivileges");
        UserGroup instance = new UserGroup();
        List<String> expResult = null;
        List<String> result = instance.getPrivileges();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrivileges method, of class UserGroup.
     */
    @Test
    public void testSetPrivileges() {
        System.out.println("setPrivileges");
        List<String> privileges = null;
        UserGroup instance = new UserGroup();
        instance.setPrivileges(privileges);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
