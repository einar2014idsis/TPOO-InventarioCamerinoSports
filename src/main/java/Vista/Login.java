package Vista;

import Control.ControlUsuarios;
import Modelado.Usuarios;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    ControlUsuarios conUs = new ControlUsuarios();
    Usuarios us = new Usuarios();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRoundRA1 = new Modelado.JpanelRoundRA();
        jpanelRoundRN1 = new Modelado.JpanelRoundRN();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JFormattedTextField();
        btnLogin = new javax.swing.JButton();
        bntSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpanelRoundRA1.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRoundRA1.setRoundBottomLeft(25);
        jpanelRoundRA1.setRoundBottomRight(25);
        jpanelRoundRA1.setRoundTopLeft(25);
        jpanelRoundRA1.setRoundTopRight(25);

        jpanelRoundRN1.setRoundBottomLeft(25);
        jpanelRoundRN1.setRoundBottomRight(25);
        jpanelRoundRN1.setRoundTopLeft(25);
        jpanelRoundRN1.setRoundTopRight(25);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(153, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        bntSalir.setBackground(new java.awt.Color(255, 51, 51));
        bntSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntSalir.setForeground(new java.awt.Color(255, 255, 255));
        bntSalir.setText("Salir");
        bntSalir.setBorderPainted(false);
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Olvido su contraseña?");

        javax.swing.GroupLayout jpanelRoundRN1Layout = new javax.swing.GroupLayout(jpanelRoundRN1);
        jpanelRoundRN1.setLayout(jpanelRoundRN1Layout);
        jpanelRoundRN1Layout.setHorizontalGroup(
            jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRoundRN1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64))
            .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                .addGroup(jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtUsuario)))
                    .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                        .addGroup(jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bntSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelRoundRN1Layout.setVerticalGroup(
            jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15))
                    .addGroup(jpanelRoundRN1Layout.createSequentialGroup()
                        .addComponent(txtUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jpanelRoundRN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(bntSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpanelRoundRA1Layout = new javax.swing.GroupLayout(jpanelRoundRA1);
        jpanelRoundRA1.setLayout(jpanelRoundRA1Layout);
        jpanelRoundRA1Layout.setHorizontalGroup(
            jpanelRoundRA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRoundRA1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jpanelRoundRN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jpanelRoundRA1Layout.setVerticalGroup(
            jpanelRoundRA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRoundRA1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jpanelRoundRN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRoundRA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRoundRA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        if (usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de usuario o contraseña no debe estar vacío");
            return;
        }
        us = conUs.login(usuario, contraseña);
        if (us != null && us.getUsuario() != null && us.getContraseña() != null) {
            JOptionPane.showMessageDialog(null, "Bienvenido a !CamerinoSports!");
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "!!!USUARIO O CONTRASEÑA INCORRECTOS, VERIFIQUE LOS DATOS!!!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        btnLogin.doClick();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bntSalirActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtContraseña.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    public static void main(String args[]) {

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSalir;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private Modelado.JpanelRoundRA jpanelRoundRA1;
    private Modelado.JpanelRoundRN jpanelRoundRN1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JFormattedTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
