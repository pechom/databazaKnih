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

public class MysqlRequestDao implements InterfaceRequestDao {

    private JdbcTemplate jdbcTemplate;
    private RequestRowMapper requestRowMapper = new RequestRowMapper();

    public MysqlRequestDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Request> getAllRequests() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_REQUESTS, requestRowMapper);
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_REQUESTS, new ResultSetExtractor<List<Request>>() {
            @Override
            public List<Request> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Request> requests = new ArrayList<>();
                Map<Integer, Book> books = new HashMap<>();
                Map<Integer, Author> authors = new HashMap<>();
                Map<Integer, User> users = new HashMap<>();
                Request request = null;
                while (rs.next()) {
                    int id = rs.getInt("idrequest");
                    if (request == null || request.getId() != id) {
                        request = new Request();
                        request.setContent(rs.getString("content"));
                        request.setId(id);
                        requests.add(request);

                        int bookid = rs.getInt("book_idbook");
                        if (rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                                books.put(bookid, book);
                            }
                            request.setBook(book);
                        }

                        int authorid = rs.getInt("author_idauthor");
                        if (rs.wasNull()) {
                            Author author = authors.get(authorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                            }
                            request.setAuthor(author);
                        }

                        int userid = rs.getInt("user_iduser");
                        if (rs.wasNull()) {
                            User user = users.get(userid);
                            if (user == null) {
                                user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                            }
                            request.setRequester(user);
                        }
                    }
                }
                return requests;
            }
        });
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
        return jdbcTemplate.query(SqlQueries.SELECT_REQUEST_BY_ID, new ResultSetExtractor<Request>() {
            @Override
            public Request extractData(ResultSet rs) throws SQLException, DataAccessException {
                Request request = null;
                while (rs.next()) {
                    if (request == null || request.getId() != id) {
                        request = new Request();
                        request.setId(id);
                        request.setContent(rs.getString("content"));
                    }
                    int bookid = rs.getInt("book_idbook");
                    int userid = rs.getInt("user_iduser");
                    int authorid = rs.getInt("author_idauthor");
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                    User user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                    Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                    request.setAuthor(author);
                    request.setBook(book);
                    request.setRequester(user);
                }
                return request;
            }
        });
    }

}
