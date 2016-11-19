package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceGenreDao {

    List<Genre> getAllGenre();

    void insertGenre(Genre genre);

    void deleteGenre(int id);

    void updateGenre(int id);
}
