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
     * Test of getAllTag method, of class TagManager.
     */
    @Test
    public void testGetAllTag() {
        System.out.println("getAllTag");
        TagManager instance = new TagManagerImpl();
        List<Tag> expResult = null;
        List<Tag> result = instance.getAllTag();
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
     * Test of updateTag method, of class TagManager.
     */
    @Test
    public void testUpdateTag() {
        System.out.println("updateTag");
        int id = 0;
        TagManager instance = new TagManagerImpl();
        instance.updateTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TagManagerImpl implements TagManager {

        public List<Tag> getAllTag() {
            return null;
        }

        public void insertTag(Tag tag) {
        }

        public void deleteTag(int id) {
        }

        public void updateTag(int id) {
        }
    }
    
}
