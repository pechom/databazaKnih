package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlAuthorDao implements InterfaceAuthorDao {

    JdbcTemplate jdbcTemplate;

    public MysqlAuthorDao(JdbcTemplate jdbcTemplat) {
        this.jdbcTemplate = jdbcTemplat;
    }

    @Override
    public List<Author> getAllAuthors() {
        String sql = "SELECT * FROM author";
        return jdbcTemplate.query(sql, new AuthorRowMapper());
    }

    @Override
    public void insertAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
