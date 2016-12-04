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
public class InterfaceBookReviewDaoTest {
    
    public InterfaceBookReviewDaoTest() {
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
     * Test of getAllReviews method, of class InterfaceBookReviewDao.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        InterfaceBookReviewDao instance = new InterfaceBookReviewDaoImpl();
        List<BookReview> expResult = null;
        List<BookReview> result = instance.getAllReviews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertReview method, of class InterfaceBookReviewDao.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        BookReview review = null;
        InterfaceBookReviewDao instance = new InterfaceBookReviewDaoImpl();
        instance.insertReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReview method, of class InterfaceBookReviewDao.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        int id = 0;
        InterfaceBookReviewDao instance = new InterfaceBookReviewDaoImpl();
        instance.deleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteReview method, of class InterfaceBookReviewDao.
     */
    @Test
    public void testUndeleteReview() {
        System.out.println("undeleteReview");
        int id = 0;
        InterfaceBookReviewDao instance = new InterfaceBookReviewDaoImpl();
        instance.undeleteReview(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReview method, of class InterfaceBookReviewDao.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        BookReview review = null;
        InterfaceBookReviewDao instance = new InterfaceBookReviewDaoImpl();
        instance.updateReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class InterfaceBookReviewDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        InterfaceBookReviewDao instance = new InterfaceBookReviewDaoImpl();
        BookReview expResult = null;
        BookReview result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfaceBookReviewDaoImpl implements InterfaceBookReviewDao {

        public List<BookReview> getAllReviews() {
            return null;
        }

        public void insertReview(BookReview review) {
        }

        public void deleteReview(int id) {
        }

        public void undeleteReview(int id) {
        }

        public void updateReview(BookReview review) {
        }

        public BookReview findById(int id) {
            return null;
        }
    }
    
}
