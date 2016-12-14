/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.awt.Dialog;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class UserProfileForm extends javax.swing.JDialog {

    UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
    private User userProfile;
    private User currentUser;
    
    /**
     * Creates new form UserProfileForm
     */
    public UserProfileForm(java.awt.Dialog parent, boolean modal,User currentUser, User userProfile) {
        super(parent, modal);
        initComponents();
        this.currentUser = currentUser;
        this.userProfile = userProfile; 
        UserNameLabel.setText( userProfile.getUserName() + "'s profile");
        NameLabel.setText("Name: " + userProfile.getName());
        SurnameLabel.setText("Surname: " + userProfile.getSurname());
        MailLabel.setText("E-mail: " + userProfile.getMail());
        if(userProfile.isIsAdmin()){
        StatusLabel.setText("Status: Admin");
        } else {
        StatusLabel.setText("Status: User"); 
        }
        if(userProfile.isIsAdmin() || !currentUser.isIsAdmin()){
        PromoteToAdminButton.enable(false);
         PromoteToAdminButton.setVisible(false);
         PromoteLabel.setVisible(false);
        DeleteUserButton.setVisible(false);
        DeleteUserButton.enable(false);
        DeleteUserLabel.setVisible(false);
        }
        ReviewsLabel.setText(userProfile.getUserName() + "'s reviews");
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserNameLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        MailLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        ReviewsLabel = new javax.swing.JLabel();
        BookReviewsLabel = new javax.swing.JLabel();
        BookReviewsIconButton = new javax.swing.JButton();
        AuthorReviewsLabel = new javax.swing.JLabel();
        AuthorReviewIconButton = new javax.swing.JButton();
        PromoteLabel = new javax.swing.JLabel();
        AddFavouriteReviewer = new javax.swing.JLabel();
        FavouriteBookIconButton = new javax.swing.JButton();
        FavoriteBooksLabel = new javax.swing.JLabel();
        ReadBooksLabel = new javax.swing.JLabel();
        ReadBooksIconButton = new javax.swing.JButton();
        WantedBooksIconButton = new javax.swing.JButton();
        WantedBooksLabel = new javax.swing.JLabel();
        FavouriteReviewersLabel = new javax.swing.JLabel();
        FavouriteReviewersIconButton = new javax.swing.JButton();
        FriendsIconButton = new javax.swing.JButton();
        FriendsLabel = new javax.swing.JLabel();
        FavouriteAuthorsIconButton = new javax.swing.JButton();
        FavouriteAuthorsLabel = new javax.swing.JLabel();
        DeleteUserButton = new javax.swing.JButton();
        DeleteUserLabel = new javax.swing.JLabel();
        SurnameLabel = new javax.swing.JLabel();
        AddFriendLabel1 = new javax.swing.JLabel();
        PromoteToAdminButton = new javax.swing.JButton();
        AddToFriendsToggleButton = new javax.swing.JToggleButton();
        AddFavouriteReviewerToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        UserNameLabel.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        UserNameLabel.setText("(Username)'s profile");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(0, 102, 255));
        NameLabel.setText("Full Name: (NameSurnameHere)");

        MailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MailLabel.setForeground(new java.awt.Color(0, 102, 255));
        MailLabel.setText("E-mail: (EmailHere)");

        StatusLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(0, 102, 255));
        StatusLabel.setText("Status: (User or Admin)");

        ReviewsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReviewsLabel.setForeground(new java.awt.Color(0, 102, 255));
        ReviewsLabel.setText("(Username's) Reviews:");

        BookReviewsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookReviewsLabel.setForeground(new java.awt.Color(0, 102, 255));
        BookReviewsLabel.setText("Books:");

        BookReviewsIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/BookReviewsIcon.png"))); // NOI18N
        BookReviewsIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookReviewsIconButtonActionPerformed(evt);
            }
        });

        AuthorReviewsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorReviewsLabel.setForeground(new java.awt.Color(0, 102, 255));
        AuthorReviewsLabel.setText("Authors:");

        AuthorReviewIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/AuthorReviewIcon.png"))); // NOI18N
        AuthorReviewIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorReviewIconButtonActionPerformed(evt);
            }
        });

        PromoteLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PromoteLabel.setForeground(new java.awt.Color(0, 102, 255));
        PromoteLabel.setText("Promote to Admin:");

        AddFavouriteReviewer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddFavouriteReviewer.setForeground(new java.awt.Color(0, 102, 255));
        AddFavouriteReviewer.setText("Mark as favourite reviewer:");

        FavouriteBookIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/FavouriteIcon.png"))); // NOI18N
        FavouriteBookIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavouriteBookIconButtonActionPerformed(evt);
            }
        });

        FavoriteBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FavoriteBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        FavoriteBooksLabel.setText(" Favourite Books:");

        ReadBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReadBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        ReadBooksLabel.setText("Read Books:");

        ReadBooksIconButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReadBooksIconButton.setForeground(new java.awt.Color(0, 102, 255));
        ReadBooksIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/TickIcon.png"))); // NOI18N
        ReadBooksIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadBooksIconButtonActionPerformed(evt);
            }
        });

        WantedBooksIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/WantedBookIcon.png"))); // NOI18N
        WantedBooksIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WantedBooksIconButtonActionPerformed(evt);
            }
        });

        WantedBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        WantedBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        WantedBooksLabel.setText("Wanted Books:");

        FavouriteReviewersLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FavouriteReviewersLabel.setForeground(new java.awt.Color(0, 102, 255));
        FavouriteReviewersLabel.setText("Favourite Reviewers:");

        FavouriteReviewersIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/FavouriteReviewersIcon.png"))); // NOI18N
        FavouriteReviewersIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavouriteReviewersIconButtonActionPerformed(evt);
            }
        });

        FriendsIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/FriendsIcon.png"))); // NOI18N
        FriendsIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriendsIconButtonActionPerformed(evt);
            }
        });

        FriendsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FriendsLabel.setForeground(new java.awt.Color(0, 102, 255));
        FriendsLabel.setText("Friends:");

        FavouriteAuthorsIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/FavouriteAuthorsIcon.png"))); // NOI18N
        FavouriteAuthorsIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavouriteAuthorsIconButtonActionPerformed(evt);
            }
        });

        FavouriteAuthorsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FavouriteAuthorsLabel.setForeground(new java.awt.Color(0, 102, 255));
        FavouriteAuthorsLabel.setText("Favourite Authors:");

        DeleteUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/DeleteUserIcon.png"))); // NOI18N
        DeleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButtonActionPerformed(evt);
            }
        });

        DeleteUserLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteUserLabel.setForeground(new java.awt.Color(0, 102, 255));
        DeleteUserLabel.setText("Delete User:");

        SurnameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SurnameLabel.setForeground(new java.awt.Color(0, 102, 255));
        SurnameLabel.setText("Full Name: (NameSurnameHere)");

        AddFriendLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddFriendLabel1.setForeground(new java.awt.Color(0, 102, 255));
        AddFriendLabel1.setText("Add to friends: ");

        PromoteToAdminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/PromoteToAdminIcon.png"))); // NOI18N
        PromoteToAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoteToAdminButtonActionPerformed(evt);
            }
        });

        AddToFriendsToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/AddFriendIcon.png"))); // NOI18N
        AddToFriendsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToFriendsToggleButtonActionPerformed(evt);
            }
        });

        AddFavouriteReviewerToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/AddFavouriteReviewerIcon.png"))); // NOI18N
        AddFavouriteReviewerToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFavouriteReviewerToggleButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AuthorReviewsLabel)
                                    .addComponent(AuthorReviewIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteUserLabel)
                                    .addComponent(DeleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BookReviewsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BookReviewsIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(FavouriteAuthorsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FavouriteAuthorsIconButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FavouriteBookIconButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FavoriteBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(AddToFriendsToggleButton))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReadBooksLabel)
                                    .addComponent(ReadBooksIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FriendsLabel)
                                    .addComponent(FriendsIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddFavouriteReviewerToggleButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FavouriteReviewersLabel)
                                    .addComponent(FavouriteReviewersIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WantedBooksIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PromoteToAdminButton)
                                        .addComponent(WantedBooksLabel))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SurnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                                .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(AddFriendLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(AddFavouriteReviewer)
                                .addGap(18, 18, 18)
                                .addComponent(PromoteLabel)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                            .addComponent(ReviewsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SurnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(StatusLabel)
                .addGap(4, 4, 4)
                .addComponent(ReviewsLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddFavouriteReviewer)
                    .addComponent(AddFriendLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PromoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BookReviewsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookReviewsIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PromoteToAdminButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(AddToFriendsToggleButton)))
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddFavouriteReviewerToggleButton)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReadBooksLabel)
                                    .addComponent(FavoriteBooksLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FavouriteBookIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReadBooksIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FriendsLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FavouriteAuthorsLabel)
                                        .addComponent(DeleteUserLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AuthorReviewsLabel)
                                .addGap(8, 8, 8)
                                .addComponent(AuthorReviewIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeleteUserButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FavouriteAuthorsIconButton)
                                .addComponent(FriendsIconButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WantedBooksLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WantedBooksIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FavouriteReviewersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FavouriteReviewersIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FriendsIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriendsIconButtonActionPerformed
       ListForm favouriteBooksList = new ListForm(this, true, "Friends", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_FriendsIconButtonActionPerformed

    private void FavouriteBookIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouriteBookIconButtonActionPerformed
       ListForm favouriteBooksList = new ListForm(this, true, "FavouriteBooks", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_FavouriteBookIconButtonActionPerformed

    private void ReadBooksIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadBooksIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "ReadBooks", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_ReadBooksIconButtonActionPerformed

    private void WantedBooksIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WantedBooksIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "WantedBooks", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_WantedBooksIconButtonActionPerformed

    private void FavouriteAuthorsIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouriteAuthorsIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "FavouriteAuthors", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_FavouriteAuthorsIconButtonActionPerformed

    private void FavouriteReviewersIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouriteReviewersIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "FavouriteReviewers", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_FavouriteReviewersIconButtonActionPerformed

    private void BookReviewsIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookReviewsIconButtonActionPerformed
       ListForm favouriteBooksList = new ListForm(this, true, "MyAuthorReviews", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_BookReviewsIconButtonActionPerformed

    private void DeleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserButtonActionPerformed
        userManager.deleteUser(userProfile.getId());
        this.setVisible(false);
    }//GEN-LAST:event_DeleteUserButtonActionPerformed

    private void AuthorReviewIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorReviewIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "MyBookReviews", userProfile,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_AuthorReviewIconButtonActionPerformed

    private void PromoteToAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoteToAdminButtonActionPerformed
       userProfile.setIsAdmin(true);
       userManager.updateUser(userProfile);
       this.setVisible(false);
       UserProfileForm userProfileForm = new UserProfileForm((Dialog) this.getParent(), true, currentUser,  userProfile);
       
    }//GEN-LAST:event_PromoteToAdminButtonActionPerformed

    private void AddToFriendsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToFriendsToggleButtonActionPerformed
         if(AddToFriendsToggleButton.isSelected()){
        userManager.addFriendToUser(userProfile, currentUser);
        } else {
        userManager.deleteFriendFromUser(userProfile, currentUser);
        }
    }//GEN-LAST:event_AddToFriendsToggleButtonActionPerformed

    private void AddFavouriteReviewerToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFavouriteReviewerToggleButtonActionPerformed
         if(AddFavouriteReviewerToggleButton.isSelected()){
        userManager.addFavoriteReviewer(userProfile, currentUser);
        } else {
        userManager.deleteFavoriteReviewer(userProfile, currentUser);
        }
    }//GEN-LAST:event_AddFavouriteReviewerToggleButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddFavouriteReviewer;
    private javax.swing.JToggleButton AddFavouriteReviewerToggleButton;
    private javax.swing.JLabel AddFriendLabel1;
    private javax.swing.JToggleButton AddToFriendsToggleButton;
    private javax.swing.JButton AuthorReviewIconButton;
    private javax.swing.JLabel AuthorReviewsLabel;
    private javax.swing.JButton BookReviewsIconButton;
    private javax.swing.JLabel BookReviewsLabel;
    private javax.swing.JButton DeleteUserButton;
    private javax.swing.JLabel DeleteUserLabel;
    private javax.swing.JLabel FavoriteBooksLabel;
    private javax.swing.JButton FavouriteAuthorsIconButton;
    private javax.swing.JLabel FavouriteAuthorsLabel;
    private javax.swing.JButton FavouriteBookIconButton;
    private javax.swing.JButton FavouriteReviewersIconButton;
    private javax.swing.JLabel FavouriteReviewersLabel;
    private javax.swing.JButton FriendsIconButton;
    private javax.swing.JLabel FriendsLabel;
    private javax.swing.JLabel MailLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PromoteLabel;
    private javax.swing.JButton PromoteToAdminButton;
    private javax.swing.JButton ReadBooksIconButton;
    private javax.swing.JLabel ReadBooksLabel;
    private javax.swing.JLabel ReviewsLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JButton WantedBooksIconButton;
    private javax.swing.JLabel WantedBooksLabel;
    // End of variables declaration//GEN-END:variables
}
