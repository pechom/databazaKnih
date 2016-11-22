package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

//metody na filtre na parametre

public class DefaultGenreManager implements GenreManager {

    private InterfaceGenreDao genreDao = ObjectFactory.INSTANCE.getGenreDao();

    @Override
    public List<Genre> getAllGenre() {
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

}
