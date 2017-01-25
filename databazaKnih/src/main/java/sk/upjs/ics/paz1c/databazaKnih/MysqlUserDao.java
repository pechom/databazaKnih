package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MysqlUserDao implements InterfaceUserDao {

    private JdbcTemplate jdbcTemplate;

    public MysqlUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getAllUsers() {

        return jdbcTemplate.query(SqlQueries.SELECT_ALL_USERS, new ResultSetExtractor<List<User>>() {
            @Override
            public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<User> users = new ArrayList<>();
                User user = null;
                while (rs.next()) {
                    int id = rs.getInt("iduser");
                    if (user == null || user.getId() != id) {
                        user = new User();
                        user.setId(id);
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

                        int areviewid = rs.getInt("authorreview.idauthorreview");
                        if (!rs.wasNull()) {
                            user.getAuthorReviews().add(areviewid);
                        }

                        int breviewid = rs.getInt("bookreview.idbookreview");
                        if (!rs.wasNull()) {
                            user.getBookReviews().add(breviewid);
                        }

                        int favauthorid = rs.getInt("favoriteauthor.favoriteauthor_idauthor");
                        if (!rs.wasNull()) {
                            user.getFavoriteAuthors().add(favauthorid);
                        }

                        int favbookid = rs.getInt("favoritebook.favoritebook_idbook");
                        if (!rs.wasNull()) {
                            user.getFavoriteBooks().add(favbookid);
                        }

                        int favuserid = rs.getInt("favoriteuser.favoriteuser");
                        if (!rs.wasNull()) {
                            user.getFavoriteReviewers().add(favuserid);
                        }

                        int friendid = rs.getInt("friend.friend");
                        if (!rs.wasNull()) {
                            user.getFriends().add(friendid);
                        }

                        int readid = rs.getInt("readbook.readbook_idbook");
                        if (!rs.wasNull()) {
                            user.getReadBooks().add(readid);
                        }

                        int wantedid = rs.getInt("wantedbook.wantedbook_idbook");
                        if (!rs.wasNull()) {
                            user.getWantedBooks().add(wantedid);
                        }

                        int noteid = rs.getInt("booknote.booknote_idbook");
                        String note = rs.getString("booknote.note");
                        if (!rs.wasNull()) {
                            Map<Integer, String> bookWithNote = new HashMap<>();
                            bookWithNote.put(noteid, note);
                            user.getNote().add(bookWithNote);
                        }

                        int readingid = rs.getInt("readingbook.readingbook_idbook");
                        int pocetReading = rs.getInt("readingbook.numberOfPages");
                        if (!rs.wasNull()) {
                            Map<Integer, Integer> readingWithPage = new HashMap<>();
                            readingWithPage.put(readingid, pocetReading);
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
        jdbcTemplate.update(SqlQueries.INSERT_USER, user.getUserName(), user.getPasswordHash(),
                user.getMail(), user.getName(), user.getSurname(),
                user.getLastLogin(), user.getSalt(), user.isIsAdmin(), user.isIsActive());
    }

    @Override
    public void deleteUser(int id) {
//        User user = findById(id);
//        user.setIsActive(false);
//        updateUser(user);
        jdbcTemplate.update(SqlQueries.DELETE_USER, id);
    }

    @Override
    public void updateUser(User user) {
        jdbcTemplate.update(SqlQueries.UPDATE_USER, user.getName(), user.getSurname(),
                user.getLastLogin(), user.isIsAdmin(), user.isIsActive(), user.getId());
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
                        user.setId(id);

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
                        // }
                        int areviewid = rs.getInt("authorreview.idauthorreview");
                        if (!rs.wasNull()) {
                            user.getAuthorReviews().add(areviewid);
                        }

                        int breviewid = rs.getInt("bookreview.idbookreview");
                        if (!rs.wasNull()) {
                            user.getBookReviews().add(breviewid);
                        }

                        int favauthorid = rs.getInt("favoriteauthor.favoriteauthor_idauthor");
                        if (!rs.wasNull()) {
                            user.getFavoriteAuthors().add(favauthorid);
                        }

                        int favbookid = rs.getInt("favoritebook.favoritebook_idbook");
                        if (!rs.wasNull()) {
                            user.getFavoriteBooks().add(favbookid);
                        }

                        int favuserid = rs.getInt("favoriteuser.favoriteuser");
                        if (!rs.wasNull()) {
                            user.getFavoriteReviewers().add(favuserid);
                        }

                        int friendid = rs.getInt("friend.friend");
                        if (!rs.wasNull()) {
                            user.getFriends().add(friendid);
                        }

                        int readid = rs.getInt("readbook.readbook_idbook");
                        if (!rs.wasNull()) {
                            user.getReadBooks().add(readid);
                        }

                        int wantedid = rs.getInt("wantedbook.wantedbook_idbook");
                        if (!rs.wasNull()) {
                            user.getWantedBooks().add(wantedid);
                        }

                        int noteid = rs.getInt("booknote.booknote_idbook");
                        String note = rs.getString("booknote.note");
                        if (!rs.wasNull()) {
                            Map<Integer, String> bookWithNote = new HashMap<>();
                            bookWithNote.put(noteid, note);
                            user.getNote().add(bookWithNote);
                        }

                        int readingid = rs.getInt("readingbook.readingbook_idbook");
                        int pocetReading = rs.getInt("readingbook.numberOfPages");
                        if (!rs.wasNull()) {
                            Map<Integer, Integer> readingWithPage = new HashMap<>();
                            readingWithPage.put(readingid, pocetReading);
                            user.getReading().add(readingWithPage);
                        }
                    }
                }
                return user;
            }
        });
    }

    @Override
    public void undeleteUser(int id) {
        User user = findById(id);
        user.setIsActive(true);
        updateUser(user);
    }

    @Override
    public void changePassword(User user) {
        jdbcTemplate.update(SqlQueries.CHANGE_PASSWORD, user.getSalt(), user.getPasswordHash(), user.getId());
    }

    @Override
    public void addReadBookToUser(int idbook, int iduser) {
        jdbcTemplate.update(SqlQueries.ADD_READ_BOOK, iduser, idbook);
    }

    @Override
    public void deleteReadBookFromUser(int idbook, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_READ_BOOK, iduser, idbook);
    }

    @Override
    public void addFavoriteBookToUser(int idbook, int iduser) {
        jdbcTemplate.update(SqlQueries.ADD_FAVORITE_BOOK, iduser, idbook);
    }

    @Override
    public void deleteFavoriteBookFromUser(int idbook, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_FAVORITE_BOOK, iduser, idbook);
    }

    @Override
    public void addWantedBookToUser(int idbook, int iduser) {
        jdbcTemplate.update(SqlQueries.ADD_WANTED_BOOK, iduser, idbook);
    }

    @Override
    public void deleteWantedBookFromUser(int idbook, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_WANTED_BOOK, iduser, idbook);
    }

    @Override
    public void removeAuthor(int idauthor) {
        jdbcTemplate.update(SqlQueries.REMOVE_AUTHOR_FROM_ALL_USERS, idauthor);
    }

    @Override
    public void addFavoriteAuthorToUser(int idauthor, int iduser) {
        jdbcTemplate.update(SqlQueries.ADD_FAVORITE_AUTHOR, iduser, idauthor);
    }

    @Override
    public void deleteFavoriteAuthorFromUser(int idauthor, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_FAVORITE_AUTHOR, iduser, idauthor);
    }

    @Override
    public void addFriendToUser(int idfriend, int iduser) {
        jdbcTemplate.update(SqlQueries.ADD_FRIEND, iduser, idfriend);
    }

    @Override
    public void deleteFriendFromUser(int idfriend, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_FRIEND, iduser, idfriend);
    }

    @Override
    public void addFavoriteReviewerToUser(int idreviewer, int iduser) {
        jdbcTemplate.update(SqlQueries.ADD_FAVORITE_REVIEWER, iduser, idreviewer);
    }

    @Override
    public void deleteFavoriteReviewerFromUser(int idreviewer, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_FAVORITE_REVIEWER, iduser, idreviewer);
    }

    @Override
    public void deleteBookReviewFromUser(int idreview, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_BOOKREVIEW, iduser, idreview);
    }

    @Override
    public void deleteAuthorReviewFromUser(int idreview, int iduser) {
        jdbcTemplate.update(SqlQueries.REMOVE_AUTHORREVIEW, iduser, idreview);
    }

    @Override
    public void addReadingBooksToUser(Map<Integer, Integer> reading, int iduser) {
        int book = 0;
        for (int book1 : reading.keySet()) {
            book = book1;
            jdbcTemplate.update(SqlQueries.ADD_READING_BOOK, iduser,
                    book, reading.get(book));
        }
    }

    @Override
    public void deleteReadingBooksFromUser(Map<Integer, Integer> reading, int iduser) {
        int book = 0;
        for (int book1 : reading.keySet()) {
            book = book1;
            jdbcTemplate.update(SqlQueries.REMOVE_READING_BOOK, iduser, book);
        }
    }

    @Override
    public void addNoteBooksToUser(Map<Integer, String> notebook, int iduser) {
        int book = 0;
        for (int book1 : notebook.keySet()) {
            book = book1;
            jdbcTemplate.update(SqlQueries.ADD_BOOK_NOTE, iduser,
                    book, notebook.get(book));
        }

    }

    @Override
    public void deleteNoteBooksFromUser(Map<Integer, String> notebook, int iduser) {
        int book = 0;
        for (int book1 : notebook.keySet()) {
            book = book1;
            jdbcTemplate.update(SqlQueries.REMOVE_BOOK_NOTE, iduser, book);
        }
    }
}
