/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package register;

import config.dbConnector;
import dashBoard.loginPage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class registerPage extends javax.swing.JFrame {

    /**
     * Creates new form registerPage
     */
    public registerPage() {
        initComponents();
    }
    

    private boolean validateFields() {
        // 1. Check if required fields are empty
        if (firsttxf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Name cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (lastNtxf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last Name cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (emailtxf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (phonetxf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (usernametxf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (passField.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // 2. Password should have at least 8 characters
        if (new String(passField.getPassword()).length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must have at least 8 characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // 3. Check if contact number contains only numbers
        if (!isNumeric(phonetxf.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Contact number must contain only numbers.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // 4. Check if email and username are duplicates
        if (isDuplicateEmail(emailtxf.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Email already exists. Please use a different email.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (isDuplicateUsername(usernametxf.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Username already exists. Please choose a different username.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // If all validations pass
        return true;
    }

    // Method to check if a string contains only numbers
    private boolean isNumeric(String str) {
        return Pattern.matches("\\d+", str); // Regex to match only digits
    }
    
    private boolean isDuplicateEmail(String email) {
        dbConnector dbc = new dbConnector();
        String query = "SELECT * FROM client_tbl WHERE client_Email = ?";
        try (Connection conn = dbc.getConnection();
            PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            return rs.next(); // Returns true if a duplicate email is found
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error while checking email.", "Error", JOptionPane.ERROR_MESSAGE);
            return true; // Assume duplicate to prevent further issues
        }
    }
    
    private boolean isDuplicateUsername(String username) {
        dbConnector dbc = new dbConnector();
        String query = "SELECT * FROM client_tbl WHERE client_user = ?";
        try (Connection conn = dbc.getConnection();
            PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            return rs.next(); // Returns true if a duplicate username is found
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error while checking username.", "Error", JOptionPane.ERROR_MESSAGE);
            return true; // Assume duplicate to prevent further issues
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
        registerPane = new javax.swing.JPanel();
        loginLbl = new javax.swing.JLabel();
        addressPane = new javax.swing.JPanel();
        addresstxf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submitPane = new javax.swing.JPanel();
        forgotLbl = new javax.swing.JLabel();
        submitbtn = new javax.swing.JButton();
        phonePane = new javax.swing.JPanel();
        phonetxf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstNPane = new javax.swing.JPanel();
        firsttxf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailPane = new javax.swing.JPanel();
        emailtxf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastNPane = new javax.swing.JPanel();
        lastNtxf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userPane = new javax.swing.JPanel();
        usernametxf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passPane = new javax.swing.JPanel();
        passLbl = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

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

        header.add(loginPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 33));

        joinPane.setBackground(new java.awt.Color(25, 25, 25));
        joinPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        joinLbl.setBackground(new java.awt.Color(25, 25, 25));
        joinLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        joinLbl.setForeground(new java.awt.Color(229, 4, 124));
        joinLbl.setText("JOIN NOW");
        joinPane.add(joinLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        header.add(joinPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, 40));

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

        header.add(explorePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 110, 33));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        login.setBackground(new java.awt.Color(25, 25, 25));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerPane.setBackground(new java.awt.Color(25, 25, 25));
        registerPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLbl.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl.setText("Register");
        registerPane.add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 60));

        login.add(registerPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        addressPane.setBackground(new java.awt.Color(25, 25, 25));
        addressPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addresstxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxfActionPerformed(evt);
            }
        });
        addressPane.add(addresstxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address");
        addressPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        login.add(addressPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 320, 70));

        submitPane.setBackground(new java.awt.Color(25, 25, 25));
        submitPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotLbl.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        forgotLbl.setForeground(new java.awt.Color(255, 255, 255));
        forgotLbl.setText("Placeholder");
        submitPane.add(forgotLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        submitbtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        submitbtn.setText("Next");
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
        });
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        submitPane.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 80, 40));

        login.add(submitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 320, 70));

        phonePane.setBackground(new java.awt.Color(25, 25, 25));
        phonePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        phonetxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxfActionPerformed(evt);
            }
        });
        phonePane.add(phonetxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");
        phonePane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        login.add(phonePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 320, 70));

        firstNPane.setBackground(new java.awt.Color(25, 25, 25));
        firstNPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firsttxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firsttxfActionPerformed(evt);
            }
        });
        firstNPane.add(firsttxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        firstNPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        login.add(firstNPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 320, 70));

        emailPane.setBackground(new java.awt.Color(25, 25, 25));
        emailPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailtxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxfActionPerformed(evt);
            }
        });
        emailPane.add(emailtxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        emailPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        login.add(emailPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 320, 70));

        lastNPane.setBackground(new java.awt.Color(25, 25, 25));
        lastNPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastNtxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNtxfActionPerformed(evt);
            }
        });
        lastNPane.add(lastNtxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        lastNPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        login.add(lastNPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, 70));

        userPane.setBackground(new java.awt.Color(25, 25, 25));
        userPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernametxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxfActionPerformed(evt);
            }
        });
        userPane.add(usernametxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        userPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        login.add(userPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 320, 70));

        passPane.setBackground(new java.awt.Color(25, 25, 25));
        passPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passLbl.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        passLbl.setForeground(new java.awt.Color(255, 255, 255));
        passLbl.setText("Password");
        passPane.add(passLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passPane.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 40));

        login.add(passPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 320, 70));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1020, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
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

    private void addresstxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxfActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitbtnActionPerformed

    private void phonetxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxfActionPerformed

    private void firsttxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firsttxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firsttxfActionPerformed

    private void emailtxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxfActionPerformed

    private void lastNtxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNtxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNtxfActionPerformed

    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
        // Validate fields before proceeding
        if (validateFields()) {
            dbConnector dbc = new dbConnector();

        // Use a prepared statement to avoid SQL injection
        String query = "INSERT INTO client_tbl (client_Fname, client_Lname, client_Address, client_Email, client_Phone, client_user, client_pass, client_status) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = dbc.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {

            // Set values for the prepared statement
            pst.setString(1, firsttxf.getText());       // client_Fname
            pst.setString(2, lastNtxf.getText());       // client_Lname
            pst.setString(3, addresstxf.getText());     // client_Address
            pst.setString(4, emailtxf.getText());       // client_Email
            pst.setString(5, phonetxf.getText());       // client_Phone
            pst.setString(6, usernametxf.getText());    // client_user
            pst.setString(7, new String(passField.getPassword())); // client_pass
            pst.setString(8, "PENDING");                // client_status

            // Execute the query
            int rowsInserted = pst.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                    loginPage lgp = new loginPage();
                    lgp.setVisible(true);
                    this.dispose(); // Close the current window
                } else {
                    JOptionPane.showMessageDialog(null, "Insertion Failed!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_submitbtnMouseClicked

    private void usernametxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxfActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed
    
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
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addressPane;
    private javax.swing.JTextField addresstxf;
    private javax.swing.JPanel emailPane;
    private javax.swing.JTextField emailtxf;
    private javax.swing.JLabel exploreLbl1;
    private javax.swing.JPanel explorePane;
    private javax.swing.JPanel firstNPane;
    private javax.swing.JTextField firsttxf;
    private javax.swing.JLabel forgotLbl;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joinLbl;
    private javax.swing.JPanel joinPane;
    private javax.swing.JPanel lastNPane;
    private javax.swing.JTextField lastNtxf;
    private javax.swing.JPanel login;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel loginLbl1;
    private javax.swing.JPanel loginPane1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPanel passPane;
    private javax.swing.JPanel phonePane;
    private javax.swing.JTextField phonetxf;
    private javax.swing.JPanel registerPane;
    private javax.swing.JPanel submitPane;
    private javax.swing.JButton submitbtn;
    private javax.swing.JPanel userPane;
    private javax.swing.JTextField usernametxf;
    // End of variables declaration//GEN-END:variables
}
