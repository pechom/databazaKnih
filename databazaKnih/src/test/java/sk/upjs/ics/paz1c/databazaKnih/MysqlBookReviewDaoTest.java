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
public class MysqlBookReviewDaoTest {

    private InterfaceBookReviewDao reviewDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlBookReviewDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        reviewDao = ObjectFactoryNaTesty.INSTANCE.getBookReviewDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllReviews method, of class MysqlBookReviewDao.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
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
        BookReview r1 = new BookReview();
        BookReview r2 = new BookReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        List<BookReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 2);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of insertReview method, of class MysqlBookReviewDao.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
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
        BookReview r1 = new BookReview();
        r1.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        reviewDao.insertReview(r1);
        List<BookReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteReview method, of class MysqlBookReviewDao.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
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
        BookReview r1 = new BookReview();
        BookReview r2 = new BookReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        List<BookReview> reviews = reviewDao.getAllReviews();
        reviewDao.deleteReview(reviews.get(0).getId());
        reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of updateReview method, of class MysqlBookReviewDao.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
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
        BookReview r1 = new BookReview();
        r1.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        reviewDao.insertReview(r1);
        List<BookReview> reviews = reviewDao.getAllReviews();
        reviews.get(0).setReview("yareyare");
        reviewDao.updateReview(reviews.get(0));
        reviews = reviewDao.getAllReviews();
        assertEquals(reviews.get(0).getReview(), "yareyare");
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlBookReviewDao.
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
        BookReview r1 = new BookReview();
        r1.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        reviewDao.insertReview(r1);
        List<BookReview> reviews = reviewDao.getAllReviews();
        BookReview result = reviewDao.findById(reviews.get(0).getId());
        assertEquals(result.getId(), reviews.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteReviewsWithBook method, of class MysqlBookReviewDao.
     */
    @Test
    public void testDeleteReviewsWithBook() {
        System.out.println("deleteReviewsWithBook");
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
        BookReview r1 = new BookReview();
        BookReview r2 = new BookReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        Book b= bookDao.getAllBooks().get(0);
        reviewDao.deleteReviewsWithBook(b.getId());
        List<BookReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteReviewsWithUser method, of class MysqlBookReviewDao.
     */
    @Test
    public void testDeleteReviewsWithUser() {
        System.out.println("deleteReviewsWithUser");
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
        BookReview r1 = new BookReview();
        BookReview r2 = new BookReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setBook(books.get(0).getId());
        r2.setBook(books.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        User u = userDao.getAllUsers().get(0);
        reviewDao.deleteReviewsWithUser(u.getId());
        List<BookReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

}
