package Vista;

import Control.ControlIngresos;
import Modelado.Ingresos;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarIngresos extends javax.swing.JFrame {

    ControlIngresos conIng = new ControlIngresos();
    DefaultTableModel modeloIngresos = new DefaultTableModel();

    public BuscarIngresos() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        listarIng();
    }

    private void listarIng() {
        List<Ingresos> lista = conIng.listarIngresos();
        modeloIngresos = (DefaultTableModel) productos.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdIngresos();
            ob[1] = lista.get(i).getNombreProducto();
            ob[2] = lista.get(i).getStock();
            ob[3] = lista.get(i).getTallaNumero();
            ob[4] = lista.get(i).getPrecioVenta();
            modeloIngresos.addRow(ob);
        }
        productos.setModel(modeloIngresos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new Modelado.JpanelRound();
        txtIdIng = new javax.swing.JTextField();
        txtNomPro = new javax.swing.JTextField();
        txtPreVenta = new javax.swing.JTextField();
        txtStockDisponible = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productos = new javax.swing.JTable();
        btnEnviar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnCerrar = new RSMaterialComponent.RSButtonMaterialIconDos();
        txtTaNu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelRound1.setBackground(new java.awt.Color(204, 204, 204));
        jpanelRound1.setRoundBottomLeft(20);
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopLeft(20);
        jpanelRound1.setRoundTopRight(20);

        txtIdIng.setBackground(new java.awt.Color(255, 255, 255));
        txtIdIng.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtNomPro.setBackground(new java.awt.Color(255, 255, 255));
        txtNomPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNomPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProActionPerformed(evt);
            }
        });

        txtPreVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtPreVenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtStockDisponible.setBackground(new java.awt.Color(255, 255, 255));
        txtStockDisponible.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Stock", "Talla-Numero", "Precio"
            }
        ));
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productos);

        btnEnviar.setBackground(new java.awt.Color(14, 76, 117));
        btnEnviar.setText("Enviar");
        btnEnviar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnEnviar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEND);
        btnEnviar.setRound(25);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(244, 33, 70));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBackgroundHover(new java.awt.Color(255, 130, 130));
        btnCerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnCerrar.setRound(25);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtTaNu.setBackground(new java.awt.Color(255, 255, 255));
        txtTaNu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTaNu, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtStockDisponible, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomPro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdIng, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(txtIdIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseClicked
        int fila = productos.getSelectedRow();
        txtIdIng.setText(productos.getValueAt(fila, 0).toString());
        txtNomPro.setText(productos.getValueAt(fila, 1).toString());
        txtStockDisponible.setText(productos.getValueAt(fila, 2).toString());
        txtTaNu.setText(productos.getValueAt(fila, 3).toString());
        txtPreVenta.setText(productos.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_productosMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        VVentas.txtIdIng.setText(txtIdIng.getText());
        VVentas.txtNomPro.setText(txtNomPro.getText());
        VVentas.txtPreVen.setText(txtPreVenta.getText());
        VVentas.txtStockDisponible.setText(txtStockDisponible.getText());
        VVentas.txtTaNu.setText(txtTaNu.getText());
        dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNomProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarIngresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnCerrar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound1;
    private javax.swing.JTable productos;
    private javax.swing.JTextField txtIdIng;
    private javax.swing.JTextField txtNomPro;
    private javax.swing.JTextField txtPreVenta;
    private javax.swing.JTextField txtStockDisponible;
    private javax.swing.JTextField txtTaNu;
    // End of variables declaration//GEN-END:variables
}
