package sk.upjs.ics.paz1c.databazaKnih;

public class AuthorReview {

    private int id;
    private int author;
    private int user;
    private int rating;
    private String review;
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
     * @return the value
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the value to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the review
     */
    public String getReview() {
        return review;
    }

    /**
     * @param review the review to set
     */
    public void setReview(String review) {
        this.review = review;
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

    /**
     * @return the user
     */
    public int getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(int user) {
        this.user = user;
    }
}
