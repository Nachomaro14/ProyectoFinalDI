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
        btnNuevoPedido = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnAvisar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        PanelDescripcion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripción = new javax.swing.JTextArea();
        btnEsp = new javax.swing.JButton();
        btnIng = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        panelArticulos = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        panelCesta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCancelarPed = new javax.swing.JButton();
        btnRealizarPed = new javax.swing.JButton();
        comboDescuentos = new javax.swing.JComboBox();
        txtPrecioTotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtPrecioBase = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        inicio = new javax.swing.JPanel();
        infoInicio = new javax.swing.JPanel();
        logoInicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        cargando.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        PanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevoPedido.setText("Nuevo Pedido");

        btnPedidos.setText("Pedidos");

        btnAvisar.setText("AVISAR");

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 705, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAvisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        principal.getContentPane().add(PanelMenu, java.awt.BorderLayout.PAGE_START);

        PanelDescripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescripción.setColumns(20);
        txtDescripción.setRows(5);
        txtDescripción.setText("DESCRIPCION DE LOS ARTÍCULOS");
        jScrollPane1.setViewportView(txtDescripción);

        PanelDescripcion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 826, -1));

        btnEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandera española.png"))); // NOI18N
        PanelDescripcion.add(btnEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 40, 40));

        btnIng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandera inglesa.png"))); // NOI18N
        PanelDescripcion.add(btnIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, 40, 40));

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 60.0;
        gridBagConstraints.weighty = 60.0;
        panelArticulos.add(jButton9, gridBagConstraints);

        panelCesta.setBorder(new javax.swing.border.MatteBorder(null));
        panelCesta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        panelCesta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 236, 271));

        btnCancelarPed.setText("Cancelar");
        panelCesta.add(btnCancelarPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 410, -1, -1));

        btnRealizarPed.setText("Realizar");
        panelCesta.add(btnRealizarPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 410, -1, -1));

        comboDescuentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDescuentosActionPerformed(evt);
            }
        });
        panelCesta.add(comboDescuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 289, 142, -1));

        txtPrecioTotal.setText("*Precio Total");
        panelCesta.add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 379, 122, -1));

        txtIVA.setText("*IVA");
        panelCesta.add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 353, 122, -1));

        txtPrecioBase.setText("*PrecioBase");
        panelCesta.add(txtPrecioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 327, 122, -1));

        jLabel6.setText("Descuento:");
        panelCesta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 292, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelerita.png"))); // NOI18N
        jButton10.setPreferredSize(new java.awt.Dimension(5, 5));
        panelCesta.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 327, 50, 50));

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        fondoInicio.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, -1));
        fondoInicio.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, -1));

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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void comboDescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDescuentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDescuentosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDescripcion;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAvisar;
    private javax.swing.JButton btnCancelarPed;
    private javax.swing.JButton btnEsp;
    private javax.swing.JButton btnIng;
    public javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnRealizarPed;
    public javax.swing.JDialog cargando;
    private javax.swing.JComboBox comboDescuentos;
    public javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoInicio;
    private javax.swing.JPanel infoInicio;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel logoInicio;
    private javax.swing.JPanel panelArticulos;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelCesta;
    public javax.swing.JFrame principal;
    public javax.swing.JLabel textoCarga;
    private javax.swing.JTextArea txtDescripción;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtPrecioBase;
    private javax.swing.JTextField txtPrecioTotal;
    public javax.swing.JLabel uni;
    // End of variables declaration//GEN-END:variables
}