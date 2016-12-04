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
public class RequestManagerTest {
    
    public RequestManagerTest() {
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
     * Test of getAllRequests method, of class RequestManager.
     */
    @Test
    public void testGetAllRequests() {
        System.out.println("getAllRequests");
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.getAllRequests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsByRequester method, of class RequestManager.
     */
    @Test
    public void testGetRequestsByRequester() {
        System.out.println("getRequestsByRequester");
        User user = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsByRequester(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsByAuthor method, of class RequestManager.
     */
    @Test
    public void testGetRequestsByAuthor() {
        System.out.println("getRequestsByAuthor");
        Author author = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsByAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsByBook method, of class RequestManager.
     */
    @Test
    public void testGetRequestsByBook() {
        System.out.println("getRequestsByBook");
        Book book = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsByBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsWhereAuthorIsNull method, of class RequestManager.
     */
    @Test
    public void testGetRequestsWhereAuthorIsNull() {
        System.out.println("getRequestsWhereAuthorIsNull");
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsWhereAuthorIsNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsWhereBookIsNull method, of class RequestManager.
     */
    @Test
    public void testGetRequestsWhereBookIsNull() {
        System.out.println("getRequestsWhereBookIsNull");
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsWhereBookIsNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestsWhereBothAreNull method, of class RequestManager.
     */
    @Test
    public void testGetRequestsWhereBothAreNull() {
        System.out.println("getRequestsWhereBothAreNull");
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.getRequestsWhereBothAreNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRequester method, of class RequestManager.
     */
    @Test
    public void testAddRequester() {
        System.out.println("addRequester");
        User user = null;
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.addRequester(user, request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRequesterFromRequest method, of class RequestManager.
     */
    @Test
    public void testRemoveRequesterFromRequest() {
        System.out.println("removeRequesterFromRequest");
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.removeRequesterFromRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRequester method, of class RequestManager.
     */
    @Test
    public void testRemoveRequester() {
        System.out.println("removeRequester");
        User user = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.removeRequester(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithRequester method, of class RequestManager.
     */
    @Test
    public void testDeleteAllWithRequester() {
        System.out.println("deleteAllWithRequester");
        User user = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.deleteAllWithRequester(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class RequestManager.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.addBook(book, request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromRequest method, of class RequestManager.
     */
    @Test
    public void testRemoveBookFromRequest() {
        System.out.println("removeBookFromRequest");
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.removeBookFromRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class RequestManager.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Book book = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.removeBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithBook method, of class RequestManager.
     */
    @Test
    public void testDeleteAllWithBook() {
        System.out.println("deleteAllWithBook");
        Book book = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.deleteAllWithBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthor method, of class RequestManager.
     */
    @Test
    public void testAddAuthor() {
        System.out.println("addAuthor");
        Author author = null;
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.addAuthor(author, request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorFromRequest method, of class RequestManager.
     */
    @Test
    public void testRemoveAuthorFromRequest() {
        System.out.println("removeAuthorFromRequest");
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.removeAuthorFromRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuhor method, of class RequestManager.
     */
    @Test
    public void testRemoveAuhor() {
        System.out.println("removeAuhor");
        Author author = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.removeAuhor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithAuthor method, of class RequestManager.
     */
    @Test
    public void testDeleteAllWithAuthor() {
        System.out.println("deleteAllWithAuthor");
        Author author = null;
        RequestManager instance = new RequestManagerImpl();
        List<Request> expResult = null;
        List<Request> result = instance.deleteAllWithAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertRequest method, of class RequestManager.
     */
    @Test
    public void testInsertRequest() {
        System.out.println("insertRequest");
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.insertRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRequest method, of class RequestManager.
     */
    @Test
    public void testUpdateRequest() {
        System.out.println("updateRequest");
        Request request = null;
        RequestManager instance = new RequestManagerImpl();
        instance.updateRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRequest method, of class RequestManager.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        int id = 0;
        RequestManager instance = new RequestManagerImpl();
        instance.deleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteRequest method, of class RequestManager.
     */
    @Test
    public void testUndeleteRequest() {
        System.out.println("undeleteRequest");
        int id = 0;
        RequestManager instance = new RequestManagerImpl();
        instance.undeleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class RequestManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        RequestManager instance = new RequestManagerImpl();
        Request expResult = null;
        Request result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RequestManagerImpl implements RequestManager {

        public List<Request> getAllRequests() {
            return null;
        }

        public List<Request> getRequestsByRequester(User user) {
            return null;
        }

        public List<Request> getRequestsByAuthor(Author author) {
            return null;
        }

        public List<Request> getRequestsByBook(Book book) {
            return null;
        }

        public List<Request> getRequestsWhereAuthorIsNull() {
            return null;
        }

        public List<Request> getRequestsWhereBookIsNull() {
            return null;
        }

        public List<Request> getRequestsWhereBothAreNull() {
            return null;
        }

        public void addRequester(User user, Request request) {
        }

        public void removeRequesterFromRequest(Request request) {
        }

        public List<Request> removeRequester(User user) {
            return null;
        }

        public List<Request> deleteAllWithRequester(User user) {
            return null;
        }

        public void addBook(Book book, Request request) {
        }

        public void removeBookFromRequest(Request request) {
        }

        public List<Request> removeBook(Book book) {
            return null;
        }

        public List<Request> deleteAllWithBook(Book book) {
            return null;
        }

        public void addAuthor(Author author, Request request) {
        }

        public void removeAuthorFromRequest(Request request) {
        }

        public List<Request> removeAuhor(Author author) {
            return null;
        }

        public List<Request> deleteAllWithAuthor(Author author) {
            return null;
        }

        public void insertRequest(Request request) {
        }

        public void updateRequest(Request request) {
        }

        public void deleteRequest(int id) {
        }

        public void undeleteRequest(int id) {
        }

        public Request findById(int id) {
            return null;
        }
    }
    
}
