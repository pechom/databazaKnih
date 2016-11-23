package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

class Tag {

    private int id;
    private String name;
    private List<Book> booksWithTag;
    private boolean isActive;

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
     * @return the booksWithTag
     */
    public List<Book> getBooksWithTag() {
        return booksWithTag;
    }

    /**
     * @param booksWithTag the booksWithTag to set
     */
    public void setBooksWithTag(List<Book> booksWithTag) {
        this.booksWithTag = booksWithTag;
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
}
