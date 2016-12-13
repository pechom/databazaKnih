/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazaKnih.GUI;

import sk.upjs.ics.paz1c.databazaKnih.ObjectFactory;
import sk.upjs.ics.paz1c.databazaKnih.User;
import sk.upjs.ics.paz1c.databazaKnih.UserManager;

/**
 *
 * @author szoplakz
 */
public class UpdateForm extends javax.swing.JDialog {
    private User user;
    /**
     * Creates new form RegisterForm
     */
    public UpdateForm(java.awt.Dialog parent, boolean modal,User user) {
        super(parent, modal);
        initComponents();
        this.user = user;
        NameTextField.setText(user.getName());
        SurnameTextField.setText(user.getSurname());
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AcceptChangesButton = new javax.swing.JButton();
        SurnameTextField = new javax.swing.JTextField();
        EnterSurnameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        EnterNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AcceptChangesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AcceptChangesButton.setText("Confirm changes");
        AcceptChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptChangesButtonActionPerformed(evt);
            }
        });

        EnterSurnameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnterSurnameLabel.setForeground(new java.awt.Color(0, 102, 255));
        EnterSurnameLabel.setText("Surname:");

        EnterNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnterNameLabel.setForeground(new java.awt.Color(0, 102, 255));
        EnterNameLabel.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SurnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(EnterNameLabel)
                    .addComponent(EnterSurnameLabel)
                    .addComponent(AcceptChangesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnterNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterSurnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptChangesButtonActionPerformed
       UserManager userManager = ObjectFactory.INSTANCE.getUserManager();
        
       user.setName(NameTextField.getText());
       user.setSurname(SurnameTextField.getText());
       userManager.updateUser(user);
       this.setVisible(false);
        
        
        
         
   
         
    }//GEN-LAST:event_AcceptChangesButtonActionPerformed
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptChangesButton;
    private javax.swing.JLabel EnterNameLabel;
    private javax.swing.JLabel EnterSurnameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField SurnameTextField;
    // End of variables declaration//GEN-END:variables

    
}
