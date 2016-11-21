package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceAuthorDao {

    List<Author> getAllAuthors();

    void insertAuthor(Author author);

    void deleteAuthor(int id);

    void updateAuthor(Author author);

    Author findById(int id);
    
}
