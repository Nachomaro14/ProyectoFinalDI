package Controlador;

import Modelo.Modelo;
import UpperEssential.UpperEssentialLookAndFeel;
import Vista.Interfaz;
import Clases.TablaRenderizador;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Controlador implements ActionListener, MouseListener {

    //INICIALIZAMOS UNA SERIE DE VARIABLES PARA CONTROLAR ALGUNAS OPERACIONES INTERNAS DE LA APLICACIÓN
    Interfaz vista; //PARA PODER ACCEDER A LA INTERFAZ DE LA APLICACIÓN
    Modelo modelo; //PARA PODER ACCEDER AL MODELO Y A LOS DATOS DE LA BD
    int contadorCarga1 = 0; //PARA CONTROLAR EL TIEMPO DEL HILO UNI1
    int contadorCarga2 = 0; //PARA CONTROLAR EL TIEMPO DEL HILO UNI2
    String usuario = ""; //PARA SABER SIEMPRE CUÁL ES EL USUARIO CONECTADO
    int botonesPrincipales = 0; //PARA SABER SI ESTAMOS OBSERVANDO LOS BOTONES PRINCIPALES
    int botonesBebidas = 0; //PARA SABER SI ESTAMOS OBSERVANDO LOS BOTONES DE BEBIDAS
    int botonesMenus = 0; //PARA SABER SI ESTAMOS OBSERVANDO LOS BOTONES DE MENÚS
    int botonesPasteleria = 0; //PARA SABER SI ESTAMOS OBSERVANDO LOS BOTONES DE PASTELERÍA
    int botonesOfertas = 0; //PARA SABER SI ESTAMOS OBSERVANDO LOS BOTONES DE OFERTAS
    String botonesPais = ""; //PARA SABER SI ESTAMOS OBSERVANDO LOS BOTONES DE UN PAÍS Y CUÁL
    int aviso = 0; //PARA CONTROLAR EL AVISO DE ASISTENCIA AL ADMINISTRADOR
    Comprobacion c = new Comprobacion(); //PARA PODER UTILIZAR EL HILO COMPROBACIÓN EN DIFERENTES SITUACIONES
    Acumulador a = new Acumulador(); //PARA PODER UTILIZAR EL HILO ACUMULADOR EN DIFERENTES SITUACIONES
    TablaRenderizador render; //PARA CONFIGURAR LA APARIENCIA DE UNA TABLA
    int modificarTrabajador = 0; //PARA SABER SI INSERTAR O MODIFICAR UN TRABAJADOR

    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};//Array para encriptar en MD5

    public Controlador(Interfaz i) {
        vista = i;
    }

    //DEFINIMOS EN UN ENUM LOS VALORES DE LOS BOTONES A USAR
    public enum AccionMVC {

        //***********BOTONES LOGIN*******************
        btnIniciarSesion,
        btnAceptarConfig,
        btnCancelarConfig,
        //*************BOTONES ADMIN*****************
        btnNuevoEmpleado,
        btnModificaEmpleado,
        checkModContra,
        btnDespideEmpleado,
        btnAceptarContrato,
        btnCancelarContrato,
        //COMPRAS
        btnNewPedido,
        btnHistorialPedido,
        //***********BOTONES PEDIDOS*****************
        btnBebidas,
        btnPasteleria,
        btnMenus,
        btnOfertas
    }

    //ESTE GRAN MÉTODO INICIARÁ E INICIALIZARÁ TODO LO NECESARIO PARA COMENZAR EL FUNCIONAMIENTO DE LA APLICACIÓN
    public void iniciar() {

        try {
            //MODIFICAMOS EL LOOK AND FEEL DE LAS VENTANAS DE LA APLICACIÓN
            UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("Oscuros.theme"));
            SwingUtilities.updateComponentTreeUI(vista);
            SwingUtilities.updateComponentTreeUI(vista.principal);
            SwingUtilities.updateComponentTreeUI(vista.principalAdmin);
            SwingUtilities.updateComponentTreeUI(vista.proveedores1);
            SwingUtilities.updateComponentTreeUI(vista.compras2);
            SwingUtilities.updateComponentTreeUI(vista.historial);
            SwingUtilities.updateComponentTreeUI(vista.nuevosPedidos);

            SwingUtilities.updateComponentTreeUI(vista.stock3);
            SwingUtilities.updateComponentTreeUI(vista.contratar);
            SwingUtilities.updateComponentTreeUI(vista.trabajadores4);
            SwingUtilities.updateComponentTreeUI(vista.ventas5);

            //MODIFICAMOS LAS PROPIEDADES DE LOS PANELES PRINCIPALES
            vista.principal.setResizable(false);
            vista.principal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            vista.principalAdmin.setResizable(false);
            vista.principalAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH);

            //MODIFICAMOS EL LOGO DE LAS VENTANAS DE LA APLICACIÓN
            Toolkit t = Toolkit.getDefaultToolkit();
            vista.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.principal.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.proveedores1.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.historial.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.nuevosPedidos.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.stock3.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.contratar.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.trabajadores4.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.ventas5.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));

            //MODIFICAMOS EL TÍTULO DE LAS VENTANAS DE LA APLICACIÓN
            vista.pack();
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
            vista.setTitle("International Cafe Dessernational");

            //AJUSTAMOS EL TAMAÑO DE LAS IMÁGENES A SUS CONTENEDORES            
            int logoInicioW = vista.logoInicio.getWidth();
            int logoInicioH = vista.logoInicio.getHeight();
            ImageIcon logoInicioIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"));

            Image logoInicioImg = logoInicioIcon.getImage();
            Image logoInicioNewImg = logoInicioImg.getScaledInstance(logoInicioW, logoInicioH, java.awt.Image.SCALE_SMOOTH);
            logoInicioIcon = new ImageIcon(logoInicioNewImg);
            vista.logoInicio.setIcon(logoInicioIcon);

            int fondoInicioW = vista.fondo.getWidth();
            int fondoInicioH = vista.fondo.getHeight();
            ImageIcon fondoInicioIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoInicio.png"));

            Image fondoInicioImg = fondoInicioIcon.getImage();
            Image fondoInicioNewImg = fondoInicioImg.getScaledInstance(fondoInicioW, fondoInicioH, java.awt.Image.SCALE_SMOOTH);
            fondoInicioIcon = new ImageIcon(fondoInicioNewImg);
            vista.fondo.setIcon(fondoInicioIcon);

            //CONTROLAMOS OTRAS NECESIDADES COMO LOS MOUSELISTENER O LA VISIBILIDAD DE ALGUNOS PANELES            
            vista.labelNuevoPedido.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.panelDescripcion.setVisible(false);
                    vista.panelCentral.setVisible(true);
                    vista.panelArticulos.setVisible(true);
                    vista.panelArticulosAux.setVisible(false);
                    vista.panelPedidos.setVisible(false);
                    vista.panelPerfil.setVisible(false);
                    //DEBEMOS CONTROLAR QUÉ BOTONES SE MOSTRARÁN EN EL PANEL DE PEDIDO EN TODO MOMENTO
                    //ESTO SERÁ IMPORTANTE A LA HORA DE PULSAR EL BOTÓN "ATRÁS"
                    botonesPrincipales = 1;
                    botonesBebidas = 0;
                    botonesMenus = 0;
                    botonesPasteleria = 0;
                    botonesOfertas = 0;
                    botonesPais = "";
                }

                //REDEFINIMOS EL MÉTODO MOUSEPRESSED PARA QUE EL LABEL PAREZCA UN BOTÓN PULSADO
                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelNuevoPedido.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelNuevoPedido.setBorder(null);
                }
            });
            vista.labelPedidos.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.panelDescripcion.setVisible(false);
                    vista.panelCentral.setVisible(false);
                    vista.panelPedidos.setVisible(true);
                    vista.panelPerfil.setVisible(false);
                    botonesPrincipales = 0;
                    botonesBebidas = 0;
                    botonesMenus = 0;
                    botonesPasteleria = 0;
                    botonesOfertas = 0;
                    botonesPais = "";

                    //CONFIGURAMOS EL COMBOBOX PARA QUE MUESTRE LAS FECHAS DE PEDIDOS REGISTRADOS HASTA ESE MOMENTO
                    vista.comboFechaPed.setModel(new DefaultComboBoxModel(modelo.getFechas()));
                    String fp = "";
                    DefaultListModel lm = modelo.listaPedidos(fp);
                    vista.listaPedidos.setModel(lm);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelPedidos.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelPedidos.setBorder(null);
                }
            });
            vista.labelSalir.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.panelDescripcion.setVisible(false);
                    //CERRAMOS EL HILO QUE ACUMULA TIEMPO DE TRABAJO DEL TRABAJADOR
                    a.close();
                    vista.usuarioConectado.setText("");
                    usuario = "";
                    vista.principal.setVisible(false);
                    vista.panelPedidos.setVisible(false);
                    vista.panelCentral.setVisible(false);
                    vista.panelPerfil.setVisible(false);
                    vista.txtUsuario.setText("");
                    vista.txtPass.setText("");
                    vista.setVisible(true);

                    botonesPrincipales = 0;
                    botonesBebidas = 0;
                    botonesMenus = 0;
                    botonesPasteleria = 0;
                    botonesOfertas = 0;
                    botonesPais = "";
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelSalir.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelSalir.setBorder(null);
                }
            });
            vista.labelAvisar.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //COMPROBAMOS SI EL USUARIO ES UN TRABAJADOR PARA PODER REALIZAR UN AVISO
                    if (modelo.esAdmin(usuario) == true) {
                        JOptionPane.showMessageDialog(null, "No disponible.");
                    } else {
                        //EJECUTAMOS EL MÉTODO AVISAR, QUE SERÁ RECOGIDO POR EL HILO "COMPROBACIÓN"
                        modelo.avisar();
                        JOptionPane.showMessageDialog(null, "Administrador avisado.");
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelAvisar.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelAvisar.setBorder(null);
                }
            });
            //EN ESTE LABEL SERÁ NECESARIO CONOCER LA VISIBLIDAD DE LOS BOTONES ACTUAL, PARA SABER
            //CUÁLES ESTÁN SIENDO MOSTRADOS Y A CUÁLES HAY QUE RETROCEDER
            vista.labelVolver.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.panelDescripcion.setVisible(false);
                    if (botonesPrincipales == 1) {
                        //NO OCURRE NADA
                    } else if (botonesMenus == 1) {
                        botonesMenus = 0;
                        botonesPrincipales = 1;
                        vista.panelArticulosAux.setVisible(false);
                        vista.panelArticulosAux.removeAll();
                        vista.panelArticulosAux.repaint();
                        vista.panelArticulos.setVisible(true);
                    } else if (botonesOfertas == 1) {
                        botonesOfertas = 0;
                        botonesPrincipales = 1;
                        vista.panelArticulosAux.setVisible(false);
                        vista.panelArticulosAux.removeAll();
                        vista.panelArticulosAux.repaint();
                        vista.panelArticulos.setVisible(true);
                    } else if (botonesBebidas == 1) {
                        botonesBebidas = 0;
                        botonesPrincipales = 1;
                        vista.panelArticulosAux.setVisible(false);
                        vista.panelArticulosAux.removeAll();
                        vista.panelArticulosAux.repaint();
                        vista.panelArticulos.setVisible(true);
                    } else if (botonesPasteleria == 1) {
                        botonesPasteleria = 0;
                        botonesPrincipales = 1;
                        vista.panelArticulosAux.setVisible(false);
                        vista.panelArticulosAux.removeAll();
                        vista.panelArticulosAux.repaint();
                        vista.panelArticulos.setVisible(true);
                    } else if (!botonesPais.equals("")) {
                        botonesPais = "";
                        botonesPasteleria = 1;
                        vista.panelArticulosAux.removeAll();
                        vista.panelArticulosAux.repaint();
                        Object[] paises = modelo.getPaisPasteles();
                        int auxpais = paises.length;
                        JButton botonPais;
                        //Creamos un objeto boton por cada articulo recogido de la BD
                        for (int i = 0; i < auxpais; i++) {
                            String name = paises[i].toString();
                            botonPais = new JButton(name);
                            //ActionListener de cada boton creado desde codigo
                            botonPais.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    botonesPasteleria = 0;
                                    botonesPais = name;
                                    vista.panelArticulosAux.removeAll();
                                    vista.panelArticulosAux.repaint();
                                    Object[][] pasteles = modelo.getPasteles(name);
                                    int auxpast = pasteles.length;
                                    JButton botonPasteles;
                                    //Creamos un objeto boton por cada articulo recogido de la BD
                                    for (int i = 0; i < auxpast; i++) {
                                        String pastel = pasteles[i][1].toString();
                                        botonPasteles = new JButton(pastel);
                                        //ActionListener de cada boton creado desde codigo
                                        botonPasteles.addMouseListener(new MouseListener() {

                                            @Override
                                            public void mouseClicked(MouseEvent e) {
                                                if (e.getClickCount() == 2) {
                                                    //añadir a la cesta
                                                    System.out.println("double clicked");
                                                } else if (e.getClickCount() == 1) {
                                                    Object[] infopastel = modelo.getInfoPastel(pastel);
                                                    vista.labelNombreArticulo.setText("Nombre: " + infopastel[0].toString());
                                                    vista.labelPrecioArticulo.setText("Precio: " + infopastel[1].toString() + "€");
                                                    vista.txtDescripción.setText(infopastel[2].toString());
                                                    vista.panelDescripcion.setVisible(true);
                                                }
                                            }

                                            @Override
                                            public void mousePressed(MouseEvent e) {

                                            }

                                            @Override
                                            public void mouseReleased(MouseEvent e) {

                                            }

                                            @Override
                                            public void mouseEntered(MouseEvent e) {

                                            }

                                            @Override
                                            public void mouseExited(MouseEvent e) {

                                            }
                                        });
                                        vista.panelArticulosAux.add(botonPasteles);
                                    }
                                }
                            });
                            vista.panelArticulosAux.add(botonPais);
                        }
                        vista.panelArticulosAux.setVisible(true);
                        vista.panelArticulos.setVisible(false);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelVolver.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelVolver.setBorder(null);
                }
            });
            vista.labelPerfil.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.panelDescripcion.setVisible(false);
                    vista.panelCentral.setVisible(false);
                    vista.panelPedidos.setVisible(false);
                    vista.panelPerfil.setVisible(true);
                    botonesPrincipales = 0;
                    botonesBebidas = 0;
                    botonesMenus = 0;
                    botonesPasteleria = 0;
                    botonesOfertas = 0;
                    botonesPais = "";

                    //AL PULSAR EL LABEL SE OBTENDRÁ TODA LA INFORMACIÓN REFERENTE AL TRABAJADOR
                    //Y SE ACTUALIZARÁN LOS LABELS DEL PANEL DE PERFIL DE TRABAJADOR
                    Object[] info = modelo.infoTrabajador(usuario);
                    vista.dniPerfil.setText(info[0].toString());
                    String nombre = info[1].toString();
                    String apellidos = info[2].toString();
                    vista.nombrePerfil.setText(nombre + " " + apellidos);
                    vista.telefonoPerfil.setText(info[3].toString());
                    vista.correoPerfil.setText(info[4].toString());
                    vista.direccionPerfil.setText(info[5].toString());

                    vista.recaudacionPerfil.setText(info[7].toString() + "€");
                    //LA IMAGEN MOSTRADA EN EL PANEL SERÁ UN NÚMERO DE ESTRELLAS SEGÚN LA VALORACIÓN
                    //DEL ADMINISTRADOR SOBRE ESE TRABAJADOR
                    int valoracion = (int) info[8];
                    imagenValoracion(valoracion);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelPerfil.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelPerfil.setBorder(null);
                }
            });
            //AL PULSAR "ENTER" TENIENDO SELECCIONADO EL TEXTFIELD DE USUARIO, PASARÁ A SELECCIONAR EL DE CONTRASEÑA
            vista.txtUsuario.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        vista.txtPass.requestFocus();
                    }
                }
            });
            //AL PULSAR "ENTER" TENIENDO SELECCIONADO EL TEXTFIELD DE CONTRASEÑA INICIARÁ SESIÓN DIRECTAMENTE
            vista.txtPass.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        vista.configuracionDB.pack();
                        vista.configuracionDB.setLocationRelativeTo(null);
                        vista.configuracionDB.setVisible(true);
                    }
                }
            });

            //AÑADIMOS UN KEYLISTENER A LOS CAMPOS DE LA CONFIGURACIÓN DE LA BASE DE DATOS
            //PARA QUE AL PULSAR ENTER INICIE DIRECTAMENTE CON LO ESCRITO
            vista.txtNombreBD.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        abrirPrograma();
                    }
                }
            });
            vista.txtUsuBD.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        abrirPrograma();
                    }
                }
            });
            vista.txtPassBD.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        abrirPrograma();
                    }
                }
            });
            vista.txtIPBD.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        abrirPrograma();
                    }
                }
            });
            vista.txtPortBD.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        abrirPrograma();
                    }
                }
            });

            //A PARTIR DE AQUÍ DEFINIMOS LAS ACCIONES AL CLICKAR SOBRE LOS LABELS DEL PANEL PRINCIPAL DEL ADMINISTRADOR
            //*******************ADMINISTRADOR***************
            vista.labelAdminProveedores.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    DefaultListModel lp = modelo.listaProveedores();
                    vista.listaProvee.setModel(lp);

                    vista.proveedores1.pack();
                    vista.proveedores1.setLocationRelativeTo(null);
                    vista.proveedores1.setTitle("Proveedores");
                    vista.proveedores1.setVisible(true);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelAdminProveedores.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelAdminProveedores.setBorder(null);
                }
            });
            vista.labelAdminPedidos.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.compras2.pack();
                    vista.compras2.setLocationRelativeTo(null);
                    vista.compras2.setTitle("Compras");
                    vista.compras2.setVisible(true);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelAdminPedidos.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelAdminPedidos.setBorder(null);
                }
            });
            vista.labelAdminStock.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.stock3.pack();
                    vista.stock3.setLocationRelativeTo(null);
                    vista.stock3.setTitle("Stock Tienda");
                    vista.stock3.setVisible(true);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelAdminStock.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelAdminStock.setBorder(null);
                }
            });
            vista.labelAdminTrabajadores.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.tablaTrabajadores.setModel(modelo.tablaTrabajadores());

                    vista.trabajadores4.pack();
                    vista.trabajadores4.setLocationRelativeTo(null);
                    vista.trabajadores4.setTitle("Trabajadores");
                    vista.trabajadores4.setVisible(true);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelAdminTrabajadores.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelAdminTrabajadores.setBorder(null);
                }
            });
            vista.labelAdminVentas.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.ventas5.pack();
                    vista.ventas5.setLocationRelativeTo(null);
                    vista.ventas5.setTitle("Ventas");
                    vista.ventas5.setVisible(true);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelAdminVentas.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelAdminVentas.setBorder(null);
                }
            });
            vista.labelAdminSalir.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    vista.usuarioConectado.setText("");
                    usuario = "";
                    vista.principalAdmin.setVisible(false);
                    vista.txtUsuario.setText("");
                    vista.txtPass.setText("");
                    vista.setVisible(true);
                    //AL SALIR DE LA SESIÓN DE ADMINISTRADOR, CERRAMOS EL HILO QUE MANTIENE ACTIVA LA COMPROBACIÓN
                    //DE LOS POSIBLES AVISOS DE LOS TRABAJADORES
                    c.close();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    vista.labelAdminSalir.setBorder(BorderFactory.createLineBorder(Color.black));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    vista.labelAdminSalir.setBorder(null);
                }
            });

            //AÑADIMOS ITEMLISTENERS A LAS LISTAS
            vista.listaProvee.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    String proveedor = vista.listaProvee.getSelectedValue();
                    vista.tablaProductosProvee.setModel(modelo.tablaProductosProveedores(proveedor));
                    String[] info = modelo.infoProveedor(proveedor);
                    vista.nifProveedor.setText(info[0]);
                    vista.direccionProveedor.setText(info[2]);
                    vista.paisProveedor.setText(info[3]);
                    vista.telefonoProveedor.setText(info[4]);
                    vista.correoProveedor.setText(info[5]);
                }
            });

            //ANTES DE TERMINAR EL MÉTODO "INICIAR" OCULTAMOS LOS PANELES DEL PANEL PRINCIPAL
            //PARA QUE NO SE MUESTRE UNO INICIALMENTE
            vista.panelCentral.setVisible(false);
            vista.panelDescripcion.setVisible(false);
            vista.panelPedidos.setVisible(false);
            vista.panelPerfil.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en el método iniciar()");
            ex.printStackTrace();
        }

        //ASIGNAMOS LAS ACCIONES A LOS BOTONES DE LA APLICACIÓN
        vista.btnIniciarSesion.setActionCommand("btnIniciarSesion");
        vista.btnIniciarSesion.addActionListener(this);

        vista.btnAceptarConfig.setActionCommand("btnAceptarConfig");
        vista.btnAceptarConfig.addActionListener(this);
        vista.btnCancelarConfig.setActionCommand("btnCancelarConfig");
        vista.btnCancelarConfig.addActionListener(this);

        vista.btnNuevoEmpleado.setActionCommand("btnNuevoEmpleado");
        vista.btnNuevoEmpleado.addActionListener(this);
        vista.btnModificaEmpleado.setActionCommand("btnModificaEmpleado");
        vista.btnModificaEmpleado.addActionListener(this);

        vista.checkModifico.setActionCommand("checkModContra");
        vista.checkModifico.addActionListener(this);

        vista.btnDespideEmpleado.setActionCommand("btnDespideEmpleado");
        vista.btnDespideEmpleado.addActionListener(this);
        vista.btnAceptarContrato.setActionCommand("btnAceptarContrato");
        vista.btnAceptarContrato.addActionListener(this);
        vista.btnCancelarContrato.setActionCommand("btnCancelarContrato");
        vista.btnCancelarContrato.addActionListener(this);

        //COMPRAS AL PROVEEDOR
        vista.btnNewPedido.setActionCommand("btnNewPedido");
        vista.btnNewPedido.addActionListener(this);
        //HISTORIAL DE COMPRAS
        vista.btnHistorialPedido.setActionCommand("btnHistorialPedido");
        vista.btnHistorialPedido.addActionListener(this);

        vista.btnBebidas.setActionCommand("btnBebidas");
        vista.btnBebidas.addActionListener(this);
        vista.btnPasteleria.setActionCommand("btnPasteleria");
        vista.btnPasteleria.addActionListener(this);
        vista.btnMenus.setActionCommand("btnMenus");
        vista.btnMenus.addActionListener(this);
        vista.btnOfertas.setActionCommand("btnOfertas");
        vista.btnOfertas.addActionListener(this);

        //ASIGNAMOS UN MOUSELISTENER A LAS TABLAS NECESARIAS Y MODIFICAMOS ALGUNAS DE SUS PROPIEDADES
        vista.tablaCesta.addMouseListener(this);
        vista.tablaCesta.getTableHeader().setReorderingAllowed(false);
        vista.tablaCesta.getTableHeader().setResizingAllowed(false);
    }

    //DEFINIMOS LAS ACCIONES DE CADA BOTÓN DE LA APLICACIÓN
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())) {
            //REALIZAMOS LAS MISMAS ACCIONES QUE SE REALIZARÍAN AL PULSAR "ENTER" DESDE EL TEXTFIELD DE LA CONTRASEÑA
            case btnIniciarSesion:
                vista.configuracionDB.pack();
                vista.configuracionDB.setLocationRelativeTo(null);
                vista.configuracionDB.setVisible(true);
                break;
            case btnAceptarConfig:
                abrirPrograma();
                break;
            case btnCancelarConfig:
                vista.configuracionDB.setVisible(false);
                vista.setVisible(true);
                break;
            //************ADMINISTRACION*****************
            case btnNuevoEmpleado:
                modificarTrabajador = 0;
                vista.contratar.pack();
                vista.contratar.setLocationRelativeTo(null);
                vista.contratar.setVisible(true);
                break;
            case btnAceptarContrato:
                if (!"".equals(vista.txtDniContra.getText())
                        && !"".equals(vista.txtUserContra.getText())
                        && !"".equals(vista.txtPasswContra.getText())
                        && !"".equals(vista.txtNombreContra.getText())
                        && !"".equals(vista.txtApellContra.getText())
                        && !"".equals(vista.txtTelefContra.getText())
                        && !"".equals(vista.txtNDomicilio.getText())
                        && !"".equals(vista.txtCDomicilio.getText())
                        && !"".equals(vista.txtEmailContra.getText())) {

                    if (modificarTrabajador == 0) {//INSERTAR
                        //COMPROBAMOS SI EL CHECK ESTA MARCADO
                        if (vista.checkAdmin.isSelected()) {
                            //SI LO ESTA, AÑADIREMOS UN ADMINISTRADOR
                            String pass = vista.txtPasswContra.getText();
                            pass = encriptaEnMD5(pass);
                            modelo.insertAdmin(vista.txtUserContra.getText(),
                                    pass,
                                    vista.txtDniContra.getText(),
                                    vista.txtNombreContra.getText(),
                                    vista.txtApellContra.getText(),
                                    vista.txtTelefContra.getText(),
                                    vista.txtNDomicilio.getText(),
                                    vista.txtCDomicilio.getText(),
                                    vista.txtEmailContra.getText());
                        } else {
                            //SI NO LO ESTA, SERA UN TRABAJADOR
                            String pass = vista.txtPasswContra.getText();
                            pass = encriptaEnMD5(pass);
                            modelo.insertTrabajador(vista.txtUserContra.getText(),
                                    pass,
                                    vista.txtDniContra.getText(),
                                    vista.txtNombreContra.getText(),
                                    vista.txtApellContra.getText(),
                                    vista.txtTelefContra.getText(),
                                    vista.txtNDomicilio.getText(),
                                    vista.txtCDomicilio.getText(),
                                    vista.txtEmailContra.getText());
                        }
                    } else if (modificarTrabajador == 1) {//MODIFICAR
                        if (vista.checkModifico.isSelected()) {
                            String pass = vista.txtPasswContra.getText();
                            pass = encriptaEnMD5(pass);
                            modelo.updateTrabajadorPassword(vista.txtUserContra.getText(),
                                    pass,
                                    vista.txtDniContra.getText(),
                                    vista.txtNombreContra.getText(),
                                    vista.txtApellContra.getText(),
                                    vista.txtTelefContra.getText(),
                                    vista.txtNDomicilio.getText(),
                                    vista.txtCDomicilio.getText(),
                                    vista.txtEmailContra.getText());
                        } else {
                            modelo.updateTrabajadorNoPassword(vista.txtUserContra.getText(),
                                    vista.txtDniContra.getText(),
                                    vista.txtNombreContra.getText(),
                                    vista.txtApellContra.getText(),
                                    vista.txtTelefContra.getText(),
                                    vista.txtNDomicilio.getText(),
                                    vista.txtCDomicilio.getText(),
                                    vista.txtEmailContra.getText());
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Todos los campos deben ser rellenados");
                }
                vista.tablaTrabajadores.setModel(modelo.tablaTrabajadores());
                vista.contratar.dispose();
                break;

            case btnCancelarContrato:
                vista.txtUserContra.setText("");
                vista.txtPasswContra.setText("");
                vista.txtDniContra.setText("");
                vista.txtNombreContra.setText("");
                vista.txtApellContra.setText("");
                vista.txtTelefContra.setText("");
                vista.txtEmailContra.setText("");
                vista.txtNDomicilio.setText("");
                vista.txtCDomicilio.setText("");
                vista.contratar.setVisible(false);
                break;
            case btnModificaEmpleado:
                modificarTrabajador = 1;
                vista.txtPasswContra.setEditable(false);
                vista.txtNombreContra.setEditable(false);

                if (vista.tablaTrabajadores.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar un trabajador de la tabla primero");
                } else {
                    vista.txtUserContra.setText(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 0).toString());
                    vista.txtPasswContra.setText(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 1).toString());
                    vista.txtDniContra.setText(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 2).toString());
                    vista.txtNombreContra.setText(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 3).toString());
                    vista.txtApellContra.setText(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 4).toString());
                    vista.txtTelefContra.setText(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 5).toString());
                    vista.txtEmailContra.setText(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 6).toString());

                    String aux = vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 7).toString();
                    vista.txtNDomicilio.setText(aux.substring(0, aux.indexOf(" ")));//Coge el numero de la direccion
                    vista.txtCDomicilio.setText(aux.substring(aux.indexOf(" ")));

                    vista.contratar.pack();
                    vista.contratar.setLocationRelativeTo(null);
                    vista.contratar.setVisible(true);
                }
                break;
            case btnDespideEmpleado:
                if (vista.tablaTrabajadores.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar un trabajador de la tabla primero");
                } else {//
                    modelo.deleteTrabajador(vista.tablaTrabajadores.getValueAt(vista.tablaTrabajadores.getSelectedRow(), 0).toString());
                }
                break;

            case checkModContra:
                if (vista.checkModifico.isSelected()) {
                    vista.txtPasswContra.setEditable(true);
                } else {
                    vista.txtPasswContra.setEditable(false);
                }
                break;
            case btnNewPedido:
                vista.nuevosPedidos.pack();
                vista.nuevosPedidos.setLocationRelativeTo(null);
                vista.nuevosPedidos.setTitle("Nuevos Pedidos");
                vista.nuevosPedidos.setVisible(true);
                vista.compras2.dispose();
                break;
            case btnHistorialPedido:
                vista.historial.pack();
                vista.historial.setLocationRelativeTo(null);
                vista.historial.setTitle("Historial de compras");
                vista.historial.setVisible(true);
                vista.compras2.dispose();
                break;
            //************EMPLEADOS****************
            case btnBebidas:
                botonesBebidas = 1;
                botonesPrincipales = 0;
                vista.panelArticulosAux.removeAll();
                vista.panelArticulosAux.repaint();
                Object[] drinks = modelo.getNameBebidas();
                int auxbeb = drinks.length;
                JButton botonProduc;
                //Creamos un objeto boton por cada articulo recogido de la BD
                for (int i = 0; i < auxbeb; i++) {
                    String nameBebida = drinks[i].toString();
                    botonProduc = new JButton(nameBebida);
                    //ActionListener de cada boton creado desde codigo

                    botonProduc.addMouseListener(new MouseListener() {

                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getClickCount() == 2) {
                                //añadir a la cesta
                                System.out.println("double clicked");
                            } else if (e.getClickCount() == 1) {
                                //meter la descripcion en el panel descripcion
                                Object[] infobebida = modelo.getInfoBebida(nameBebida);
                                vista.labelNombreArticulo.setText("Nombre: " + infobebida[0].toString());
                                vista.labelPrecioArticulo.setText("Precio: " + infobebida[1].toString() + "€");
                                vista.txtDescripción.setText(infobebida[2].toString());
                                vista.panelDescripcion.setVisible(true);
                            }
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {

                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {

                        }

                        @Override
                        public void mouseExited(MouseEvent e) {

                        }
                    });
                    vista.panelArticulosAux.add(botonProduc);
                }
                vista.panelArticulosAux.setVisible(true);
                vista.panelArticulos.setVisible(false);
                //Boton actual para el Label Atras
                botonesPrincipales = 0;
                botonesBebidas = 1;
                botonesMenus = 0;
                botonesPasteleria = 0;
                botonesOfertas = 0;
                botonesPais = "";
                break;

            case btnPasteleria:
                botonesPasteleria = 1;
                botonesPrincipales = 0;
                vista.panelArticulosAux.removeAll();
                vista.panelArticulosAux.repaint();
                Object[] paises = modelo.getPaisPasteles();
                int auxpais = paises.length;
                JButton botonPais;
                //Creamos un objeto boton por cada articulo recogido de la BD
                for (int i = 0; i < auxpais; i++) {
                    String name = paises[i].toString();
                    botonPais = new JButton(name);
                    //ActionListener de cada boton creado desde codigo
                    botonPais.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            botonesPasteleria = 0;
                            botonesPais = name;
                            vista.panelArticulosAux.removeAll();
                            vista.panelArticulosAux.repaint();
                            Object[][] pasteles = modelo.getPasteles(name);
                            int auxpast = pasteles.length;
                            JButton botonPasteles;
                            //Creamos un objeto boton por cada articulo recogido de la BD
                            for (int i = 0; i < auxpast; i++) {
                                String pastel = pasteles[i][1].toString();
                                botonPasteles = new JButton(pastel);
                                //ActionListener de cada boton creado desde codigo
                                botonPasteles.addMouseListener(new MouseListener() {

                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        if (e.getClickCount() == 2) {
                                            //añadir a la cesta
                                            System.out.println("double clicked");
                                        } else if (e.getClickCount() == 1) {
                                            Object[] infopastel = modelo.getInfoPastel(pastel);
                                            vista.labelNombreArticulo.setText("Nombre: " + infopastel[0].toString());
                                            vista.labelPrecioArticulo.setText("Precio: " + infopastel[1].toString() + "€");
                                            vista.txtDescripción.setText(infopastel[2].toString());
                                            vista.panelDescripcion.setVisible(true);
                                        }
                                    }

                                    @Override
                                    public void mousePressed(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {

                                    }
                                });
                                vista.panelArticulosAux.add(botonPasteles);
                            }
                        }
                    });
                    vista.panelArticulosAux.add(botonPais);
                }
                vista.panelArticulosAux.setVisible(true);
                vista.panelArticulos.setVisible(false);
                //Boton actual para el Label Atras
                botonesPrincipales = 0;
                botonesBebidas = 0;
                botonesMenus = 0;
                botonesPasteleria = 1;
                botonesOfertas = 0;
                break;

            case btnMenus:
                botonesMenus = 1;
                botonesPrincipales = 0;
                vista.panelArticulosAux.removeAll();
                vista.panelArticulosAux.repaint();
                Object[][] menus = modelo.getMenus();

                int auxMen = menus.length;
                JButton botonMenus;
                //Creamos un objeto boton por cada articulo recogido de la BD
                for (int i = 0; i < auxMen; i++) {
                    String nombreMenu = menus[i][1].toString();
                    botonMenus = new JButton(nombreMenu);
                    //ActionListener de cada boton creado desde codigo
                    botonMenus.addMouseListener(new MouseListener() {

                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getClickCount() == 2) {
                                //añadir a la cesta
                                System.out.println("double clicked");
                            } else if (e.getClickCount() == 1) {
                                Object[] infoMenus = modelo.getInfoMenu(nombreMenu);
                                vista.labelNombreArticulo.setText("Nombre: " + infoMenus[0].toString());
                                vista.labelPrecioArticulo.setText("Precio: " + infoMenus[1].toString() + "€");
                                vista.txtDescripción.setText(infoMenus[2].toString());
                                vista.panelDescripcion.setVisible(true);
                            }
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {

                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {

                        }

                        @Override
                        public void mouseExited(MouseEvent e) {

                        }
                    });

                    vista.panelArticulosAux.add(botonMenus);
                }
                vista.panelArticulosAux.setVisible(true);
                vista.panelArticulos.setVisible(false);
                //Boton actual para el Label Atras
                botonesPrincipales = 0;
                botonesBebidas = 0;
                botonesMenus = 1;
                botonesPasteleria = 0;
                botonesOfertas = 0;
                botonesPais = "";
                break;

            case btnOfertas:
                botonesOfertas = 1;
                botonesPrincipales = 0;
                vista.panelArticulosAux.removeAll();
                vista.panelArticulosAux.repaint();
                Object[][] ofertas = modelo.getOfertas();

                int auxOfer = ofertas.length;
                JButton botonOfertas;
                //Creamos un objeto boton por cada articulo recogido de la BD
                for (int i = 0; i < auxOfer; i++) {
                    String nombreOferta = ofertas[i][1].toString();
                    botonOfertas = new JButton(nombreOferta);
                    //ActionListener de cada boton creado desde codigo
                    botonOfertas.addMouseListener(new MouseListener() {

                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getClickCount() == 2) {
                                //añadir a la cesta
                                System.out.println("double clicked");
                            } else if (e.getClickCount() == 1) {
                                Object[] infoOferta = modelo.getInfoOferta(nombreOferta);
                                vista.labelNombreArticulo.setText("Nombre: " + infoOferta[0].toString());
                                vista.labelPrecioArticulo.setText("Precio: " + infoOferta[1].toString() + "€");
                                vista.txtDescripción.setText(infoOferta[2].toString());
                                vista.panelDescripcion.setVisible(true);
                            }
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {

                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {

                        }

                        @Override
                        public void mouseExited(MouseEvent e) {

                        }
                    });

                    vista.panelArticulosAux.add(botonOfertas);
                }
                vista.panelArticulosAux.setVisible(true);
                vista.panelArticulos.setVisible(false);
                //Boton actual para el Label Atras
                botonesPrincipales = 0;
                botonesBebidas = 0;
                botonesMenus = 0;
                botonesPasteleria = 0;
                botonesOfertas = 1;
                botonesPais = "";
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e
    ) {

    }

    @Override
    public void mousePressed(MouseEvent e
    ) {
    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {
    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {
    }

    @Override
    public void mouseExited(MouseEvent e
    ) {
    }

    //ESTE MÉTODO SERVIRÁ PARA LIMITAR LA ESCRITURA DE CIFRAS EN UN JTEXTFIELD
    public static void SCifras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    e.consume();
                }
            }
        });
    }

    //ESTE MÉTODO SERVIRÁ PARA LIMITAR LA ESCRITURA DE LETRAS EN UN JTEXTFIELD
    public static void SLetras(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

    }

    //DEFINIMOS EL PRIMER HILO PARA LA MODIFICACIÓN DE LA IMAGEN DE LA PANTALLA DE CARGA
    public class Uni1 extends Thread {

        @Override
        public void run() {
            //CONTROLAMOS EL CONTADOR 1
            while (contadorCarga1 < 10) {
                vista.textoCarga.setText("Cargando");

                //MODIFICAMOS LA IMAGEN DE LA PANTALLA DE CARGA
                int uni2W = vista.uni.getWidth();
                int uni2H = vista.uni.getHeight();
                ImageIcon uni2 = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Uni1.png"));

                Image uni2Img = uni2.getImage();
                Image uni2NewImg = uni2Img.getScaledInstance(uni2W, uni2H, java.awt.Image.SCALE_SMOOTH);
                uni2 = new ImageIcon(uni2NewImg);
                vista.uni.setIcon(uni2);

                try {
                    //PONEMOS EL HILO A DORMIR DURANTE 0'2 SEGUNDOS
                    Thread.sleep(200);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
                //AUMENTAMOS EL CONTADOR 1
                contadorCarga1++;
            }
            //CONTROLAMOS SI EL CONTADOR 1 HA SUPERADO EL MÁXIMO DEFINIDO
            if (contadorCarga1 >= 10) {
                vista.cargando.setVisible(false);
            }
            //REINICIAMOS EL CONTADOR 1
            contadorCarga1 = 0;
        }
    }

    //DEFINIMOS EL SEGUNDO HILO PARA LA MODIFICACIÓN DE LA IMAGEN DE LA PANTALLA DE CARGA
    public class Uni2 extends Thread {

        @Override
        public void run() {
            //CONTROLAMOS EL CONTADOR 2
            while (contadorCarga2 < 10) {
                try {
                    //EN ESTE CASO DIVIDIMOS EL TIEMPO EN DOS DÉCIMAS DE SEGUNDO DIFERENTES
                    Thread.sleep(100);
                    vista.textoCarga.setText("Cargando...");

                    //MODIFICAMOS LA IMAGEN DE LA PANTALLA DE CARGA
                    int uni2W = vista.uni.getWidth();
                    int uni2H = vista.uni.getHeight();
                    ImageIcon uni2 = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Uni2.png"));

                    Image uni2Img = uni2.getImage();
                    Image uni2NewImg = uni2Img.getScaledInstance(uni2W, uni2H, java.awt.Image.SCALE_SMOOTH);
                    uni2 = new ImageIcon(uni2NewImg);
                    vista.uni.setIcon(uni2);

                    //AHORA LA SEGUNDA DÉCIMA DE SEGUNDO
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
                //AUMENTAMOS EL CONTADOR 2
                contadorCarga2++;
            }
            //CONTROLAMOS SI EL CONTADOR 2 HA AUMENTADO EL MÁXIMO DEFINIDO
            if (contadorCarga2 >= 10) {
                //EN CASO DE QUE OCURRA, FINALIZAMOS LA PANTALLA DE CARGA, INCIAMOS SESIÓN Y ABRIMOS EL PANEL PRINCIPAL
                vista.cargando.setVisible(false);
                String u = vista.txtUsuario.getText();
                char[] pc = vista.txtPass.getPassword();
                int pi = pc.length;
                String p = "";
                //REESCRIBE LA CONTRASEÑA CHAR A CHAR EN UN STRING
                for (int i = 0; i < pi; i++) {
                    p = p + pc[i];
                }
                p = encriptaEnMD5(p);
                //COMPROBAMOS QUE HA SIDO ESCRITO TANTO EL USUARIO COMO LA CONTRASEÑA
                if (!vista.txtUsuario.getText().equals("") && !p.equals("")) {
                    //CONTROLAMOS EL INICIO DE SESIÓN
                    if (modelo.iniciarSesion(u, p) == true) {
                        //SI EL USUARIO CONECTADO ES UN TRABAJADOR, CONECTAMOS COMO TRABAJADOR NORMAL
                        if (modelo.esAdmin(u) == false) {
                            JOptionPane.showMessageDialog(null, "Ha conectado como " + modelo.getNombreTrabajadorPorUsuario(u) + ".");
                            usuario = u;
                            vista.usuarioConectado.setText(u);
                            inicioDeSesionDeTrabajador();
                            //SI EL USUARIO CONECTADO ES UN ADMINISTRADOR, CONECTAMOS COMO ADMINISTRADOR
                        } else {
                            JOptionPane.showMessageDialog(null, "Ha conectado como " + modelo.getNombreTrabajadorPorUsuario(u) + " (Administrador).");
                            usuario = u;
                            vista.usuarioAdminConectado.setText(u);
                            inicioDeSesionDeAdministrador();
                        }
                        //EN CASO DE QUE FALLE EL INICIO DE SESIÓN
                    } else {
                        JOptionPane.showMessageDialog(null, "Credenciales inválidas.");
                        vista.setVisible(true);
                        vista.txtUsuario.setText("");
                        vista.txtPass.setText("");
                        vista.txtUsuario.requestFocus();
                    }
                    //EN CASO DE QUE UNO DE LOS CAMPOS ESTÉ VACÍO
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales inválidas. Campos vacíos.");
                    vista.setVisible(true);
                    vista.txtUsuario.setText("");
                    vista.txtPass.setText("");
                    vista.txtUsuario.requestFocus();
                }
            }
            //REINICIAMOS EL CONTADOR 2
            contadorCarga2 = 0;
        }
    }

    //DEFINIMOS EL HILO TEMPORIZADOR QUE INICIARÁ LOS DOS HILOS PARA LA ANIMACIÓN DE LA PANTALLA DE CARGA
    public class Temporizador extends Thread {

        public void run(Uni1 u1, Uni2 u2) {
            u1.start();
            u2.start();
        }
    }

    //DEFINIMOS LA CONFIGURACIÓN DEL PROGRAMA AL INICIAR SESIÓN COMO TRABAJADOR
    public void inicioDeSesionDeTrabajador() {
        vista.principal.pack();
        vista.principal.setLocationRelativeTo(null);
        vista.principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vista.principal.setVisible(true);
        cargarImagenesPrincipal();
        int tiempo = modelo.getTiempo(usuario);
        //RESUMIMOS EL HILO EN CASO DE HABER DESLOGEADO PARA QUE SIGA CONTANDO EL TIEMPO DE TRABAJO
        a.resumir();
        //EJECUTAMOS EL HILO PARA ACUMULAR EL TIEMPO DE TRABAJO DEL TRABAJADOR
        a.run(tiempo);
    }

    //DEFINIMOS LA CONFIGURACIÓN DEL PROGRAMA AL INCIAR SESIÓN COMO ADMINISTRADOR
    public void inicioDeSesionDeAdministrador() {
        vista.principalAdmin.pack();
        vista.principalAdmin.setLocationRelativeTo(null);
        vista.principalAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vista.principalAdmin.setVisible(true);
        cargarImagenesPrincipalAdmin();
        //SOLO EN CASO DE QUE EL USUARIO SEA UN ADMINISTRADOR, EJECUTAMOS EL HILO QUE COMPRUEBE LOS AVISOS
        c.resumir();
        c.run();
    }

    //CARGAMOS LAS IMÁGENES DEL PANEL PRINCIPAL AL INICIAR SESIÓN
    public void cargarImagenesPrincipal() {
        //CÓDIGO PARA REDIMENSIONAR UNA IMAGEN SEGÚN SU CONTENEDOR:
        /*int width = vista.btnVolver.getWidth();
         int height = vista.btnVolver.getHeight();
         ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image.png"));
         Image img = icon.getImage();
         Image newImg = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
         icon = new ImageIcon(newImg);
         vista.btn.setIcon(icon);
         */

        int salirW = vista.labelSalir.getWidth();
        int salirH = vista.labelSalir.getHeight();
        ImageIcon salirIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2.png"));
        Image salirImg = salirIcon.getImage();
        Image salirNewImg = salirImg.getScaledInstance(salirW, salirH, java.awt.Image.SCALE_SMOOTH);
        salirIcon = new ImageIcon(salirNewImg);
        vista.labelSalir.setIcon(salirIcon);

        int nuevoPedidoW = vista.labelNuevoPedido.getWidth();
        int nuevoPedidoH = vista.labelNuevoPedido.getHeight();
        ImageIcon nuevoPedidoIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevoPedido.png"));
        Image nuevoPedidoImg = nuevoPedidoIcon.getImage();
        Image nuevoPedidoNewImg = nuevoPedidoImg.getScaledInstance(nuevoPedidoW, nuevoPedidoH, java.awt.Image.SCALE_SMOOTH);
        nuevoPedidoIcon = new ImageIcon(nuevoPedidoNewImg);
        vista.labelNuevoPedido.setIcon(nuevoPedidoIcon);

        int pedidosW = vista.labelPedidos.getWidth();
        int pedidosH = vista.labelPedidos.getHeight();
        ImageIcon pedidosIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedidos.png"));
        Image pedidosImg = pedidosIcon.getImage();
        Image pedidosNewImg = pedidosImg.getScaledInstance(pedidosW, pedidosH, java.awt.Image.SCALE_SMOOTH);
        pedidosIcon = new ImageIcon(pedidosNewImg);
        vista.labelPedidos.setIcon(pedidosIcon);

        int avisarW = vista.labelAvisar.getWidth();
        int avisarH = vista.labelAvisar.getHeight();
        ImageIcon avisarIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/warning.png"));
        Image avisarImg = avisarIcon.getImage();
        Image avisarNewImg = avisarImg.getScaledInstance(avisarW, avisarH, java.awt.Image.SCALE_SMOOTH);
        avisarIcon = new ImageIcon(avisarNewImg);
        vista.labelAvisar.setIcon(avisarIcon);

        int perfilW = vista.labelPerfil.getWidth();
        int perfilH = vista.labelPerfil.getHeight();
        ImageIcon perfilIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil.png"));
        Image perfilImg = perfilIcon.getImage();
        Image perfilNewImg = perfilImg.getScaledInstance(perfilW, perfilH, java.awt.Image.SCALE_SMOOTH);
        perfilIcon = new ImageIcon(perfilNewImg);
        vista.labelPerfil.setIcon(perfilIcon);

        int volverW = vista.labelVolver.getWidth();
        int volverH = vista.labelVolver.getHeight();
        ImageIcon volverIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver2.png"));
        Image volverImg = volverIcon.getImage();
        Image volverNewImg = volverImg.getScaledInstance(volverW, volverH, java.awt.Image.SCALE_SMOOTH);
        volverIcon = new ImageIcon(volverNewImg);
        vista.labelVolver.setIcon(volverIcon);

    }

    //DEFINIMOS EL HILO COMPROBACIÓN PARA MANEJAR EL AVISO DE ASISTENCIA DE UN TRABAJADOR A UN ADMINISTRADOR
    public class Comprobacion extends Thread {

        boolean infinito = true;

        @Override
        public void run() {
            while (infinito == true) {
                if (modelo.esAdmin(usuario) == true) {
                    if (modelo.comprobarAviso() == true) {
                        modelo.quitarAviso();
                        JOptionPane.showMessageDialog(null, "AVISO: Un trabajador necesita asistencia.");
                    }
                }
            }
        }

        public void resumir() {
            infinito = true;
        }

        public void close() {
            infinito = false;
        }
    }

    //CARGAMOS LAS IMÁGENES DEL PANEL PRINCIPAL AL INICIAR SESIÓN COMO ADMINISTRADOR
    public void cargarImagenesPrincipalAdmin() {
        int adPW = vista.labelAdminProveedores.getWidth() - 100;
        int adPH = vista.labelAdminProveedores.getHeight() - 100;
        ImageIcon adPIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adminProveedores.png"));
        Image adPImg = adPIcon.getImage();
        Image adPNewImg = adPImg.getScaledInstance(adPW, adPH, java.awt.Image.SCALE_SMOOTH);
        adPIcon = new ImageIcon(adPNewImg);
        vista.labelAdminProveedores.setIcon(adPIcon);

        int adPeW = vista.labelAdminPedidos.getWidth() - 200;
        int adPeH = vista.labelAdminPedidos.getHeight() - 100;
        ImageIcon adPeIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adminPedidos.png"));
        Image adPeImg = adPeIcon.getImage();
        Image adPeNewImg = adPeImg.getScaledInstance(adPeW, adPeH, java.awt.Image.SCALE_SMOOTH);
        adPeIcon = new ImageIcon(adPeNewImg);
        vista.labelAdminPedidos.setIcon(adPeIcon);

        int adSW = vista.labelAdminStock.getWidth() - 200;
        int adSH = vista.labelAdminStock.getHeight() - 100;
        ImageIcon adSIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adminStock.png"));
        Image adSImg = adSIcon.getImage();
        Image adSNewImg = adSImg.getScaledInstance(adSW, adSH, java.awt.Image.SCALE_SMOOTH);
        adSIcon = new ImageIcon(adSNewImg);
        vista.labelAdminStock.setIcon(adSIcon);

        int adTW = vista.labelAdminTrabajadores.getWidth() - 200;
        int adTH = vista.labelAdminTrabajadores.getHeight() - 100;
        ImageIcon adTIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adminTrabajadores.png"));
        Image adTImg = adTIcon.getImage();
        Image adTNewImg = adTImg.getScaledInstance(adTW, adTH, java.awt.Image.SCALE_SMOOTH);
        adTIcon = new ImageIcon(adTNewImg);
        vista.labelAdminTrabajadores.setIcon(adTIcon);

        int adVW = vista.labelAdminVentas.getWidth() - 200;
        int adVH = vista.labelAdminVentas.getHeight() - 100;
        ImageIcon adVIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adminVentas.png"));
        Image adVImg = adVIcon.getImage();
        Image adVNewImg = adVImg.getScaledInstance(adVW, adVH, java.awt.Image.SCALE_SMOOTH);
        adVIcon = new ImageIcon(adVNewImg);
        vista.labelAdminVentas.setIcon(adVIcon);

        int adSalirW = vista.labelAdminSalir.getWidth() - 200;
        int adSalirH = vista.labelAdminSalir.getHeight() - 100;
        ImageIcon adSalirIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2.png"));
        Image adSalirImg = adSalirIcon.getImage();
        Image adSalirNewImg = adSalirImg.getScaledInstance(adSalirW, adSalirH, java.awt.Image.SCALE_SMOOTH);
        adSalirIcon = new ImageIcon(adSalirNewImg);
        vista.labelAdminSalir.setIcon(adSalirIcon);
    }

    //ESTE MÉTODO DEVOLVERÁ UNA CADENA MOSTRANDO LAS HORAS, MINUTOS Y SEGUNDOS DEL TIEMPO DE TRABAJO
    public String calculaTiempo(int t) {
        int h = 0;
        int m = 0;
        int s = 0;
        while (t > 60) {
            if (t >= 3600) {
                t = t - 3600;
                h++;
            } else {
                t = t - 60;
                m++;
            }
        }
        s = t;
        String tiempo = h + " horas, " + m + " minutos, " + s + " segundos";
        return tiempo;
    }

    //ESTE MÉTODO MODIFICARÁ LA IMAGEN DE LA VALORACIÓN DEL USUARIO SEGÚN LA CIFRA OBTENIDA DESDE LA BASE DE DATOS
    public void imagenValoracion(int v) {
        int vW = vista.valoracionPerfil.getWidth();
        int vH = vista.valoracionPerfil.getHeight();
        ImageIcon vIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + v + ".png"));
        Image vImg = vIcon.getImage();
        Image vNewImg = vImg.getScaledInstance(vW, vH, java.awt.Image.SCALE_SMOOTH);
        vIcon = new ImageIcon(vNewImg);
        vista.valoracionPerfil.setIcon(vIcon);

    }

    //DEFINIMOS EL HILO ACUMULADOR, EL CUAL AUMENTARÁ GRADUALMENTE EL TIEMPO DE TRABAJO DEL TRABAJADOR CONECTADO
    public class Acumulador extends Thread {

        boolean infinito = true;
        int t;

        //RECIBIRÁ COMO PARÁMETRO EL TIEMPO OBTENIDO PREVIAMENTE DE LA BASE DE DATOS
        public void run(int c) {
            t = c;
            while (infinito == true) {
                try {
                    //POR CADA SEGUNDO, AUMENTA EL TIEMPO Y REESCRIBE LA INFORMACIÓN EN EL PERFIL DEL TRABAJADOR
                    sleep(1000);
                    t++;
                    String s = calculaTiempo(t);
                    vista.tiempoTrabajadoPerfil.setText(s);
                    System.out.println(t);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        public void resumir() {
            infinito = true;
        }

        //EN CASO DE CORTAR EL HILO, ACTUALIZA EL TIEMPO EN LA BASE DE DATOS PARA QUE LA PRÓXIMA VEZ QUE EL
        //TRABAJADOR SE CONECTE, MANTENGA EL TIEMPO PRÁCTICAMENTE INTACTO
        public void close() {
            modelo.actualizarTiempo(usuario, t);
            infinito = false;
            System.out.println("Tiempo actualizado: " + t + " " + usuario);
        }
    }

    //INICIAMOS LOS MÉTODOS RELACIONADOS CON EL MODELO Y ESTE MÉTODO SERÁ UTILIZADO TRAS LA CONEXIÓN A LA BASE DE DATOS
    public void iniciarModelo() {
        //LE AJUSTAMOS A LA TABLA DE PEDIDOS EL RENDERIZADOR MENCIONADO ANTERIORMENTE
        //ESTO SERVIRÁ PARA DARLE UN ASPECTO LIGERAMENTE MODIFICADO A LA TABLA EN CUESTIÓN
        render = new TablaRenderizador();
        vista.tablaPedidos.setDefaultRenderer(String.class, render);
        vista.tablaPedidos.setModel(modelo.tablaProductosRegistroVentasVacia());
        vista.tablaPedidos.getTableHeader()
                .setReorderingAllowed(false);
        vista.tablaPedidos.getTableHeader()
                .setResizingAllowed(false);

        vista.tablaProductosProvee.setDefaultRenderer(String.class, render);
        vista.tablaProductosProvee.setModel(modelo.tablaProductosProveedoresVacia());
        vista.tablaProductosProvee.getTableHeader()
                .setReorderingAllowed(false);
        vista.tablaProductosProvee.getTableHeader()
                .setResizingAllowed(false);
        vista.tablaTrabajadores.getTableHeader()
                .setReorderingAllowed(false);
        vista.tablaTrabajadores.getTableHeader()
                .setResizingAllowed(false);
    }

    //MÉTODO PARA ENCRIPTAR INFORMACIÓN CON MD5
    public static String encriptaEnMD5(String stringAEncriptar) {
        try {
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
            StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int bajo = (int) (bytes[i] & 0x0f);
                int alto = (int) ((bytes[i] & 0xf0) >> 4);
                strbCadenaMD5.append(CONSTS_HEX[alto]);
                strbCadenaMD5.append(CONSTS_HEX[bajo]);
            }
            return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    //MÉTODO QUE DARÁ COMIENZO AL PROGRAMA UNA VEZ CONECTADA LA BASE DE DATOS
    public void abrirPrograma() {
        String bd = vista.txtNombreBD.getText();
        String usu = vista.txtUsuBD.getText();
        String pass = vista.txtPassBD.getText();
        String ip = vista.txtIPBD.getText();
        String port = vista.txtPortBD.getText();

        vista.configuracionDB.setVisible(false);
        vista.cargando.pack();
        vista.cargando.setLocationRelativeTo(null);
        vista.cargando.setVisible(true);

        modelo = new Modelo(bd, usu, pass, ip, port);
        iniciarModelo();

        Uni1 uni1 = new Uni1();
        Uni2 uni2 = new Uni2();
        Temporizador t = new Temporizador();
        t.run(uni1, uni2);
        t.start();
        vista.setVisible(false);
    }
}
