package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlRequestDao implements InterfaceRequestDao {

    private JdbcTemplate jdbcTemplate;
    private RequestRowMapper requestRowMapper = new RequestRowMapper();

    public MysqlRequestDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Request> getAllRequests() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_REQUESTS, requestRowMapper);
    }

    @Override
    public void insertRequest(Request request) {
         SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteRequest(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Request findById(int id) {
        try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_REQUEST_BY_ID, requestRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
