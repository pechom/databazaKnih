package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlGenreDao implements InterfaceGenreDao {

    private JdbcTemplate jdbcTemplate;
    private GenreRowMapper genreRowMapper = new GenreRowMapper();

    public MysqlGenreDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Genre> getAllGenre() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_GENRES, genreRowMapper);
    }

    @Override
    public void insertGenre(Genre genre) {
         SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteGenre(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateGenre(Genre genre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Genre findById(int id) {
        try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_GENRE_BY_ID, genreRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
