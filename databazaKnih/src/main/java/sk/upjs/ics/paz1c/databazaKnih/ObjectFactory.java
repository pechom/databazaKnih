package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum ObjectFactory {

    INSTANCE;

    private InterfaceUserDao userDao;
    private InterfaceBookDao bookDao;
    private InterfaceAuthorDao authorDao;
    private InterfaceBookReviewDao bookReviewDao;
    private InterfaceAuthorReviewDao authorReviewDao;
    private InterfaceTagDao tagDao;
    private InterfaceRequestDao requestDao;
    private InterfaceGenreDao genreDao;
    private JdbcTemplate jdbcTemplate;

    private ObjectFactory() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("databaza-knih");
        dataSource.setUrl("jdbc:mysql://localhost/databaza-knih");
        dataSource.setUser("root");
        dataSource.setPassword("yareyare");

        jdbcTemplate = new JdbcTemplate(dataSource);

        userDao = new MysqlUserDao(jdbcTemplate);
        bookDao = new MysqlBookDao(jdbcTemplate);
        authorDao = new MysqlAuthorDao(jdbcTemplate);
        bookReviewDao = new MysqlBookReviewDao(jdbcTemplate);
        authorReviewDao = new MysqlAuthorReviewDao(jdbcTemplate);
        tagDao = new MysqlTagDao(jdbcTemplate);
        requestDao = new MysqlRequestDao(jdbcTemplate);
        genreDao=new MysqlGenreDao(jdbcTemplate);
    }

    public JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate != null) {
            return jdbcTemplate;
        } else {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setDatabaseName("databaza-knih");
            dataSource.setUser("root");
            dataSource.setPassword("yareyare");

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

    public InterfaceRequestDao getRequestDao() {
        return requestDao;
    }
    
    public InterfaceGenreDao getGenreDao(){
        return genreDao;
    }

}
