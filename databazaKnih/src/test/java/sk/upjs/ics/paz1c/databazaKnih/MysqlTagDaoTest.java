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
public class MysqlTagDaoTest {

    private InterfaceTagDao tagDao;

    public MysqlTagDaoTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tagDao = ObjectFactory.INSTANCE.getTagDao();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllTag method, of class MysqlTagDao.
     */
    @Test
    public void testGetAllTag() {
        System.out.println("getAllTag");
        MysqlTagDao instance = null;
        List<Tag> expResult = null;
        List<Tag> result = instance.getAllTag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTag method, of class MysqlTagDao.
     */
    @Test
    public void testInsertTag() {
        System.out.println("insertTag");
        Tag tag = null;
        MysqlTagDao instance = null;
        instance.insertTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTag method, of class MysqlTagDao.
     */
    @Test
    public void testDeleteTag() {
        System.out.println("deleteTag");
        int id = 0;
        MysqlTagDao instance = null;
        instance.deleteTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTag method, of class MysqlTagDao.
     */
    @Test
    public void testUpdateTag() {
        System.out.println("updateTag");
        Tag tag = null;
        MysqlTagDao instance = null;
        instance.updateTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlTagDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlTagDao instance = null;
        Tag expResult = null;
        Tag result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undeleteTag method, of class MysqlTagDao.
     */
    @Test
    public void testUndeleteTag() {
        System.out.println("undeleteTag");
        int id = 0;
        MysqlTagDao instance = null;
        instance.undeleteTag(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBookToTag method, of class MysqlTagDao.
     */
    @Test
    public void testAddBookToTag() {
        System.out.println("addBookToTag");
        int idbook = 0;
        int idtag = 0;
        MysqlTagDao instance = null;
        instance.addBookToTag(idbook, idtag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromTag method, of class MysqlTagDao.
     */
    @Test
    public void testRemoveBookFromTag() {
        System.out.println("removeBookFromTag");
        int idbook = 0;
        int idtag = 0;
        MysqlTagDao instance = null;
        instance.removeBookFromTag(idbook, idtag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class MysqlTagDao.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        int idbook = 0;
        MysqlTagDao instance = null;
        instance.removeBook(idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
