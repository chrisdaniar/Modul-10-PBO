/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chrisdaniar
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel1 = new javax.swing.JLabel();
        tfPass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        bSignin = new javax.swing.JButton();
        bSignup = new javax.swing.JButton();
        bExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 100, 80, 30);
        jPanel1.add(tfPass);
        tfPass.setBounds(100, 130, 200, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 30, 80, 30);
        jPanel1.add(tfUser);
        tfUser.setBounds(100, 60, 200, 40);

        bSignin.setBackground(new java.awt.Color(255, 51, 51));
        bSignin.setForeground(new java.awt.Color(255, 255, 255));
        bSignin.setText("Sign In");
        bSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSigninActionPerformed(evt);
            }
        });
        jPanel1.add(bSignin);
        bSignin.setBounds(250, 200, 90, 30);

        bSignup.setBackground(new java.awt.Color(255, 51, 51));
        bSignup.setForeground(new java.awt.Color(255, 255, 255));
        bSignup.setText("Sign Up");
        bSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignupActionPerformed(evt);
            }
        });
        jPanel1.add(bSignup);
        bSignup.setBounds(50, 200, 90, 30);

        bExit.setBackground(new java.awt.Color(255, 51, 51));
        bExit.setForeground(new java.awt.Color(255, 255, 255));
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        jPanel1.add(bExit);
        bExit.setBounds(150, 200, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void bSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignupActionPerformed
     String username = tfUser.getText();
     String password = tfPass.getText();
     
     try {
         try (Statement statement = (Statement) file_koneksi.GetConnection().createStatement()) {
             statement.executeUpdate("insert into tb_akun(username, password) VALUES ('"+username+"','"+password+"');");
         }
         JOptionPane.showMessageDialog(null, "Selamat! Anda Berhasil Sign Up!");
     } catch (Exception t){
         JOptionPane.showMessageDialog(null,"Mohon Maaf, Ulangi Lagi Prosedur");
     }
    }//GEN-LAST:event_bSignupActionPerformed

    private void bSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSigninActionPerformed
        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_testkoneksi?zeroDateTimeBehavior=convertToNull",
                    "root","");
            ps = connection.prepareStatement("SELECT * FROM `tb_akun` WHERE `username` = ? AND `password` = ? ");
            ps.setString(1, tfUser.getText());
            ps.setString(2, tfPass.getText());
            ResultSet result = ps.executeQuery();
            if(result.next()){
                new frmMain().show();
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Salah!");
                tfUser.setText("");
                tfPass.requestFocus();
            }
        } catch(SQLException ex){
            
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }//GEN-LAST:event_bSigninActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
    System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_bExitActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExit;
    private javax.swing.JButton bSignin;
    private javax.swing.JButton bSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

}
