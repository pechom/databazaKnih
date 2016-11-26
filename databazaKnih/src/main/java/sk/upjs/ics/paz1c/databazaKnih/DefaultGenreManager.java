package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

//metody na filtre na parametre
public class DefaultGenreManager implements GenreManager {

    private InterfaceGenreDao genreDao = ObjectFactory.INSTANCE.getGenreDao();

    @Override
    public List<Genre> getAllGenres() {
        return genreDao.getAllGenre();
    }

    @Override
    public void insertGenre(Genre genre) {
        genreDao.insertGenre(genre);
    }

    @Override
    public void deleteGenre(int id) {
        genreDao.deleteGenre(id);
    }

    @Override
    public void updateGenre(Genre genre) {
        genreDao.updateGenre(genre);
    }

    @Override
    public Genre findById(int id) {
        return genreDao.findById(id);
    }

    @Override
    public List<Genre> getActiveGenres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Genre getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBooksToGenre(Genre genre, List<Book> books) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBooksFromGenre(Genre genre, List<Book> books) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAuthorsToGenre(Genre genre, List<Author> authors) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAuthorsFromGenre(Genre genre, List<Author> authors) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undeleteGenre(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
