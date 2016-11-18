package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody s autormi napr autori od zadaneho roku, autori s urcitym(i)
//zanrami, tagmi,narodnostami, hodnoteniami...
import java.util.List;

public class DefaultAuthorManager implements AuthorManager {
    
    private InterfaceAuthorDao authorDao = MySQLDaoFactory.INSTANCE.getAuthorDao();
    
    @Override
    public List<Author> getAllAuthors() {
        return authorDao.getAllAuthors();
    }
    
    @Override
    public void insertAuthor(Author author) {
        authorDao.insertAuthor(author);
    }
    

    @Override
    public void deleteAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
