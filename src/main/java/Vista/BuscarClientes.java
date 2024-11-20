package Vista;

import Control.ControlClientes;
import Modelado.Clientes;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarClientes extends javax.swing.JFrame {

    ControlClientes conCli = new ControlClientes();
    DefaultTableModel modeloClientes = new DefaultTableModel();

    public BuscarClientes() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        listarCli();
    }

    private void listarCli() {
        List<Clientes> lista = conCli.listarClientes();
        modeloClientes = (DefaultTableModel) clientes.getModel();
        modeloClientes.setRowCount(0);
        Object[] ob = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdClientes();
            ob[1] = lista.get(i).getNombreCliente() + " " + lista.get(i).getApellidoCliente();
            ob[2] = (lista.get(i).getRucCliente() != null && !lista.get(i).getRucCliente().isEmpty())
                    ? lista.get(i).getRucCliente()
                    : lista.get(i).getDniCliente();
            ob[3] = lista.get(i).getTelefonoCliente();
            modeloClientes.addRow(ob);
        }
        clientes.setModel(modeloClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new Modelado.JpanelRound();
        txtIdCli = new javax.swing.JTextField();
        txtNomApellido = new javax.swing.JTextField();
        Documento = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientes = new javax.swing.JTable();
        btnEnviar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnCerrar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelRound1.setBackground(new java.awt.Color(204, 204, 204));
        jpanelRound1.setRoundBottomLeft(20);
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopLeft(20);
        jpanelRound1.setRoundTopRight(20);

        txtIdCli.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCli.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtNomApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtNomApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        Documento.setBackground(new java.awt.Color(255, 255, 255));
        Documento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre-Apellido", "Documento", "Telefono"
            }
        ));
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientes);

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
                    .addComponent(Documento)
                    .addComponent(txtNomApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCli, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
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
                        .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked
        int fila = clientes.getSelectedRow();
        txtIdCli.setText(clientes.getValueAt(fila, 0).toString());
        String nombreCompleto = clientes.getValueAt(fila, 1).toString();
        txtNomApellido.setText(nombreCompleto);
        Documento.setText(clientes.getValueAt(fila, 2).toString());
        txtTelefono.setText(clientes.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_clientesMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        VVentas.txtIdCli.setText(txtIdCli.getText());
        VVentas.txtNomCli.setText(txtNomApellido.getText());
        VVentas.txtDocumento.setText(Documento.getText());
        VVentas.txtTelCli.setText(txtTelefono.getText());
        dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Documento;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCerrar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEnviar;
    private javax.swing.JTable clientes;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound1;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtNomApellido;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
