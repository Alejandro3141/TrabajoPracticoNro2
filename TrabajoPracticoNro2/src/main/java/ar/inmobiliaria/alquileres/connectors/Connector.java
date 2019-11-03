package ar.inmobiliaria.alquileres.connectors;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    //private static String driver="com.mysql.jdbc.Driver";  // driver mysql 5
    private static String driver="com.mysql.cj.jdbc.Driver"; // driver mysql 6 o sup
    
    //Localhost
    //private static String url="jdbc:mysql://localhost:3306/inmobiliaria";
    //private static String user="root";
    //private static String pass="root";
    
    //remotemysql.com --> de CLASE
    //private static String url="jdbc:mysql://remotemysql.com:3306/HbFUMDnNdV";
    //private static String user="HbFUMDnNdV";
    //private static String pass="H0CKZqyPBR";
    
    //remotemysql.com  --> PERSONAL
    private static String url="jdbc:mysql://remotemysql.com:3306/eIrkPXYK8o";
    private static String user="eIrkPXYK8o";
    private static String pass="uHVfWq12jA";
    private static Connection conn=null;
    
    private Connector(){}
    public synchronized static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url,user,pass);
            } catch (Exception e) { e.printStackTrace(); }
        }
        return conn;
    }    
}