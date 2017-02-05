package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public class Author {

    private int id;
    private String name;
    private List<Integer> books;
    private List<Integer> genres;
    private int birth;
    private int death;
    private String nationality;
    private String sex;
    private String biography;
    private List<Integer> authorReviews;
    private boolean verificationStatus;
    private boolean lifeStatus; //0-zivy alebo 1-mrtvy;
    private boolean isActive;

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
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the biography
     */
    public String getBiography() {
        return biography;
    }

    /**
     * @param biography the biography to set
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    /**
     * @return the verificationStatus
     */
    public boolean isVerificationStatus() {
        return verificationStatus;
    }

    /**
     * @param verificationStatus the verificationStatus to set
     */
    public void setVerificationStatus(boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * @return the lifeStatus
     */
    public boolean isLifeStatus() {
        return lifeStatus;
    }

    /**
     * @param lifeStatus the lifeStatus to set
     */
    public void setLifeStatus(boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    /**
     * @return the birth
     */
    public int getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(int birth) {
        this.birth = birth;
    }

    /**
     * @return the death
     */
    public int getDeath() {
        return death;
    }

    /**
     * @param death the death to set
     */
    public void setDeath(int death) {
        this.death = death;
    }

    /**
     * @return the books
     */
    public List<Integer> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(List<Integer> books) {
        this.books = books;
    }

    /**
     * @return the genres
     */
    public List<Integer> getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(List<Integer> genres) {
        this.genres = genres;
    }

    /**
     * @return the authorReviews
     */
    public List<Integer> getAuthorReviews() {
        return authorReviews;
    }

    /**
     * @param authorReviews the authorReviews to set
     */
    public void setAuthorReviews(List<Integer> authorReviews) {
        this.authorReviews = authorReviews;
    }
}
