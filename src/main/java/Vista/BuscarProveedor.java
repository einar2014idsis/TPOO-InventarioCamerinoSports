package Vista;

import Control.ControlProveedores;
import Modelado.Clientes;
import Modelado.Proveedores;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarProveedor extends javax.swing.JFrame {

    ControlProveedores conPro = new ControlProveedores();
    DefaultTableModel modeloProveedor = new DefaultTableModel();

    public BuscarProveedor() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        listarPro();
    }

    private void listarPro() {
        List<Proveedores> lista = conPro.listarProveedores();
        modeloProveedor = (DefaultTableModel) proveedor.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdProveedor();
            ob[1] = lista.get(i).getNombreProveedor();
            modeloProveedor.addRow(ob);
        }
        proveedor.setModel(modeloProveedor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new Modelado.JpanelRound();
        txtIdPro = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        proveedor = new javax.swing.JTable();
        btnEnviar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnCerrar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelRound1.setBackground(new java.awt.Color(204, 204, 204));
        jpanelRound1.setRoundBottomLeft(20);
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopLeft(20);
        jpanelRound1.setRoundTopRight(20);

        txtIdPro.setBackground(new java.awt.Color(255, 255, 255));
        txtIdPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre proveedor"
            }
        ));
        proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(proveedor);

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

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdPro, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addGap(196, 196, 196)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
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

    private void proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedorMouseClicked
        int fila = proveedor.getSelectedRow();
        txtIdPro.setText(proveedor.getValueAt(fila, 0).toString());
        txtProveedor.setText(proveedor.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_proveedorMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        VIngresos.txtIdPro.setText(txtIdPro.getText());
        VIngresos.txtProveedor.setText(txtProveedor.getText());
        dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnCerrar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound1;
    private javax.swing.JTable proveedor;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
