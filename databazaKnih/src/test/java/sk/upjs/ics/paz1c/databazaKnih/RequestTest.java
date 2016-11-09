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
public class RequestTest {
    
    public RequestTest() {
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
     * Test of getRequester method, of class Request.
     */
    @Test
    public void testGetRequester() {
        System.out.println("getRequester");
        Request instance = new Request();
        User expResult = null;
        User result = instance.getRequester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequester method, of class Request.
     */
    @Test
    public void testSetRequester() {
        System.out.println("setRequester");
        User requester = null;
        Request instance = new Request();
        instance.setRequester(requester);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContent method, of class Request.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Request instance = new Request();
        String expResult = "";
        String result = instance.getContent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContent method, of class Request.
     */
    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "";
        Request instance = new Request();
        instance.setContent(content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBook method, of class Request.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        Request instance = new Request();
        Book expResult = null;
        Book result = instance.getBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBook method, of class Request.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        Book book = null;
        Request instance = new Request();
        instance.setBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Request.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Request instance = new Request();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Request.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Request instance = new Request();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class Request.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Request instance = new Request();
        Author expResult = null;
        Author result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class Request.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        Author author = null;
        Request instance = new Request();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
