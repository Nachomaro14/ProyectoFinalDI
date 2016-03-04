package Modelo;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Modelo extends Database {

    public Modelo(String db, String user, String pass, String ip, String port) {
        super.setDatabase(db);
        super.setUser(user);
        super.setPassword(pass);
        super.setURL(ip, port);
        super.conectar();
    }

    //MÉTODO PARA HACER QUE LAS CELDAS DE LAS TABLAS NO SEAN EDITABLES
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }

    //MÉTODO INCIO DE SESIÓN
    public boolean iniciarSesion(String usuario, String pass) {
        String contraseña = "";
        try {
            String q = "SELECT Pass FROM Trabajador WHERE Usuario = '" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                contraseña = res.getString("Pass");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión\n\n" + e.getMessage());
            e.printStackTrace();
        }
        if (pass.equals(contraseña)) {
            return true;
        } else {
            return false;
        }
    }

    //MÉTODO PARA COMPROBAR SI EL USUARIO INICIADO ES ADMINISTRADOR
    public boolean esAdmin(String usuario) {
        int ad = 0;
        try {
            String q = "SELECT Administrador FROM Trabajador WHERE Usuario = '" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                ad = res.getInt("Administrador");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión\n\n" + e.getMessage());
            e.printStackTrace();
        }
        if (ad == 1) {
            return true;
        } else {
            return false;
        }
    }

    public String getNombreTrabajadorPorUsuario(String usuario) {
        String nombre = "";
        try {
            String q = "SELECT Nombre, Apellidos FROM Trabajador WHERE Usuario = '" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                nombre = nombre + res.getString("Nombre") + " " + res.getString("Apellidos");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener nombre de trabajador\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return nombre;
    }

    public String[] getNIFProveedores() {
        int registros = 0;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(NIF) as total FROM Proveedor");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] proveedores = new String[registros];
        try {
            String q = "SELECT NIF FROM Proveedor";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                proveedores[i] = res.getString("NIF");
                i++;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener NIFs de proveedor\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return proveedores;
    }

    //MÉTODO PARA OBTENER LA INFORMACIÓN DE LOS PROVEEDORES DE LA BD
    public String[] getInfoProveedor(String nif) {
        String[] info = new String[6];
        try {
            String q = "SELECT NIF, Nombre, Direccion, Pais, Telefono, Correo FROM Proveedor WHERE NIF = '" + nif + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                info[0] = res.getString("NIF");
                info[1] = res.getString("Nombre");
                info[2] = res.getString("Direccion");
                info[3] = res.getString("Pais");
                info[4] = res.getString("Telefono");
                info[5] = res.getString("Correo");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de proveedor\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return info;
    }

    public String[] getCodigoProductos() {
        int registros = 0;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Producto");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] productos = new String[registros];
        try {
            String q = "SELECT Codigo FROM Producto";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                productos[i] = res.getString("Codigo");
                i++;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener códigos de producto\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return productos;
    }

    public Object[] getInfoProductoPorCodigo(String codigo) {
        Object[] info = new Object[7];
        try {
            String q = "SELECT Codigo, Proveedor, Nombre, Pais, Precio, Tipo, Descripcion FROM Producto WHERE Codigo = " + codigo;
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                info[0] = res.getInt("Codigo");
                info[1] = res.getString("Proveedor");
                info[2] = res.getString("Nombre");
                info[3] = res.getString("Pais");
                info[4] = res.getDouble("Precio");
                info[5] = res.getString("Tipo");
                info[6] = res.getString("Descripcion");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de producto\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return info;
    }

    public Object[] getInfoProductoPorCodigoYProveedor(int codigo, String proveedor) {
        Object[] info = new Object[7];
        try {
            String q = "SELECT Codigo, Proveedor, Nombre, Pais, Precio, Tipo, Descripcion FROM Producto WHERE Codigo = " + codigo + " AND Proveedor = '" + proveedor + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                info[0] = res.getInt("Codigo");
                info[1] = res.getString("Proveedor");
                info[2] = res.getString("Nombre");
                info[3] = res.getString("Pais");
                info[4] = res.getDouble("Precio");
                info[5] = res.getString("Tipo");
                info[6] = res.getString("Descripcion");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de producto\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return info;
    }

    public String[] getNIFProveedoresDeStockActual() {
        int registros = 0;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Proveedor) as total FROM Stock GROUP BY Proveedor");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] proveedores = new String[registros];
        try {
            String q = "SELECT Proveedor FROM Stock GROUP BY Proveedor";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                proveedores[i] = res.getString("Proveedor");
                i++;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener NIFs de proveedor\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return proveedores;
    }

    public String[] getDNITrabajadores() {
        int registros = 0;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(DNI) as total FROM Trabajador");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] trabajadores = new String[registros];
        try {
            String q = "SELECT DNI FROM Trabajador";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                trabajadores[i] = res.getString("DNI");
                i++;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener DNIs de trabajador\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return trabajadores;
    }

    public Object[] getInfoTrabajador(String dni) {
        Object[] info = new Object[11];
        try {
            String q = "SELECT Usuario, Pass, DNI, Nombre, Apellidos, Telefono, Correo, Direccion, Tiempo, Recaudacion, Valoracion FROM Trabajador WHERE DNI = '" + dni + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                info[0] = res.getString("Usuario");
                info[1] = res.getString("Pass");
                info[2] = res.getString("DNI");
                info[3] = res.getString("Nombre");
                info[4] = res.getString("Apellidos");
                info[5] = res.getString("Telefono");
                info[6] = res.getString("Correo");
                info[7] = res.getString("Direccion");
                info[8] = res.getInt("Tiempo");
                info[9] = res.getDouble("Recaudacion");
                info[10] = res.getDouble("Valoracion");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de trabajador\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return info;
    }

    //MÉTODO PARA AVISAR AL ADMINISTRADOR
    public void avisar() {
        try {
            String q = "UPDATE Aviso SET Aviso = 1";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar aviso\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    //MÉTODO PARA COMPROBAR EL AVISO DEL TRABAJADOR
    public boolean comprobarAviso() {
        int aviso = 0;
        boolean avisado = false;
        try {
            String q = "SELECT Aviso FROM Aviso";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            aviso = res.getInt("Aviso");
            if (aviso == 0) {
                avisado = false;
            } else {
                avisado = true;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al comprobar aviso\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return avisado;
    }

    //MÉTODO PARA QUITAR EL AVISO AL ADMINISTRADOR
    public void quitarAviso() {
        try {
            String q = "UPDATE Aviso SET Aviso = 0";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar aviso\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    public DefaultTableModel tablaProductosRegistroVentasVacia() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        try {
            tablemodel.addColumn("Producto");
            tablemodel.addColumn("Cantidad");
            tablemodel.addColumn("Precio/U");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tablemodel;
    }

    public String[] getFechas() {
        int registros = 1;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT COUNT(Fecha) as total FROM RegVentas GROUP BY Fecha");
            ResultSet res = pstm.executeQuery();
            if (res.next()) {
                res.next();
                if (res != null) {
                    registros = res.getInt("total");
                }
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] fechas = new String[registros];
        try {
            String q = "SELECT Fecha FROM RegVentas GROUP BY Fecha";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                fechas[i] = res.getString("Fecha");
                i++;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return fechas;
    }

    public DefaultListModel listaPedidos(String fecha) {
        DefaultListModel listmodel = new DefaultListModel();
        try {
            String q = "SELECT Codigo, Hora, Cliente FROM RegVentas WHERE Fecha = '" + fecha + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                String cod = String.valueOf(res.getInt("Codigo"));
                String h = res.getString("Hora");
                String c = res.getString("Cliente");
                String t = cod + "-" + h + "-" + c;
                listmodel.addElement(t);
                i++;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return listmodel;
    }

    public Object[] infoTrabajador(String usuario) {
        Object[] info = new Object[9];
        try {
            String q = "SELECT DNI, Nombre, Apellidos, Telefono, Correo, Direccion, Tiempo, Recaudacion, Valoracion FROM Trabajador WHERE Usuario = '" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                info[0] = res.getString("DNI");
                info[1] = res.getString("Nombre");
                info[2] = res.getString("Apellidos");
                info[3] = res.getString("Telefono");
                info[4] = res.getString("Correo");
                info[5] = res.getString("Direccion");
                info[6] = res.getInt("Tiempo");
                info[7] = res.getDouble("Recaudacion");
                info[8] = res.getInt("Valoracion");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return info;
    }

    public int getTiempo(String usuario) {
        int tiempo = 0;
        try {
            String q = "SELECT Tiempo FROM Trabajador WHERE Usuario = '" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                tiempo = res.getInt("Tiempo");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tiempo;
    }

    public void actualizarTiempo(String usuario, int tiempo) {
        try {
            String q = "UPDATE Trabajador SET Tiempo = " + tiempo + " WHERE Usuario = '" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    public DefaultListModel listaProveedores() {
        DefaultListModel listmodel = new DefaultListModel();
        try {
            String q = "SELECT Nombre FROM Proveedor";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                String p = res.getString("Nombre");
                listmodel.addElement(p);
                i++;
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return listmodel;
    }

    public String[] infoProveedor(String nombre) {
        String[] info = new String[6];
        try {
            String q = "SELECT NIF, Nombre, Direccion, Pais, Telefono, Correo FROM Proveedor WHERE Nombre = '" + nombre + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                info[0] = res.getString("NIF");
                info[1] = res.getString("Nombre");
                info[2] = res.getString("Direccion");
                info[3] = res.getString("Pais");
                info[4] = res.getString("Telefono");
                info[5] = res.getString("Correo");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return info;
    }

    public DefaultTableModel tablaProductosProveedores(String proveedor) {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        try {
            tablemodel.addColumn("Nombre");
            tablemodel.addColumn("País");
            tablemodel.addColumn("Tipo");

            String q = "SELECT Nombre, Pais, Tipo FROM Producto WHERE Proveedor = '" + proveedor + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();

            String[] data = new String[3];

            while (res.next()) {
                data[0] = res.getString("Nombre");
                data[1] = res.getString("Pais");
                data[2] = res.getString("Tipo");
                tablemodel.addRow(data);
            }

            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }

    public DefaultTableModel tablaProductosProveedoresVacia() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();

        tablemodel.addColumn("Nombre");
        tablemodel.addColumn("País");
        tablemodel.addColumn("Tipo");

        return tablemodel;
    }

    public DefaultTableModel tablaTrabajadores() {
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        try {
            tablemodel.addColumn("Usuario");
            tablemodel.addColumn("Pass");
            tablemodel.addColumn("DNI");
            tablemodel.addColumn("Nombre");
            tablemodel.addColumn("Apellidos");
            tablemodel.addColumn("Teléfono");
            tablemodel.addColumn("Correo");
            tablemodel.addColumn("Dirección");

            String q = "SELECT Usuario, Pass, DNI, Nombre, Apellidos, Telefono, Correo, Direccion FROM Trabajador";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();

            String[] data = new String[8];

            while (res.next()) {
                data[0] = res.getString("Usuario");
                data[1] = res.getString("Pass");
                data[2] = res.getString("DNI");
                data[3] = res.getString("Nombre");
                data[4] = res.getString("Apellidos");
                data[5] = res.getString("Telefono");
                data[6] = res.getString("Correo");
                data[7] = res.getString("Direccion");
                tablemodel.addRow(data);
            }

            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }

    public void insertAdmin(String usuario, String contrasenia, String dni, String nombre, String apellidos, String telefono, String numerodom, String calledom, String correo) {
        try {
            String sql = "INSERT INTO Trabajador (Usuario, Pass, DNI, Nombre, Apellidos, Telefono, Correo, Direccion, Administrador, Tiempo, Recaudacion, Valoracion) VALUES"
                    + " ('" + usuario + "','" + contrasenia + "','" + dni + "','" + nombre + "','" + apellidos + "','" + telefono + "','" + correo + "','" + numerodom + " " + calledom + "',1,0,0,0)";
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertTrabajador(String usuario, String contrasenia, String dni, String nombre, String apellidos, String telefono, String numerodom, String calledom, String correo) {
        try {
            String sql = "INSERT INTO Trabajador (Usuario, Pass, DNI, Nombre, Apellidos, Telefono, Correo, Direccion, Administrador, Tiempo, Recaudacion, Valoracion) VALUES"
                    + " ('" + usuario + "','" + contrasenia + "','" + dni + "','" + nombre + "','" + apellidos + "','" + telefono + "','" + correo + "','" + numerodom + " " + calledom + "',0,0,0,0)";
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateTrabajadorPassword(String usuario, String contrasenia, String dni, String nombre, String apellidos, String telefono, String numerodom, String calledom, String correo) {
        try {
            String q = "UPDATE Trabajador (Pass, DNI, Nombre, Apellidos, Telefono, Correo, Direccion)"
                    + "VALUES ('" + contrasenia + "','" + dni + "','" + nombre + "','" + apellidos + "','" + telefono + "','" + correo + "','" + numerodom + " " + calledom + "')"
                    + "WHERE Usuario='" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void updateTrabajadorNoPassword(String usuario, String dni, String nombre, String apellidos, String telefono, String numerodom, String calledom, String correo) {
        try {
            String q = "UPDATE Trabajador ( DNI, Nombre, Apellidos, Telefono, Correo, Direccion)"
                    + "VALUES ('" + dni + "','" + nombre + "','" + apellidos + "','" + telefono + "','" + correo + "','" + numerodom + " " + calledom + "')"
                    + "WHERE Usuario='" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void deleteTrabajador(String usuario) {
        try {
            String sql = "DELETE FROM Trabajador WHERE Usuario = '" + usuario + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //************REVISAR PORFAVOR***************
    public Object[] getPasteles() {
        Object[] pasteles = new Object[3];
        try {
            String q = "SELECT Codigo, Nombre, Precio FROM Producto WHERE Tipo = 'Pastelería'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                pasteles[0] = res.getInt("Codigo");
                pasteles[1] = res.getString("Nombre");
                pasteles[2] = res.getDouble("Precio");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de producto/pasteles\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return pasteles;
    }

    public Object[] getBebidas() {
        Object[] bebidas = new Object[3];
        try {
            String q = "SELECT Codigo, Nombre, Precio FROM Producto WHERE Tipo = 'Bebida'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                bebidas[0] = res.getInt("Codigo");
                bebidas[1] = res.getString("Nombre");
                bebidas[2] = res.getDouble("Precio");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de producto/bebidas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return bebidas;
    }

    public Object[] getMenus() {
        Object[] menus = new Object[3];
        try {
            String q = "SELECT Codigo, Nombre, Precio FROM Menus";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                menus[0] = res.getInt("Codigo");
                menus[1] = res.getString("Nombre");
                menus[2] = res.getDouble("Precio");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de menus\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return menus;
    }

    public Object[] getOfertas() {
        Object[] ofertas = new Object[3];
        try {
            String q = "SELECT Codigo, Nombre, Precio FROM Ofertas";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                ofertas[0] = res.getInt("Codigo");
                ofertas[1] = res.getString("Nombre");
                ofertas[2] = res.getDouble("Precio");
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de Ofertas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return ofertas;
    }
}
