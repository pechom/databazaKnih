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
public class InterfaceTagDaoTest {
    
    public InterfaceTagDaoTest() {
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
     * Test of getAllTag method, of class InterfaceTagDao.
     */
    @Test
    public void testGetAllTag() {
        System.out.println("getAllTag");
        InterfaceTagDao instance = new InterfaceTagDaoImpl();
        List<Tag> expResult = null;
        List<Tag> result = instance.getAllTag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTag method, of class InterfaceTagDao.
     */
    @Test
    public void testInsertTag() {
        System.out.println("insertTag");
        Tag tag = null;
        InterfaceTagDao instance = new InterfaceTagDaoImpl();
        instance.insertTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTag method, of class InterfaceTagDao.
     */
    @Test
    public void testDeleteTag() {
        System.out.println("deleteTag");
        int id = 0;
        InterfaceTagDao instance = new InterfaceTagDaoImpl();
        instance.deleteTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTag method, of class InterfaceTagDao.
     */
    @Test
    public void testUpdateTag() {
        System.out.println("updateTag");
        int id = 0;
        InterfaceTagDao instance = new InterfaceTagDaoImpl();
        instance.updateTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfaceTagDaoImpl implements InterfaceTagDao {

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
