package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MysqlTagDao implements InterfaceTagDao {

    private JdbcTemplate jdbcTemplate;

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

                        int bookid = rs.getInt("tagofbook.book_idbook");
                        if (rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                                books.put(bookid, book);
                            }
                            if (book.isIsActive()) {
                                tag.getBooksWithTag().add(book);
                            }
                        }
                    }
                }
                return tags;
            }
        });

    }

    @Override
    public void insertTag(Tag tag) {
        jdbcTemplate.update(SqlQueries.INSERT_TAG, tag.getName(), tag.isIsActive());
    }

    @Override
    public void deleteTag(int id) {
        Tag tag = findById(id);
        tag.setIsActive(false);
        updateTag(tag);
    }

    @Override
    public void updateTag(Tag tag) {
        jdbcTemplate.update(SqlQueries.UPDATE_TAG, tag.getName(),
                tag.isIsActive(), tag.getId());
    }

    @Override
    public Tag findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_TAG_BY_ID + id, new ResultSetExtractor<Tag>() {
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
                    int bookid = rs.getInt("tagofbook.book_idbook");
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                    if (book.isIsActive()) {
                        tag.getBooksWithTag().add(book);
                    }
                }
                return tag;
            }
        });
    }

    @Override
    public void undeleteTag(int id) {
        Tag tag = findById(id);
        tag.setIsActive(true);
        updateTag(tag);
    }

    @Override
    public void addBookToTag(int idbook, int idtag) {
        jdbcTemplate.update(SqlQueries.ADD_BOOK_TO_TAG, idtag, idbook);
    }

    @Override
    public void removeBookFromTag(int idbook, int idtag) {
        jdbcTemplate.update(SqlQueries.REMOVE_BOOK_FROM_TAG, idbook, idtag);
    }

    @Override
    public void removeBook(int idbook) {
        jdbcTemplate.update(SqlQueries.REMOVE_BOOK_FROM_TAG, idbook);
    }

}
