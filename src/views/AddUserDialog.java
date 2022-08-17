/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import Controllers.DBController;
import Exceptions.InvalidFormException;
import Models.Agent;
import Models.Roles;
import Models.User;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author naol
 */
public class AddUserDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddUserDialog
     */
    User current;
    JFrame parent;
    
    public AddUserDialog(JFrame parent, User current) {
        this(current);
        this.parent = parent;
        setModal(true);
        setLocation(this.parent.getX(), this.parent.getY());
    }
    
    public AddUserDialog(User current) {
        initComponents();
        this.current = current;    
        if (this.current.Role == Roles.ADMIN) {
            String types[] = {"PASSENGER", "DRIVER", "ADMIN", "AGENT"};
            typeCombo.setModel(new DefaultComboBoxModel<String>(types));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneNoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backAccountField = new javax.swing.JTextField();
        ssnField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        confirmField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register new User");

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jLabel1.setText("Register new User");

        jLabel2.setText("User Type");

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PASSENGER", "DRIVER" }));

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Phone Number");

        jLabel6.setText("Password");

        jLabel7.setText("Confirm Password");

        jLabel8.setText("Bank Account No.");

        jLabel9.setText("Social Security No.");

        saveBtn.setBackground(new java.awt.Color(102, 153, 255));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.setToolTipText("");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.setToolTipText("");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(confirmField))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(140, 140, 140)
                            .addComponent(jLabel7))
                        .addComponent(phoneNoField)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(0, 125, Short.MAX_VALUE))
                                .addComponent(lnameField)))
                        .addComponent(backAccountField)
                        .addComponent(ssnField)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ssnField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lnameField)
                    .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backAccountField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // Validate Forms
        try {
            String password = String.valueOf(passwordField.getPassword());
            if (ssnField.getText().length() < 9) {
                throw new InvalidFormException("SSN Should be 9 characters");
            }
            
            if (fnameField.getText().equals("") || lnameField.getText().equals("")) {
                throw new InvalidFormException("Please Enter both First and Last name");
            }
            
            if (phoneNoField.getText().length() < 10) {
                throw new InvalidFormException("Please Enter Valid Phone number");
            }
            
            if (password.equals("")) {
                throw new InvalidFormException("Please Enter your password");
            }
            
            if (password.length() < 6) {
                throw new InvalidFormException("Password should be more than 6 characters");
            }
            
            if (!password.equals(String.valueOf(confirmField.getPassword()))) {
                throw new InvalidFormException("Password and Confirmation Doesn't Match");
            }
            
            PreparedStatement ps = DBController.getPreparedStmt("INSERT INTO User(SSN, FirstName, LastName, PhoneNumber, Password, Role, BankAccountNo) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(ssnField.getText()));
            ps.setString(2, fnameField.getText());
            ps.setString(3, lnameField.getText());
            ps.setString(4, phoneNoField.getText());
            ps.setString(5, DBController.hash_md5(String.valueOf(passwordField.getPassword())));
            ps.setString(6, (String) typeCombo.getSelectedItem());
            ps.setString(7, backAccountField.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, (String) typeCombo.getSelectedItem()  + " Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
        }catch(InvalidFormException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error in Form", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL Error", "SQL Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(AddUserDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AddUserDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AddUserDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarculaLaf.setup();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField backAccountField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lnameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField ssnField;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables
}
