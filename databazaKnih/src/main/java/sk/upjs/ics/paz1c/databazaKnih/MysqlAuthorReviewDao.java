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

public class MysqlAuthorReviewDao implements InterfaceAuthorReviewDao {

    private JdbcTemplate jdbcTemplate;
    private AuthorReviewRowMapper authorReviewRowMapper = new AuthorReviewRowMapper();

    public MysqlAuthorReviewDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AuthorReview> getAllReviews() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORREVIEWS, authorReviewRowMapper);

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORREVIEWS, new ResultSetExtractor<List<AuthorReview>>() {
            @Override
            public List<AuthorReview> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<AuthorReview> reviews = new ArrayList<>();
                Map<Integer, Author> authors = new HashMap<>();
                Map<Integer, User> users = new HashMap<>();
                AuthorReview authorReview = null;
                while (rs.next()) {
                    int id = rs.getInt("idauthorreview");
                    if (authorReview == null || authorReview.getId() != id) {
                        authorReview = new AuthorReview();
                        authorReview.setId(id);
                        authorReview.setRating(rs.getInt("rating"));
                        authorReview.setReview(rs.getString("review"));
                        reviews.add(authorReview);

                        int authorid = rs.getInt("author_idauthor");
                        if (rs.wasNull()) {
                            Author author = authors.get(authorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                                authors.put(authorid, author);
                            }
                            if (author.isIsActive()) {
                                authorReview.setAuthor(author);
                            }
                        }

                        int userid = rs.getInt("user_iduser");
                        if (rs.wasNull()) {
                            User user = users.get(userid);
                            if (user == null) {
                                user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                                users.put(userid, user);
                            }
                            if (user.isIsActive()) {
                                authorReview.setUser(user);
                            }
                        }
                    }
                }
                return reviews;
            }
        });
    }

    @Override
    public void insertReview(AuthorReview review) {
        jdbcTemplate.update(SqlQueries.INSERT_AUTHORREVIEW, review.getRating(),
                review.getReview(), review.isIsActive());
    }

    @Override
    public void deleteReview(int id) {
        AuthorReview authorReview = findById(id);
        authorReview.setIsActive(false);
        updateReview(authorReview);
    }

    @Override
    public void updateReview(AuthorReview review) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AuthorReview findById(int id) {
        return jdbcTemplate.query(SqlQueries.SELECT_AUTHORREVIEW_BY_ID + id, new ResultSetExtractor<AuthorReview>() {
            @Override
            public AuthorReview extractData(ResultSet rs) throws SQLException, DataAccessException {
                AuthorReview authorReview = null;
                while (rs.next()) {
                    if (authorReview == null || authorReview.getId() != id) {
                        authorReview = new AuthorReview();
                        authorReview.setId(id);
                        authorReview.setRating(rs.getInt("rating"));
                        authorReview.setReview(rs.getString("review"));

                    }
                    int authorid = rs.getInt("author_idauthor");
                    int userid = rs.getInt("user_iduser");
                    Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                    if (author.isIsActive()) {
                        authorReview.setAuthor(author);
                    }
                    User user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                    if (user.isIsActive()) {
                        authorReview.setUser(user);
                    }
                }

                return authorReview;
            }
        });
    }

    @Override
    public void undeleteReview(int id) {
        AuthorReview authorReview = findById(id);
        authorReview.setIsActive(true);
        updateReview(authorReview);
    }
}
