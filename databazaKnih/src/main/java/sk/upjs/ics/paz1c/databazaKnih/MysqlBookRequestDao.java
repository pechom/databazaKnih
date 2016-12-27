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

public class MysqlBookRequestDao implements InterfaceBookRequestDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlBookRequestDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BookRequest> getAllRequests() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_BOOK_REQUESTS, new ResultSetExtractor<List<BookRequest>>() {
            @Override
            public List<BookRequest> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<BookRequest> requests = new ArrayList<>();
                Map<Integer, Book> books = new HashMap<>();
                Map<Integer, User> users = new HashMap<>();
                BookRequest request = null;
                while (rs.next()) {
                    int id = rs.getInt("idbookrequest");
                    if (request == null || request.getId() != id) {
                        request = new BookRequest();
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
    public void insertRequest(BookRequest request) {
        jdbcTemplate.update(SqlQueries.INSERT_BOOK_REQUEST,
                request.getContent(), request.getBook().getId(),
                request.getRequester().getId(), request.isIsActive());
    }

    @Override
    public void updateRequest(BookRequest request) {
        jdbcTemplate.update(SqlQueries.UPDATE_BOOK_REQUEST, request.getContent(),
                request.isIsActive(), request.getId());
    }

    @Override
    public void deleteRequest(int id) {
        BookRequest request = findById(id);
        request.setIsActive(false);
        updateRequest(request);
        jdbcTemplate.update(SqlQueries.DELETE_BOOK_REQUEST, id);
    }

    @Override
    public void deleteAllWithRequester(int iduser) {
        jdbcTemplate.update(SqlQueries.DELETE_BOOK_REQUESTS_WITH_USER, iduser);
    }

    @Override
    public void deleteAllWithBook(int idbook) {
       jdbcTemplate.update(SqlQueries.DELETE_BOOK_REQUESTS_WITH_BOOK, idbook);
    }

    @Override
    public void undeleteRequest(int id) {
        BookRequest request = findById(id);
        request.setIsActive(true);
        updateRequest(request);
    }

    @Override
    public BookRequest findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_BOOK_REQUEST_BY_ID + id, new ResultSetExtractor<BookRequest>() {
            @Override
            public BookRequest extractData(ResultSet rs) throws SQLException, DataAccessException {
                BookRequest request = null;
                while (rs.next()) {
                    if (request == null || request.getId() != id) {
                        request = new BookRequest();
                        request.setId(id);
                        request.setContent(rs.getString("content"));
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
}
