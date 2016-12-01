package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody filtre na parametre, overenost, pri add/remove review sa vypocita bayesian, prida pocet a avg a ak bude potrebne zmeni rebricek
//bude sa pocitat bayesian average (priemerne hodnotenie celej databazy sa vzdy bude ziskavat zo vsetkych bookreviews)
import java.util.ArrayList;
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

    @Override
    public List<Book> getVerificatedBooks() {
        List<Book> books = getAllBooks();
        List<Book> verificated = new ArrayList<>();
        for (Book book : books) {
            if (book.isVerificationStatus()) {
                verificated.add(book);
            }
        }
        return verificated;
    }

    @Override
    public List<Book> getNotVerificatedBooks() {
        List<Book> books = getAllBooks();
        List<Book> notVerificated = new ArrayList<>();
        for (Book book : books) {
            if (!book.isVerificationStatus()) {
                notVerificated.add(book);
            }
        }
        return notVerificated;
    }

    @Override
    public List<Book> GetBooksByName(String name) {
        List<Book> books = getAllBooks();
        List<Book> nameBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getName() != null) && (book.getName().equals(name))) {
                nameBooks.add(book);
            }
        }
        return nameBooks;
    }

    @Override
    public List<Book> GetBooksByAuthor(Author author) {
        List<Book> books = getAllBooks();
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getAuthor() != null) && (book.getAuthor().equals(author))) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    @Override
    public List<Book> getBooksFromYear(int year) {
        List<Book> books = getAllBooks();
        List<Book> ageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getYear() != 0) && (book.getYear() >= year)) {
                ageBooks.add(book);
            }
        }
        return ageBooks;
    }

    @Override
    public List<Book> getBooksToYear(int year) {
        List<Book> books = getAllBooks();
        List<Book> ageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getYear() != 0) && (book.getYear() <= year)) {
                ageBooks.add(book);
            }
        }
        return ageBooks;
    }

    @Override
    public List<Book> getBooksFromToYear(int from, int to) {
        List<Book> books = getAllBooks();
        List<Book> ageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getYear() != 0) && (book.getYear() >= from) && (book.getYear() <= to)) {
                ageBooks.add(book);
            }
        }
        return ageBooks;
    }

    @Override
    public List<Book> GetBooksByGenres(List<Genre> genres) {
        List<Book> books = getAllBooks();
        List<Book> genreBooks = new ArrayList<>();
        for (Book book : books) {
            for (Genre genre : genres) {
                if ((book.getGenres() != null) && (book.getGenres().contains(genre))) {
                    genreBooks.add(book);
                    break;
                }
            }
        }
        return genreBooks;
    }

    @Override
    public List<Book> getBooksFromPages(int pages) {
        List<Book> books = getAllBooks();
        List<Book> pageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getNumberOfPages() != 0) && (book.getNumberOfPages() >= pages)) {
                pageBooks.add(book);
            }
        }
        return pageBooks;
    }

    @Override
    public List<Book> getBooksToPages(int pages) {
        List<Book> books = getAllBooks();
        List<Book> pageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getNumberOfPages() != 0) && (book.getNumberOfPages() <= pages)) {
                pageBooks.add(book);
            }
        }
        return pageBooks;
    }

    @Override
    public List<Book> getBooksFromToPages(int from, int to) {
        List<Book> books = getAllBooks();
        List<Book> pageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getNumberOfPages() != 0) && (book.getNumberOfPages() >= from) && (book.getNumberOfPages() <= to)) {
                pageBooks.add(book);
            }
        }
        return pageBooks;
    }

    @Override
    public Book getBookByISBN(int ISBN) {
        List<Book> books = getAllBooks();
        Book ISBNBook = null;
        for (Book book : books) {
            if ((book.getISBN() != 0) && (book.getISBN() == ISBN)) {
                ISBNBook = book;
                break;
            }
        }
        return ISBNBook;
    }

    @Override
    public List<Book> GetBooksByTags(List<Tag> tags) {
        List<Book> books = getAllBooks();
        List<Book> tagBooks = new ArrayList<>();
        for (Book book : books) {
            for (Tag tag : tags) {
                if ((book.getTags() != null) && (book.getTags().contains(tag))) {
                    tagBooks.add(book);
                    break;
                }
            }
        }
        return tagBooks;
    }

    @Override
    public List<Book> GetBooksFromReviews(int numberOfReviews) {
        List<Book> books = getAllBooks();
        List<Book> reviewBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getNumberOfReviews() != 0) && (book.getNumberOfReviews() >= numberOfReviews)) {
                reviewBooks.add(book);
            }
        }
        return reviewBooks;
    }

    @Override
    public List<Book> getBooksFromAverage(int average) {
        List<Book> books = getAllBooks();
        List<Book> averageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getAverageOfReviews() != 0) && (book.getAverageOfReviews() >= average)) {
                averageBooks.add(book);
            }
        }
        return averageBooks;
    }

    @Override
    public List<Book> getBooksToAverage(int average) {
        List<Book> books = getAllBooks();
        List<Book> averageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getAverageOfReviews() != 0) && (book.getAverageOfReviews() <= average)) {
                averageBooks.add(book);
            }
        }
        return averageBooks;
    }

    @Override
    public List<Book> getBooksFromToAverage(int from, int to) {
        List<Book> books = getAllBooks();
        List<Book> averageBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getAverageOfReviews() != 0) && (book.getAverageOfReviews() >= from) && (book.getAverageOfReviews() <= to)) {
                averageBooks.add(book);
            }
        }
        return averageBooks;
    }

    @Override
    public List<Book> getBooksFromChart(int chart) {
        List<Book> books = getAllBooks();
        List<Book> chartBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getNumberInChart() != 0) && (book.getNumberInChart() >= chart)) {
                chartBooks.add(book);
            }
        }
        return chartBooks;
    }

    @Override
    public List<Book> getBooksToChart(int chart) {
        List<Book> books = getAllBooks();
        List<Book> chartBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getNumberInChart() != 0) && (book.getNumberInChart() <= chart)) {
                chartBooks.add(book);
            }
        }
        return chartBooks;
    }

    @Override
    public List<Book> getBooksFromToChart(int from, int to) {
        List<Book> books = getAllBooks();
        List<Book> chartBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getNumberInChart() != 0) && (book.getNumberInChart() >= from) && (book.getNumberInChart() <= to)) {
                chartBooks.add(book);
            }
        }
        return chartBooks;
    }

    @Override
    public List<Book> getBooksFromBayesian(int average) {
        List<Book> books = getAllBooks();
        List<Book> bayesianBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getBayesianAverage() != 0) && (book.getBayesianAverage() >= average)) {
                bayesianBooks.add(book);
            }
        }
        return bayesianBooks;
    }

    @Override
    public List<Book> getBooksToBayesian(int average) {
        List<Book> books = getAllBooks();
        List<Book> bayesianBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getBayesianAverage() != 0) && (book.getBayesianAverage() <= average)) {
                bayesianBooks.add(book);
            }
        }
        return bayesianBooks;
    }

    @Override
    public List<Book> getBooksFromToBayesian(int from, int to) {
        List<Book> books = getAllBooks();
        List<Book> bayesianBooks = new ArrayList<>();
        for (Book book : books) {
            if ((book.getBayesianAverage() != 0) && (book.getBayesianAverage() >= from) && (book.getBayesianAverage() <= to)) {
                bayesianBooks.add(book);
            }
        }
        return bayesianBooks;
    }

    @Override
    public void addAuthorToBook(Book book, Author author) {
        book.setAuthor(author);
        updateBook(book);
    }

    @Override
    public void removeAuthorFromBook(Book book) {
        book.setAuthor(null);
        updateBook(book);
    }

    @Override
    public List<Book> removeAuthor(Author author) {
        List<Book> books = getAllBooks();
        List<Book> removed = new ArrayList<>();
        for (Book book : books) {
            if ((book.getAuthor() != null) && (book.getAuthor().equals(author))) {
                book.setAuthor(null);
                updateBook(book);
                removed.add(book);
            }
        }
        return removed;
    }

    @Override
    public void addGenresToBook(List<Genre> genres, Book book) {
        for (Genre genre : genres) {
            if (!book.getGenres().contains(genre)) {
                book.getGenres().add(genre);
            }
        }
        updateBook(book);
    }

    @Override
    public void removeGenresFromBook(List<Genre> genres, Book book) {
        if (book.getGenres().containsAll(genres)) {
            book.getGenres().removeAll(genres);
        }
        updateBook(book);
    }

    @Override
    public List<Book> removeGenre(Genre genre) {
        List<Book> books = getAllBooks();
        List<Book> removed = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenres().contains(genre)) {
                book.getGenres().remove(genre);
                updateBook(book);
                removed.add(book);
            }
        }
        return removed;
    }

    @Override
    public void addTagsToBook(List<Tag> tags, Book book) {
        for (Tag tag : tags) {
            if (!book.getTags().contains(tag)) {
                book.getTags().add(tag);
            }
        }
        updateBook(book);
    }

    @Override
    public void removeTagsFromBook(List<Tag> tags, Book book) {
        if (book.getTags().containsAll(tags)) {
            book.getTags().removeAll(tags);
        }
        updateBook(book);
    }

    @Override
    public List<Book> removeTag(Tag tag) {
        List<Book> books = getAllBooks();
        List<Book> removed = new ArrayList<>();
        for (Book book : books) {
            if (book.getTags().contains(tag)) {
                book.getTags().remove(tag);
                updateBook(book);
                removed.add(book);
            }
        }
        return removed;
    }

    @Override
    public void addReview(BookReview review, Book book) {//treba chart
        book.getBookReviews().add(review);
        book.setNumberOfReviews(book.getNumberOfReviews() + 1);
        book.setAverageOfReviews((book.getAverageOfReviews() + review.getRating()) / book.getNumberOfReviews());
        calculateAndInsertBayesian(book, 5);

        updateBook(book);
    }

    @Override
    public void removeReview(BookReview review, Book book) {//treba chart
        book.getBookReviews().remove(review);
        book.setNumberOfReviews(book.getNumberOfReviews() - 1);
        book.setAverageOfReviews((book.getAverageOfReviews() + review.getRating()) / book.getNumberOfReviews());
        calculateAndInsertBayesian(book, 5);

        updateBook(book);
    }

    @Override
    public void calculateAndInsertBayesian(Book book, int constant) {
        List<Book> books = getAllBooks();
        int pocetDatabazy = 0;
        int hodnotenieDatabazy = 0;
        for (Book book1 : books) {
            pocetDatabazy += book1.getNumberOfReviews();
            hodnotenieDatabazy += book1.getNumberOfReviews() * book1.getAverageOfReviews();//priemer recenzii vynasobim ich poctom
        }
        hodnotenieDatabazy = hodnotenieDatabazy / pocetDatabazy;//poctom to vydelim poctom vsetkych recenzii
        book.setBayesianAverage(((hodnotenieDatabazy * constant) + (book.getAverageOfReviews() * book.getNumberOfReviews())) / (constant + book.getNumberOfReviews()));
    }

    @Override
    public void undeleteBook(int id) {
        bookDao.undeleteBook(id);
    }

    @Override
    public List<Book> GetBooksByAllGenres(List<Genre> genres) {
        List<Book> books = getAllBooks();
        List<Book> genreBooks = new ArrayList<>();
        for (Book book : books) {
            boolean gotThemAll = true;
            for (Genre genre : genres) {
                if (!book.getGenres().contains(genre)) {
                    gotThemAll = false;
                    break;
                }
            }
            if (gotThemAll) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }

    @Override
    public List<Book> GetBooksByAllTags(List<Tag> tags) {
        List<Book> books = getAllBooks();
        List<Book> tagBooks = new ArrayList<>();
        for (Book book : books) {
            boolean gotThemAll = true;
            for (Tag tag : tags) {
                if (!book.getTags().contains(tag)) {
                    gotThemAll = false;
                    break;
                }
            }
            if (gotThemAll) {
                tagBooks.add(book);
            }
        }
        return tagBooks;
    }
}
