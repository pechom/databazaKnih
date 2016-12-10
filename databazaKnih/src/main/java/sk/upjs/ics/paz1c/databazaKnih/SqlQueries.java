package sk.upjs.ics.paz1c.databazaKnih;

public class SqlQueries {

    public static final String SELECT_ALL_AUTHORS = "SELECT author.idauthor, "
            + "author.name, author.birth, author.death, author.nationality, "
            + "author.sex, author.biography, author.isActive, "
            + "authorofbook.book_idbook , genreofauthor.genre_idgenre, "
            + "authorreview.idauthorreview "
            + "FROM author "
            + "JOIN authorofbook ON author.idauthor=authorofbook.author_idauthor "
            + "JOIN genreofauthor ON author.idauthor=genreofauthor.author_idauthor "
            + "JOIN authorreview ON author.idauthor=authorreview.author_idauthor "
            + "WHERE author.isActive=1 ORDER BY author.idauthor";

    public static final String INSERT_AUTHOR = "INSERT INTO author (name, birth,"
            + "death, nationality, sex, biography, verificationStatus, "
            + " lifeStatus, isActive) VALUES (?,?,?,?,?,?,?,?,?)";

    public static final String SELECT_AUTHOR_BY_ID = "SELECT author.idauthor, "
            + "author.name, author.birth, author.death, author.nationality, "
            + "author.sex, author.biography, author.isActive, "
            + "authorofbook.book_idbook , genreofauthor.genre_idgenre, "
            + "authorreview.idauthorreview "
            + "FROM author "
            + "JOIN authorofbook ON author.idauthor=authorofbook.author_idauthor "
            + "JOIN genreofauthor ON author.idauthor=genreofauthor.author_idauthor "
            + "JOIN authorreview ON author.idauthor=authorreview.author_idauthor "
            + "WHERE author.isActive=1 and author.idauthor=";

    public static final String SELECT_ALL_AUTHORREVIEWS = "SELECT "
            + "authorreview.idauthorreview, authorreview.rating, "
            + "authorreview.isActive, "
            + "authorreview.author_idauthor, authorreview.user_iduser "
            + "FROM authorreview "
            + "JOIN author ON author.idauthor=authorreview.author_idauthor, "
            + "JOIN user ON user.iduser=authorreview.user_iduser"
            + " WHERE authorreview.isActive=1 ORDER BY authorreview.idauthorreview";

    public static final String INSERT_AUTHORREVIEW = "INSERT INTO authorreview "
            + "(rating, review, isActive) VALUES (?,?,?)";

    public static final String SELECT_AUTHORREVIEW_BY_ID = "SELECT "
            + "authorreview.idauthorreview, authorreview.rating, "
            + "authorreview.isActive, "
            + "authorreview.author_idauthor, authorreview.user_iduser "
            + "FROM authorreview "
            + "JOIN author ON author.idauthor=authorreview.author_idauthor, "
            + "JOIN user ON user.iduser=authorreview.user_iduser"
            + " WHERE authorreview.isActive=1 and authorreview.idauthorreview=";

    public static final String SELECT_ALL_BOOKS = "SELECT book.idbook, book.name,"
            + "book.year, book.numberOfPages. book.ISBN, book.descroption, "
            + " book.numberOfReviews, book.averageOfReviews, book.verificationStatus,"
            + " book.numberInChart, book.bayesianAverage, book.isActive, "
            + "genreofbook.genre_idgenre, tagofbook.tag_idtag, "
            + "bookreview.idbookreview, authorofbook.author_idauthor "
            + "FROM book "
            + "JOIN genreofbook ON genreofbook.book_idbook=book.idbook "
            + "JOIN tagofbook ON tagofbook.book_idbook=book.idbook "
            + "JOIN bookrevoew ON bookreview.book_idbook=book.idbook "
            + "JOIN authorofbook ON book.idbook=authorofbook.book_idbook "
            + "WHERE book.isActive=1 ORDER BY book.numberInChart";

    public static final String INSERT_BOOK = "INSERT INTO book (name, year, "
            + "numberOfPages, ISBN, description, numberOfReviews, "
            + "averageOfReviews, verificationStatus, numberInChart, "
            + "bayesianAverage, isActive) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    public static final String SELECT_BOOK_BY_ID = "SELECT book.idbook, book.name,"
            + "book.year, book.numberOfPages. book.ISBN, book.descroption, "
            + " book.numberOfReviews, book.averageOfReviews, book.verificationStatus,"
            + " book.numberInChart, book.bayesianAverage, book.isActive, "
            + "genreofbook.genre_idgenre, tagofbook.tag_idtag, "
            + "bookreview.idbookreview, authorofbook.author_idauthor "
            + "FROM book "
            + "JOIN genreofbook ON genreofbook.book_idbook=book.idbook "
            + "JOIN tagofbook ON tagofbook.book_idbook=book.idbook "
            + "JOIN bookrevoew ON bookreview.book_idbook=book.idbook "
            + "JOIN authorofbook ON book.idbook=authorofbook.book_idbook "
            + "WHERE book.isActive=1 and book.idbook=";

    public static final String SELECT_ALL_BOOKREVIEWS = "SELECT "
            + "bookreview.idbookreview, bookreview.rating, bookreview.review, "
            + "bookreview.isActive, "
            + "bookreview.book_idbook, bookreview.user_iduser "
            + "FROM bookreview "
            + "JOIN book ON book.idbook=bookreview.book_idbook, "
            + "JOIN user ON user.iduser=bookreview.user_iduser "
            + "WHERE bookreview.isActive=1 ORDER BY bookreview.idbookreview";

    public static final String INSERT_BOOKREVIEW = "INSERT INTO bookreview "
            + "(rating, review, isActive) VALUES (?,?,?)";

    public static final String SELECT_BOOKREVIEW_BY_ID = "SELECT "
            + "bookreview.idbookreview, bookreview.rating, bookreview.review, "
            + "bookreview.isActive, "
            + "bookreview.book_idbook, bookreview.user_iduser "
            + "FROM bookreview "
            + "JOIN book ON book.idbook=bookreview.book_idbook, "
            + "JOIN user ON user.iduser=bookreview.user_iduser "
            + "WHERE bookreview.isActive=1 and bookreview.idbookreview=";

    public static final String SELECT_ALL_GENRES = "SELECT "
            + "genre.idgenre, genre.name, genre.isActive, "
            + "genreofbook.book_idbook, genreofauthor.author_idauthor "
            + "FROM genre "
            + "JOIN genreofbook ON genreofbook.genre_idgenre=genre.idgenre "
            + "JOIN genreofauthor ON genreofauthor.genre_idgenre=genre.idgenre "
            + "WHERE genre.isActive=1 ORDER BY genre.idgenre";

    public static final String INSERT_GENRE = "INSERT INTO genre "
            + "(name, isActive) VALUES (?,?)";

    public static final String SELECT_GENRE_BY_ID = "SELECT "
            + "genre.idgenre, genre.name, genre.isActive, "
            + "genreofbook.book_idbook, genreofauthor.author_idauthor "
            + "FROM genre "
            + "JOIN genreofbook ON genreofbook.genre_idgenre=genre.idgenre "
            + "JOIN genreofauthor ON genreofauthor.genre_idgenre=genre.idgenre "
            + "WHERE genre.isActive=1 and genre.idgenre=";

    public static final String SELECT_ALL_REQUESTS = "SELECT request.idrequest, "
            + "request.content, request.isActive, request.book_idbook, "
            + "request.author_idauthor, request.user_iduser "
            + "FROM request "
            + "JOIN book ON request.book_idbook=book.idbook "
            + "JOIN author ON request.author_idauthor=author.idauthor "
            + "JOIN user ON request.user_iduser=user.iduser "
            + "WHERE request.isActive=1 ORDER BY request.idrequest";

    public static final String INSERT_REQUEST = "INSERT INTO request "
            + "(content, book_idbook, author_idauthor, user_iduser, isActive) "
            + "VALUES (?,?,?,?,?)";

    public static final String SELECT_REQUEST_BY_ID = "SELECT request.idrequest, "
            + "request.content, request.isActive, request.book_idbook, "
            + "request.author_idauthor, request.user_iduser "
            + "FROM request "
            + "JOIN book ON request.book_idbook=book.idbook "
            + "JOIN author ON request.author_idauthor=author.idauthor "
            + "JOIN user ON request.user_iduser=user.iduser "
            + "WHERE request.isActive=1 and request.idrequest=";

    public static final String SELECT_ALL_TAGS = "SELECT "
            + "tag.idtag, tag.name, tag.isActive, tagofbook.book_idbook "
            + "FROM tag "
            + "JOIN tagofbook ON tagofbook.tag_idtag=tag.idtag "
            + "WHERE tag.isActive=1 ORDER BY tag.idtag";

    public static final String INSERT_TAG = "INSERT INRO tag "
            + "(name, isActive) VALUES (?,?)";

    public static final String SELECT_TAG_BY_ID = "SELECT "
            + "tag.idtag, tag.name, tag.isActive, tagofbook.book_idbook "
            + "FROM tag "
            + "JOIN tagofbook ON tagofbook.tag_idtag=tag.idtag "
            + "WHERE tag.isActive=1 and tag.idtag=";

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
}
