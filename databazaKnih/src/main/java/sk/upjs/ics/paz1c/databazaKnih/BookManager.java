package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface BookManager {

    List<Book> getAllBooks();

    List<Book> getVerificatedBooks();

    List<Book> getNotVerificatedBooks();

    List<Book> GetBooksByName(String name);

    List<Book> GetBooksByAuthor(Author author);

    List<Book> getBooksFromYear(int year);

    List<Book> getBooksToYear(int year);

    List<Book> getBooksFromToYear(int from, int to);

    List<Book> GetBooksByGenres(List<Genre> genres);

    List<Book> GetBooksByAllGenres(List<Genre> genres);

    List<Book> getBooksFromPages(int pages);

    List<Book> getBooksToPages(int pages);

    List<Book> getBooksFromToPages(int from, int to);

    Book getBookByISBN(int ISBN);

    List<Book> GetBooksByTags(List<Tag> tags);

    List<Book> GetBooksByAllTags(List<Tag> tags);

    List<Book> GetBooksFromReviews(int numberOfReviews);

    List<Book> getBooksFromAverage(int average);

    List<Book> getBooksToAverage(int average);

    List<Book> getBooksFromToAverage(int from, int to);

    List<Book> getBooksFromChart(int chart);

    List<Book> getBooksToChart(int chart);

    List<Book> getBooksFromToChart(int from, int to);

    List<Book> getBooksFromBayesian(int average);

    List<Book> getBooksToBayesian(int average);

    List<Book> getBooksFromToBayesian(int from, int to);

    void addAuthorToBook(Book book, Author author);//knihe sa prida autor

    void removeAuthorFromBook(Book book, Author author);//knihe sa odstrani autor

    void removeAuthor(Author author);//odstrani sa autor zo vsetkych knih

    void addGenresToBook(List<Genre> genres, Book book);//knihe sa pridaju zanre

    void removeGenresFromBook(List<Genre> genres, Book book);//knihe sa odoberu zanre

    void removeGenre();//odstrani zaner zo vsetkych knih

    void addTagsToBook(List<Tag> tags, Book book);//knihe sa pridaju tagy

    void removeTagsFromBook(List<Tag> tags, Book book);//knihe sa odoberu tagy

    void removeTag(Tag tag);//odstrani tag zo vsetkych knih

    void addReview(BookReview review, Book book);//vypocitat aj avg a cekne rebricek

    void removeReview(BookReview review, Book book);//vypocitat aj avg a cekne rebricek

    void calculateAndInsertBayesian(Book book, int constant);

    void insertBook(Book book);

    void deleteBook(int id);

    void undeleteBook(int id);

    void updateBook(Book book);

    Book findById(int id);
}
