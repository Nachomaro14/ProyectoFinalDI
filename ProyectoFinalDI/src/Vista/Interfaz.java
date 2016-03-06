package Vista;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cargando = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        textoCarga = new javax.swing.JLabel();
        uni = new javax.swing.JLabel();
        principal = new javax.swing.JFrame();
        panelMenu = new javax.swing.JPanel();
        usuarioConectado = new javax.swing.JLabel();
        btnEsp = new javax.swing.JButton();
        btnIng = new javax.swing.JButton();
        labelSalir = new javax.swing.JLabel();
        labelAvisar = new javax.swing.JLabel();
        labelPedidos = new javax.swing.JLabel();
        labelNuevoPedido = new javax.swing.JLabel();
        labelPerfil = new javax.swing.JLabel();
        labelVolver = new javax.swing.JLabel();
        panelDescripcion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripción = new javax.swing.JTextArea();
        labelNombreArticulo = new javax.swing.JLabel();
        labelPrecioArticulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelArticulos = new javax.swing.JPanel();
        btnBebidas = new javax.swing.JButton();
        btnPasteleria = new javax.swing.JButton();
        btnOfertas = new javax.swing.JButton();
        btnMenus = new javax.swing.JButton();
        panelArticulosAux = new javax.swing.JPanel();
        panelCesta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCesta = new javax.swing.JTable();
        btnCancelarPed = new javax.swing.JButton();
        btnRealizarPed = new javax.swing.JButton();
        comboDescuentos = new javax.swing.JComboBox();
        txtPrecioTotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtPrecioBase = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        panelPedidos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboFechaPed = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        labelHoraPed = new javax.swing.JLabel();
        labelCodPed = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPedidos = new javax.swing.JList<String>();
        jLabel12 = new javax.swing.JLabel();
        labelTrabajadorPed = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        labelClientePed = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelPrecioPed = new javax.swing.JLabel();
        panelPerfil = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        nombrePerfil = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        telefonoPerfil = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        correoPerfil = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        direccionPerfil = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dniPerfil = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tiempoTrabajadoPerfil = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        recaudacionPerfil = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        valoracionPerfil = new javax.swing.JLabel();
        principalAdmin = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelAdminProveedores = new javax.swing.JLabel();
        labelAdminPedidos = new javax.swing.JLabel();
        labelAdminStock = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelAdminTrabajadores = new javax.swing.JLabel();
        labelAdminVentas = new javax.swing.JLabel();
        labelAdminSalir = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        usuarioAdminConectado = new javax.swing.JLabel();
        configuracionDB = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombreBD = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtUsuBD = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPassBD = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtIPBD = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPortBD = new javax.swing.JTextField();
        btnAceptarConfig = new javax.swing.JButton();
        btnCancelarConfig = new javax.swing.JButton();
        proveedores1 = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        panelInfoProvee = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        nifProveedor = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        direccionProveedor = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        paisProveedor = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        correoProveedor = new javax.swing.JLabel();
        telefonoProveedor = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaProductosProvee = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        listaProvee = new javax.swing.JList<String>();
        compras2 = new javax.swing.JDialog();
        btnNewPedido = new javax.swing.JButton();
        btnHistorialPedido = new javax.swing.JButton();
        stock3 = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        comboBusquedaStock = new javax.swing.JComboBox();
        txtBusquedaStock = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaStock = new javax.swing.JTable();
        trabajadores4 = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaTrabajadores = new javax.swing.JTable();
        panelInfoTrabajadores = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        labelTiempoTrabajado = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        labelValoracion = new javax.swing.JLabel();
        labelVentasRealizadas = new javax.swing.JLabel();
        txtNewValora = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnAceptaNewValora = new javax.swing.JButton();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnModificaEmpleado = new javax.swing.JButton();
        btnDespideEmpleado = new javax.swing.JButton();
        ventas5 = new javax.swing.JDialog();
        panelPedidos1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        comboFechaPed1 = new javax.swing.JComboBox<String>();
        jLabel32 = new javax.swing.JLabel();
        labelHoraPed1 = new javax.swing.JLabel();
        labelCodPed1 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        listaPedidos1 = new javax.swing.JList<String>();
        jLabel46 = new javax.swing.JLabel();
        labelTrabajadorPed1 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tablaPedidos1 = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        labelClientePed1 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        labelPrecioPed1 = new javax.swing.JLabel();
        contratar = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtUserContra = new javax.swing.JTextField();
        txtPasswContra = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        txtDniContra = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtNombreContra = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtApellContra = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtTelefContra = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtEmailContra = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtNDomicilio = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtCDomicilio = new javax.swing.JTextField();
        checkAdmin = new javax.swing.JCheckBox();
        btnAceptarContrato = new javax.swing.JButton();
        btnCancelarContrato = new javax.swing.JButton();
        checkModifico = new javax.swing.JCheckBox();
        historial = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaFechasHistorial = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaProductosHistorial = new javax.swing.JTable();
        nuevosPedidos = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        comboProveed = new javax.swing.JComboBox();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaProdProveed = new javax.swing.JTable();
        btnAgregarAlPedido = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaPedidosCompra = new javax.swing.JTable();
        btnBorrarDelPedido = new javax.swing.JButton();
        txtPrecioTotalPedidoProv = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        btnAceptarPedidoProv = new javax.swing.JButton();
        btnCancelarPedidoProv = new javax.swing.JButton();
        facturaCompra = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        btnAceptarFacturaCompra = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtFechaFacturaCompra = new javax.swing.JLabel();
        txtHoraFacturaCompra = new javax.swing.JLabel();
        txtProveedorFacturaCompra = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtDireccionFacturaCompra = new javax.swing.JLabel();
        txtTelefonoFacturaCompra = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtCorreoFacturaCompra = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtPaisFacturaCompra = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtNIFFacturaCompra = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        productosFacturaCompra = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        txtPrecioFacturaCompra = new javax.swing.JLabel();
        inicio = new javax.swing.JPanel();
        infoInicio = new javax.swing.JPanel();
        logoInicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        cargando.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        cargando.setUndecorated(true);
        cargando.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoCarga.setText("Cargando...");
        jPanel1.add(textoCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));
        jPanel1.add(uni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 260, 230));

        javax.swing.GroupLayout cargandoLayout = new javax.swing.GroupLayout(cargando.getContentPane());
        cargando.getContentPane().setLayout(cargandoLayout);
        cargandoLayout.setHorizontalGroup(
            cargandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cargandoLayout.setVerticalGroup(
            cargandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        principal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        principal.setUndecorated(true);
        principal.setResizable(false);

        panelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        usuarioConectado.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        usuarioConectado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandera española.png"))); // NOI18N
        btnEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspActionPerformed(evt);
            }
        });

        btnIng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandera inglesa.png"))); // NOI18N

        labelSalir.setToolTipText("Cerrar sesión");

        labelAvisar.setToolTipText("Avisar al administrador");

        labelPedidos.setToolTipText("Historial de pedidos");

        labelNuevoPedido.setToolTipText("Productos");

        labelPerfil.setToolTipText("Perfil");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(labelAvisar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIng, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEsp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNuevoPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAvisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuLayout.createSequentialGroup()
                        .addComponent(btnEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuLayout.createSequentialGroup()
                        .addComponent(labelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        principal.getContentPane().add(panelMenu, java.awt.BorderLayout.PAGE_START);

        panelDescripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDescripción.setColumns(20);
        txtDescripción.setFont(new java.awt.Font("Malgun Gothic", 1, 10)); // NOI18N
        txtDescripción.setRows(5);
        txtDescripción.setText("DESCRIPCION DE LOS ARTÍCULOS");
        jScrollPane1.setViewportView(txtDescripción);

        labelNombreArticulo.setFont(new java.awt.Font("Malgun Gothic", 1, 10)); // NOI18N
        labelNombreArticulo.setText("Nombre del artículo seleccionado");

        labelPrecioArticulo.setFont(new java.awt.Font("Malgun Gothic", 1, 10)); // NOI18N
        labelPrecioArticulo.setText("Precio del artículo seleccionado");

        javax.swing.GroupLayout panelDescripcionLayout = new javax.swing.GroupLayout(panelDescripcion);
        panelDescripcion.setLayout(panelDescripcionLayout);
        panelDescripcionLayout.setHorizontalGroup(
            panelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescripcionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescripcionLayout.createSequentialGroup()
                        .addComponent(labelNombreArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPrecioArticulo)
                        .addGap(0, 851, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelDescripcionLayout.setVerticalGroup(
            panelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreArticulo)
                    .addComponent(labelPrecioArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        principal.getContentPane().add(panelDescripcion, java.awt.BorderLayout.PAGE_END);

        panelCentral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelArticulos.setBorder(new javax.swing.border.MatteBorder(null));
        panelArticulos.setLayout(new java.awt.GridBagLayout());

        btnBebidas.setMaximumSize(new java.awt.Dimension(200, 200));
        btnBebidas.setMinimumSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(btnBebidas, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(btnPasteleria, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(btnOfertas, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(btnMenus, gridBagConstraints);

        panelArticulosAux.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1091, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                    .addGap(135, 135, 135)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelArticulosAux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(945, 945, 945)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelArticulosAux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(586, 586, 586)))
        );
        jLayeredPane1.setLayer(panelArticulos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelArticulosAux, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane15.setViewportView(jLayeredPane1);

        panelCesta.setBorder(new javax.swing.border.MatteBorder(null));

        tablaCesta.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        tablaCesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaCesta);

        btnCancelarPed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        btnCancelarPed.setText("Cancelar");

        btnRealizarPed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        btnRealizarPed.setText("Realizar");

        comboDescuentos.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        comboDescuentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDescuentosActionPerformed(evt);
            }
        });

        txtPrecioTotal.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        txtPrecioTotal.setText("*Precio Total");
        txtPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTotalActionPerformed(evt);
            }
        });

        txtIVA.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        txtIVA.setText("*IVA");

        txtPrecioBase.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        txtPrecioBase.setText("*PrecioBase");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel6.setText("Descuento:");

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelerita.png"))); // NOI18N
        jButton10.setPreferredSize(new java.awt.Dimension(5, 5));

        javax.swing.GroupLayout panelCestaLayout = new javax.swing.GroupLayout(panelCesta);
        panelCesta.setLayout(panelCestaLayout);
        panelCestaLayout.setHorizontalGroup(
            panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCestaLayout.createSequentialGroup()
                .addGroup(panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCestaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCestaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(comboDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCestaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCestaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRealizarPed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarPed)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCestaLayout.setVerticalGroup(
            panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCestaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCestaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(comboDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCestaLayout.createSequentialGroup()
                        .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizarPed)
                    .addComponent(btnCancelarPed))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap(978, Short.MAX_VALUE)
                .addComponent(panelCesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCentralLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                    .addGap(281, 281, 281)))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane15)
                    .addContainerGap()))
        );

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel7.setText("Fecha:");

        comboFechaPed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        comboFechaPed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel8.setText("Hora:");

        labelHoraPed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        labelCodPed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel11.setText("Código de pedido:");

        listaPedidos.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        listaPedidos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaPedidos);

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel12.setText("Trabajador:");

        labelTrabajadorPed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        tablaPedidos.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaPedidos);

        jLabel14.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel14.setText("Cliente:");

        labelClientePed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel17.setText("Precio:");

        labelPrecioPed.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        javax.swing.GroupLayout panelPedidosLayout = new javax.swing.GroupLayout(panelPedidos);
        panelPedidos.setLayout(panelPedidosLayout);
        panelPedidosLayout.setHorizontalGroup(
            panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboFechaPed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(labelHoraPed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(labelTrabajadorPed, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(labelClientePed, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrecioPed, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        panelPedidosLayout.setVerticalGroup(
            panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelTrabajadorPed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelClientePed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboFechaPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelHoraPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelPrecioPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nombre:");

        nombrePerfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombrePerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Teléfono:");

        telefonoPerfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telefonoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Correo:");

        correoPerfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        correoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Dirección:");

        direccionPerfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        direccionPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("DNI:");

        dniPerfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dniPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrePerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefonoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccionPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(dniPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(nombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(telefonoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(correoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(direccionPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tiempo de trabajo:");

        tiempoTrabajadoPerfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tiempoTrabajadoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Recaudación:");

        recaudacionPerfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        recaudacionPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Valoración:");

        valoracionPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tiempoTrabajadoPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recaudacionPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valoracionPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tiempoTrabajadoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(recaudacionPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(valoracionPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        principal.getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        principalAdmin.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        principalAdmin.setUndecorated(true);
        principalAdmin.setResizable(false);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        labelAdminProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminProveedores.setToolTipText("Proveedores");
        jPanel3.add(labelAdminProveedores);

        labelAdminPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminPedidos.setToolTipText("Pedidos");
        jPanel3.add(labelAdminPedidos);

        labelAdminStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminStock.setToolTipText("Stock");
        jPanel3.add(labelAdminStock);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        labelAdminTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminTrabajadores.setToolTipText("Trabajadores");
        jPanel4.add(labelAdminTrabajadores);

        labelAdminVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminVentas.setToolTipText("Ventas");
        jPanel4.add(labelAdminVentas);

        labelAdminSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminSalir.setToolTipText("Salir");
        jPanel4.add(labelAdminSalir);

        jPanel2.add(jPanel4);

        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        usuarioAdminConectado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(usuarioAdminConectado);

        javax.swing.GroupLayout principalAdminLayout = new javax.swing.GroupLayout(principalAdmin.getContentPane());
        principalAdmin.getContentPane().setLayout(principalAdminLayout);
        principalAdminLayout.setHorizontalGroup(
            principalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        principalAdminLayout.setVerticalGroup(
            principalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalAdminLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        configuracionDB.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        configuracionDB.setAlwaysOnTop(true);
        configuracionDB.setModal(true);
        configuracionDB.setResizable(false);

        jLabel10.setText("CONFIGURACIÓN DE LA BASE DE DATOS");

        jLabel15.setText("Nombre:");

        txtNombreBD.setText("dam26_proyectoFinalDI");
        txtNombreBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBDActionPerformed(evt);
            }
        });

        jLabel20.setText("Usuario:");

        txtUsuBD.setText("dam26");

        jLabel21.setText("Contraseña:");

        txtPassBD.setText("Mazuecos14");

        jLabel23.setText("IP:");

        txtIPBD.setText("88.26.202.99");

        jLabel25.setText("Puerto:");

        txtPortBD.setText("3306");

        btnAceptarConfig.setText("Aceptar");

        btnCancelarConfig.setText("Cancelar");

        javax.swing.GroupLayout configuracionDBLayout = new javax.swing.GroupLayout(configuracionDB.getContentPane());
        configuracionDB.getContentPane().setLayout(configuracionDBLayout);
        configuracionDBLayout.setHorizontalGroup(
            configuracionDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configuracionDBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(configuracionDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(configuracionDBLayout.createSequentialGroup()
                        .addGroup(configuracionDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreBD)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuBD)
                            .addComponent(jLabel21)
                            .addComponent(txtPassBD)
                            .addComponent(jLabel23)
                            .addComponent(txtIPBD)
                            .addComponent(jLabel25)
                            .addComponent(txtPortBD))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(configuracionDBLayout.createSequentialGroup()
                        .addComponent(btnAceptarConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarConfig)))
                .addContainerGap())
        );
        configuracionDBLayout.setVerticalGroup(
            configuracionDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configuracionDBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIPBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPortBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(configuracionDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarConfig)
                    .addComponent(btnCancelarConfig))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        proveedores1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        proveedores1.setResizable(false);

        panelInfoProvee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel43.setText("NIF:");

        jLabel45.setText("Dirección:");

        jLabel47.setText("País:");

        jLabel49.setText("Teléfono:");

        jLabel50.setText("Correo:");

        javax.swing.GroupLayout panelInfoProveeLayout = new javax.swing.GroupLayout(panelInfoProvee);
        panelInfoProvee.setLayout(panelInfoProveeLayout);
        panelInfoProveeLayout.setHorizontalGroup(
            panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProveeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoProveeLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelInfoProveeLayout.createSequentialGroup()
                            .addComponent(jLabel43)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nifProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(telefonoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelInfoProveeLayout.createSequentialGroup()
                            .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelInfoProveeLayout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(direccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelInfoProveeLayout.createSequentialGroup()
                                    .addComponent(jLabel47)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(paisProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelInfoProveeLayout.setVerticalGroup(
            panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProveeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nifProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefonoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direccionProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paisProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tablaProductosProvee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablaProductosProvee);

        listaProvee.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(listaProvee);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfoProvee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInfoProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout proveedores1Layout = new javax.swing.GroupLayout(proveedores1.getContentPane());
        proveedores1.getContentPane().setLayout(proveedores1Layout);
        proveedores1Layout.setHorizontalGroup(
            proveedores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        proveedores1Layout.setVerticalGroup(
            proveedores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        compras2.setModal(true);
        compras2.setUndecorated(true);
        compras2.setResizable(false);

        btnNewPedido.setText("NUEVO PEDIDO");

        btnHistorialPedido.setText("HISTORIAL");

        javax.swing.GroupLayout compras2Layout = new javax.swing.GroupLayout(compras2.getContentPane());
        compras2.getContentPane().setLayout(compras2Layout);
        compras2Layout.setHorizontalGroup(
            compras2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compras2Layout.createSequentialGroup()
                .addComponent(btnNewPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistorialPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        compras2Layout.setVerticalGroup(
            compras2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNewPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addComponent(btnHistorialPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stock3.setAlwaysOnTop(true);
        stock3.setModal(true);
        stock3.setResizable(false);

        comboBusquedaStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PROVEEDOR", "NOMBRE", "PAIS" }));

        tablaStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tablaStock);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(comboBusquedaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusquedaStock))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBusquedaStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout stock3Layout = new javax.swing.GroupLayout(stock3.getContentPane());
        stock3.getContentPane().setLayout(stock3Layout);
        stock3Layout.setHorizontalGroup(
            stock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        stock3Layout.setVerticalGroup(
            stock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        trabajadores4.setModal(true);
        trabajadores4.setResizable(false);

        tablaTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tablaTrabajadores);

        panelInfoTrabajadores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setText("Tiempo total de trabajo:");

        jLabel29.setText("Total de Ventas Realizadas:");

        jLabel31.setText("Valoracion:");

        jLabel28.setText("Nueva Valoracion:");

        btnAceptaNewValora.setText("Aceptar");

        javax.swing.GroupLayout panelInfoTrabajadoresLayout = new javax.swing.GroupLayout(panelInfoTrabajadores);
        panelInfoTrabajadores.setLayout(panelInfoTrabajadoresLayout);
        panelInfoTrabajadoresLayout.setHorizontalGroup(
            panelInfoTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoTrabajadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoTrabajado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelValoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVentasRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInfoTrabajadoresLayout.createSequentialGroup()
                        .addGroup(panelInfoTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(panelInfoTrabajadoresLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNewValora))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoTrabajadoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptaNewValora)))
                .addContainerGap())
        );
        panelInfoTrabajadoresLayout.setVerticalGroup(
            panelInfoTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoTrabajadoresLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(labelTiempoTrabajado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(labelVentasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(labelValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelInfoTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewValora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(btnAceptaNewValora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevoEmpleado.setText("Contratar");

        btnModificaEmpleado.setText("Modificar Datos");

        btnDespideEmpleado.setText("Despedir");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDespideEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfoTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfoTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificaEmpleado)
                    .addComponent(btnDespideEmpleado))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDespideEmpleado, btnModificaEmpleado, btnNuevoEmpleado});

        javax.swing.GroupLayout trabajadores4Layout = new javax.swing.GroupLayout(trabajadores4.getContentPane());
        trabajadores4.getContentPane().setLayout(trabajadores4Layout);
        trabajadores4Layout.setHorizontalGroup(
            trabajadores4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        trabajadores4Layout.setVerticalGroup(
            trabajadores4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventas5.setModal(true);
        ventas5.setResizable(false);

        jLabel30.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel30.setText("Fecha:");

        comboFechaPed1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        comboFechaPed1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel32.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel32.setText("Hora:");

        labelHoraPed1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        labelCodPed1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel44.setText("Código de pedido:");

        listaPedidos1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        listaPedidos1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane14.setViewportView(listaPedidos1);

        jLabel46.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel46.setText("Trabajador:");

        labelTrabajadorPed1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        tablaPedidos1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        tablaPedidos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane17.setViewportView(tablaPedidos1);

        jLabel48.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel48.setText("Cliente:");

        labelClientePed1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel51.setText("Precio:");

        labelPrecioPed1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N

        javax.swing.GroupLayout panelPedidos1Layout = new javax.swing.GroupLayout(panelPedidos1);
        panelPedidos1.setLayout(panelPedidos1Layout);
        panelPedidos1Layout.setHorizontalGroup(
            panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPedidos1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(comboFechaPed1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPedidos1Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(labelHoraPed1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(labelTrabajadorPed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addGap(18, 18, 18)
                        .addComponent(labelClientePed1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrecioPed1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCodPed1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane17))
                .addContainerGap())
        );
        panelPedidos1Layout.setVerticalGroup(
            panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidos1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelTrabajadorPed1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelClientePed1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboFechaPed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelHoraPed1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCodPed1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelPrecioPed1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPedidos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ventas5Layout = new javax.swing.GroupLayout(ventas5.getContentPane());
        ventas5.getContentPane().setLayout(ventas5Layout);
        ventas5Layout.setHorizontalGroup(
            ventas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1151, Short.MAX_VALUE)
            .addGroup(ventas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventas5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelPedidos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ventas5Layout.setVerticalGroup(
            ventas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(ventas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventas5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelPedidos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        contratar.setModal(true);
        contratar.setResizable(false);

        jLabel36.setText("USUARIO");

        jLabel37.setText("CONTRASEÑA");

        jLabel33.setText("DNI :");

        jLabel34.setText("Nombre :");

        jLabel35.setText("Apellidos :");

        jLabel38.setText("Telefono :");

        jLabel39.setText("E-Mail :");

        jLabel40.setText("Domicilio :");

        jLabel41.setText("Numero");

        txtNDomicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel42.setText("Direccion");

        checkAdmin.setText("Administrador");
        checkAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdminActionPerformed(evt);
            }
        });

        btnAceptarContrato.setText("Aceptar");

        btnCancelarContrato.setText("Cancelar");

        checkModifico.setText("Modificar contraseña");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(checkAdmin))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(14, 14, 14)
                                .addComponent(txtCDomicilio))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAceptarContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarContrato))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDniContra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtNDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTelefContra)
                            .addComponent(txtNombreContra)
                            .addComponent(txtApellContra)
                            .addComponent(txtEmailContra)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(txtUserContra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(txtPasswContra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(checkModifico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasswContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkModifico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtDniContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtApellContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtTelefContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtEmailContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addGap(13, 13, 13)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtNDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtCDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkAdmin)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarContrato)
                    .addComponent(btnCancelarContrato))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout contratarLayout = new javax.swing.GroupLayout(contratar.getContentPane());
        contratar.getContentPane().setLayout(contratarLayout);
        contratarLayout.setHorizontalGroup(
            contratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contratarLayout.setVerticalGroup(
            contratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        historial.setModal(true);
        historial.setResizable(false);

        tablaFechasHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablaFechasHistorial);

        tablaProductosHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tablaProductosHistorial);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout historialLayout = new javax.swing.GroupLayout(historial.getContentPane());
        historial.getContentPane().setLayout(historialLayout);
        historialLayout.setHorizontalGroup(
            historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        historialLayout.setVerticalGroup(
            historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        nuevosPedidos.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        nuevosPedidos.setModal(true);
        nuevosPedidos.setResizable(false);

        comboProveed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tablaProdProveed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(tablaProdProveed);

        btnAgregarAlPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnAgregarAlPedido.setBorder(null);

        tablaPedidosCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(tablaPedidosCompra);

        btnBorrarDelPedido.setText("Borrar de la cesta");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboProveed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarAlPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarDelPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(comboProveed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnAgregarAlPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarDelPedido)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel52.setText("Precio total:");

        btnAceptarPedidoProv.setText("Aceptar");

        btnCancelarPedidoProv.setText("Cancelar");

        javax.swing.GroupLayout nuevosPedidosLayout = new javax.swing.GroupLayout(nuevosPedidos.getContentPane());
        nuevosPedidos.getContentPane().setLayout(nuevosPedidosLayout);
        nuevosPedidosLayout.setHorizontalGroup(
            nuevosPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevosPedidosLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevosPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarPedidoProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(nuevosPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAceptarPedidoProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(nuevosPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioTotalPedidoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        nuevosPedidosLayout.setVerticalGroup(
            nuevosPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevosPedidosLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nuevosPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecioTotalPedidoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nuevosPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarPedidoProv)
                    .addComponent(btnCancelarPedidoProv))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        facturaCompra.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        facturaCompra.setAlwaysOnTop(true);
        facturaCompra.setModal(true);
        facturaCompra.setResizable(false);

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("INFORMACIÓN DEL PEDIDO");

        btnAceptarFacturaCompra.setText("ACEPTAR");

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel56.setText("International Cafe Dessernational");

        jLabel57.setText("Fecha:");

        jLabel58.setText("Hora:");

        jLabel59.setText("Proveedor:");

        jLabel63.setText("Dirección:");

        jLabel64.setText("Teléfono:");

        jLabel55.setText("Correo:");

        jLabel60.setText("País:");

        jLabel61.setText("NIF:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoraFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addComponent(txtProveedorFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(25, 25, 25)
                        .addComponent(txtDireccionFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(26, 26, 26)
                        .addComponent(txtTelefonoFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(35, 35, 35)
                        .addComponent(txtCorreoFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(49, 49, 49)
                        .addComponent(txtPaisFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(0, 438, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(51, 51, 51)
                        .addComponent(txtNIFFacturaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtFechaFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58)
                    .addComponent(txtHoraFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59)
                    .addComponent(txtProveedorFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61)
                    .addComponent(txtNIFFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63)
                    .addComponent(txtDireccionFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64)
                    .addComponent(txtTelefonoFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55)
                    .addComponent(txtCorreoFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60)
                    .addComponent(txtPaisFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        productosFacturaCompra.setEditable(false);
        productosFacturaCompra.setColumns(20);
        productosFacturaCompra.setRows(5);
        jScrollPane13.setViewportView(productosFacturaCompra);

        jLabel54.setText("Precio total:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtPrecioFacturaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptarFacturaCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptarFacturaCompra)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout facturaCompraLayout = new javax.swing.GroupLayout(facturaCompra.getContentPane());
        facturaCompra.getContentPane().setLayout(facturaCompraLayout);
        facturaCompraLayout.setHorizontalGroup(
            facturaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        facturaCompraLayout.setVerticalGroup(
            facturaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inicio.setLayout(new java.awt.BorderLayout());

        infoInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logoInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel1.setText("Dessernational©");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel2.setText("Ignacio Mazuecos Roldán, Jairo Gallardo Zorrilla & Alberto M. Moreno López");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
        jLabel3.setText("Escuela Salesianas Mª Auxiliadora - Nervión");

        javax.swing.GroupLayout infoInicioLayout = new javax.swing.GroupLayout(infoInicio);
        infoInicio.setLayout(infoInicioLayout);
        infoInicioLayout.setHorizontalGroup(
            infoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(logoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        infoInicioLayout.setVerticalGroup(
            infoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(infoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inicio.add(infoInicio, java.awt.BorderLayout.PAGE_END);

        fondoInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel4.setText("USUARIO");
        fondoInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        fondoInicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, 20));
        fondoInicio.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, -1));
        fondoInicio.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, -1));

        btnIniciarSesion.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondoInicio.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));
        fondoInicio.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 290));

        inicio.add(fondoInicio, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboDescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDescuentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDescuentosActionPerformed

    private void btnEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspActionPerformed

    private void txtPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTotalActionPerformed

    private void txtNombreBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBDActionPerformed

    private void checkAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAdminActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptaNewValora;
    public javax.swing.JButton btnAceptarConfig;
    public javax.swing.JButton btnAceptarContrato;
    public javax.swing.JButton btnAceptarFacturaCompra;
    public javax.swing.JButton btnAceptarPedidoProv;
    public javax.swing.JButton btnAgregarAlPedido;
    public javax.swing.JButton btnBebidas;
    public javax.swing.JButton btnBorrarDelPedido;
    public javax.swing.JButton btnCancelarConfig;
    public javax.swing.JButton btnCancelarContrato;
    public javax.swing.JButton btnCancelarPed;
    public javax.swing.JButton btnCancelarPedidoProv;
    public javax.swing.JButton btnDespideEmpleado;
    public javax.swing.JButton btnEsp;
    public javax.swing.JButton btnHistorialPedido;
    public javax.swing.JButton btnIng;
    public javax.swing.JButton btnIniciarSesion;
    public javax.swing.JButton btnMenus;
    public javax.swing.JButton btnModificaEmpleado;
    public javax.swing.JButton btnNewPedido;
    public javax.swing.JButton btnNuevoEmpleado;
    public javax.swing.JButton btnOfertas;
    public javax.swing.JButton btnPasteleria;
    public javax.swing.JButton btnRealizarPed;
    public javax.swing.JDialog cargando;
    public javax.swing.JCheckBox checkAdmin;
    public javax.swing.JCheckBox checkModifico;
    public javax.swing.JComboBox comboBusquedaStock;
    public javax.swing.JComboBox comboDescuentos;
    public javax.swing.JComboBox<String> comboFechaPed;
    public javax.swing.JComboBox<String> comboFechaPed1;
    public javax.swing.JComboBox comboProveed;
    public javax.swing.JDialog compras2;
    public javax.swing.JDialog configuracionDB;
    public javax.swing.JDialog contratar;
    public javax.swing.JLabel correoPerfil;
    public javax.swing.JLabel correoProveedor;
    public javax.swing.JLabel direccionPerfil;
    public javax.swing.JLabel direccionProveedor;
    public javax.swing.JLabel dniPerfil;
    public javax.swing.JDialog facturaCompra;
    public javax.swing.JLabel fondo;
    public javax.swing.JPanel fondoInicio;
    public javax.swing.JDialog historial;
    public javax.swing.JPanel infoInicio;
    public javax.swing.JPanel inicio;
    public javax.swing.JButton jButton10;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane10;
    public javax.swing.JScrollPane jScrollPane11;
    public javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane17;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel labelAdminPedidos;
    public javax.swing.JLabel labelAdminProveedores;
    public javax.swing.JLabel labelAdminSalir;
    public javax.swing.JLabel labelAdminStock;
    public javax.swing.JLabel labelAdminTrabajadores;
    public javax.swing.JLabel labelAdminVentas;
    public javax.swing.JLabel labelAvisar;
    public javax.swing.JLabel labelClientePed;
    public javax.swing.JLabel labelClientePed1;
    public javax.swing.JLabel labelCodPed;
    public javax.swing.JLabel labelCodPed1;
    public javax.swing.JLabel labelHoraPed;
    public javax.swing.JLabel labelHoraPed1;
    public javax.swing.JLabel labelNombreArticulo;
    public javax.swing.JLabel labelNuevoPedido;
    public javax.swing.JLabel labelPedidos;
    public javax.swing.JLabel labelPerfil;
    public javax.swing.JLabel labelPrecioArticulo;
    public javax.swing.JLabel labelPrecioPed;
    public javax.swing.JLabel labelPrecioPed1;
    public javax.swing.JLabel labelSalir;
    public javax.swing.JLabel labelTiempoTrabajado;
    public javax.swing.JLabel labelTrabajadorPed;
    public javax.swing.JLabel labelTrabajadorPed1;
    public javax.swing.JLabel labelValoracion;
    public javax.swing.JLabel labelVentasRealizadas;
    public javax.swing.JLabel labelVolver;
    public javax.swing.JList<String> listaPedidos;
    public javax.swing.JList<String> listaPedidos1;
    public javax.swing.JList<String> listaProvee;
    public javax.swing.JLabel logoInicio;
    public javax.swing.JLabel nifProveedor;
    public javax.swing.JLabel nombrePerfil;
    public javax.swing.JDialog nuevosPedidos;
    public javax.swing.JLabel paisProveedor;
    public javax.swing.JPanel panelArticulos;
    public javax.swing.JPanel panelArticulosAux;
    public javax.swing.JPanel panelCentral;
    public javax.swing.JPanel panelCesta;
    public javax.swing.JPanel panelDescripcion;
    public javax.swing.JPanel panelInfoProvee;
    public javax.swing.JPanel panelInfoTrabajadores;
    public javax.swing.JPanel panelMenu;
    public javax.swing.JPanel panelPedidos;
    public javax.swing.JPanel panelPedidos1;
    public javax.swing.JPanel panelPerfil;
    public javax.swing.JPanel panelPrincipal;
    public javax.swing.JFrame principal;
    public javax.swing.JFrame principalAdmin;
    public javax.swing.JTextArea productosFacturaCompra;
    public javax.swing.JDialog proveedores1;
    public javax.swing.JLabel recaudacionPerfil;
    public javax.swing.JDialog stock3;
    public javax.swing.JTable tablaCesta;
    public javax.swing.JTable tablaFechasHistorial;
    public javax.swing.JTable tablaPedidos;
    public javax.swing.JTable tablaPedidos1;
    public javax.swing.JTable tablaPedidosCompra;
    public javax.swing.JTable tablaProdProveed;
    public javax.swing.JTable tablaProductosHistorial;
    public javax.swing.JTable tablaProductosProvee;
    public javax.swing.JTable tablaStock;
    public javax.swing.JTable tablaTrabajadores;
    public javax.swing.JLabel telefonoPerfil;
    public javax.swing.JLabel telefonoProveedor;
    public javax.swing.JLabel textoCarga;
    public javax.swing.JLabel tiempoTrabajadoPerfil;
    public javax.swing.JDialog trabajadores4;
    public javax.swing.JTextField txtApellContra;
    public javax.swing.JTextField txtBusquedaStock;
    public javax.swing.JTextField txtCDomicilio;
    public javax.swing.JLabel txtCorreoFacturaCompra;
    public javax.swing.JTextArea txtDescripción;
    public javax.swing.JLabel txtDireccionFacturaCompra;
    public javax.swing.JTextField txtDniContra;
    public javax.swing.JTextField txtEmailContra;
    public javax.swing.JLabel txtFechaFacturaCompra;
    public javax.swing.JLabel txtHoraFacturaCompra;
    public javax.swing.JTextField txtIPBD;
    public javax.swing.JTextField txtIVA;
    public javax.swing.JTextField txtNDomicilio;
    public javax.swing.JLabel txtNIFFacturaCompra;
    public javax.swing.JTextField txtNewValora;
    public javax.swing.JTextField txtNombreBD;
    public javax.swing.JTextField txtNombreContra;
    public javax.swing.JLabel txtPaisFacturaCompra;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtPassBD;
    public javax.swing.JTextField txtPasswContra;
    public javax.swing.JTextField txtPortBD;
    public javax.swing.JTextField txtPrecioBase;
    public javax.swing.JLabel txtPrecioFacturaCompra;
    public javax.swing.JTextField txtPrecioTotal;
    public javax.swing.JTextField txtPrecioTotalPedidoProv;
    public javax.swing.JLabel txtProveedorFacturaCompra;
    public javax.swing.JTextField txtTelefContra;
    public javax.swing.JLabel txtTelefonoFacturaCompra;
    public javax.swing.JTextField txtUserContra;
    public javax.swing.JTextField txtUsuBD;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JLabel uni;
    public javax.swing.JLabel usuarioAdminConectado;
    public javax.swing.JLabel usuarioConectado;
    public javax.swing.JLabel valoracionPerfil;
    public javax.swing.JDialog ventas5;
    // End of variables declaration//GEN-END:variables
}