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
public class MysqlGenreDaoTest {

    private InterfaceGenreDao genreDao;
    private JdbcTemplate jdbcTemplate;

    public MysqlGenreDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        genreDao = ObjectFactoryNaTesty.INSTANCE.getGenreDao();
        jdbcTemplate = ObjectFactoryNaTesty.INSTANCE.getJdbcTemplate();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testGetAllGenre() {
        System.out.println("getAllGenre");
        List<Genre> expResult = new ArrayList<>();
        Genre genre1 = new Genre();
        Genre genre2 = new Genre();
        genre1.setIsActive(true);
        genre2.setIsActive(true);
        expResult.add(genre1);
        expResult.add(genre2);
        genreDao.insertGenre(genre1);
        genreDao.insertGenre(genre2);
        List<Genre> result = genreDao.getAllGenre();
        assertEquals(expResult.size(), result.size());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, result.get(1).getId());
    }

    /**
     * Test of insertGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testInsertGenre() {
        System.out.println("insertGenre");
        Genre genre1 = new Genre();
        genre1.setIsActive(true);
        genreDao.insertGenre(genre1);
        List<Genre> result = genreDao.getAllGenre();
        assertEquals(1, result.size());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, result.get(0).getId());
    }

    /**
     * Test of deleteGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testDeleteGenre() {
        System.out.println("deleteGenre");
        Genre genre1 = new Genre();
        genre1.setIsActive(true);
        genreDao.insertGenre(genre1);
        List<Genre> result = genreDao.getAllGenre();
        genreDao.deleteGenre(result.get(0).getId());
        result = genreDao.getAllGenre();
        assertEquals(result.size(), 0);
    }

    /**
     * Test of updateGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testUpdateGenre() {
        System.out.println("updateGenre");
        Genre genre1 = new Genre();
        genre1.setIsActive(true);
        genre1.setName("fantasy");
        genreDao.insertGenre(genre1);
        List<Genre> result = genreDao.getAllGenre();
        result.get(0).setName("scifi");
        genreDao.updateGenre(result.get(0));
        result = genreDao.getAllGenre();
        assertEquals("scifi", result.get(0).getName());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, result.get(0).getId());
    }

    /**
     * Test of findById method, of class MysqlGenreDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        System.out.println("updateGenre");
        Genre genre1 = new Genre();
        genre1.setIsActive(true);
        genre1.setName("fantasy");
        genreDao.insertGenre(genre1);
        List<Genre> result = genreDao.getAllGenre();
        Genre resultG = genreDao.findById(result.get(0).getId());
        assertEquals(resultG.getId(), result.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, result.get(0).getId());
    }

    /**
     * Test of addBookToGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testAddBookToGenre() {
        System.out.println("addBookToGenre");
        Genre genre = new Genre();
        genre.setIsActive(true);
        genreDao.insertGenre(genre);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        List<Genre> genres = genreDao.getAllGenre();
        List<Book> books = bookDao.getAllBooks();
        genreDao.addBookToGenre(books.get(0).getId(), genres.get(0).getId());
        genres = genreDao.getAllGenre();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(genres.get(0).getBooksWithGenre().get(0)), Long.valueOf(books.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeBookFromGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveBookFromGenre() {
        System.out.println("removeBookFromGenre");
        Genre genre = new Genre();
        genre.setIsActive(true);
        genreDao.insertGenre(genre);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        List<Genre> genres = genreDao.getAllGenre();
        List<Book> books = bookDao.getAllBooks();
        genreDao.addBookToGenre(books.get(0).getId(), genres.get(0).getId());
        genreDao.removeBookFromGenre(books.get(0).getId(), genres.get(0).getId());
        genres = genreDao.getAllGenre();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(genres.get(0).getBooksWithGenre().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());
    }

    /**
     * Test of removeBook method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        Genre genre1 = new Genre();
        Genre genre2 = new Genre();
        genre1.setIsActive(true);
        genre2.setIsActive(true);
        genreDao.insertGenre(genre1);
        genreDao.insertGenre(genre2);
        InterfaceBookDao bookDao = ObjectFactoryNaTesty.INSTANCE.getBookDao();
        Book book = new Book();
        book.setIsActive(true);
        bookDao.insertBook(book);
        List<Genre> genres = genreDao.getAllGenre();
        List<Book> books = bookDao.getAllBooks();
        genreDao.addBookToGenre(books.get(0).getId(), genres.get(0).getId());
        genreDao.addBookToGenre(books.get(0).getId(), genres.get(1).getId());
        genreDao.removeBook(books.get(0).getId());
        genres = genreDao.getAllGenre();
        books = bookDao.getAllBooks();
        assertEquals(Long.valueOf(genres.get(0).getBooksWithGenre().size()), Long.valueOf(0));
        assertEquals(Long.valueOf(genres.get(1).getBooksWithGenre().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(1).getId());
        jdbcTemplate.update(SqlQueries.DELETE_BOOK, books.get(0).getId());

    }

    /**
     * Test of addAuthorToGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testAddAuthorToGenre() {
        Genre genre = new Genre();
        genre.setIsActive(true);
        genreDao.insertGenre(genre);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        authorDao.insertAuthor(jano);
        List<Author> authors = authorDao.getAllAuthors();
        List<Genre> genres = genreDao.getAllGenre();
        genreDao.addAuthorToGenre(authors.get(0).getId(), genres.get(0).getId());
        genres = genreDao.getAllGenre();
        authors = authorDao.getAllAuthors();
        assertEquals(Long.valueOf(genres.get(0).getAuthorsWithGenre().get(0)), Long.valueOf(authors.get(0).getId()));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
    }

    /**
     * Test of removeAuthorFromGenre method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveAuthorFromGenre() {
        System.out.println("removeAuthorFromGenre");
        Genre genre = new Genre();
        genre.setIsActive(true);
        genreDao.insertGenre(genre);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        authorDao.insertAuthor(jano);
        List<Author> authors = authorDao.getAllAuthors();
        List<Genre> genres = genreDao.getAllGenre();
        genreDao.addAuthorToGenre(authors.get(0).getId(), genres.get(0).getId());
        genreDao.removeAuthorFromGenre(authors.get(0).getId(), genres.get(0).getId());
        genres = genreDao.getAllGenre();
        authors = authorDao.getAllAuthors();
        assertEquals(Long.valueOf(genres.get(0).getAuthorsWithGenre().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
    }

    /**
     * Test of removeAuthor method, of class MysqlGenreDao.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        Genre genre1 = new Genre();
        Genre genre2 = new Genre();
        genre1.setIsActive(true);
        genre2.setIsActive(true);
        genreDao.insertGenre(genre1);
        genreDao.insertGenre(genre2);
        InterfaceAuthorDao authorDao = ObjectFactoryNaTesty.INSTANCE.getAuthorDao();
        Author jano = new Author();
        jano.setName("Jano");
        jano.setIsActive(true);
        authorDao.insertAuthor(jano);
        List<Author> authors = authorDao.getAllAuthors();
        List<Genre> genres = genreDao.getAllGenre();
        genreDao.addAuthorToGenre(authors.get(0).getId(), genres.get(0).getId());
        genreDao.addAuthorToGenre(authors.get(0).getId(), genres.get(1).getId());
        genreDao.removeAuthor(authors.get(0).getId());
        genres = genreDao.getAllGenre();
        authors = authorDao.getAllAuthors();
        assertEquals(Long.valueOf(genres.get(0).getAuthorsWithGenre().size()), Long.valueOf(0));
        assertEquals(Long.valueOf(genres.get(1).getAuthorsWithGenre().size()), Long.valueOf(0));
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(0).getId());
        jdbcTemplate.update(SqlQueries.DELETE_GENRE, genres.get(1).getId());
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR, authors.get(0).getId());
    }
}
