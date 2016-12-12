package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceGenreDao {

    List<Genre> getAllGenre();

    void insertGenre(Genre genre);

    void deleteGenre(int id);

    void undeleteGenre(int id);

    void updateGenre(Genre genre);

    void addBookToGenre(int idbook, int idgenre);

    void removeBookFromGenre(int idbook, int idgenre);

    void removeBook(int idbook);

    void addAuthorToGenre(int idauthor, int idgenre);

    void removeAuthorFromGenre(int idauthor, int idgenre);

    void removeAuthor(int idauthor);

    Genre findById(int id);

}
