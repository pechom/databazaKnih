package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceBookDao {

    List<Book> getAllBooks();

    void insertBook(Book book);

    void deleteBook(int id);

    void updateBook(int id);
}
