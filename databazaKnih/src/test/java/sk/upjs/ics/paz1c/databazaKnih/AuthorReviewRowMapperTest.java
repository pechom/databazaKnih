/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
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
public class AuthorReviewRowMapperTest {
    
    public AuthorReviewRowMapperTest() {
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
     * Test of mapRow method, of class AuthorReviewRowMapper.
     */
    @Test
    public void testMapRow() throws Exception {
        System.out.println("mapRow");
        ResultSet rs = null;
        int i = 0;
        AuthorReviewRowMapper instance = new AuthorReviewRowMapper();
        AuthorReview expResult = null;
        AuthorReview result = instance.mapRow(rs, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
