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
public class InterfaceUserDaoTest {
    
    public InterfaceUserDaoTest() {
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
     * Test of getAllUsers method, of class InterfaceUserDao.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        InterfaceUserDao instance = new InterfaceUserDaoImpl();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class InterfaceUserDao.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User user = null;
        InterfaceUserDao instance = new InterfaceUserDaoImpl();
        instance.insertUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class InterfaceUserDao.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int id = 0;
        InterfaceUserDao instance = new InterfaceUserDaoImpl();
        instance.deleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class InterfaceUserDao.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        int id = 0;
        InterfaceUserDao instance = new InterfaceUserDaoImpl();
        instance.updateUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfaceUserDaoImpl implements InterfaceUserDao {

        public List<User> getAllUsers() {
            return null;
        }

        public void insertUser(User user) {
        }

        public void deleteUser(int id) {
        }

        public void updateUser(int id) {
        }
    }
    
}
