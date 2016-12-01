package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
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
    public Genre getByName(String name) {
        List<Genre> genres = getAllGenres();
        Genre nameGenre = null;
        for (Genre genre : genres) {
            if ((genre.getName() != null) && (genre.getName().equals(name))) {
                nameGenre = genre;
                break;
            }
        }
        return nameGenre;
    }

    @Override
    public void addBooksToGenre(Genre genre, List<Book> books) {
        for (Book book : books) {
            if (!genre.getBooksWithGenre().contains(book)) {
                genre.getBooksWithGenre().add(book);
            }
        }
        updateGenre(genre);
    }

    @Override
    public void removeBooksFromGenre(Genre genre, List<Book> books) {
        if (genre.getBooksWithGenre().containsAll(books)) {
            genre.getBooksWithGenre().removeAll(books);
        }
        updateGenre(genre);
    }

    @Override
    public List<Genre> removeBook(Book book) {
        List<Genre> genres = getAllGenres();
        List<Genre> removed = new ArrayList<>();
        for (Genre genre : genres) {
            if (genre.getBooksWithGenre().contains(book)) {
                genre.getBooksWithGenre().remove(book);
                updateGenre(genre);
                removed.add(genre);
            }
        }
        return removed;
    }

    @Override
    public void addAuthorsToGenre(Genre genre, List<Author> authors) {
        for (Author author : authors) {
            if (!genre.getAuthorsWithGenre().contains(author)) {
                genre.getAuthorsWithGenre().add(author);
            }
        }
        updateGenre(genre);
    }

    @Override
    public void removeAuthorsFromGenre(Genre genre, List<Author> authors) {
        if (genre.getAuthorsWithGenre().containsAll(authors)) {
            genre.getAuthorsWithGenre().removeAll(authors);
        }
        updateGenre(genre);
    }

    @Override
    public List<Genre> removeAuthor(Author author) {
        List<Genre> genres = getAllGenres();
        List<Genre> removed = new ArrayList<>();
        for (Genre genre : genres) {
            if (genre.getAuthorsWithGenre().contains(author)) {
                genre.getAuthorsWithGenre().remove(author);
                updateGenre(genre);
                removed.add(genre);
            }
        }
        return removed;
    }

    @Override
    public void undeleteGenre(int id) {
        genreDao.undeleteGenre(id);
    }

}
