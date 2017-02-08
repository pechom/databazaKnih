/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.awt.Dialog;
import sk.upjs.ics.paz1c.databazaKnih.Author;
import sk.upjs.ics.paz1c.databazaKnih.AuthorManager;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.AuthorRequest;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.AuthorRequestManager;
import sk.upjs.ics.paz1c.databazaKnih.BookManager;
import sk.upjs.ics.paz1c.databazaKnih.BookRequest;
import sk.upjs.ics.paz1c.databazaKnih.BookRequestManager;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class MyRequestForm extends javax.swing.JDialog {

    AuthorRequestManager authorrequestManager = ObjectFactory.INSTANCE.getAuthorRequestManager();
    BookRequestManager bookrequestManager = ObjectFactory.INSTANCE.getBookRequestManager();
    BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
    AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();
    UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
     private static User user;
     private static Book book;
     private static Author author;
     private static boolean isBook;
    /**
     * Creates new form MyRequestForm
     */
    public MyRequestForm(java.awt.Dialog parent, boolean modal, boolean isBook, User user, Book book, Author author) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MessageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MessageTextArea = new javax.swing.JTextArea();
        ConfirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MessageLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageLabel.setForeground(new java.awt.Color(0, 102, 255));
        MessageLabel.setText("Message:");

        MessageTextArea.setColumns(20);
        MessageTextArea.setRows(5);
        jScrollPane1.setViewportView(MessageTextArea);

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MessageLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(247, 247, 247)
                            .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(12, 12, 12)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MessageLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        if(!isBook){
            AuthorRequest request = new AuthorRequest();
            request.setAuthor(author.getId());
            request.setIsActive(true);
            request.setRequester(user.getId());
            
            request.setContent(MessageTextArea.getText());
            authorrequestManager.insertRequest(request);
             this.setVisible(false);
           User updateduser = userManager.findById(user.getId());
           Author updatedauthor = authorManager.findById(author.getId());
           AuthorForm authorform = new AuthorForm((Dialog)this.getParent().getParent(),true, updatedauthor, updateduser);
           this.getParent().setVisible(false);
           authorform.setVisible(true);
        } else {
            BookRequest request = new BookRequest();
            
             request.setBook(book.getId());
             request.setIsActive(true);
            request.setRequester(user.getId());
            request.setContent(MessageTextArea.getText());
            System.out.println("blabla");
            bookrequestManager.insertRequest(request);
            System.out.println("blabla");
             this.setVisible(false);
           User updateduser = userManager.findById(user.getId());
           Book updatedbook = bookManager.findById(book.getId());
           BookForm bookform = new BookForm((Dialog)this.getParent().getParent(),true, updateduser, updatedbook);
           this.getParent().setVisible(false);
           bookform.setVisible(true);
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JTextArea MessageTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
