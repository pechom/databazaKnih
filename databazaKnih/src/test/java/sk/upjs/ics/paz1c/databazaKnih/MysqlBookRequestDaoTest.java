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
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Peťo Chomič
 */
public class MysqlBookRequestDaoTest {

    private InterfaceBookRequestDao bookRequestDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlBookRequestDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        bookRequestDao = ObjectFactoryNaTesty.INSTANCE.getBookRequestDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllRequests method, of class MysqlBookRequestDao.
     */
    @Test
    public void testGetAllRequests() {
        System.out.println("getAllRequests");
        MysqlBookRequestDao instance = null;
        List<BookRequest> expResult = null;
        List<BookRequest> result = instance.getAllRequests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertRequest method, of class MysqlBookRequestDao.
     */
    @Test
    public void testInsertRequest() {
        System.out.println("insertRequest");
        BookRequest request = null;
        MysqlBookRequestDao instance = null;
        instance.insertRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRequest method, of class MysqlBookRequestDao.
     */
    @Test
    public void testUpdateRequest() {
        System.out.println("updateRequest");
        BookRequest request = null;
        MysqlBookRequestDao instance = null;
        instance.updateRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRequest method, of class MysqlBookRequestDao.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        int id = 0;
        MysqlBookRequestDao instance = null;
        instance.deleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithRequester method, of class MysqlBookRequestDao.
     */
    @Test
    public void testDeleteAllWithRequester() {
        System.out.println("deleteAllWithRequester");
        int iduser = 0;
        MysqlBookRequestDao instance = null;
        instance.deleteAllWithRequester(iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllWithBook method, of class MysqlBookRequestDao.
     */
    @Test
    public void testDeleteAllWithBook() {
        System.out.println("deleteAllWithBook");
        int idbook = 0;
        MysqlBookRequestDao instance = null;
        instance.deleteAllWithBook(idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteRequest method, of class MysqlBookRequestDao.
     */
    @Test
    public void testUndeleteRequest() {
        System.out.println("undeleteRequest");
        int id = 0;
        MysqlBookRequestDao instance = null;
        instance.undeleteRequest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlBookRequestDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlBookRequestDao instance = null;
        BookRequest expResult = null;
        BookRequest result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
