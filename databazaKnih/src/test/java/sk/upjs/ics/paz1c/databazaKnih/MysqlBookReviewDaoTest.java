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
public class MysqlBookReviewDaoTest {
    
    public MysqlBookReviewDaoTest() {
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
     * Test of getAllReviews method, of class MysqlBookReviewDao.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        MysqlBookReviewDao instance = null;
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class MysqlBookReviewDao.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        BookReview review = null;
        MysqlBookReviewDao instance = null;
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class MysqlBookReviewDao.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        MysqlBookReviewDao instance = null;
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class MysqlBookReviewDao.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        int id = 0;
        MysqlBookReviewDao instance = null;
        instance.updateReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
