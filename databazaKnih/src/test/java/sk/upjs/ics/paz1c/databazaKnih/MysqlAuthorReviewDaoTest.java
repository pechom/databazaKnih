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
public class MysqlAuthorReviewDaoTest {
    
    private InterfaceAuthorReviewDao authorReviewDao;
    
    public MysqlAuthorReviewDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        authorReviewDao = ObjectFactory.INSTANCE.getAuthorReviewDao();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllReviews method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        MysqlAuthorReviewDao instance = null;
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        AuthorReview review = null;
        MysqlAuthorReviewDao instance = null;
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        MysqlAuthorReviewDao instance = null;
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        AuthorReview review = null;
        MysqlAuthorReviewDao instance = null;
        instance.updateReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlAuthorReviewDao instance = null;
        AuthorReview expResult = null;
        AuthorReview result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteReview method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testUndeleteReview() {
        System.out.println("undeleteReview");
        int id = 0;
        MysqlAuthorReviewDao instance = null;
        instance.undeleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithAuthor method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testDeleteReviewsWithAuthor() {
        System.out.println("deleteReviewsWithAuthor");
        int idauthor = 0;
        MysqlAuthorReviewDao instance = null;
        instance.deleteReviewsWithAuthor(idauthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReviewsWithUser method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testDeleteReviewsWithUser() {
        System.out.println("deleteReviewsWithUser");
        int iduser = 0;
        MysqlAuthorReviewDao instance = null;
        instance.deleteReviewsWithUser(iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
