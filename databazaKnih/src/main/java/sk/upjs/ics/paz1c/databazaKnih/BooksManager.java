package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface BooksManager {

    List<Book> getAllBooks();

    void insertBook(Book book);

    void deleteBook(Book book);

    void updateBook(Book book);
}
