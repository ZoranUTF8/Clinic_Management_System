/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientapp;

import DbConnection.ConnectionDB;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author zoranhome
 */
public class addPatientDiagnosis extends javax.swing.JFrame {

    /**
     * Creates new form addPatientDiagnosis
     */
    private int flag = 0;

    public addPatientDiagnosis() {
        initComponents();
        setSize(985, 543);
        setLocation(280, 150);
        

        pogresanBrojLB.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        IDbrojTF = new javax.swing.JTextField();
        pogresanBrojLB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ljekoviTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        dijagnozaTA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        napomenaTA = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        simptomiTA = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        mainTableTBL = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        sacuvajBTN = new javax.swing.JButton();
        otkaziBTN = new javax.swing.JButton();
        traziBTN = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novi pregled");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("ID BROJ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 28, 114, -1));
        getContentPane().add(IDbrojTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 26, 130, 32));

        pogresanBrojLB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        pogresanBrojLB.setForeground(new java.awt.Color(255, 51, 51));
        pogresanBrojLB.setText("Pogresan ID broj");
        getContentPane().add(pogresanBrojLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Simptomi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 115, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Dijagnoza");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 221, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Ljekovi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 331, 94, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Napomena");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 460, -1, -1));

        ljekoviTA.setColumns(20);
        ljekoviTA.setRows(5);
        jScrollPane1.setViewportView(ljekoviTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 308, -1, -1));

        dijagnozaTA.setColumns(20);
        dijagnozaTA.setRows(5);
        jScrollPane2.setViewportView(dijagnozaTA);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 188, -1, -1));

        napomenaTA.setColumns(20);
        napomenaTA.setRows(5);
        jScrollPane3.setViewportView(napomenaTA);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 429, -1, -1));

        simptomiTA.setColumns(20);
        simptomiTA.setRows(5);
        jScrollPane4.setViewportView(simptomiTA);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 64, -1, -1));

        mainTableTBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainTableTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"nil", "nil", "nil", "nil"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "name", "age", "gender", "bloodGroup"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mainTableTBL.setColumnSelectionAllowed(true);
        mainTableTBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane6.setViewportView(mainTableTBL);
        mainTableTBL.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 64, 573, 365));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Korisnik");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 41, 573, -1));

        sacuvajBTN.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        sacuvajBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalswing/images/save-icon--1.png"))); // NOI18N
        sacuvajBTN.setText("Sacuvaj");
        sacuvajBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajBTNActionPerformed(evt);
            }
        });
        getContentPane().add(sacuvajBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 465, -1, -1));

        otkaziBTN.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        otkaziBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalswing/images/Close.png"))); // NOI18N
        otkaziBTN.setText("Otkazi");
        otkaziBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otkaziBTNActionPerformed(evt);
            }
        });
        getContentPane().add(otkaziBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 465, -1, -1));

        traziBTN.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        traziBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalswing/images/search.png"))); // NOI18N
        traziBTN.setText("Trazi");
        traziBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traziBTNActionPerformed(evt);
            }
        });
        getContentPane().add(traziBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 26, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otkaziBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otkaziBTNActionPerformed
        // Otkazi btn
        setVisible(false);
    }//GEN-LAST:event_otkaziBTNActionPerformed

    private void traziBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traziBTNActionPerformed
//       Search for patient in db
        String patientId = IDbrojTF.getText();

        try (Connection dbConnection = ConnectionDB.getConn()) {

            Statement st = dbConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String query = "SELECT name, age , gender, bloodGroup FROM dentaldb.pacijentbaza WHERE idpacijentbaza=" + patientId;

//            Get patient from db
            ResultSet rs = st.executeQuery(query);

//            add rs2xml.jar to populate table
            mainTableTBL.setModel(DbUtils.resultSetToTableModel(rs));

//               Check if patient returned
            if (!rs.first()) {
                pogresanBrojLB.setVisible(true);
                IDbrojTF.setText("");

            } else {
                pogresanBrojLB.setVisible(false);
                flag = 1;
            }

        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Problem: " + e.getLocalizedMessage());

        }
    }//GEN-LAST:event_traziBTNActionPerformed

    private void sacuvajBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajBTNActionPerformed
        // Add diagnosis
        if (flag == 1) {
//            Get user input data
            String patientId = IDbrojTF.getText();
            String symptoms = simptomiTA.getText();
            String diagnosis = dijagnozaTA.getText();
            String drugs = ljekoviTA.getText();
            String remarks = napomenaTA.getText();
            
            
            if(patientId.isEmpty() || symptoms.isEmpty() || diagnosis.isEmpty() || drugs.isEmpty() || remarks.isEmpty()){
                System.err.println("Input cannot be empty");
                JOptionPane.showMessageDialog(null, "Provjerite svoj unos. Polja ne mogu da budu prazna.","Select",JOptionPane.OK_OPTION);
            }else{
                
//            Establish db connection
            try (Connection dbConnection = ConnectionDB.getConn();) {

                Statement st = dbConnection.createStatement();

                st.executeUpdate("INSERT INTO `dentaldb`.`pacijentpregled` (`idpacijentpregled`, `symptoms`, `diagnosis`, `drugs`,`remarks`) VALUES ('" + patientId + "', '" + symptoms + "', '" + diagnosis + "', '" + drugs + "', '" + remarks + "');");

                JOptionPane.showMessageDialog(null, "Pregled sacuvan.", "Select", JOptionPane.YES_OPTION);
                        

                IDbrojTF.setText("");
                simptomiTA.setText("");
                dijagnozaTA.setText("");
                ljekoviTA.setText("");
                napomenaTA.setText("");
                flag = 0;

            } catch (Exception e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Provjerite svoj unos.","Select",JOptionPane.OK_OPTION);

            }
            }


        } else {
            JOptionPane.showMessageDialog(null, "Provjerite svoj unos.", "Select", JOptionPane.OK_OPTION);

        }
    }//GEN-LAST:event_sacuvajBTNActionPerformed

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
            java.util.logging.Logger.getLogger(addPatientDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addPatientDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addPatientDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addPatientDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPatientDiagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDbrojTF;
    private javax.swing.JTextArea dijagnozaTA;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea ljekoviTA;
    private javax.swing.JTable mainTableTBL;
    private javax.swing.JTextArea napomenaTA;
    private javax.swing.JButton otkaziBTN;
    private javax.swing.JLabel pogresanBrojLB;
    private javax.swing.JButton sacuvajBTN;
    private javax.swing.JTextArea simptomiTA;
    private javax.swing.JButton traziBTN;
    // End of variables declaration//GEN-END:variables
}
