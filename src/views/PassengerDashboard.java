/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import Controllers.DBController;
import Exceptions.InvalidFormException;
import Models.Agent;
import Models.Passenger;
import Models.User;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author naol
 */
public class PassengerDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AgentDashboard
     */
    public static Passenger passenger;

    public PassengerDashboard(Passenger current) {
        this.passenger = current;
        initComponents();
        Dimension scren = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(scren.width / 2 - this.getWidth() / 2, scren.height / 2 - this.getHeight() / 2);
        nameDisplay.setText(passenger.FirstName + " " + passenger.LastName);
        showData();
        loadSourceCities();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        nameDisplay = new JLabel();
        jLabel5 = new JLabel();
        jButton1 = new JButton();
        jPanel3 = new JPanel();
        jTabbedPane1 = new JTabbedPane();
        userTab = new JPanel();
        jPanel5 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jLabel2 = new JLabel();
        ssnField = new JTextField();
        jLabel3 = new JLabel();
        fnameField = new JTextField();
        phoneNumber = new JTextField();
        jLabel4 = new JLabel();
        lnameField = new JTextField();
        jLabel6 = new JLabel();
        bankAcc = new JTextField();
        jLabel7 = new JLabel();
        editToggle = new JToggleButton();
        updateBtn = new JButton();
        travelTab = new JPanel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jScrollPane2 = new JScrollPane();
        sourceCity = new JTable();
        jScrollPane3 = new JScrollPane();
        distCity = new JTable();
        jLabel10 = new JLabel();
        searchBtn = new JButton();
        jScrollPane5 = new JScrollPane();
        travelTable = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agent Dashboard");

        jPanel1.setBackground(UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new Font("SF UI Display", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Bus Ticketing System - Passenger Dashboard");

        nameDisplay.setFont(new Font("SF UI Display", 1, 18)); // NOI18N
        nameDisplay.setText("Name");

        jLabel5.setText("Passenger ");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nameDisplay, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jLabel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameDisplay, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Logout");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        jLabel2.setText("Social Security No.");

        ssnField.setHorizontalAlignment(JTextField.LEFT);
        ssnField.setEnabled(false);

        jLabel3.setText("First Name");

        fnameField.setHorizontalAlignment(JTextField.LEFT);
        fnameField.setEnabled(false);

        phoneNumber.setHorizontalAlignment(JTextField.LEFT);
        phoneNumber.setEnabled(false);

        jLabel4.setText("Phone Number");

        lnameField.setHorizontalAlignment(JTextField.LEFT);
        lnameField.setEnabled(false);

        jLabel6.setText("Last Name");

        bankAcc.setHorizontalAlignment(JTextField.LEFT);
        bankAcc.setEnabled(false);

        jLabel7.setText("Bank Account No.");

        editToggle.setText("Edit Mode");
        editToggle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editToggleActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.setEnabled(false);
        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(editToggle, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBtn, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(fnameField, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lnameField, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ssnField)
                    .addComponent(phoneNumber)
                    .addComponent(jLabel7)
                    .addComponent(bankAcc))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ssnField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnameField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lnameField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bankAcc, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateBtn, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(editToggle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout userTabLayout = new GroupLayout(userTab);
        userTab.setLayout(userTabLayout);
        userTabLayout.setHorizontalGroup(userTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(userTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        userTabLayout.setVerticalGroup(userTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(userTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", userTab);

        jLabel8.setText("From");

        jLabel9.setText("To");

        sourceCity.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        sourceCity.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                updateDistTable(evt);
            }
        });
        jScrollPane2.setViewportView(sourceCity);

        distCity.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(distCity);

        searchBtn.setText("Search Travel");
        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        travelTable.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        travelTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                buyPage(evt);
            }
        });
        jScrollPane5.setViewportView(travelTable);

        GroupLayout travelTabLayout = new GroupLayout(travelTab);
        travelTab.setLayout(travelTabLayout);
        travelTabLayout.setHorizontalGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(travelTabLayout.createSequentialGroup()
                .addGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(travelTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(travelTabLayout.createSequentialGroup()
                                .addGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(travelTabLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(336, 336, 336)
                                .addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(travelTabLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        travelTabLayout.setVerticalGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(travelTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(travelTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(travelTabLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel10))
                    .addGroup(travelTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Ticket", travelTab);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void loadSourceCities() {
        try {
            PreparedStatement ps = DBController.getPreparedStmt("SELECT * FROM City ORDER BY CityName ASC");
            ResultSet rs = ps.executeQuery();

            sourceCity.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(AddBusDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadDistCities() {
        try {
            int row = sourceCity.getSelectedRow();
            int cityID = Integer.parseInt(sourceCity.getModel().getValueAt(row, 0).toString());

            PreparedStatement ps = DBController.getPreparedStmt("SELECT * FROM City WHERE CityID <> ? ORDER BY CityName ASC");
            ps.setInt(1, cityID);
            ResultSet rs = ps.executeQuery();
            distCity.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(AddBusDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void editToggleActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editToggleActionPerformed
        if (editToggle.getModel().isSelected()) {
            fnameField.setEnabled(true);
            lnameField.setEnabled(true);
            phoneNumber.setEnabled(true);
            bankAcc.setEnabled(true);
            updateBtn.setEnabled(true);
        } else {
            fnameField.setEnabled(false);
            lnameField.setEnabled(false);
            phoneNumber.setEnabled(false);
            bankAcc.setEnabled(false);
            updateBtn.setEnabled(false);
        }
    }//GEN-LAST:event_editToggleActionPerformed

    private void updateBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            if (bankAcc.getText().length() == 0) {
                throw new InvalidFormException("SSN Should be 9 characters");
            }

            if (fnameField.getText().equals("") || lnameField.getText().equals("")) {
                throw new InvalidFormException("Please Enter both First and Last name");
            }

            if (phoneNumber.getText().length() < 10) {
                throw new InvalidFormException("Please Enter Valid Phone number");
            }

            PreparedStatement ps = DBController.getPreparedStmt("UPDATE User SET FirstName=?, LastName=?, PhoneNumber=?, BankAccountNo=? WHERE SSN=?");
            ps.setString(1, fnameField.getText());
            ps.setString(2, lnameField.getText());
            ps.setString(3, phoneNumber.getText());
            ps.setString(4, bankAcc.getText());
            ps.setString(5, ssnField.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Profile Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (InvalidFormException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error in Form", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PassengerDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void updateDistTable(MouseEvent evt) {//GEN-FIRST:event_updateDistTable
        loadDistCities();
    }//GEN-LAST:event_updateDistTable

    private void searchBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            int row = sourceCity.getSelectedRow();
            if (row == -1) {
                throw new InvalidFormException("Please Select Source City");
            }
            int sourceCityID = Integer.parseInt(sourceCity.getModel().getValueAt(row, 0).toString());

            row = distCity.getSelectedRow();
            if (row == -1) {
                throw new InvalidFormException("Please Select Destination City");
            }
            int distCityID = Integer.parseInt(distCity.getModel().getValueAt(row, 0).toString());
            
            
            PreparedStatement ps = DBController.getPreparedStmt("SELECT Travel.TravelID, Travel.Price, Travel.StartDate, Travel.StartTime FROM Travel WHERE Travel.SourceCityID=? AND Travel.DestinationCityID=?");
            ps.setInt(1, sourceCityID);
            ps.setInt(2, distCityID);
            
            ResultSet rs = ps.executeQuery();
            
            travelTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(InvalidFormException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error in Form", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PassengerDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    private void buyPage(MouseEvent evt) {//GEN-FIRST:event_buyPage
        int row = travelTable.getSelectedRow();
        int travelID = Integer.parseInt(travelTable.getModel().getValueAt(row, 0).toString());
        
        BuyTicket bt =  new BuyTicket(this, true, passenger, travelID);
        bt.setVisible(true);
        
    }//GEN-LAST:event_buyPage

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showData() {
        ssnField.setText(String.valueOf(passenger.SSN));
        fnameField.setText(passenger.FirstName);
        lnameField.setText(passenger.LastName);
        phoneNumber.setText(passenger.PhoneNumber);
        bankAcc.setText(passenger.BankAccountNo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarculaLaf.setup();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField bankAcc;
    private JTable distCity;
    private JToggleButton editToggle;
    private JTextField fnameField;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane5;
    private JTabbedPane jTabbedPane1;
    private JTextField lnameField;
    private JLabel nameDisplay;
    private JTextField phoneNumber;
    private JButton searchBtn;
    private JTable sourceCity;
    private JTextField ssnField;
    private JPanel travelTab;
    private JTable travelTable;
    private JButton updateBtn;
    private JPanel userTab;
    // End of variables declaration//GEN-END:variables
}
