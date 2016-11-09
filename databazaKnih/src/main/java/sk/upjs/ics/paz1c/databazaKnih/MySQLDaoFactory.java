package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum MySQLDaoFactory {

    INSTANCE;

    private InterfaceUserDao userDao;
    private InterfaceBookDao bookDao;
    private InterfaceAuthorDao authorDao;
    private InterfaceUserGroupDao userGroupDao;
    private InterfaceBookReviewDao bookReviewDao;
    private InterfaceAuthorReviewDao authorReviewDao;
    private InterfaceTagDao tagDao;
    private InterfaceRequestDao requestDao;

    private MySQLDaoFactory() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("databaza-knih");
        dataSource.setUser("root");
        dataSource.setPassword("yareyare");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        userDao = new MysqlUserDao(jdbcTemplate);
        bookDao = new MysqlBookDao(jdbcTemplate);
        authorDao = new MysqlAuthorDao(jdbcTemplate);
        userGroupDao = new MysqlUserGroupDao(jdbcTemplate);
        bookReviewDao=new MysqlBookReviewDao(jdbcTemplate);
        authorReviewDao=new MysqlAuthorReviewDao(jdbcTemplate);
        tagDao=new MysqlTagDao(jdbcTemplate);
        requestDao=new MysqlRequestDao(jdbcTemplate);
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

    public InterfaceUserGroupDao getUserGroupDao() {
        return userGroupDao;
    }
    public InterfaceBookReviewDao getBookReviewDao(){
        return bookReviewDao;
    }
    
   public InterfaceAuthorReviewDao getAuthorReviewDao(){
       return authorReviewDao;
   }
   public InterfaceTagDao getTagDao(){
       return tagDao;
   }
   public InterfaceRequestDao getRequestDao(){
       return requestDao;
   }

}
