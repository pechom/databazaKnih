package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody filtre na parametre, overenost
//bude sa pocitat bayesian average (priemerne hodnotenie celej databazy sa vzdy bude ziskavat zo vsetkych bookreviews)
import java.util.List;

public class DefaultBookManager implements BookManager {

    private InterfaceBookDao bookDao = ObjectFactory.INSTANCE.getBookDao();

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public void insertBook(Book book) {
        bookDao.insertBook(book);
    }

    @Override
    public void deleteBook(int id) {
        bookDao.deleteBook(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public Book findById(int id) {
        return bookDao.findById(id);
    }

}
