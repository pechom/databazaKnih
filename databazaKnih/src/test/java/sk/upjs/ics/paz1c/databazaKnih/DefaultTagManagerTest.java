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
public class DefaultTagManagerTest {
    
    public DefaultTagManagerTest() {
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
     * Test of getAllTags method, of class DefaultTagManager.
     */
    @Test
    public void testGetAllTags() {
        System.out.println("getAllTags");
        DefaultTagManager instance = new DefaultTagManager();
        List<Tag> expResult = null;
        List<Tag> result = instance.getAllTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTag method, of class DefaultTagManager.
     */
    @Test
    public void testInsertTag() {
        System.out.println("insertTag");
        Tag tag = null;
        DefaultTagManager instance = new DefaultTagManager();
        instance.insertTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTag method, of class DefaultTagManager.
     */
    @Test
    public void testDeleteTag() {
        System.out.println("deleteTag");
        int id = 0;
        DefaultTagManager instance = new DefaultTagManager();
        instance.deleteTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTag method, of class DefaultTagManager.
     */
    @Test
    public void testUpdateTag() {
        System.out.println("updateTag");
        Tag tag = null;
        DefaultTagManager instance = new DefaultTagManager();
        instance.updateTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class DefaultTagManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        DefaultTagManager instance = new DefaultTagManager();
        Tag expResult = null;
        Tag result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTagByName method, of class DefaultTagManager.
     */
    @Test
    public void testGetTagByName() {
        System.out.println("getTagByName");
        String name = "";
        DefaultTagManager instance = new DefaultTagManager();
        Tag expResult = null;
        Tag result = instance.getTagByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBooksToTag method, of class DefaultTagManager.
     */
    @Test
    public void testAddBooksToTag() {
        System.out.println("addBooksToTag");
        List<Book> books = null;
        Tag tag = null;
        DefaultTagManager instance = new DefaultTagManager();
        instance.addBooksToTag(books, tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBooksFromTag method, of class DefaultTagManager.
     */
    @Test
    public void testRemoveBooksFromTag() {
        System.out.println("removeBooksFromTag");
        List<Book> books = null;
        Tag tag = null;
        DefaultTagManager instance = new DefaultTagManager();
        instance.removeBooksFromTag(books, tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class DefaultTagManager.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Book book = null;
        DefaultTagManager instance = new DefaultTagManager();
        List<Tag> expResult = null;
        List<Tag> result = instance.removeBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteTag method, of class DefaultTagManager.
     */
    @Test
    public void testUndeleteTag() {
        System.out.println("undeleteTag");
        int id = 0;
        DefaultTagManager instance = new DefaultTagManager();
        instance.undeleteTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
