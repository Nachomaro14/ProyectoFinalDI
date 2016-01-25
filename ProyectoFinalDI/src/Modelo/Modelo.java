package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modelo extends Database{
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
    
    public String[] getNIFProveedores(){
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
    
    public String[] getInfoProveedor(String nif){
        String[] info = new String[6];
        try {
            String q = "SELECT NIF, Nombre, Direccion, Pais, Telefono, Correo FROM Proveedor WHERE NIF = '"+nif+"'";
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
    
    public String[] getCodigoProductos(){
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
    
    public Object[] getInfoProductoPorCodigo(String codigo){
        Object[] info = new Object[7];
        try {
            String q = "SELECT Codigo, Proveedor, Nombre, Pais, Precio, Tipo, Descripcion FROM Producto WHERE Codigo = "+codigo;
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
    
    public Object[] getInfoProductoPorCodigoYProveedor(int codigo, String proveedor){
        Object[] info = new Object[7];
        try {
            String q = "SELECT Codigo, Proveedor, Nombre, Pais, Precio, Tipo, Descripcion FROM Producto WHERE Codigo = "+codigo+" AND Proveedor = '"+proveedor+"'";
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
    
    public String[] getNIFProveedoresDeStockActual(){
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
    
    public String[] getDNITrabajadores(){
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
    
    public Object[] getInfoTrabajador(String dni){
        Object[] info = new Object[11];
        try {
            String q = "SELECT Usuario, Pass, DNI, Nombre, Apellidos, Telefono, Correo, Direccion, Tiempo, Recaudacion, Valoracion FROM Trabajador WHERE DNI = '"+dni+"'";
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
}