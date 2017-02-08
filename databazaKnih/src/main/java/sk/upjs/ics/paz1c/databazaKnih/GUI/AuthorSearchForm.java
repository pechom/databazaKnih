/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.util.ArrayList;
import java.util.List;
import sk.upjs.ics.paz1c.databazaKnih.Author;
import sk.upjs.ics.paz1c.databazaKnih.AuthorManager;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.BookManager;
import sk.upjs.ics.paz1c.databazaKnih.Genre;
import sk.upjs.ics.paz1c.databazaKnih.GenreManager;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.User;


/**
 *
 * @author szoplakz
 */
public class AuthorSearchForm extends javax.swing.JDialog {
    AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();
    GenreManager genreManager = ObjectFactory.INSTANCE.getGenreManager();
     BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
    private String[] data;
    private Genre[] genreArray;
    private String[] authorNames;
     private Author[] authorArray;
     private String[] bookNames;
     private Book[] bookArray;
     private User user;

    /**
     * Creates new form AuthorSearchForm
     */
    public AuthorSearchForm(java.awt.Dialog parent, boolean modal,User user) {
        super(parent, modal);
        initComponents();
       
        this.user=user;
        List<Genre> genres = genreManager.getAllGenres();
             
             data = new String[genres.size()];
             genreArray= new Genre[genres.size()];
             int i = 0;
            for (Genre genre : genres) {
               data[i]= genre.getName();
               genreArray[i] = genre;
               i++;
            }
             GenreList.setListData(data);
            
    
     
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
        NameTextField = new javax.swing.JTextField();
        BookLabel = new javax.swing.JLabel();
        NationalityTextField = new javax.swing.JTextField();
        NationalitySearchLabel = new javax.swing.JLabel();
        GenderSearchLabel = new javax.swing.JLabel();
        GenderComboBox = new javax.swing.JComboBox<>();
        BrithAuthorSearchLabel = new javax.swing.JLabel();
        MinBirthTextField = new javax.swing.JTextField();
        BirthAuthorSeparatorLabel = new javax.swing.JLabel();
        MaxBirthTextField = new javax.swing.JTextField();
        DeathAuthorSearchLabel = new javax.swing.JLabel();
        MinDeathTextField = new javax.swing.JTextField();
        BirthAuthorSeparatorLabel1 = new javax.swing.JLabel();
        MaxDeathTextField = new javax.swing.JTextField();
        FilterButton = new javax.swing.JButton();
        AuthorSearchViewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultList = new javax.swing.JList<>();
        BookTextField = new javax.swing.JTextField();
        GenreLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GenreList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AuthorNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorNameLabel.setForeground(new java.awt.Color(0, 102, 204));
        AuthorNameLabel.setText("Name:");

        BookLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookLabel.setForeground(new java.awt.Color(0, 102, 204));
        BookLabel.setText("Book:");

        NationalitySearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NationalitySearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        NationalitySearchLabel.setText("Nationality:");

        GenderSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenderSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        GenderSearchLabel.setText("Gender:");

        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Both", "Male", "Female" }));

        BrithAuthorSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BrithAuthorSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        BrithAuthorSearchLabel.setText("Year of Birth");

        MinBirthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinBirthTextFieldActionPerformed(evt);
            }
        });

        BirthAuthorSeparatorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BirthAuthorSeparatorLabel.setForeground(new java.awt.Color(0, 102, 255));
        BirthAuthorSeparatorLabel.setText("to");

        DeathAuthorSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeathAuthorSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        DeathAuthorSearchLabel.setText("Year of Death");

        MinDeathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinDeathTextFieldActionPerformed(evt);
            }
        });

        BirthAuthorSeparatorLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BirthAuthorSeparatorLabel1.setForeground(new java.awt.Color(0, 102, 255));
        BirthAuthorSeparatorLabel1.setText("to");

        FilterButton.setText("Filter");
        FilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterButtonActionPerformed(evt);
            }
        });

        AuthorSearchViewButton.setText("View");
        AuthorSearchViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorSearchViewButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ResultList);

        GenreLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenreLabel.setForeground(new java.awt.Color(0, 102, 204));
        GenreLabel.setText("Genre:");

        GenreList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(GenreList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AuthorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(GenderSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NationalityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(NationalitySearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BookTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(DeathAuthorSearchLabel)
                                .addComponent(BrithAuthorSearchLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(MinBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BirthAuthorSeparatorLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MaxBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(MinDeathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BirthAuthorSeparatorLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MaxDeathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AuthorSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(GenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AuthorNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BookLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenderSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(NationalitySearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(NationalityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BrithAuthorSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MinBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthAuthorSeparatorLabel)
                            .addComponent(MaxBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(DeathAuthorSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MinDeathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthAuthorSeparatorLabel1)
                            .addComponent(MaxDeathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinBirthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinBirthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinBirthTextFieldActionPerformed

    private void MinDeathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinDeathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinDeathTextFieldActionPerformed

    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed
        List<Author> currentList = authorManager.getAllAuthors();
        if(!NameTextField.getText().isEmpty()){
        List<Author> newList = authorManager.getAuthorsByName(NameTextField.getText(), currentList);
        currentList = newList;
        }
        
        if(!BookTextField.getText().isEmpty()){
        List<Author> newList = authorManager.getAuthorsByBook(BookTextField.getText(), currentList);
        currentList = newList;
        }
        
        int index = GenderComboBox.getSelectedIndex();
        if(index==1){    
        List<Author> maleList = authorManager.getAuthorsBySex("m", currentList);
        currentList = maleList;
        }
        if(index==2){    
        List<Author> femaleList = authorManager.getAuthorsBySex("f", currentList);
        currentList = femaleList;
        }
        
        if(!NationalityTextField.getText().isEmpty()){
        List<Author> newList = authorManager.getAuthorsByNationality(NationalityTextField.getText(), currentList);
        currentList = newList;
        }
        
        
        if(GenreList.getSelectedIndex()!=-1){
        int[] array = GenreList.getSelectedIndices();
        
        List<Genre> genreList = new ArrayList<Genre>();
        for (int i = 0; i < array.length; i++) {
            genreList.add(genreArray[array[i]]);
            
        } 
        List<Author> newList = authorManager.getAuthorsByGenres(genreList, currentList);
        currentList = newList;
        }
        
        
        
        if(!MinBirthTextField.getText().isEmpty()){
            if(!MaxBirthTextField.getText().isEmpty()){
           List<Author> birthList = authorManager.getAuthorsFromToBirth(Integer.parseInt(MinBirthTextField.getText()),Integer.parseInt(MaxBirthTextField.getText()), currentList);
        currentList = birthList;
        } else {
            List<Author> birthList = authorManager.getAuthorsFromBirth(Integer.parseInt(MinBirthTextField.getText()), currentList);
            currentList = birthList;
            }  
        } else {
        if(!MaxBirthTextField.getText().isEmpty()){
           List<Author> birthList = authorManager.getAuthorsToBirth(Integer.parseInt(MaxBirthTextField.getText()), currentList);
        currentList = birthList;
        }
        
        
        }
        
        if(!MinDeathTextField.getText().isEmpty()){
            if(!MaxDeathTextField.getText().isEmpty()){
           List<Author> deathList = authorManager.getAuthorsFromToDeath(Integer.parseInt(MinDeathTextField.getText()),Integer.parseInt(MaxDeathTextField.getText()), currentList);
        currentList = deathList;
        } else {
            List<Author> deathList = authorManager.getAuthorsFromDeath(Integer.parseInt(MinDeathTextField.getText()), currentList);
            currentList = deathList;
            }  
        } else {
        if(!MaxDeathTextField.getText().isEmpty()){
           List<Author> deathList = authorManager.getAuthorsToDeath(Integer.parseInt(MaxDeathTextField.getText()), currentList);
        currentList = deathList;
        }
        
        
        }
        
        authorNames = new String[currentList.size()];
             authorArray= new Author[currentList.size()];
             int i = 0;
            for (Author author : currentList) {
               authorNames[i]= author.getName();
               authorArray[i] = author;
               i++;
            }
             ResultList.setListData(authorNames);
            
        
           
    }//GEN-LAST:event_FilterButtonActionPerformed

    private void AuthorSearchViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorSearchViewButtonActionPerformed
        if(ResultList.getSelectedIndex()!=-1){
        Author author =  authorArray[ResultList.getSelectedIndex()];
            AuthorForm authorForm = new AuthorForm(this, true, author, user);
            authorForm.setVisible(true);
        }
    }//GEN-LAST:event_AuthorSearchViewButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorNameLabel;
    private javax.swing.JButton AuthorSearchViewButton;
    private javax.swing.JLabel BirthAuthorSeparatorLabel;
    private javax.swing.JLabel BirthAuthorSeparatorLabel1;
    private javax.swing.JLabel BookLabel;
    private javax.swing.JTextField BookTextField;
    private javax.swing.JLabel BrithAuthorSearchLabel;
    private javax.swing.JLabel DeathAuthorSearchLabel;
    private javax.swing.JButton FilterButton;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JLabel GenderSearchLabel;
    private javax.swing.JLabel GenreLabel;
    private javax.swing.JList<String> GenreList;
    private javax.swing.JTextField MaxBirthTextField;
    private javax.swing.JTextField MaxDeathTextField;
    private javax.swing.JTextField MinBirthTextField;
    private javax.swing.JTextField MinDeathTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel NationalitySearchLabel;
    private javax.swing.JTextField NationalityTextField;
    private javax.swing.JList<String> ResultList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
