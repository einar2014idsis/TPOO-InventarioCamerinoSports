package Vista;

import Control.ControlUsuarios;
import Modelado.Usuarios;
import com.formdev.flatlaf.json.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VUsuarios extends javax.swing.JFrame {

    Usuarios usu = new Usuarios();
    ControlUsuarios conUsu = new ControlUsuarios();
    DefaultTableModel modeloUsuarios = new DefaultTableModel();

    public VUsuarios() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        listarUsu();
    }

    private void listarUsu() {
        List<Usuarios> lista = conUsu.listarUsuarios();
        modeloUsuarios = (DefaultTableModel) tblUsuarios.getModel();
        modeloUsuarios.setRowCount(0);  // Limpiar las filas de la tabla

        Object[] ob = new Object[12]; // Array para las columnas de la tabla
        SimpleDateFormat dateInputFormat = new SimpleDateFormat("yyyy-MM-dd");  // Formato de la fecha en la base de datos
        SimpleDateFormat dateOutputFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formato de fecha para mostrar

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdUsuario();
            ob[1] = lista.get(i).getNombreUsuario();
            ob[2] = lista.get(i).getApellidoUsuario();
            ob[3] = lista.get(i).getGeneroUsuario();
            ob[4] = lista.get(i).getDniUsuario();
            ob[5] = lista.get(i).getDireccionUsuario();
            ob[6] = lista.get(i).getTelefonoUsuario();
            ob[7] = lista.get(i).getTipoDeUsuario();

            try {
                // Convertir fecha de inicio
                String fechaInicioOriginal = lista.get(i).getFechaInicio(); // Fecha en formato yyyy-MM-dd
                Date fechaInicio = dateInputFormat.parse(fechaInicioOriginal); // Convertir a Date
                ob[9] = dateOutputFormat.format(fechaInicio);  // Formatear a dd-MM-yyyy
            } catch (Exception e) {
                ob[9] = lista.get(i).getFechaInicio(); // Si ocurre un error, mostrar la fecha tal como está
            }

            try {
                // Convertir fecha de nacimiento
                String fechaNacimientoOriginal = lista.get(i).getFechaNacimiento(); // Fecha en formato yyyy-MM-dd
                Date fechaNacimiento = dateInputFormat.parse(fechaNacimientoOriginal); // Convertir a Date
                ob[8] = dateOutputFormat.format(fechaNacimiento);  // Formatear a dd-MM-yyyy
            } catch (Exception e) {
                ob[8] = lista.get(i).getFechaNacimiento(); // Si ocurre un error, mostrar la fecha tal como está
            }

            ob[10] = lista.get(i).getUsuario();
            ob[11] = "********";  // Contraseña oculta

            modeloUsuarios.addRow(ob); // Agregar la fila a la tabla
        }

        tblUsuarios.setModel(modeloUsuarios);  // Establecer el modelo de la tabla
    }

    private void limpiarCampos() {
        txtNomUsu.setText("");
        txtApUsu.setText("");
        txtDniUsu.setText("");
        txtDireccionUsu.setText("");
        txtTelUsu.setText("");
        txtFeIni.setText("");
        txtFeNac.setText("");
        txtSeUsu.setText("");
        txContraseña.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        icono2 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel7 = new javax.swing.JLabel();
        jpanelRound4 = new Modelado.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JTextField();
        txtNomUsu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApUsu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDniUsu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccionUsu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTelUsu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtFeNac = new javax.swing.JTextField();
        txtFeIni = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSeUsu = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txContraseña = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        SelGenUsu = new javax.swing.JComboBox<>();
        SelTiUsu = new javax.swing.JComboBox<>();
        jpanelRound2 = new Modelado.JpanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnSalir = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscarUsuario = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditarUsuario = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminarUsuario = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel17 = new javax.swing.JLabel();
        btnRegistrarUsuario = new RSMaterialComponent.RSButtonMaterialIconDos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        icono2.setBackground(new java.awt.Color(204, 204, 204));
        icono2.setForeground(new java.awt.Color(36, 47, 58));
        icono2.setBackgroundHover(new java.awt.Color(36, 47, 58));
        icono2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono2.setForegroundIcon(new java.awt.Color(36, 47, 58));
        icono2.setForegroundIconHover(new java.awt.Color(36, 47, 58));
        icono2.setForegroundText(new java.awt.Color(36, 47, 58));
        icono2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        icono2.setName(""); // NOI18N
        icono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(36, 47, 58));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 47, 58));
        jLabel7.setText("Registro Usuarios");

        jpanelRound4.setBackground(new java.awt.Color(36, 47, 58));
        jpanelRound4.setRoundBottomLeft(20);
        jpanelRound4.setRoundBottomRight(20);
        jpanelRound4.setRoundTopLeft(20);
        jpanelRound4.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id-Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        txtIdUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtIdUsu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtIdUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuActionPerformed(evt);
            }
        });

        txtNomUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtNomUsu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNomUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUsuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");

        txtApUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtApUsu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtApUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApUsuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI");

        txtDniUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtDniUsu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtDniUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniUsuActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");

        txtDireccionUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionUsu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtDireccionUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionUsuActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Telefono");

        txtTelUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtTelUsu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTelUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelUsuActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tipo de Usuario");

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha de nacimiento");

        txtFeNac.setBackground(new java.awt.Color(255, 255, 255));
        txtFeNac.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFeNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeNacActionPerformed(evt);
            }
        });

        txtFeIni.setBackground(new java.awt.Color(255, 255, 255));
        txtFeIni.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFeIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeIniActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha de contratacion");

        txtSeUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtSeUsu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtSeUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeUsuActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Usuario de sesion");

        txContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txContraseñaActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Contraseña");

        SelGenUsu.setBackground(new java.awt.Color(255, 255, 255));
        SelGenUsu.setForeground(new java.awt.Color(0, 0, 0));
        SelGenUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maculino", "Femenino", "Otros" }));
        SelGenUsu.setBorder(null);

        SelTiUsu.setBackground(new java.awt.Color(255, 255, 255));
        SelTiUsu.setForeground(new java.awt.Color(0, 0, 0));
        SelTiUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Ventas" }));
        SelTiUsu.setBorder(null);

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelTiUsu, 0, 195, Short.MAX_VALUE)
                    .addComponent(txtFeNac)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtFeIni)
                    .addComponent(jLabel19)
                    .addComponent(txtSeUsu)
                    .addComponent(jLabel20)
                    .addComponent(txContraseña)
                    .addComponent(jLabel21)
                    .addComponent(txtApUsu)
                    .addComponent(txtDireccionUsu)
                    .addComponent(txtDniUsu)
                    .addComponent(SelGenUsu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelUsu)
                    .addComponent(txtNomUsu)
                    .addComponent(txtIdUsu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelGenUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(txtDniUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelTiUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFeNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFeIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(20);
        jpanelRound2.setRoundBottomRight(20);
        jpanelRound2.setRoundTopLeft(20);
        jpanelRound2.setRoundTopRight(20);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdUsuario", "Nombre", "Apellido", "Genero", "DNI", "Direccion", "Telefono", "T. Usuario", "F. Nacimiento", "F. Contratacion", "Usuario", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setMinimumSize(new java.awt.Dimension(30, 80));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuarios);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        btnSalir.setBackground(new java.awt.Color(36, 47, 58));
        btnSalir.setText("Salir de registro");
        btnSalir.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnSalir.setBorderPainted(false);
        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnSalir.setRound(20);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setBackground(new java.awt.Color(36, 47, 58));
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnBuscarUsuario.setBorderPainted(false);
        btnBuscarUsuario.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnBuscarUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarUsuario.setRound(20);
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setBackground(new java.awt.Color(36, 47, 58));
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEditarUsuario.setBorderPainted(false);
        btnEditarUsuario.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEditarUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarUsuario.setRound(20);
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(36, 47, 58));
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setBorderPainted(false);
        btnEliminarUsuario.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnEliminarUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_SWEEP);
        btnEliminarUsuario.setRound(20);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("INGRESAR DATOS DE NUEVO USUARIO");

        btnRegistrarUsuario.setBackground(new java.awt.Color(36, 47, 58));
        btnRegistrarUsuario.setText("Registrar");
        btnRegistrarUsuario.setBackgroundHover(new java.awt.Color(0, 0, 0));
        btnRegistrarUsuario.setBorderPainted(false);
        btnRegistrarUsuario.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btnRegistrarUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RECEIPT);
        btnRegistrarUsuario.setRound(20);
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(icono2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 978, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono2ActionPerformed

    }//GEN-LAST:event_icono2ActionPerformed

    private void txtIdUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuActionPerformed

    private void txtNomUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUsuActionPerformed
        txtApUsu.requestFocus();
    }//GEN-LAST:event_txtNomUsuActionPerformed

    private void txtApUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApUsuActionPerformed

    }//GEN-LAST:event_txtApUsuActionPerformed

    private void txtDniUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniUsuActionPerformed
        txtDireccionUsu.requestFocus();
    }//GEN-LAST:event_txtDniUsuActionPerformed

    private void txtDireccionUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionUsuActionPerformed
        // btnRegistrarClientes.doClick();
    }//GEN-LAST:event_txtDireccionUsuActionPerformed

    private void txtTelUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelUsuActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked

    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        if (txtDniUsu.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un DNI para realizar la búsqueda.");
            limpiarCampos();
            return;
        }

        String dniStr = txtDniUsu.getText().trim();

        if (!dniStr.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI debe contener exactamente 8 dígitos.");
            limpiarCampos();
            return;
        }

        try {
            int dni = Integer.parseInt(dniStr);

            Usuarios usuario = new Usuarios();
            usuario.setDniUsuario(dni);

            if (conUsu.buscarUsuarios(usuario)) {
                txtIdUsu.setText(String.valueOf(usuario.getIdUsuario()));
                txtNomUsu.setText(usuario.getNombreUsuario());
                txtApUsu.setText(usuario.getApellidoUsuario());
                txtDniUsu.setText(String.valueOf(usuario.getDniUsuario()));
                txtDireccionUsu.setText(usuario.getDireccionUsuario());
                txtTelUsu.setText(String.valueOf(usuario.getTelefonoUsuario()));
                txtFeIni.setText(usuario.getFechaInicio());
                txtFeNac.setText(usuario.getFechaNacimiento());
                txtSeUsu.setText(usuario.getUsuario());
                
                String contraseñaOculta = "*****";
                txContraseña.setText(contraseñaOculta);
                SelGenUsu.setSelectedItem(usuario.getGeneroUsuario());
                SelTiUsu.setSelectedItem(usuario.getTipoDeUsuario());

                JOptionPane.showMessageDialog(null, "Usuario encontrado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con el DNI proporcionado.");
                limpiarCampos();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un número válido.");
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al buscar el usuario: " + e.getMessage());
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed

    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void txtFeNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeNacActionPerformed

    private void txtFeIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeIniActionPerformed

    private void txtSeUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeUsuActionPerformed

    private void txContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txContraseñaActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        if (txtNomUsu.getText().trim().isEmpty() || txtApUsu.getText().trim().isEmpty()
                || txtDniUsu.getText().trim().isEmpty() || txtDireccionUsu.getText().trim().isEmpty()
                || txtTelUsu.getText().trim().isEmpty() || txtFeIni.getText().trim().isEmpty()
                || txtFeNac.getText().trim().isEmpty() || txtSeUsu.getText().trim().isEmpty()
                || txContraseña.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }
        if (SelGenUsu.getSelectedItem() == null || SelGenUsu.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un género.");
            return;
        }
        if (SelTiUsu.getSelectedItem() == null || SelTiUsu.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un tipo de usuario.");
            return;
        }
        String genero = SelGenUsu.getSelectedItem().toString();
        String tipoUsuario = SelTiUsu.getSelectedItem().toString();
        
        if (!txtTelUsu.getText().trim().matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "El teléfono debe contener exactamente 9 dígitos.");
            return;
        }
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dateFormat.setLenient(false);

            Date inicio = dateFormat.parse(txtFeIni.getText().trim());
            Date nacimiento = dateFormat.parse(txtFeNac.getText().trim());

            if (inicio.before(nacimiento)) {
                JOptionPane.showMessageDialog(null, "La fecha de inicio no puede ser anterior a la fecha de nacimiento.");
                return;
            }
            SimpleDateFormat mysqlDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaInicioMySQL = mysqlDateFormat.format(inicio);
            String fechaNacimientoMySQL = mysqlDateFormat.format(nacimiento);

            Usuarios nuevoUsuario = new Usuarios();
            nuevoUsuario.setNombreUsuario(txtNomUsu.getText().trim());
            nuevoUsuario.setApellidoUsuario(txtApUsu.getText().trim());
            nuevoUsuario.setDniUsuario(Integer.parseInt(txtDniUsu.getText().trim()));
            nuevoUsuario.setDireccionUsuario(txtDireccionUsu.getText().trim());
            nuevoUsuario.setTelefonoUsuario(Integer.parseInt(txtTelUsu.getText().trim()));
            nuevoUsuario.setFechaInicio(fechaInicioMySQL);
            nuevoUsuario.setFechaNacimiento(fechaNacimientoMySQL);
            nuevoUsuario.setUsuario(txtSeUsu.getText().trim());
            nuevoUsuario.setContraseña(txContraseña.getText().trim());
            nuevoUsuario.setGeneroUsuario(genero);
            nuevoUsuario.setTipoDeUsuario(tipoUsuario);
            
            List<Usuarios> listaUsuarios = conUsu.listarUsuarios();
            boolean usuarioExisteDni = listaUsuarios.stream()
                    .anyMatch(usuario -> txtDniUsu.getText().trim().equals(String.valueOf(usuario.getDniUsuario())));

            if (usuarioExisteDni) {
                JOptionPane.showMessageDialog(null, "El cliente con ese DNI ya existe.");
                return;
            }
            boolean usuarioExisteTelefono = listaUsuarios.stream()
                    .anyMatch(usuario -> txtTelUsu.getText().trim().equals(String.valueOf(usuario.getTelefonoUsuario())));

            if (usuarioExisteTelefono) {
                JOptionPane.showMessageDialog(null, "El cliente con ese teléfono ya existe.");
                return;
            }
            if (conUsu.insertarUsuarios(nuevoUsuario)) {
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
                limpiarCampos();
                listarUsu();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el usuario.");
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de las fechas. Debe ser dd-MM-yyyy.");
        } catch (java.text.ParseException ex) {
            Logger.getLogger(VUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelGenUsu;
    private javax.swing.JComboBox<String> SelTiUsu;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarUsuario;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditarUsuario;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminarUsuario;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRegistrarUsuario;
    private RSMaterialComponent.RSButtonMaterialIconDos btnSalir;
    private RSMaterialComponent.RSButtonMaterialIconDos icono2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private Modelado.JpanelRound jpanelRound2;
    private Modelado.JpanelRound jpanelRound4;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txContraseña;
    private javax.swing.JTextField txtApUsu;
    private javax.swing.JTextField txtDireccionUsu;
    private javax.swing.JTextField txtDniUsu;
    private javax.swing.JTextField txtFeIni;
    private javax.swing.JTextField txtFeNac;
    private javax.swing.JTextField txtIdUsu;
    private javax.swing.JTextField txtNomUsu;
    private javax.swing.JTextField txtSeUsu;
    private javax.swing.JTextField txtTelUsu;
    // End of variables declaration//GEN-END:variables
}
