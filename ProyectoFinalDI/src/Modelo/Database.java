package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private  String db = "dam26_proyectoFinalDI";
    private String user = "dam26";
    private String password = "Mazuecos14";
    private String url = "jdbc:mysql://88.26.202.99:3306"+db;
    private Connection conn = null;


    public Database(){
        this.url = "jdbc:mysql://88.26.202.99:3306/"+this.db;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection( this.url, this.user , this.password );    
            System.out.println("Conexion MySQL realizada con exito.");
        }catch(SQLException e){
            System.out.println("Conexion NO realizada con exito por error de SQL.");
            System.err.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Conexion NO realizada con exito por error de Class.");
            System.err.println(e.getMessage());
        } 
    }

    public Connection getConexion(){
        return this.conn;
    }
}