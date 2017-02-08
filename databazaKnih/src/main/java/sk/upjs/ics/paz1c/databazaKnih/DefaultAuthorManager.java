package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody na filtre na parametre, overenost.v manageroch po add/remove, average.. dat update. V manageroch je add na vytvaranie vztahov 
//medzi objektami a remove ak treba odstranit chybny vztah pripadne ak treba prerusit vztahy pred tym ako nieco odstranim (pri realnom odstraneni)
// u vsetkych manazerov treba urobit vynimky !
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefaultAuthorManager implements AuthorManager {

    private InterfaceAuthorDao authorDao = ObjectFactory.INSTANCE.getAuthorDao();
    private InterfaceBookDao bookDao = ObjectFactory.INSTANCE.getBookDao();

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
    public void addBooksToAuthor(List<Integer> books, Author author) {
        for (int book : books) {
            if (!author.getBooks().contains(book)) {
                author.getBooks().add(book);
                authorDao.addBookToAuthor(book, author.getId());
            }
        }
    }

    @Override
    public void removeBooksFromAuthor(List<Integer> books, Author author) {
        Iterator<Integer> iter = author.getBooks().iterator();
           
        while(iter.hasNext()){
         int i = iter.next();  
        if(books.contains(i)){
            
                iter.remove();
               authorDao.removeBookFromAuthor(i, author.getId());
        }
        }
    }

    @Override
    public void addGenresToAuthor(List<Integer> genres, Author author) {
        for (int genre : genres) {
            if (!author.getGenres().contains(genre)) {
                author.getGenres().add(genre);
                authorDao.addGenreToAuthor(genre, author.getId());
            }
        }
    }

    @Override
    public void removeGenresFromAuthor(List<Integer> genres, Author author) {
        Iterator<Integer> iter = author.getGenres().iterator();
           
        while(iter.hasNext()){
         int i = iter.next();  
        if(genres.contains(i)){
            
                iter.remove();
               authorDao.removeGenreFromAuthor(i, author.getId());
        }
        }
    }

    @Override
    public List<Author> removeGenre(Genre genre) {
        List<Author> authors = getAllAuthors();
        List<Author> removed = new ArrayList<>();
        for (Author author : authors) {
            if (author.getGenres().contains(genre.getId())) {
                author.getGenres().remove(genre.getId());
                removed.add(author);
            }
        }
        authorDao.removeGenre(genre.getId());
        return removed;
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
                if (!author.getGenres().contains(genre.getId())) {
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

    @Override
    public void removeAllReviews(Author author) {
        author.getAuthorReviews().clear();
        authorDao.removeReviews(author.getId());
    }

    @Override
    public List<Author> getAuthorsByName(String name, List<Author> authors) {

        List<Author> namedAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getName() != null) && (author.getName().equals(name))) {
                namedAuthors.add(author);
            }
        }
        return namedAuthors;
    }

    @Override
    public List<Author> getAuthorsByBook(String bookname, List<Author> authors) {
        List<Author> namedAuthors = new ArrayList<>();
        for (Author author : authors) {
            List<Book> books = new ArrayList<>();
            for (int book : author.getBooks()) {
                books.add(bookDao.findById(book));
            }
            for (Book book : books) {
                boolean isThere = false;
                if ((book.getName() != null) && (book.getName().equals(bookname))) {
                    isThere = true;
                    namedAuthors.add(author);
                }
            }
        }
        return namedAuthors;
    }

    @Override
    public List<Author> getAuthorsByGenres(List<Genre> genres, List<Author> authors) {

        List<Author> genreAuthors = new ArrayList<>();
        for (Author author : authors) {
            for (Genre genre : genres) {
                if ((author.getGenres() != null) && (author.getGenres().contains(genre.getId()))) {
                    genreAuthors.add(author);
                    break;
                }
            }
        }
        return genreAuthors;
    }

    @Override
    public List<Author> getAuthorsFromBirth(int year, List<Author> authors) {

        List<Author> birthAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getBirth() != 0) && (author.getBirth() >= year)) {
                birthAuthors.add(author);
            }
        }
        return birthAuthors;
    }

    @Override
    public List<Author> getAuthorsToBirth(int year, List<Author> authors) {

        List<Author> birthAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getBirth() != 0) && (author.getBirth() <= year)) {
                birthAuthors.add(author);
            }
        }
        return birthAuthors;
    }

    @Override
    public List<Author> getAuthorsFromToBirth(int from, int to, List<Author> authors) {

        List<Author> birthAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getBirth() != 0) && (author.getBirth() >= from) && (author.getBirth() <= to)) {
                birthAuthors.add(author);
            }
        }
        return birthAuthors;
    }

    @Override
    public List<Author> getAuthorsFromDeath(int year, List<Author> authors) {

        List<Author> deathAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getDeath() != 0) && (author.getDeath() >= year)) {
                deathAuthors.add(author);
            }
        }
        return deathAuthors;
    }

    @Override
    public List<Author> getAuthorsToDeath(int year, List<Author> authors) {

        List<Author> deathAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getDeath() != 0) && (author.getDeath() <= year)) {
                deathAuthors.add(author);
            }
        }
        return deathAuthors;
    }

    @Override
    public List<Author> getAuthorsFromToDeath(int from, int to, List<Author> authors) {

        List<Author> deathAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getDeath() != 0) && (author.getDeath() >= from) && (author.getDeath() <= to)) {
                deathAuthors.add(author);
            }
        }
        return deathAuthors;
    }

    @Override
    public List<Author> getAuthorsByNationality(String nationality, List<Author> authors) {

        List<Author> nationalityAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getNationality() != null) && (author.getNationality().equals(nationality))) {
                nationalityAuthors.add(author);
            }
        }
        return nationalityAuthors;
    }

    @Override
    public List<Author> getAuthorsBySex(String sex, List<Author> authors) {

        List<Author> sexAuthors = new ArrayList<>();
        for (Author author : authors) {
            if ((author.getSex() != null) && (author.getSex().equals(sex))) {
                sexAuthors.add(author);
            }
        }
        return sexAuthors;
    }
}
