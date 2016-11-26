package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface AuthorManager {

    List<Author> getAllAuthors();

    List<Author> getVerificatedAndActiveAuthors();

    List<Author> getActiveAuthors();

    List<Author> getAuthorsByName(String name);

    List<Author> getAuthorsByGenres(List<Genre> genres);

    List<Author> getAuthorsFromBirth(int year);

    List<Author> getAuthorsToBirth(int year);

    List<Author> getAuthorsFromToBirth(int from, int to);

    List<Author> getAuthorsFromDeath(int year);

    List<Author> getAuthorsToDeath(int year);

    List<Author> getAuthorsFromToDeath(int from, int to);

    List<Author> getAuthorsByNationality(String nationality);

    List<Author> getAuthorsBySex(String sex);

    List<Author> getAuthorsByLifeStatus(boolean lifeStatus);

    void addBooksToAuthor(List<Book> books, Author author);// autorovi sa pridaju knihy/a

    void removeBooksFromAuthor(List<Book> books, Author author);//autorovi sa odoberu knihy/a

    void addGenresToAuthor(List<Genre> genres, Author author);//autorovi sa pridaju zanre/zaner

    void removeGenresFromAuthor(List<Genre> genres, Author author);//autorovi sa odoberu zanre/zaner

    void removeGenre(Genre Genre);//zo vsetkych autorov sa odstrani zaner

    void addReview(AuthorReview review, Author author);

    void removeReview(AuthorReview review, Author author);

    void insertAuthor(Author author);

    void deleteAuthor(int id);// vo vsetkych objektov ktore su s nim vo vztahu musim najprv  
    //odstranit autora az potom ho deaktivovat. Tak robit pri vsetkych triedach

    void undeleteAuthor(int id);

    void updateAuthor(Author author);

    Author findById(int id);
}
