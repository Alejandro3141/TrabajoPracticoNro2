package ar.inmobiliaria.alquileres.tests;
import ar.inmobiliaria.alquileres.connectors.Connector;
import java.sql.Connection;
import java.sql.Statement;

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn=Connector.getConnection()){
           Statement st=conn.createStatement();
           String query="insert into propiedades (codigoPropiedad,ubicacion,tipoInmueble,precioAlquiler,descripcion) values ("
                   + "'Hab-99','Los_Angeles','Habitación',4200,'4x4 m2 con baño y balcón')";
           st.execute(query);
           
           
           conn.createStatement().execute(
                   "insert into propiedades (codigoPropiedad,ubicacion,tipoInmueble,precioAlquiler,descripcion) values ("
                           + "'Ca-99', 'Santa_Clara', 'Casa', 15000, '120 m2 piso cerámica, 2 baños, cocina, comedor, living, lavandería y 2 dormitorios')"
           );
           
           conn.createStatement().execute(
           "insert into clientes (codigoPropiedad,nombre,apellido,tipoDocumento,numeroDocumento,cuit_cuil,telefono,email,garantia,observacion) values("
                   + "'Ca-99', 'Francisco', 'Acuña', 'DNI', '34848165', '53-34848165-9', '45015687', 'franSoloChinos@gmail.com',null,'Juega solo con Chinos')"
           );
           
        } catch (Exception e) { e.printStackTrace(); }
    }   
}