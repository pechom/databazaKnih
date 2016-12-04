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
public class TagManagerTest {
    
    public TagManagerTest() {
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
     * Test of getAllTags method, of class TagManager.
     */
    @Test
    public void testGetAllTags() {
        System.out.println("getAllTags");
        TagManager instance = new TagManagerImpl();
        List<Tag> expResult = null;
        List<Tag> result = instance.getAllTags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTagByName method, of class TagManager.
     */
    @Test
    public void testGetTagByName() {
        System.out.println("getTagByName");
        String name = "";
        TagManager instance = new TagManagerImpl();
        Tag expResult = null;
        Tag result = instance.getTagByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBooksToTag method, of class TagManager.
     */
    @Test
    public void testAddBooksToTag() {
        System.out.println("addBooksToTag");
        List<Book> books = null;
        Tag tag = null;
        TagManager instance = new TagManagerImpl();
        instance.addBooksToTag(books, tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBooksFromTag method, of class TagManager.
     */
    @Test
    public void testRemoveBooksFromTag() {
        System.out.println("removeBooksFromTag");
        List<Book> books = null;
        Tag tag = null;
        TagManager instance = new TagManagerImpl();
        instance.removeBooksFromTag(books, tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class TagManager.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Book book = null;
        TagManager instance = new TagManagerImpl();
        List<Tag> expResult = null;
        List<Tag> result = instance.removeBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTag method, of class TagManager.
     */
    @Test
    public void testInsertTag() {
        System.out.println("insertTag");
        Tag tag = null;
        TagManager instance = new TagManagerImpl();
        instance.insertTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTag method, of class TagManager.
     */
    @Test
    public void testDeleteTag() {
        System.out.println("deleteTag");
        int id = 0;
        TagManager instance = new TagManagerImpl();
        instance.deleteTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteTag method, of class TagManager.
     */
    @Test
    public void testUndeleteTag() {
        System.out.println("undeleteTag");
        int id = 0;
        TagManager instance = new TagManagerImpl();
        instance.undeleteTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTag method, of class TagManager.
     */
    @Test
    public void testUpdateTag() {
        System.out.println("updateTag");
        Tag tag = null;
        TagManager instance = new TagManagerImpl();
        instance.updateTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class TagManager.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        TagManager instance = new TagManagerImpl();
        Tag expResult = null;
        Tag result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TagManagerImpl implements TagManager {

        public List<Tag> getAllTags() {
            return null;
        }

        public Tag getTagByName(String name) {
            return null;
        }

        public void addBooksToTag(List<Book> books, Tag tag) {
        }

        public void removeBooksFromTag(List<Book> books, Tag tag) {
        }

        public List<Tag> removeBook(Book book) {
            return null;
        }

        public void insertTag(Tag tag) {
        }

        public void deleteTag(int id) {
        }

        public void undeleteTag(int id) {
        }

        public void updateTag(Tag tag) {
        }

        public Tag findById(int id) {
            return null;
        }
    }
    
}
