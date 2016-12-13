/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import java.util.List;
import jdk.nashorn.internal.objects.NativeArray;
import sk.upjs.ics.paz1c.databazaKnih.Author;
import sk.upjs.ics.paz1c.databazaKnih.AuthorReview;
import sk.upjs.ics.paz1c.databazaKnih.Book;
import sk.upjs.ics.paz1c.databazaKnih.BookReview;
import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.Request;
import sk.upjs.ics.paz1c.databazaKnih.RequestManager;
import sk.upjs.ics.paz1c.databazaKnih.User;

/**
 *
 * @author szoplakz
 */
public class ListForm extends javax.swing.JDialog {
    private String[] data;
    private String type;
    private User user;
    private String content;
    private Book[] bookarray;
    private Author[] authorarray;
    private User[] userarray;
    private Request[] requestarray;
    private BookReview[] bookreviewarray;
    private AuthorReview[] authorreviewarray;
    
    RequestManager requestManager = ObjectFactory.INSTANCE.getRequestManager();
    /**
     * Creates new form ReviewsForm
     */
    public ListForm(java.awt.Dialog parent, boolean modal, String content, User user, Book currentBook, Author currentAuthor ) {
        super(parent, modal);
        initComponents();
        
        this.user=user;
        
        if(content.equals("FavouriteBooks")){
            List<Book> favouriteBooks = user.getFavoriteBooks();
            type = "Book";
            bookarray = new Book[favouriteBooks.size()];
             data = new String[favouriteBooks.size()];
             int i = 0;
            for (Book book : favouriteBooks) {
               data[i]= book.getName();
               bookarray[i] = book;
               i++;
            }
             ContentList.setListData(data);
            }
     
      
        if(content.equals("WantedBooks")){
            List<Book> wantedBooks = user.getWantedBooks();
            type = "Book";
             data = new String[wantedBooks.size()];
             bookarray = new Book[wantedBooks.size()];
             int i = 0;
            for (Book book : wantedBooks) {
               data[i]= book.getName();
               bookarray[i] = book;
               i++;
            }
             ContentList.setListData(data);
            }
        if(content.equals("ReadBooks")){
            List<Book> readBooks = user.getReadBooks();
            type = "Book";
            bookarray = new Book[readBooks.size()];
             data = new String[readBooks.size()];
             int i = 0;
            for (Book book : readBooks) {
               data[i]= book.getName();
               bookarray[i] = book;
               i++;
            }
             ContentList.setListData(data);
            }
         if(content.equals("FavouriteAuthors")){
            List<Author> favouriteAuthors = user.getFavoriteAuthors();
            type = "Author";
             authorarray = new Author[favouriteAuthors.size()];
             data = new String[favouriteAuthors.size()];
             int i = 0;
            for (Author author : favouriteAuthors) {
               data[i]= author.getName();
                authorarray[i] = author;
               i++;
            }
             ContentList.setListData(data);
            }
          
        if(content.equals("FavouriteReviewers")){
            List<User> favouriteReviewers = user.getFavoriteReviewers();
            type = "User";
             data = new String[favouriteReviewers.size()];
             userarray = new User[favouriteReviewers.size()];
             int i = 0;
            for (User reviewer : favouriteReviewers) {
               data[i]= reviewer.getName();
               userarray[i] = reviewer;
               i++;
            }
             ContentList.setListData(data);
            }
        
         if(content.equals("Friends")){
            List<User> friends = user.getFriends();
            type = "User";
             data = new String[friends.size()];
              userarray = new User[friends.size()];
             int i = 0;
            for (User friend : friends) {
               data[i]= friend.getName();
               userarray[i] = friend;
               i++;
            }
             ContentList.setListData(data);
            }
         
         if(content.equals("MyBookReviews")){
            List<BookReview> bookReviews = user.getBookReviews();
            type = "BookReview";
             data = new String[bookReviews.size()];
             bookreviewarray = new BookReview[bookReviews.size()];
             int i = 0;
            for (BookReview review : bookReviews) {
               data[i]= review.getBook().getName();
               bookreviewarray[i] = review;
               i++;
            }
             ContentList.setListData(data);
            }
        
        
    
    if(content.equals("MyAuthorReviews")){
            List<AuthorReview> authorReviews = user.getAuthorReviews();
            type = "AuthorReview";
             data = new String[authorReviews.size()];
             authorreviewarray = new AuthorReview[authorReviews.size()];
             int i = 0;
            for (AuthorReview review : authorReviews) {
               data[i]= review.getAuthor().getName();
               authorreviewarray[i] = review;
               i++;
            }
             ContentList.setListData(data);
             
             
            }
     if(content.equals("BookReviews")){
         
            List<BookReview> bookReviews = currentBook.getBookReviews();
            type = "BookReview";
            data = new String[bookReviews.size()];
             bookreviewarray = new BookReview[bookReviews.size()];
             int i = 0;
            for (BookReview review : bookReviews) {
               data[i]= review.getUser().getUserName();
               bookreviewarray[i] = review;
               i++;
            }
             ContentList.setListData(data);
            }
     
      if(content.equals("AuthorReviews")){
            List<AuthorReview> authorReviews = currentAuthor.getAuthorReviews();
            type = "AuthorReview";
             data = new String[authorReviews.size()];
             authorreviewarray = new AuthorReview[authorReviews.size()];
             int i = 0;
            for (AuthorReview review : authorReviews) {
               data[i]= review.getUser().getUserName();
               authorreviewarray[i] = review;
               i++;
            }
             ContentList.setListData(data);
             
             
            }
      
      
      
      if(content.equals("RequestsByAuthor")){
            List<Request> requests = requestManager.getRequestsByAuthor(currentAuthor);
            type = "Request";
             data = new String[requests.size()];
             requestarray = new Request[requests.size()];
             int i = 0;
            for (Request request : requests) {
               data[i]= request.getRequester().getName();
               requestarray[i] = request;
               i++;
            }
             ContentList.setListData(data);
             
             
            }
      
     
      
       
      if(content.equals("RequestsbyBook")){
            List<Request> requests = requestManager.getRequestsByBook(currentBook);
            type = "Request";
             data = new String[requests.size()];
             requestarray = new Request[requests.size()];
             int i = 0;
            for (Request request : requests) {
               data[i]= request.getRequester().getName();
               requestarray[i] = request;
               i++;
            }
             ContentList.setListData(data);
             
             
            }
      
      
       if(content.equals("AllRequests")){
            List<Request> requests = requestManager.getAllRequests();
            type = "Request";
             data = new String[requests.size()];
             requestarray = new Request[requests.size()];
             int i = 0;
            for (Request request : requests) {
               data[i]= request.getRequester().getName();
               requestarray[i] = request;
               i++;
            }
             ContentList.setListData(data);
             
             
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ContentList = new javax.swing.JList<>();
        ViewContentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(ContentList);

        ViewContentButton.setText("View");
        ViewContentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewContentButtonActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ViewContentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewContentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewContentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewContentButtonActionPerformed
        if (ContentList.getSelectedIndex()==-1){
        ErrorForm errorForm = new ErrorForm(this, true,"No item selected");
            errorForm.setVisible(true);
            return;
        } else {
           
        switch(type) {
            case "Book": 
            Book book =  bookarray[ContentList.getSelectedIndex()];
            BookForm bookform = new BookForm(this, true, user, book);
            bookform.setVisible(true);
            
            case "Author": 
            Author author =  authorarray[ContentList.getSelectedIndex()];
            AuthorForm authorForm = new AuthorForm(this, true, author, user);
            authorForm.setVisible(true);
            
             case "User": 
            User userProfile =  userarray[ContentList.getSelectedIndex()];
            UserProfileForm userForm = new UserProfileForm(this, true, user, userProfile);
            userForm.setVisible(true);
             
             case "BookReview":
                 BookReview bookReview = bookreviewarray[ContentList.getSelectedIndex()];
                 ReviewForm bookreviewForm = new ReviewForm(this, true, true,bookReview, null);
                 bookreviewForm.setVisible(true);
                 
            case "AuthorReview":
                 AuthorReview authorReview = authorreviewarray[ContentList.getSelectedIndex()];
                 ReviewForm authorreviewForm = new ReviewForm(this, true, false, null , authorReview);
                 authorreviewForm.setVisible(true);
            
            case "Request":
                 Request request = requestarray[ContentList.getSelectedIndex()];
                 RequestForm requestForm = new RequestForm(this, true, request);
                 requestForm.setVisible(true);  
                 
                 
                 
        }
        }
        
    }//GEN-LAST:event_ViewContentButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ContentList;
    private javax.swing.JButton ViewContentButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
