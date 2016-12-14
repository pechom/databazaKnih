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

    public MysqlAuthorReviewDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AuthorReview> getAllReviews() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORREVIEWS, authorReviewRowMapper);

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_AUTHORREVIEWS, (ResultSet rs) -> {
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
                    if (!rs.wasNull()) {
                        Author author = authors.get(authorid);
                        if (author == null) {
                            author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                        }
                        if (author != null) {
                            authors.put(authorid, author);

                            if (author.isIsActive()) {
                                authorReview.setAuthor(author);
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
                            users.put(userid, user);

                            if (user.isIsActive()) {
                                authorReview.setUser(user);
                            }
                        }

                    }
                }
            }
            return reviews;
        });
    }

    @Override
    public void insertReview(AuthorReview review) {
        jdbcTemplate.update(SqlQueries.INSERT_AUTHORREVIEW, review.getRating(),
                review.getReview(), review.isIsActive(),
                review.getAuthor().getId(), review.getUser().getId());
    }

    @Override
    public void deleteReview(int id) {
        AuthorReview authorReview = findById(id);
        authorReview.setIsActive(false);
        updateReview(authorReview);
        jdbcTemplate.update(SqlQueries.DELETE_AUTHORREVIEW, id);
    }

    @Override
    public void updateReview(AuthorReview review) {
        jdbcTemplate.update(SqlQueries.UPDATE_AUTHORREVIEW, review.getRating(),
                review.getReview(), review.isIsActive(), review.getId());
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
                     if (!rs.wasNull()) {
                    Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(authorid);
                    if (author != null) {
                        if (author.isIsActive()) {
                            authorReview.setAuthor(author);
                        }
                    }
                     }
                    int userid = rs.getInt("user_iduser");
                     if (!rs.wasNull()) {
                    User user = ObjectFactory.INSTANCE.getUserDao().findById(userid);
                    if (user != null) {
                        if (user.isIsActive()) {
                            authorReview.setUser(user);
                        }
                    }
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

    @Override
    public void deleteReviewsWithAuthor(int idauthor) {
        jdbcTemplate.update(SqlQueries.DELETE_AUTHORREVIEWS_WITH_AUTHOR, idauthor);
    }

    @Override
    public void deleteReviewsWithUser(int iduser) {
        jdbcTemplate.update(SqlQueries.DELETE_AUTHORREVIEWS_WITH_USER, iduser);
    }
}
