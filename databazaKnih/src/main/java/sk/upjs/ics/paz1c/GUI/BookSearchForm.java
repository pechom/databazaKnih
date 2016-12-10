/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.GUI;

/**
 *
 * @author szoplakz
 */
public class BookSearchForm extends javax.swing.JDialog {

    /**
     * Creates new form BookSearchForm
     */
    public BookSearchForm(java.awt.Dialog parent, boolean modal,int MyId, boolean isAdmin) {
        super(parent, modal);
        initComponents();
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
        BookNameSearchTextField = new javax.swing.JTextField();
        AuthorNameLabel = new javax.swing.JLabel();
        GenreBookSearchLabel = new javax.swing.JLabel();
        AuthorNameSearchTextField = new javax.swing.JTextField();
        GenreSelectorComboBox = new javax.swing.JComboBox<>();
        ISBMBookSearchTextField = new javax.swing.JTextField();
        ISBNBookSearchLabel1 = new javax.swing.JLabel();
        TagBookSearchLabel = new javax.swing.JLabel();
        TagBookSearchTextField = new javax.swing.JTextField();
        YearBookSearchLabel = new javax.swing.JLabel();
        YearBookSearchMinimumTextField = new javax.swing.JTextField();
        YearSearchSeparatorLabel = new javax.swing.JLabel();
        YearBookSearchMaxiimumTextField = new javax.swing.JTextField();
        NumberOfPagesBookSearchLabel = new javax.swing.JLabel();
        NumberofPagesBookSearchMinimumTextField2 = new javax.swing.JTextField();
        NumberofPagesSearchSeparatorLabel = new javax.swing.JLabel();
        NumberofPagesBookSearchMaximumTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        BookListList = new javax.swing.JList<>();
        RatingsBookSearchLabel = new javax.swing.JLabel();
        RatingBookSearchMinimumTextField = new javax.swing.JTextField();
        RatingsSearchSeparatorLabel = new javax.swing.JLabel();
        RatingsBookSearchMaximumTextField = new javax.swing.JTextField();
        BookSearchFilterButton = new javax.swing.JButton();
        BookSearchViewButton = new javax.swing.JButton();

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

        GenreSelectorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GenreSelectorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreSelectorComboBoxActionPerformed(evt);
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

        YearBookSearchMinimumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearBookSearchMinimumTextFieldActionPerformed(evt);
            }
        });

        YearSearchSeparatorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        YearSearchSeparatorLabel.setForeground(new java.awt.Color(0, 102, 255));
        YearSearchSeparatorLabel.setText("to");

        NumberOfPagesBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumberOfPagesBookSearchLabel.setForeground(new java.awt.Color(0, 102, 255));
        NumberOfPagesBookSearchLabel.setText("Length:");

        NumberofPagesBookSearchMinimumTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberofPagesBookSearchMinimumTextField2ActionPerformed(evt);
            }
        });

        NumberofPagesSearchSeparatorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumberofPagesSearchSeparatorLabel.setForeground(new java.awt.Color(0, 102, 255));
        NumberofPagesSearchSeparatorLabel.setText("to");

        BookListList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(BookListList);

        RatingsBookSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RatingsBookSearchLabel.setForeground(new java.awt.Color(0, 102, 255));
        RatingsBookSearchLabel.setText("Rating:");

        RatingBookSearchMinimumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingBookSearchMinimumTextFieldActionPerformed(evt);
            }
        });

        RatingsSearchSeparatorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RatingsSearchSeparatorLabel.setForeground(new java.awt.Color(0, 102, 255));
        RatingsSearchSeparatorLabel.setText("to");

        RatingsBookSearchMaximumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingsBookSearchMaximumTextFieldActionPerformed(evt);
            }
        });

        BookSearchFilterButton.setText("Filter");

        BookSearchViewButton.setText("View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AuthorNameSearchTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(ISBMBookSearchTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(ISBNBookSearchLabel1)
                                .addComponent(YearBookSearchLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(YearBookSearchMinimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(YearSearchSeparatorLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(YearBookSearchMaxiimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NumberOfPagesBookSearchLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NumberofPagesBookSearchMinimumTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NumberofPagesSearchSeparatorLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NumberofPagesBookSearchMaximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BookSearchFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BookSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(RatingBookSearchMinimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(RatingsSearchSeparatorLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(RatingsBookSearchMaximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(TagBookSearchLabel)
                                        .addComponent(TagBookSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GenreSelectorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RatingsBookSearchLabel))
                                    .addGap(20, 20, 20))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AuthorNameLabel)
                                    .addGap(202, 202, 202)
                                    .addComponent(GenreBookSearchLabel))
                                .addComponent(BookNameSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(50, 50, 50)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(BookNameLabel)
                    .addGap(7, 7, 7)
                    .addComponent(BookNameSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AuthorNameLabel)
                        .addComponent(GenreBookSearchLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AuthorNameSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GenreSelectorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ISBNBookSearchLabel1)
                        .addComponent(TagBookSearchLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ISBMBookSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TagBookSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(YearBookSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(YearBookSearchMinimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(YearSearchSeparatorLabel)
                                .addComponent(YearBookSearchMaxiimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NumberOfPagesBookSearchLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NumberofPagesBookSearchMinimumTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NumberofPagesSearchSeparatorLabel)
                                .addComponent(NumberofPagesBookSearchMaximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(RatingsBookSearchLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RatingBookSearchMinimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RatingsSearchSeparatorLabel)
                                .addComponent(RatingsBookSearchMaximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BookSearchViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BookSearchFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenreSelectorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreSelectorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreSelectorComboBoxActionPerformed

    private void YearBookSearchMinimumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearBookSearchMinimumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearBookSearchMinimumTextFieldActionPerformed

    private void NumberofPagesBookSearchMinimumTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberofPagesBookSearchMinimumTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberofPagesBookSearchMinimumTextField2ActionPerformed

    private void RatingBookSearchMinimumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatingBookSearchMinimumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RatingBookSearchMinimumTextFieldActionPerformed

    private void RatingsBookSearchMaximumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatingsBookSearchMaximumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RatingsBookSearchMaximumTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorNameLabel;
    private javax.swing.JTextField AuthorNameSearchTextField;
    private javax.swing.JList<String> BookListList;
    private javax.swing.JLabel BookNameLabel;
    private javax.swing.JTextField BookNameSearchTextField;
    private javax.swing.JButton BookSearchFilterButton;
    private javax.swing.JButton BookSearchViewButton;
    private javax.swing.JLabel GenreBookSearchLabel;
    private javax.swing.JComboBox<String> GenreSelectorComboBox;
    private javax.swing.JTextField ISBMBookSearchTextField;
    private javax.swing.JLabel ISBNBookSearchLabel1;
    private javax.swing.JLabel NumberOfPagesBookSearchLabel;
    private javax.swing.JTextField NumberofPagesBookSearchMaximumTextField;
    private javax.swing.JTextField NumberofPagesBookSearchMinimumTextField2;
    private javax.swing.JLabel NumberofPagesSearchSeparatorLabel;
    private javax.swing.JTextField RatingBookSearchMinimumTextField;
    private javax.swing.JLabel RatingsBookSearchLabel;
    private javax.swing.JTextField RatingsBookSearchMaximumTextField;
    private javax.swing.JLabel RatingsSearchSeparatorLabel;
    private javax.swing.JLabel TagBookSearchLabel;
    private javax.swing.JTextField TagBookSearchTextField;
    private javax.swing.JLabel YearBookSearchLabel;
    private javax.swing.JTextField YearBookSearchMaxiimumTextField;
    private javax.swing.JTextField YearBookSearchMinimumTextField;
    private javax.swing.JLabel YearSearchSeparatorLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
