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
public class MysqlAuthorReviewDaoTest {

    private InterfaceAuthorReviewDao reviewDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlAuthorReviewDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        reviewDao = ObjectFactoryNaTesty.INSTANCE.getAuthorReviewDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllReviews method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testGetAllReviews() {
        System.out.println("getAllReviews");
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        authorDao.insertAuthor(jano);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview r1 = new AuthorReview();
        AuthorReview r2 = new AuthorReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 2);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of insertReview method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testInsertReview() {
        System.out.println("insertReview");
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        authorDao.insertAuthor(jano);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview r1 = new AuthorReview();
        r1.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        reviewDao.insertReview(r1);
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteReview method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testDeleteReview() {
        System.out.println("deleteReview");
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        authorDao.insertAuthor(jano);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview r1 = new AuthorReview();
        AuthorReview r2 = new AuthorReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        reviewDao.deleteReview(reviews.get(0).getId());
        reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of updateReview method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testUpdateReview() {
        System.out.println("updateReview");
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        authorDao.insertAuthor(jano);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview r1 = new AuthorReview();
        r1.setIsActive(true);
        r1.setReview("yadyada");
        r1.setUser(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        reviewDao.insertReview(r1);
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        reviews.get(0).setReview("yareyare");
        reviewDao.updateReview(reviews.get(0));
        reviews = reviewDao.getAllReviews();
        assertEquals(reviews.get(0).getReview(), "yareyare");
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        authorDao.insertAuthor(jano);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview r1 = new AuthorReview();
        r1.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        reviewDao.insertReview(r1);
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        AuthorReview result = reviewDao.findById(reviews.get(0).getId());
        assertEquals(result.getId(), reviews.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteReviewsWithAuthor method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testDeleteReviewsWithAuthor() {
        System.out.println("deleteReviewsWithAuthor");
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        authorDao.insertAuthor(jano);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview r1 = new AuthorReview();
        AuthorReview r2 = new AuthorReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        Author author = authorDao.getAllAuthors().get(0);
        reviewDao.deleteReviewsWithAuthor(author.getId());
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteReviewsWithUser method, of class MysqlAuthorReviewDao.
     */
    @Test
    public void testDeleteReviewsWithUser() {
        System.out.println("deleteReviewsWithUser");
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        authorDao.insertAuthor(jano);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Author> authors = authorDao.getAllAuthors();
        AuthorReview r1 = new AuthorReview();
        AuthorReview r2 = new AuthorReview();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setUser(users.get(0).getId());
        r2.setUser(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        reviewDao.insertReview(r1);
        reviewDao.insertReview(r2);
        User u = userDao.getAllUsers().get(0);
        reviewDao.deleteReviewsWithUser(u.getId());
        List<AuthorReview> reviews = reviewDao.getAllReviews();
        assertEquals(reviews.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

}
