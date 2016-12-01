package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Abisael
 */
public class Conexion {
    private String user="root";
    private String pass="";
    private String host="localhost";
    private String port="3307";
    private String Database="SEGURIDAD";
    private String classname="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://"+host+":"+port+"/"+Database;
    private Connection con;
    
    public Conexion (){
    try{
    Class.forName(classname);
    System.out.println(url);
     con = (Connection) DriverManager.getConnection(url,user,pass);
     
    
    }catch(ClassNotFoundException e){
        System.err.println("error"+e);
    
    }catch(SQLException e){
     System.out.println("SQL Exception : "+ e.getMessage());

            System.out.println("Vendor Error : "+ e.getErrorCode());
    }
    }
    
  public Connection getConexion(){
        
      return con;
  }  
 
}

