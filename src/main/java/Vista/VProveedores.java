package Vista;

import Control.ControlProveedores;
import Modelado.Proveedores;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VProveedores extends javax.swing.JPanel {

    Proveedores pro = new Proveedores();
    ControlProveedores conPro = new ControlProveedores();
    DefaultTableModel modeloProveedor = new DefaultTableModel();

    public VProveedores() {
        initComponents();
        listarPro();
    }

    private void listarPro() {
        List<Proveedores> lista = conPro.listarProveedores();
        modeloProveedor = (DefaultTableModel) tblProveedores.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdProveedor();
            ob[1] = lista.get(i).getNombreProveedor();
            ob[2] = lista.get(i).getRucProveedor();
            ob[3] = lista.get(i).getTelefonoProveedor();
            ob[4] = lista.get(i).getDireccionProveedor();
            ob[5] = lista.get(i).getCorreoProveedor();
            modeloProveedor.addRow(ob);
        }
        tblProveedores.setModel(modeloProveedor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icono1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarProveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarProveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditarProveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminarProveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound1 = new Modelado.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jpanelRound6 = new Modelado.JpanelRound();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtIdPro = new javax.swing.JTextField();
        txtNomPro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtRucPro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTelPro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDirPro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCorrPro = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        icono1.setBackground(new java.awt.Color(204, 204, 204));
        icono1.setForeground(new java.awt.Color(36, 47, 58));
        icono1.setBackgroundHover(new java.awt.Color(36, 47, 58));
        icono1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono1.setForegroundIcon(new java.awt.Color(36, 47, 58));
        icono1.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        icono1.setForegroundText(new java.awt.Color(36, 47, 58));
        icono1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARCHIVE);
        icono1.setInheritsPopupMenu(true);
        icono1.setName(""); // NOI18N
        icono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(36, 47, 58));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 47, 58));
        jLabel7.setText("Registro Proveedores");

        btnRegistrarProveedor.setBackground(new java.awt.Color(36, 47, 58));
        btnRegistrarProveedor.setText("Registrar");
        btnRegistrarProveedor.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnRegistrarProveedor.setBorderPainted(false);
        btnRegistrarProveedor.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnRegistrarProveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RECEIPT);
        btnRegistrarProveedor.setRound(20);
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESAR DATOS DEL PROVEEDOR");

        btnBuscarProveedor.setBackground(new java.awt.Color(36, 47, 58));
        btnBuscarProveedor.setText("Buscar");
        btnBuscarProveedor.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarProveedor.setBorderPainted(false);
        btnBuscarProveedor.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarProveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarProveedor.setRound(20);
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        btnEditarProveedor.setBackground(new java.awt.Color(36, 47, 58));
        btnEditarProveedor.setText("Editar");
        btnEditarProveedor.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEditarProveedor.setBorderPainted(false);
        btnEditarProveedor.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEditarProveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarProveedor.setRound(20);
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setBackground(new java.awt.Color(36, 47, 58));
        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEliminarProveedor.setBorderPainted(false);
        btnEliminarProveedor.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEliminarProveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_SWEEP);
        btnEliminarProveedor.setRound(20);
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(20);
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopLeft(20);
        jpanelRound1.setRoundTopRight(20);

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id-Proveedor", "Proveedor", "RUC", "Telefono", "Direccion", "Correo"
            }
        ));
        tblProveedores.setMinimumSize(new java.awt.Dimension(30, 80));
        tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jpanelRound6.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound6.setRoundBottomLeft(20);
        jpanelRound6.setRoundBottomRight(20);
        jpanelRound6.setRoundTopLeft(20);
        jpanelRound6.setRoundTopRight(20);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("id-Proveedor");

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre de Proveedor");

        txtIdPro.setBackground(new java.awt.Color(255, 255, 255));
        txtIdPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtNomPro.setBackground(new java.awt.Color(255, 255, 255));
        txtNomPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNomPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ruc de Proveedor");

        txtRucPro.setBackground(new java.awt.Color(255, 255, 255));
        txtRucPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtRucPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucProActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Telefono de Proveedor");

        txtTelPro.setBackground(new java.awt.Color(255, 255, 255));
        txtTelPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTelPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelProActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Dirección");

        txtDirPro.setBackground(new java.awt.Color(255, 255, 255));
        txtDirPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtDirPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirProActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Correo de Proveedor");

        txtCorrPro.setBackground(new java.awt.Color(255, 255, 255));
        txtCorrPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtCorrPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorrProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound6Layout = new javax.swing.GroupLayout(jpanelRound6);
        jpanelRound6.setLayout(jpanelRound6Layout);
        jpanelRound6Layout.setHorizontalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(txtIdPro, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addComponent(txtNomPro)
                    .addComponent(txtRucPro)
                    .addComponent(txtTelPro)
                    .addComponent(txtDirPro)
                    .addComponent(txtCorrPro))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpanelRound6Layout.setVerticalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRucPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDirPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorrPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)))
                    .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 978, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    void limpiarTextosProveedor() {
        txtIdPro.setText("");
        txtNomPro.setText("");
        txtRucPro.setText("");
        txtTelPro.setText("");
        txtDirPro.setText("");
        txtCorrPro.setText("");
    }

    void limpiarTblProveedores() {
        for (int i = 0; i < modeloProveedor.getRowCount(); i++) {
            modeloProveedor.removeRow(i);
            i = 0 - 1;
        }
    }
    private void icono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono1ActionPerformed

    }//GEN-LAST:event_icono1ActionPerformed

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        if (txtNomPro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de nombre no puede estar vacío.");
            return;
        }
        if (txtDirPro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de dirección no puede estar vacío.");
            return;
        }
        if (txtCorrPro.getText().trim().isEmpty() || !txtCorrPro.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            JOptionPane.showMessageDialog(null, "El campo de correo debe contener una dirección de correo válida.");
            return;
        }
        String rucText = txtRucPro.getText().trim();
        String telText = txtTelPro.getText().trim();
        if (rucText.isEmpty() || !rucText.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(null, "El RUC debe contener exactamente 11 dígitos numéricos.");
            return;
        }
        if (!telText.isEmpty() && !telText.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "El teléfono debe contener exactamente 9 dígitos numéricos.");
            return;
        }

        try {
            Proveedores nuevoProveedor = new Proveedores();
            nuevoProveedor.setNombreProveedor(txtNomPro.getText().trim());
            nuevoProveedor.setRucProveedor(rucText);
            nuevoProveedor.setDireccionProveedor(txtDirPro.getText().trim());
            nuevoProveedor.setCorreoProveedor(txtCorrPro.getText().trim());

            if (!telText.isEmpty()) {
                nuevoProveedor.setTelefonoProveedor(Integer.parseInt(telText));
            }

            List<Proveedores> listaProveedores = conPro.listarProveedores();
            boolean proveedorExisteRuc = listaProveedores.stream()
                    .anyMatch(proveedor -> rucText.equals(proveedor.getRucProveedor()));
            if (proveedorExisteRuc) {
                JOptionPane.showMessageDialog(null, "El proveedor con ese RUC ya existe.");
                return;
            }
            if (conPro.reinicioProveedores(nuevoProveedor)) {
                JOptionPane.showMessageDialog(null, "Proveedor registrado correctamente.");
                limpiarTblProveedores();
                listarPro();
                limpiarTextosProveedor();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el proveedor.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de los campos numéricos.");
        }
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        if (txtRucPro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la búsqueda sin un RUC de proveedor.");
            limpiarTextosProveedor();
        } else {
            String ruc = txtRucPro.getText().trim();
            pro.setRucProveedor(ruc);

            if (conPro.buscarProveedores(pro)) {
                txtIdPro.setText(String.valueOf(pro.getIdProveedor()));
                txtNomPro.setText(pro.getNombreProveedor());
                txtRucPro.setText(pro.getRucProveedor());
                txtTelPro.setText(String.valueOf(pro.getTelefonoProveedor()));
                txtDirPro.setText(pro.getDireccionProveedor());
                txtCorrPro.setText(pro.getCorreoProveedor());
            } else {
                JOptionPane.showMessageDialog(null, "Proveedor con ese RUC no encontrado.");
                limpiarTextosProveedor();
            }
        }
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        int fila = tblProveedores.getSelectedRow();
        if (fila == -1 && txtRucPro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor o ingrese un RUC válido.");
        } else {
            List<Proveedores> listaProveedores = conPro.listarProveedores();
            String rucText = txtRucPro.getText().trim();
            Proveedores proveedorActual = null;

            if (!rucText.isEmpty()) {
                proveedorActual = listaProveedores.stream()
                        .filter(prov -> prov.getRucProveedor().equals(rucText))
                        .findFirst()
                        .orElse(null);
            }
            if (proveedorActual == null) {
                JOptionPane.showMessageDialog(null, "Error: No se puede modificar porque el proveedor no está registrado.");
            } else {
                String nuevoNombre = txtNomPro.getText().trim();
                String nuevaDireccion = txtDirPro.getText().trim();
                String nuevoCorreo = txtCorrPro.getText().trim();
                String nuevoTelefono = txtTelPro.getText().trim();
                boolean cambios = false;

                if (!nuevoNombre.isEmpty() && !proveedorActual.getNombreProveedor().equals(nuevoNombre)) {
                    proveedorActual.setNombreProveedor(nuevoNombre);
                    cambios = true;
                }
                if (!nuevaDireccion.isEmpty() && !proveedorActual.getDireccionProveedor().equals(nuevaDireccion)) {
                    proveedorActual.setDireccionProveedor(nuevaDireccion);
                    cambios = true;
                }
                if (!nuevoCorreo.isEmpty() && !proveedorActual.getCorreoProveedor().equals(nuevoCorreo)) {
                    proveedorActual.setCorreoProveedor(nuevoCorreo);
                    cambios = true;
                }
                if (!nuevoTelefono.isEmpty() && !String.valueOf(proveedorActual.getTelefonoProveedor()).equals(nuevoTelefono)) {
                    proveedorActual.setTelefonoProveedor(Integer.parseInt(nuevoTelefono));
                    cambios = true;
                }
                if (!cambios) {
                    JOptionPane.showMessageDialog(null, "No se realizaron cambios en el proveedor.");
                } else {
                    if (conPro.editarProveedores(proveedorActual)) {
                        JOptionPane.showMessageDialog(null, "¡Modificación de proveedor exitosa!");
                        limpiarTblProveedores();
                        listarPro();
                        limpiarTextosProveedor();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo modificar el proveedor.");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if (!txtRucPro.getText().isEmpty()) {
            String rucText = txtRucPro.getText().trim();
            List<Proveedores> listaProveedores = conPro.listarProveedores();
            boolean proveedorExiste = false;

            for (Proveedores proveedor : listaProveedores) {
                if (rucText.equals(proveedor.getRucProveedor())) {
                    proveedorExiste = true;
                    break;
                }
            }

            if (!proveedorExiste) {
                JOptionPane.showMessageDialog(null, "Error: El RUC del proveedor no existe.");
            } else {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el proveedor?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    Proveedores proveedorAEliminar = new Proveedores();
                    proveedorAEliminar.setRucProveedor(rucText);

                    if (conPro.eliminarProveedores(proveedorAEliminar)) {
                        limpiarTblProveedores();
                        listarPro();
                        limpiarTextosProveedor();
                        JOptionPane.showMessageDialog(null, "Se eliminó con éxito el proveedor.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el proveedor.");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar, ingrese el RUC del proveedor.");
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void tblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMouseClicked
        int fila = tblProveedores.getSelectedRow();
        txtIdPro.setText(tblProveedores.getValueAt(fila, 0).toString());
        txtNomPro.setText(tblProveedores.getValueAt(fila, 1).toString());
        txtRucPro.setText(tblProveedores.getValueAt(fila, 2).toString());
        txtTelPro.setText(tblProveedores.getValueAt(fila, 3).toString());
        txtDirPro.setText(tblProveedores.getValueAt(fila, 4).toString());
        txtCorrPro.setText(tblProveedores.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tblProveedoresMouseClicked

    private void txtNomProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProActionPerformed

    }//GEN-LAST:event_txtNomProActionPerformed

    private void txtRucProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucProActionPerformed

    }//GEN-LAST:event_txtRucProActionPerformed

    private void txtTelProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelProActionPerformed

    }//GEN-LAST:event_txtTelProActionPerformed

    private void txtDirProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirProActionPerformed

    }//GEN-LAST:event_txtDirProActionPerformed

    private void txtCorrProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorrProActionPerformed
        btnRegistrarProveedor.doClick();
    }//GEN-LAST:event_txtCorrProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarProveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditarProveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminarProveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRegistrarProveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos icono1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound1;
    private Modelado.JpanelRound jpanelRound6;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCorrPro;
    private javax.swing.JTextField txtDirPro;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtNomPro;
    private javax.swing.JTextField txtRucPro;
    private javax.swing.JTextField txtTelPro;
    // End of variables declaration//GEN-END:variables
}
