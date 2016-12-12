package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceAuthorDao {

    List<Author> getAllAuthors();

    void insertAuthor(Author author);

    void deleteAuthor(int id);

    void undeleteAuthor(int id);

    void updateAuthor(Author author);
    
    void addBookToAuthor(int bookid, int authorid);
    
    void removeBookFromAuthor(int bookid, int authorid);
    
    void addGenreToAuthor(int genreid, int authorid);
    
     void removeGenreFromAuthor(int genreid, int authorid);
     
     void removeGenre (int genreid);
     
     void removeReviews(int authorid);

    Author findById(int id);

}
