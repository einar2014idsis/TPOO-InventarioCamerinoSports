package Vista;

import Notificaciones.Notification;
import java.awt.BorderLayout;
import java.awt.Color;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));

        Home h = new Home();
        h.setSize(978, 600);
        h.setLocation(0, 0);

        inventario.removeAll();
        inventario.add(h, BorderLayout.CENTER);
        inventario.revalidate();
        inventario.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new Modelado.JpanelRound();
        jpanelRound2 = new Modelado.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        btnVenta = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnIngresos = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnUsuarios = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnProveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnHome = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnCerrarSesion = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnInformacion = new RSMaterialComponent.RSButtonMaterialIconDos();
        jSeparator1 = new javax.swing.JSeparator();
        btnCategorias = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnClientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        inventario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpanelRound1.setBackground(new java.awt.Color(102, 102, 102));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jpanelRound2.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU PRINCIPAL");

        btnVenta.setBackground(new java.awt.Color(36, 47, 58));
        btnVenta.setText("Venta");
        btnVenta.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnVenta.setBorderPainted(false);
        btnVenta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOPPING_CART);
        btnVenta.setInheritsPopupMenu(true);
        btnVenta.setRound(20);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnIngresos.setBackground(new java.awt.Color(36, 47, 58));
        btnIngresos.setText("Ingresos");
        btnIngresos.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnIngresos.setBorderPainted(false);
        btnIngresos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SYSTEM_UPDATE_ALT);
        btnIngresos.setRound(20);
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(36, 47, 58));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        btnUsuarios.setRound(20);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(36, 47, 58));
        btnProveedor.setText("Proveedor");
        btnProveedor.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnProveedor.setBorderPainted(false);
        btnProveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARCHIVE);
        btnProveedor.setRound(20);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(36, 47, 58));
        btnHome.setText("Home");
        btnHome.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnHome.setBorderPainted(false);
        btnHome.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btnHome.setRound(20);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(36, 47, 58));
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnCerrarSesion.setRound(20);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnInformacion.setBackground(new java.awt.Color(36, 47, 58));
        btnInformacion.setText("Información");
        btnInformacion.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnInformacion.setBorderPainted(false);
        btnInformacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO);
        btnInformacion.setRound(20);
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        btnCategorias.setBackground(new java.awt.Color(36, 47, 58));
        btnCategorias.setText("Categorias");
        btnCategorias.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnCategorias.setBorderPainted(false);
        btnCategorias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VIEW_LIST);
        btnCategorias.setRound(20);
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(36, 47, 58));
        btnClientes.setText("Clientes");
        btnClientes.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnClientes.setBorderPainted(false);
        btnClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        btnClientes.setRound(20);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInformacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIngresos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        inventario.setBackground(new java.awt.Color(204, 204, 204));
        inventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout inventarioLayout = new javax.swing.GroupLayout(inventario);
        inventario.setLayout(inventarioLayout);
        inventarioLayout.setHorizontalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );
        inventarioLayout.setVerticalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        btnHome.setSelected(true);
        btnClientes.setSelected(false);
        Home h = new Home();
        h.setSize(978, 600);
        h.setLocation(0, 0);
        inventario.removeAll();
        inventario.add(h, BorderLayout.CENTER);
        inventario.revalidate();
        inventario.repaint();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        btnClientes.setSelected(true);
        btnHome.setSelected(false);
        VClientes cli = new VClientes();
        cli.setSize(978, 600);
        cli.setLocation(0, 0);
        inventario.removeAll();
        inventario.add(cli, BorderLayout.CENTER);
        inventario.revalidate();
        inventario.repaint();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
        btnIngresos.setSelected(true);
        btnHome.setSelected(false);
        VIngresos ing = new VIngresos();
        ing.setSize(978, 600);
        ing.setLocation(0, 0);
        inventario.removeAll();
        inventario.add(ing, BorderLayout.CENTER);
        inventario.revalidate();
        inventario.repaint();
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed

    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed

    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        VProveedores c = new VProveedores();
        c.setSize(978, 600);
        c.setLocation(0, 0);
        inventario.removeAll();
        inventario.add(c, BorderLayout.CENTER);
        inventario.revalidate();
        inventario.repaint();
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        VCategorias c = new VCategorias();
        c.setSize(978, 600);
        c.setLocation(0, 0);
        inventario.removeAll();
        inventario.add(c, BorderLayout.CENTER);
        inventario.revalidate();
        inventario.repaint();
    }//GEN-LAST:event_btnCategoriasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public void mostrarMensajeBienvenida(String mensaje) {
        Notification notificacion = new Notification(this, Notification.Type.SUCCESS, Notification.Location.TOP_RIGHT, mensaje);
        notificacion.showNotification();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnCategorias;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCerrarSesion;
    private RSMaterialComponent.RSButtonMaterialIconDos btnClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnHome;
    private RSMaterialComponent.RSButtonMaterialIconDos btnInformacion;
    private RSMaterialComponent.RSButtonMaterialIconDos btnIngresos;
    private RSMaterialComponent.RSButtonMaterialIconDos btnProveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btnUsuarios;
    private RSMaterialComponent.RSButtonMaterialIconDos btnVenta;
    private javax.swing.JPanel inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private Modelado.JpanelRound jpanelRound1;
    private Modelado.JpanelRound jpanelRound2;
    // End of variables declaration//GEN-END:variables
}
