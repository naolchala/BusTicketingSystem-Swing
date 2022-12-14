/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import Controllers.DBController;
import Exceptions.InvalidFormException;
import Models.Agent;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naol
 */
public class UserProfileDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddUserDialog
     */
    User currentAgent;
    User currentUser;
    JFrame parent;
    
    public UserProfileDialog(JFrame parent, User current, User currentUser) {
        this(current, currentUser);
        
        this.parent = parent;
       
        setModal(true);
        setLocation(this.parent.getX(), this.parent.getY());
        
    }
    
    public UserProfileDialog(User current, User currentUser) {
        initComponents();
        this.currentAgent = current;
        this.currentUser = currentUser;
        
        ssnfield.setText(String.valueOf(currentUser.SSN));
        fnameField.setText(currentUser.FirstName);
        lnameField.setText(currentUser.LastName);
        bankAccount.setText(currentUser.BankAccountNo);
        phoneNumber.setText(currentUser.PhoneNumber);
        roleField.setText(currentUser.Role.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new JTabbedPane();
        InfoTab = new JPanel();
        jLabel1 = new JLabel();
        ssnfield = new JTextField();
        jLabel2 = new JLabel();
        fnameField = new JTextField();
        jLabel3 = new JLabel();
        lnameField = new JTextField();
        jLabel4 = new JLabel();
        phoneNumber = new JTextField();
        jLabel5 = new JLabel();
        jTextField5 = new JTextField();
        jLabel6 = new JLabel();
        bankAccount = new JTextField();
        jLabel7 = new JLabel();
        roleField = new JTextField();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jComboBox1 = new JComboBox<>();
        jTextField7 = new JTextField();
        jButton1 = new JButton();
        jLabel10 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register new User");

        jLabel1.setText("SSN");

        ssnfield.setEnabled(false);

        jLabel2.setText("First Name");

        fnameField.setEnabled(false);

        jLabel3.setText("Last Name");

        lnameField.setEnabled(false);

        jLabel4.setText("Phone Number");

        phoneNumber.setEnabled(false);

        jLabel5.setText("Password");

        jTextField5.setEnabled(false);

        jLabel6.setText("Bank Account No.");

        bankAccount.setEnabled(false);

        jLabel7.setText("User Type");

        roleField.setEnabled(false);

        GroupLayout InfoTabLayout = new GroupLayout(InfoTab);
        InfoTab.setLayout(InfoTabLayout);
        InfoTabLayout.setHorizontalGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(InfoTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, InfoTabLayout.createSequentialGroup()
                        .addGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(roleField, GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumber, GroupLayout.Alignment.LEADING)
                            .addComponent(ssnfield)
                            .addGroup(GroupLayout.Alignment.LEADING, InfoTabLayout.createSequentialGroup()
                                .addGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fnameField, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lnameField, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bankAccount, GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        InfoTabLayout.setVerticalGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(InfoTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ssnfield, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(InfoTabLayout.createSequentialGroup()
                        .addGroup(InfoTabLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnameField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addComponent(lnameField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bankAccount, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Information", InfoTab);

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "TravelID", "Source City", "Destination City", "Start Date", "Arrived Date" }));

        jTextField7.setText("jTextField7");

        jButton1.setText("Search");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jTextField7)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Travel History", jPanel1);

        jLabel10.setFont(new Font("SF UI Display", 1, 24)); // NOI18N
        jLabel10.setText("View User Profile");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 606, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("View History");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarculaLaf.setup();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel InfoTab;
    private JTextField bankAccount;
    private JTextField fnameField;
    private JButton jButton1;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1;
    private JTable jTable1;
    private JTextField jTextField5;
    private JTextField jTextField7;
    private JTextField lnameField;
    private JTextField phoneNumber;
    private JTextField roleField;
    private JTextField ssnfield;
    // End of variables declaration//GEN-END:variables
}
