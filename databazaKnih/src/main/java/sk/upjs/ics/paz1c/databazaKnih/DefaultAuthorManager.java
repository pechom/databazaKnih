package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody sna filtre na parametre, overenost.v manageroch po add/remove, average.. dat update. V manageroch je add na vytvaranie vztahov 
//medzi objektami a remove ak treba odstranit chybny vztah prirpadne ak treba prerusit vztahy pred tym ako nieco odstranim (pri realnom odstraneni)
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
            if (author.getName().equals(name)) {
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
                if (author.getGenres().contains(genre)) {
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
            if (author.getBirth() >= year) {
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
            if (author.getBirth() <= year) {
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
            if ((author.getBirth() >= from) && (author.getBirth() < to)) {
                birthAuthors.add(author);
            }
        }
        return birthAuthors;
    }

    @Override
    public List<Author> getAuthorsFromDeath(int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorsToDeath(int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorsFromToDeath(int from, int to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorsByNationality(String nationality) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorsBySex(String sex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorsByLifeStatus(boolean lifeStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBooksToAuthor(List<Book> books, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBooksFromAuthor(List<Book> books, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addGenresToAuthor(List<Genre> genres, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeGenresFromAuthor(List<Genre> genres, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeGenre(Genre Genre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addReview(AuthorReview review, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeReview(AuthorReview review, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undeleteAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorsByAllGenres(List<Genre> genres) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
