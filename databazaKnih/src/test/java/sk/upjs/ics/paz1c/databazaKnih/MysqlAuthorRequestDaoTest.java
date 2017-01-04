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
public class MysqlAuthorRequestDaoTest {

    private InterfaceAuthorRequestDao requestDao;

    public MysqlAuthorRequestDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        requestDao = ObjectFactory.INSTANCE.getAuthorRequestDao();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllRequests method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testGetAllRequests() {
        System.out.println("getAllRequests");
        MysqlAuthorRequestDao instance = null;
        List<AuthorRequest> expResult = null;
        List<AuthorRequest> result = instance.getAllRequests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertRequest method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testInsertRequest() {
        System.out.println("insertRequest");
        AuthorRequest request = null;
        MysqlAuthorRequestDao instance = null;
        instance.insertRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRequest method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        int id = 0;
        MysqlAuthorRequestDao instance = null;
        instance.deleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlAuthorRequestDao instance = null;
        AuthorRequest expResult = null;
        AuthorRequest result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteRequest method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testUndeleteRequest() {
        System.out.println("undeleteRequest");
        int id = 0;
        MysqlAuthorRequestDao instance = null;
        instance.undeleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRequest method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testUpdateRequest() {
        System.out.println("updateRequest");
        AuthorRequest request = null;
        MysqlAuthorRequestDao instance = null;
        instance.updateRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithRequester method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testDeleteAllWithRequester() {
        System.out.println("deleteAllWithRequester");
        int iduser = 0;
        MysqlAuthorRequestDao instance = null;
        instance.deleteAllWithRequester(iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithAuthor method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testDeleteAllWithAuthor() {
        System.out.println("deleteAllWithAuthor");
        int idauthor = 0;
        MysqlAuthorRequestDao instance = null;
        instance.deleteAllWithAuthor(idauthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
