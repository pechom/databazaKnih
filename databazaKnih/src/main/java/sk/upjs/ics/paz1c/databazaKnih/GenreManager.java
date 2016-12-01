package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface GenreManager {

    List<Genre> getAllGenres();

    Genre getByName(String name);

    void insertGenre(Genre genre);

    void addBooksToGenre(Genre genre, List<Book> books);//zanru sa pridaju knihy/a

    void removeBooksFromGenre(Genre genre, List<Book> books);//zanru sa odoberu knihy/a

    List<Genre> removeBook(Book book);//odstrani sa kniha zo vsetkych zanrov

    void addAuthorsToGenre(Genre genre, List<Author> authors);//zanru sa pridaju autori

    void removeAuthorsFromGenre(Genre genre, List<Author> authors);//zanru sa odoberu autori

    List<Genre> removeAuthor(Author author);//zo vsetkych zanrov sa odstrani autor

    void deleteGenre(int id);

    void undeleteGenre(int id);

    void updateGenre(Genre genre);

    Genre findById(int id);
}
