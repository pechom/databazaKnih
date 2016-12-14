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

public class MysqlRequestDao implements InterfaceRequestDao {

    private JdbcTemplate jdbcTemplate;

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
                        if (!rs.wasNull()) {
                            Book book = books.get(bookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                                books.put(bookid, book);
                            }
                            if (book.isIsActive()) {
                                request.setBook(book);
                            }
                        }

                        int authorid = rs.getInt("author_idauthor");
                        if (!rs.wasNull()) {
                            Author author = authors.get(authorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                            }
                            if (author != null) {
                                if (author.isIsActive()) {
                                    request.setAuthor(author);
                                }
                            }
                        }

                        int userid = rs.getInt("user_iduser");
                        if (!rs.wasNull()) {
                            User user = users.get(userid);

                            if (user == null) {
                                user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                            }
                            if (user != null) {
                                if (user.isIsActive()) {
                                    request.setRequester(user);
                                }
                            }
                        }
                    }
                }
                return requests;
            }
        });
    }

    @Override
    public void insertRequest(Request request) {
        if (request.getBook() == null) {
            jdbcTemplate.update(SqlQueries.INSERT_REQUEST, request.getContent(),
                    null, request.getAuthor().getId(),
                    request.getRequester().getId(), request.isIsActive());
        } else {
            jdbcTemplate.update(SqlQueries.INSERT_REQUEST, request.getContent(),
                    request.getBook().getId(), null,
                    request.getRequester().getId(), request.isIsActive());

        }
    }

    @Override
    public void deleteRequest(int id) {
        Request request = findById(id);
        request.setIsActive(false);
        updateRequest(request);
        jdbcTemplate.update(SqlQueries.DELETE_REQUEST, id);
    }

    @Override
    public Request findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_REQUEST_BY_ID + id, new ResultSetExtractor<Request>() {
            @Override
            public Request extractData(ResultSet rs) throws SQLException, DataAccessException {
                Request request = null;
                while (rs.next()) {
                    if (request == null || request.getId() != id) {
                        request = new Request();
                        request.setId(id);
                        request.setContent(rs.getString("content"));
                    }
                    int authorid = rs.getInt("author_idauthor");
                    if (!rs.wasNull()) {
                        Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                        if (author != null) {
                            if (author.isIsActive()) {
                                request.setAuthor(author);
                            }
                        }
                    }
                    int bookid = rs.getInt("book_idbook");
                    if (!rs.wasNull()) {
                        Book book = ObjectFactory.INSTANCE.getBookDao().findById(bookid);
                        if (book != null) {
                            if (book.isIsActive()) {
                                request.setBook(book);
                            }
                        }
                    }
                    int userid = rs.getInt("user_iduser");
                    if (!rs.wasNull()) {
                        User user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                        if (user != null) {
                            if (user.isIsActive()) {
                                request.setRequester(user);
                            }
                        }
                    }
                }
                return request;
            }
        });
    }

    @Override
    public void undeleteRequest(int id) {
        Request request = findById(id);
        request.setIsActive(true);
        updateRequest(request);
    }

    @Override
    public void updateRequest(Request request) {
        jdbcTemplate.update(SqlQueries.UPDATE_REQUEST, request.getContent(),
                request.isIsActive(), request.getId());
    }

    @Override
    public void deleteAllWithRequester(int iduser) {
        jdbcTemplate.update(SqlQueries.DELETE_REQUESTS_WITH_USER, iduser);
    }

    @Override
    public void deleteAllWithBook(int idbook) {
        jdbcTemplate.update(SqlQueries.DELETE_REQUESTS_WITH_BOOK, idbook);
    }

    @Override
    public void deleteAllWithAuthor(int idauthor) {
        jdbcTemplate.update(SqlQueries.DELETE_REQUESTS_WITH_AUTHOR, idauthor);
    }

}
