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
public class MysqlTagDaoTest {

    private InterfaceTagDao tagDao;
    private JdbcTemplate jdbcTemplate;

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
        tagDao = ObjectFactoryNaTesty.INSTANCE.getTagDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
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
        List<Tag> expResult = new ArrayList<>();
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag1.setIsActive(true);
        tag2.setIsActive(true);
        expResult.add(tag1);
        expResult.add(tag2);
        tagDao.insertTag(tag1);
        tagDao.insertTag(tag2);
        List<Tag> result = tagDao.getAllTag();
        assertEquals(expResult.size(), result.size());
        jdbcTemplate.update(SqlQueries.DELETE_TAG, result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_TAG, result.get(1).getId());
    }

    /**
     * Test of insertTag method, of class MysqlTagDao.
     */
    @Test
    public void testInsertTag() {
        System.out.println("insertTag");
        Tag tag1 = new Tag();
        tag1.setIsActive(true);
        tagDao.insertTag(tag1);
        List<Tag> result = tagDao.getAllTag();
        assertEquals(1, result.size());
        jdbcTemplate.update(SqlQueries.DELETE_TAG, result.get(0).getId());
    }

    /**
     * Test of deleteTag method, of class MysqlTagDao.
     */
    @Test
    public void testDeleteTag() {
        System.out.println("deleteTag");
        Tag tag1 = new Tag();
        tag1.setIsActive(true);
        tagDao.insertTag(tag1);
        List<Tag> result = tagDao.getAllTag();
        tagDao.deleteTag(result.get(0).getId());
        result = tagDao.getAllTag();
        assertEquals(result.size(), 0);
    }

    /**
     * Test of updateTag method, of class MysqlTagDao.
     */
    @Test
    public void testUpdateTag() {
        System.out.println("updateTag");
        Tag tag1 = new Tag();
        tag1.setIsActive(true);
        tag1.setName("dark");
        tagDao.insertTag(tag1);
        List<Tag> result = tagDao.getAllTag();
        result.get(0).setName("steampunk");
        tagDao.updateTag(result.get(0));
        result = tagDao.getAllTag();
        assertEquals("steampunk", result.get(0).getName());
        jdbcTemplate.update(SqlQueries.DELETE_TAG, result.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlTagDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Tag tag1 = new Tag();
        tag1.setIsActive(true);
        tagDao.insertTag(tag1);
        List<Tag> result = tagDao.getAllTag();
        Tag resultT = tagDao.findById(result.get(0).getId());
        assertEquals(resultT.getId(), result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_TAG, result.get(0).getId());
    }

    /**
     * Test of addBookToTag method, of class MysqlTagDao.
     */
//    @Test
//    public void testAddBookToTag() {
//        System.out.println("addBookToTag");
//        Tag tag1 = new Tag();
//        tag1.setIsActive(true);
//        tagDao.insertTag(tag1);
//        Book book = new Book();
//        book.setIsActive(true);
//        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
//        bookDao.insertBook(book);
//        List<Tag> tags = tagDao.getAllTag();
//        List<Book> books = bookDao.getAllBooks();
//        System.out.println("sk.upjs.ics.paz1c.databazaKnih.MysqlTagDaoTest.testAddBookToTag()");
//        tagDao.addBookToTag(books.get(0).getId(), tags.get(0).getId());
//        tags = tagDao.getAllTag();
//        books = bookDao.getAllBooks();
//        System.out.println("sk.upjs.ics.paz1c.databazaKnih.MysqlTagDaoTest.testAddBookToTag()");
//        System.out.println(tags.get(0).getBooksWithTag().get(0));
//        assertEquals(Long.valueOf(tags.get(0).getBooksWithTag().get(0)), Long.valueOf(books.get(0).getId()));
//        jdbcTemplate.update(SqlQueries.DELETE_TAG, tags.get(0).getId());
//        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
//    }

    /**
     * Test of removeBookFromTag method, of class MysqlTagDao.
     */
    @Test
    public void testRemoveBookFromTag() {
        System.out.println("removeBookFromTag");
        Tag tag1 = new Tag();
        tag1.setIsActive(true);
        tagDao.insertTag(tag1);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<Tag> tags = tagDao.getAllTag();
        List<Book> books = bookDao.getAllBooks();
        tagDao.addBookToTag(books.get(0).getId(), tags.get(0).getId());
        tagDao.removeBookFromTag(books.get(0).getId(), tags.get(0).getId());
        tags = tagDao.getAllTag();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(tags.get(0).getBooksWithTag().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_TAG, tags.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeBook method, of class MysqlTagDao.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag1.setIsActive(true);
        tag2.setIsActive(true);
        tagDao.insertTag(tag1);
        tagDao.insertTag(tag2);
        Book book = new Book();
        book.setIsActive(true);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        bookDao.insertBook(book);
        List<Tag> tags = tagDao.getAllTag();
        List<Book> books = bookDao.getAllBooks();
        tagDao.addBookToTag(books.get(0).getId(), tags.get(0).getId());
        tagDao.addBookToTag(books.get(0).getId(), tags.get(1).getId());
        tagDao.removeBook(books.get(0).getId());
        tags = tagDao.getAllTag();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(tags.get(0).getBooksWithTag().size()), Long.valueOf(0));
        assertEquals(Long.valueOf(tags.get(1).getBooksWithTag().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_TAG, tags.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_TAG, tags.get(1).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

}
