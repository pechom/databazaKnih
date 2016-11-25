package sk.upjs.ics.paz1c.databazaKnih;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MysqlUserDao implements InterfaceUserDao {

    private JdbcTemplate jdbcTemplate;
    private UserRowMapper userRowMapper = new UserRowMapper();

    public MysqlUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getAllUsers() {
//        return jdbcTemplate.query(SqlQueries.SELECT_ALL_USERS, userRowMapper);

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_USERS, new ResultSetExtractor<List<User>>() {
            @Override
            public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<User> users = new ArrayList<>();
                Map<Integer, User> friends = new HashMap<>();
                Map<Integer, User> favusers = new HashMap<>();
                Map<Integer, BookReview> bookreviews = new HashMap<>();
                Map<Integer, AuthorReview> authorreviews = new HashMap<>();
                Map<Integer, Book> readbooks = new HashMap<>();
                Map<Integer, Book> favbooks = new HashMap<>();
                Map<Integer, Book> wantedbooks = new HashMap<>();
                Map<Integer, Author> favauthors = new HashMap<>();
                Map<Integer, Book> reading = new HashMap<>();
                Map<Integer, Book> notes = new HashMap<>();
                User user = null;
                while (rs.next()) {
                    int id = rs.getInt("iduser");
                    if (user == null || user.getId() != id) {
                        user = new User();
                        user.setId(rs.getInt(id));
                        user.setIsAdmin(rs.getBoolean("isAdmin"));
                        Timestamp timestamp = rs.getTimestamp("lastLogin");
                        if (timestamp != null) {
                            user.setLastLogin(timestamp.toLocalDateTime());
                        }
                        user.setMail(rs.getString("mail"));
                        user.setName(rs.getString("name"));
                        user.setPasswordHash(rs.getString("passwordHash"));
                        user.setSalt(rs.getString("salt"));
                        user.setSurname(rs.getString("surname"));
                        user.setUserName(rs.getString("userName"));
                        user.setIsActive(rs.getBoolean("isActive"));

                        user.setAuthorReviews(new ArrayList<>());
                        user.setBookReviews(new ArrayList<>());
                        user.setFavoriteAuthors(new ArrayList());
                        user.setFavoriteBooks(new ArrayList<>());
                        user.setFavoriteReviewers(new ArrayList<>());
                        user.setFriends(new ArrayList<>());
                        user.setNote(new ArrayList<>());
                        user.setReadBooks(new ArrayList<>());
                        user.setReading(new ArrayList<>());
                        user.setWantedBooks(new ArrayList<>());
                        users.add(user);

                        int areviewid = rs.getInt("authorreview_idauthorreview");
                        if (rs.wasNull()) {
                            AuthorReview authorreview = authorreviews.get(areviewid);
                            if (authorreview == null) {
                                authorreview = ObjectFactory.INSTANCE.getAuthorReviewDao().findById(areviewid);
                                authorreviews.put(areviewid, authorreview);
                            }
                            user.getAuthorReviews().add(authorreview);
                        }

                        int breviewid = rs.getInt("bookreview_idbookreview");
                        if (rs.wasNull()) {
                            BookReview bookReview = bookreviews.get(breviewid);
                            if (bookReview == null) {
                                bookReview = ObjectFactory.INSTANCE.getBookReviewDao().findById(breviewid);
                                bookreviews.put(breviewid, bookReview);
                            }
                            user.getBookReviews().add(bookReview);
                        }

                        int favauthorid = rs.getInt("favoriteauthor_idauthor");
                        if (rs.wasNull()) {
                            Author author = favauthors.get(favauthorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(favauthorid);
                                favauthors.put(favauthorid, author);
                            }
                            user.getFavoriteAuthors().add(author);
                        }

                        int favbookid = rs.getInt("favoritebook_idbook");
                        if (rs.wasNull()) {
                            Book book = favbooks.get(favbookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(favbookid);
                                favbooks.put(favbookid, book);
                            }
                            user.getFavoriteBooks().add(book);
                        }

                        int favuserid = rs.getInt("favoriteuser_iduser");
                        if (rs.wasNull()) {
                            User favuser = favusers.get(favuserid);
                            if (favuser == null) {
                                favuser = ObjectFactory.INSTANCE.getUserDao().findById(favuserid);
                                favusers.put(favuserid, favuser);
                            }
                            user.getFavoriteReviewers().add(favuser);
                        }

                        int friendid = rs.getInt("frienduser_iduser");
                        if (rs.wasNull()) {
                            User frienduser = friends.get(friendid);
                            if (frienduser == null) {
                                frienduser = ObjectFactory.INSTANCE.getUserDao().findById(friendid);
                                friends.put(friendid, frienduser);
                            }
                            user.getFriends().add(frienduser);
                        }

                        int readid = rs.getInt("readbook_idbook");
                        if (rs.wasNull()) {
                            Book readbook = readbooks.get(readid);
                            if (readbook == null) {
                                readbook = ObjectFactory.INSTANCE.getBookDao().findById(readid);
                                readbooks.put(readid, readbook);
                            }
                            user.getReadBooks().add(readbook);
                        }

                        int wantedid = rs.getInt("wantedbook_idbook");
                        if (rs.wasNull()) {
                            Book wantedbook = wantedbooks.get(wantedid);
                            if (wantedbook == null) {
                                wantedbook = ObjectFactory.INSTANCE.getBookDao().findById(wantedid);
                                wantedbooks.put(wantedid, wantedbook);
                            }
                            user.getWantedBooks().add(wantedbook);
                        }

                        int noteid = rs.getInt("booknote_idbook");
                        String note = rs.getString("note");
                        if (rs.wasNull()) {
                            Book notebook = notes.get(noteid);
                            if (notebook == null) {
                                notebook = ObjectFactory.INSTANCE.getBookDao().findById(noteid);
                                notes.put(noteid, notebook);
                            }
                            Map<Book, String> bookWithNote = new HashMap<>();
                            bookWithNote.put(notebook, note);
                            user.getNote().add(bookWithNote);
                        }

                        int readingid = rs.getInt("readingbook_idbook");
                        int pocetReading = rs.getInt("pocetStran");
                        if (rs.wasNull()) {
                            Book readingBook = reading.get(readingid);
                            if (readingBook == null) {
                                readingBook = ObjectFactory.INSTANCE.getBookDao().findById(readingid);
                                reading.put(readingid, readingBook);
                            }
                            Map<Book, Integer> readingWithPage = new HashMap<>();
                            readingWithPage.put(readingBook, pocetReading);
                            user.getReading().add(readingWithPage);
                        }

                    }
                }
                return users;
            }
        });
    }

    @Override
    public void insertUser(User user) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    @Override
    public void deleteUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(int id) {
//            return jdbcTemplate.queryForObject(SqlQueries.SELECT_USER_BY_ID, userRowMapper, id);

        return jdbcTemplate.query(SqlQueries.SELECT_USER_BY_ID + id, new ResultSetExtractor<User>() {
            @Override
            public User extractData(ResultSet rs) throws SQLException, DataAccessException {
                User user = null;
                while (rs.next()) {
                    if (user == null || user.getId() != id) {
                        user = new User();
                        user.setId(rs.getInt(id));
                        user.setIsAdmin(rs.getBoolean("isAdmin"));
                        Timestamp timestamp = rs.getTimestamp("lastLogin");
                        if (timestamp != null) {
                            user.setLastLogin(timestamp.toLocalDateTime());
                        }
                        user.setMail(rs.getString("mail"));
                        user.setName(rs.getString("name"));
                        user.setPasswordHash(rs.getString("passwordHash"));
                        user.setSalt(rs.getString("salt"));
                        user.setSurname(rs.getString("surname"));
                        user.setUserName(rs.getString("userName"));
                        user.setIsActive(rs.getBoolean("isActive"));

                        user.setAuthorReviews(new ArrayList<>());
                        user.setBookReviews(new ArrayList<>());
                        user.setFavoriteAuthors(new ArrayList());
                        user.setFavoriteBooks(new ArrayList<>());
                        user.setFavoriteReviewers(new ArrayList<>());
                        user.setFriends(new ArrayList<>());
                        user.setNote(new ArrayList<>());
                        user.setReadBooks(new ArrayList<>());
                        user.setReading(new ArrayList<>());
                        user.setWantedBooks(new ArrayList<>());
                    }
                    int areviewid = rs.getInt("authorreview_idauthorreview");
                    int breviewid = rs.getInt("bookreview_idbookreview");
                    int favauthorid = rs.getInt("favoriteauthor_idauthor");
                    int favbookid = rs.getInt("favoritebook_idbook");
                    int favuserid = rs.getInt("favoriteuser_iduser");
                    int friendid = rs.getInt("frienduser_iduser");
                    int readid = rs.getInt("readbook_idbook");
                    int wantedid = rs.getInt("wantedbook_idbook");

                    int noteid = rs.getInt("booknote_idbook");
                    String note = rs.getString("note");
                    int readingid = rs.getInt("readingbook_idbook");
                    int pocetReading = rs.getInt("pocetStran");
                    AuthorReview authorreview = ObjectFactory.INSTANCE.getAuthorReviewDao().findById(areviewid);
                    user.getAuthorReviews().add(authorreview);
                    BookReview bookReview = ObjectFactory.INSTANCE.getBookReviewDao().findById(breviewid);
                    user.getBookReviews().add(bookReview);
                    Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(favauthorid);
                    user.getFavoriteAuthors().add(author);
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(favbookid);
                    user.getFavoriteBooks().add(book);
                    User favuser = ObjectFactory.INSTANCE.getUserDao().findById(favuserid);
                    user.getFavoriteReviewers().add(favuser);
                    User frienduser = ObjectFactory.INSTANCE.getUserDao().findById(friendid);
                    user.getFriends().add(frienduser);
                    Book readbook = ObjectFactory.INSTANCE.getBookDao().findById(readid);
                    user.getReadBooks().add(readbook);
                    Book wantedbook = ObjectFactory.INSTANCE.getBookDao().findById(wantedid);
                    user.getWantedBooks().add(wantedbook);
                    Book notebook = ObjectFactory.INSTANCE.getBookDao().findById(noteid);
                    Map<Book, String> bookWithNote = new HashMap<>();
                    bookWithNote.put(notebook, note);
                    user.getNote().add(bookWithNote);
                    Book readingBook = ObjectFactory.INSTANCE.getBookDao().findById(readingid);
                    Map<Book, Integer> readingWithPage = new HashMap<>();
                    readingWithPage.put(readingBook, pocetReading);
                    user.getReading().add(readingWithPage);
                }
                return user;
            }
        });
    }
}
