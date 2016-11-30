package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody sna filtre na parametre, overenost.v manageroch po add/remove, average.. dat update. V manageroch je add na vytvaranie vztahov 
//medzi objektami a remove ak treba odstranit chybny vztah pripadne ak treba prerusit vztahy pred tym ako nieco odstranim (pri realnom odstraneni)
import java.util.ArrayList;
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
        Author author = authorDao.findById(id);
        return author;
    }

    @Override
    public List<Author> getVerificatedAuthors() {
        List<Author> authors = getAllAuthors();
        List<Author> verificatedAuthors = new ArrayList<>();
        for (Author author : authors) {
            if (author.isVerificationStatus()) {
                verificatedAuthors.add(author);
            }
        }
        return verificatedAuthors;
    }

    @Override
    public List<Author> getNotVerificatedAuthors() {
        List<Author> authors = getAllAuthors();
        List<Author> notVerificatedAuthors = new ArrayList<>();
        for (Author author : authors) {
            if (!author.isVerificationStatus()) {
                notVerificatedAuthors.add(author);
            }
        }
        return notVerificatedAuthors;

    }

    @Override
    public List<Author> getAuthorsByName(String name) {
        List<Author> authors = getAllAuthors();
        List<Author> namedAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getName() != null) && (author.getName().equals(name))) {
                namedAuthors.add(author);
            }
        }
        return namedAuthors;
    }

    @Override
    public List<Author> getAuthorsByGenres(List<Genre> genres) {
        List<Author> authors = getAllAuthors();
        List<Author> genreAuthors = new ArrayList<>();
        for (Author author : authors) {
            for (Genre genre : genres) {
                if ((author.getGenres() != null) && (author.getGenres().contains(genre))) {
                    genreAuthors.add(author);
                    break;
                }
            }
        }
        return genreAuthors;
    }

    @Override
    public List<Author> getAuthorsFromBirth(int year) {
        List<Author> authors = getAllAuthors();
        List<Author> birthAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getBirth() != 0) && (author.getBirth() >= year)) {
                birthAuthors.add(author);
            }
        }
        return birthAuthors;
    }

    @Override
    public List<Author> getAuthorsToBirth(int year) {
        List<Author> authors = getAllAuthors();
        List<Author> birthAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getBirth() != 0) && (author.getBirth() <= year)) {
                birthAuthors.add(author);
            }
        }
        return birthAuthors;
    }

    @Override
    public List<Author> getAuthorsFromToBirth(int from, int to) {
        List<Author> authors = getAllAuthors();
        List<Author> birthAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getBirth() != 0) && (author.getBirth() >= from) && (author.getBirth() <= to)) {
                birthAuthors.add(author);
            }
        }
        return birthAuthors;
    }

    @Override
    public List<Author> getAuthorsFromDeath(int year) {
        List<Author> authors = getAllAuthors();
        List<Author> deathAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getDeath() != 0) && (author.getDeath() >= year)) {
                deathAuthors.add(author);
            }
        }
        return deathAuthors;
    }

    @Override
    public List<Author> getAuthorsToDeath(int year) {
        List<Author> authors = getAllAuthors();
        List<Author> deathAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getDeath() != 0) && (author.getDeath() <= year)) {
                deathAuthors.add(author);
            }
        }
        return deathAuthors;
    }

    @Override
    public List<Author> getAuthorsFromToDeath(int from, int to) {
        List<Author> authors = getAllAuthors();
        List<Author> deathAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getDeath() != 0) && (author.getDeath() >= from) && (author.getDeath() <= to)) {
                deathAuthors.add(author);
            }
        }
        return deathAuthors;
    }

    @Override
    public List<Author> getAuthorsByNationality(String nationality) {
        List<Author> authors = getAllAuthors();
        List<Author> nationalityAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getNationality() != null) && (author.getNationality().equals(nationality))) {
                nationalityAuthors.add(author);
            }
        }
        return nationalityAuthors;
    }

    @Override
    public List<Author> getAuthorsBySex(String sex) {
        List<Author> authors = getAllAuthors();
        List<Author> sexAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getSex() != null) && (author.getSex().equals(sex))) {
                sexAuthors.add(author);
            }
        }
        return sexAuthors;
    }

    @Override
    public void addBooksToAuthor(List<Book> books, Author author) {
        for (Book book : books) {
            if (!author.getBooks().contains(book)) {
                author.getBooks().add(book);
            }
        }
        updateAuthor(author);
    }

    @Override
    public void removeBooksFromAuthor(List<Book> books, Author author) {
        if (author.getBooks().containsAll(books)) {
            author.getBooks().removeAll(books);
        }
        updateAuthor(author);
    }

    @Override
    public void addGenresToAuthor(List<Genre> genres, Author author) {
        for (Genre genre : genres) {
            if (!author.getGenres().contains(genre)) {
                author.getGenres().add(genre);
            }
        }
        updateAuthor(author);
    }

    @Override
    public void removeGenresFromAuthor(List<Genre> genres, Author author) {
        if (author.getGenres().containsAll(genres)) {
            author.getGenres().removeAll(genres);
        }
        updateAuthor(author);
    }

    @Override
    public List<Author> removeGenre(Genre genre) {
        List<Author> authors = getAllAuthors();
        List<Author> removed = new ArrayList<>();
        for (Author author : authors) {
            if (author.getGenres().contains(genre)) {
                author.getGenres().remove(genre);
                updateAuthor(author);
                removed.add(author);
            }
        }
        return removed;
    }

    @Override
    public void addReview(AuthorReview review, Author author) {
        author.getAuthorReviews().add(review);
        updateAuthor(author);
    }

    @Override
    public void removeReview(AuthorReview review, Author author) {
        author.getAuthorReviews().remove(review);
        updateAuthor(author);
    }

    @Override
    public void undeleteAuthor(int id) {
        authorDao.undeleteAuthor(id);
    }

    @Override
    public List<Author> getAuthorsByAllGenres(List<Genre> genres) {
        List<Author> authors = getAllAuthors();
        List<Author> genreAuthors = new ArrayList<>();
        for (Author author : authors) {
            boolean gotThemAll = true;
            for (Genre genre : genres) {
                if (!author.getGenres().contains(genre)) {
                    gotThemAll = false;
                    break;
                }
            }
            if (gotThemAll) {
                genreAuthors.add(author);
            }
        }
        return genreAuthors;
    }

    @Override
    public List<Author> getAliveAuthors() {
        List<Author> authors = getAllAuthors();
        List<Author> aliveAuthors = new ArrayList<>();
        for (Author author : authors) {
            if (author.isLifeStatus()) {
                aliveAuthors.add(author);
            }
        }
        return aliveAuthors;
    }

    @Override
    public List<Author> getDeadAuthors() {
        List<Author> authors = getAllAuthors();
        List<Author> deadAuthors = new ArrayList<>();
        for (Author author : authors) {
            if (!author.isLifeStatus()) {
                deadAuthors.add(author);
            }
        }
        return deadAuthors;
    }

}
