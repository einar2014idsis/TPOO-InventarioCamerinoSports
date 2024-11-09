package Vista;

import Control.ControlClientes;
import Modelado.Clientes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VClientes extends javax.swing.JPanel {

    Clientes cli = new Clientes();
    ControlClientes conCli = new ControlClientes();
    DefaultTableModel modeloClientes = new DefaultTableModel();

    public VClientes() {
        initComponents();
        listarCli();
    }

    private void listarCli() {
        List<Clientes> lista = conCli.listarClientes();
        modeloClientes = (DefaultTableModel) tblClientes.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdClientes();
            ob[1] = lista.get(i).getNombreCliente();
            ob[2] = lista.get(i).getApellidoCliente();
            ob[3] = lista.get(i).getDniCliente();
            ob[4] = lista.get(i).getRucCliente();
            ob[5] = lista.get(i).getTelefonoCliente();
            modeloClientes.addRow(ob);
        }
        tblClientes.setModel(modeloClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarClientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscarClientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditarClientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminarClientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound4 = new Modelado.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        txtNomCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jpanelRound1 = new Modelado.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        icono.setBackground(new java.awt.Color(204, 204, 204));
        icono.setForeground(new java.awt.Color(36, 47, 58));
        icono.setBackgroundHover(new java.awt.Color(36, 47, 58));
        icono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono.setForegroundIcon(new java.awt.Color(36, 47, 58));
        icono.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        icono.setForegroundText(new java.awt.Color(36, 47, 58));
        icono.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        icono.setName(""); // NOI18N
        icono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(36, 47, 58));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 47, 58));
        jLabel7.setText("Registro Clientes");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESAR DATOS DEL CLIENTE");

        btnRegistrarClientes.setBackground(new java.awt.Color(36, 47, 58));
        btnRegistrarClientes.setText("Registrar");
        btnRegistrarClientes.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnRegistrarClientes.setBorderPainted(false);
        btnRegistrarClientes.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnRegistrarClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RECEIPT);
        btnRegistrarClientes.setRound(20);
        btnRegistrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClientesActionPerformed(evt);
            }
        });

        btnBuscarClientes.setBackground(new java.awt.Color(36, 47, 58));
        btnBuscarClientes.setText("Buscar");
        btnBuscarClientes.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarClientes.setBorderPainted(false);
        btnBuscarClientes.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarClientes.setRound(20);
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        btnEditarClientes.setBackground(new java.awt.Color(36, 47, 58));
        btnEditarClientes.setText("Editar");
        btnEditarClientes.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEditarClientes.setBorderPainted(false);
        btnEditarClientes.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEditarClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarClientes.setRound(20);
        btnEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClientesActionPerformed(evt);
            }
        });

        btnEliminarClientes.setBackground(new java.awt.Color(36, 47, 58));
        btnEliminarClientes.setText("Eliminar");
        btnEliminarClientes.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEliminarClientes.setBorderPainted(false);
        btnEliminarClientes.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEliminarClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_SWEEP);
        btnEliminarClientes.setRound(20);
        btnEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClientesActionPerformed(evt);
            }
        });

        jpanelRound4.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound4.setRoundBottomLeft(20);
        jpanelRound4.setRoundBottomRight(20);
        jpanelRound4.setRoundTopLeft(20);
        jpanelRound4.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id-Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres");

        txtIdCli.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCli.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtNomCli.setBackground(new java.awt.Color(255, 255, 255));
        txtNomCli.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomCliActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos");

        txtApCli.setBackground(new java.awt.Color(255, 255, 255));
        txtApCli.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtApCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApCliActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de DNI");

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RUC");

        txtRUC.setBackground(new java.awt.Color(255, 255, 255));
        txtRUC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUCActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero Telefonico");

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCli, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomCli)
                    .addComponent(txtApCli)
                    .addComponent(txtDNI)
                    .addComponent(txtRUC)
                    .addComponent(txtTel))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setPreferredSize(new java.awt.Dimension(610, 474));
        jpanelRound1.setRoundBottomLeft(20);
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopLeft(20);
        jpanelRound1.setRoundTopRight(20);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id-Cliente", "Nombres", "Apellidos", "N° de DNI", "N° de RUC", "N° Telefonico"
            }
        ));
        tblClientes.setMinimumSize(new java.awt.Dimension(30, 80));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void limpiarTextosClientes() {
        txtIdCli.setText("");
        txtNomCli.setText("");
        txtApCli.setText("");
        txtDNI.setText("");
        txtRUC.setText("");
        txtTel.setText("");
    }

    void limpiarTblClientes() {
        for (int i = 0; i < modeloClientes.getRowCount(); i++) {
            modeloClientes.removeRow(i);
            i = 0 - 1;
        }
    }
    private void iconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoActionPerformed

    }//GEN-LAST:event_iconoActionPerformed

    private void btnRegistrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClientesActionPerformed
        if (txtNomCli.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de nombre no puede estar vacío.");
            return;
        }
        if (txtApCli.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de apellido no puede estar vacío.");
            return;
        }
        if (txtTel.getText().trim().isEmpty() || !txtTel.getText().matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "El campo de teléfono debe contener 9 dígitos.");
            return;
        }
        String dniText = txtDNI.getText().trim();
        String rucText = txtRUC.getText().trim();
        if (!dniText.isEmpty()) {
            if (!dniText.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(null, "El DNI debe contener exactamente 8 dígitos numéricos.");
                return;
            }
        } else if (rucText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar al menos un DNI o RUC.");
            return;
        }
        if (!rucText.isEmpty()) {
            if (!rucText.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(null, "El RUC debe contener exactamente 11 dígitos numéricos.");
                return;
            }
        }
        try {
            Clientes nuevoCliente = new Clientes();
            nuevoCliente.setNombreCliente(txtNomCli.getText().trim());
            nuevoCliente.setApellidoCliente(txtApCli.getText().trim());
            nuevoCliente.setTelefonoCliente(Integer.parseInt(txtTel.getText().trim()));
            if (!dniText.isEmpty()) {
                List<Clientes> listaClientes = conCli.listarClientes();
                boolean clienteExisteDni = listaClientes.stream()
                        .anyMatch(cliente -> dniText.equals(String.valueOf(cliente.getDniCliente())));
                if (clienteExisteDni) {
                    JOptionPane.showMessageDialog(null, "El cliente con ese DNI ya existe.");
                    return;
                } else {
                    nuevoCliente.setDniCliente(Integer.parseInt(dniText));
                }
            }
            if (!rucText.isEmpty()) {
                List<Clientes> listaClientes = conCli.listarClientes();
                boolean clienteExisteRuc = listaClientes.stream()
                        .anyMatch(cliente -> rucText.equals(cliente.getRucCliente()));
                if (clienteExisteRuc) {
                    JOptionPane.showMessageDialog(null, "El cliente con ese RUC ya existe.");
                    return;
                } else {
                    nuevoCliente.setRucCliente(rucText);
                }
            }
            if (conCli.reinicioClientes(nuevoCliente)) {
                JOptionPane.showMessageDialog(null, "Cliente Registrado");
                limpiarTblClientes();
                listarCli();
                limpiarTextosClientes();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el cliente.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de los campos numéricos.");
        }
    }//GEN-LAST:event_btnRegistrarClientesActionPerformed

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
        if (txtDNI.getText().isEmpty() && txtRUC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la búsqueda sin un DNI o RUC.");
            limpiarTextosClientes();
        } else {
            Clientes cliente = new Clientes();
            if (!txtDNI.getText().isEmpty()) {
                try {
                    int dni = Integer.parseInt(txtDNI.getText().trim());
                    cliente.setDniCliente(dni);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El DNI debe ser un número válido.");
                    return;
                }
            }
            if (!txtRUC.getText().isEmpty()) {
                cliente.setRucCliente(txtRUC.getText().trim());
            }
            if (conCli.buscarClientes(cli)) {
                txtIdCli.setText(String.valueOf(cliente.getIdClientes()));
                txtNomCli.setText(cliente.getNombreCliente());
                txtApCli.setText(cliente.getApellidoCliente());
                txtDNI.setText(String.valueOf(cliente.getDniCliente()));
                txtRUC.setText(cliente.getRucCliente());
                txtTel.setText(String.valueOf(cliente.getTelefonoCliente()));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                limpiarTextosClientes();
            }
        }
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void btnEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClientesActionPerformed
        int fila = tblClientes.getSelectedRow();
        if (fila == -1 && txtDNI.getText().isEmpty() && txtRUC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente o ingrese un DNI o RUC válido.");
        } else {
            List<Clientes> listaClientes = conCli.listarClientes();
            String dniText = txtDNI.getText().trim();
            String rucText = txtRUC.getText().trim();
            Clientes clienteActual = null;
            if (!dniText.isEmpty()) {
                int dni = Integer.parseInt(dniText);
                clienteActual = listaClientes.stream()
                        .filter(cli -> cli.getDniCliente() == dni)
                        .findFirst()
                        .orElse(null);
            } else if (!rucText.isEmpty()) {
                clienteActual = listaClientes.stream()
                        .filter(cli -> cli.getRucCliente().equals(rucText))
                        .findFirst()
                        .orElse(null);
            }
            if (clienteActual == null) {
                JOptionPane.showMessageDialog(null, "Error: No se puede modificar porque el cliente no está registrado.");
            } else {
                String nuevoNombre = txtNomCli.getText().trim();
                String nuevoApellido = txtApCli.getText().trim();
                String nuevoTelefono = txtTel.getText().trim();
                boolean cambios = false;
                if (!nuevoNombre.isEmpty() && !clienteActual.getNombreCliente().equals(nuevoNombre)) {
                    clienteActual.setNombreCliente(nuevoNombre);
                    cambios = true;
                }
                if (!nuevoApellido.isEmpty() && !clienteActual.getApellidoCliente().equals(nuevoApellido)) {
                    clienteActual.setApellidoCliente(nuevoApellido);
                    cambios = true;
                }
                if (!nuevoTelefono.isEmpty() && !String.valueOf(clienteActual.getTelefonoCliente()).equals(nuevoTelefono)) {
                    clienteActual.setTelefonoCliente(Integer.parseInt(nuevoTelefono));
                    cambios = true;
                }
                if (!cambios) {
                    JOptionPane.showMessageDialog(null, "No se realizaron cambios en el cliente.");
                } else {
                    if (conCli.editarClientes(clienteActual)) {
                        JOptionPane.showMessageDialog(null, "¡Modificación de cliente exitosa!");
                        limpiarTblClientes();
                        listarCli();
                        limpiarTextosClientes();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo modificar el cliente.");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEditarClientesActionPerformed

    private void btnEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClientesActionPerformed
        if (!txtDNI.getText().isEmpty() || !txtRUC.getText().isEmpty()) {
            String dniText = txtDNI.getText().trim();
            String rucText = txtRUC.getText().trim();
            List<Clientes> listaClientes = conCli.listarClientes();
            boolean clienteExiste = false;
            for (Clientes cliente : listaClientes) {
                if (dniText.equals(String.valueOf(cliente.getDniCliente())) || rucText.equals(cliente.getRucCliente())) {
                    clienteExiste = true;
                    break;
                }
            }
            if (!clienteExiste) {
                JOptionPane.showMessageDialog(null, "Error: El DNI o RUC del cliente no existe.");
            } else {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    Clientes clienteAEliminar = new Clientes();
                    if (!dniText.isEmpty()) {
                        clienteAEliminar.setDniCliente(Integer.parseInt(dniText));
                    }
                    if (!rucText.isEmpty()) {
                        clienteAEliminar.setRucCliente(rucText);
                    }
                    conCli.eliminarClientes(clienteAEliminar);
                    limpiarTblClientes();
                    listarCli();
                    limpiarTextosClientes();
                    JOptionPane.showMessageDialog(null, "Se eliminó con éxito el cliente");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar, ingrese el DNI o RUC del cliente.");
        }
    }//GEN-LAST:event_btnEliminarClientesActionPerformed

    private void txtNomCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomCliActionPerformed
        txtApCli.requestFocus();
    }//GEN-LAST:event_txtNomCliActionPerformed

    private void txtApCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApCliActionPerformed
        txtDNI.requestFocus();
    }//GEN-LAST:event_txtApCliActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        txtRUC.requestFocus();
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUCActionPerformed
        txtTel.requestFocus();
    }//GEN-LAST:event_txtRUCActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        btnRegistrarClientes.doClick();
    }//GEN-LAST:event_txtTelActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int fila = tblClientes.getSelectedRow();
        txtIdCli.setText(tblClientes.getValueAt(fila, 0).toString());
        txtNomCli.setText(tblClientes.getValueAt(fila, 1).toString());
        txtApCli.setText(tblClientes.getValueAt(fila, 2).toString());
        txtDNI.setText(tblClientes.getValueAt(fila, 3).toString());
        txtRUC.setText(tblClientes.getValueAt(fila, 4).toString());
        txtTel.setText(tblClientes.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tblClientesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditarClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminarClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRegistrarClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound1;
    private Modelado.JpanelRound jpanelRound4;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApCli;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
