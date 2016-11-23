package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String name;
    private Author author;
    private int year;
    private List<Genre> genres;
    private int numberOfPages;
    private int ISBN;
    private List<Tag> tags;
    private String description;
    private int numberOfReviews;
    private int averageOfReviews;
    private int numberInChart;
    private boolean verificationStatus; // 0-neoverena, 1-overena
    private List<BookReview> bookReviews;
    private int bayesianAverage;
    private boolean isActive;

//    public enum allGenres { //.name by malo vratit string takze netreba case
//        ACTION, HORROR, ROMANTIC, COMEDY, THRILLER, PSYCHOLOGYCAL, SPORT, FANTASY, SCIFI,
//        FICTION, ADVENTURE, HISTORIC, DETECTIVE, FAIRYTAIL, WESTERN
//    }

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
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(Author author) {
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
    public List<Genre> getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(List<Genre> genres) {
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
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(List<Tag> tags) {
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
     * @return the bookReviews
     */
    public List<BookReview> getBookReviews() {
        return bookReviews;
    }

    /**
     * @param bookReviews the bookReviews to set
     */
    public void setBookReviews(List<BookReview> bookReviews) {
        this.bookReviews = bookReviews;
    }

    /**
     * @return the bayesianAverage
     */
    public int getBayesianAverage() {
        return bayesianAverage;
    }

    /**
     * @param bayesianAverage the bayesianAverage to set
     */
    public void setBayesianAverage(int bayesianAverage) {
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

}
