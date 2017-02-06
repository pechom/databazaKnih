/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;


import sk.upjs.ics.paz1c.databazaKnih.Author;
import sk.upjs.ics.paz1c.databazaKnih.AuthorManager;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;
import sk.upjs.ics.paz1c.databazaKnih.AuthorReview;
import sk.upjs.ics.paz1c.databazaKnih.AuthorReviewManager;
import sk.upjs.ics.paz1c.databazaKnih.BookManager;
import sk.upjs.ics.paz1c.databazaKnih.BookReview;
import sk.upjs.ics.paz1c.databazaKnih.BookReviewManager;

/**
 *
 * @author szoplakz
 */
public class MyReviewForm extends javax.swing.JDialog {
     UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
     BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
     AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();
     AuthorReviewManager authorReviewManager = ObjectFactory.INSTANCE.getAuthorReviewManager();
     BookReviewManager bookReviewManager = ObjectFactory.INSTANCE.getBookReviewManager();
     private static User user;
     private static Book book;
     private static Author author;
     private static boolean isBook;
    
    public MyReviewForm(java.awt.Dialog parent, boolean modal, boolean isBook, User user, Book book, Author author) {
        super(parent, modal);
        initComponents();
        this.user=user;
        this.isBook = isBook;
        if(!isBook){
        this.author = author;   
    } else {
        this.book=book;
        }
        
    } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReviewTextField = new javax.swing.JTextField();
        CancelButton1 = new javax.swing.JButton();
        RatingLabel = new javax.swing.JLabel();
        RatingSpinner = new javax.swing.JSpinner();
        ReviewLabel = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReviewTextArea = new javax.swing.JTextArea();

        CancelButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/CancelIcon.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        RatingLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RatingLabel.setForeground(new java.awt.Color(0, 102, 255));
        RatingLabel.setText("Rating:");

        RatingSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 1, 10, 1));

        ReviewLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReviewLabel.setForeground(new java.awt.Color(0, 102, 255));
        ReviewLabel.setText("Review:");

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        ReviewTextArea.setColumns(20);
        ReviewTextArea.setRows(5);
        jScrollPane1.setViewportView(ReviewTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ReviewLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RatingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(191, 191, 191)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(91, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReviewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RatingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RatingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        if(!isBook){
            AuthorReview review = new AuthorReview();
            review.setIsActive(true);
            review.setAuthor(author.getId());
            review.setUser( user.getId());
            review.setReview(ReviewTextArea.getText());
            review.setRating((int) RatingSpinner.getValue());
            authorReviewManager.insertReview(review);
           userManager.addAuthorReview(review, user);
        
        } else {
        BookReview review = new BookReview();
            review.setBook(book.getId());
            review.setUser( user.getId());
            review.setIsActive(true);
            review.setReview(ReviewTextArea.getText());
            review.setRating((int) RatingSpinner.getValue()); 
            bookReviewManager.insertReview(review);
            bookManager.addReview(review, book);
           userManager.addBookReview(review, user);
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton1;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel RatingLabel;
    private javax.swing.JSpinner RatingSpinner;
    private javax.swing.JLabel ReviewLabel;
    private javax.swing.JTextArea ReviewTextArea;
    private javax.swing.JTextField ReviewTextField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
