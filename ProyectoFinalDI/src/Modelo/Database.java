package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private  String db = "";
    private String user = "";
    private String password = "";
    private String url = ""+db;
    private Connection conn = null;


    public Database(){
        this.url = url + "/" + this.db;
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
    
    public void setDatabase(String db){
        this.db = db;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setURL(String ip, String puerto){
        this.url = "jdbc:mysql://" + url + ":" + puerto + db;
    }
}