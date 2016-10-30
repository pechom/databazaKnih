package sk.upjs.ics.paz1c.databazaKnih;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;


public class User {
    private String login;
    private String password;
    private String mail;
    private String name;
    private String surname;
    private LocalDateTime lastLogin;
    private ArrayList<Book> reviewedBooks;
    private ArrayList<Book> readBooks;
    private ArrayList<Book> favoriteBooks;
    private ArrayList<Book> wantedBooks;
    private ArrayList<Author> reviewedAuthors;
    private ArrayList<Author> favoriteAuthors;
    private ArrayList<User> friends;
    private ArrayList<User> favoriteReviewers;
    private Map<Book, Integer> reading; // kniha, strana kde sa skoncilo
    private Map<Book, String> note; //poznamka ku knihe;
    private boolean Status; //1-admin, 0-obycajny user

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
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
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the lastLogin
     */
    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return the reviewedBooks
     */
    public ArrayList<Book> getReviewedBooks() {
        return reviewedBooks;
    }

    /**
     * @param reviewedBooks the reviewedBooks to set
     */
    public void setReviewedBooks(ArrayList<Book> reviewedBooks) {
        this.reviewedBooks = reviewedBooks;
    }

    /**
     * @return the readBooks
     */
    public ArrayList<Book> getReadBooks() {
        return readBooks;
    }

    /**
     * @param readBooks the readBooks to set
     */
    public void setReadBooks(ArrayList<Book> readBooks) {
        this.readBooks = readBooks;
    }

    /**
     * @return the favoriteBooks
     */
    public ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    /**
     * @param favoriteBooks the favoriteBooks to set
     */
    public void setFavoriteBooks(ArrayList<Book> favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }

    /**
     * @return the wantedBooks
     */
    public ArrayList<Book> getWantedBooks() {
        return wantedBooks;
    }

    /**
     * @param wantedBooks the wantedBooks to set
     */
    public void setWantedBooks(ArrayList<Book> wantedBooks) {
        this.wantedBooks = wantedBooks;
    }

    /**
     * @return the reviewedAuthors
     */
    public ArrayList<Author> getReviewedAuthors() {
        return reviewedAuthors;
    }

    /**
     * @param reviewedAuthors the reviewedAuthors to set
     */
    public void setReviewedAuthors(ArrayList<Author> reviewedAuthors) {
        this.reviewedAuthors = reviewedAuthors;
    }

    /**
     * @return the favoriteAuthors
     */
    public ArrayList<Author> getFavoriteAuthors() {
        return favoriteAuthors;
    }

    /**
     * @param favoriteAuthors the favoriteAuthors to set
     */
    public void setFavoriteAuthors(ArrayList<Author> favoriteAuthors) {
        this.favoriteAuthors = favoriteAuthors;
    }

    /**
     * @return the friends
     */
    public ArrayList<User> getFriends() {
        return friends;
    }

    /**
     * @param friends the friends to set
     */
    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    /**
     * @return the favoriteReviewers
     */
    public ArrayList<User> getFavoriteReviewers() {
        return favoriteReviewers;
    }

    /**
     * @param favoriteReviewers the favoriteReviewers to set
     */
    public void setFavoriteReviewers(ArrayList<User> favoriteReviewers) {
        this.favoriteReviewers = favoriteReviewers;
    }

    /**
     * @return the reading
     */
    public Map<Book, Integer> getReading() {
        return reading;
    }

    /**
     * @param reading the reading to set
     */
    public void setReading(Map<Book, Integer> reading) {
        this.reading = reading;
    }

    /**
     * @return the note
     */
    public Map<Book, String> getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(Map<Book, String> note) {
        this.note = note;
    }

    /**
     * @return the Status
     */
    public boolean isStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
}
