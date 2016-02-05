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
        PanelMenu = new javax.swing.JPanel();
        usuarioConectado = new javax.swing.JLabel();
        btnEsp = new javax.swing.JButton();
        btnIng = new javax.swing.JButton();
        labelSalir = new javax.swing.JLabel();
        labelAvisar = new javax.swing.JLabel();
        labelPedidos = new javax.swing.JLabel();
        labelNuevoPedido = new javax.swing.JLabel();
        labelPerfil = new javax.swing.JLabel();
        labelVolver = new javax.swing.JLabel();
        PanelDescripcion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripción = new javax.swing.JTextArea();
        labelNombreArticulo = new javax.swing.JLabel();
        labelPrecioArticulo = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
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
        PanelPedidos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboFechaPed = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        labelHoraPed = new javax.swing.JLabel();
        labelCodPed = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPedidos = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        labelTrabajadorPed = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        labelClientePed = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelPrecioPed = new javax.swing.JLabel();
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

        PanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(labelAvisar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIng, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEsp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNuevoPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAvisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelMenuLayout.createSequentialGroup()
                        .addComponent(btnEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelMenuLayout.createSequentialGroup()
                        .addComponent(labelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        principal.getContentPane().add(PanelMenu, java.awt.BorderLayout.PAGE_START);

        PanelDescripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDescripción.setColumns(20);
        txtDescripción.setRows(5);
        txtDescripción.setText("DESCRIPCION DE LOS ARTÍCULOS");
        jScrollPane1.setViewportView(txtDescripción);

        labelNombreArticulo.setText("Nombre del artículo seleccionado");

        labelPrecioArticulo.setText("Precio del artículo seleccionado");

        javax.swing.GroupLayout PanelDescripcionLayout = new javax.swing.GroupLayout(PanelDescripcion);
        PanelDescripcion.setLayout(PanelDescripcionLayout);
        PanelDescripcionLayout.setHorizontalGroup(
            PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDescripcionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDescripcionLayout.createSequentialGroup()
                        .addComponent(labelNombreArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPrecioArticulo)
                        .addGap(0, 866, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        PanelDescripcionLayout.setVerticalGroup(
            PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreArticulo)
                    .addComponent(labelPrecioArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        principal.getContentPane().add(PanelDescripcion, java.awt.BorderLayout.PAGE_END);

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

        btnCancelarPed.setText("Cancelar");

        btnRealizarPed.setText("Realizar");

        comboDescuentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDescuentosActionPerformed(evt);
            }
        });

        txtPrecioTotal.setText("*Precio Total");
        txtPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTotalActionPerformed(evt);
            }
        });

        txtIVA.setText("*IVA");

        txtPrecioBase.setText("*PrecioBase");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
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

        jLabel7.setText("Fecha:");

        comboFechaPed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Hora:");

        labelHoraPed.setText("jLabel9");

        labelCodPed.setText("jLabel10");

        jLabel11.setText("Código de pedido:");

        listaPedidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaPedidos);

        jLabel12.setText("Trabajador:");

        labelTrabajadorPed.setText("jLabel13");

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

        jLabel14.setText("Cliente:");

        labelClientePed.setText("jLabel15");

        jLabel17.setText("Precio:");

        labelPrecioPed.setText("jLabel16");

        javax.swing.GroupLayout PanelPedidosLayout = new javax.swing.GroupLayout(PanelPedidos);
        PanelPedidos.setLayout(PanelPedidosLayout);
        PanelPedidosLayout.setHorizontalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboFechaPed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(labelTrabajadorPed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(labelHoraPed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(labelClientePed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrecioPed)))
                .addContainerGap())
        );
        PanelPedidosLayout.setVerticalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFechaPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHoraPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTrabajadorPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelClientePed)
                    .addComponent(labelPrecioPed)
                    .addComponent(jLabel17)))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        principal.getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inicio.setLayout(new java.awt.BorderLayout());

        infoInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logoInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Dessernational©");

        jLabel2.setText("Ignacio Mazuecos Roldán & Alberto M. Moreno López");

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
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("USUARIO");
        fondoInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        fondoInicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, 20));
        fondoInicio.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, -1));
        fondoInicio.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, -1));

        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelDescripcion;
    public javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPedidos;
    public javax.swing.JPanel PanelPrincipal;
    public javax.swing.JButton btnCancelarPed;
    public javax.swing.JButton btnEsp;
    public javax.swing.JButton btnIng;
    public javax.swing.JButton btnIniciarSesion;
    public javax.swing.JButton btnRealizarPed;
    public javax.swing.JDialog cargando;
    public javax.swing.JComboBox comboDescuentos;
    private javax.swing.JComboBox<String> comboFechaPed;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel labelAvisar;
    private javax.swing.JLabel labelClientePed;
    private javax.swing.JLabel labelCodPed;
    private javax.swing.JLabel labelHoraPed;
    public javax.swing.JLabel labelNombreArticulo;
    public javax.swing.JLabel labelNuevoPedido;
    public javax.swing.JLabel labelPedidos;
    public javax.swing.JLabel labelPerfil;
    public javax.swing.JLabel labelPrecioArticulo;
    private javax.swing.JLabel labelPrecioPed;
    public javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelTrabajadorPed;
    public javax.swing.JLabel labelVolver;
    private javax.swing.JList<String> listaPedidos;
    public javax.swing.JLabel logoInicio;
    public javax.swing.JPanel panelArticulos;
    public javax.swing.JPanel panelCentral;
    public javax.swing.JPanel panelCesta;
    public javax.swing.JFrame principal;
    public javax.swing.JTable tablaCesta;
    private javax.swing.JTable tablaPedidos;
    public javax.swing.JLabel textoCarga;
    public javax.swing.JTextArea txtDescripción;
    public javax.swing.JTextField txtIVA;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtPrecioBase;
    public javax.swing.JTextField txtPrecioTotal;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JLabel uni;
    public javax.swing.JLabel usuarioConectado;
    // End of variables declaration//GEN-END:variables
}