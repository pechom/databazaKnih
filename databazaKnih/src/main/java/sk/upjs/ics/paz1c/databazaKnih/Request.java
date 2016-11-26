package sk.upjs.ics.paz1c.databazaKnih;

public class Request {
//request kde je book null sa tyka autora samotneho atd
    private int id;
    private User requester;
    private Book book;
    private Author author;
    private String content;

    /**
     * @return the author
     */
    public User getRequester() {
        return requester;
    }

    /**
     * @param requester the author to set
     */
    public void setRequester(User requester) {
        this.requester = requester;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(Author author) {
        this.author = author;
    }
}
