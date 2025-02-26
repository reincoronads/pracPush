/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashBoard;

import register.registerPage;
import admin.adminDashboard;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userDashboard;

/**
 *
 * @author user
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
    }
    
    static String status;
    static String type;
    
    public static boolean loginAcc(String username, String password) {
    dbConnector connector = new dbConnector();
    try {
        String query = "SELECT * FROM client_tbl WHERE client_user = ? AND client_pass = ?";
        java.sql.PreparedStatement pst = connector.connect.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet resultSet = pst.executeQuery();
        if(resultSet.next()){
            status = resultSet.getString("client_status");
            type = resultSet.getString("client_type");
            return true;
        }
        else{
            return false;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
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
        header = new javax.swing.JPanel();
        loginPane1 = new javax.swing.JPanel();
        loginLbl1 = new javax.swing.JLabel();
        joinPane = new javax.swing.JPanel();
        joinLbl = new javax.swing.JLabel();
        explorePane = new javax.swing.JPanel();
        exploreLbl1 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        loginPane = new javax.swing.JPanel();
        loginLbl = new javax.swing.JLabel();
        passPane = new javax.swing.JPanel();
        passLbl = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        emailPane = new javax.swing.JPanel();
        emailtxtf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rememberPane = new javax.swing.JPanel();
        forgotLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(27, 27, 27));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPane1.setBackground(new java.awt.Color(27, 27, 27));
        loginPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLbl1.setBackground(new java.awt.Color(27, 27, 27));
        loginLbl1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginLbl1.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl1.setText("Login");
        loginLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginLbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginLbl1MouseExited(evt);
            }
        });
        loginPane1.add(loginLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        header.add(loginPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, 33));

        joinPane.setBackground(new java.awt.Color(25, 25, 25));
        joinPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        joinLbl.setBackground(new java.awt.Color(25, 25, 25));
        joinLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        joinLbl.setForeground(new java.awt.Color(229, 4, 124));
        joinLbl.setText("JOIN NOW");
        joinLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinLblMouseClicked(evt);
            }
        });
        joinPane.add(joinLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        header.add(joinPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 110, 40));

        explorePane.setBackground(new java.awt.Color(27, 27, 27));
        explorePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exploreLbl1.setBackground(new java.awt.Color(27, 27, 27));
        exploreLbl1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        exploreLbl1.setForeground(new java.awt.Color(255, 255, 255));
        exploreLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exploreLbl1.setText("Explore");
        exploreLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exploreLbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exploreLbl1MouseExited(evt);
            }
        });
        explorePane.add(exploreLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        header.add(explorePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 110, 33));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 60));

        login.setBackground(new java.awt.Color(25, 25, 25));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPane.setBackground(new java.awt.Color(25, 25, 25));
        loginPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLbl.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl.setText("LOGIN");
        loginPane.add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 60));

        login.add(loginPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        passPane.setBackground(new java.awt.Color(25, 25, 25));
        passPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passLbl.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        passLbl.setForeground(new java.awt.Color(255, 255, 255));
        passLbl.setText("Password");
        passPane.add(passLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passPane.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        login.add(passPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 320, 70));

        emailPane.setBackground(new java.awt.Color(25, 25, 25));
        emailPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailtxtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtf1ActionPerformed(evt);
            }
        });
        emailPane.add(emailtxtf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User");
        emailPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, -1));

        login.add(emailPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 320, 70));

        rememberPane.setBackground(new java.awt.Color(25, 25, 25));
        rememberPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotLbl.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        forgotLbl.setForeground(new java.awt.Color(255, 255, 255));
        forgotLbl.setText("forgot your password?");
        rememberPane.add(forgotLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        rememberPane.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        login.add(rememberPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 320, 70));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 460, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginLbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLbl1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginLbl1MouseEntered

    private void loginLbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLbl1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginLbl1MouseExited

    private void exploreLbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreLbl1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exploreLbl1MouseEntered

    private void exploreLbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreLbl1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exploreLbl1MouseExited

    private void emailtxtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtf1ActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if(loginAcc(emailtxtf1.getText(), passField.getText())){
            if(!status.equals("Active")){
            JOptionPane.showMessageDialog(null, "In-Active Account, Contact the Admin!");
            }
            else{
                if(type.equals("Admin")){
                    JOptionPane.showMessageDialog(null, "Login Sucess!");
                    adminDashboard ads = new adminDashboard();
                    ads.setVisible(true);
                    this.dispose();
                }
                else if(type.equals("User")){
                    JOptionPane.showMessageDialog(null, "Login Sucess!");
                    userDashboard uds = new userDashboard();
                    uds.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Account Type, Contact the Admin!");
                }
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "Login Failed!");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void joinLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinLblMouseClicked
        // TODO add your handling code here:
           this.dispose();

           // Open the new JFrame
           new registerPage().setVisible(true);
    }//GEN-LAST:event_joinLblMouseClicked

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel emailPane;
    private javax.swing.JTextField emailtxtf1;
    private javax.swing.JLabel exploreLbl1;
    private javax.swing.JPanel explorePane;
    private javax.swing.JLabel forgotLbl;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joinLbl;
    private javax.swing.JPanel joinPane;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel loginLbl1;
    private javax.swing.JPanel loginPane;
    private javax.swing.JPanel loginPane1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPanel passPane;
    private javax.swing.JPanel rememberPane;
    // End of variables declaration//GEN-END:variables
}
