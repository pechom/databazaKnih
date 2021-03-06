/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import sk.upjs.ics.paz1c.databazaKnih.Author;
import sk.upjs.ics.paz1c.databazaKnih.AuthorManager;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.BookManager;
import sk.upjs.ics.paz1c.databazaKnih.Genre;
import sk.upjs.ics.paz1c.databazaKnih.GenreManager;
import sk.upjs.ics.paz1c.databazaKnih.InterfaceAuthorDao;
import sk.upjs.ics.paz1c.databazaKnih.InterfaceBookDao;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.Tag;
import sk.upjs.ics.paz1c.databazaKnih.TagManager;
import sk.upjs.ics.paz1c.databazaKnih.User;

/**
 *
 * @author szoplakz
 */
public class AddOrUpdateBookForm extends javax.swing.JDialog {

    GenreManager genreManager = ObjectFactory.INSTANCE.getGenreManager();
    TagManager tagManager = ObjectFactory.INSTANCE.getTagManager();
    AuthorManager authorManager = ObjectFactory.INSTANCE.getAuthorManager();
    BookManager bookManager = ObjectFactory.INSTANCE.getBookManager();
    InterfaceBookDao bookDao = ObjectFactory.INSTANCE.getBookDao();
    InterfaceAuthorDao authorDao = ObjectFactory.INSTANCE.getAuthorDao();
    private String[] genreNames;
    private String[] tagNames;
    private int[] genreArray;
    private int[] tagArray;
    private String[] authorNames;
    private int[] authorArray;
    private Book book;
    private User user;
    /**
     * Creates new form BookRequestForm
     */
    public AddOrUpdateBookForm(java.awt.Dialog parent, boolean modal, Book book, boolean isUpdate, User user) {
        super(parent, modal);
        initComponents();
        this.book = book;
        this.user = user;
        List<Genre> genres = genreManager.getAllGenres();

        genreNames = new String[genres.size()];
        genreArray = new int[genres.size()];
        int i = 0;
        for (Genre genre : genres) {
            genreNames[i] = genre.getName();
            genreArray[i] = genre.getId();
            i++;
        }
        GenreList.setListData(genreNames);

        List<Tag> tags = tagManager.getAllTags();
        tagNames = new String[tags.size()];
        tagArray = new int[tags.size()];
        int j = 0;
        for (Tag tag : tags) {
            tagNames[j] = tag.getName();
            tagArray[j] = tag.getId();
            j++;
        }
        TagList.setListData(tagNames);

        

        List<Author> authors = authorManager.getAllAuthors();
        authorNames = new String[authors.size()];
        authorArray = new int[authors.size()];
        int k = 0;
        for (Author author : authors) {
            authorNames[k] = author.getName();
            authorArray[k] = author.getId();
            k++;
        }
        AuthorList.setListData(authorNames);

        if (isUpdate) {
            AddBookButton.enable(false);
            AddBookButton.setVisible(false);
            NameTextField.setText(book.getName());
            ISBNTextField.setText(Integer.toString(book.getISBN()));
            YearTextField.setText(Integer.toString(book.getYear()));
            LengthTextField.setText(Integer.toString(book.getNumberOfPages()));
            SynopsisTextArea.setText(book.getDescription());

        } else {
            UpdateButton.enable(false);
            UpdateButton.setVisible(false);
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

        AddBookButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        BookNameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        GenreBookSearchLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GenreList = new javax.swing.JList<>();
        TagBookSearchLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TagList = new javax.swing.JList<>();
        ISBNBookSearchLabel1 = new javax.swing.JLabel();
        YearTextField = new javax.swing.JTextField();
        YearBookSearchLabel = new javax.swing.JLabel();
        NumberOfPagesBookSearchLabel = new javax.swing.JLabel();
        LengthTextField = new javax.swing.JTextField();
        ISBNTextField = new javax.swing.JTextField();
        AuthorLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AuthorList = new javax.swing.JList<>();
        GenreBookSearchLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        SynopsisTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AddBookButton.setText("Add Book");
        AddBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update Book");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        BookNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookNameLabel.setForeground(new java.awt.Color(0, 102, 204));
        BookNameLabel.setText("Name:");

        GenreBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenreBookSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        GenreBookSearchLabel.setText("Genre:");

        GenreList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(GenreList);

        TagBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TagBookSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        TagBookSearchLabel.setText("Tags:");

        TagList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(TagList);

        ISBNBookSearchLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ISBNBookSearchLabel1.setForeground(new java.awt.Color(0, 102, 204));
        ISBNBookSearchLabel1.setText("ISBN:");

        YearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearTextFieldActionPerformed(evt);
            }
        });

        YearBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        YearBookSearchLabel.setForeground(new java.awt.Color(0, 102, 204));
        YearBookSearchLabel.setText("Year of publication:");

        NumberOfPagesBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumberOfPagesBookSearchLabel.setForeground(new java.awt.Color(0, 102, 255));
        NumberOfPagesBookSearchLabel.setText("Length:");

        LengthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LengthTextFieldActionPerformed(evt);
            }
        });

        ISBNTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNTextFieldActionPerformed(evt);
            }
        });

        AuthorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorLabel.setForeground(new java.awt.Color(0, 102, 204));
        AuthorLabel.setText("Author:");

        AuthorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(AuthorList);

        GenreBookSearchLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenreBookSearchLabel1.setForeground(new java.awt.Color(0, 102, 204));
        GenreBookSearchLabel1.setText("Synopsis:");

        SynopsisTextArea.setColumns(20);
        SynopsisTextArea.setRows(5);
        jScrollPane4.setViewportView(SynopsisTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(YearTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(YearBookSearchLabel)
                    .addComponent(TagBookSearchLabel)
                    .addComponent(GenreBookSearchLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GenreBookSearchLabel1)
                    .addComponent(AuthorLabel)
                    .addComponent(NumberOfPagesBookSearchLabel)
                    .addComponent(LengthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(ISBNBookSearchLabel1)
                    .addComponent(ISBNTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ISBNBookSearchLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ISBNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumberOfPagesBookSearchLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BookNameLabel)
                        .addGap(7, 7, 7)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YearBookSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GenreBookSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TagBookSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AuthorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenreBookSearchLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearTextFieldActionPerformed

    private void LengthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LengthTextFieldActionPerformed

    private void ISBNTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNTextFieldActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

book.setName(NameTextField.getText());
         book.setISBN(Integer.parseInt(ISBNTextField.getText()));
         book.setNumberOfPages(Integer.parseInt(LengthTextField.getText()));
         book.setYear(Integer.parseInt(YearTextField.getText()));
         
         
         if(AuthorList.getSelectedIndex()!=-1){
             if(book.getAuthor()!=0){
             if((!authorManager.findById(book.getAuthor()).getName().equals(authorNames[AuthorList.getSelectedIndex()]))){
                 bookManager.removeAuthorFromBook(book);
             }
             }
             
               Author author =  authorManager.findById(authorArray[AuthorList.getSelectedIndex()]);
         bookManager.addAuthorToBook(book, author);  
         book.setAuthor(author.getId());
          
             }
    
         
         

        GenreList.getSelectedIndices();
        int[] genreIndeces = GenreList.getSelectedIndices();
        List<Integer> genreList = new ArrayList<Integer>();
        for (int i = 0; i < genreIndeces.length; i++) {
            genreList.add(genreArray[genreIndeces[i]]);
        }
       
        System.out.println((book.getGenres().size()));
         bookManager.removeGenresFromBook(book.getGenres(), book);
        bookManager.addGenresToBook(genreList, book);
        book.setGenres(genreList);
        
        
        TagList.getSelectedIndices();
        int[] tagIndeces = TagList.getSelectedIndices();
        List<Integer> tagList = new ArrayList<Integer>();
        for (int i = 0; i < tagIndeces.length; i++) {
            tagList.add(tagArray[tagIndeces[i]]);
        }
        
        
        
         bookManager.removeTagsFromBook(book.getTags(), book);
        bookManager.addTagsToBook(tagList, book);
        book.setTags(tagList);
        
        book.setDescription(SynopsisTextArea.getText());
        book.setVerificationStatus(true);
        book.setIsActive(true);
        bookManager.updateBook(book);
        BookForm bookform = new BookForm((Dialog) this.getParent().getParent(), true, user, book);
        this.getParent().setVisible(false);
        bookform.setVisible(true);
        
        this.setVisible(false);

    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookButtonActionPerformed
        Book newBook = new Book();
        newBook.setName(NameTextField.getText());
        newBook.setISBN(Integer.parseInt(ISBNTextField.getText()));
        newBook.setNumberOfPages(Integer.parseInt(LengthTextField.getText()));
        newBook.setYear(Integer.parseInt(YearTextField.getText()));
       
        if (AuthorList.getSelectedIndex() != -1) {
            newBook.setAuthor(authorArray[AuthorList.getSelectedIndex()]);
           
        }
        List<Integer> genreList = new ArrayList<Integer>();

        if (GenreList.getSelectedIndex() != -1) {
            
            int[] genreIndeces = GenreList.getSelectedIndices();
            
            for (int i = 0; i < genreIndeces.length; i++) {
                genreList.add(genreArray[genreIndeces[i]]);
            }
            
            
        }
        
        List<Integer> tagList = new ArrayList<Integer>();
        if (TagList.getSelectedIndex() != -1) {
            
            int[] tagIndeces = TagList.getSelectedIndices();
            
            for (int i = 0; i < tagIndeces.length; i++) {
                tagList.add(tagArray[tagIndeces[i]]);
            }
            
            
        }
        newBook.setGenres(genreList);
        newBook.setTags(tagList);
        newBook.setVerificationStatus(true);
        newBook.setIsActive(true);
        newBook.setDescription(SynopsisTextArea.getText());
        bookManager.insertBook(newBook);
        
        List<Book> books = bookManager.GetBooksByName(NameTextField.getText(), bookManager.getAllBooks());
        Book book = books.get(0);
        if (AuthorList.getSelectedIndex() != -1) {
            
        bookManager.addAuthorToBook(book, authorManager.findById((authorArray[AuthorList.getSelectedIndex()])));
        }
        
        bookManager.addGenresToBook(genreList, book);
            
        
        
        if (TagList.getSelectedIndex() != -1) {
         
        bookManager.addTagsToBook(tagList, book);
        }
        books = bookManager.GetBooksByName(NameTextField.getText(), bookManager.getAllBooks());
         book = books.get(0);
        this.setVisible(false);
        
    }//GEN-LAST:event_AddBookButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookButton;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JList<String> AuthorList;
    private javax.swing.JLabel BookNameLabel;
    private javax.swing.JLabel GenreBookSearchLabel;
    private javax.swing.JLabel GenreBookSearchLabel1;
    private javax.swing.JList<String> GenreList;
    private javax.swing.JLabel ISBNBookSearchLabel1;
    private javax.swing.JTextField ISBNTextField;
    private javax.swing.JTextField LengthTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel NumberOfPagesBookSearchLabel;
    private javax.swing.JTextArea SynopsisTextArea;
    private javax.swing.JLabel TagBookSearchLabel;
    private javax.swing.JList<String> TagList;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel YearBookSearchLabel;
    private javax.swing.JTextField YearTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
