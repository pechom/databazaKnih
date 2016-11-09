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
public class InterfaceAuthorReviewDaoTest {
    
    public InterfaceAuthorReviewDaoTest() {
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
     * Test of getAllReviews method, of class InterfaceAuthorReviewDao.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        InterfaceAuthorReviewDao instance = new InterfaceAuthorReviewDaoImpl();
        List<AuthorReview> expResult = null;
        List<AuthorReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class InterfaceAuthorReviewDao.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        AuthorReview review = null;
        InterfaceAuthorReviewDao instance = new InterfaceAuthorReviewDaoImpl();
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class InterfaceAuthorReviewDao.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        InterfaceAuthorReviewDao instance = new InterfaceAuthorReviewDaoImpl();
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class InterfaceAuthorReviewDao.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        int id = 0;
        InterfaceAuthorReviewDao instance = new InterfaceAuthorReviewDaoImpl();
        instance.updateReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfaceAuthorReviewDaoImpl implements InterfaceAuthorReviewDao {

        public List<AuthorReview> getAllReviews() {
            return null;
        }

        public void insertReview(AuthorReview review) {
        }

        public void deleteReview(int id) {
        }

        public void updateReview(int id) {
        }
    }
    
}
