package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MysqlAuthorRequestDao implements InterfaceAuthorRequestDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlAuthorRequestDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AuthorRequest> getAllRequests() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHOR_REQUESTS, new ResultSetExtractor<List<AuthorRequest>>() {
            @Override
            public List<AuthorRequest> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<AuthorRequest> requests = new ArrayList<>();

                AuthorRequest request = null;
                while (rs.next()) {
                    int id = rs.getInt("idauthorrequest");
                    if (request == null || request.getId() != id) {
                        request = new AuthorRequest();
                        request.setContent(rs.getString("content"));
                        request.setId(id);
                        requests.add(request);

                        int authorid = rs.getInt("author_idauthor");
                        if (!rs.wasNull()) {
                            request.setAuthor(authorid);
                        } else {
                            request.setAuthor(0);
                        }

                        int userid = rs.getInt("user_iduser");
                        if (!rs.wasNull()) {
                            request.setRequester(userid);
                        } else {
                            request.setRequester(0);
                        }
                    }
                }
                return requests;
            }
        });
    }

    @Override
    public void insertRequest(AuthorRequest request) {
        jdbcTemplate.update(SqlQueries.INSERT_AUTHOR_REQUEST,
                request.getContent(), request.getAuthor(),
                request.getRequester(), request.isIsActive());

    }

    @Override
    public void deleteRequest(int id) {
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR_REQUEST, id);
    }

    @Override
    public AuthorRequest findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_AUTHOR_REQUEST_BY_ID + id, new ResultSetExtractor<AuthorRequest>() {
            @Override
            public AuthorRequest extractData(ResultSet rs) throws SQLException, DataAccessException {
                AuthorRequest request = null;
                while (rs.next()) {
                    if (request == null || request.getId() != id) {
                        request = new AuthorRequest();
                        request.setId(id);
                        request.setContent(rs.getString("content"));
                    }
                    int authorid = rs.getInt("author_idauthor");
                    if (!rs.wasNull()) {
                        request.setAuthor(authorid);
                    } else {
                        request.setAuthor(0);
                    }

                    int userid = rs.getInt("user_iduser");
                    if (!rs.wasNull()) {
                        request.setRequester(userid);
                    } else {
                        request.setRequester(0);
                    }
                }
                return request;
            }
        });
    }

    @Override
    public void undeleteRequest(int id) {
        AuthorRequest request = findById(id);
        request.setIsActive(true);
        updateRequest(request);
    }

    @Override
    public void updateRequest(AuthorRequest request) {
        jdbcTemplate.update(SqlQueries.UPDATE_AUTHOR_REQUEST, request.getContent(),
                request.isIsActive(), request.getId());
    }

    @Override
    public void deleteAllWithRequester(int iduser) {
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR_REQUESTS_WITH_USER, iduser);
    }

    @Override
    public void deleteAllWithAuthor(int idauthor) {
        jdbcTemplate.update(SqlQueries.DELETE_AUTHOR_REQUESTS_WITH_AUTHOR, idauthor);
    }
}
