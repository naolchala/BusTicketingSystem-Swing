/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import Controllers.DBController;
import Exceptions.InvalidFormException;
import Models.Passenger;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author naol
 */
public class BuyTicket extends javax.swing.JDialog {

    /**
     * Creates new form BuyTicket
     */
    Passenger current;
    int travelID;

    public BuyTicket(java.awt.Frame parent, boolean modal, Passenger current, int travelID) {
        super(parent, modal);
        initComponents();
        this.current = current;
        this.travelID = travelID;
        travelIDfield.setText(String.valueOf(this.travelID));
        try {
            PreparedStatement ps = DBController.getPreparedStmt("SELECT * FROM Travel WHERE TravelID=?");
            ps.setInt(1, travelID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int sc = rs.getInt("SourceCityID");
                int dc = rs.getInt("DestinationCityID");
                ps = DBController.getPreparedStmt("SELECT * FROM City WHERE CityID=? OR CityID=?");
                ps.setInt(1, sc);
                ps.setInt(2, dc);

                ResultSet rs2 = ps.executeQuery();
                if (rs2.next()) {
                    fromField.setText(rs2.getString("CityName"));
                }

                if (rs2.next()) {
                    toField.setText(rs2.getString("CityName"));
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(BuyTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPassengerAndTravel(Passenger current, int TravelID) {
        this.current = current;
        this.travelID = TravelID;
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
        saveBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        travelIDfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fromField = new javax.swing.JTextField();
        toField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sitNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jLabel1.setText("Buy Ticket");

        saveBtn.setText("Save");
        saveBtn.setToolTipText("");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Travel ID");

        travelIDfield.setEnabled(false);

        jLabel3.setText("From ");

        fromField.setEnabled(false);

        toField.setEnabled(false);

        jLabel4.setText("To");

        jLabel5.setText("Sit Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sitNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(travelIDfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(toField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(travelIDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            int sitNo = Integer.parseInt(sitNumber.getText());
            PreparedStatement ps = DBController.getPreparedStmt("SELECT * FROM Ticket WHERE TravelID=? AND SitNumber=?");
            ps.setInt(1, travelID);
            ps.setInt(2, sitNo);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                throw new InvalidFormException("Sit is Taken, Choose Another");
            }
            
            ps = DBController.getPreparedStmt("INSERT INTO Ticket(TicketID, PassangerSSN, TravelID, SitNumber,  DateCreated) VALUES (NULL, ?,?,?, ?)");
            ps.setInt(1, current.SSN);
            ps.setInt(2, travelID);
            ps.setInt(3, sitNo);
            ps.setDate(4, new Date(new java.util.Date().getTime()));
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Ticket Bought", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InvalidFormException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error in Form", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fromField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField sitNumber;
    private javax.swing.JTextField toField;
    private javax.swing.JTextField travelIDfield;
    // End of variables declaration//GEN-END:variables
}
