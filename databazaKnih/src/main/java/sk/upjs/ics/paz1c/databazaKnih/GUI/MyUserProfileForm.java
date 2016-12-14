/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import javax.swing.JFrame;
import sk.upjs.ics.paz1c.databazaKnih.InterfaceUserDao;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class MyUserProfileForm extends javax.swing.JDialog {
    
    private static User user;
  
    UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
    InterfaceUserDao userDao = ObjectFactory.INSTANCE.getUserDao();

    /**
     * Creates new form MyUserProfileForm
     */
    
    
    
    public MyUserProfileForm(java.awt.Frame parent, boolean modal, User user) {
        super(parent, modal);
        initComponents();
        this.user=user;
        
        WelcomeUsernameLabel.setText("Welcome " + user.getUserName() + " !");
        if(user.getName()!=null){
        NameLabel.setText("Name: " + user.getName());
        }
        if(user.getSurname()!=null){
        SurnameLabel.setText("Surname: " + user.getSurname());
        }
        
        EmailLabel.setText("E-mail: " + user.getMail());
        if(user.isIsAdmin()){
        StatusLabel.setText("Status: Admin");
        ManageDatabaseButton.setVisible(true);
        ManageDatabaseButton.enable(true);
        } else {
        StatusLabel.setText("Status: User");
        ManageDatabaseButton.setVisible(false);
        ManageDatabaseButton.enable(false);
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

        SearchButton = new javax.swing.JButton();
        SearchComboBox = new javax.swing.JComboBox<>();
        SearchLabelLine1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ManageProfileButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        DeleteProfileButton = new javax.swing.JButton();
        WantedBooksIconButton = new javax.swing.JButton();
        WantedBooksLabel = new javax.swing.JLabel();
        FavouriteReviewersLabel = new javax.swing.JLabel();
        FavouriteReviewersIconButton = new javax.swing.JButton();
        FriendsIconButton = new javax.swing.JButton();
        FriendsLabel = new javax.swing.JLabel();
        ReadBooksIconButton = new javax.swing.JButton();
        ReadBooksLabel = new javax.swing.JLabel();
        FavoriteBooksLabel = new javax.swing.JLabel();
        FavouriteBookIconButton = new javax.swing.JButton();
        FavouriteAuthorsLabel = new javax.swing.JLabel();
        FavouriteAuthorsIconButton = new javax.swing.JButton();
        ManageDatabaseButton = new javax.swing.JButton();
        ManageDatabaseLabel = new javax.swing.JLabel();
        AuthorReviewsButton = new javax.swing.JButton();
        AuthorReviewsLabel = new javax.swing.JLabel();
        BookReviewsButton = new javax.swing.JButton();
        BookReviewsLabel = new javax.swing.JLabel();
        MyReviewsLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        WelcomeUsernameLabel = new javax.swing.JLabel();
        BookIconLabel = new javax.swing.JLabel();
        SurnameLabel = new javax.swing.JLabel();
        ChangePassWordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/SearchIcon.png"))); // NOI18N
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchComboBox.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        SearchComboBox.setForeground(new java.awt.Color(0, 102, 204));
        SearchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books", "Authors", "Users" }));

        SearchLabelLine1.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        SearchLabelLine1.setForeground(new java.awt.Color(0, 0, 102));
        SearchLabelLine1.setText("Search for your favourite books, authors");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("and users here !");

        ManageProfileButton.setText("Manage Profile");
        ManageProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageProfileButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        DeleteProfileButton.setText("Delete Profile");
        DeleteProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProfileButtonActionPerformed(evt);
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

        ReadBooksIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/TickIcon.png"))); // NOI18N
        ReadBooksIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadBooksIconButtonActionPerformed(evt);
            }
        });

        ReadBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReadBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        ReadBooksLabel.setText("Read Books:");

        FavoriteBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FavoriteBooksLabel.setForeground(new java.awt.Color(0, 102, 255));
        FavoriteBooksLabel.setText(" Favourite Books:");

        FavouriteBookIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/FavouriteIcon.png"))); // NOI18N
        FavouriteBookIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavouriteBookIconButtonActionPerformed(evt);
            }
        });

        FavouriteAuthorsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FavouriteAuthorsLabel.setForeground(new java.awt.Color(0, 102, 255));
        FavouriteAuthorsLabel.setText("Favourite Authors:");

        FavouriteAuthorsIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/FavouriteAuthorsIcon.png"))); // NOI18N
        FavouriteAuthorsIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavouriteAuthorsIconButtonActionPerformed(evt);
            }
        });

        ManageDatabaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/InspectRequestsIcon.png"))); // NOI18N
        ManageDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDatabaseButtonActionPerformed(evt);
            }
        });

        ManageDatabaseLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ManageDatabaseLabel.setForeground(new java.awt.Color(0, 102, 255));
        ManageDatabaseLabel.setText("Manage Database:");

        AuthorReviewsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/AuthorReviewIcon.png"))); // NOI18N
        AuthorReviewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorReviewsButtonActionPerformed(evt);
            }
        });

        AuthorReviewsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorReviewsLabel.setForeground(new java.awt.Color(0, 102, 255));
        AuthorReviewsLabel.setText("Authors:");

        BookReviewsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/BookReviewsIcon.png"))); // NOI18N
        BookReviewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookReviewsButtonActionPerformed(evt);
            }
        });

        BookReviewsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookReviewsLabel.setForeground(new java.awt.Color(0, 102, 255));
        BookReviewsLabel.setText("Books:");

        MyReviewsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MyReviewsLabel.setForeground(new java.awt.Color(0, 102, 255));
        MyReviewsLabel.setText("My Reviews:");

        StatusLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(0, 102, 255));
        StatusLabel.setText("Status: (User or Admin)");

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(0, 102, 255));
        EmailLabel.setText("E-mail: (EmailHere)");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(0, 102, 255));
        NameLabel.setText("Name: ");

        WelcomeUsernameLabel.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        WelcomeUsernameLabel.setForeground(new java.awt.Color(0, 0, 102));
        WelcomeUsernameLabel.setText("Welcome (UserNameHere) !");

        BookIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/kniha4.png"))); // NOI18N

        SurnameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SurnameLabel.setForeground(new java.awt.Color(0, 102, 255));
        SurnameLabel.setText("Surname:");

        ChangePassWordButton.setText("Change Password");
        ChangePassWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassWordButtonActionPerformed(evt);
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
                            .addComponent(SurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MyReviewsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchLabelLine1)
                                    .addComponent(jLabel2))))
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BookIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReadBooksLabel)
                                    .addComponent(ReadBooksIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FriendsLabel)
                                    .addComponent(FriendsIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(260, 260, 260))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DeleteProfileButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ChangePassWordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addContainerGap())))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ManageDatabaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ManageDatabaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FavouriteBookIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FavouriteAuthorsIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FavouriteAuthorsLabel)
                                .addComponent(FavoriteBooksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(FavouriteReviewersLabel)
                                    .addGap(9, 9, 9))
                                .addComponent(FavouriteReviewersIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WantedBooksIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WantedBooksLabel)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AuthorReviewsLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(WelcomeUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(391, 391, 391))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BookReviewsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BookReviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AuthorReviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ManageProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(SurnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MyReviewsLabel)
                        .addGap(15, 15, 15)
                        .addComponent(ChangePassWordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchButton)
                        .addGap(4, 4, 4)
                        .addComponent(SearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchLabelLine1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(ReadBooksLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReadBooksIconButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(FriendsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FriendsIconButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(WelcomeUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(BookReviewsLabel)
                                    .addGap(11, 11, 11)
                                    .addComponent(BookReviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ManageProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AuthorReviewsLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AuthorReviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(FavoriteBooksLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FavouriteBookIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ManageDatabaseLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ManageDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(397, 397, 397)
                            .addComponent(WantedBooksLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(WantedBooksIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FavouriteAuthorsLabel)
                        .addComponent(FavouriteReviewersLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(FavouriteReviewersIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FavouriteAuthorsIconButton))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        if (SearchComboBox.getSelectedItem()=="Books"){
            BookSearchForm bookSearchForm = new BookSearchForm(this, true,  user);
            bookSearchForm.setVisible(true);
        }
        if (SearchComboBox.getSelectedItem()=="Authors"){
            AuthorSearchForm authorSearchForm = new AuthorSearchForm(this, true, user);
            authorSearchForm.setVisible(true);
        }
        if (SearchComboBox.getSelectedItem()=="Users"){
            UserSearchForm userSearchForm = new UserSearchForm(this, true, user);
            userSearchForm.setVisible(true);
    }//GEN-LAST:event_SearchButtonActionPerformed
    }
    private void FriendsIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriendsIconButtonActionPerformed
      ListForm favouriteBooksList = new ListForm(this, true, "Friends", user, null, null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_FriendsIconButtonActionPerformed

    private void ManageProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageProfileButtonActionPerformed
        UpdateForm updateForm = new UpdateForm(this, true, user);
        updateForm.setVisible(true);
    }//GEN-LAST:event_ManageProfileButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.setVisible(false);
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void DeleteProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProfileButtonActionPerformed
        userDao.deleteUser(user.getId());
        this.setVisible(false);
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }//GEN-LAST:event_DeleteProfileButtonActionPerformed

    private void FavouriteBookIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouriteBookIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "FavouriteBooks", user, null,null);
        favouriteBooksList.setVisible(true);
        
    }//GEN-LAST:event_FavouriteBookIconButtonActionPerformed

    private void ReadBooksIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadBooksIconButtonActionPerformed
         ListForm favouriteBooksList = new ListForm(this, true, "ReadBooks", user,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_ReadBooksIconButtonActionPerformed

    private void WantedBooksIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WantedBooksIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "WantedBooks", user,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_WantedBooksIconButtonActionPerformed

    private void FavouriteAuthorsIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouriteAuthorsIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "FavouriteAuthors", user,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_FavouriteAuthorsIconButtonActionPerformed

    private void FavouriteReviewersIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouriteReviewersIconButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "FavouriteReviewers", user,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_FavouriteReviewersIconButtonActionPerformed

    private void BookReviewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookReviewsButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "MyAuthorReviews", user,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_BookReviewsButtonActionPerformed

    private void AuthorReviewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorReviewsButtonActionPerformed
        ListForm favouriteBooksList = new ListForm(this, true, "MyBookReviews", user,null,null);
        favouriteBooksList.setVisible(true);
    }//GEN-LAST:event_AuthorReviewsButtonActionPerformed

    private void ManageDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDatabaseButtonActionPerformed
        AdminForm adminForm = new AdminForm(this, true);
        adminForm.setVisible(true);
    }//GEN-LAST:event_ManageDatabaseButtonActionPerformed

    private void ChangePassWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassWordButtonActionPerformed
        ChangePassWordForm changePassWordForm = new ChangePassWordForm(this, true, user);
        changePassWordForm.setVisible(true);
    }//GEN-LAST:event_ChangePassWordButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AuthorReviewsButton;
    private javax.swing.JLabel AuthorReviewsLabel;
    private javax.swing.JLabel BookIconLabel;
    private javax.swing.JButton BookReviewsButton;
    private javax.swing.JLabel BookReviewsLabel;
    private javax.swing.JButton ChangePassWordButton;
    private javax.swing.JButton DeleteProfileButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FavoriteBooksLabel;
    private javax.swing.JButton FavouriteAuthorsIconButton;
    private javax.swing.JLabel FavouriteAuthorsLabel;
    private javax.swing.JButton FavouriteBookIconButton;
    private javax.swing.JButton FavouriteReviewersIconButton;
    private javax.swing.JLabel FavouriteReviewersLabel;
    private javax.swing.JButton FriendsIconButton;
    private javax.swing.JLabel FriendsLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ManageDatabaseButton;
    private javax.swing.JLabel ManageDatabaseLabel;
    private javax.swing.JButton ManageProfileButton;
    private javax.swing.JLabel MyReviewsLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton ReadBooksIconButton;
    private javax.swing.JLabel ReadBooksLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox<String> SearchComboBox;
    private javax.swing.JLabel SearchLabelLine1;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JButton WantedBooksIconButton;
    private javax.swing.JLabel WantedBooksLabel;
    private javax.swing.JLabel WelcomeUsernameLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}