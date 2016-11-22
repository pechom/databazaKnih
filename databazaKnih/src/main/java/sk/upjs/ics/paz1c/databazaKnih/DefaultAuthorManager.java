package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody sna filtre na parametre, overenost
import java.util.List;

public class DefaultAuthorManager implements AuthorManager {

    private InterfaceAuthorDao authorDao = ObjectFactory.INSTANCE.getAuthorDao();

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
        authorDao.deleteAuthor(id);
    }

    @Override
    public void updateAuthor(Author author) {
        authorDao.updateAuthor(author);
    }

    @Override
    public Author findById(int id) {
        return authorDao.findById(id);
    }

}
