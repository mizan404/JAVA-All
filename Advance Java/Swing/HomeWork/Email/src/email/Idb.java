/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidenceidb;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zaman
 */
public class Idb extends javax.swing.JFrame {

    /**
     * Creates new form Idb
     */
    public Idb() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jRadioM = new javax.swing.JRadioButton();
        jRadioF = new javax.swing.JRadioButton();
        jChkRead = new javax.swing.JCheckBox();
        jChkSleep = new javax.swing.JCheckBox();
        jChkCode = new javax.swing.JCheckBox();
        jCombo = new javax.swing.JComboBox();
        jButtonClr = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButtoClrTab = new javax.swing.JButton();
        jButtonReTable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("Information ");

        jLabel2.setText("Name");

        jLabel3.setText("Email");

        jLabel4.setText("Gender");

        jLabel5.setText("Hobby");

        jLabel6.setText("Round");

        buttonGroup1.add(jRadioM);
        jRadioM.setText("male");

        buttonGroup1.add(jRadioF);
        jRadioF.setText("female");

        jChkRead.setText("Reding");

        jChkSleep.setText("Sleeping");

        jChkCode.setText("Coding");

        jCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<---Select Item---->", "41", "42", "43", "44" }));

        jButtonClr.setText("clear");
        jButtonClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClrActionPerformed(evt);
            }
        });

        jButtonSub.setText("submit");
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });

        jButtoClrTab.setText("clearTable");
        jButtoClrTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoClrTabActionPerformed(evt);
            }
        });

        jButtonReTable.setBackground(new java.awt.Color(0, 0, 153));
        jButtonReTable.setForeground(new java.awt.Color(0, 51, 255));
        jButtonReTable.setText("Read Table");
        jButtonReTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)
                                .addComponent(jChkRead)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jChkSleep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jChkCode))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonReTable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonClr)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonSub)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtoClrTab))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioF))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jName)
                                        .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioM)
                    .addComponent(jRadioF))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jChkRead)
                    .addComponent(jChkSleep)
                    .addComponent(jChkCode))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClr)
                    .addComponent(jButtonSub)
                    .addComponent(jButtoClrTab))
                .addGap(28, 28, 28)
                .addComponent(jButtonReTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Name", "Email", "Gender", "Hobby", "Round"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClrActionPerformed
       clear();
    }//GEN-LAST:event_jButtonClrActionPerformed
public void clear(){
    jName.setText(null);
    jEmail.setText(null);
    buttonGroup1.clearSelection();
    jChkRead.setSelected(false);
    jChkSleep.setSelected(false);
    jChkCode.setSelected(false);
    jCombo.setSelectedIndex(0);        
            
}
     static int serial=0;
    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
       String name=jName.getText().trim();
       String email=jEmail.getText().trim();
       String gender=null;
       
       
       if(jRadioM.isSelected()){
           gender=jRadioM.getText().trim();
       }
       if(jRadioF.isSelected()){
           gender=jRadioF.getText().trim();
           
       }
       
       StringBuilder hobby=new StringBuilder();
       
       if(jChkRead.isSelected()){
           hobby.append(jChkRead.getText().trim());
       }
       if(jChkSleep.isSelected()){
            hobby.append(jChkRead.getText().trim());
       }
       
       if(jChkCode.isSelected()){
            hobby.append(jChkRead.getText().trim());
       }
       String round=jCombo.getSelectedItem().toString();
       String hoby=hobby.toString();
       
       if(name.isEmpty()){
           JOptionPane.showMessageDialog(rootPane,"Name must be filedOut","Warning",0);
       }else if(name.length()<3){
           JOptionPane.showMessageDialog(rootPane,"Name must be more than 3 characer","Warning",0);
       }else if(email.isEmpty()){
           JOptionPane.showMessageDialog(rootPane,"Enter email","Warning",0);
       }else if(!validEmail(email)){
           JOptionPane.showMessageDialog(rootPane,"Enter valid mail","Warning",0);
       }else if(gender==null){
           JOptionPane.showMessageDialog(rootPane,"Enter your gender","Warning",0);
       }else if(hoby.isEmpty()){
           JOptionPane.showMessageDialog(rootPane,"Enter hobby","Warning",0);
       }else if(round.equalsIgnoreCase("Select Item")){
            JOptionPane.showMessageDialog(rootPane,"Select your round","Warning",0);
       }else{
           Student student=new Student(serial++,name,email,gender,hoby,round);
           
           DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
           Object row[]=new Object[6];
           row[0]=student.getSerial();
           row[1]=student.getName();
           row[2]=student.getEmail();
           row[3]=student.getGender();
           row[4]=student.getHobby();
           row[5]=student.getRound();
           
           model.addRow(row);
           
           Utils.writeTofile("Sunbb",student);
           
           clear();
       }
       
       
    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jButtoClrTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoClrTabActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
    }//GEN-LAST:event_jButtoClrTabActionPerformed

    
    
    
    
    private void jButtonReTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReTableActionPerformed
         DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
         Utils.displayStudentModelDataFromFile("Sunbb", m);
    }//GEN-LAST:event_jButtonReTableActionPerformed

    
    public boolean validEmail(String email) {
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        boolean status = false;
        if (atpos > 0 && dotpos < email.length() - 1 && atpos < dotpos - 1) {
            status = true;
        }
        return status;
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
            java.util.logging.Logger.getLogger(Idb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Idb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Idb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Idb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Idb().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtoClrTab;
    private javax.swing.JButton jButtonClr;
    private javax.swing.JButton jButtonReTable;
    private javax.swing.JButton jButtonSub;
    private javax.swing.JCheckBox jChkCode;
    private javax.swing.JCheckBox jChkRead;
    private javax.swing.JCheckBox jChkSleep;
    private javax.swing.JComboBox jCombo;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioF;
    private javax.swing.JRadioButton jRadioM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   
}
