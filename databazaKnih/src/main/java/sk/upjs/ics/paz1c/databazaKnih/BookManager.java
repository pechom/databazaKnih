package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface BookManager {

    List<Book> getAllBooks();

    List<Book> getVerificatedBooks();

    List<Book> getNotVerificatedBooks();

    List<Book> GetBooksByAllGenres(List<Genre> genres);

    List<Book> GetBooksByAllTags(List<Tag> tags);

    List<Book> getBooksFromChart(int chart);

    List<Book> getBooksToChart(int chart);

    List<Book> getBooksFromToChart(int from, int to);

    void makeChart();

    void addAuthorToBook(Book book, Author author);//knihe sa prida autor

    void removeAuthorFromBook(Book book);//knihe sa odstrani autor

    List<Book> removeAuthor(Author author);//odstrani sa autor zo vsetkych knih

    void addGenresToBook(List<Integer> genres, Book book);//knihe sa pridaju zanre

    void removeGenresFromBook(List<Integer> genres, Book book);//knihe sa odoberu zanre

    List<Book> removeGenre(Genre genre);//odstrani zaner zo vsetkych knih

    void addTagsToBook(List<Integer> tags, Book book);//knihe sa pridaju tagy

    void removeTagsFromBook(List<Integer> tags, Book book);//knihe sa odoberu tagy

    List<Book> removeTag(Tag tag);//odstrani tag zo vsetkych knih

    void addReview(BookReview review, Book book);//vypocitat aj avg a cekne rebricek

    void removeReview(BookReview review, Book book);//vypocitat aj avg a cekne rebricek

    void removeAllReviews(Book book);

    void calculateAndInsertBayesian(Book book, int constant);

    void insertBook(Book book);

    void deleteBook(int id);

    void undeleteBook(int id);

    void updateBook(Book book);

    Book findById(int id);

    List<Book> GetBooksByName(String name, List<Book> books);

    List<Book> GetBooksByAuthor(Author author, List<Book> books);

    List<Book> getBooksFromYear(int year, List<Book> books);

    List<Book> getBooksToYear(int year, List<Book> books);

    List<Book> getBooksFromToYear(int from, int to, List<Book> books);

    List<Book> GetBooksByGenres(List<Genre> genres, List<Book> books);

    List<Book> GetBooksByAllGenres(List<Genre> genres, List<Book> books);

    List<Book> getBooksFromPages(int pages, List<Book> books);

    List<Book> getBooksToPages(int pages, List<Book> books);

    List<Book> getBooksFromToPages(int from, int to, List<Book> books);

    Book getBookByISBN(int ISBN, List<Book> books);

    List<Book> GetBooksByTags(List<Tag> tags, List<Book> books);

    List<Book> GetBooksByAllTags(List<Tag> tags, List<Book> books);

    List<Book> GetBooksFromReviews(int numberOfReviews, List<Book> books);

    List<Book> getBooksFromAverage(int average, List<Book> books);

    List<Book> getBooksToAverage(int average, List<Book> books);

    List<Book> getBooksFromToAverage(int from, int to, List<Book> books);

    List<Book> getBooksFromBayesian(int average, List<Book> books);

    List<Book> getBooksToBayesian(int average, List<Book> books);

    List<Book> getBooksFromToBayesian(int from, int to, List<Book> books);
}
