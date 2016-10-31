/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
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
public class UserTest {
    
    public UserTest() {
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
     * Test of getLogin method, of class User.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        User instance = new User();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class User.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        User instance = new User();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail method, of class User.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        User instance = new User();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMail method, of class User.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        User instance = new User();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        User instance = new User();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class User.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        User instance = new User();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class User.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        User instance = new User();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastLogin method, of class User.
     */
    @Test
    public void testGetLastLogin() {
        System.out.println("getLastLogin");
        User instance = new User();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getLastLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastLogin method, of class User.
     */
    @Test
    public void testSetLastLogin() {
        System.out.println("setLastLogin");
        LocalDateTime lastLogin = null;
        User instance = new User();
        instance.setLastLogin(lastLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewedBooks method, of class User.
     */
    @Test
    public void testGetReviewedBooks() {
        System.out.println("getReviewedBooks");
        User instance = new User();
        List<Book> expResult = null;
        List<Book> result = instance.getReviewedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReviewedBooks method, of class User.
     */
    @Test
    public void testSetReviewedBooks() {
        System.out.println("setReviewedBooks");
        List<Book> reviewedBooks = null;
        User instance = new User();
        instance.setReviewedBooks(reviewedBooks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReadBooks method, of class User.
     */
    @Test
    public void testGetReadBooks() {
        System.out.println("getReadBooks");
        User instance = new User();
        List<Book> expResult = null;
        List<Book> result = instance.getReadBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReadBooks method, of class User.
     */
    @Test
    public void testSetReadBooks() {
        System.out.println("setReadBooks");
        List<Book> readBooks = null;
        User instance = new User();
        instance.setReadBooks(readBooks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavoriteBooks method, of class User.
     */
    @Test
    public void testGetFavoriteBooks() {
        System.out.println("getFavoriteBooks");
        User instance = new User();
        List<Book> expResult = null;
        List<Book> result = instance.getFavoriteBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavoriteBooks method, of class User.
     */
    @Test
    public void testSetFavoriteBooks() {
        System.out.println("setFavoriteBooks");
        List<Book> favoriteBooks = null;
        User instance = new User();
        instance.setFavoriteBooks(favoriteBooks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWantedBooks method, of class User.
     */
    @Test
    public void testGetWantedBooks() {
        System.out.println("getWantedBooks");
        User instance = new User();
        List<Book> expResult = null;
        List<Book> result = instance.getWantedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWantedBooks method, of class User.
     */
    @Test
    public void testSetWantedBooks() {
        System.out.println("setWantedBooks");
        List<Book> wantedBooks = null;
        User instance = new User();
        instance.setWantedBooks(wantedBooks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReviewedAuthors method, of class User.
     */
    @Test
    public void testGetReviewedAuthors() {
        System.out.println("getReviewedAuthors");
        User instance = new User();
        List<Author> expResult = null;
        List<Author> result = instance.getReviewedAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReviewedAuthors method, of class User.
     */
    @Test
    public void testSetReviewedAuthors() {
        System.out.println("setReviewedAuthors");
        List<Author> reviewedAuthors = null;
        User instance = new User();
        instance.setReviewedAuthors(reviewedAuthors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavoriteAuthors method, of class User.
     */
    @Test
    public void testGetFavoriteAuthors() {
        System.out.println("getFavoriteAuthors");
        User instance = new User();
        List<Author> expResult = null;
        List<Author> result = instance.getFavoriteAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavoriteAuthors method, of class User.
     */
    @Test
    public void testSetFavoriteAuthors() {
        System.out.println("setFavoriteAuthors");
        List<Author> favoriteAuthors = null;
        User instance = new User();
        instance.setFavoriteAuthors(favoriteAuthors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFriends method, of class User.
     */
    @Test
    public void testGetFriends() {
        System.out.println("getFriends");
        User instance = new User();
        List<User> expResult = null;
        List<User> result = instance.getFriends();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFriends method, of class User.
     */
    @Test
    public void testSetFriends() {
        System.out.println("setFriends");
        List<User> friends = null;
        User instance = new User();
        instance.setFriends(friends);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavoriteReviewers method, of class User.
     */
    @Test
    public void testGetFavoriteReviewers() {
        System.out.println("getFavoriteReviewers");
        User instance = new User();
        List<User> expResult = null;
        List<User> result = instance.getFavoriteReviewers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavoriteReviewers method, of class User.
     */
    @Test
    public void testSetFavoriteReviewers() {
        System.out.println("setFavoriteReviewers");
        List<User> favoriteReviewers = null;
        User instance = new User();
        instance.setFavoriteReviewers(favoriteReviewers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReading method, of class User.
     */
    @Test
    public void testGetReading() {
        System.out.println("getReading");
        User instance = new User();
        Map<Book, Integer> expResult = null;
        Map<Book, Integer> result = instance.getReading();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReading method, of class User.
     */
    @Test
    public void testSetReading() {
        System.out.println("setReading");
        Map<Book, Integer> reading = null;
        User instance = new User();
        instance.setReading(reading);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNote method, of class User.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        User instance = new User();
        Map<Book, String> expResult = null;
        Map<Book, String> result = instance.getNote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNote method, of class User.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        Map<Book, String> note = null;
        User instance = new User();
        instance.setNote(note);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class User.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class User.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean Status = false;
        User instance = new User();
        instance.setStatus(Status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
