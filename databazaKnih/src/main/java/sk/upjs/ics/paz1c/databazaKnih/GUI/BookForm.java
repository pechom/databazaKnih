/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.util.ArrayList;
import java.util.List;
import sk.upjs.ics.paz1c.databazaKnih.AuthorManager;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.BookManager;
import sk.upjs.ics.paz1c.databazaKnih.Genre;
import sk.upjs.ics.paz1c.databazaKnih.GenreManager;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.Tag;
import sk.upjs.ics.paz1c.databazaKnih.TagManager;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class BookForm extends javax.swing.JDialog {

    UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
    BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
    AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();
    GenreManager genreManager = ObjectFactory.INSTANCE.getGenreManager();
    TagManager tagManager = ObjectFactory.INSTANCE.getTagManager();
    private Book book;
    private User user;

    /**
     * Creates new form BookForm
     */
    public BookForm(java.awt.Dialog parent, boolean modal, User user, Book book) {
        super(parent, modal);
        initComponents();
        this.setSize(606, 685);
        this.book = book;
        this.user = user;
        if (!user.isIsAdmin()) {
            UpdateButton.enable(false);
            UpdateButton.setVisible(false);
            DeleteButton.enable(false);
            DeleteButton.setVisible(false);
        }
        if (user.getFavoriteBooks().contains(book)) {
            AddtoFavouritesToggleButton.setSelected(true);
        }
        if (user.getReadBooks().contains(book)) {
            AddtoReadToggleButton.setSelected(true);
        }
        if (user.getWantedBooks().contains(book)) {
            AddtoWantedToggleButton.setSelected(true);
        }

        BookNameLabel.setText("Name: " + book.getName());
        if (book.getAuthor() != 0) {
            AuthorNameLabel.setText("Author: " + authorManager.findById(book.getAuthor()).getName());
        }
        ISBNLabel.setText("ISBN: " + book.getISBN());
        YearLabel.setText("Year of publication: " + book.getYear());
        RatingLabel.setText("Rating: " + book.getBayesianAverage());
        LengthLabel.setText("Number of Pages:" + book.getNumberOfPages());
        
        List<Integer> genres = book.getGenres();
        String[] genreNames = new String[genres.size()];
        int i = 0;
        for (Integer genreId : genres) {
            genreNames[i] = genreManager.findById(genreId).getName();
            i++;
        }
        GenreList.setListData(genreNames);
        List<Integer> tags = book.getTags();
        String[] tagNames = new String[tags.size()];
        int j = 0;
        for (Integer tagId : tags) {
            tagNames[j] = tagManager.findById(tagId).getName();

            j++;
        }
        TagList.setListData(tagNames);

        SynopsisTextArea.setText(book.getDescription());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AuthorNameLabel = new javax.swing.JLabel();
        ISBNLabel = new javax.swing.JLabel();
        LengthLabel = new javax.swing.JLabel();
        YearLabel = new javax.swing.JLabel();
        GenreBookLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GenreList = new javax.swing.JList<>();
        TagsBookLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TagList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        SynopsisTextArea = new javax.swing.JTextArea();
        SynopsisLabel = new javax.swing.JLabel();
        ReviewButton = new javax.swing.JButton();
        AddToFavoriteBooksLabel = new javax.swing.JLabel();
        AddToReadBooksLabel = new javax.swing.JLabel();
        AddToWantedBooksLabel = new javax.swing.JLabel();
        ReviewsLabel = new javax.swing.JLabel();
        BookReviewsIconButton = new javax.swing.JButton();
        BookNameLabel = new javax.swing.JLabel();
        RatingLabel = new javax.swing.JLabel();
        SendRequestButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddtoFavouritesToggleButton = new javax.swing.JToggleButton();
        AddtoWantedToggleButton = new javax.swing.JToggleButton();
        AddtoReadToggleButton = new javax.swing.JToggleButton();
        ViewRequestsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        AuthorNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorNameLabel.setForeground(new java.awt.Color(0, 102, 255));
        AuthorNameLabel.setText("Author:");
        getContentPane().add(AuthorNameLabel);
        AuthorNameLabel.setBounds(10, 32, 513, 15);

        ISBNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ISBNLabel.setForeground(new java.awt.Color(0, 102, 255));
        ISBNLabel.setText("ISBN:");
        getContentPane().add(ISBNLabel);
        ISBNLabel.setBounds(10, 53, 513, 15);

        LengthLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LengthLabel.setForeground(new java.awt.Color(0, 102, 255));
        LengthLabel.setText("Number of Pages:");
        getContentPane().add(LengthLabel);
        LengthLabel.setBounds(10, 74, 513, 15);

        YearLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        YearLabel.setForeground(new java.awt.Color(0, 102, 255));
        YearLabel.setText("Year of publication:");
        getContentPane().add(YearLabel);
        YearLabel.setBounds(10, 95, 513, 15);

        GenreBookLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenreBookLabel.setForeground(new java.awt.Color(0, 102, 255));
        GenreBookLabel.setText("Genres:");
        getContentPane().add(GenreBookLabel);
        GenreBookLabel.setBounds(10, 137, 45, 15);

        GenreList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        GenreList.setMaximumSize(new java.awt.Dimension(15, 80));
        GenreList.setMinimumSize(new java.awt.Dimension(15, 80));
        jScrollPane1.setViewportView(GenreList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 158, 170, 130);

        TagsBookLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TagsBookLabel.setForeground(new java.awt.Color(0, 102, 255));
        TagsBookLabel.setText("Tags:");
        getContentPane().add(TagsBookLabel);
        TagsBookLabel.setBounds(10, 294, 32, 15);

        TagList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(TagList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 315, 170, 130);

        SynopsisTextArea.setColumns(20);
        SynopsisTextArea.setRows(5);
        SynopsisTextArea.setMaximumSize(new java.awt.Dimension(500, 250));
        jScrollPane3.setViewportView(SynopsisTextArea);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(188, 270, 388, 249);

        SynopsisLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SynopsisLabel.setForeground(new java.awt.Color(0, 102, 255));
        SynopsisLabel.setText("Synopsis: ");
        getContentPane().add(SynopsisLabel);
        SynopsisLabel.setBounds(190, 237, 62, 15);

        ReviewButton.setText("Review");
        ReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReviewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReviewButton);
        ReviewButton.setBounds(465, 227, 107, 36);

        AddToFavoriteBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddToFavoriteBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        AddToFavoriteBooksLabel.setText(" Add to Favourites:");
        getContentPane().add(AddToFavoriteBooksLabel);
        AddToFavoriteBooksLabel.setBounds(458, 525, 118, 21);

        AddToReadBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddToReadBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        AddToReadBooksLabel.setText("Add to Read:");
        getContentPane().add(AddToReadBooksLabel);
        AddToReadBooksLabel.setBounds(188, 532, 82, 15);

        AddToWantedBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddToWantedBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        AddToWantedBooksLabel.setText("Add to Wanted:");
        getContentPane().add(AddToWantedBooksLabel);
        AddToWantedBooksLabel.setBounds(332, 528, 99, 15);

        ReviewsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReviewsLabel.setForeground(new java.awt.Color(0, 102, 255));
        ReviewsLabel.setText("Reviews:");
        getContentPane().add(ReviewsLabel);
        ReviewsLabel.setBounds(10, 531, 54, 15);

        BookReviewsIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/BookReviewsIcon.png"))); // NOI18N
        BookReviewsIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookReviewsIconButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BookReviewsIconButton);
        BookReviewsIconButton.setBounds(10, 552, 92, 85);

        BookNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookNameLabel.setForeground(new java.awt.Color(0, 102, 255));
        BookNameLabel.setText("Name: (bookname)");
        getContentPane().add(BookNameLabel);
        BookNameLabel.setBounds(10, 11, 513, 15);

        RatingLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RatingLabel.setForeground(new java.awt.Color(0, 102, 255));
        RatingLabel.setText("Ratings:");
        getContentPane().add(RatingLabel);
        RatingLabel.setBounds(10, 116, 513, 15);

        SendRequestButton.setText("Send Request");
        SendRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendRequestButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SendRequestButton);
        SendRequestButton.setBounds(321, 226, 111, 38);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(321, 170, 111, 38);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(465, 170, 107, 38);

        AddtoFavouritesToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/FavouriteIcon.png"))); // NOI18N
        AddtoFavouritesToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoFavouritesToggleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddtoFavouritesToggleButton);
        AddtoFavouritesToggleButton.setBounds(495, 552, 81, 85);

        AddtoWantedToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/WantedBookIcon.png"))); // NOI18N
        AddtoWantedToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoWantedToggleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddtoWantedToggleButton);
        AddtoWantedToggleButton.setBounds(332, 552, 91, 85);

        AddtoReadToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/TickIcon.png"))); // NOI18N
        AddtoReadToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoReadToggleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddtoReadToggleButton);
        AddtoReadToggleButton.setBounds(188, 558, 97, 79);

        ViewRequestsButton.setText("View Requests");
        ViewRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRequestsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewRequestsButton);
        ViewRequestsButton.setBounds(202, 170, 109, 38);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookReviewsIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookReviewsIconButtonActionPerformed
        ListForm bookReviewsList = new ListForm(this, true, "BookReviews", user, book, null);
        bookReviewsList.setVisible(true);
    }//GEN-LAST:event_BookReviewsIconButtonActionPerformed

    private void ReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReviewButtonActionPerformed
        MyReviewForm reviewForm = new MyReviewForm(this, true, true, user, book, null);
        reviewForm.setVisible(true);
    }//GEN-LAST:event_ReviewButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        AddOrUpdateBookForm updateBookForm = new AddOrUpdateBookForm(this, true, book, true,user);
        updateBookForm.setVisible(true);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void SendRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendRequestButtonActionPerformed
        MyRequestForm requestForm = new MyRequestForm(this, true, true, user, book, null);
        requestForm.setVisible(true);
    }//GEN-LAST:event_SendRequestButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        bookManager.deleteBook(book.getId());
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddtoFavouritesToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoFavouritesToggleButtonActionPerformed
        if (AddtoFavouritesToggleButton.isSelected()) {
            List<Integer> books = new ArrayList<>();
            books.add(book.getId());
            userManager.addFavoriteBooksToUser(books, user);
        }
    }//GEN-LAST:event_AddtoFavouritesToggleButtonActionPerformed

    private void AddtoWantedToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoWantedToggleButtonActionPerformed
        if (AddtoWantedToggleButton.isSelected()) {
            List<Integer> books = new ArrayList<>();
            books.add(book.getId());
            userManager.addWantedBooksToUser(books, user);
        }
    }//GEN-LAST:event_AddtoWantedToggleButtonActionPerformed

    private void AddtoReadToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoReadToggleButtonActionPerformed
        if (AddtoReadToggleButton.isSelected()) {
            List<Integer> books = new ArrayList<>();
            books.add(book.getId());
            userManager.addReadBooksToUser(books, user);
        }
    }//GEN-LAST:event_AddtoReadToggleButtonActionPerformed

    private void ViewRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRequestsButtonActionPerformed
        ListForm authorReviewsList = new ListForm(this, true, "RequestsByBook", null, book, null);
        authorReviewsList.setVisible(true);

    }//GEN-LAST:event_ViewRequestsButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddToFavoriteBooksLabel;
    private javax.swing.JLabel AddToReadBooksLabel;
    private javax.swing.JLabel AddToWantedBooksLabel;
    private javax.swing.JToggleButton AddtoFavouritesToggleButton;
    private javax.swing.JToggleButton AddtoReadToggleButton;
    private javax.swing.JToggleButton AddtoWantedToggleButton;
    private javax.swing.JLabel AuthorNameLabel;
    private javax.swing.JLabel BookNameLabel;
    private javax.swing.JButton BookReviewsIconButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel GenreBookLabel;
    private javax.swing.JList<String> GenreList;
    private javax.swing.JLabel ISBNLabel;
    private javax.swing.JLabel LengthLabel;
    private javax.swing.JLabel RatingLabel;
    private javax.swing.JButton ReviewButton;
    private javax.swing.JLabel ReviewsLabel;
    private javax.swing.JButton SendRequestButton;
    private javax.swing.JLabel SynopsisLabel;
    private javax.swing.JTextArea SynopsisTextArea;
    private javax.swing.JList<String> TagList;
    private javax.swing.JLabel TagsBookLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewRequestsButton;
    private javax.swing.JLabel YearLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
