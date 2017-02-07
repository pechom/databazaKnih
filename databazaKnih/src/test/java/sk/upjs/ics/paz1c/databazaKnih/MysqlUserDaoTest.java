/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Peťo Chomič
 */
public class MysqlUserDaoTest {

    private InterfaceUserDao userDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlUserDaoTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllUsers method, of class MysqlUserDao.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        MysqlUserDao instance = null;
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class MysqlUserDao.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User user = null;
        MysqlUserDao instance = null;
        instance.insertUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int id = 0;
        MysqlUserDao instance = null;
        instance.deleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class MysqlUserDao.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        MysqlUserDao instance = null;
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class MysqlUserDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        MysqlUserDao instance = null;
        User expResult = null;
        User result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of changePassword method, of class MysqlUserDao.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        User user = null;
        MysqlUserDao instance = null;
        instance.changePassword(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReadBookToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddReadBookToUser() {
        System.out.println("addReadBookToUser");
        int idbook = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addReadBookToUser(idbook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReadBookFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteReadBookFromUser() {
        System.out.println("deleteReadBookFromUser");
        int idbook = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteReadBookFromUser(idbook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteBookToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFavoriteBookToUser() {
        System.out.println("addFavoriteBookToUser");
        int idbook = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addFavoriteBookToUser(idbook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteBookFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFavoriteBookFromUser() {
        System.out.println("deleteFavoriteBookFromUser");
        int idbook = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteFavoriteBookFromUser(idbook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWantedBookToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddWantedBookToUser() {
        System.out.println("addWantedBookToUser");
        int idbook = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addWantedBookToUser(idbook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWantedBookFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteWantedBookFromUser() {
        System.out.println("deleteWantedBookFromUser");
        int idbook = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteWantedBookFromUser(idbook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class MysqlUserDao.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        int idauthor = 0;
        MysqlUserDao instance = null;
        instance.removeAuthor(idauthor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteAuthorToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFavoriteAuthorToUser() {
        System.out.println("addFavoriteAuthorToUser");
        int idauthor = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addFavoriteAuthorToUser(idauthor, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteAuthorFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFavoriteAuthorFromUser() {
        System.out.println("deleteFavoriteAuthorFromUser");
        int idauthor = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteFavoriteAuthorFromUser(idauthor, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFriendToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFriendToUser() {
        System.out.println("addFriendToUser");
        int idfriend = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addFriendToUser(idfriend, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFriendFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFriendFromUser() {
        System.out.println("deleteFriendFromUser");
        int idfriend = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteFriendFromUser(idfriend, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFavoriteReviewerToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFavoriteReviewerToUser() {
        System.out.println("addFavoriteReviewerToUser");
        int idreviewer = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addFavoriteReviewerToUser(idreviewer, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFavoriteReviewerFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFavoriteReviewerFromUser() {
        System.out.println("deleteFavoriteReviewerFromUser");
        int idreviewer = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteFavoriteReviewerFromUser(idreviewer, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBookReviewFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteBookReviewFromUser() {
        System.out.println("deleteBookReviewFromUser");
        int idreview = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteBookReviewFromUser(idreview, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthorReviewFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteAuthorReviewFromUser() {
        System.out.println("deleteAuthorReviewFromUser");
        int idreview = 0;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteAuthorReviewFromUser(idreview, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReadingBooksToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddReadingBooksToUser() {
        System.out.println("addReadingBooksToUser");
        Map<Integer, Integer> reading = null;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addReadingBooksToUser(reading, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReadingBooksFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteReadingBooksFromUser() {
        System.out.println("deleteReadingBooksFromUser");
        Map<Integer, Integer> reading = null;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteReadingBooksFromUser(reading, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNoteBooksToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddNoteBooksToUser() {
        System.out.println("addNoteBooksToUser");
        Map<Integer, String> notebook = null;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.addNoteBooksToUser(notebook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNoteBooksFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteNoteBooksFromUser() {
        System.out.println("deleteNoteBooksFromUser");
        Map<Integer, String> notebook = null;
        int iduser = 0;
        MysqlUserDao instance = null;
        instance.deleteNoteBooksFromUser(notebook, iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
