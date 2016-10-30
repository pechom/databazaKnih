package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody s knihami
import java.util.List;

public class DefaultBooksManager implements BooksManager {
    
    private InterfaceBookDao bookDao = BookDaoFactory.INSTANCE.getBookDao();
    
    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }
    
    @Override
    public void insertBook(Book book) {
        bookDao.insertBook(book);
    }
    
    @Override
    public void deleteBook(Book book) {
        bookDao.deleteBook(book);
    }
    
    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }
    
}
