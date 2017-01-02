package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public class Genre {

    private int id;
    private String name;
    private List<Integer> booksWithGenre;
    private List<Integer> authorsWithGenre;
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
     * @return the booksWithGenre
     */
    public List<Integer> getBooksWithGenre() {
        return booksWithGenre;
    }

    /**
     * @param booksWithGenre the booksWithGenre to set
     */
    public void setBooksWithGenre(List<Integer> booksWithGenre) {
        this.booksWithGenre = booksWithGenre;
    }

    /**
     * @return the authorsWithGenre
     */
    public List<Integer> getAuthorsWithGenre() {
        return authorsWithGenre;
    }

    /**
     * @param authorsWithGenre the authorsWithGenre to set
     */
    public void setAuthorsWithGenre(List<Integer> authorsWithGenre) {
        this.authorsWithGenre = authorsWithGenre;
    }
}
