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
public class MysqlBookDaoTest {

    private InterfaceBookDao bookDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlBookDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllBooks method, of class MysqlBookDao.
     */
    @Test
    public void testGetAllBooks() {
        System.out.println("getAllBooks");
        List<Book> expResult = new ArrayList<>();
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setIsActive(true);
        book2.setIsActive(true);
        expResult.add(book1);
        expResult.add(book2);
        bookDao.insertBook(book1);
        bookDao.insertBook(book2);
        List<Book> result = bookDao.getAllBooks();
        assertEquals(expResult.size(), result.size());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, result.get(1).getId());
    }

    /**
     * Test of insertBook method, of class MysqlBookDao.
     */
    @Test
    public void testInsertBook() {
        System.out.println("insertBook");
        Book book1 = new Book();
        book1.setIsActive(true);
        bookDao.insertBook(book1);
        List<Book> result = bookDao.getAllBooks();
        assertEquals(1, result.size());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, result.get(0).getId());
    }

    /**
     * Test of deleteBook method, of class MysqlBookDao.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        Book book1 = new Book();
        book1.setIsActive(true);
        bookDao.insertBook(book1);
        List<Book> result = bookDao.getAllBooks();
        bookDao.deleteBook(result.get(0).getId());
        result = bookDao.getAllBooks();
        assertEquals(result.size(), 0);
    }

    /**
     * Test of updateBook method, of class MysqlBookDao.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Book book1 = new Book();
        book1.setIsActive(true);
        bookDao.insertBook(book1);
        List<Book> result = bookDao.getAllBooks();
        result.get(0).setName("ararara");
        bookDao.updateBook(result.get(0));
        result = bookDao.getAllBooks();
        assertEquals("ararara", result.get(0).getName());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, result.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlBookDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Book book1 = new Book();
        book1.setIsActive(true);
        bookDao.insertBook(book1);
        List<Book> result = bookDao.getAllBooks();
        Book resultB = bookDao.findById(result.get(0).getId());
        assertEquals(resultB.getId(), result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, result.get(0).getId());
    }

    /**
     * Test of addAuthorToBook method, of class MysqlBookDao.
     */
    @Test
    public void testAddAuthorToBook() {
        System.out.println("addAuthorToBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        authorDao.insertAuthor(jano);
        List<Author> authors = authorDao.getAllAuthors();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addAuthorToBook(books.get(0).getId(), authors.get(0).getId());
        authors = authorDao.getAllAuthors();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getAuthor()), Long.valueOf(authors.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeAuthorFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveAuthorFromBook() {
        System.out.println("removeAuthorFromBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        authorDao.insertAuthor(jano);
        List<Author> authors = authorDao.getAllAuthors();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addAuthorToBook(books.get(0).getId(), authors.get(0).getId());
        bookDao.removeAuthorFromBook(books.get(0).getId());
        authors = authorDao.getAllAuthors();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getAuthor()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeAuthor method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setIsActive(true);
        book2.setIsActive(true);
        bookDao.insertBook(book1);
        bookDao.insertBook(book2);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        authorDao.insertAuthor(jano);
        List<Author> authors = authorDao.getAllAuthors();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addAuthorToBook(books.get(0).getId(), authors.get(0).getId());
        bookDao.addAuthorToBook(books.get(1).getId(), authors.get(0).getId());
        bookDao.removeAuthor(authors.get(0).getId());
        books = bookDao.getAllBooks();
        authors = authorDao.getAllAuthors();
        assertEquals(Long.valueOf(books.get(0).getAuthor()), Long.valueOf(0));
        assertEquals(Long.valueOf(books.get(1).getAuthor()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(1).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
    }

    /**
     * Test of addGenreToBook method, of class MysqlBookDao.
     */
    @Test
    public void testAddGenreToBook() {
        System.out.println("addGenreToBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        InterfaceGenreDao genreDao = ObjectFactoryNaTesty.INSTANCE.getGenreDao();
        Genre genre = new Genre();
        genre.setIsActive(true);
        genreDao.insertGenre(genre);
        List<Genre> genres = genreDao.getAllGenre();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addGenreToBook(genres.get(0).getId(), books.get(0).getId());
        genres = genreDao.getAllGenre();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getGenres().get(0)), Long.valueOf(genres.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeGenreFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveGenreFromBook() {
        System.out.println("removeGenreFromBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        InterfaceGenreDao genreDao = ObjectFactoryNaTesty.INSTANCE.getGenreDao();
        Genre genre = new Genre();
        genre.setIsActive(true);
        genreDao.insertGenre(genre);
        List<Genre> genres = genreDao.getAllGenre();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addGenreToBook(genres.get(0).getId(), books.get(0).getId());
        bookDao.removeGenreFromBook(genres.get(0).getId(), books.get(0).getId());
        genres = genreDao.getAllGenre();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getGenres().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeGenre method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveGenre() {
        System.out.println("removeGenre");
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setIsActive(true);
        book2.setIsActive(true);
        bookDao.insertBook(book1);
        bookDao.insertBook(book2);
        InterfaceGenreDao genreDao = ObjectFactoryNaTesty.INSTANCE.getGenreDao();
        Genre genre = new Genre();
        genre.setIsActive(true);
        genreDao.insertGenre(genre);
        List<Genre> genres = genreDao.getAllGenre();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addGenreToBook(genres.get(0).getId(), books.get(0).getId());
        bookDao.addGenreToBook(genres.get(0).getId(), books.get(1).getId());
        bookDao.removeGenre(genres.get(0).getId());
        books = bookDao.getAllBooks();
        genres = genreDao.getAllGenre();
        assertEquals(Long.valueOf(books.get(0).getGenres().size()), Long.valueOf(0));
        assertEquals(Long.valueOf(books.get(1).getGenres().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(1).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
    }

    /**
     * Test of addTagToBook method, of class MysqlBookDao.
     */
    @Test
    public void testAddTagToBook() {
        System.out.println("addTagToBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        InterfaceTagDao tagDao = ObjectFactoryNaTesty.INSTANCE.getTagDao();
        Tag tag = new Tag();
        tag.setIsActive(true);
        tagDao.insertTag(tag);
        List<Tag> tags = tagDao.getAllTag();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addTagToBook(tags.get(0).getId(), books.get(0).getId());
        tags = tagDao.getAllTag();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getTags().get(0)), Long.valueOf(tags.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_TAG, tags.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeTagFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveTagFromBook() {
        System.out.println("removeTagFromBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        InterfaceTagDao tagDao = ObjectFactoryNaTesty.INSTANCE.getTagDao();
        Tag tag = new Tag();
        tag.setIsActive(true);
        tagDao.insertTag(tag);
        List<Tag> tags = tagDao.getAllTag();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addTagToBook(tags.get(0).getId(), books.get(0).getId());
        bookDao.removeTagFromBook(tags.get(0).getId(), books.get(0).getId());
        tags = tagDao.getAllTag();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getTags().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_TAG, tags.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeTag method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveTag() {
        System.out.println("removeTag");
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setIsActive(true);
        book2.setIsActive(true);
        bookDao.insertBook(book1);
        bookDao.insertBook(book2);
        InterfaceTagDao tagDao = ObjectFactoryNaTesty.INSTANCE.getTagDao();
        Tag tag = new Tag();
        tag.setIsActive(true);
        tagDao.insertTag(tag);
        List<Tag> tags = tagDao.getAllTag();
        List<Book> books = bookDao.getAllBooks();
        bookDao.addTagToBook(tags.get(0).getId(), books.get(0).getId());
        bookDao.addTagToBook(tags.get(0).getId(), books.get(1).getId());
        bookDao.removeTag(tags.get(0).getId());
        books = bookDao.getAllBooks();
        tags = tagDao.getAllTag();
        assertEquals(Long.valueOf(books.get(0).getTags().size()), Long.valueOf(0));
        assertEquals(Long.valueOf(books.get(1).getTags().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(1).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_TAG, tags.get(0).getId());
    }

    /**
     * Test of removeReviewFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveReviewFromBook() {
        System.out.println("removeReviewFromBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookReview rev1 = new BookReview();
        rev1.setIsActive(true);
        rev1.setBook(books.get(0).getId());
        rev1.setUser(users.get(0).getId());
        InterfaceBookReviewDao reviewDao = ObjectFactoryNaTesty.INSTANCE.getBookReviewDao();
        reviewDao.insertReview(rev1);
        List<BookReview> reviews = reviewDao.getAllReviews();
        books = bookDao.getAllBooks();
        bookDao.removeReviewFromBook(reviews.get(0).getId(), books.get(0));
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getNumberOfReviews()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());

    }

    /**
     * Test of removeReviewsFromBook method, of class MysqlBookDao.
     */
    @Test
    public void testRemoveReviewsFromBook() {
        System.out.println("removeReviewsFromBook");
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        User user = new User();
        user.setIsActive(true);
        InterfaceUserDao userDao = ObjectFactoryNaTesty.INSTANCE.getUserDao();
        userDao.insertUser(user);
        List<User> users = userDao.getAllUsers();
        List<Book> books = bookDao.getAllBooks();
        BookReview rev1 = new BookReview();
        rev1.setIsActive(true);
        rev1.setBook(books.get(0).getId());
        rev1.setUser(users.get(0).getId());
        BookReview rev2 = new BookReview();
        rev2.setIsActive(true);
        rev2.setUser(users.get(0).getId());
        rev2.setBook(books.get(0).getId());
        InterfaceBookReviewDao reviewDao = ObjectFactoryNaTesty.INSTANCE.getBookReviewDao();
        reviewDao.insertReview(rev1);
        reviewDao.insertReview(rev2);
        books = bookDao.getAllBooks();
        bookDao.removeReviewsFromBook(books.get(0).getId());
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(books.get(0).getBookReviews().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_USER, users.get(0).getId());
    }
}
