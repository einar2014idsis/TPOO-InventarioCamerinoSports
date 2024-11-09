package Vista;

import Control.ControlCategorias;
import Modelado.Categorias;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VCategorias extends javax.swing.JPanel {

    Categorias cat = new Categorias();
    ControlCategorias conCat = new ControlCategorias();
    DefaultTableModel modeloCategorias = new DefaultTableModel();

    public VCategorias() {
        initComponents();
        listarCat();
    }

    private void listarCat() {
        List<Categorias> lista = conCat.listarCategorias();
        modeloCategorias = (DefaultTableModel) tblCategorias.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdCategorias();
            ob[1] = lista.get(i).getCategoria();
            modeloCategorias.addRow(ob);
        }
        tblCategorias.setModel(modeloCategorias);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpanelRound4 = new Modelado.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdCat = new javax.swing.JTextField();
        txtCategorias = new javax.swing.JTextField();
        jpanelRound1 = new Modelado.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        icono1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnRegistrarCategorias = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscarCategorias = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditarCategorias = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminarCategorias = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setBackground(new java.awt.Color(36, 47, 58));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 47, 58));
        jLabel7.setText("Registro Categorias");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESAR CATEGORIAS");

        jpanelRound4.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound4.setRoundBottomLeft(20);
        jpanelRound4.setRoundBottomRight(20);
        jpanelRound4.setRoundTopLeft(20);
        jpanelRound4.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id-Categoria");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de Categoria");

        txtIdCat.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtCategorias.setBackground(new java.awt.Color(255, 255, 255));
        txtCategorias.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCat, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategorias))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(20);
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopLeft(20);
        jpanelRound1.setRoundTopRight(20);

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id-Categoria", "Tipo de Categoria"
            }
        ));
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategorias);
        if (tblCategorias.getColumnModel().getColumnCount() > 0) {
            tblCategorias.getColumnModel().getColumn(0).setMaxWidth(75);
        }

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        icono1.setBackground(new java.awt.Color(204, 204, 204));
        icono1.setForeground(new java.awt.Color(36, 47, 58));
        icono1.setBackgroundHover(new java.awt.Color(36, 47, 58));
        icono1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono1.setForegroundIcon(new java.awt.Color(36, 47, 58));
        icono1.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        icono1.setForegroundText(new java.awt.Color(36, 47, 58));
        icono1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VIEW_LIST);
        icono1.setInheritsPopupMenu(true);
        icono1.setName(""); // NOI18N
        icono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono1ActionPerformed(evt);
            }
        });

        btnRegistrarCategorias.setBackground(new java.awt.Color(36, 47, 58));
        btnRegistrarCategorias.setText("Registrar");
        btnRegistrarCategorias.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnRegistrarCategorias.setBorderPainted(false);
        btnRegistrarCategorias.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnRegistrarCategorias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RECEIPT);
        btnRegistrarCategorias.setRound(20);
        btnRegistrarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCategoriasActionPerformed(evt);
            }
        });

        btnBuscarCategorias.setBackground(new java.awt.Color(36, 47, 58));
        btnBuscarCategorias.setText("Buscar");
        btnBuscarCategorias.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarCategorias.setBorderPainted(false);
        btnBuscarCategorias.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarCategorias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarCategorias.setRound(20);
        btnBuscarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriasActionPerformed(evt);
            }
        });

        btnEditarCategorias.setBackground(new java.awt.Color(36, 47, 58));
        btnEditarCategorias.setText("Editar");
        btnEditarCategorias.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEditarCategorias.setBorderPainted(false);
        btnEditarCategorias.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEditarCategorias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarCategorias.setRound(20);
        btnEditarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCategoriasActionPerformed(evt);
            }
        });

        btnEliminarCategorias.setBackground(new java.awt.Color(36, 47, 58));
        btnEliminarCategorias.setText("Eliminar");
        btnEliminarCategorias.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEliminarCategorias.setBorderPainted(false);
        btnEliminarCategorias.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEliminarCategorias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_SWEEP);
        btnEliminarCategorias.setRound(20);
        btnEliminarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)))
                    .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditarCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    void limpiarTextosCategorias() {
        txtIdCat.setText("");
        txtCategorias.setText("");
    }

    void limpiarTblCategorias() {
        for (int i = 0; i < modeloCategorias.getRowCount(); i++) {
            modeloCategorias.removeRow(i);
            i = 0 - 1;
        }
    }
    private void iconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoActionPerformed

    }//GEN-LAST:event_iconoActionPerformed

    private void txtCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriasActionPerformed
        btnRegistrarCategorias.doClick();
    }//GEN-LAST:event_txtCategoriasActionPerformed

    private void btnRegistrarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCategoriasActionPerformed
        if (txtCategorias.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de categoría no puede estar vacío.");
            return;
        }
        String nuevaCategoria = txtCategorias.getText().trim();
        List<Categorias> listaCategorias = conCat.listarCategorias();
        boolean categoriaExiste = listaCategorias.stream()
                .anyMatch(cat -> cat.getCategoria().equalsIgnoreCase(nuevaCategoria));
        if (categoriaExiste) {
            JOptionPane.showMessageDialog(null, "La categoría ya existe.");
            return;
        }
        cat.setCategoria(nuevaCategoria);

        if (conCat.reinicioCategorias(cat)) {
            JOptionPane.showMessageDialog(null, "***Registro exitoso***");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la categoría.");
        }
        limpiarTblCategorias();
        listarCat();
        limpiarTextosCategorias();
    }//GEN-LAST:event_btnRegistrarCategoriasActionPerformed

    private void btnBuscarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriasActionPerformed
        if (txtIdCat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la búsqueda sin un ID de categoría.");
            limpiarTextosCategorias();
        } else {
            cat.setIdCategorias(Integer.parseInt(txtIdCat.getText()));

            if (conCat.buscarCategorias(cat)) {
                txtIdCat.setText(String.valueOf(cat.getIdCategorias()));
                txtCategorias.setText(cat.getCategoria());
            } else {
                JOptionPane.showMessageDialog(null, "Identificador de categoría inexistente.");
                limpiarTextosCategorias();
            }
        }
    }//GEN-LAST:event_btnBuscarCategoriasActionPerformed

    private void btnEditarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCategoriasActionPerformed
        int fila = tblCategorias.getSelectedRow();
        if (fila == -1 && txtIdCat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una categoría.");
        } else {
            List<Categorias> listaCategorias = conCat.listarCategorias();
            int idCategoria = Integer.parseInt(txtIdCat.getText());
            Categorias categoriaActual = listaCategorias.stream()
                    .filter(cat -> cat.getIdCategorias() == idCategoria)
                    .findFirst()
                    .orElse(null);
            if (categoriaActual == null) {
                JOptionPane.showMessageDialog(null, "Error: No se puede modificar porque la categoría no está registrada.");
            } else {
                String nuevaCategoria = txtCategorias.getText().trim();
                boolean categoriaYaExiste = listaCategorias.stream()
                        .anyMatch(cat -> cat.getCategoria().equalsIgnoreCase(nuevaCategoria) && cat.getIdCategorias() != idCategoria);
                if (categoriaYaExiste) {
                    JOptionPane.showMessageDialog(null, "La categoría '" + nuevaCategoria + "' ya existe. No se puede modificar a un nombre duplicado.");
                } else {
                    if (categoriaActual.getCategoria().equalsIgnoreCase(nuevaCategoria)) {
                        JOptionPane.showMessageDialog(null, "No hubo cambios en la categoría.");
                    } else {
                        cat.setIdCategorias(idCategoria);
                        cat.setCategoria(nuevaCategoria);
                        if (conCat.editarCategorias(cat)) {
                            JOptionPane.showMessageDialog(null, "¡Modificación exitosa!");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo modificar la categoría.");
                        }
                        limpiarTblCategorias();
                        listarCat();
                        limpiarTextosCategorias();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEditarCategoriasActionPerformed

    private void btnEliminarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriasActionPerformed
        if (!txtIdCat.getText().isEmpty()) {
            int idCategoria = Integer.parseInt(txtIdCat.getText());
            List<Categorias> listaCategorias = conCat.listarCategorias();
            boolean idExiste = listaCategorias.stream().anyMatch(cat -> cat.getIdCategorias() == idCategoria);

            if (!idExiste) {
                JOptionPane.showMessageDialog(null, "Error: El ID de la categoría no existe.");
            } else {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar la categoría?", "Confirmar", 2);
                if (confirmacion == 0) {
                    cat.setIdCategorias(idCategoria);
                    conCat.eliminarCategorias(cat);
                    limpiarTblCategorias();
                    listarCat();
                    limpiarTextosCategorias();
                    JOptionPane.showMessageDialog(null, "Se eliminó con éxito la categoría");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar, seleccione una categoría");
        }
    }//GEN-LAST:event_btnEliminarCategoriasActionPerformed

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked
        int fila = tblCategorias.getSelectedRow();
        txtIdCat.setText(tblCategorias.getValueAt(fila, 0).toString());
        txtCategorias.setText(tblCategorias.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tblCategoriasMouseClicked

    private void icono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono1ActionPerformed
    }//GEN-LAST:event_icono1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarCategorias;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditarCategorias;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminarCategorias;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRegistrarCategorias;
    private RSMaterialComponent.RSButtonMaterialIconDos icono1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound1;
    private Modelado.JpanelRound jpanelRound4;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtCategorias;
    private javax.swing.JTextField txtIdCat;
    // End of variables declaration//GEN-END:variables
}
