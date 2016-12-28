package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String name;
    private int author;
    private int year;
    private List<Integer> genres;
    private int numberOfPages;
    private int ISBN;
    private List<Integer> tags;
    private String description;
    private int numberOfReviews;
    private double averageOfReviews;
    private int numberInChart;
    private boolean verificationStatus; // 0-neoverena, 1-overena
    private List<Integer> bookReviews;
    private double bayesianAverage;
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
    public double getAverageOfReviews() {
        return averageOfReviews;
    }

    /**
     * @param averageOfReviews the averageOfReviews to set
     */
    public void setAverageOfReviews(double averageOfReviews) {
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
     * @return the bayesianAverage
     */
    public double getBayesianAverage() {
        return bayesianAverage;
    }

    /**
     * @param bayesianAverage the bayesianAverage to set
     */
    public void setBayesianAverage(double bayesianAverage) {
        this.bayesianAverage = bayesianAverage;
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
     * @return the tags
     */
    public List<Integer> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }

    /**
     * @return the bookReviews
     */
    public List<Integer> getBookReviews() {
        return bookReviews;
    }

    /**
     * @param bookReviews the bookReviews to set
     */
    public void setBookReviews(List<Integer> bookReviews) {
        this.bookReviews = bookReviews;
    }

}
