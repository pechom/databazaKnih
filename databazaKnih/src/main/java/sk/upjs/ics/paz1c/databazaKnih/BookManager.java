package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface BookManager {

    List<Book> getAllBooks();

    void insertBook(Book book);

    void deleteBook(int id);

    void updateBook(Book book);

    Book findById(int id);
}
