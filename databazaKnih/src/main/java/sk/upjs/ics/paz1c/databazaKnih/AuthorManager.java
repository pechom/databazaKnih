package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface AuthorManager {

    List<Author> getAllAuthors();

    List<Author> getVerificatedAuthors();

    List<Author> getNotVerificatedAuthors();

    List<Author> getAuthorsByAllGenres(List<Genre> genres);

    List<Author> getAliveAuthors();

    List<Author> getDeadAuthors();

    void addBooksToAuthor(List<Integer> books, Author author);// autorovi sa pridaju knihy/a a updatne sa

    void removeBooksFromAuthor(List<Integer> books, Author author);//autorovi sa odoberu knihy/a

    void addGenresToAuthor(List<Integer> genres, Author author);//autorovi sa pridaju zanre/zaner

    void removeGenresFromAuthor(List<Integer> genres, Author author);//autorovi sa odoberu zanre/zaner

    List<Author> removeGenre(Genre genre);//zo vsetkych autorov sa odstrani zaner

    void removeAllReviews(Author author);

    void insertAuthor(Author author);

    void deleteAuthor(int id);// vo vsetkych objektov ktore su s nim vo vztahu musim najprv  
    //odstranit autora az potom ho deaktivovat. Tak robit pri vsetkych triedach

    void undeleteAuthor(int id);

    void updateAuthor(Author author);

    Author findById(int id);

    List<Author> getAuthorsByName(String name, List<Author> authors);

    List<Author> getAuthorsByGenres(List<Genre> genres, List<Author> authors);

    List<Author> getAuthorsByBook(String bookname, List<Author> authors);

    List<Author> getAuthorsFromBirth(int year, List<Author> authors);

    List<Author> getAuthorsToBirth(int year, List<Author> authors);

    List<Author> getAuthorsFromToBirth(int from, int to, List<Author> authors);

    List<Author> getAuthorsFromDeath(int year, List<Author> authors);

    List<Author> getAuthorsToDeath(int year, List<Author> authors);

    List<Author> getAuthorsFromToDeath(int from, int to, List<Author> authors);

    List<Author> getAuthorsByNationality(String nationality, List<Author> authors);

    List<Author> getAuthorsBySex(String sex, List<Author> authors);
}
