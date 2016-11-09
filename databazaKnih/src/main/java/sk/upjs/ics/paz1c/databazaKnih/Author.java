package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Author {

    private int id;
    private List<Book> books;
    private List<String> genres;
    private int numberInChart;
    private Date birth;
    private Date death;
    private String nationality;
    private String sex;
    private String biography;
    private List<AuthorReview> authorReviews;
    private boolean verificationStatus;
    private boolean lifeStatus; //0-zivy alebo 1-mrtvy;

    public enum allNationalities {
        CZE, SVK, GBR, USA, HUN, AUT, CAN, DEU, DNK, ESP, FIN, FRA, GRC, IRL, ITA, JPN, NOR, POL,
        PRT, RUS
    }

    public enum allGenres { //.name by malo vratit string takze netreba case
        ACTION, HORROR, ROMANTIC, COMEDY, THRILLER, PSYCHOLOGYCAL, SPORT, FANTASY, SCIFI,
        FICTION, ADVENTURE, HISTORIC, DETECTIVE, FAIRYTAIL, WESTERN
    }

    /**
     * @return the authorReviews
     */
    public List<AuthorReview> getAuthorReviews() {
        return authorReviews;
    }

    /**
     * @param authorReviews the authorReviews to set
     */
    public void setAuthorReviews(List<AuthorReview> authorReviews) {
        this.authorReviews = authorReviews;
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
     * @return the books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * @return the genres
     */
    public List<String> getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    /**
     * @return the numberInChart
     */
    public int getNumberInChart() {
        return numberInChart;
    }

    /**
     * @param numberInChart the numberInChart to set
     */
    public void setNumberInChart(int numberInChart) {
        this.numberInChart = numberInChart;
    }

    /**
     * @return the birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * @return the death
     */
    public Date getDeath() {
        return death;
    }

    /**
     * @param death the death to set
     */
    public void setDeath(Date death) {
        this.death = death;
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
}
