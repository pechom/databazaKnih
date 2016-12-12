package sk.upjs.ics.paz1c.databazaKnih;

public class SqlQueries {

    public static final String SELECT_ALL_AUTHORS = "SELECT author.idauthor, "
            + "author.name, author.birth, author.death, author.lifeStatus, "
            + "author.nationality, author.verificationStatus, "
            + "author.sex, author.biography, author.isActive, "
            + "authorofbook.book_idbook, genreofauthor.genre_idgenre, "
            + "authorreview.idauthorreview "
            + "FROM author "
            + "JOIN authorofbook ON author.idauthor=authorofbook.author_idauthor "
            + "JOIN genreofauthor ON author.idauthor=genreofauthor.author_idauthor "
            + "JOIN authorreview ON author.idauthor=authorreview.author_idauthor "
            + "WHERE author.isActive=1 ORDER BY author.idauthor";

    public static final String INSERT_AUTHOR = "INSERT INTO author (name, birth, "
            + "death, nationality, sex, biography, verificationStatus, "
            + " lifeStatus, isActive) VALUES (?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_AUTHOR = "UPDATE author SET name=?, birth=?, "
            + "death=?, nationality=?, sex=?, biography=?, verificationStatus=?, "
            + " lifeStatus=?, isActive=? "
            + "WHERE idauthor=?";

    public static final String SELECT_AUTHOR_BY_ID = "SELECT author.idauthor, "
            + "author.name, author.birth, author.death, author.nationality, "
            + "author.lifeStatus, author.verifiactionStatus, "
            + "author.sex, author.biography, author.isActive, "
            + "authorofbook.book_idbook , genreofauthor.genre_idgenre, "
            + "authorreview.idauthorreview "
            + "FROM author "
            + "JOIN authorofbook ON author.idauthor=authorofbook.author_idauthor "
            + "JOIN genreofauthor ON author.idauthor=genreofauthor.author_idauthor "
            + "JOIN authorreview ON author.idauthor=authorreview.author_idauthor "
            + "WHERE author.isActive=1 and author.idauthor=";

    public static final String ADD_BOOK_TO_AUTHOR
            = "INSERT INTO authorofbook "
            + "(book_idbook, author_idauthor) VALUES (?,?)";

    public static final String REMOVE_BOOK_FROM_AUTHOR
            = "DELETE FROM authorofbook "
            + "WHERE book_idbook=? AND author_idauthor=?";

    public static final String ADD_GENRE_TO_AUTHOR
            = "INSERT INTO genreofauthor "
            + "(genre_idgenre, author_idauthor) VALUES (?,?)";

    public static final String REMOVE_GENRE_FROM_AUTHOR
            = "DELETE FROM genreofauthor "
            + "WHERE genre_idgenre=? AND author_idauthor=?";

    public static final String REMOVE_GENRE_FROM_ALL_AUTHORS
            = "DELETE FROM genreofauthor "
            + "WHERE genre_idgenre=?";

    public static final String REMOVE_ALL_REVIEWS_FROM_AUTHOR
            = "DELETE FROM authorreview "
            + "WHERE author_idauthor=?";

    public static final String SELECT_USER_ID_BY_USERNAME
            = "SELECT user.iduser FROM user "
            + "WHERE user.isActive=1 and user.userName=?";

    public static final String SELECT_ALL_AUTHORREVIEWS = "SELECT "
            + "authorreview.idauthorreview, authorreview.rating, "
            + "authorreview.isActive, "
            + "authorreview.author_idauthor, authorreview.user_iduser "
            + "FROM authorreview "
            + "JOIN author ON author.idauthor=authorreview.author_idauthor, "
            + "JOIN user ON user.iduser=authorreview.user_iduser"
            + " WHERE authorreview.isActive=1 ORDER BY authorreview.idauthorreview";

    public static final String INSERT_AUTHORREVIEW = "INSERT INTO authorreview "
            + "(rating, review, isActive, author_idauthor, user_iduser) "
            + "VALUES (?,?,?,?,?)";

    public static final String UPDATE_AUTHORREVIEW = "UPDATE authorreview SET "
            + "rating=?, review=?, isActive=? "
            + "WHERE idauthorreview=?";

    public static final String SELECT_AUTHORREVIEW_BY_ID = "SELECT "
            + "authorreview.idauthorreview, authorreview.rating, "
            + "authorreview.isActive, "
            + "authorreview.author_idauthor, authorreview.user_iduser "
            + "FROM authorreview "
            + "JOIN author ON author.idauthor=authorreview.author_idauthor, "
            + "JOIN user ON user.iduser=authorreview.user_iduser"
            + " WHERE authorreview.isActive=1 and authorreview.idauthorreview=";

    public static final String DELETE_AUTHORREVIEWS_WITH_AUTHOR
            = "DELETE FROM authorreview "
            + "WHERE author_idauthor=?";

    public static final String DELETE_AUTHORREVIEWS_WITH_USER
            = "DELETE FROM authorreview "
            + "WHERE user_iduser=?";

    public static final String DELETE_AUTHORREVIEW
            = "DELETE FROM authorreview "
            + "WHERE idauthorreview=?";

    public static final String SELECT_ALL_BOOKS = "SELECT book.idbook, book.name,"
            + "book.year, book.numberOfPages, book.ISBN, book.description, "
            + " book.numberOfReviews, book.averageOfReviews, book.verificationStatus,"
            + " book.numberInChart, book.bayesianAverage, book.isActive, "
            + "genreofbook.genre_idgenre, tagofbook.tag_idtag, "
            + "bookreview.idbookreview, authorofbook.author_idauthor "
            + "FROM book "
            + "JOIN genreofbook ON genreofbook.book_idbook=book.idbook "
            + "JOIN tagofbook ON tagofbook.book_idbook=book.idbook "
            + "JOIN bookreview ON bookreview.book_idbook=book.idbook "
            + "JOIN authorofbook ON book.idbook=authorofbook.book_idbook "
            + "WHERE book.isActive=1 ORDER BY book.numberInChart";

    public static final String INSERT_BOOK = "INSERT INTO book (name, year, "
            + "numberOfPages, ISBN, description, numberOfReviews, "
            + "averageOfReviews, verificationStatus, numberInChart, "
            + "bayesianAverage, isActive) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_BOOK = "UPDATE book SET "
            + "name=?, year=?, "
            + "numberOfPages=?, ISBN=?, description=?, numberOfReviews=?, "
            + "averageOfReviews=?, verificationStatus=?, numberInChart=?, "
            + "bayesianAverage=?, isActive=? "
            + "WHERE idbook=?";

    public static final String SELECT_BOOK_BY_ID = "SELECT book.idbook, book.name,"
            + "book.year, book.numberOfPages. book.ISBN, book.descroption, "
            + " book.numberOfReviews, book.averageOfReviews, book.verificationStatus,"
            + " book.numberInChart, book.bayesianAverage, book.isActive, "
            + "genreofbook.genre_idgenre, tagofbook.tag_idtag, "
            + "bookreview.idbookreview, authorofbook.author_idauthor "
            + "FROM book "
            + "JOIN genreofbook ON genreofbook.book_idbook=book.idbook "
            + "JOIN tagofbook ON tagofbook.book_idbook=book.idbook "
            + "JOIN bookreview ON bookreview.book_idbook=book.idbook "
            + "JOIN authorofbook ON book.idbook=authorofbook.book_idbook "
            + "WHERE book.isActive=1 and book.idbook=";

    public static final String ADD_AUTHOR_TO_BOOK
            = "INSERT INTO authorofbook "
            + "(book_idbook, author_idauthor) VALUES (?,?)";

    public static final String REMOVE_AUTHOR_FROM_BOOK
            = "DELETE FROM authorofbook "
            + "WHERE book_idbook=?";

    public static final String REMOVE_AUTHOR_FROM_ALL_BOOKS
            = "DELETE FROM authorofbook "
            + "WHERE author_idauthor=?";

    public static final String ADD_GENRE_TO_BOOK
            = "INSERT INTO genreofbook "
            + "(book_idbook, genre_idgenre) VALUES (?,?)";

    public static final String REMOVE_GENRE_FROM_BOOK
            = "DELETE FROM genreofbook "
            + "WHERE book_idbook=? AND genre_idgenre=?";

    public static final String REMOVE_GENRE_FROM_ALL_BOOKS
            = "DELETE FROM genreofbook "
            + "WHERE genre_idgenre=?";

    public static final String ADD_TAG_TO_BOOK
            = "INSERT INTO tagofbook "
            + "(tag_idtag, book_idbook) VALUES (?,?)";

    public static final String REMOVE_TAG_FROM_BOOK
            = "DELETE FROM tagofbook "
            + "WHERE book_idbook=? AND tag_idtag=?";

    public static final String REMOVE_TAG_FROM_ALL_BOOKS
            = "DELETE FROM tagofbook "
            + "WHERE tag_idtag=?";

    public static final String ADD_REVIEW_TO_BOOK
            = "UPDATE book SET (numberOfReviews=?, averageOfReviews=?, "
            + "bayesianAverage=?, numberInChart=?) "
            + "WHERE idbook=?";

    public static final String REMOVE_REVIEW_FROM_BOOK
            = "UPDATE book SET (numberOfReviews=?, averageOfReviews=?, "
            + "bayesianAverage=?, numberInChart=?) "
            + "WHERE idbook=?";

    public static final String REMOVE_ALL_REVIEWS_FROM_BOOK
            = "DELETE FROM bookreview "
            + "WHERE book_idbook=?";

    public static final String SELECT_ALL_BOOKREVIEWS = "SELECT "
            + "bookreview.idbookreview, bookreview.rating, bookreview.review, "
            + "bookreview.isActive, "
            + "bookreview.book_idbook, bookreview.user_iduser "
            + "FROM bookreview "
            + "JOIN book ON book.idbook=bookreview.book_idbook, "
            + "JOIN user ON user.iduser=bookreview.user_iduser "
            + "WHERE bookreview.isActive=1 ORDER BY bookreview.idbookreview";

    public static final String INSERT_BOOKREVIEW = "INSERT INTO bookreview "
            + "(rating, review, isActive, book_idbook, user_iduser) "
            + "VALUES (?,?,?,?,?)";

    public static final String UPDATE_BOOKREVIEW = "UPDATE bookreview SET "
            + "rating=?, review=?, isActive=? "
            + "WHERE idbookreview=?";

    public static final String SELECT_BOOKREVIEW_BY_ID = "SELECT "
            + "bookreview.idbookreview, bookreview.rating, bookreview.review, "
            + "bookreview.isActive, "
            + "bookreview.book_idbook, bookreview.user_iduser "
            + "FROM bookreview "
            + "JOIN book ON book.idbook=bookreview.book_idbook, "
            + "JOIN user ON user.iduser=bookreview.user_iduser "
            + "WHERE bookreview.isActive=1 and bookreview.idbookreview=";

    public static final String DELETE_BOOKREVIEWS_WITH_BOOK
            = "DELETE FROM bookreview "
            + "WHERE book_idbook=?";

    public static final String DELETE_BOOKREVIEWS_WITH_USER
            = "DELETE FROM bookreview "
            + "WHERE user_iduser=?";

    public static final String DELETE_BOOKREVIEW
            = "DELETE FROM bookreview "
            + "WHERE idbookreview=?";

    public static final String SELECT_ALL_GENRES = "SELECT "
            + "genre.idgenre, genre.name, genre.isActive, "
            + "genreofbook.book_idbook, genreofauthor.author_idauthor "
            + "FROM genre "
            + "JOIN genreofbook ON genreofbook.genre_idgenre=genre.idgenre "
            + "JOIN genreofauthor ON genreofauthor.genre_idgenre=genre.idgenre "
            + "WHERE genre.isActive=1 ORDER BY genre.idgenre";

    public static final String INSERT_GENRE = "INSERT INTO genre "
            + "(name, isActive) VALUES (?,?)";

    public static final String UPDATE_GENRE = "UPDATE genre SET "
            + "name=?, isActive=? "
            + "WHERE idgenre=?";

    public static final String SELECT_GENRE_BY_ID = "SELECT "
            + "genre.idgenre, genre.name, genre.isActive, "
            + "genreofbook.book_idbook, genreofauthor.author_idauthor "
            + "FROM genre "
            + "JOIN genreofbook ON genreofbook.genre_idgenre=genre.idgenre "
            + "JOIN genreofauthor ON genreofauthor.genre_idgenre=genre.idgenre "
            + "WHERE genre.isActive=1 and genre.idgenre=";

    public static final String ADD_BOOK_TO_GENRE
            = "INSERT INTO genreofbook "
            + "(book_idbook, genre_idgenre) VALUES (?,?)";

    public static final String REMOVE_BOOK_FROM_GENRE
            = "DELETE FROM genreofbook "
            + "WHERE book_idbook=? AND genre_idgenre=?";

    public static final String REMOVE_BOOK_FROM_ALL_GENRES
            = "DELETE FROM genreofbook "
            + "WHERE book_idbook=?";

    public static final String ADD_AUTHOR_TO_GENRE
            = "INSERT INTO genreofauthor "
            + "(genre_idgenre, author_idauthor) VALUES (?,?)";

    public static final String REMOVE_AUTHOR_FROM_GENRE
            = "DELETE FROM genreofauthor "
            + "WHERE author_idauthor=? AND genre_idgenre=?";

    public static final String REMOVE_AUTHOR_FROM_ALL_GENRES
            = "DELETE FROM genreofauthor "
            + "WHERE author_idauthor=?";

    public static final String SELECT_ALL_REQUESTS = "SELECT request.idrequest, "
            + "request.content, request.isActive, request.book_idbook, "
            + "request.author_idauthor, request.user_iduser "
            + "FROM request "
            + "JOIN book ON request.book_idbook=book.idbook "
            + "JOIN author ON request.author_idauthor=author.idauthor "
            + "JOIN user ON request.user_iduser=user.iduser "
            + "WHERE request.isActive=1 ORDER BY request.idrequest";

    //request ma pri inserte aj vztahy
    public static final String INSERT_REQUEST = "INSERT INTO request "
            + "(content, book_idbook, author_idauthor, user_iduser, isActive) "
            + "VALUES (?,?,?,?,?)";

    public static final String UPDATE_REQUEST = "UPDATE request SET "
            + "content=?,isActive=? "
            + "WHERE idrequest=?";

    public static final String SELECT_REQUEST_BY_ID = "SELECT request.idrequest, "
            + "request.content, request.isActive, request.book_idbook, "
            + "request.author_idauthor, request.user_iduser "
            + "FROM request "
            + "JOIN book ON request.book_idbook=book.idbook "
            + "JOIN author ON request.author_idauthor=author.idauthor "
            + "JOIN user ON request.user_iduser=user.iduser "
            + "WHERE request.isActive=1 and request.idrequest=";

    public static final String DELETE_REQUESTS_WITH_USER
            = "DELETE FROM request "
            + "WHERE user_iduser=?";

    public static final String DELETE_REQUESTS_WITH_BOOK
            = "DELETE FROM request "
            + "WHERE book_idbook=?";

    public static final String DELETE_REQUESTS_WITH_AUTHOR
            = "DELETE FROM request "
            + "WHERE author_idauthor=?";

    public static final String DELETE_REQUEST
            = "DELETE FROM request "
            + "WHERE idrequest=?";

    public static final String SELECT_ALL_TAGS = "SELECT "
            + "tag.idtag, tag.name, tag.isActive, tagofbook.book_idbook "
            + "FROM tag "
            + "JOIN tagofbook ON tagofbook.tag_idtag=tag.idtag "
            + "WHERE tag.isActive=1 ORDER BY tag.idtag";

    public static final String INSERT_TAG = "INSERT INTO tag "
            + "(name, isActive) VALUES (?,?)";

    public static final String UPDATE_TAG = "UPDATE tag SET "
            + "name=?, isActive=? "
            + "WHERE idtag=?";

    public static final String SELECT_TAG_BY_ID = "SELECT "
            + "tag.idtag, tag.name, tag.isActive, tagofbook.book_idbook "
            + "FROM tag "
            + "JOIN tagofbook ON tagofbook.tag_idtag=tag.idtag "
            + "WHERE tag.isActive=1 and tag.idtag=";

    public static final String ADD_BOOK_TO_TAG
            = "INSERT INTO tagofbook "
            + "(tag_idtag, book_idbook) VALUES (?,?)";

    public static final String REMOVE_BOOK_FROM_TAG
            = "DELETE FROM tagofbook "
            + "WHERE book_idbook=? AND tag_idtag=?";

    public static final String REMOVE_BOOK_FROM_ALL_TAGS
            = "DELETE FROM tagofbook "
            + "WHERE book_idbook=?";

    public static final String SELECT_ALL_USERS = "SELECT "
            + "user.iduser, user.userName, user.passwordHash, user.name, "
            + "user.mail, user.surname, "
            + "user.lastLogin, user.salt, user.isAdmin, user.isActive, "
            + "readbook.readbook_idbook, wantedbook.wantedbook_idbook, "
            + "favoritebook.favoritebook_idbook, favoriteuser.favoriteuser_iduser, "
            + "friend.friend, favoriteauthor.faveriteauthor_idauthor, "
            + "booknote.booknote_idbook, booknote.note, "
            + "readingbook.readingbook_idbook, readingbook.numberOfPages, "
            + "authorreview.idauthorreview, bookreview.idbookreview "
            + "FROM user "
            + "JOIN readbook ON readbook.user_iduser=user.iduser "
            + "JOIN wantedbook ON wantedbook.user_iduser=user.iduser "
            + "JOIN favoritebook ON favoritebook.user_iduser=user.iduser "
            + "JOIN favoriteuser ON favoriteuser.user_iduser=user.iduser "
            + "JOIN friend ON friend.user_iduser=user.iduser "
            + "JOIN favoriteauthor ON favoriteauthor.user_iduser=user.iduser "
            + "JOIN booknote ON booknote.user_iduser=user.iduser "
            + "JOIN readingbook ON readingbook.user_iduser=user.iduser "
            + "JOIN bookreview ON bookreview.user_iduser=user.iduser "
            + "JOIN authorreview ON authorreview.user_iduser=user.iduser "
            + "WHERE user.isActive=1 ORDER BY user.iduser";

    public static final String INSERT_USER = "INSERT INTO user "
            + "(username, passwordHash, mail, name, surname, lastLogin, salt, "
            + "isAdmin, isActive) VALUES (?,?,?,?,?,?,?,?,?)";

    public static final String UPDATE_USER = "UPDATE user SET "
            + " name=?, surname=?, lastLogin=? "
            + "isAdmin=?, isActive=? "
            + "WHERE iduser=?";

    public static final String SELECT_USER_BY_ID = "SELECT "
            + "user.iduser, user.userName, user.passwordHash, user.name, "
            + "user.mail, user.surname, "
            + "user.lastLogin, user.salt, user.isAdmin, user.isActive, "
            + "readbook.readbook_idbook, wantedbook.wantedbook_idbook, "
            + "favoritebook.favoritebook_idbook, favoriteuser.favoriteuser_iduser, "
            + "friend.friend, favoriteauthor.faveriteauthor_idauthor, "
            + "booknote.booknote_idbook, booknote.note, "
            + "readingbook.readingbook_idbook, readingbook.numberOfPages, "
            + "authorreview.idauthorreview, bookreview.idbookreview "
            + "FROM user "
            + "JOIN readbook ON readbook.user_iduser=user.iduser "
            + "JOIN wantedbook ON wantedbook.user_iduser=user.iduser "
            + "JOIN favoritebook ON favoritebook.user_iduser=user.iduser "
            + "JOIN favoriteuser ON favoriteuser.user_iduser=user.iduser "
            + "JOIN friend ON friend.user_iduser=user.iduser "
            + "JOIN favoriteauthor ON favoriteauthor.user_iduser=user.iduser "
            + "JOIN booknote ON booknote.user_iduser=user.iduser "
            + "JOIN readingbook ON readingbook.user_iduser=user.iduser "
            + "JOIN bookreview ON bookreview.user_iduser=user.iduser "
            + "JOIN authorreview ON authorreview.user_iduser=user.iduser "
            + "WHERE user.isActive=1 and user.iduser=";

    public static final String CHANGE_PASSWORD = "UPDATE user SET "
            + "salt=?, passwordHash=? "
            + "WHERE iduser=?";

    public static final String REMOVE_FRIEND
            = "DELETE FROM friend "
            + "WHERE user_iduser=? AND friend=?";

    public static final String REMOVE_FAVORITE_REVIEWER
            = "DELETE FROM favoriteuser "
            + "WHERE user_iduser=? AND favoriteuser=?";

    public static final String REMOVE_READ_BOOK
            = "DELETE FROM readbook "
            + "WHERE user_iduser=? AND readbook_idbook=?";

    public static final String REMOVE_FAVORITE_BOOK
            = "DELETE FROM favoritebook "
            + "WHERE user_iduser=? AND favoritebook_idbook=?";

    public static final String REMOVE_WANTED_BOOK
            = "DELETE FROM wantedbook "
            + "WHERE user_iduser=? AND wantedbook_idbook=?";

    public static final String REMOVE_READING_BOOK
            = "DELETE FROM readingbook "
            + "WHERE user_iduser=? AND readingbook_idbook=?";

    public static final String REMOVE_BOOK_NOTE
            = "DELETE FROM booknote "
            + "WHERE user_iduser=? AND readingbook_idbook=?";

    public static final String REMOVE_AUTHOR_FROM_ALL_USERS
            = "DELETE FROM favoriteauthor "
            + "WHERE favoriteauthor_idauthor=?";

    public static final String REMOVE_FAVORITE_AUTHOR
            = "DELETE FROM favoriteauthor "
            + "WHERE user_iduser=? AND favoriteauthor_idauthor=?";

    public static final String ADD_READ_BOOK
            = "INSERT INTO readbook "
            + "(user_iduser, readbook_idbook) VALUES (?,?)";

    public static final String ADD_FAVORITE_BOOK
            = "INSERT INTO favoritebook "
            + "(user_iduser, favoritebook_idbook) "
            + "VALUES (?,?)";

    public static final String ADD_WANTED_BOOK
            = "INSERT INTO wantedbook "
            + "(user_iduser, wantedbook_idbook) "
            + "VALUES (?,?)";

    public static final String ADD_FAVORITE_AUTHOR
            = "INSERT INTO favoriteauthor "
            + "(user_iduser, favoriteauthor_idauthor) VALUES (?,?)";

    public static final String ADD_FRIEND
            = "INSERT INTO friend "
            + "(user_iduser, friend) "
            + "VALUES(?,?)";

    public static final String ADD_FAVORITE_REVIEWER
            = "INSERT INTO favoriteuser "
            + "(user_iduser, favoriteuser_iduser) "
            + "VALUES (?,?)";

    public static final String REMOVE_BOOKREVIEW
            = "DELETE FROM bookreview "
            + "WHERE user_iduser=? AND book_idbook=?";

    public static final String REMOVE_AUTHORREVIEW
            = "DELETE FROM authorreview "
            + "WHERE user_iduser=? AND author_idauthor=?";

    public static final String ADD_READING_BOOK
            = "INSERT INTO readingbook "
            + "(user_iduser, readingbook_idbook, numberOfPages) "
            + "VALUES (?,?,?)";

    public static final String ADD_BOOK_NOTE
            = "INSERT INTO booknote "
            + "(user_iduser, booknote_idbook, note) "
            + "VALUES (?,?,?)";

}
