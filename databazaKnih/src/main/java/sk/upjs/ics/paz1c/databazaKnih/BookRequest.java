package sk.upjs.ics.paz1c.databazaKnih;

public class BookRequest {

    private int id;
    private User requester;
    private Book book;
    private String content;
    private boolean isActive;

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
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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
}
