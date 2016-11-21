package sk.upjs.ics.paz1c.databazaKnih;

public class SqlQueries {

    public static final String SELECT_ALL_AUTHORS = "SELECT author.idauthor, author.name, author.birth, author.death, author.nationality, "
            + "author.sex, author.biography, author.verificationStatus, author.lifeStatus, author.book_idbook,"
            + " author.authorreview_idauthorreview, genreofauthor.genre_idgenre "
            + "FROM author JOIN genreofauthor ON author.idauthor=genreofauthor.author_idauthor, JOIN book ON author.book_idbook=book.idbook "
            + "JOIN authorreview ON author.authorreview_idauthorreview=authorreview.idauthorreview ORDER BY author.idauthor";

    public static final String SELECT_AUTHOR_BY_ID = "SELECT author.idauthor, author.name, author.birth, author.death, author.nationality, "
            + "author.sex, author.biography, author.verificationStatus, author.lifeStatus, author.book_idbook,"
            + " author.authorreview_idauthorreview, genreofauthor.genre_idgenre "
            + "FROM author JOIN genreofauthor ON author.idauthor=genreofauthor.author_idauthor, JOIN book ON author.book_idbook=book.idbook "
            + "JOIN authorreview ON author.authorreview_idauthorreview=authorreview.idauthorreview WHERE author.idauthor= ?";

    public static final String SELECT_ALL_AUTHORREVIEWS = "SELECT authorreview.idauthorreview, authorreview.rating, "
            + "authorreview.author_idauthor, authorreview.user_iduser FROM authorreview JOIN author ON "
            + "author.idauthor=authorreview.author_idauthor, JOIN user ON user.iduser=authorreview.user_iduser ORDER BY authorreview.idauthorreview";

    public static final String SELECT_AUTHORREVIEW_BY_ID = "SELECT authorreview.idauthorreview, authorreview.rating, "
            + "authorreview.author_idauthor, authorreview.user_iduser FROM authorreview JOIN author ON "
            + "author.idauthor=authorreview.author_idauthor, JOIN user ON user.iduser=authorreview.user_iduser WHERE authorreview.idauthorreview= ?";

    public static final String SELECT_ALL_BOOKS = "SELECT book.idbook, book.name, book.year, book.numberOfPages. book.ISBN, book.descroption "
            + "book.numberOfReviews, book.averageOfReviews, book.verificationStatus, book.numberInChart, book.bayesianAverage, "
            + "book.author_idauthor, book.bookreview_idbookreview, genreofbook.genre_idgenre, tagofbook.tag_idtag FROM book JOIN "
            + "genreofbook ON book.idbook=genreofbook.book_idbook, JOIN author ON author.idauthor=book.author_idauthor "
            + "JOIN bookreview ON bookreview.idbookreview=book.bookreview_idbookreview JOIN tagofbook ON book.idbook="
            + "tagofbook.book_idbook ORDER BY book.numberInChart";

    public static final String SELECT_BOOK_BY_ID = "SELECT book.idbook, book.name, book.year, book.numberOfPages. book.ISBN, book.descroption "
            + "book.numberOfReviews, book.averageOfReviews, book.verificationStatus, book.numberInChart, book.bayesianAverage, "
            + "book.author_idauthor, book.bookreview_idbookreview, genreofbook.genre_idgenre, tagofbook.tag_idtag FROM book JOIN "
            + "genreofbook ON book.idbook=genreofbook.book_idbook, JOIN author ON author.idauthor=book.author_idauthor "
            + "JOIN bookreview ON bookreview.idbookreview=book.bookreview_idbookreview JOIN tagofbook ON book.idbook="
            + "tagofbook.book_idbook WHERE book.idbook= ?";

    public static final String SELECT_ALL_BOOKREVIEWS = "SELECT bookreview.idbookreview, bookreview.rating, bookreview.review, "
            + "bookreview.book_idbook, bookreview.user_iduser FROM bookreview JOIN book ON  book.idbook=bookreview.book_idbook, "
            + "JOIN user ON user.iduser=bookreview.user_iduser ORDER BY bookreview.idbookreview";

    public static final String SELECT_BOOKREVIEW_BY_ID = "SELECT bookreview.idbookreview, bookreview.rating, bookreview.review, "
            + "bookreview.book_idbook, bookreview.user_iduser FROM bookreview JOIN book ON  book.idbook=bookreview.book_idbook, "
            + "JOIN user ON user.iduser=bookreview.user_iduser WHERE bookreview.idbookreview= ?";

    public static final String SELECT_ALL_GENRES = "SELECT genre.idgenre, genre.name, bookofgenre.book_idbook, authorofgenre.author_idauthor "
            + "JOIN authorofgenre ON authorofgenre.genre_idgenre=genre.idgenre, JOIN bookofgenre ON "
            + "bookofgenre.genre_idgenre=genre.idgenre ORDER BY genre.idgenre";

    public static final String SELECT_GENRE_BY_ID = "SELECT genre.idgenre, genre.name, bookofgenre.book_idbook, authorofgenre.author_idauthor "
            + "JOIN authorofgenre ON authorofgenre.genre_idgenre=genre.idgenre, JOIN bookofgenre ON "
            + "bookofgenre.genre_idgenre=genre.idgenre WHERE genre.idgenre= ?";

    public static final String SELECT_ALL_REQUESTS = "SELECT request.idrequest, request.content, request.book_idbook, request.author_idauthor "
            + "JOIN author ON author.idauthor=request.author_idauthor, JOIN book ON book.idbook=request.book_idbook ORDER BY request.idrequest";

    public static final String SELECT_REQUEST_BY_ID = "SELECT request.idrequest, request.content, request.book_idbook, request.author_idauthor "
            + "JOIN author ON author.idauthor=request.author_idauthor, JOIN book ON book.idbook=request.book_idbook WHERE request.idrequest= ?";

    public static final String SELECT_ALL_TAGS = "SELECT tag.idtag, tag.name, bookoftag.book_idbook JOIN bookoftag ON "
            + "bookoftag.tag_idtag=tag.idtag ORDER BY tag.idtag";
    
    public static final String SELECT_TAG_BY_ID = "SELECT tag.idtag, tag.name, bookoftag.book_idbook JOIN bookoftag ON "
            + "bookoftag.tag_idtag=tag.idtag WHERE tag.idtag= ?";

    public static final String SELECT_ALL_USERS = "SELECT user.iduser, user.userName, user.passwordHash, user.name, user.mail, user.surname "
            + "user.lastLogin, user.salt, user.isAdmin, user.frienduser_iduser, user.favoriteuser.iduser, user.bookreview_idbookreview "
            + "user.authorreview_idauthorreview, user.readbook_idbook, user.favoritebook_idbook, user.wantedbook_idbook, "
            + "user.favoriteauthor_idauthor, readingbook.book_idbook, readingbook.pocetStran, booknote.book_idbook, booknote.note "
            + "JOIN user ON user.frienduser_iduser=user.iduser, JOIN user ON user.favoriteuser.iduser=user.iduser "
            + "JOIN bookreview  ON user.bookreview_idbookreview=bookreview.idbookreview, JOIN authorreview ON "
            + "user.authorreview_idauthorreview=authorreview.idauthorreview, JOIN book ON user.readbook_idbook=book.idbook "
            + "JOIN book ON user.favoritebook_idbook=book.idbook, JOIN book ON user.wantedbook_idbook=book.idbook, "
            + "JOIN author ON user.favoriteauthor_idauthor=author.idauthor, JOIN booknote ON user.iduser= booknote.user_iduser, "
            + "JOIN readingbook ON readingbook.user_iduser=user.iduser ORDER BY user.iduser";
    
        public static final String SELECT_USER_BY_ID = "SELECT user.iduser, user.userName, user.passwordHash, user.name, user.mail, user.surname "
            + "user.lastLogin, user.salt, user.isAdmin, user.frienduser_iduser, user.favoriteuser.iduser, user.bookreview_idbookreview "
            + "user.authorreview_idauthorreview, user.readbook_idbook, user.favoritebook_idbook, user.wantedbook_idbook, "
            + "user.favoriteauthor_idauthor, readingbook.book_idbook, readingbook.pocetStran, booknote.book_idbook, booknote.note "
            + "JOIN user ON user.frienduser_iduser=user.iduser, JOIN user ON user.favoriteuser.iduser=user.iduser "
            + "JOIN bookreview  ON user.bookreview_idbookreview=bookreview.idbookreview, JOIN authorreview ON "
            + "user.authorreview_idauthorreview=authorreview.idauthorreview, JOIN book ON user.readbook_idbook=book.idbook "
            + "JOIN book ON user.favoritebook_idbook=book.idbook, JOIN book ON user.wantedbook_idbook=book.idbook, "
            + "JOIN author ON user.favoriteauthor_idauthor=author.idauthor, JOIN booknote ON user.iduser= booknote.user_iduser, "
            + "JOIN readingbook ON readingbook.user_iduser=user.iduser WHERE user.iduser= ?";
}
