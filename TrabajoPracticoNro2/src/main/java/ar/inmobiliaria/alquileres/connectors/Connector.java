package ar.inmobiliaria.alquileres.connectors;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    //private static String driver="com.mysql.jdbc.Driver";  // driver mysql 5
    private static String driver="com.mysql.cj.jdbc.Driver"; // driver mysql 6 o sup
    
    //Host: localhost
    private static String url="jdbc:mysql://localhost:3306/inmobiliaria?serverTimezone=UTC";
    private static String user="root";
    private static String pass="root";
    
    // Host: remotemysql.com  --> PERSONAL
//    private static String url="jdbc:mysql://remotemysql.com:3306/eIrkPXYK8o";
//    private static String user="eIrkPXYK8o";
//    private static String pass="uHVfWq12jA";
    
    
    private static Connection conn=null;
    
    private Connector(){}
    public synchronized static Connection getConnection(){
    // Volver a abrir la conexión por las dudas si esta closeado, así puedo ejecutar el TestGeneral
    // Ya que try with resources cierra la conexión con los tests
    // Al usar el método isClosed() puede lanzar una Exception
        try {
            if(conn==null || conn.isClosed()){
                try {
                    Class.forName(driver);
                    conn=DriverManager.getConnection(url,user,pass);
                } catch (Exception e) { e.printStackTrace(); }
            }
        } catch (Exception e) {e.printStackTrace();}
        return conn;
    }    
}