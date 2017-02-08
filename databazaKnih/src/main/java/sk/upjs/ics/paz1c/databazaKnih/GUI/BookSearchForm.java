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
import sk.upjs.ics.paz1c.databazaKnih.Tag;
import sk.upjs.ics.paz1c.databazaKnih.TagManager;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class BookSearchForm extends javax.swing.JDialog {
    
     BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
     AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();
     GenreManager genreManager = ObjectFactory.INSTANCE.getGenreManager();
     TagManager tagManager = ObjectFactory.INSTANCE.getTagManager();
     private Book book;
    private User user;
    private String[] genreNames;
    private Genre[] genreArray;
    private String[] tagNames;
    private Tag[] tagArray;
    private String[] bookNames;
    private Book[] bookArray;
    /**
     * Creates new form BookSearchForm
     */
    public BookSearchForm(java.awt.Dialog parent, boolean modal,User user) {
        super(parent, modal);
        initComponents();
         this.user=user;
         
        List<Genre> genres = genreManager.getAllGenres();
             
             genreNames = new String[genres.size()];
             genreArray= new Genre[genres.size()];
             int i = 0;
            for (Genre genre : genres) {
               genreNames[i]= genre.getName();
               genreArray[i] = genre;
               i++;
            }
             GenreList.setListData(genreNames);
             
             List<Tag> tags = tagManager.getAllTags();
             tagNames = new String[tags.size()];
             tagArray= new Tag[tags.size()];
             int j = 0;
            for (Tag tag : tags) {
               tagNames[j]= tag.getName();
               tagArray[j] = tag;
               j++;
            }
             TagList.setListData(tagNames);
            }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookNameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        AuthorNameLabel = new javax.swing.JLabel();
        GenreBookSearchLabel = new javax.swing.JLabel();
        AuthorTextField = new javax.swing.JTextField();
        ISBNTextField = new javax.swing.JTextField();
        ISBNBookSearchLabel1 = new javax.swing.JLabel();
        TagBookSearchLabel = new javax.swing.JLabel();
        YearBookSearchLabel = new javax.swing.JLabel();
        MinYearTextField = new javax.swing.JTextField();
        YearSearchSeparatorLabel = new javax.swing.JLabel();
        MaxYearTextField = new javax.swing.JTextField();
        NumberOfPagesBookSearchLabel = new javax.swing.JLabel();
        MinLengthTextField = new javax.swing.JTextField();
        NumberofPagesSearchSeparatorLabel = new javax.swing.JLabel();
        MaxLengthTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultList = new javax.swing.JList<>();
        RatingsBookSearchLabel = new javax.swing.JLabel();
        MinRatingTextField = new javax.swing.JTextField();
        RatingsSearchSeparatorLabel = new javax.swing.JLabel();
        MaxRatingTextField = new javax.swing.JTextField();
        FilterBButton = new javax.swing.JButton();
        BookSearchViewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GenreList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TagList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BookNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookNameLabel.setForeground(new java.awt.Color(0, 102, 204));
        BookNameLabel.setText("Name:");

        AuthorNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorNameLabel.setForeground(new java.awt.Color(0, 102, 255));
        AuthorNameLabel.setText("Author:");

        GenreBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenreBookSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        GenreBookSearchLabel.setText("Genre:");

        ISBNTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNTextFieldActionPerformed(evt);
            }
        });

        ISBNBookSearchLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ISBNBookSearchLabel1.setForeground(new java.awt.Color(0, 102, 204));
        ISBNBookSearchLabel1.setText("ISBN:");

        TagBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TagBookSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        TagBookSearchLabel.setText("Tags:");

        YearBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        YearBookSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        YearBookSearchLabel.setText("Year of publication:");

        MinYearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinYearTextFieldActionPerformed(evt);
            }
        });

        YearSearchSeparatorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        YearSearchSeparatorLabel.setForeground(new java.awt.Color(0, 102, 255));
        YearSearchSeparatorLabel.setText("to");

        NumberOfPagesBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumberOfPagesBookSearchLabel.setForeground(new java.awt.Color(0, 102, 255));
        NumberOfPagesBookSearchLabel.setText("Length:");

        MinLengthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinLengthTextFieldActionPerformed(evt);
            }
        });

        NumberofPagesSearchSeparatorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumberofPagesSearchSeparatorLabel.setForeground(new java.awt.Color(0, 102, 255));
        NumberofPagesSearchSeparatorLabel.setText("to");

        jScrollPane2.setViewportView(ResultList);

        RatingsBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RatingsBookSearchLabel.setForeground(new java.awt.Color(0, 102, 255));
        RatingsBookSearchLabel.setText("Rating:");

        MinRatingTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinRatingTextFieldActionPerformed(evt);
            }
        });

        RatingsSearchSeparatorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RatingsSearchSeparatorLabel.setForeground(new java.awt.Color(0, 102, 255));
        RatingsSearchSeparatorLabel.setText("to");

        MaxRatingTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxRatingTextFieldActionPerformed(evt);
            }
        });

        FilterBButton.setText("Filter");
        FilterBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBButtonActionPerformed(evt);
            }
        });

        BookSearchViewButton.setText("View");
        BookSearchViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSearchViewButtonActionPerformed(evt);
            }
        });

        GenreList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(GenreList);

        TagList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(TagList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FilterBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(BookSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AuthorNameLabel)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AuthorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ISBNTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ISBNBookSearchLabel1)
                            .addComponent(YearBookSearchLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MinYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(YearSearchSeparatorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaxYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NumberOfPagesBookSearchLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MinLengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumberofPagesSearchSeparatorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaxLengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MinRatingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RatingsSearchSeparatorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaxRatingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RatingsBookSearchLabel)
                            .addComponent(GenreBookSearchLabel)
                            .addComponent(TagBookSearchLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookNameLabel)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AuthorNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(ISBNBookSearchLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ISBNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(YearBookSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MinYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearSearchSeparatorLabel)
                            .addComponent(MaxYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumberOfPagesBookSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MinLengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberofPagesSearchSeparatorLabel)
                            .addComponent(MaxLengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RatingsBookSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MinRatingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaxRatingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RatingsSearchSeparatorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenreBookSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TagBookSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilterBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinYearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinYearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinYearTextFieldActionPerformed

    private void MinLengthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinLengthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinLengthTextFieldActionPerformed

    private void MinRatingTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinRatingTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinRatingTextFieldActionPerformed

    private void MaxRatingTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxRatingTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxRatingTextFieldActionPerformed

    private void FilterBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBButtonActionPerformed
       List<Book> currentList = bookManager.getAllBooks();
        if(!NameTextField.getText().isEmpty()){
        List<Book> newList = bookManager.GetBooksByName(NameTextField.getText(), currentList);
        currentList = newList;
        }
        
        if(!AuthorTextField.getText().isEmpty()){
        List<Author> authorlist = authorManager.getAuthorsByName(AuthorTextField.getText(), authorManager.getAllAuthors());
           Author author = authorlist.get(0);
            List<Book> newList = bookManager.GetBooksByAuthor(author, currentList);
            currentList = newList;
            
        
        }
        if(!ISBNTextField.getText().isEmpty()){
        Book book = bookManager.getBookByISBN(Integer.parseInt(ISBNTextField.getText()), currentList);
        List<Book> newList= new ArrayList<Book>();
        newList.add(book);
        currentList = newList;
        }
        
        if(!MinYearTextField.getText().isEmpty()){
            if(!MaxYearTextField.getText().isEmpty()){
           List<Book> yearList = bookManager.getBooksFromToYear(Integer.parseInt(MinYearTextField.getText()),Integer.parseInt(MaxYearTextField.getText()), currentList);
        currentList = yearList;
        } else {
            List<Book> yearList = bookManager.getBooksFromYear(Integer.parseInt(MinYearTextField.getText()), currentList);
            currentList = yearList;
            }  
        } else {
        if(!MaxYearTextField.getText().isEmpty()){
           List<Book> yearList = bookManager.getBooksToYear(Integer.parseInt(MaxYearTextField.getText()), currentList);
        currentList = yearList;
        } 
        }
        
        if(!MinLengthTextField.getText().isEmpty()){
            if(!MaxLengthTextField.getText().isEmpty()){
           List<Book> lengthList = bookManager.getBooksFromToPages(Integer.parseInt(MinLengthTextField.getText()),Integer.parseInt(MaxLengthTextField.getText()), currentList);
        currentList = lengthList;
        } else {
            List<Book> lengthList = bookManager.getBooksFromPages(Integer.parseInt(MinLengthTextField.getText()), currentList);
            currentList = lengthList;
            }  
        } else {
        if(!MaxLengthTextField.getText().isEmpty()){
           List<Book> lengthList = bookManager.getBooksToPages(Integer.parseInt(MaxLengthTextField.getText()), currentList);
        currentList = lengthList;
        } 
        }
        
         if(!MinRatingTextField.getText().isEmpty()){
            if(!MaxRatingTextField.getText().isEmpty()){
           List<Book> ratingList = bookManager.getBooksFromToBayesian(Integer.parseInt(MinRatingTextField.getText()),Integer.parseInt(MaxRatingTextField.getText()), currentList);
        currentList = ratingList;
        } else {
            List<Book> ratingList = bookManager.getBooksFromBayesian(Integer.parseInt(MinRatingTextField.getText()), currentList);
            currentList = ratingList;
            }  
        } else {
        if(!MaxLengthTextField.getText().isEmpty()){
           List<Book> ratingList = bookManager.getBooksToBayesian(Integer.parseInt(MaxLengthTextField.getText()), currentList);
        currentList = ratingList;
        } 
        }
         
         if(GenreList.getSelectedIndex()!=-1){
          int[] arrayOfGenres = GenreList.getSelectedIndices();
        List<Genre> genreList = new ArrayList<Genre>();
        for (int i = 0; arrayOfGenres.length < i; i++) {
            genreList.add(genreArray[arrayOfGenres[i]]);
            
        }
        List<Book> booksByGenre = bookManager.GetBooksByGenres(genreList, currentList);
        currentList = booksByGenre;
         }
         
         
         if(TagList.getSelectedIndex()!=-1){
        int[] arrayofTags = TagList.getSelectedIndices();
        List<Tag> tagList = new ArrayList<Tag>();
        for (int i = 0; i < arrayofTags.length; i++) {
            tagList.add(tagArray[arrayofTags[i]]);
            
        }
        List<Book> booksByTag = bookManager.GetBooksByTags(tagList, currentList);
        currentList = booksByTag;
         }
        
         bookNames = new String[currentList.size()];
             bookArray= new Book[currentList.size()];
             int i = 0;
            for (Book book : currentList) {
               bookNames[i]= book.getName();
               bookArray[i] = book;
               i++;
            }
             ResultList.setListData(bookNames);
            
        
        
        
        
        
        
    }//GEN-LAST:event_FilterBButtonActionPerformed

    private void ISBNTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNTextFieldActionPerformed

    private void BookSearchViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSearchViewButtonActionPerformed
if(ResultList.getSelectedIndex()!=-1){
        Book book=  bookArray[ResultList.getSelectedIndex()];
        System.out.println("BookSearch selected: " + book.getGenres().size());
            BookForm bookForm = new BookForm(this, true, user, book);
            bookForm.setVisible(true);
}
    }//GEN-LAST:event_BookSearchViewButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorNameLabel;
    private javax.swing.JTextField AuthorTextField;
    private javax.swing.JLabel BookNameLabel;
    private javax.swing.JButton BookSearchViewButton;
    private javax.swing.JButton FilterBButton;
    private javax.swing.JLabel GenreBookSearchLabel;
    private javax.swing.JList<String> GenreList;
    private javax.swing.JLabel ISBNBookSearchLabel1;
    private javax.swing.JTextField ISBNTextField;
    private javax.swing.JTextField MaxLengthTextField;
    private javax.swing.JTextField MaxRatingTextField;
    private javax.swing.JTextField MaxYearTextField;
    private javax.swing.JTextField MinLengthTextField;
    private javax.swing.JTextField MinRatingTextField;
    private javax.swing.JTextField MinYearTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel NumberOfPagesBookSearchLabel;
    private javax.swing.JLabel NumberofPagesSearchSeparatorLabel;
    private javax.swing.JLabel RatingsBookSearchLabel;
    private javax.swing.JLabel RatingsSearchSeparatorLabel;
    private javax.swing.JList<String> ResultList;
    private javax.swing.JLabel TagBookSearchLabel;
    private javax.swing.JList<String> TagList;
    private javax.swing.JLabel YearBookSearchLabel;
    private javax.swing.JLabel YearSearchSeparatorLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
