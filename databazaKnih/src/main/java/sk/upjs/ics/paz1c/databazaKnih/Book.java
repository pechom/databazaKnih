package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private String author;
    private int year;
    private List<String> genres;
    private int numberOfPages;
    private int ISBN;
    private List<String> tags;
    private String description;
    private int numberOfReviews;
    private int averageOfReviews;
    private int numberInChart;
    private boolean verificationStatus; // 0-neoverena, 1-overena
    private boolean issuedStatus; //vydana alebo nie

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
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
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
     * @return the numberOfPages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages the numberOfPages to set
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * @return the ISBN
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the numberOfReviews
     */
    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    /**
     * @param numberOfReviews the numberOfReviews to set
     */
    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    /**
     * @return the averageOfReviews
     */
    public int getAverageOfReviews() {
        return averageOfReviews;
    }

    /**
     * @param averageOfReviews the averageOfReviews to set
     */
    public void setAverageOfReviews(int averageOfReviews) {
        this.averageOfReviews = averageOfReviews;
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
     * @return the issuedStatus
     */
    public boolean isIssuedStatus() {
        return issuedStatus;
    }

    /**
     * @param issuedStatus the issuedStatus to set
     */
    public void setIssuedStatus(boolean issuedStatus) {
        this.issuedStatus = issuedStatus;
    }

}
