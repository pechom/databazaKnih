/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
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
        List<User> expResult = new ArrayList<>();
        User jano = new User();
        User pali = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        pali.setName("Pali");
        pali.setIsActive(true);
        expResult.add(pali);
        expResult.add(jano);
        userDao.insertUser(jano);
        userDao.insertUser(pali);
        List<User> result = userDao.getAllUsers();
        assertEquals(expResult.size(), result.size());
        jdbcTemplate.update(SqlQueries.DELETE_USER, result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, result.get(1).getId());
    }

    /**
     * Test of insertUser method, of class MysqlUserDao.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        List<User> result = userDao.getAllUsers();
        assertEquals(1, result.size());
        jdbcTemplate.update(SqlQueries.DELETE_USER, result.get(0).getId());
    }

    /**
     * Test of deleteUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        List<User> result = userDao.getAllUsers();
        userDao.deleteUser(result.get(0).getId());
        result = userDao.getAllUsers();
        assertEquals(result.size(), 0);
    }

    /**
     * Test of updateUser method, of class MysqlUserDao.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        List<User> result = userDao.getAllUsers();
        result.get(0).setName("pali");
        userDao.updateUser(result.get(0));
        result = userDao.getAllUsers();
        assertEquals("pali", result.get(0).getName());
        jdbcTemplate.update(SqlQueries.DELETE_USER, result.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlUserDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        List<User> result = userDao.getAllUsers();
        User resultU = userDao.findById(result.get(0).getId());
        assertEquals(resultU.getId(), result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, result.get(0).getId());
    }

    /**
     * Test of addReadBookToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddReadBookToUser() {
        System.out.println("addReadBookToUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        userDao.addReadBookToUser(books.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(users.get(0).getReadBooks().get(0)), Long.valueOf(books.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of deleteReadBookFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteReadBookFromUser() {
        System.out.println("deleteReadBookFromUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        userDao.addReadBookToUser(books.get(0).getId(), users.get(0).getId());
        userDao.deleteReadBookFromUser(books.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(users.get(0).getReadBooks().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of addFavoriteBookToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFavoriteBookToUser() {
        System.out.println("addFavoriteBookToUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        userDao.addFavoriteBookToUser(books.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(users.get(0).getFavoriteBooks().get(0)), Long.valueOf(books.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of deleteFavoriteBookFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFavoriteBookFromUser() {
        System.out.println("deleteFavoriteBookFromUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        userDao.addFavoriteBookToUser(books.get(0).getId(), users.get(0).getId());
        userDao.deleteFavoriteBookFromUser(books.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(users.get(0).getFavoriteBooks().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of addWantedBookToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddWantedBookToUser() {
        System.out.println("addWantedBookToUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        userDao.addWantedBookToUser(books.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(users.get(0).getWantedBooks().get(0)), Long.valueOf(books.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of deleteWantedBookFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteWantedBookFromUser() {
        System.out.println("deleteWantedBookFromUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        userDao.addWantedBookToUser(books.get(0).getId(), users.get(0).getId());
        userDao.deleteWantedBookFromUser(books.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(users.get(0).getWantedBooks().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeAuthor method, of class MysqlUserDao.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        User jano = new User();
        User pali = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        pali.setName("Pali");
        pali.setIsActive(true);
        userDao.insertUser(jano);
        userDao.insertUser(pali);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author author = new Author();
        author.setName("Jano");
        author.setIsActive(true);
        authorDao.insertAuthor(author);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        userDao.addFavoriteAuthorToUser(authors.get(0).getId(), users.get(0).getId());
        userDao.addFavoriteAuthorToUser(authors.get(0).getId(), users.get(1).getId());
        userDao.removeAuthor(authors.get(0).getId());
        users = userDao.getAllUsers();
        assertEquals(Long.valueOf(users.get(0).getFavoriteAuthors().size()), Long.valueOf(0));
        assertEquals(Long.valueOf(users.get(1).getFavoriteAuthors().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(1).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
    }

    /**
     * Test of addFavoriteAuthorToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFavoriteAuthorToUser() {
        System.out.println("addFavoriteAuthorToUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author author = new Author();
        author.setName("Jano");
        author.setIsActive(true);
        authorDao.insertAuthor(author);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        userDao.addFavoriteAuthorToUser(authors.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        authors = authorDao.getAllAuthors();
        assertEquals(Long.valueOf(users.get(0).getFavoriteAuthors().get(0)), Long.valueOf(authors.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
    }

    /**
     * Test of deleteFavoriteAuthorFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFavoriteAuthorFromUser() {
        System.out.println("deleteFavoriteAuthorFromUser");
        User jano = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        userDao.insertUser(jano);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author author = new Author();
        author.setName("Jano");
        author.setIsActive(true);
        authorDao.insertAuthor(author);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        userDao.addFavoriteAuthorToUser(authors.get(0).getId(), users.get(0).getId());
        userDao.deleteFavoriteAuthorFromUser(authors.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        authors = authorDao.getAllAuthors();
        assertEquals(Long.valueOf(users.get(0).getFavoriteAuthors().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
    }

    /**
     * Test of addFriendToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFriendToUser() {
        System.out.println("addFriendToUser");
        User jano = new User();
        User pali = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        pali.setName("Pali");
        pali.setIsActive(true);
        userDao.insertUser(jano);
        userDao.insertUser(pali);
        List<User> users = userDao.getAllUsers();
        userDao.addFriendToUser(users.get(1).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        assertEquals(Long.valueOf(users.get(0).getFriends().get(0)), Long.valueOf(users.get(1).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(1).getId());
    }

    /**
     * Test of deleteFriendFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFriendFromUser() {
        System.out.println("deleteFriendFromUser");
        User jano = new User();
        User pali = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        pali.setName("Pali");
        pali.setIsActive(true);
        userDao.insertUser(jano);
        userDao.insertUser(pali);
        List<User> users = userDao.getAllUsers();
        userDao.addFriendToUser(users.get(1).getId(), users.get(0).getId());
        userDao.deleteFriendFromUser(users.get(1).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        assertEquals(Long.valueOf(users.get(0).getFriends().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(1).getId());
    }

    /**
     * Test of addFavoriteReviewerToUser method, of class MysqlUserDao.
     */
    @Test
    public void testAddFavoriteReviewerToUser() {
        System.out.println("addFavoriteReviewerToUser");
        User jano = new User();
        User pali = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        pali.setName("Pali");
        pali.setIsActive(true);
        userDao.insertUser(jano);
        userDao.insertUser(pali);
        List<User> users = userDao.getAllUsers();
        userDao.addFavoriteReviewerToUser(users.get(1).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        assertEquals(Long.valueOf(users.get(0).getFavoriteReviewers().get(0)), Long.valueOf(users.get(1).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(1).getId());
    }

    /**
     * Test of deleteFavoriteReviewerFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteFavoriteReviewerFromUser() {
        System.out.println("deleteFavoriteReviewerFromUser");
        User jano = new User();
        User pali = new User();
        jano.setName("Jano");
        jano.setIsActive(true);
        pali.setName("Pali");
        pali.setIsActive(true);
        userDao.insertUser(jano);
        userDao.insertUser(pali);
        List<User> users = userDao.getAllUsers();
        userDao.addFavoriteReviewerToUser(users.get(1).getId(), users.get(0).getId());
        userDao.deleteFavoriteReviewerFromUser(users.get(1).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        assertEquals(Long.valueOf(users.get(0).getFriends().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(1).getId());
    }

    /**
     * Test of deleteBookReviewFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteBookReviewFromUser() {
        System.out.println("deleteBookReviewFromUser");
        User user = new User();
        user.setIsActive(true);
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        List<Book> books = bookDao.getAllBooks();
        BookReview rev1 = new BookReview();
        rev1.setIsActive(true);
        rev1.setBook(books.get(0).getId());
        rev1.setUser(users.get(0).getId());
        InterfaceBookReviewDao reviewDao = ObjectFactoryNaTesty.INSTANCE.getBookReviewDao();
        reviewDao.insertReview(rev1);
        List<BookReview> reviews = reviewDao.getAllReviews();
        users = userDao.getAllUsers();
        userDao.deleteBookReviewFromUser(reviews.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        assertEquals(Long.valueOf(users.get(0).getBookReviews().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteAuthorReviewFromUser method, of class MysqlUserDao.
     */
    @Test
    public void testDeleteAuthorReviewFromUser() {
        System.out.println("deleteAuthorReviewFromUser");
        User user = new User();
        user.setIsActive(true);
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author author = new Author();
        author.setIsActive(true);
        authorDao.insertAuthor(author);
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview rev1 = new AuthorReview();
        rev1.setIsActive(true);
        rev1.setAuthor(authors.get(0).getId());
        rev1.setUser(users.get(0).getId());
        InterfaceAuthorReviewDao reviewDao = ObjectFactoryNaTesty.INSTANCE.getAuthorReviewDao();
        reviewDao.insertReview(rev1);
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        users = userDao.getAllUsers();
        userDao.deleteAuthorReviewFromUser(reviews.get(0).getId(), users.get(0).getId());
        users = userDao.getAllUsers();
        assertEquals(Long.valueOf(users.get(0).getAuthorReviews().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }
}
