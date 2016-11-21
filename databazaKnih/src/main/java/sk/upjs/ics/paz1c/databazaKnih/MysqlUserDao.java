package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlUserDao implements InterfaceUserDao {

    private JdbcTemplate jdbcTemplate;
    private UserRowMapper userRowMapper = new UserRowMapper();

    public MysqlUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_USERS, userRowMapper);
    }

    @Override
    public void insertUser(User user) {
         SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(int id) {
        try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_USER_BY_ID, userRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
