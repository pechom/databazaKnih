package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public class Genre {

    private int id;
    private String name;
    private List<Book>booksWithGenre;
    private List<Author>authorsWithGenre;
    private boolean isActive;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bookWithGenre
     */
    public List<Book> getBooksWithGenre() {
        return booksWithGenre;
    }

    /**
     * @param booksWithGenre the bookWithGenre to set
     */
    public void setBooksWithGenre(List<Book> booksWithGenre) {
        this.booksWithGenre = booksWithGenre;
    }

    /**
     * @return the authorsWithGenre
     */
    public List<Author> getAuthorsWithGenre() {
        return authorsWithGenre;
    }

    /**
     * @param authorsWithGenre the authorsWithGenre to set
     */
    public void setAuthorsWithGenre(List<Author> authorsWithGenre) {
        this.authorsWithGenre = authorsWithGenre;
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
}
