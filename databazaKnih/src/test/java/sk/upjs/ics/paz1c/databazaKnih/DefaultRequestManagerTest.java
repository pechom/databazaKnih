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

    /**
     * Test of findById method, of class DefaultRequestManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        DefaultRequestManager instance = new DefaultRequestManager();
        Request expResult = null;
        Request result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRequest method, of class DefaultRequestManager.
     */
    @Test
    public void testUpdateRequest() {
        System.out.println("updateRequest");
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.updateRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsByRequester method, of class DefaultRequestManager.
     */
    @Test
    public void testGetRequestsByRequester() {
        System.out.println("getRequestsByRequester");
        User user = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsByRequester(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsByAuthor method, of class DefaultRequestManager.
     */
    @Test
    public void testGetRequestsByAuthor() {
        System.out.println("getRequestsByAuthor");
        Author author = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsByAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsByBook method, of class DefaultRequestManager.
     */
    @Test
    public void testGetRequestsByBook() {
        System.out.println("getRequestsByBook");
        Book book = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsByBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsWhereAuthorIsNull method, of class DefaultRequestManager.
     */
    @Test
    public void testGetRequestsWhereAuthorIsNull() {
        System.out.println("getRequestsWhereAuthorIsNull");
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsWhereAuthorIsNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsWhereBookIsNull method, of class DefaultRequestManager.
     */
    @Test
    public void testGetRequestsWhereBookIsNull() {
        System.out.println("getRequestsWhereBookIsNull");
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsWhereBookIsNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsWhereBothAreNull method, of class DefaultRequestManager.
     */
    @Test
    public void testGetRequestsWhereBothAreNull() {
        System.out.println("getRequestsWhereBothAreNull");
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsWhereBothAreNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRequester method, of class DefaultRequestManager.
     */
    @Test
    public void testAddRequester() {
        System.out.println("addRequester");
        User user = null;
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.addRequester(user, request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRequesterFromRequest method, of class DefaultRequestManager.
     */
    @Test
    public void testRemoveRequesterFromRequest() {
        System.out.println("removeRequesterFromRequest");
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.removeRequesterFromRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRequester method, of class DefaultRequestManager.
     */
    @Test
    public void testRemoveRequester() {
        System.out.println("removeRequester");
        User user = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.removeRequester(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithRequester method, of class DefaultRequestManager.
     */
    @Test
    public void testDeleteAllWithRequester() {
        System.out.println("deleteAllWithRequester");
        User user = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.deleteAllWithRequester(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class DefaultRequestManager.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.addBook(book, request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromRequest method, of class DefaultRequestManager.
     */
    @Test
    public void testRemoveBookFromRequest() {
        System.out.println("removeBookFromRequest");
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.removeBookFromRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class DefaultRequestManager.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Book book = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.removeBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithBook method, of class DefaultRequestManager.
     */
    @Test
    public void testDeleteAllWithBook() {
        System.out.println("deleteAllWithBook");
        Book book = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.deleteAllWithBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthor method, of class DefaultRequestManager.
     */
    @Test
    public void testAddAuthor() {
        System.out.println("addAuthor");
        Author author = null;
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.addAuthor(author, request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromRequest method, of class DefaultRequestManager.
     */
    @Test
    public void testRemoveAuthorFromRequest() {
        System.out.println("removeAuthorFromRequest");
        Request request = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.removeAuthorFromRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuhor method, of class DefaultRequestManager.
     */
    @Test
    public void testRemoveAuhor() {
        System.out.println("removeAuhor");
        Author author = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.removeAuhor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithAuthor method, of class DefaultRequestManager.
     */
    @Test
    public void testDeleteAllWithAuthor() {
        System.out.println("deleteAllWithAuthor");
        Author author = null;
        DefaultRequestManager instance = new DefaultRequestManager();
        List<Request> expResult = null;
        List<Request> result = instance.deleteAllWithAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteRequest method, of class DefaultRequestManager.
     */
    @Test
    public void testUndeleteRequest() {
        System.out.println("undeleteRequest");
        int id = 0;
        DefaultRequestManager instance = new DefaultRequestManager();
        instance.undeleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
