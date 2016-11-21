package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlTagDao implements InterfaceTagDao {

    private JdbcTemplate jdbcTemplate;
    private TagRowMapper tagRowMapper = new TagRowMapper();

    public MysqlTagDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Tag> getAllTag() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_TAGS, tagRowMapper);
    }

    @Override
    public void insertTag(Tag tag) {
         SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteTag(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTag(Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tag findById(int id) {
      try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_TAG_BY_ID, tagRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
