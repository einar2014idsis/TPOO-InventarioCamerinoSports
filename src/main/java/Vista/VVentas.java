package Vista;

import Control.ControlDetallesVentas;
import Control.ControlVentas;
import Modelado.Conexion;
import Modelado.Ventas;
import com.formdev.flatlaf.json.ParseException;
import java.io.File;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class VVentas extends javax.swing.JPanel {

    ControlVentas conVen = new ControlVentas();
    ControlDetallesVentas conDeVen = new ControlDetallesVentas();
    DefaultTableModel modeloVentas = new DefaultTableModel();

    public VVentas() {
        initComponents();
        numVentas();
    }

    private void numVentas() {
        String numero = conVen.numVenta();
        if (numero == null) {
            txtNumVenta.setText("00001");
        } else {
            int i = parseInt(numero);
            i = i + 1;
            txtNumVenta.setText(format("%05d", i));
        }
    }

    private void limpiarFormularioVenta() {
        txtSubTotal.setText("");
        txtIGV.setText("");
        txtTotal.setText("");
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
        btnAñadir = new RSMaterialComponent.RSButtonMaterialIconDos();
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
        txtFeVenta = new javax.swing.JTextField();
        txtTaNu = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        btnNuevaVenta = new RSMaterialComponent.RSButtonMaterialIconDos();
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
        txtNumVenta = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

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

        btnAñadir.setBackground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("AÑADIR AL CARRITO");
        btnAñadir.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnAñadir.setBorderPainted(false);
        btnAñadir.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnAñadir.setForegroundHover(new java.awt.Color(36, 47, 58));
        btnAñadir.setForegroundIcon(new java.awt.Color(36, 47, 58));
        btnAñadir.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        btnAñadir.setForegroundText(new java.awt.Color(36, 47, 58));
        btnAñadir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOPPING_CART);
        btnAñadir.setRound(20);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
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
                        .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelRound8Layout.setVerticalGroup(
            jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
                .addGap(41, 41, 41)
                .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdVentas", "IdIngresos", "Producto", "StockSalida", "Precio unidad", "Total"
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

        txtFeVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtFeVenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeVentaActionPerformed(evt);
            }
        });

        txtTaNu.setBackground(new java.awt.Color(255, 255, 255));
        txtTaNu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTaNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaNuActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Talla/Numero");

        btnNuevaVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevaVenta.setForeground(new java.awt.Color(36, 47, 58));
        btnNuevaVenta.setText("Nueva venta");
        btnNuevaVenta.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnNuevaVenta.setBorderPainted(false);
        btnNuevaVenta.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnNuevaVenta.setForegroundHover(new java.awt.Color(36, 47, 58));
        btnNuevaVenta.setForegroundIcon(new java.awt.Color(36, 47, 58));
        btnNuevaVenta.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        btnNuevaVenta.setForegroundText(new java.awt.Color(36, 47, 58));
        btnNuevaVenta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ROTATE_LEFT);
        btnNuevaVenta.setRound(20);
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
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
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelRound6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                                        .addComponent(txtFeVenta)
                                        .addGap(102, 102, 102)))
                                .addComponent(btnBuscarIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel35))
                                    .addComponent(jLabel28)
                                    .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound6Layout.createSequentialGroup()
                                .addComponent(txtPreVen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTaNu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jpanelRound6Layout.setVerticalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
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
                    .addComponent(jLabel29)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound6Layout.createSequentialGroup()
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStockSaliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        txtNumVenta.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        txtNumVenta.setForeground(new java.awt.Color(0, 0, 0));
        txtNumVenta.setText("-------");

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("N° de Venta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumVenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpanelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpanelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icono1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(4, 4, 4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelRound9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void icono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono1ActionPerformed

    }//GEN-LAST:event_icono1ActionPerformed

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
        int fila = tblVentas.getSelectedRow();
        txtIdCli.setText(tblVentas.getValueAt(fila, 2).toString());
        txtIdIng.setText(tblVentas.getValueAt(fila, 1).toString());
        txtStockSaliente.setText(tblVentas.getValueAt(fila, 3).toString());
        txtFeVenta.setText(tblVentas.getValueAt(fila, 4).toString());
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
        BuscarClientes bc = new BuscarClientes();
        bc.setVisible(true);
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void btnBuscarIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngresosActionPerformed
        BuscarIngresos bi = new BuscarIngresos();
        bi.setVisible(true);
    }//GEN-LAST:event_btnBuscarIngresosActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        if (txtNumVenta.getText().trim().isEmpty()) {
            showMessageDialog(null, "El número de venta no puede estar vacío.");
            return;
        }
        if (txtIdCli.getText().trim().isEmpty() || !txtIdCli.getText().trim().matches("\\d+")) {
            showMessageDialog(null, "El campo de ID de cliente debe ser un número válido.");
            return;
        }
        if (txtTotal.getText().trim().isEmpty() || !txtTotal.getText().trim().matches("\\d+(\\.\\d+)?")) {
            showMessageDialog(null, "El campo de total debe ser un número válido.");
            return;
        }
        if (txtFeVenta.getText().trim().isEmpty()) {
            showMessageDialog(null, "El campo de fecha de venta no puede estar vacío.");
            return;
        }

        String fechaSalida = txtFeVenta.getText().trim();
        if (!fechaSalida.matches("\\d{2}-\\d{2}-\\d{4}")) {
            showMessageDialog(null, "El campo de fecha debe tener el formato: día-mes-año (dd-MM-yyyy).");
            return;
        }

        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
            inputFormat.setLenient(false);
            Date fechaValida = inputFormat.parse(fechaSalida);

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaMysql = outputFormat.format(fechaValida);

            double total = parseDouble(txtTotal.getText().trim());
            double subtotal = total / 1.18;
            double igv = total - subtotal;

            txtSubTotal.setText(format("%.2f", subtotal));
            txtIGV.setText(format("%.2f", igv));
            txtTotal.setText(format("%.2f", total));

            Ventas nuevaVenta = new Ventas();
            nuevaVenta.setNumVenta(txtNumVenta.getText().trim());
            nuevaVenta.setIdClientes(parseInt(txtIdCli.getText().trim()));
            nuevaVenta.setSubtotal((float) subtotal);
            nuevaVenta.setIgv((float) igv);
            nuevaVenta.setTotal((float) total);
            nuevaVenta.setFechaVenta(fechaMysql);

            if (conVen.reinicioVentas(nuevaVenta)) {
                showMessageDialog(null, "Venta registrada");
                mostrarReporte(txtNumVenta.getText());
                numVentas();
                guardarDeVenta();
                limpiarFormularioVenta();
            } else {
                showMessageDialog(null, "No se pudo registrar la venta.");
            }
        } catch (ParseException e) {
            showMessageDialog(null, "La fecha ingresada no es válida: " + e.getMessage());
        } catch (NumberFormatException e) {
            showMessageDialog(null, "Por favor ingresa un número válido: " + e.getMessage());
        } catch (Exception e) {
            showMessageDialog(null, "Ha ocurrido un error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void txtFeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeVentaActionPerformed

    private void txtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGVActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        RegistrarEntradas();
        limpiarProductos();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtTaNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaNuActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        numVentas();
        limpiarProductos();
        limpiarClientes();
        limpiarTablaVentas();
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void RegistrarEntradas() {
        double precio, importe, total = 0, subtotal = 0, igv = 0;
        modeloVentas = (DefaultTableModel) tblVentas.getModel();
        int idVentas = parseInt(txtNumVenta.getText());
        int idIngresos = parseInt(txtIdIng.getText());
        int cantidad = parseInt(txtStockSaliente.getText());
        String producto = txtNomPro.getText();
        if (txtPreVen.getText().matches("\\d+(\\.\\d+)?")) {
            precio = parseDouble(txtPreVen.getText());
        } else {
            showMessageDialog(null, "Por favor ingresa un número válido para el precio.");
            return;
        }
        importe = cantidad * precio;
        int stockDisponible = parseInt(txtStockDisponible.getText());
        ArrayList<Object> lista = new ArrayList<>();

        if (stockDisponible > 0 && cantidad <= stockDisponible) {
            lista.add(idVentas);
            lista.add(idIngresos);
            lista.add(producto);
            lista.add(cantidad);
            lista.add(precio);
            lista.add(importe);

            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            modeloVentas.addRow(ob);
            tblVentas.setModel(modeloVentas);

            for (int i = 0; i < modeloVentas.getRowCount(); i++) {
                double importeActual = (double) modeloVentas.getValueAt(i, 5);
                subtotal += importeActual / 1.18;
                igv += importeActual - (importeActual / 1.18);
                total += importeActual;
            }
            txtSubTotal.setText(format("%.2f", subtotal));
            txtIGV.setText(format("%.2f", igv));
            txtTotal.setText(format("%.2f", total));
        } else {
            showMessageDialog(null, "Stock insuficiente!!!");
        }
    }

    private void guardarDeVenta() {
        for (int i = 0; i < tblVentas.getRowCount(); i++) {
            int idVentas = parseInt(tblVentas.getValueAt(i, 0).toString());
            int idIngresos = parseInt(tblVentas.getValueAt(i, 1).toString());
            int cantidad = parseInt(tblVentas.getValueAt(i, 3).toString());
            double importe = parseDouble(tblVentas.getValueAt(i, 5).toString());
            conDeVen.registrarDeVentas(idVentas, idIngresos, cantidad, importe);
        }
    }

    private void limpiarProductos() {
        txtIdIng.setText("");
        txtNomPro.setText("");
        txtStockDisponible.setText("");
        txtPreVen.setText("");
        txtTaNu.setText("");
        txtStockSaliente.setText("");
    }

    private void limpiarClientes() {
        txtIdCli.setText("");
        txtDocumento.setText("");
        txtTelCli.setText("");
        txtNomCli.setText("");
    }

    private void limpiarTablaVentas() {
        for (int i = 0; i < modeloVentas.getRowCount(); i++) {
            modeloVentas.removeRow(i);
            i = 0 - 1;
        }
        txtSubTotal.setText("");
        txtIGV.setText("");
        txtTotal.setText("");
        txtFeVenta.setText("");
    }

    private Connection conection = new Conexion().conectar();

    private void mostrarReporte(String numVentas) {
        if (numVentas == null || numVentas.isEmpty()) {
            System.err.println("Error: Número de Venta no válido.");
            return;
        }

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("NumeroVenta", numVentas);

        try {
            String rutaReporte = new File("").getAbsolutePath() + "/src/main/java/Reportes/RVentas.jrxml";

            File archivoReporte = new File(rutaReporte);
            if (!archivoReporte.exists()) {
                System.err.println("Error: El archivo del reporte no se encontró en la ruta: " + rutaReporte);
                return;
            }

            if (conection == null || conection.isClosed()) {
                System.err.println("Error: No se pudo establecer conexión con la base de datos.");
                return;
            }

            JasperReport reporte = JasperCompileManager.compileReport(rutaReporte);
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros, conection);

            if (imprimir.getPages().isEmpty()) {
                System.out.println("No hay datos para mostrar en el reporte.");
                return;
            }

            JasperViewer vistaReporte = new JasperViewer(imprimir, false);
            vistaReporte.setTitle("Reporte de Venta N° " + numVentas);
            vistaReporte.setVisible(true);

        } catch (JRException | SQLException e) {
            e.printStackTrace();
            System.err.println("Error al generar el reporte: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnAñadir;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarIngresos;
    private RSMaterialComponent.RSButtonMaterialIconDos btnNuevaVenta;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRegistrarVenta;
    private RSMaterialComponent.RSButtonMaterialIconDos icono1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private Modelado.JpanelRound jpanelRound6;
    private Modelado.JpanelRound jpanelRound8;
    private Modelado.JpanelRound jpanelRound9;
    private javax.swing.JTable tblVentas;
    public static javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFeVenta;
    private javax.swing.JTextField txtIGV;
    public static javax.swing.JTextField txtIdCli;
    public static javax.swing.JTextField txtIdIng;
    public static javax.swing.JTextField txtNomCli;
    public static javax.swing.JTextField txtNomPro;
    private javax.swing.JLabel txtNumVenta;
    public static javax.swing.JTextField txtPreVen;
    public static javax.swing.JTextField txtStockDisponible;
    private javax.swing.JTextField txtStockSaliente;
    private javax.swing.JTextField txtSubTotal;
    public static javax.swing.JTextField txtTaNu;
    public static javax.swing.JTextField txtTelCli;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
