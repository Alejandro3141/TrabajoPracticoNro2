package ar.inmobiliaria.alquileres.tests;
import ar.inmobiliaria.alquileres.connectors.Connector;
import java.sql.Connection;
import java.sql.Statement;

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn=Connector.getConnection()){
           Statement st=conn.createStatement();
           String query="insert into propiedades (codigoPropiedad,ubicacion,tipoInmueble,precioAlquiler,descripcion) values ("
                   + "'Hab-01','Los Angeles','Habitación',4200,'4x4 m2 con baño y balcón')";
           st.execute(query);
           
           
           conn.createStatement().execute(
                   "insert into propiedades (codigoPropiedad,ubicacion,tipoInmueble,precioAlquiler,descripcion) values ("
                           + "'Ca-01', 'Santa Clara', 'Casa', 15000, '120 m2 piso cerámica, 2 baños, cocina, comedor, living, lavandería y 2 dormitorios')"
           );
            
        } catch (Exception e) { e.printStackTrace(); }
    }   
}