package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody s autormi
import java.util.List;

public class DefaultAuthorsManager implements AuthorsManager {
    
    private InterfaceAuthorDao authorDao = AuthorDaoFactory.INSTANCE.getAuthorDao();
    
    @Override
    public List<Author> getAllAuthors() {
        return authorDao.getAllAuthors();
    }
    
    @Override
    public void insertAuthor(Author author) {
        authorDao.insertAuthor(author);
    }
    
    @Override
    public void deleteAuthor(Author author) {
        authorDao.deleteAuthor(author);
    }
    
    @Override
    public void updateAuthor(Author author) {
        authorDao.updateAuthor(author);
    }
    
}
