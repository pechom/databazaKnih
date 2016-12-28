package sk.upjs.ics.paz1c.databazaKnih;

public class AuthorRequest {
//request kde je book null sa tyka autora samotneho atd

    private int id;
    private int requester;
    private int author;
    private String content;
    private boolean isActive;

    
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
     * @return the requester
     */
    public int getRequester() {
        return requester;
    }

    /**
     * @param requester the requester to set
     */
    public void setRequester(int requester) {
        this.requester = requester;
    }

    /**
     * @return the author
     */
    public int getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(int author) {
        this.author = author;
    }
}
