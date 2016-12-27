package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
import static java.time.ZoneOffset.UTC;
import org.springframework.jdbc.core.JdbcTemplate;

public enum ObjectFactory {

    INSTANCE;

    private InterfaceUserDao userDao;
    private InterfaceBookDao bookDao;
    private InterfaceAuthorDao authorDao;
    private InterfaceBookReviewDao bookReviewDao;
    private InterfaceAuthorReviewDao authorReviewDao;
    private InterfaceTagDao tagDao;
    private InterfaceAuthorRequestDao authorRequestDao;
    private InterfaceBookRequestDao bookRequestDao;
    private InterfaceGenreDao genreDao;
    private JdbcTemplate jdbcTemplate;
    private UserManager userManager;
    private AuthorManager authorManager;
    private AuthorReviewManager authorreviewManager;
    private BookManager bookManager;
    private BookReviewManager bookreviewManager;
    private GenreManager genreManager;
    private AuthorRequestManager authorRequestManager;
    private BookRequestManager bookRequestManager;
    private TagManager tagManager;

    private ObjectFactory() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("databaza-knih");
        dataSource.setURL("jdbc:mysql://localhost/databaza-knih?serverTimezone=Europe/Bratislava");
        dataSource.setUser("root");
        dataSource.setPassword("yareyare");

        jdbcTemplate = new JdbcTemplate(dataSource);

        userDao = new MysqlUserDao(jdbcTemplate);
        bookDao = new MysqlBookDao(jdbcTemplate);
        authorDao = new MysqlAuthorDao(jdbcTemplate);
        bookReviewDao = new MysqlBookReviewDao(jdbcTemplate);
        authorReviewDao = new MysqlAuthorReviewDao(jdbcTemplate);
        tagDao = new MysqlTagDao(jdbcTemplate);
        authorRequestDao = new MysqlAuthorRequestDao(jdbcTemplate);
        bookRequestDao=new MysqlBookRequestDao(jdbcTemplate);
        genreDao = new MysqlGenreDao(jdbcTemplate);
    }

    public JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate != null) {
            return jdbcTemplate;
        } else {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setDatabaseName("databaza-knih");
            dataSource.setUser("root");
            dataSource.setPassword("Kope1234");

            jdbcTemplate = new JdbcTemplate(dataSource);
            return jdbcTemplate;
        }
    }

    public InterfaceUserDao getUserDao() {
        return userDao;
    }

    public InterfaceBookDao getBookDao() {
        return bookDao;
    }

    public InterfaceAuthorDao getAuthorDao() {
        return authorDao;
    }

    public InterfaceBookReviewDao getBookReviewDao() {
        return bookReviewDao;
    }

    public InterfaceAuthorReviewDao getAuthorReviewDao() {
        return authorReviewDao;
    }

    public InterfaceTagDao getTagDao() {
        return tagDao;
    }

    public InterfaceAuthorRequestDao getAuthorRequestDao() {
        return authorRequestDao;
    }
    
      public InterfaceBookRequestDao getBookRequestDao() {
        return bookRequestDao;
    }

    public InterfaceGenreDao getGenreDao() {
        return genreDao;
    }

    public UserManager getUserManager() {
        if (userManager == null) {
            userManager = new DefaultUserManager();
        }
        return userManager;
    }

    public AuthorManager getAuthorManager() {
        if (authorManager == null) {
            authorManager = new DefaultAuthorManager();
        }
        return authorManager;
    }

    public AuthorReviewManager getAuthorReviewManager() {
        if (authorreviewManager == null) {
            authorreviewManager = new DefaultAuthorReviewManager();
        }
        return authorreviewManager;
    }

    public BookManager getBookManager() {
        if (bookManager == null) {
            bookManager = new DefaultBookManager();
        }
        return bookManager;
    }

    public BookReviewManager getBookReviewManager() {
        if (bookreviewManager == null) {
            bookreviewManager = new DefaultBookReviewManager();
        }
        return bookreviewManager;
    }

    public GenreManager getGenreManager() {
        if (genreManager == null) {
            genreManager = new DefaultGenreManager();
        }
        return genreManager;
    }

    public AuthorRequestManager getAuthorRequestManager() {
        if (authorRequestManager == null) {
            authorRequestManager = new DefaultAuthorRequestManager();
        }
        return authorRequestManager;
    }

    public TagManager getTagManager() {
        if (tagManager == null) {
            tagManager = new DefaultTagManager();
        }
        return tagManager;
    }

}
