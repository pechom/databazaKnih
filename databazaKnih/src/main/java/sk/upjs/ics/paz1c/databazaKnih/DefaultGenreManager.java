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
    public void addBooksToGenre(Genre genre, List<Integer> books) {
        for (int book : books) {
            if (!genre.getBooksWithGenre().contains(book)) {
                genre.getBooksWithGenre().add(book);
                 genreDao.addBookToGenre(book, genre.getId());
            }
        }
    }

    @Override
    public void removeBooksFromGenre(Genre genre, List<Integer> books) {
        for (int book : books) {
            if (genre.getBooksWithGenre().contains(book)) {
                genre.getBooksWithGenre().remove(book);
                 genreDao.removeBookFromGenre(book, genre.getId());
            }
        }
    }
    @Override
    public List<Genre> removeBook(Book book) {
        List<Genre> genres = getAllGenres();
        List<Genre> removed = new ArrayList<>();
        for (Genre genre : genres) {
            if (genre.getBooksWithGenre().contains(book.getId())) {
                genre.getBooksWithGenre().remove(book.getId());
                removed.add(genre);
            }
        }
        genreDao.removeBook(book.getId());
        return removed;
    }

    @Override
    public void addAuthorsToGenre(Genre genre, List<Integer> authors) {
        for (int author : authors) {
            if (!genre.getAuthorsWithGenre().contains(author)) {
                genre.getAuthorsWithGenre().add(author);
                genreDao.addAuthorToGenre(author, genre.getId());
            }
        }
    }

    @Override
    public void removeAuthorsFromGenre(Genre genre, List<Integer> authors) {
       for (int author : authors) {
            if (genre.getAuthorsWithGenre().contains(author)) {
                genre.getAuthorsWithGenre().remove(author);
                genreDao.removeAuthorFromGenre(author, genre.getId());
            }
        }
    }


    @Override
    public List<Genre> removeAuthor(Author author) {
        List<Genre> genres = getAllGenres();
        List<Genre> removed = new ArrayList<>();
        for (Genre genre : genres) {
            if (genre.getAuthorsWithGenre().contains(author.getId())) {
                genre.getAuthorsWithGenre().remove(author.getId());
                removed.add(genre);
            }
        }
        genreDao.removeAuthor(author.getId());
        return removed;
    }

    @Override
    public void undeleteGenre(int id) {
        genreDao.undeleteGenre(id);
    }
}
