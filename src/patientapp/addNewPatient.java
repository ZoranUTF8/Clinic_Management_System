/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientapp;

import DbConnection.ConnectionDB;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author zoranhome
 */
public class addNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form addNewPatient
     */
    public addNewPatient() {
        initComponents();
        this.setSize(480, 520);
        this.setLocation(280, 150);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IdBrojTF = new javax.swing.JTextField();
        ImeTF = new javax.swing.JTextField();
        StarostTF = new javax.swing.JTextField();
        BrojTelefonaTF = new javax.swing.JTextField();
        AdresaTF = new javax.swing.JTextField();
        PolCB = new javax.swing.JComboBox<>();
        KrvnaGrupaCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        OtkaziBTN = new javax.swing.JButton();
        SacuvatiBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novi korisnik");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID Broj");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 203, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ime");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 203, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Broj telefona");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 189, 203, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Starost");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 241, 203, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pol");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 287, 203, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Krvna grupa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 347, 203, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Adresa");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 393, 203, -1));

        IdBrojTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        IdBrojTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdBrojTFActionPerformed(evt);
            }
        });
        getContentPane().add(IdBrojTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 79, 234, -1));

        ImeTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(ImeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 131, 234, -1));

        StarostTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(StarostTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 235, 234, -1));

        BrojTelefonaTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(BrojTelefonaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 183, 234, -1));

        AdresaTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        getContentPane().add(AdresaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 387, 234, -1));

        PolCB.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        PolCB.setForeground(new java.awt.Color(0, 0, 0));
        PolCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muski", "Zenski", "Ostali" }));
        getContentPane().add(PolCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 287, 234, -1));

        KrvnaGrupaCB.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        KrvnaGrupaCB.setForeground(new java.awt.Color(0, 0, 0));
        KrvnaGrupaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "0" }));
        getContentPane().add(KrvnaGrupaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 337, 234, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Unesite novog korisnika");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, 480, -1));

        OtkaziBTN.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        OtkaziBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalswing/images/Close.png"))); // NOI18N
        OtkaziBTN.setText("Otkazi");
        OtkaziBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtkaziBTNActionPerformed(evt);
            }
        });
        getContentPane().add(OtkaziBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 140, -1));

        SacuvatiBTN.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        SacuvatiBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalswing/images/save-icon--1.png"))); // NOI18N
        SacuvatiBTN.setText("Sacuvati");
        SacuvatiBTN.setToolTipText("Sacuvati u bazi korisnika");
        SacuvatiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacuvatiBTNActionPerformed(evt);
            }
        });
        getContentPane().add(SacuvatiBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 140, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalswing/images/add new patient background.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdBrojTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdBrojTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdBrojTFActionPerformed

    private void SacuvatiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacuvatiBTNActionPerformed
//        get patient data from inputs

        String patientId = IdBrojTF.getText();
        String patientName = ImeTF.getText();
        String patientContactNumber = BrojTelefonaTF.getText();
        String patientAge = StarostTF.getText();
        String patentGender = (String) PolCB.getSelectedItem();
        String patientBloodGroup = (String) KrvnaGrupaCB.getSelectedItem();
        String patientAddress = AdresaTF.getText();

// connect to db and run the save query
        try (Connection dbConnection = ConnectionDB.getConn();) {

            Statement st = dbConnection.createStatement();
            st.executeUpdate("INSERT INTO `dentaldb`.`pacijentbaza` (`idpacijentbaza`, `name`, `contactNumber`, `age`, `gender`, `bloodGroup`, `address`) VALUES ('" + patientId + "', '" + patientName + "', '" + patientContactNumber + "', '" + patientAge + "', '" + patentGender + "', '" + patientBloodGroup + "', '" + patientAddress + "');");

            dbConnection.close();

            JOptionPane.showMessageDialog(null, "Korisnik je sacuvan u bazi korisnika.");

            this.setVisible(false);
            new addNewPatient().setVisible(true);

        } catch (Exception e) {
            System.err.println("Error in saving user to db");
            System.err.println(e.getLocalizedMessage());

            JOptionPane.showMessageDialog(null, "Korisnik nije sacuvan. Razlog: " + e.getLocalizedMessage());
        }

    }//GEN-LAST:event_SacuvatiBTNActionPerformed

    private void OtkaziBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtkaziBTNActionPerformed
        setVisible(false);
    }//GEN-LAST:event_OtkaziBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdresaTF;
    private javax.swing.JTextField BrojTelefonaTF;
    private javax.swing.JTextField IdBrojTF;
    private javax.swing.JTextField ImeTF;
    private javax.swing.JComboBox<String> KrvnaGrupaCB;
    private javax.swing.JButton OtkaziBTN;
    private javax.swing.JComboBox<String> PolCB;
    private javax.swing.JButton SacuvatiBTN;
    private javax.swing.JTextField StarostTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
