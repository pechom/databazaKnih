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
public class TagTest {
    
    public TagTest() {
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
     * Test of getName method, of class Tag.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Tag instance = new Tag();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Tag.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Tag instance = new Tag();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksWithTag method, of class Tag.
     */
    @Test
    public void testGetBooksWithTag() {
        System.out.println("getBooksWithTag");
        Tag instance = new Tag();
        List<Book> expResult = null;
        List<Book> result = instance.getBooksWithTag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBooksWithTag method, of class Tag.
     */
    @Test
    public void testSetBooksWithTag() {
        System.out.println("setBooksWithTag");
        List<Book> booksWithTag = null;
        Tag instance = new Tag();
        instance.setBooksWithTag(booksWithTag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Tag.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Tag instance = new Tag();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Tag.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Tag instance = new Tag();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStav method, of class Tag.
     */
    @Test
    public void testIsStav() {
        System.out.println("isStav");
        Tag instance = new Tag();
        boolean expResult = false;
        boolean result = instance.isStav();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStav method, of class Tag.
     */
    @Test
    public void testSetStav() {
        System.out.println("setStav");
        boolean stav = false;
        Tag instance = new Tag();
        instance.setStav(stav);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
