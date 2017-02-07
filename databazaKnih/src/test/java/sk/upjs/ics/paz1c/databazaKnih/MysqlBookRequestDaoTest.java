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
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Peťo Chomič
 */
public class MysqlBookRequestDaoTest {

    private InterfaceBookRequestDao requestDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlBookRequestDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        requestDao = ObjectFactoryNaTesty.INSTANCE.getBookRequestDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllRequests method, of class MysqlBookRequestDao.
     */
    @Test
    public void testGetAllRequests() {
        System.out.println("getAllRequests");
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookRequest r1 = new BookRequest();
        BookRequest r2 = new BookRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        List<BookRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 2);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of insertRequest method, of class MysqlBookRequestDao.
     */
    @Test
    public void testInsertRequest() {
        System.out.println("insertRequest");
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookRequest r1 = new BookRequest();
        r1.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        requestDao.insertRequest(r1);
        List<BookRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of updateRequest method, of class MysqlBookRequestDao.
     */
    @Test
    public void testUpdateRequest() {
        System.out.println("updateRequest");
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookRequest r1 = new BookRequest();
        r1.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        requestDao.insertRequest(r1);
        List<BookRequest> requests = requestDao.getAllRequests();
        requests.get(0).setContent("yareyare");
        requestDao.updateRequest(requests.get(0));
        requests = requestDao.getAllRequests();
        assertEquals(requests.get(0).getContent(), "yareyare");
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteRequest method, of class MysqlBookRequestDao.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookRequest r1 = new BookRequest();
        BookRequest r2 = new BookRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        List<BookRequest> requests = requestDao.getAllRequests();
        requestDao.deleteRequest(requests.get(0).getId());
        requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteAllWithRequester method, of class MysqlBookRequestDao.
     */
    @Test
    public void testDeleteAllWithRequester() {
        System.out.println("deleteAllWithRequester");
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookRequest r1 = new BookRequest();
        BookRequest r2 = new BookRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        User requester = userDao.getAllUsers().get(0);
        requestDao.deleteAllWithRequester(requester.getId());
        List<BookRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteAllWithBook method, of class MysqlBookRequestDao.
     */
    @Test
    public void testDeleteAllWithBook() {
        System.out.println("deleteAllWithBook");
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookRequest r1 = new BookRequest();
        BookRequest r2 = new BookRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        Book result = bookDao.getAllBooks().get(0);
        requestDao.deleteAllWithBook(result.getId());
        List<BookRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlBookRequestDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookRequest r1 = new BookRequest();
        r1.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        requestDao.insertRequest(r1);
        List<BookRequest> requests = requestDao.getAllRequests();
        BookRequest result = requestDao.findById(requests.get(0).getId());
        assertEquals(result.getId(), requests.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

}
