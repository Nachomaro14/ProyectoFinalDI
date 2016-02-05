package Controlador;

import Modelo.Modelo;
import UpperEssential.UpperEssentialLookAndFeel;
import Vista.Interfaz;
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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Controlador implements ActionListener, MouseListener{
    
    //INICIALIZAMOS UNA SERIE DE VARIABLES PARA CONTROLAR ALGUNAS OPERACIONES INTERNAS DE LA APLICACIÓN
    Interfaz vista; //PARA PODER ACCEDER A LA INTERFAZ DE LA APLICACIÓN
    Modelo modelo = new Modelo(); //PARA PODER ACCEDER AL MODELO Y A LOS DATOS DE LA BD
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

    public Controlador(Interfaz i) {
        vista = i;
    }

    public enum AccionMVC {
        btnIniciarSesion,
        btnVolver
    }
    
    public void iniciar() {

        try {
            //MODIFICAMOS EL LOOKANDFEEL DE LAS VENTANAS DE LA APLICACIÓN
            UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("ColoresPastel.theme"));
            SwingUtilities.updateComponentTreeUI(vista);
            SwingUtilities.updateComponentTreeUI(vista.principal);
            SwingUtilities.updateComponentTreeUI(vista.cargando);         
            
            //MODIFICAMOS LAS OPCIONES DEL PANEL PRINCIPAL
            vista.principal.setResizable(false);
            vista.principal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            
            //MODIFICAMOS EL LOGO DE LAS VENTANAS DE LA APLICACIÓN
            Toolkit t = Toolkit.getDefaultToolkit();
            vista.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.principal.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));

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
            vista.labelNuevoPedido.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    vista.panelCentral.setVisible(true);
                    botonesPrincipales = 1;
                    botonesBebidas = 0;
                    botonesMenus = 0;
                    botonesPasteleria = 0;
                    botonesOfertas = 0;
                    botonesPais = "";
                }
                public void mousePressed(MouseEvent e){
                    vista.labelNuevoPedido.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                public void mouseReleased(MouseEvent e){
                    vista.labelNuevoPedido.setBorder(null);
                }
            });
            vista.labelSalir.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    vista.usuarioConectado.setText("");
                    usuario = "";
                    vista.principal.setVisible(false);
                    vista.txtUsuario.setText("");
                    vista.txtPass.setText("");
                    vista.setVisible(true);
                    c.close();
                    
                    botonesPrincipales = 0;
                    botonesBebidas = 0;
                    botonesMenus = 0;
                    botonesPasteleria = 0;
                    botonesOfertas = 0;
                    botonesPais = "";
                }
                public void mousePressed(MouseEvent e){
                    vista.labelSalir.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                public void mouseReleased(MouseEvent e){
                    vista.labelSalir.setBorder(null);
                }
            });
            vista.labelAvisar.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    if(modelo.esAdmin(usuario) == true){
                        JOptionPane.showMessageDialog(null, "No disponible.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Administrador avisado.");
                        modelo.avisar();
                    }
                }
                public void mousePressed(MouseEvent e){
                    vista.labelAvisar.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                public void mouseReleased(MouseEvent e){
                    vista.labelAvisar.setBorder(null);
                }
            });
            
            vista.labelVolver.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    
                }
                public void mousePressed(MouseEvent e){
                    vista.labelVolver.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                public void mouseReleased(MouseEvent e){
                    vista.labelVolver.setBorder(null);
                }
            });
            vista.txtUsuario.addKeyListener(new KeyAdapter(){
                public void keyPressed(KeyEvent evt){
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        vista.txtPass.requestFocus();
                    }
                }
            });
            vista.txtPass.addKeyListener(new KeyAdapter(){
                public void keyPressed(KeyEvent evt){
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    vista.setVisible(false);
                    vista.cargando.pack();
                    vista.cargando.setLocationRelativeTo(null);
                    vista.cargando.setVisible(true);

                    Uni1 uni1 = new Uni1();
                    Uni2 uni2 = new Uni2();
                    Temporizador t = new Temporizador();
                    t.run(uni1, uni2);
                    t.start();
                    }
                }
            });
            
            vista.labelPedidos.addMouseListener(this);
            vista.panelCentral.setVisible(false);
            vista.PanelDescripcion.setVisible(false);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el método iniciar()");
            ex.printStackTrace();
        }
        
        //ASIGNAMOS LAS ACCIONES A LOS BOTONES DE LA APLICACIÓN
        this.vista.btnIniciarSesion.setActionCommand("btnIniciarSesion");
        this.vista.btnIniciarSesion.addActionListener(this);
        
//        this.vista.btnVolver.setActionCommand("btnVolver");
//        this.vista.btnVolver.addActionListener(this);
    }
    
    //DEFINIMOS LAS ACCIONES DE CADA BOTÓN DE LA APLICACIÓN
    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
            case btnIniciarSesion:
                vista.setVisible(false);
                vista.cargando.pack();
                vista.cargando.setLocationRelativeTo(null);
                vista.cargando.setVisible(true);
                
                Uni1 uni1 = new Uni1();
                Uni2 uni2 = new Uni2();
                Temporizador t = new Temporizador();
                t.run(uni1, uni2);
                t.start();
                break;
        }
    }
    
    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
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
    public class Uni1 extends Thread{

        public void run(){
            //CONTROLAMOS EL CONTADOR 1
            while(contadorCarga1 < 10){
                vista.textoCarga.setText("Cargando");
                
                //MODIFICAMOS LA IMAGEN DE LA PANTALLA DE CARGA
                int uni2W = vista.uni.getWidth();
                int uni2H = vista.uni.getHeight();
                ImageIcon uni2 = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Uni1.png"));

                Image uni2Img = uni2.getImage();
                Image uni2NewImg = uni2Img.getScaledInstance(uni2W, uni2H, java.awt.Image.SCALE_SMOOTH);
                uni2 = new ImageIcon(uni2NewImg);
                vista.uni.setIcon(uni2);
                
                try{
                    //PONEMOS EL HILO A DORMIR DURANTE 1 SEGUNDO
                    Thread.sleep(200);
                }catch(InterruptedException ie){
                    System.out.println(ie.getMessage());
                }
                //AUMENTAMOS EL CONTADOR 1
                contadorCarga1++;
            }
            //CONTROLAMOS SI EL CONTADOR 1 HA SUPERADO EL MÁXIMO DEFINIDO
            if(contadorCarga1 >= 10){
                vista.cargando.setVisible(false);
            }
            //REINICIAMOS EL CONTADOR 1
            contadorCarga1 = 0;
        }
    }
    
    //DEFINIMOS EL SEGUNDO HILO PARA LA MODIFICACIÓN DE LA IMAGEN DE LA PANTALLA DE CARGA
    public class Uni2 extends Thread{

        public void run(){
            //CONTROLAMOS EL CONTADOR 2
            while(contadorCarga2 < 10){
                try{
                    //EN ESTE CASO DIVIDIMOS EL TIEMPO EN DOS MEDIOS SEGUNDOS
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
                    
                    //EN ESTE CASO DIVIDIMOS EL TIEMPO EN DOS MEDIOS SEGUNDOS
                    Thread.sleep(100);
                }catch(InterruptedException ie){
                    System.out.println(ie.getMessage());
                }
                //AUMENTAMOS EL CONTADOR 2
                contadorCarga2++;
            }
            //CONTROLAMOS SI EL CONTADOR 2 HA AUMENTADO EL MÁXIMO DEFINIDO
            if(contadorCarga2 >= 10){
                //EN CASO DE QUE OCURRA, FINALIZAMOS LA PANTALLA DE CARGA, INCIAMOS SESIÓN Y ABRIMOS EL PANEL PRINCIPAL
                vista.cargando.setVisible(false);
                String u = vista.txtUsuario.getText();
                char[] pc = vista.txtPass.getPassword();
                int pi = pc.length;
                String p = "";
                for(int i = 0; i < pi; i++){
                    p = p + pc[i];
                }
                if(!vista.txtUsuario.getText().equals("") && !p.equals("")){
                    //CONTROLAMOS EL INICIO DE SESIÓN
                    if(modelo.iniciarSesion(u, p) == true){
                        if(modelo.esAdmin(u) == false){
                            JOptionPane.showMessageDialog(null, "Ha conectado como " + modelo.getNombreTrabajadorPorUsuario(u) + ".");
                            usuario = u;
                            vista.usuarioConectado.setText(u);
                            inicioDeSesionDeTrabajador();
                        }else{
                            JOptionPane.showMessageDialog(null, "Ha conectado como " + modelo.getNombreTrabajadorPorUsuario(u) + " (Administrador).");
                            usuario = u;
                            vista.usuarioConectado.setText(u);
                            inicioDeSesionDeAdministrador();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Credenciales inválidas.");
                        vista.setVisible(true);
                        vista.txtUsuario.setText("");
                        vista.txtPass.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Credenciales inválidas. Campos vacíos.");
                    vista.setVisible(true);
                    vista.txtUsuario.setText("");
                    vista.txtPass.setText("");
                }
            }
            //REINICIAMOS EL CONTADOR 2
            contadorCarga2 = 0;
        }
    }
    
    //DEFINIMOS EL HILO TEMPORIZADOR QUE INICIARÁ LOS DOS HILOS PARA LA ANIMACIÓN DE LA PANTALLA DE CARGA
    public class Temporizador extends Thread{
        public void run(Uni1 u1, Uni2 u2){
            u1.start();
            u2.start();
        }
    }
    
    //DEFINIMOS LA CONFIGURACIÓN DEL PROGRAMA AL INICIAR SESIÓN COMO TRABAJADOR
    public void inicioDeSesionDeTrabajador(){
        vista.principal.pack();
        vista.principal.setLocationRelativeTo(null);
        vista.principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vista.principal.setVisible(true);
        cargarImagenesPrincipal();
    }
    
    //DEFINIMOS LA CONFIGURACIÓN DEL PROGRAMA AL INCIAR SESIÓN COMO ADMINISTRADOR
    public void inicioDeSesionDeAdministrador(){
        vista.principal.pack();
        vista.principal.setLocationRelativeTo(null);
        vista.principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vista.principal.setVisible(true);
        cargarImagenesPrincipal();
        c.run();
        c.start();
    }
    
    //CARGAMOS LAS IMÁGENES DEL PANEL PRINCIPAL AL INICIAR SESIÓN
    public void cargarImagenesPrincipal(){
        //CÓDIGO PARA REDIMENSIONAR UNA IMAGEN SEGÚN SU CONTENEDOR
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
        ImageIcon perfilIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil2.png"));
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
    public class Comprobacion extends Thread{
        boolean infinito = true;
        public void run(){
            while(infinito == true){
                if(modelo.esAdmin(usuario) == true){
                    if(modelo.comprobarAviso() == true){
                        modelo.quitarAviso();
                        JOptionPane.showMessageDialog(null, "AVISO: Un trabajador necesita asistencia.");
                    }
                }
            }
        }
        
        public void close(){
            infinito = false;
        }
    }
}
