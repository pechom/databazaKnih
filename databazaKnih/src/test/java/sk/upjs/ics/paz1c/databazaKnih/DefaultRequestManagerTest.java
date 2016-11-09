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
public class DefaultRequestManagerTest {
    
    public DefaultRequestManagerTest() {
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
     * Test of getAllRequests method, of class DefaultRequestManager.
     */
    @Test
    public void testGetAllRequests() {
        System.out.println("getAllRequests");
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.getAllRequests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertRequest method, of class DefaultRequestManager.
     */
    @Test
    public void testInsertRequest() {
        System.out.println("insertRequest");
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.insertRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRequest method, of class DefaultRequestManager.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        int id = 0;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.deleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
