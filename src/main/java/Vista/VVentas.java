package Vista;

import Control.ControlClientes;
import Control.ControlIngresos;
import Control.ControlVentas;
import Modelado.Clientes;
import Modelado.Ingresos;
import Modelado.Ventas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VVentas extends javax.swing.JPanel {

    Ventas ven = new Ventas();
    Clientes cli = new Clientes();
    Ingresos ing = new Ingresos();
    ControlVentas conVen = new ControlVentas();
    ControlClientes conCli = new ControlClientes();
    ControlIngresos conIng = new ControlIngresos();
    DefaultTableModel modeloVentas = new DefaultTableModel();

    public VVentas() {
        initComponents();
        listarVen();
    }

    private void listarVen() {
        List<Ventas> lista = conVen.listarVentas();
        modeloVentas = (DefaultTableModel) tblVentas.getModel();
        Object[] ob = new Object[10];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdVentas();
            ob[1] = lista.get(i).getIdIngresos();
            ob[2] = lista.get(i).getIdClientes();
            ob[3] = lista.get(i).getCantidad();
            ob[4] = lista.get(i).getFechaVenta();
            ob[5] = lista.get(i).getSubtotal();
            ob[6] = lista.get(i).getIgv();
            ob[7] = lista.get(i).getTotal();
            modeloVentas.addRow(ob);
        }
        tblVentas.setModel(modeloVentas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpanelRound8 = new Modelado.JpanelRound();
        jLabel23 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnRegistrarVenta = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel24 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jpanelRound6 = new Modelado.JpanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdIng = new javax.swing.JTextField();
        txtStockDisponible = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtStockSaliente = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNomPro = new javax.swing.JTextField();
        txtPreVen = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        btnBuscarIngresos = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel36 = new javax.swing.JLabel();
        txtFeVenta1 = new javax.swing.JTextField();
        jpanelRound9 = new Modelado.JpanelRound();
        jLabel31 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtTelCli = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtNomCli = new javax.swing.JTextField();
        btnBuscarClientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel30 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        icono1.setBackground(new java.awt.Color(204, 204, 204));
        icono1.setForeground(new java.awt.Color(36, 47, 58));
        icono1.setBackgroundHover(new java.awt.Color(36, 47, 58));
        icono1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono1.setForegroundIcon(new java.awt.Color(36, 47, 58));
        icono1.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        icono1.setForegroundText(new java.awt.Color(36, 47, 58));
        icono1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOPPING_CART);
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
        jLabel7.setText("Registro de Ventas");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESAR DETALLES DE VENTA");

        jpanelRound8.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound8.setRoundBottomLeft(20);
        jpanelRound8.setRoundBottomRight(20);
        jpanelRound8.setRoundTopLeft(20);
        jpanelRound8.setRoundTopRight(20);

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Sub-Total:");

        txtSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Total:");

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("VENTA");
        btnRegistrarVenta.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnRegistrarVenta.setBorderPainted(false);
        btnRegistrarVenta.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnRegistrarVenta.setForegroundHover(new java.awt.Color(36, 47, 58));
        btnRegistrarVenta.setForegroundIcon(new java.awt.Color(36, 47, 58));
        btnRegistrarVenta.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        btnRegistrarVenta.setForegroundText(new java.awt.Color(36, 47, 58));
        btnRegistrarVenta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RECEIPT);
        btnRegistrarVenta.setRound(20);
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("IGV:");

        txtIGV.setBackground(new java.awt.Color(255, 255, 255));
        txtIGV.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtIGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIGVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound8Layout = new javax.swing.GroupLayout(jpanelRound8);
        jpanelRound8.setLayout(jpanelRound8Layout);
        jpanelRound8Layout.setHorizontalGroup(
            jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound8Layout.createSequentialGroup()
                        .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpanelRound8Layout.createSequentialGroup()
                        .addGroup(jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTotal)
                            .addComponent(txtTotal)
                            .addComponent(txtIGV))
                        .addGap(36, 36, 36))))
        );
        jpanelRound8Layout.setVerticalGroup(
            jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdVentas", "IdIngresos", "IdClientes", "StockSalida", "F. Venta", "SubTotal", "Total"
            }
        ));
        tblVentas.setMinimumSize(new java.awt.Dimension(30, 80));
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVentas);

        jpanelRound6.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound6.setRoundBottomLeft(20);
        jpanelRound6.setRoundBottomRight(20);
        jpanelRound6.setRoundTopLeft(20);
        jpanelRound6.setRoundTopRight(20);

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("id-Ingreso");

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Stock");

        txtIdIng.setBackground(new java.awt.Color(255, 255, 255));
        txtIdIng.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtIdIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdIngActionPerformed(evt);
            }
        });

        txtStockDisponible.setBackground(new java.awt.Color(255, 255, 255));
        txtStockDisponible.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtStockDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockDisponibleActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Info. Ingresos");

        jLabel26.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Stock de Salida");

        txtStockSaliente.setBackground(new java.awt.Color(255, 255, 255));
        txtStockSaliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtStockSaliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockSalienteActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nombre de Producto");

        txtNomPro.setBackground(new java.awt.Color(255, 255, 255));
        txtNomPro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNomPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProActionPerformed(evt);
            }
        });

        txtPreVen.setBackground(new java.awt.Color(255, 255, 255));
        txtPreVen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtPreVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreVenActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Precio de Venta");

        btnBuscarIngresos.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarIngresos.setForeground(new java.awt.Color(36, 47, 58));
        btnBuscarIngresos.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarIngresos.setBorderPainted(false);
        btnBuscarIngresos.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarIngresos.setForegroundHover(new java.awt.Color(36, 47, 58));
        btnBuscarIngresos.setForegroundIcon(new java.awt.Color(36, 47, 58));
        btnBuscarIngresos.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        btnBuscarIngresos.setForegroundText(new java.awt.Color(36, 47, 58));
        btnBuscarIngresos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarIngresos.setRound(20);
        btnBuscarIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIngresosActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Fecha de Venta");

        txtFeVenta1.setBackground(new java.awt.Color(255, 255, 255));
        txtFeVenta1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFeVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeVenta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound6Layout = new javax.swing.GroupLayout(jpanelRound6);
        jpanelRound6.setLayout(jpanelRound6Layout);
        jpanelRound6Layout.setHorizontalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addComponent(txtIdIng)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(txtStockDisponible)
                    .addComponent(txtStockSaliente)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomPro)
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreVen, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFeVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnBuscarIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelRound6Layout.setVerticalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStockSaliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFeVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscarIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelRound9.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound9.setRoundBottomLeft(20);
        jpanelRound9.setRoundBottomRight(20);
        jpanelRound9.setRoundTopLeft(20);
        jpanelRound9.setRoundTopRight(20);

        jLabel31.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Documento");

        txtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Info. Clientes");

        jLabel33.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Telefono");

        txtTelCli.setBackground(new java.awt.Color(255, 255, 255));
        txtTelCli.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelCliActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Nombres de Cliente");

        txtNomCli.setBackground(new java.awt.Color(255, 255, 255));
        txtNomCli.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomCliActionPerformed(evt);
            }
        });

        btnBuscarClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarClientes.setForeground(new java.awt.Color(36, 47, 58));
        btnBuscarClientes.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarClientes.setBorderPainted(false);
        btnBuscarClientes.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarClientes.setForegroundHover(new java.awt.Color(36, 47, 58));
        btnBuscarClientes.setForegroundIcon(new java.awt.Color(36, 47, 58));
        btnBuscarClientes.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        btnBuscarClientes.setForegroundText(new java.awt.Color(36, 47, 58));
        btnBuscarClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarClientes.setRound(20);
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("id-Cliente");

        txtIdCli.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCli.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtIdCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound9Layout = new javax.swing.GroupLayout(jpanelRound9);
        jpanelRound9.setLayout(jpanelRound9Layout);
        jpanelRound9Layout.setHorizontalGroup(
            jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocumento)
                    .addComponent(txtIdCli)
                    .addComponent(txtTelCli)
                    .addGroup(jpanelRound9Layout.createSequentialGroup()
                        .addGroup(jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addGroup(jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound9Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addContainerGap(212, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound9Layout.createSequentialGroup()
                        .addGroup(jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomCli)
                            .addGroup(jpanelRound9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jpanelRound9Layout.setVerticalGroup(
            jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound9Layout.createSequentialGroup()
                        .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpanelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpanelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(icono1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void icono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono1ActionPerformed

    }//GEN-LAST:event_icono1ActionPerformed

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
        int fila = tblVentas.getSelectedRow();
        txtIdCli.setText(tblVentas.getValueAt(fila, 2).toString());
        txtIdIng.setText(tblVentas.getValueAt(fila, 1).toString());
        txtStockSaliente.setText(tblVentas.getValueAt(fila, 3).toString());
        txtFeVenta1.setText(tblVentas.getValueAt(fila, 4).toString());
        txtSubTotal.setText(tblVentas.getValueAt(fila, 5).toString());
        txtTotal.setText(tblVentas.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tblVentasMouseClicked

    private void txtIdIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdIngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdIngActionPerformed

    private void txtStockDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockDisponibleActionPerformed

    private void txtStockSalienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockSalienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockSalienteActionPerformed

    private void txtNomProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProActionPerformed

    private void txtPreVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreVenActionPerformed

    private void txtIdCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCliActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtTelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelCliActionPerformed

    private void txtNomCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomCliActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
        if (txtDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la búsqueda sin un documento.");
        } else {
            Clientes cliente = new Clientes();
            String documento = txtDocumento.getText().trim();
            try {
                int dni = Integer.parseInt(documento);
                cliente.setDniCliente(dni);
            } catch (NumberFormatException e) {
                cliente.setRucCliente(documento);
            }

            if (conCli.buscarClientes(cliente)) {
                txtIdCli.setText(String.valueOf(cliente.getIdClientes()));
                txtNomCli.setText(cliente.getNombreCliente() + " " + cliente.getApellidoCliente());
                txtDocumento.setText(documento);
                txtTelCli.setText(String.valueOf(cliente.getTelefonoCliente()));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }
        }
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void btnBuscarIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngresosActionPerformed
        if (txtIdIng.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la búsqueda sin un ID de Ingresos.");
        } else {
            ing.setIdIngresos(Integer.parseInt(txtIdIng.getText()));

            if (conIng.buscarIngresos(ing)) {
                txtStockDisponible.setText(String.valueOf(ing.getStock()));
                txtNomPro.setText(ing.getNombreProducto());
                txtPreVen.setText(String.valueOf(ing.getPrecioVenta()));
            } else {
                JOptionPane.showMessageDialog(null, "Identificador de ingreso inexistente.");
            }
        }
    }//GEN-LAST:event_btnBuscarIngresosActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        if (txtNomPro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto antes de realizar la venta.");
            return;
        }

        try {
            int cantidadVendida = Integer.parseInt(txtStockSaliente.getText());
            int stockDisponible = Integer.parseInt(txtStockDisponible.getText());
            double precioVenta = Double.parseDouble(txtPreVen.getText()); 
            if (cantidadVendida <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad a vender debe ser un número positivo.");
                return;
            }
            if (cantidadVendida > stockDisponible) {
                JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible para realizar la venta.");
                return;
            }
            double subtotal = cantidadVendida * precioVenta;
            double igv = subtotal * 0.18;
            double total = subtotal + igv;
            stockDisponible -= cantidadVendida;
            txtStockDisponible.setText(String.valueOf(stockDisponible));
            txtStockSaliente.setText(String.valueOf(cantidadVendida));
            txtSubTotal.setText(String.format("%.2f", subtotal));
            txtIGV.setText(String.format("%.2f", igv));
            txtTotal.setText(String.format("%.2f", total));
            Ventas venta = new Ventas();
            venta.setIdIngresos(Integer.parseInt(txtIdIng.getText().trim()));
            venta.setIdClientes(Integer.parseInt(txtIdCli.getText().trim()));
            venta.setCantidad(Integer.parseInt(txtStockSaliente.getText().trim()));
            venta.setFechaVenta(txtFeVenta1.getText().trim());
            venta.setSubtotal(Float.parseFloat(txtSubTotal.getText().trim()));
            venta.setIgv(Float.parseFloat(txtIGV.getText().trim()));
            venta.setTotal(Float.parseFloat(txtTotal.getText().trim()));
            if (conVen.registrarVentas(venta)) {
                JOptionPane.showMessageDialog(null, "Venta registrada exitosamente");
                listarVen();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar la venta.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad a vender y los precios deben ser valores numéricos válidos.");
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void txtFeVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeVenta1ActionPerformed

    private void txtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarIngresos;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRegistrarVenta;
    private RSMaterialComponent.RSButtonMaterialIconDos icono1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound6;
    private Modelado.JpanelRound jpanelRound8;
    private Modelado.JpanelRound jpanelRound9;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFeVenta1;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtIdIng;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtNomPro;
    private javax.swing.JTextField txtPreVen;
    private javax.swing.JTextField txtStockDisponible;
    private javax.swing.JTextField txtStockSaliente;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelCli;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
