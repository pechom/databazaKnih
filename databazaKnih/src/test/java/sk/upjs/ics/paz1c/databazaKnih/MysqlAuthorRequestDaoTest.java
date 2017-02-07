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
public class MysqlAuthorRequestDaoTest {

    private InterfaceAuthorRequestDao requestDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlAuthorRequestDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        requestDao = ObjectFactoryNaTesty.INSTANCE.getAuthorRequestDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllRequests method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testGetAllRequests() {
        System.out.println("getAllRequests");
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
        AuthorRequest r1 = new AuthorRequest();
        AuthorRequest r2 = new AuthorRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        List<AuthorRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 2);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of insertRequest method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testInsertRequest() {
        System.out.println("InsertRequest");
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
        AuthorRequest r1 = new AuthorRequest();
        r1.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        requestDao.insertRequest(r1);
        List<AuthorRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteRequest method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
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
        AuthorRequest r1 = new AuthorRequest();
        AuthorRequest r2 = new AuthorRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        List<AuthorRequest> requests = requestDao.getAllRequests();
        requestDao.deleteRequest(requests.get(0).getId());
        requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 1);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlAuthorRequestDao.
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
        AuthorRequest r1 = new AuthorRequest();
        r1.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        requestDao.insertRequest(r1);
        List<AuthorRequest> requests = requestDao.getAllRequests();
        AuthorRequest result = requestDao.findById(requests.get(0).getId());
        assertEquals(result.getId(), requests.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of updateRequest method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testUpdateRequest() {
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
        AuthorRequest r1 = new AuthorRequest();
        r1.setIsActive(true);
        r1.setContent("yadyada");
        r1.setRequester(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        requestDao.insertRequest(r1);
        List<AuthorRequest> requests = requestDao.getAllRequests();
        requests.get(0).setContent("yareyare");
        requestDao.updateRequest(requests.get(0));
        requests = requestDao.getAllRequests();
        assertEquals(requests.get(0).getContent(), "yareyare");
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

    /**
     * Test of deleteAllWithRequester method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testDeleteAllWithRequester() {
        System.out.println("deleteAllWithRequester");
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
        AuthorRequest r1 = new AuthorRequest();
        AuthorRequest r2 = new AuthorRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        User requester = userDao.getAllUsers().get(0);
        requestDao.deleteAllWithRequester(requester.getId());
        List<AuthorRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());

    }

    /**
     * Test of deleteAllWithAuthor method, of class MysqlAuthorRequestDao.
     */
    @Test
    public void testDeleteAllWithAuthor() {
        System.out.println("deleteAllWithAuthor");
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
        AuthorRequest r1 = new AuthorRequest();
        AuthorRequest r2 = new AuthorRequest();
        r1.setIsActive(true);
        r2.setIsActive(true);
        r1.setRequester(users.get(0).getId());
        r2.setRequester(users.get(0).getId());
        r1.setAuthor(authors.get(0).getId());
        r2.setAuthor(authors.get(0).getId());
        requestDao.insertRequest(r1);
        requestDao.insertRequest(r2);
        Author author = authorDao.getAllAuthors().get(0);
        requestDao.deleteAllWithAuthor(author.getId());
        List<AuthorRequest> requests = requestDao.getAllRequests();
        assertEquals(requests.size(), 0);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }

}
