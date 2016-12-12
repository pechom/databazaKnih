package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Integer;
import java.util.Iterator;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

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

                        int areviewid = rs.getInt("authorreview.idauthorreview");
                        if (rs.wasNull()) {
                            AuthorReview authorreview = authorreviews.get(areviewid);
                            if (authorreview == null) {
                                authorreview = ObjectFactory.INSTANCE.getAuthorReviewDao().findById(areviewid);
                                authorreviews.put(areviewid, authorreview);
                            }
                            if (authorreview.isIsActive()) {
                                user.getAuthorReviews().add(authorreview);
                            }
                        }

                        int breviewid = rs.getInt("bookreview.idbookreview");
                        if (rs.wasNull()) {
                            BookReview bookReview = bookreviews.get(breviewid);
                            if (bookReview == null) {
                                bookReview = ObjectFactory.INSTANCE.getBookReviewDao().findById(breviewid);
                                bookreviews.put(breviewid, bookReview);
                            }
                            if (bookReview.isIsActive()) {
                                user.getBookReviews().add(bookReview);
                            }
                        }

                        int favauthorid = rs.getInt("favoriteauthor.faveriteauthor_idauthor");
                        if (rs.wasNull()) {
                            Author author = favauthors.get(favauthorid);
                            if (author == null) {
                                author = ObjectFactory.INSTANCE.getAuthorDao().findById(favauthorid);
                                favauthors.put(favauthorid, author);
                            }
                            if (author.isIsActive()) {
                                user.getFavoriteAuthors().add(author);
                            }
                        }

                        int favbookid = rs.getInt("favoritebook.favoritebook_idbook");
                        if (rs.wasNull()) {
                            Book book = favbooks.get(favbookid);
                            if (book == null) {
                                book = ObjectFactory.INSTANCE.getBookDao().findById(favbookid);
                                favbooks.put(favbookid, book);
                            }
                            if (book.isIsActive()) {
                                user.getFavoriteBooks().add(book);
                            }
                        }

                        int favuserid = rs.getInt("favoriteuser.favoriteuser_iduser");
                        if (rs.wasNull()) {
                            User favuser = favusers.get(favuserid);
                            if (favuser == null) {
                                favuser = ObjectFactory.INSTANCE.getUserDao().findById(favuserid);
                                favusers.put(favuserid, favuser);
                            }
                            if (favuser.isIsActive()) {
                                user.getFavoriteReviewers().add(favuser);
                            }
                        }

                        int friendid = rs.getInt("friend.friend");
                        if (rs.wasNull()) {
                            User frienduser = friends.get(friendid);
                            if (frienduser == null) {
                                frienduser = ObjectFactory.INSTANCE.getUserDao().findById(friendid);
                                friends.put(friendid, frienduser);
                            }
                            if (frienduser.isIsActive()) {
                                user.getFriends().add(frienduser);
                            }
                        }

                        int readid = rs.getInt("readbook.readbook_idbook");
                        if (rs.wasNull()) {
                            Book readbook = readbooks.get(readid);
                            if (readbook == null) {
                                readbook = ObjectFactory.INSTANCE.getBookDao().findById(readid);
                                readbooks.put(readid, readbook);
                            }
                            if (readbook.isIsActive()) {
                                user.getReadBooks().add(readbook);
                            }
                        }

                        int wantedid = rs.getInt("wantedbook.wantedbook_idbook");
                        if (rs.wasNull()) {
                            Book wantedbook = wantedbooks.get(wantedid);
                            if (wantedbook == null) {
                                wantedbook = ObjectFactory.INSTANCE.getBookDao().findById(wantedid);
                                wantedbooks.put(wantedid, wantedbook);
                            }
                            if (wantedbook.isIsActive()) {
                                user.getWantedBooks().add(wantedbook);
                            }
                        }

                        int noteid = rs.getInt("booknote.booknote_idbook");
                        String note = rs.getString("booknote.note");
                        if (rs.wasNull()) {
                            Book notebook = notes.get(noteid);
                            if (notebook == null) {
                                notebook = ObjectFactory.INSTANCE.getBookDao().findById(noteid);
                                notes.put(noteid, notebook);
                            }
                            Map<Book, String> bookWithNote = new HashMap<>();
                            bookWithNote.put(notebook, note);
                            if (notebook.isIsActive()) {
                                user.getNote().add(bookWithNote);
                            }
                        }

                        int readingid = rs.getInt("readingbook.readingbook_idbook");
                        int pocetReading = rs.getInt("readingbook.numberOfPages");
                        if (rs.wasNull()) {
                            Book readingBook = reading.get(readingid);
                            if (readingBook == null) {
                                readingBook = ObjectFactory.INSTANCE.getBookDao().findById(readingid);
                                reading.put(readingid, readingBook);
                            }
                            Map<Book, Integer> readingWithPage = new HashMap<>();
                            readingWithPage.put(readingBook, pocetReading);
                            if (readingBook.isIsActive()) {
                                user.getReading().add(readingWithPage);
                            }
                        }

                    }
                }
                return users;
            }
        });
    }

    @Override
    public void insertUser(User user) {
        jdbcTemplate.update(SqlQueries.INSERT_USER, user.getName(), user.getPasswordHash(),
                user.getMail(), user.getName(), user.getSurname(),
                user.getLastLogin(), user.getSalt(), user.isIsAdmin(), user.isIsActive());
    }

    @Override
    public void deleteUser(int id) {
        User user = findById(id);
        user.setIsActive(false);
        updateUser(user);
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
                    int areviewid = rs.getInt("authorreview.idauthorreview");
                    int breviewid = rs.getInt("bookreview.idbookreview");
                    int favauthorid = rs.getInt("favoriteauthor.faveriteauthor_idauthor");
                    int favbookid = rs.getInt("favoritebook.favoritebook_idbook");
                    int favuserid = rs.getInt("favoriteuser.favoriteuser_iduser");
                    int friendid = rs.getInt("friend.friend");
                    int readid = rs.getInt("readbook.readbook_idbook");
                    int wantedid = rs.getInt("wantedbook.wantedbook_idbook");

                    int noteid = rs.getInt("booknote.booknote_idbook");
                    String note = rs.getString("booknote.note");
                    int readingid = rs.getInt("readingbook.readingbook_idbook");
                    int pocetReading = rs.getInt("readingbook.numberOfPages");
                    AuthorReview authorreview = ObjectFactory.INSTANCE.getAuthorReviewDao().findById(areviewid);
                    if (authorreview.isIsActive()) {
                        user.getAuthorReviews().add(authorreview);
                    }
                    BookReview bookReview = ObjectFactory.INSTANCE.getBookReviewDao().findById(breviewid);
                    if (bookReview.isIsActive()) {
                        user.getBookReviews().add(bookReview);
                    }
                    Author author = ObjectFactory.INSTANCE.getAuthorDao().findById(favauthorid);
                    if (author.isIsActive()) {
                        user.getFavoriteAuthors().add(author);
                    }
                    Book book = ObjectFactory.INSTANCE.getBookDao().findById(favbookid);
                    if (book.isIsActive()) {
                        user.getFavoriteBooks().add(book);
                    }
                    User favuser = ObjectFactory.INSTANCE.getUserDao().findById(favuserid);
                    if (favuser.isIsActive()) {
                        user.getFavoriteReviewers().add(favuser);
                    }
                    User frienduser = ObjectFactory.INSTANCE.getUserDao().findById(friendid);
                    if (frienduser.isIsActive()) {
                        user.getFriends().add(frienduser);
                    }
                    Book readbook = ObjectFactory.INSTANCE.getBookDao().findById(readid);
                    if (readbook.isIsActive()) {
                        user.getReadBooks().add(readbook);
                    }
                    Book wantedbook = ObjectFactory.INSTANCE.getBookDao().findById(wantedid);
                    if (wantedbook.isIsActive()) {
                        user.getWantedBooks().add(wantedbook);
                    }
                    Book notebook = ObjectFactory.INSTANCE.getBookDao().findById(noteid);
                    if (notebook.isIsActive()) {
                        Map<Book, String> bookWithNote = new HashMap<>();
                        bookWithNote.put(notebook, note);
                        user.getNote().add(bookWithNote);
                    }
                    Book readingBook = ObjectFactory.INSTANCE.getBookDao().findById(readingid);
                    if (readingBook.isIsActive()) {
                        Map<Book, Integer> readingWithPage = new HashMap<>();
                        readingWithPage.put(readingBook, pocetReading);
                        user.getReading().add(readingWithPage);
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
    public void addReadingBooksToUser(Map<Book, Integer> reading, int iduser) {
        Book book = null;
        for (Book book1 : reading.keySet()) {
            book = book1;
        }

        jdbcTemplate.update(SqlQueries.ADD_READING_BOOK, iduser,
                book.getId(), reading.get(book));
    }

    @Override
    public void deleteReadingBooksFromUser(Map<Book, Integer> reading, int iduser) {
        Book book = null;
        for (Book book1 : reading.keySet()) {
            book = book1;
        }
        jdbcTemplate.update(SqlQueries.REMOVE_READING_BOOK, iduser, book.getId());
    }

    @Override
    public void addNoteBooksToUser(Map<Book, String> notebook, int iduser) {
        Book book = null;
        for (Book book1 : notebook.keySet()) {
            book = book1;
        }

        jdbcTemplate.update(SqlQueries.ADD_BOOK_NOTE, iduser,
                book.getId(), notebook.get(book));
    }

    @Override
    public void deleteNoteBooksFromUser(Map<Book, String> notebook, int iduser) {
        Book book = null;
        for (Book book1 : notebook.keySet()) {
            book = book1;
        }

        jdbcTemplate.update(SqlQueries.REMOVE_BOOK_NOTE, iduser, book.getId());
    }
}
