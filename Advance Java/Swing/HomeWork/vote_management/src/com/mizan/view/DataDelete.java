/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.view;

/**
 *
 * @author mohdm
 */
public class DataDelete extends javax.swing.JFrame {

    /**
     * Creates new form DataDelete
     */
    public DataDelete() {
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

        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jAdminDelete = new javax.swing.JButton();
        jVoterDelete = new javax.swing.JButton();
        jCandidateDelete = new javax.swing.JButton();
        jCountingDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 32));

        jBack.setIcon(new javax.swing.ImageIcon("G:\\IT Files\\Pratices Files\\All Swing\\vote_management\\src\\com\\mizan\\pic\\back.png")); // NOI18N
        jBack.setBorder(null);
        jBack.setContentAreaFilled(false);
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        jPanel7.add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete ");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 50));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 580));

        jAdminDelete.setBackground(new java.awt.Color(204, 0, 0));
        jAdminDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jAdminDelete.setText("Admin");
        jAdminDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jAdminDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdminDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(jAdminDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 200, 50));

        jVoterDelete.setBackground(new java.awt.Color(204, 0, 0));
        jVoterDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jVoterDelete.setText("Voter's");
        jVoterDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jVoterDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoterDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(jVoterDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 200, 50));

        jCandidateDelete.setBackground(new java.awt.Color(204, 0, 0));
        jCandidateDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCandidateDelete.setText("Candidate's");
        jCandidateDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCandidateDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCandidateDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(jCandidateDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 200, 50));

        jCountingDelete.setBackground(new java.awt.Color(204, 0, 0));
        jCountingDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCountingDelete.setText("Counting");
        jCountingDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCountingDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCountingDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(jCountingDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(571, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        new adminlogin().setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed

        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jVoterDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoterDeleteActionPerformed
        new VoterDataDelete().setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jVoterDeleteActionPerformed

    private void jCandidateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCandidateDeleteActionPerformed
        new CandidateDataDelete().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jCandidateDeleteActionPerformed

    private void jCountingDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCountingDeleteActionPerformed
        new CountingDataDelete().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jCountingDeleteActionPerformed

    private void jAdminDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdminDeleteActionPerformed
        new AdminDataDelete().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jAdminDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DataDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdminDelete;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jCandidateDelete;
    private javax.swing.JButton jCountingDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jVoterDelete;
    // End of variables declaration//GEN-END:variables
}
