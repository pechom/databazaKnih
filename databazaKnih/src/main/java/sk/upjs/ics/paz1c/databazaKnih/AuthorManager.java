package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface AuthorManager {

    List<Author> getAllAuthors();

    void insertAuthor(Author author);

    void deleteAuthor(int id);

    void updateAuthor(int id);
}
