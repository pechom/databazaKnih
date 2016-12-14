/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.util.List;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class UserSearchForm extends javax.swing.JDialog {

   UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
   private User user;
   private String[] userNames;
   private User[] userArray;
    /**
     * Creates new form UserSearchForm
     */
    public UserSearchForm(java.awt.Dialog parent, boolean modal,User user) {
        super(parent, modal);
        initComponents();
        this.user = user;
        
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
        UserNameTextField = new javax.swing.JTextField();
        NameSearchLabel1 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        SurnameSearchLabel = new javax.swing.JLabel();
        SurnameTextField = new javax.swing.JTextField();
        EmailSearchLabel1 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        StatusSearchLabel = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        FilterButton = new javax.swing.JButton();
        BookSearchViewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        UserNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(0, 102, 204));
        UserNameLabel.setText("Username:");

        NameSearchLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameSearchLabel1.setForeground(new java.awt.Color(0, 102, 204));
        NameSearchLabel1.setText("Name:");

        SurnameSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SurnameSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        SurnameSearchLabel.setText("Surname:");

        EmailSearchLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmailSearchLabel1.setForeground(new java.awt.Color(0, 102, 204));
        EmailSearchLabel1.setText("E-mail:");

        StatusSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StatusSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        StatusSearchLabel.setText("Status:");

        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Both", "User", "Admin" }));
        StatusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusComboBoxActionPerformed(evt);
            }
        });

        FilterButton.setText("Filter");
        FilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterButtonActionPerformed(evt);
            }
        });

        BookSearchViewButton.setText("View");
        BookSearchViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSearchViewButtonActionPerformed(evt);
            }
        });

        ResultList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ResultList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BookSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EmailSearchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SurnameSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StatusSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameSearchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(224, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 286, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(UserNameLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(NameSearchLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(SurnameSearchLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(EmailSearchLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(StatusSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StatusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusComboBoxActionPerformed

    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed
       List<User> currentList = userManager.getAllUsers();
        if(!UserNameTextField.getText().isEmpty()){
        List<User> newList = userManager.getUsersByUsername(UserNameTextField.getText(), currentList);
        currentList = newList;
        }
        if(!NameTextField.getText().isEmpty()){
        List<User> newList = userManager.getUsersByName(NameTextField.getText(), currentList);
        currentList = newList;
        }
        if(!SurnameTextField.getText().isEmpty()){
        List<User> newList = userManager.getUsersBySurname(SurnameTextField.getText(), currentList);
        currentList = newList;
        }
        if(!EmailTextField.getText().isEmpty()){
        List<User> newList = userManager.getUsersByName(EmailTextField.getText(), currentList);
        currentList = newList;
        }
        if(StatusComboBox.getSelectedIndex()==1){
        List<User> newList = userManager.getNonAdmins( currentList);
        currentList = newList;
        }
        if(StatusComboBox.getSelectedIndex()==2){
        List<User> newList = userManager.getAdmins( currentList);
        currentList = newList;
        }
        
         userNames = new String[currentList.size()];
             userArray= new User[currentList.size()];
             int i = 0;
            for (User user : currentList) {
               userNames[i]= user.getUserName();
               userArray[i] = user;
               i++;
            }
             ResultList.setListData(userNames);
            
    }//GEN-LAST:event_FilterButtonActionPerformed

    
    private void BookSearchViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSearchViewButtonActionPerformed
        if(ResultList.getSelectedIndex()!=-1){
        User userProfile=  userArray[ResultList.getSelectedIndex()];
           UserProfileForm userForm = new UserProfileForm(this, true, user, userProfile);
            userForm.setVisible(true);
        }
    }//GEN-LAST:event_BookSearchViewButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
        /* Create and display the dialog */
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookSearchViewButton;
    private javax.swing.JLabel EmailSearchLabel1;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton FilterButton;
    private javax.swing.JLabel NameSearchLabel1;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JList<String> ResultList;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel StatusSearchLabel;
    private javax.swing.JLabel SurnameSearchLabel;
    private javax.swing.JTextField SurnameTextField;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}