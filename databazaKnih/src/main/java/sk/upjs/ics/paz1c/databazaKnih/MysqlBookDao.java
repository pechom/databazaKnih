package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlBookDao implements InterfaceBookDao {

    private JdbcTemplate jdbcTemplate;
    private BookRowMapper bookRowMapper = new BookRowMapper();

    public MysqlBookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> getAllBooks() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOKS, bookRowMapper);
    }

    @Override
    public void insertBook(Book book) {
         SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book findById(int id) {
      try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_BOOK_BY_ID, bookRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
