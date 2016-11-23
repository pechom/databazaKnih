package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlTagDao implements InterfaceTagDao {

    private JdbcTemplate jdbcTemplate;
    private TagRowMapper tagRowMapper = new TagRowMapper();

    public MysqlTagDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Tag> getAllTag() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_TAGS, tagRowMapper);
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_TAGS, new ResultSetExtractor<List<Tag>>() {
            @Override
            public List<Tag> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Tag> tags = new ArrayList<>();
                Map<Integer, Book> books = new HashMap<>();
                Tag tag = null;
                while (rs.next()) {
                    int id = rs.getInt("idtag");
                    if (tag == null || tag.getId() != id) {
                        tag = new Tag();
                        tag.setId(id);
                        tag.setName(rs.getString("name"));
                        tag.setIsActive(rs.getBoolean("isActive"));
                        tag.setBooksWithTag(new ArrayList<>());
                        tags.add(tag);

                        int bookid = rs.getInt("book_idbook");
                        if (rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                                books.put(bookid, book);
                            }
                            tag.getBooksWithTag().add(book);
                        }
                    }
                }
                return tags;
            }
        });

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
        return jdbcTemplate.query(SqlQueries.SELECT_TAG_BY_ID, new ResultSetExtractor<Tag>() {
            @Override
            public Tag extractData(ResultSet rs) throws SQLException, DataAccessException {
                Tag tag = null;
                while (rs.next()) {
                    if (tag == null || tag.getId() != id) {
                        tag = new Tag();
                        tag.setId(id);
                        tag.setName(rs.getString("name"));
                        tag.setIsActive(rs.getBoolean("isActive"));
                        tag.setBooksWithTag(new ArrayList<>());
                    }
                    int bookid = rs.getInt("book_idbook");
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                    tag.getBooksWithTag().add(book);
                }
                return tag;
            }
        } );
    }

}
