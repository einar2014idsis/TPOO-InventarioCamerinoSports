package Vista;

import Control.ControlIngresos;
import Control.ControlCategorias;
import Control.ControlProveedores;
import Modelado.Categorias;
import Modelado.Ingresos;
import Modelado.Proveedores;
import com.formdev.flatlaf.json.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VIngresos extends javax.swing.JPanel {

    Ingresos ing = new Ingresos();
    Categorias cat = new Categorias();
    Proveedores pro = new Proveedores();
    ControlIngresos conIng = new ControlIngresos();
    ControlCategorias conCat = new ControlCategorias();
    ControlProveedores conPro = new ControlProveedores();
    DefaultTableModel modeloIngresos = new DefaultTableModel();

    public VIngresos() {
        initComponents();
        listarIng();
    }

    private void listarIng() {
        List<Ingresos> lista = conIng.listarIngresos();
        modeloIngresos = (DefaultTableModel) tblIngresos.getModel();
        modeloIngresos.setRowCount(0);
        Object[] ob = new Object[11];
        SimpleDateFormat dateInputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateOutputFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdIngresos();
            ob[1] = lista.get(i).getNombreProducto();
            ob[2] = lista.get(i).getStock();
            ob[3] = lista.get(i).getTallaNumero();
            ob[4] = lista.get(i).getIdCategorias();
            try {
                String fechaOriginal = lista.get(i).getFechaIngreso();
                Date fecha = dateInputFormat.parse(fechaOriginal);
                ob[5] = dateOutputFormat.format(fecha);
            } catch (Exception e) {
                ob[5] = lista.get(i).getFechaIngreso();
            }
            ob[6] = lista.get(i).getIdProveedor();
            ob[7] = lista.get(i).getPrecioCompra();
            ob[8] = lista.get(i).getPrecioVenta();
            ob[9] = lista.get(i).getImporteCompra();
            ob[10] = lista.get(i).getImporteVenta();
            modeloIngresos.addRow(ob);
        }
        tblIngresos.setModel(modeloIngresos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new Modelado.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        icono = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpanelRound4 = new Modelado.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdIng = new javax.swing.JTextField();
        txtNomPro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfechaIng = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpreCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpreVenta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtimpCompra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtimpVenta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTaNu = new javax.swing.JTextField();
        jpanelRound5 = new Modelado.JpanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdCat = new javax.swing.JTextField();
        txtCategorias = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarCategorias = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound6 = new Modelado.JpanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdPro = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnBuscarProveedores = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound2 = new Modelado.JpanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIngresos = new javax.swing.JTable();
        btnRegistrarIngreso = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscarIngreso = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditarIngreso = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminarIngreso = new RSMaterialComponent.RSButtonMaterialIconDos();

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

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        setBackground(new java.awt.Color(204, 204, 204));

        icono.setBackground(new java.awt.Color(204, 204, 204));
        icono.setForeground(new java.awt.Color(36, 47, 58));
        icono.setBackgroundHover(new java.awt.Color(36, 47, 58));
        icono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono.setForegroundIcon(new java.awt.Color(36, 47, 58));
        icono.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        icono.setForegroundText(new java.awt.Color(36, 47, 58));
        icono.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SYSTEM_UPDATE_ALT);
        icono.setName(""); // NOI18N
        icono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(36, 47, 58));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 47, 58));
        jLabel7.setText("Registro Mercaderia");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESAR DETALLES DE MERCADERIA ENTRANTE");

        jpanelRound4.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound4.setRoundBottomLeft(20);
        jpanelRound4.setRoundBottomRight(20);
        jpanelRound4.setRoundTopLeft(20);
        jpanelRound4.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id-Ingreso");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de Producto");

        txtIdIng.setBackground(new java.awt.Color(255, 255, 255));
        txtIdIng.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtIdIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdIngActionPerformed(evt);
            }
        });

        txtNomPro.setBackground(new java.awt.Color(255, 255, 255));
        txtNomPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNomPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock");

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Ingreso");

        txtfechaIng.setBackground(new java.awt.Color(255, 255, 255));
        txtfechaIng.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtfechaIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaIngActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio de Compra");

        txtpreCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtpreCompra.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtpreCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreCompraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio de Venta");

        txtpreVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtpreVenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtpreVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreVentaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SubTotal");

        txtimpCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtimpCompra.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtimpCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimpCompraActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total");

        txtimpVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtimpVenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtimpVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimpVentaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Talla-Numero");

        txtTaNu.setBackground(new java.awt.Color(255, 255, 255));
        txtTaNu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTaNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaNuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTaNu, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtimpVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtimpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1)
                        .addComponent(txtIdIng, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(txtNomPro)
                        .addComponent(txtStock)
                        .addComponent(txtfechaIng)
                        .addComponent(txtpreCompra)
                        .addComponent(txtpreVenta)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpreCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpreVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtimpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtimpVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTaNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jpanelRound5.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound5.setRoundBottomLeft(20);
        jpanelRound5.setRoundBottomRight(20);
        jpanelRound5.setRoundTopLeft(20);
        jpanelRound5.setRoundTopRight(20);

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("id-Categoria");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre de Categoria");

        txtIdCat.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtIdCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCatActionPerformed(evt);
            }
        });

        txtCategorias.setBackground(new java.awt.Color(255, 255, 255));
        txtCategorias.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriasActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Info. Categorias");

        btnBuscarCategorias.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCategorias.setForeground(new java.awt.Color(36, 47, 58));
        btnBuscarCategorias.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarCategorias.setBorderPainted(false);
        btnBuscarCategorias.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarCategorias.setForegroundHover(new java.awt.Color(36, 47, 58));
        btnBuscarCategorias.setForegroundIcon(new java.awt.Color(36, 47, 58));
        btnBuscarCategorias.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        btnBuscarCategorias.setForegroundText(new java.awt.Color(36, 47, 58));
        btnBuscarCategorias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarCategorias.setRound(20);
        btnBuscarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound5Layout = new javax.swing.GroupLayout(jpanelRound5);
        jpanelRound5.setLayout(jpanelRound5Layout);
        jpanelRound5Layout.setHorizontalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound5Layout.createSequentialGroup()
                        .addGroup(jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRound5Layout.createSequentialGroup()
                        .addGroup(jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnBuscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jpanelRound5Layout.setVerticalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelRound5Layout.createSequentialGroup()
                        .addComponent(txtIdCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(btnBuscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jpanelRound6.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound6.setPreferredSize(new java.awt.Dimension(322, 165));
        jpanelRound6.setRoundBottomLeft(20);
        jpanelRound6.setRoundBottomRight(20);
        jpanelRound6.setRoundTopLeft(20);
        jpanelRound6.setRoundTopRight(20);

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("id-Proveedor");

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre de Proveedor");

        txtIdPro.setBackground(new java.awt.Color(255, 255, 255));
        txtIdPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtIdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProActionPerformed(evt);
            }
        });

        txtProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Info. Proveedor");

        btnBuscarProveedores.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarProveedores.setForeground(new java.awt.Color(36, 47, 58));
        btnBuscarProveedores.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarProveedores.setBorderPainted(false);
        btnBuscarProveedores.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarProveedores.setForegroundHover(new java.awt.Color(36, 47, 58));
        btnBuscarProveedores.setForegroundIcon(new java.awt.Color(36, 47, 58));
        btnBuscarProveedores.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        btnBuscarProveedores.setForegroundText(new java.awt.Color(36, 47, 58));
        btnBuscarProveedores.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarProveedores.setRound(20);
        btnBuscarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound6Layout = new javax.swing.GroupLayout(jpanelRound6);
        jpanelRound6.setLayout(jpanelRound6Layout);
        jpanelRound6Layout.setHorizontalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18))
                        .addContainerGap(112, Short.MAX_VALUE))
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnBuscarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jpanelRound6Layout.setVerticalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addComponent(txtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addComponent(btnBuscarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(20);
        jpanelRound2.setRoundBottomRight(20);
        jpanelRound2.setRoundTopLeft(20);
        jpanelRound2.setRoundTopRight(20);

        tblIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdIngreso", "Producto", "Stock", "Talla", "IdCategoria", "F. Ingreso", "Id Proveedor", "P. Compra", "P. Venta", "I. Compra", "I. Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblIngresos.setMinimumSize(new java.awt.Dimension(30, 80));
        tblIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngresosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblIngresos);
        if (tblIngresos.getColumnModel().getColumnCount() > 0) {
            tblIngresos.getColumnModel().getColumn(1).setMinWidth(100);
            tblIngresos.getColumnModel().getColumn(5).setMinWidth(80);
        }

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        btnRegistrarIngreso.setBackground(new java.awt.Color(36, 47, 58));
        btnRegistrarIngreso.setText("Registrar");
        btnRegistrarIngreso.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnRegistrarIngreso.setBorderPainted(false);
        btnRegistrarIngreso.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnRegistrarIngreso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RECEIPT);
        btnRegistrarIngreso.setRound(20);
        btnRegistrarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarIngresoActionPerformed(evt);
            }
        });

        btnBuscarIngreso.setBackground(new java.awt.Color(36, 47, 58));
        btnBuscarIngreso.setText("Buscar");
        btnBuscarIngreso.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarIngreso.setBorderPainted(false);
        btnBuscarIngreso.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarIngreso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarIngreso.setRound(20);
        btnBuscarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIngresoActionPerformed(evt);
            }
        });

        btnEditarIngreso.setBackground(new java.awt.Color(36, 47, 58));
        btnEditarIngreso.setText("Editar");
        btnEditarIngreso.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEditarIngreso.setBorderPainted(false);
        btnEditarIngreso.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEditarIngreso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarIngreso.setRound(20);
        btnEditarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIngresoActionPerformed(evt);
            }
        });

        btnEliminarIngreso.setBackground(new java.awt.Color(36, 47, 58));
        btnEliminarIngreso.setText("Eliminar");
        btnEliminarIngreso.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEliminarIngreso.setBorderPainted(false);
        btnEliminarIngreso.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEliminarIngreso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_SWEEP);
        btnEliminarIngreso.setRound(20);
        btnEliminarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void limpiarTextosIngresos() {
        txtIdIng.setText("");
        txtimpCompra.setText("");
        txtpreVenta.setText("");
        txtpreCompra.setText("");
        txtfechaIng.setText("");
        txtimpVenta.setText("");
        txtStock.setText("");
        txtTaNu.setText("");
        txtIdPro.setText("");
        txtIdCat.setText("");
        txtCategorias.setText("");
        txtNomPro.setText("");
        txtProveedor.setText("");
    }

    void limpiarTblIngresos() {
        for (int i = 0; i < modeloIngresos.getRowCount(); i++) {
            modeloIngresos.removeRow(i);
            i = 0 - 1;
        }
    }
    private void iconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoActionPerformed

    }//GEN-LAST:event_iconoActionPerformed

    private void txtNomProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProActionPerformed
        txtStock.requestFocus();
    }//GEN-LAST:event_txtNomProActionPerformed

    private void txtpreCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreCompraActionPerformed
        txtpreVenta.requestFocus();
    }//GEN-LAST:event_txtpreCompraActionPerformed

    private void txtpreVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreVentaActionPerformed
        // btnRegistrarClientes.doClick();
    }//GEN-LAST:event_txtpreVentaActionPerformed

    private void txtIdIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdIngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdIngActionPerformed

    private void txtimpCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimpCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimpCompraActionPerformed

    private void txtimpVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimpVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimpVentaActionPerformed

    private void txtCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriasActionPerformed

    private void txtIdCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCatActionPerformed

    private void txtIdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorActionPerformed

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked
    }//GEN-LAST:event_tblCategoriasMouseClicked

    private void btnBuscarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedoresActionPerformed
        BuscarProveedor bp = new BuscarProveedor();
        bp.setVisible(true);
    }//GEN-LAST:event_btnBuscarProveedoresActionPerformed

    private void btnBuscarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriasActionPerformed
        BuscarCategorias bct = new BuscarCategorias();
        bct.setVisible(true);
    }//GEN-LAST:event_btnBuscarCategoriasActionPerformed

    private void btnBuscarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngresoActionPerformed
        if (txtIdIng.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la búsqueda sin un ID de Ingresos.");
            limpiarTextosIngresos();
        } else {
            ing.setIdIngresos(Integer.parseInt(txtIdIng.getText()));

            if (conIng.buscarIngresos(ing)) {
                SimpleDateFormat dateInputFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat dateOutputFormat = new SimpleDateFormat("dd-MM-yyyy");

                String fechaFormateada = ing.getFechaIngreso();
                try {
                    Date fecha = dateInputFormat.parse(fechaFormateada);
                    fechaFormateada = dateOutputFormat.format(fecha);
                } catch (Exception e) {
                }
                txtIdIng.setText(String.valueOf(ing.getIdIngresos()));
                txtNomPro.setText(ing.getNombreProducto());
                txtStock.setText(String.valueOf(ing.getStock()));
                txtTaNu.setText(String.valueOf(ing.getTallaNumero()));
                txtIdCat.setText(String.valueOf(ing.getIdCategorias()));
                txtfechaIng.setText(fechaFormateada);
                txtIdPro.setText(String.valueOf(ing.getIdProveedor()));
                txtpreCompra.setText(String.valueOf(ing.getPrecioCompra()));
                txtpreVenta.setText(String.valueOf(ing.getPrecioVenta()));
                txtimpCompra.setText(String.valueOf(ing.getImporteCompra()));
                txtimpVenta.setText(String.valueOf(ing.getImporteVenta()));
            } else {
                JOptionPane.showMessageDialog(null, "Identificador de ingreso inexistente.");
                limpiarTextosIngresos();
            }
        }

    }//GEN-LAST:event_btnBuscarIngresoActionPerformed

    private void btnEditarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIngresoActionPerformed
        int fila = tblIngresos.getSelectedRow();

        if (fila == -1 && txtIdIng.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione o indique el ID de un ingreso.");
            return;
        }

        List<Ingresos> listaIngresos = conIng.listarIngresos();
        int idIngreso;

        try {
            idIngreso = Integer.parseInt(txtIdIng.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            return;
        }

        Ingresos ingresoActual = listaIngresos.stream()
                .filter(ing -> ing.getIdIngresos() == idIngreso)
                .findFirst()
                .orElse(null);

        if (ingresoActual == null) {
            JOptionPane.showMessageDialog(null, "Error: No se puede modificar porque el ingreso no está registrado.");
            return;
        }

        String nombreProductoOriginal = ingresoActual.getNombreProducto();
        int stockOriginal = ingresoActual.getStock();
        double precioCompraOriginal = ingresoActual.getPrecioCompra();
        double precioVentaOriginal = ingresoActual.getPrecioVenta();
        String fechaIngresoOriginal = ingresoActual.getFechaIngreso();
        int idProveedorOriginal = ingresoActual.getIdProveedor();
        int idCategoriaOriginal = ingresoActual.getIdCategorias();
        String tallaOriginal = ingresoActual.getTallaNumero();

        String nuevoNombreProducto = txtNomPro.getText().trim();
        int nuevoStock = stockOriginal;
        double nuevoPrecioCompra = precioCompraOriginal;
        double nuevoPrecioVenta = precioVentaOriginal;
        String nuevaFechaIngreso = txtfechaIng.getText().trim();
        int nuevoIdProveedor = idProveedorOriginal;
        int nuevoIdCategoria = idCategoriaOriginal;
        String nuevaTalla = txtTaNu.getText().trim();

        boolean hayCambios = false;

        if (!nuevoNombreProducto.isEmpty() && !nuevoNombreProducto.equals(nombreProductoOriginal)) {
            ingresoActual.setNombreProducto(nuevoNombreProducto);
            hayCambios = true;
        }

        if (!txtStock.getText().trim().isEmpty()) {
            try {
                nuevoStock = Integer.parseInt(txtStock.getText().trim());
                if (nuevoStock != stockOriginal) {
                    ingresoActual.setStock(nuevoStock);
                    hayCambios = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un stock válido.");
                return;
            }
        }

        if (!txtpreCompra.getText().trim().isEmpty()) {
            try {
                nuevoPrecioCompra = Double.parseDouble(txtpreCompra.getText().trim());
                if (nuevoPrecioCompra != precioCompraOriginal) {
                    ingresoActual.setPrecioCompra(nuevoPrecioCompra);
                    hayCambios = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un precio de compra válido.");
                return;
            }
        }

        if (!txtpreVenta.getText().trim().isEmpty()) {
            try {
                nuevoPrecioVenta = Double.parseDouble(txtpreVenta.getText().trim());
                if (nuevoPrecioVenta != precioVentaOriginal) {
                    ingresoActual.setPrecioVenta(nuevoPrecioVenta);
                    hayCambios = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un precio de venta válido.");
                return;
            }
        }

        if (!nuevaFechaIngreso.isEmpty() && !nuevaFechaIngreso.equals(fechaIngresoOriginal)) {
            try {
                SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd-MM-yyyy");
                SimpleDateFormat formatoSalida = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha = formatoEntrada.parse(nuevaFechaIngreso);
                String fechaConvertida = formatoSalida.format(fecha);
                ingresoActual.setFechaIngreso(fechaConvertida);
                hayCambios = true;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una fecha válida en formato DD-MM-YYYY.");
                return;
            } catch (java.text.ParseException ex) {
                Logger.getLogger(VIngresos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (!txtIdPro.getText().trim().isEmpty()) {
            try {
                nuevoIdProveedor = Integer.parseInt(txtIdPro.getText().trim());
                if (nuevoIdProveedor != idProveedorOriginal) {
                    ingresoActual.setIdProveedor(nuevoIdProveedor);
                    hayCambios = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de proveedor válido.");
                return;
            }
        }

        if (!txtIdCat.getText().trim().isEmpty()) {
            try {
                nuevoIdCategoria = Integer.parseInt(txtIdCat.getText().trim());
                if (nuevoIdCategoria != idCategoriaOriginal) {
                    ingresoActual.setIdCategorias(nuevoIdCategoria);
                    hayCambios = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de categoría válido.");
                return;
            }
        }

        if (!nuevaTalla.isEmpty() && !nuevaTalla.equals(tallaOriginal)) {
            boolean tallaExiste = listaIngresos.stream()
                    .anyMatch(ing -> ing.getTallaNumero().equals(nuevaTalla) && ing.getIdIngresos() != idIngreso);
            if (tallaExiste) {
                JOptionPane.showMessageDialog(null, "La talla ya existe en otro registro. No se puede modificar.");
                return;
            } else {
                ingresoActual.setTallaNumero(nuevaTalla);
                hayCambios = true;
            }
        }

        if (!hayCambios) {
            JOptionPane.showMessageDialog(null, "No se ha modificado ningún campo.");
            return;
        }

        double nuevoImporteCompra = ingresoActual.getImporteCompra();
        double nuevoImporteVenta = ingresoActual.getImporteVenta();

        if (nuevoStock != stockOriginal || nuevoPrecioCompra != precioCompraOriginal) {
            nuevoImporteCompra = nuevoPrecioCompra * nuevoStock;
            ingresoActual.setImporteCompra(nuevoImporteCompra);
        }

        if (nuevoStock != stockOriginal || nuevoPrecioVenta != precioVentaOriginal) {
            nuevoImporteVenta = nuevoPrecioVenta * nuevoStock;
            ingresoActual.setImporteVenta(nuevoImporteVenta);
        }

        if (conIng.editarIngresos(ingresoActual)) {
            JOptionPane.showMessageDialog(null, "¡Modificación exitosa!");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el ingreso.");
        }

        limpiarTblIngresos();
        listarIng();
        limpiarTextosIngresos();
    }//GEN-LAST:event_btnEditarIngresoActionPerformed

    private void btnEliminarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIngresoActionPerformed
        if (!txtIdIng.getText().isEmpty()) {
            int idIngreso;
            try {
                idIngreso = Integer.parseInt(txtIdIng.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
                return;
            }
            List<Ingresos> listaIngresos = conIng.listarIngresos();
            boolean idExiste = listaIngresos.stream().anyMatch(ing -> ing.getIdIngresos() == idIngreso);

            if (!idExiste) {
                JOptionPane.showMessageDialog(null, "Error: El ID del ingreso no existe.");
                return;
            }
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el ingreso?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                Ingresos ing = new Ingresos();
                ing.setIdIngresos(idIngreso);
                if (conIng.eliminarIngresos(ing)) {
                    limpiarTblIngresos();
                    listarIng();
                    limpiarTextosIngresos();
                    JOptionPane.showMessageDialog(null, "Se eliminó con éxito el ingreso.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el ingreso.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar, seleccione un ingreso.");
        }
    }//GEN-LAST:event_btnEliminarIngresoActionPerformed

    private void tblIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngresosMouseClicked
        int fila = tblIngresos.getSelectedRow();
        txtIdIng.setText(tblIngresos.getValueAt(fila, 0).toString());
        txtNomPro.setText(tblIngresos.getValueAt(fila, 1).toString());
        txtStock.setText(tblIngresos.getValueAt(fila, 2).toString());
        txtTaNu.setText(tblIngresos.getValueAt(fila, 3).toString());
        txtIdCat.setText(tblIngresos.getValueAt(fila, 4).toString());
        txtfechaIng.setText(tblIngresos.getValueAt(fila, 5).toString());
        txtIdPro.setText(tblIngresos.getValueAt(fila, 6).toString());
        txtpreCompra.setText(tblIngresos.getValueAt(fila, 7).toString());
        txtpreVenta.setText(tblIngresos.getValueAt(fila, 8).toString());
        txtimpCompra.setText(tblIngresos.getValueAt(fila, 9).toString());
        txtimpVenta.setText(tblIngresos.getValueAt(fila, 10).toString());
    }//GEN-LAST:event_tblIngresosMouseClicked

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed

    }//GEN-LAST:event_txtStockActionPerformed

    private void txtfechaIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaIngActionPerformed
        txtpreCompra.requestFocus();
    }//GEN-LAST:event_txtfechaIngActionPerformed

    private void btnRegistrarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarIngresoActionPerformed
        if (txtNomPro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de nombre de producto no puede estar vacío.");
            return;
        }
        if (txtTaNu.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de talla no puede estar vacío.");
            return;
        }
        if (txtStock.getText().trim().isEmpty() || !txtStock.getText().trim().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El campo de stock debe ser numérico.");
            return;
        }
        if (txtpreCompra.getText().trim().isEmpty() || !txtpreCompra.getText().trim().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo de precio de compra debe ser un número válido.");
            return;
        }
        if (txtpreVenta.getText().trim().isEmpty() || !txtpreVenta.getText().trim().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo de precio de venta debe ser un número válido.");
            return;
        }
        if (txtfechaIng.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de fecha de ingreso no puede estar vacío.");
            return;
        }
        String fechaIngreso = txtfechaIng.getText().trim();
        if (!fechaIngreso.matches("\\d{2}-\\d{2}-\\d{4}")) {
            JOptionPane.showMessageDialog(null, "El campo de fecha debe tener el formato: día-mes-año (dd-MM-yyyy).");
            return;
        }
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
            inputFormat.setLenient(false);
            Date fechaValida = inputFormat.parse(fechaIngreso);

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaMysql = outputFormat.format(fechaValida);

            Ingresos nuevoProducto = new Ingresos();
            nuevoProducto.setNombreProducto(txtNomPro.getText().trim());
            nuevoProducto.setTallaNumero(txtTaNu.getText().trim());
            nuevoProducto.setStock(Integer.parseInt(txtStock.getText().trim()));
            nuevoProducto.setFechaIngreso(fechaMysql);
            nuevoProducto.setPrecioCompra(Double.parseDouble(txtpreCompra.getText().trim()));
            nuevoProducto.setPrecioVenta(Double.parseDouble(txtpreVenta.getText().trim()));
            nuevoProducto.setIdCategorias(Integer.parseInt(txtIdCat.getText().trim()));
            nuevoProducto.setIdProveedor(Integer.parseInt(txtIdPro.getText().trim()));

            double subtotal = nuevoProducto.getStock() * nuevoProducto.getPrecioCompra();
            nuevoProducto.setImporteCompra(subtotal);

            double total = nuevoProducto.getStock() * nuevoProducto.getPrecioVenta();
            nuevoProducto.setImporteVenta(total);

            List<Ingresos> listaProductos = conIng.listarIngresos();
            boolean productoExiste = listaProductos.stream()
                    .anyMatch(producto -> txtNomPro.getText().trim().equalsIgnoreCase(producto.getNombreProducto())
                    && txtTaNu.getText().trim().equalsIgnoreCase(producto.getTallaNumero()));

            if (productoExiste) {
                JOptionPane.showMessageDialog(null, "El producto con ese nombre y talla ya existe.");
                return;
            }

            if (conIng.reinicioIngresos(nuevoProducto)) {
                JOptionPane.showMessageDialog(null, "Producto registrado");
                limpiarTblIngresos();
                listarIng();
                limpiarTextosIngresos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el producto.");
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarIngresoActionPerformed

    private void txtTaNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaNuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarCategorias;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarIngreso;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarProveedores;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditarIngreso;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminarIngreso;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRegistrarIngreso;
    private RSMaterialComponent.RSButtonMaterialIconDos icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private Modelado.JpanelRound jpanelRound1;
    private Modelado.JpanelRound jpanelRound2;
    private Modelado.JpanelRound jpanelRound4;
    private Modelado.JpanelRound jpanelRound5;
    private Modelado.JpanelRound jpanelRound6;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTable tblIngresos;
    public static javax.swing.JTextField txtCategorias;
    public static javax.swing.JTextField txtIdCat;
    private javax.swing.JTextField txtIdIng;
    public static javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtNomPro;
    public static javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTaNu;
    private javax.swing.JTextField txtfechaIng;
    private javax.swing.JTextField txtimpCompra;
    private javax.swing.JTextField txtimpVenta;
    private javax.swing.JTextField txtpreCompra;
    private javax.swing.JTextField txtpreVenta;
    // End of variables declaration//GEN-END:variables
}
