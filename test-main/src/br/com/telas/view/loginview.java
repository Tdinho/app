/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.telas.view;

import br.com.login.controller.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lidia
 */
public class loginview extends javax.swing.JFrame {

    /**
     * Creates new form loginview
     */
    public loginview() {
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

        JButtonVoltar = new javax.swing.JButton();
        JButtonEntrar = new javax.swing.JButton();
        JButtonCadastre = new javax.swing.JButton();
        JTextFieldEmail = new javax.swing.JTextField();
        JPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonVoltar.setContentAreaFilled(false);
        JButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 20));

        JButtonEntrar.setContentAreaFilled(false);
        JButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 40));

        JButtonCadastre.setContentAreaFilled(false);
        JButtonCadastre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonCadastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCadastreActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonCadastre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 120, 40));

        JTextFieldEmail.setBackground(new java.awt.Color(254, 168, 0));
        JTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(JTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 310, 40));

        JPasswordFieldSenha.setBackground(new java.awt.Color(254, 168, 0));
        getContentPane().add(JPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 202, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ref/Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEmailActionPerformed

    private void JButtonCadastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastreActionPerformed
    cadastroview Cadastro = new cadastroview();
    Cadastro.setVisible(true);
    }//GEN-LAST:event_JButtonCadastreActionPerformed

    private void JButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonVoltarActionPerformed

    private void JButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEntrarActionPerformed
LoginController login = new LoginController();
        try {
            login.loginUsuario(this);
        } catch (SQLException ex) {
            Logger.getLogger(loginview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonEntrarActionPerformed

    public JPasswordField getJPasswordFieldSenha() {
        return JPasswordFieldSenha;
    }

    public void setJPasswordFieldSenha(JPasswordField JPasswordFieldSenha) {
        this.JPasswordFieldSenha = JPasswordFieldSenha;
    }

    public JTextField getJTextFieldEmail() {
        return JTextFieldEmail;
    }

    public void setJTextFieldEmail(JTextField JTextFieldEmail) {
        this.JTextFieldEmail = JTextFieldEmail;
    }

    
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
            java.util.logging.Logger.getLogger(loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCadastre;
    private javax.swing.JButton JButtonEntrar;
    private javax.swing.JButton JButtonVoltar;
    private javax.swing.JPasswordField JPasswordFieldSenha;
    private javax.swing.JTextField JTextFieldEmail;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}