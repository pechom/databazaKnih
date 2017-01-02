package sk.upjs.ics.paz1c.databazaKnih;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class User {

    private int id;
    private String userName;
    private String passwordHash;
    private String mail;
    private String name;
    private String surname;
    private LocalDateTime lastLogin;
    private List<Integer> readBooks;
    private List<Integer> favoriteBooks;
    private List<Integer> wantedBooks;
    private List<Integer> favoriteAuthors;
    private List<Integer> friends;
    private List<Integer> favoriteReviewers;
    private List<Map<Integer, Integer>> reading; // kniha, strana kde sa skoncilo
    private List<Map<Integer, String>> note; //poznamka ku knihe;
    private String Salt;
    private List<Integer> bookReviews;
    private List<Integer> authorReviews;
    private boolean isAdmin;
    private boolean isActive;

    /**
     * @return the login
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the login to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * @param passwordHash the password to set
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setPassword(String password) {

        Salt = BCrypt.gensalt();

        this.passwordHash = BCrypt.hashpw(password, Salt);
    }

    public boolean checkPassword(String password) {
        String result = BCrypt.hashpw(password, Salt);
        return result.equals(passwordHash);
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
     * @return the Salt
     */
    public String getSalt() {
        return Salt;
    }

    /**
     * @param Salt the Salt to set
     */
    public void setSalt(String Salt) {
        this.Salt = Salt;
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
     * @return the isAdmin
     */
    public boolean isIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin the isAdmin to set
     */
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
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
     * @return the readBooks
     */
    public List<Integer> getReadBooks() {
        return readBooks;
    }

    /**
     * @param readBooks the readBooks to set
     */
    public void setReadBooks(List<Integer> readBooks) {
        this.readBooks = readBooks;
    }

    /**
     * @return the favoriteBooks
     */
    public List<Integer> getFavoriteBooks() {
        return favoriteBooks;
    }

    /**
     * @param favoriteBooks the favoriteBooks to set
     */
    public void setFavoriteBooks(List<Integer> favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }

    /**
     * @return the wantedBooks
     */
    public List<Integer> getWantedBooks() {
        return wantedBooks;
    }

    /**
     * @param wantedBooks the wantedBooks to set
     */
    public void setWantedBooks(List<Integer> wantedBooks) {
        this.wantedBooks = wantedBooks;
    }

    /**
     * @return the favoriteAuthors
     */
    public List<Integer> getFavoriteAuthors() {
        return favoriteAuthors;
    }

    /**
     * @param favoriteAuthors the favoriteAuthors to set
     */
    public void setFavoriteAuthors(List<Integer> favoriteAuthors) {
        this.favoriteAuthors = favoriteAuthors;
    }

    /**
     * @return the friends
     */
    public List<Integer> getFriends() {
        return friends;
    }

    /**
     * @param friends the friends to set
     */
    public void setFriends(List<Integer> friends) {
        this.friends = friends;
    }

    /**
     * @return the favoriteReviewers
     */
    public List<Integer> getFavoriteReviewers() {
        return favoriteReviewers;
    }

    /**
     * @param favoriteReviewers the favoriteReviewers to set
     */
    public void setFavoriteReviewers(List<Integer> favoriteReviewers) {
        this.favoriteReviewers = favoriteReviewers;
    }

    /**
     * @return the reading
     */
    public List<Map<Integer, Integer>> getReading() {
        return reading;
    }

    /**
     * @param reading the reading to set
     */
    public void setReading(List<Map<Integer, Integer>> reading) {
        this.reading = reading;
    }

    /**
     * @return the note
     */
    public List<Map<Integer, String>> getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(List<Map<Integer, String>> note) {
        this.note = note;
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
