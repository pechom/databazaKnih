/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.util.List;
import jdk.nashorn.internal.objects.NativeArray;
import sk.upjs.ics.paz1c.databazaKnih.Author;
import sk.upjs.ics.paz1c.databazaKnih.AuthorManager;
import sk.upjs.ics.paz1c.databazaKnih.AuthorReview;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.BookReview;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.AuthorRequest;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.AuthorRequestManager;
import sk.upjs.ics.paz1c.databazaKnih.AuthorReviewManager;
import sk.upjs.ics.paz1c.databazaKnih.BookManager;
import sk.upjs.ics.paz1c.databazaKnih.BookRequest;
import sk.upjs.ics.paz1c.databazaKnih.BookRequestManager;
import sk.upjs.ics.paz1c.databazaKnih.BookReviewManager;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class ListForm extends javax.swing.JDialog {

    private String[] data;
    private String type;
    private User user;
    private Book[] bookarray;
    private Author[] authorarray;
    private User[] userarray;
    private AuthorRequest[] authorrequestarray;
    private BookRequest[] bookrequestarray;
    private BookReview[] bookreviewarray;
    private AuthorReview[] authorreviewarray;

    AuthorRequestManager authorrequestManager = ObjectFactory.INSTANCE.getAuthorRequestManager();
    UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
    BookReviewManager bookreviewManager = ObjectFactory.INSTANCE.getBookReviewManager();
    BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
    BookRequestManager bookrequestManager = ObjectFactory.INSTANCE.getBookRequestManager();
    AuthorReviewManager authorreviewManager = ObjectFactory.INSTANCE.getAuthorReviewManager();
    AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();

    /**
     * Creates new form ReviewsForm
     */
    public ListForm(java.awt.Dialog parent, boolean modal, String content, User user, Book currentBook, Author currentAuthor) {
        super(parent, modal);
        initComponents();

        this.user = user;

        if (content.equals("FavouriteBooks")) {
            List<Integer> favouriteBooks = user.getFavoriteBooks();
            type = "Book";
            bookarray = new Book[favouriteBooks.size()];
            data = new String[favouriteBooks.size()];
            int i = 0;
            for (Integer bookId : favouriteBooks) {
                Book book = bookManager.findById(bookId);
                data[i] = book.getName();
                bookarray[i] = book;
                i++;
            }
            ContentList.setListData(data);
        }

        if (content.equals("WantedBooks")) {
            List<Integer> wantedBooks = user.getWantedBooks();
            type = "Book";
            data = new String[wantedBooks.size()];
            bookarray = new Book[wantedBooks.size()];
            int i = 0;
            for (Integer bookId : wantedBooks) {
                Book book = bookManager.findById(bookId);
                data[i] = book.getName();
                bookarray[i] = book;
                i++;
            }
            ContentList.setListData(data);
        }
        if (content.equals("ReadBooks")) {
            List<Integer> readBooks = user.getReadBooks();
            type = "Book";
            bookarray = new Book[readBooks.size()];
            data = new String[readBooks.size()];
            int i = 0;
            for (Integer bookId : readBooks) {
                Book book = bookManager.findById(bookId);
                data[i] = book.getName();
                bookarray[i] = book;
                i++;
            }
            ContentList.setListData(data);
        }
        if (content.equals("FavouriteAuthors")) {
            List<Integer> favouriteAuthors = user.getFavoriteAuthors();
            type = "Author";
            authorarray = new Author[favouriteAuthors.size()];
            data = new String[favouriteAuthors.size()];
            int i = 0;
            for (Integer authorId : favouriteAuthors) {
                Author author = authorManager.findById(authorId);
                data[i] = author.getName();
                authorarray[i] = author;
                i++;
            }
            ContentList.setListData(data);
        }

        if (content.equals("FavouriteReviewers")) {
            List<Integer> favouriteReviewers = user.getFavoriteReviewers();
            type = "User";
            data = new String[favouriteReviewers.size()];
            userarray = new User[favouriteReviewers.size()];
            int i = 0;
            for (Integer reviewerId : favouriteReviewers) {
                User reviewer = userManager.findById(reviewerId);
                data[i] = reviewer.getUserName();
                userarray[i] = reviewer;
                i++;
            }
            ContentList.setListData(data);
        }

        if (content.equals("Friends")) {
            List<Integer> friends = user.getFriends();
            type = "User";
            data = new String[friends.size()];
            userarray = new User[friends.size()];
            int i = 0;
            for (Integer friendId : friends) {
                User friend = userManager.findById(friendId);
                data[i] = friend.getUserName();
                userarray[i] = friend;
                i++;
            }
            ContentList.setListData(data);
        }

        if (content.equals("MyBookReviews")) {
            List<Integer> bookReviews = user.getBookReviews();
            type = "BookReview";
            data = new String[bookReviews.size()];
            bookreviewarray = new BookReview[bookReviews.size()];
            int i = 0;
            for (Integer reviewId : bookReviews) {
                BookReview review = bookreviewManager.findById(reviewId);
                data[i] = bookManager.findById(review.getBook()).getName();
                bookreviewarray[i] = review;
                i++;
            }
            ContentList.setListData(data);
        }

        if (content.equals("MyAuthorReviews")) {
            List<Integer> authorReviews = user.getAuthorReviews();
            type = "AuthorReview";
            data = new String[authorReviews.size()];
            authorreviewarray = new AuthorReview[authorReviews.size()];
            int i = 0;
            for (Integer reviewId : authorReviews) {
                AuthorReview review = authorreviewManager.findById(reviewId);
                data[i] = authorManager.findById(review.getAuthor()).getName();
                authorreviewarray[i] = review;
                i++;
            }
            ContentList.setListData(data);

        }
        if (content.equals("BookReviews")) {
            List<Integer> bookReviews = currentBook.getBookReviews();
            type = "BookReview";
            data = new String[bookReviews.size()];
            bookreviewarray = new BookReview[bookReviews.size()];
            int i = 0;
            for (Integer reviewId : bookReviews) {
                BookReview review = bookreviewManager.findById(reviewId);
                data[i] = userManager.findById(review.getUser()).getUserName();
                bookreviewarray[i] = review;
                i++;
            }
            ContentList.setListData(data);
        }

        if (content.equals("AuthorReviews")) {
            List<Integer> authorReviews = currentAuthor.getAuthorReviews();
            type = "AuthorReview";
            data = new String[authorReviews.size()];
            authorreviewarray = new AuthorReview[authorReviews.size()];
            int i = 0;
            for (Integer reviewId : authorReviews) {
                AuthorReview review = authorreviewManager.findById(reviewId);
                data[i] = userManager.findById(review.getUser()).getUserName();
                authorreviewarray[i] = review;
                i++;
            }
            ContentList.setListData(data);

        }

        if (content.equals("RequestsByAuthor")) {
            List<AuthorRequest> requests = authorrequestManager.getRequestsByAuthor(currentAuthor);
            type = "AuthorRequest";
            data = new String[requests.size()];
            authorrequestarray = new AuthorRequest[requests.size()];
            int i = 0;
            for (AuthorRequest request : requests) {

                data[i] = userManager.findById(request.getRequester()).getUserName();
                authorrequestarray[i] = request;
                i++;
            }
            ContentList.setListData(data);

        }

        if (content.equals("RequestsbyBook")) {
            List<BookRequest> requests = bookrequestManager.getRequestsByBook(currentBook);
            type = "BookRequest";
            data = new String[requests.size()];
            bookrequestarray = new BookRequest[requests.size()];
            int i = 0;
            for (BookRequest request : requests) {
                data[i] = userManager.findById(request.getRequester()).getUserName();
                bookrequestarray[i] = request;
                i++;
            }
            ContentList.setListData(data);

        }

        if (content.equals("AllAuthorRequests")) {
            List<AuthorRequest> requests = authorrequestManager.getAllRequests();
            type = "AuthorRequest";
            data = new String[requests.size()];
            authorrequestarray = new AuthorRequest[requests.size()];
            int i = 0;
            for (AuthorRequest request : requests) {
                data[i] = userManager.findById(request.getRequester()).getUserName();
                authorrequestarray[i] = request;
                i++;
            }
            ContentList.setListData(data);

        }

        if (content.equals("AllBookRequests")) {
            List<BookRequest> requests = bookrequestManager.getAllRequests();
            type = "BookRequest";
            data = new String[requests.size()];
            bookrequestarray = new BookRequest[requests.size()];
            int i = 0;
            for (BookRequest request : requests) {
                data[i] = userManager.findById(request.getRequester()).getUserName();;
                bookrequestarray[i] = request;
                i++;
            }
            ContentList.setListData(data);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ContentList = new javax.swing.JList<>();
        ViewContentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(ContentList);

        ViewContentButton.setText("View");
        ViewContentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewContentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ViewContentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ViewContentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewContentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewContentButtonActionPerformed
        if (ContentList.getSelectedIndex() == -1) {
            ErrorForm errorForm = new ErrorForm(this, true, "No item selected");
            errorForm.setVisible(true);
            return;
        } else {

            switch (type) {
                case "Book":
                    if (ContentList.getSelectedIndex() != -1) {
                        Book book = bookarray[ContentList.getSelectedIndex()];
                        BookForm bookform = new BookForm(this, true, user, book);
                        bookform.setVisible(true);
                    }
                case "Author":
                    if (ContentList.getSelectedIndex() != -1) {
                        Author author = authorarray[ContentList.getSelectedIndex()];
                        AuthorForm authorForm = new AuthorForm(this, true, author, user);
                        authorForm.setVisible(true);
                    }

                case "User":
                    if (ContentList.getSelectedIndex() != -1) {
                        User userProfile = userarray[ContentList.getSelectedIndex()];
                        UserProfileForm userForm = new UserProfileForm(this, true, user, userProfile);
                        userForm.setVisible(true);
                    }
                case "BookReview":
                    if (ContentList.getSelectedIndex() != -1) {
                        BookReview bookReview = bookreviewarray[ContentList.getSelectedIndex()];
                        ReviewForm bookreviewForm = new ReviewForm(this, true, true, bookReview, null);
                        bookreviewForm.setVisible(true);
                    }
                case "AuthorReview":
                    if (ContentList.getSelectedIndex() != -1) {
                        AuthorReview authorReview = authorreviewarray[ContentList.getSelectedIndex()];
                        ReviewForm authorreviewForm = new ReviewForm(this, true, false, null, authorReview);
                        authorreviewForm.setVisible(true);
                    }
                case "AuthorRequest":
                    if (ContentList.getSelectedIndex() != -1) {
                        AuthorRequest request = authorrequestarray[ContentList.getSelectedIndex()];
                        RequestForm requestForm = new RequestForm(this, true, request, null, false);
                        requestForm.setVisible(true);
                    }

                case "BookRequest":
                    if (ContentList.getSelectedIndex() != -1) {
                        BookRequest request = bookrequestarray[ContentList.getSelectedIndex()];
                        RequestForm requestForm = new RequestForm(this, true, null, request, false);
                        requestForm.setVisible(true);
                    }

            }
        }

    }//GEN-LAST:event_ViewContentButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ContentList;
    private javax.swing.JButton ViewContentButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
