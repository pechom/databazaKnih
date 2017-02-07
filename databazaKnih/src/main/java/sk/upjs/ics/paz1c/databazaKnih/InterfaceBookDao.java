package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceBookDao {

    List<Book> getAllBooks();

    void insertBook(Book book);

    void deleteBook(int id);

    void undeleteBook(int id);

    void updateBook(Book book);

    void addAuthorToBook(int idbook, int idauthor);

    void removeAuthorFromBook(int idbook);

    void removeAuthor(int idauthor);

    void addGenreToBook(int idgenre, int idbook);

    void removeGenreFromBook(int idgenre, int idbook);

    void removeGenre(int idgenre);

    void addTagToBook(int idtag, int idbook);

    void removeTagFromBook(int idgtag, int idbook);

    void removeTag(int idtag);

    void addReviewToBook(int idreview, Book book);

    void removeReviewFromBook(int idreview, Book book);

    void removeReviewsFromBook(int idbook);

    Book findById(int id);

}
