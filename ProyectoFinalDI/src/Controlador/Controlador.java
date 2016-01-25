package Controlador;

import Modelo.Modelo;
import UpperEssential.UpperEssentialLookAndFeel;
import Vista.Interfaz;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Controlador implements ActionListener, MouseListener{
    
    Interfaz vista;
    Modelo modelo = new Modelo();
    int contadorCarga1 = 0;
    int contadorCarga2 = 0;
    String usuario = "";

    public Controlador(Interfaz i) {
        vista = i;
    }

    public enum AccionMVC {
        btnIniciarSesion,
        btnVolver
    }
    
    public void iniciar() {

        try {
            UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("ColoresPastel.theme"));
            SwingUtilities.updateComponentTreeUI(vista);
            SwingUtilities.updateComponentTreeUI(vista.principal);
            
            Toolkit t = Toolkit.getDefaultToolkit();
            vista.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));
            vista.principal.setIconImage(t.getImage(getClass().getResource("/Imagenes/logo.png")));

            vista.pack();
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
            vista.setTitle("International Cafe Dessernational");
            vista.cargando.setTitle("Bienvenido a Dessernational");
            
            
            // Controladores de tamaño para las imágenes
            
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
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el método iniciar()");
            ex.printStackTrace();
        }
        
        this.vista.btnIniciarSesion.setActionCommand("btnIniciarSesion");
        this.vista.btnIniciarSesion.addActionListener(this);
        
        this.vista.btnVolver.setActionCommand("btnVolver");
        this.vista.btnVolver.addActionListener(this);
    }
    
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
            case btnVolver:
                vista.usuarioConectado.setText("");
                usuario = "";
                vista.principal.setVisible(false);
                vista.txtUsuario.setText("");
                vista.txtPass.setText("");
                vista.setVisible(true);
                break;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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
    
    public class Uni1 extends Thread{

        public void run(){
            while(contadorCarga1 < 5){
                vista.textoCarga.setText("Cargando");
                
                int uni2W = vista.uni.getWidth();
                int uni2H = vista.uni.getHeight();
                ImageIcon uni2 = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Uni1.png"));

                Image uni2Img = uni2.getImage();
                Image uni2NewImg = uni2Img.getScaledInstance(uni2W, uni2H, java.awt.Image.SCALE_SMOOTH);
                uni2 = new ImageIcon(uni2NewImg);
                vista.uni.setIcon(uni2);
                
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){
                    System.out.println(ie.getMessage());
                }
                contadorCarga1++;
            }
            if(contadorCarga1 >= 5){
                vista.cargando.setVisible(false);
            }
            contadorCarga1 = 0;
        }
    }
    
    public class Uni2 extends Thread{

        public void run(){
            while(contadorCarga2 < 5){
                try{
                    Thread.sleep(500);
                    vista.textoCarga.setText("Cargando...");
                    
                    int uni2W = vista.uni.getWidth();
                    int uni2H = vista.uni.getHeight();
                    ImageIcon uni2 = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Uni2.png"));

                    Image uni2Img = uni2.getImage();
                    Image uni2NewImg = uni2Img.getScaledInstance(uni2W, uni2H, java.awt.Image.SCALE_SMOOTH);
                    uni2 = new ImageIcon(uni2NewImg);
                    vista.uni.setIcon(uni2);
                    
                    Thread.sleep(500);
                }catch(InterruptedException ie){
                    System.out.println(ie.getMessage());
                }
                contadorCarga2++;
            }
            if(contadorCarga2 >= 5){
                vista.cargando.setVisible(false);
                String u = vista.txtUsuario.getText();
                char[] pc = vista.txtPass.getPassword();
                int pi = pc.length;
                String p = "";
                for(int i = 0; i < pi; i++){
                    p = p + pc[i];
                }
                if(modelo.iniciarSesion(u, p) == true){
                    if(modelo.esAdmin(u) == false){
                        JOptionPane.showMessageDialog(null, "Ha conectado como "+modelo.getNombreTrabajadorPorUsuario(u));
                        usuario = u;
                        vista.usuarioConectado.setText(u);
                        inicioDeSesionDeTrabajador();
                    }else{
                        JOptionPane.showMessageDialog(null, "Ha conectado como "+modelo.getNombreTrabajadorPorUsuario(u) + " (Administrador)");
                        usuario = u;
                        vista.usuarioConectado.setText(u);
                        inicioDeSesionDeAdministrador();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Credenciales inválidas");
                    vista.setVisible(true);
                    vista.txtUsuario.setText("");
                    vista.txtPass.setText("");
                }
            }
            contadorCarga2 = 0;
        }
    }
    
    public class Temporizador extends Thread{

        public void run(Uni1 u1, Uni2 u2){
            u1.start();
            u2.start();
        }
    }
    
    public void inicioDeSesionDeTrabajador(){
        vista.principal.pack();
        vista.principal.setLocationRelativeTo(null);
        vista.principal.setVisible(true);
        cargarImagenesPrincipal();
    }
    
    public void inicioDeSesionDeAdministrador(){
        vista.principal.pack();
        vista.principal.setLocationRelativeTo(null);
        vista.principal.setVisible(true);
        cargarImagenesPrincipal();
    }
    
    public void cargarImagenesPrincipal(){
        int volverW = vista.btnVolver.getWidth();
        int volverH = vista.btnVolver.getHeight();
        ImageIcon volverIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"));

        Image volverImg = volverIcon.getImage();
        Image volverNewImg = volverImg.getScaledInstance(volverW, volverH, java.awt.Image.SCALE_SMOOTH);
        volverIcon = new ImageIcon(volverNewImg);
        vista.btnVolver.setIcon(volverIcon);
    }
}