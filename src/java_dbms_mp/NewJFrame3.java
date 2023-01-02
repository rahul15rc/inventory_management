/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_dbms_mp;

import javax.swing.JOptionPane;

/**
 *
 * @author rahul
 */
public class NewJFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame3
     */
    public NewJFrame3() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        viewstock = new javax.swing.JLabel();
        editstock = new javax.swing.JLabel();
        addstock = new javax.swing.JLabel();
        deletestock = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        viewUsers = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel2.setText("Welcome Admin!!");

        viewstock.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        viewstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/view.png"))); // NOI18N
        viewstock.setText("View Stock");
        viewstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewstockMouseClicked(evt);
            }
        });

        editstock.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        editstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/edit.png"))); // NOI18N
        editstock.setText("Edit Stock");
        editstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editstockMouseClicked(evt);
            }
        });

        addstock.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        addstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/add.png"))); // NOI18N
        addstock.setText("Add Stock");
        addstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addstockMouseClicked(evt);
            }
        });

        deletestock.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        deletestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/delete.png"))); // NOI18N
        deletestock.setText("Delete Stock");
        deletestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletestockMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/logout.png"))); // NOI18N
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        viewUsers.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        viewUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/viewUsers.png"))); // NOI18N
        viewUsers.setLabelFor(viewUsers);
        viewUsers.setText("View Users");
        viewUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewUsersMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/addUser.png"))); // NOI18N
        jLabel3.setText("Add User");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_dbms_mp/deleteUser.png"))); // NOI18N
        jLabel4.setText("Remove User");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Inventory Management Tool");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)))
                        .addGap(142, 142, 142)
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewstock, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editstock, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addstock, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(deletestock))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(viewUsers)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewstock)
                    .addComponent(editstock)
                    .addComponent(addstock)
                    .addComponent(deletestock))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewUsers)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(266, 266, 266))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewstockMouseClicked
        // TODO add your handling code here:
        NewJFrame4 j = new NewJFrame4();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_viewstockMouseClicked

    private void editstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editstockMouseClicked
        // TODO add your handling code here:
        NewJFrame5 j = new NewJFrame5();
                    j.setVisible(true);
                    j.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_editstockMouseClicked

    private void addstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstockMouseClicked
        // TODO add your handling code here:
        NewJFrame6 j = new NewJFrame6();
                    j.setVisible(true);
                    j.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_addstockMouseClicked

    private void deletestockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletestockMouseClicked
        // TODO add your handling code here:
        NewJFrame7 j = new NewJFrame7();
                    j.setVisible(true);
                    j.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_deletestockMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        NewJFrame2 j = new NewJFrame2();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        this.dispose();
        JOptionPane.showMessageDialog(this, "Logged out successfully!");
    }//GEN-LAST:event_logoutMouseClicked

    private void viewUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewUsersMouseClicked
        // TODO add your handling code here:
        NewJFrame8 j = new NewJFrame8();
                    j.setVisible(true);
                    j.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_viewUsersMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        NewJFrame9 j = new NewJFrame9();
                    j.setVisible(true);
                    j.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        NewJFrame10 j = new NewJFrame10();
                    j.setVisible(true);
                    j.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addstock;
    private javax.swing.JLabel deletestock;
    private javax.swing.JLabel editstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel viewUsers;
    private javax.swing.JLabel viewstock;
    // End of variables declaration//GEN-END:variables
}
