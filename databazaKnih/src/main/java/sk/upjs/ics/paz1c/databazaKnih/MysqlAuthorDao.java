package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlAuthorDao implements InterfaceAuthorDao {

    private JdbcTemplate jdbcTemplate;
    private AuthorRowMapper authorRowMapper = new AuthorRowMapper();

    public MysqlAuthorDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Author> getAllAuthors() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORS, authorRowMapper);
    }

    @Override
    public void insertAuthor(Author author) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author findById(int id) {
        try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_AUTHOR_BY_ID, authorRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
