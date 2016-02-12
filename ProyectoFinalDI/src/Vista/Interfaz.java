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
        panelArticulos = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        btnSalirAdmin = new javax.swing.JButton();
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

        jButton1.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton4, gridBagConstraints);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        btnSalirAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnSalirAdmin.setText("SALIR");
        jPanel4.add(btnSalirAdmin);

        jPanel2.add(jPanel4);

        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        usuarioAdminConectado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(usuarioAdminConectado);

        javax.swing.GroupLayout principalAdminLayout = new javax.swing.GroupLayout(principalAdmin.getContentPane());
        principalAdmin.getContentPane().setLayout(principalAdminLayout);
        principalAdminLayout.setHorizontalGroup(
            principalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarConfig;
    public javax.swing.JButton btnCancelarConfig;
    public javax.swing.JButton btnCancelarPed;
    public javax.swing.JButton btnEsp;
    public javax.swing.JButton btnIng;
    public javax.swing.JButton btnIniciarSesion;
    public javax.swing.JButton btnRealizarPed;
    public javax.swing.JButton btnSalirAdmin;
    public javax.swing.JDialog cargando;
    public javax.swing.JComboBox comboDescuentos;
    public javax.swing.JComboBox<String> comboFechaPed;
    public javax.swing.JDialog configuracionDB;
    public javax.swing.JLabel correoPerfil;
    public javax.swing.JLabel direccionPerfil;
    public javax.swing.JLabel dniPerfil;
    public javax.swing.JLabel fondo;
    public javax.swing.JPanel fondoInicio;
    public javax.swing.JPanel infoInicio;
    public javax.swing.JPanel inicio;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
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
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel labelAdminPedidos;
    public javax.swing.JLabel labelAdminProveedores;
    public javax.swing.JLabel labelAdminStock;
    public javax.swing.JLabel labelAdminTrabajadores;
    public javax.swing.JLabel labelAdminVentas;
    public javax.swing.JLabel labelAvisar;
    public javax.swing.JLabel labelClientePed;
    public javax.swing.JLabel labelCodPed;
    public javax.swing.JLabel labelHoraPed;
    public javax.swing.JLabel labelNombreArticulo;
    public javax.swing.JLabel labelNuevoPedido;
    public javax.swing.JLabel labelPedidos;
    public javax.swing.JLabel labelPerfil;
    public javax.swing.JLabel labelPrecioArticulo;
    public javax.swing.JLabel labelPrecioPed;
    public javax.swing.JLabel labelSalir;
    public javax.swing.JLabel labelTrabajadorPed;
    public javax.swing.JLabel labelVolver;
    public javax.swing.JList<String> listaPedidos;
    public javax.swing.JLabel logoInicio;
    public javax.swing.JLabel nombrePerfil;
    public javax.swing.JPanel panelArticulos;
    public javax.swing.JPanel panelCentral;
    public javax.swing.JPanel panelCesta;
    public javax.swing.JPanel panelDescripcion;
    public javax.swing.JPanel panelMenu;
    public javax.swing.JPanel panelPedidos;
    public javax.swing.JPanel panelPerfil;
    public javax.swing.JPanel panelPrincipal;
    public javax.swing.JFrame principal;
    public javax.swing.JFrame principalAdmin;
    public javax.swing.JLabel recaudacionPerfil;
    public javax.swing.JTable tablaCesta;
    public javax.swing.JTable tablaPedidos;
    public javax.swing.JLabel telefonoPerfil;
    public javax.swing.JLabel textoCarga;
    public javax.swing.JLabel tiempoTrabajadoPerfil;
    public javax.swing.JTextArea txtDescripción;
    public javax.swing.JTextField txtIPBD;
    public javax.swing.JTextField txtIVA;
    public javax.swing.JTextField txtNombreBD;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtPassBD;
    public javax.swing.JTextField txtPortBD;
    public javax.swing.JTextField txtPrecioBase;
    public javax.swing.JTextField txtPrecioTotal;
    public javax.swing.JTextField txtUsuBD;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JLabel uni;
    public javax.swing.JLabel usuarioAdminConectado;
    public javax.swing.JLabel usuarioConectado;
    public javax.swing.JLabel valoracionPerfil;
    // End of variables declaration//GEN-END:variables
}