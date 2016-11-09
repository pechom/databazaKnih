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
public class MysqlUserGroupDaoTest {
    
    public MysqlUserGroupDaoTest() {
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
     * Test of getGroupById method, of class MysqlUserGroupDao.
     */
    @Test
    public void testGetGroupById() {
        System.out.println("getGroupById");
        long id = 0L;
        MysqlUserGroupDao instance = null;
        UserGroup expResult = null;
        UserGroup result = instance.getGroupById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroups method, of class MysqlUserGroupDao.
     */
    @Test
    public void testGetGroups() {
        System.out.println("getGroups");
        MysqlUserGroupDao instance = null;
        List<UserGroup> expResult = null;
        List<UserGroup> result = instance.getGroups();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
