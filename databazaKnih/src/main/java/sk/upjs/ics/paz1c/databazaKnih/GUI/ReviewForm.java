/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import sk.upjs.ics.paz1c.databazaKnih.Author;
import sk.upjs.ics.paz1c.databazaKnih.AuthorManager;
import sk.upjs.ics.paz1c.databazaKnih.AuthorReview;
import sk.upjs.ics.paz1c.databazaKnih.BookReview;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.BookManager;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class ReviewForm extends javax.swing.JDialog {

     AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();
BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
     UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
    /**
     * Creates new form ReviewForm
     */
    public ReviewForm(java.awt.Dialog parent, boolean modal, boolean isBook, BookReview bookreview, AuthorReview authorreview) {
        super(parent, modal);
        initComponents();
        
        
        
        if(!isBook){
    Author author = authorManager.findById(authorreview.getAuthor());
    User user = userManager.findById(authorreview.getUser());
    ReviewLabel.setText("Review of " + author.getName());
    UserLabel.setText("by: " + user.getUserName());
    RatingLabel.setText("Rating " + authorreview.getRating());
    ReviewTextArea.setText(authorreview.getReview());
    } else {
        Book book = bookManager.findById(bookreview.getBook());
    User user = userManager.findById(bookreview.getUser());    
        ReviewLabel.setText("Review of " + book.getName());
    UserLabel.setText("by: " + user.getUserName());
    RatingLabel.setText("Rating " + bookreview.getRating());
    ReviewTextArea.setText(bookreview.getReview());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReviewTextField = new javax.swing.JTextField();
        CancelButton1 = new javax.swing.JButton();
        RatingLabel = new javax.swing.JLabel();
        ReviewLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReviewTextArea = new javax.swing.JTextArea();
        UserLabel = new javax.swing.JLabel();
        OkButton = new javax.swing.JButton();

        CancelButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/CancelIcon.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        RatingLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RatingLabel.setForeground(new java.awt.Color(0, 102, 255));
        RatingLabel.setText("Rating:");

        ReviewLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReviewLabel.setForeground(new java.awt.Color(0, 102, 255));
        ReviewLabel.setText("Review of:");

        ReviewTextArea.setColumns(20);
        ReviewTextArea.setRows(5);
        jScrollPane1.setViewportView(ReviewTextArea);

        UserLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(0, 102, 255));
        UserLabel.setText("by:");

        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(263, 263, 263))
                    .addComponent(ReviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReviewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RatingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(false);
    }//GEN-LAST:event_OkButtonActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton1;
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel RatingLabel;
    private javax.swing.JLabel ReviewLabel;
    private javax.swing.JTextArea ReviewTextArea;
    private javax.swing.JTextField ReviewTextField;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
