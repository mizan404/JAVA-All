/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.view;

import com.mizan.connection.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mohdm
 */
public class Startelection extends javax.swing.JFrame {

    int votecount;

    /**
     * Creates new form Startelection
     */
    public Startelection() {
        initComponents();
        VoterInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jBNP = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jBAL = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jJP = new javax.swing.JButton();
        jJSD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBJI = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jVoterName = new javax.swing.JLabel();
        jVoterID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Voter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBNP.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jBNP.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\fig forvote .png")); // NOI18N
        jBNP.setBorderPainted(false);
        jBNP.setContentAreaFilled(false);
        jBNP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNPActionPerformed(evt);
            }
        });
        jPanel19.add(jBNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 70, 60));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\bnp2.png")); // NOI18N
        jPanel19.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 90));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("BNP");
        jPanel19.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 40, 20));

        jBAL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jBAL.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\fig forvote .png")); // NOI18N
        jBAL.setBorderPainted(false);
        jBAL.setContentAreaFilled(false);
        jBAL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBALActionPerformed(evt);
            }
        });
        jPanel19.add(jBAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 70, 60));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("AL");
        jPanel19.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 40, 20));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\bal2.png")); // NOI18N
        jPanel19.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 110, 90));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\BJP2.png")); // NOI18N
        jPanel19.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 100, 110));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("JP");
        jPanel19.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 40, 20));

        jJP.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jJP.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\fig forvote .png")); // NOI18N
        jJP.setBorderPainted(false);
        jJP.setContentAreaFilled(false);
        jJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jJP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJPActionPerformed(evt);
            }
        });
        jPanel19.add(jJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 80, 80));

        jJSD.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jJSD.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\fig forvote .png")); // NOI18N
        jJSD.setBorderPainted(false);
        jJSD.setContentAreaFilled(false);
        jJSD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jJSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJSDActionPerformed(evt);
            }
        });
        jPanel19.add(jJSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 70, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("JSD");
        jPanel19.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 40, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel19.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, 90));

        jBJI.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jBJI.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\fig forvote .png")); // NOI18N
        jBJI.setBorderPainted(false);
        jBJI.setContentAreaFilled(false);
        jBJI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBJI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJIActionPerformed(evt);
            }
        });
        jPanel19.add(jBJI, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 90, 90));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("BJI");
        jPanel19.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 40, 20));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel19.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 450, -1, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\JSD.png")); // NOI18N
        jPanel19.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 100, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\BJ.png")); // NOI18N
        jPanel19.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, 110));

        kGradientPanel1.setkEndColor(new java.awt.Color(72, 201, 176));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(155, 89, 182));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\ic_fingerprint_white_24dp.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Start Election");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NAME");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VOTE ID");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jVoterName.setBackground(new java.awt.Color(255, 255, 255));
        jVoterName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jVoterName.setForeground(new java.awt.Color(255, 255, 255));
        jVoterName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jVoterID.setBackground(new java.awt.Color(255, 255, 255));
        jVoterID.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jVoterID.setForeground(new java.awt.Color(255, 255, 255));
        jVoterID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVoterName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVoterID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jVoterName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jVoterID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jPanel19.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 590));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 580));

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(570, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
static Connection connect = DBConnection.getConnection();
    private void jBJIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJIActionPerformed

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");

            //         System.out.println("Opened database successfully");
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count FROM result where id=5;");
            while (rs.next()) {
                votecount = rs.getInt("count");
                votecount = votecount + 1;
                //            System.out.println( "total = " +votecount );
            }
            int ps = stmt.executeUpdate("update result set count='" + votecount + "'where id=5;");
            JOptionPane.showMessageDialog(null, "you are voted to BJI");
            adminlogin h = new adminlogin();
            h.setVisible(true);
            dispose();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBJIActionPerformed

    private void jJSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJSDActionPerformed

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");

            //         System.out.println("Opened database successfully");
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count FROM result where id=4;");
            while (rs.next()) {
                votecount = rs.getInt("count");
                votecount = votecount + 1;
                //            System.out.println( "total = " +votecount );
            }
            int ps = stmt.executeUpdate("update result set count='" + votecount + "'where id=4;");
            JOptionPane.showMessageDialog(null, "you are voted to JSD");
            adminlogin h = new adminlogin();
            h.setVisible(true);
            dispose();

        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jJSDActionPerformed

    private void jJPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJPActionPerformed

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");

            //         System.out.println("Opened database successfully");
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count FROM result where id=3;");
            while (rs.next()) {
                votecount = rs.getInt("count");
                votecount = votecount + 1;
                //            System.out.println( "total = " +votecount );
            }
            int ps = stmt.executeUpdate("update result set count='" + votecount + "'where id=3;");
            JOptionPane.showMessageDialog(null, "you are voted to JP");
            adminlogin h = new adminlogin();
            h.setVisible(true);
            dispose();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jJPActionPerformed

    private void jBALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBALActionPerformed

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");

            //         System.out.println("Opened database successfully");
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count FROM result where id=2;");
            while (rs.next()) {
                votecount = rs.getInt("count");
                votecount = votecount + 1;
                //            System.out.println( "total = " +votecount );
            }
            int ps = stmt.executeUpdate("update result set count='" + votecount + "' where id=2;");
            JOptionPane.showMessageDialog(null, "you are voted to AL");
            adminlogin h = new adminlogin();
            h.setVisible(true);
            dispose();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }
    }//GEN-LAST:event_jBALActionPerformed

    private void jBNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNPActionPerformed

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");

            //         System.out.println("Opened database successfully");
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count FROM result where id=1;");
            while (rs.next()) {
                votecount = rs.getInt("count");
                votecount = votecount + 1;
                //            System.out.println( "total = " +votecount );
            }
            int ps = stmt.executeUpdate("update result set count='" + votecount + "'where id=1;");
            JOptionPane.showMessageDialog(null, "you are voted to BNP");
            adminlogin h = new adminlogin();
            h.setVisible(true);
            dispose();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }
        //      System.out.println("Operation done successfully");

    }//GEN-LAST:event_jBNPActionPerformed

    public void VoterInfo() {

    }

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
            java.util.logging.Logger.getLogger(Startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAL;
    private javax.swing.JButton jBJI;
    private javax.swing.JButton jBNP;
    private javax.swing.JButton jJP;
    private javax.swing.JButton jJSD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jVoterID;
    private javax.swing.JLabel jVoterName;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
