package com.mizan.view;

import com.mizan.connection.DBConnection;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author mohdm
 */
public class UpdateVoter extends javax.swing.JFrame {

    /**
     * Creates new form Addvoter
     */
    String filename = null;
    byte[] voter_image = null;

    public UpdateVoter() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jFathername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jVoterid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSex = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jAge = new javax.swing.JTextField();
        jSearch = new javax.swing.JButton();
        jImage = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jVoterUpdate = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMobileNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Voter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Mobile Number");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 150, 20));

        jName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 230, 30));

        jFathername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFathername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.add(jFathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 230, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Image");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Voter id");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 100, 20));

        jVoterid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jVoterid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.add(jVoterid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 100, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Address");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 150, 20));

        jAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.add(jAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 230, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Sex");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 150, 20));

        jSex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.add(jSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 230, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Age");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 150, 20));

        jAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.add(jAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 230, 30));

        jSearch.setBackground(new java.awt.Color(204, 153, 0));
        jSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jSearch.setForeground(new java.awt.Color(0, 0, 153));
        jSearch.setText("Search");
        jSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        jSearch.setContentAreaFilled(false);
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchjSeachActionPerformed(evt);
            }
        });
        jPanel5.add(jSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 110, 30));

        jImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 190));

        jPanel7.setBackground(new java.awt.Color(72, 201, 176));
        jPanel7.setLayout(null);

        jVoterUpdate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jVoterUpdate.setForeground(new java.awt.Color(0, 255, 0));
        jVoterUpdate.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\save.png")); // NOI18N
        jVoterUpdate.setBorder(null);
        jVoterUpdate.setContentAreaFilled(false);
        jVoterUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVoterUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoterUpdateActionPerformed(evt);
            }
        });
        jPanel7.add(jVoterUpdate);
        jVoterUpdate.setBounds(297, 12, 60, 43);

        jClear.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jClear.setForeground(new java.awt.Color(0, 255, 0));
        jClear.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\clear1.png")); // NOI18N
        jClear.setBorder(null);
        jClear.setContentAreaFilled(false);
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        jPanel7.add(jClear);
        jClear.setBounds(480, 0, 50, 60);

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(100, 0, 80, 70);

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 510, 600, 80));

        jPanel2.setBackground(new java.awt.Color(72, 201, 176));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\ic_fingerprint_white_24dp.png")); // NOI18N

        jBack.setBackground(new java.awt.Color(255, 255, 255));
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\back.png")); // NOI18N
        jBack.setBorder(null);
        jBack.setContentAreaFilled(false);
        jBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Voter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(71, 81, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 270, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Father Name");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 150, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Name");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 150, 20));

        jMobileNumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel5.add(jMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 230, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(570, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    static Connection connect = DBConnection.getConnection();
    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jVoterUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoterUpdateActionPerformed

        try {
//            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");
//            String sql = "update addvoter set name=? ,fathername=? ,address=? ,sex=? ,age=? , voter_image=? where voterid=?";
            String sql = "update addvoter set mobile_number='" + jMobileNumber.getText() + "',name='" + jName.getText() + "',fathername='" + jFathername.getText() + "',address='" + jAddress.getText() + "',sex='" + jSex.getText() + "',age='" + jAge.getText() + "' where voterid='" + jVoterid.getText() + "'";
            PreparedStatement ps = connect.prepareStatement(sql);

            ps.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
            new Home().setVisible(true);
            dispose();

        } catch (SQLException ex) {
            Logger.getLogger(UpdateVoter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jVoterUpdateActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        jVoterid.setText(null);
        jName.setText(null);
        jFathername.setText(null);
        jAddress.setText(null);
        jSex.setText(null);
        jAge.setText(null);
        jImage.setIcon(null);

    }//GEN-LAST:event_jClearActionPerformed

    private void jSearchjSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchjSeachActionPerformed

        try {
            String str = jVoterid.getText();
//            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");
            PreparedStatement ps = connect.prepareStatement("select * from addvoter where voterid=?");
            ps.setString(1, str);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String ss = rs.getString(2);
                jMobileNumber.setText(ss);
                String s = rs.getString(3);
                jName.setText(s);
                String s1 = rs.getString(4);
                jFathername.setText(s1);
                String s2 = rs.getString(5);
                jAddress.setText(s2);
                String s3 = rs.getString(6);
                jSex.setText(s3);
                String s4 = rs.getString(7);
                jAge.setText(s4);
                byte[] s5 = rs.getBytes(8);

                ImageIcon imageicon = new ImageIcon(new ImageIcon(s5).getImage().getScaledInstance(jImage.getWidth(), jImage.getHeight(), Image.SCALE_SMOOTH));
                jImage.setIcon(imageicon);

            } else {
                JOptionPane.showMessageDialog(null, " Voter Id not found");
            }

        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_jSearchjSeachActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        int p = JOptionPane.showConfirmDialog(null, "Are you sure change picture", "WORNING", JOptionPane.YES_NO_OPTION);
//        if (p == 0) {
//            JFileChooser chooser = new JFileChooser();
//            chooser.showOpenDialog(null);
//            File f = chooser.getSelectedFile();
//            filename = f.getAbsolutePath();
//            ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jImage.getWidth(), jImage.getHeight(), Image.SCALE_SMOOTH));
//            jImage.setIcon(imageIcon);
//            try {
//                File voterimage = new File(filename);
//                FileInputStream fis = new FileInputStream(voterimage);
//                ByteArrayOutputStream bos = new ByteArrayOutputStream();
//                byte[] buff = new byte[1024];
//                for (int readNum; (readNum = fis.read(buff)) != -1;) {
//                    bos.write(buff, 0, readNum);
//                }
//                voter_image = bos.toByteArray();
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateVoter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateVoter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateVoter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateVoter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpdateVoter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jAge;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jClear;
    private javax.swing.JTextField jFathername;
    private javax.swing.JLabel jImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMobileNumber;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jSearch;
    private javax.swing.JTextField jSex;
    private javax.swing.JButton jVoterUpdate;
    private javax.swing.JTextField jVoterid;
    // End of variables declaration//GEN-END:variables
}