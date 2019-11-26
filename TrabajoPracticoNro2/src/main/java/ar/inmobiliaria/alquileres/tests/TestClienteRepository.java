package ar.inmobiliaria.alquileres.tests;

import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.Cliente;
import ar.inmobiliaria.alquileres.entities.Propiedad;
import ar.inmobiliaria.alquileres.enums.TipoDocumento;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_PropiedadRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.PropiedadRepository;
import java.sql.Connection;

public class TestClienteRepository {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()){
            I_PropiedadRepository pr = new PropiedadRepository(conn);
            I_ClienteRepository cr = new ClienteRepository(conn);
            Cliente cliente = new Cliente("Ca-99", "Carlos", "Cisneros", TipoDocumento.DNI, "95098911", "94-95098911-3", "1563875501", "carlitosElTrusher@gmail.com", 1000, "Siempre juega trush");
            cr.getList().forEach(System.out::println);
            
            //REMOVE
            System.out.println();
            Propiedad propiedad = pr.getByCodigo("Ca-99");
            cr.remove(cr.getByPropiedad(propiedad));
            cr.getList().forEach(System.out::println);
            //SAVE
            cr.save(cliente);
            cr.getList().forEach(System.out::println);
            //UPDATE
            System.out.println();
            cliente.setObservacion("Juega mal al Age.");
            cr.update(cliente);
            cr.getList().forEach(System.out::println);

            // Consultas
            System.out.println("\n" + "Conseguir una cliente:" + "\n" + cr.getById(1));
            System.out.println("Conseguir un cliente por propiedad:" + "\n" + cr.getByPropiedad(pr.getByCodigo("Ca-99")));
            System.out.println("Conseguir un cliente por código de propeidad: " + "\n" + cr.getByCodigoPropiedad("Ca-02"));
            System.out.println("Conseguir un cliente por nombre y apellido:" + "\n" + cr.getLikeNombreAndApellido("Carlos","Cisneros"));
            System.out.println("Cantidad de clientes: " + cr.getCount());
        } catch (Exception e) { e.printStackTrace();}
    }
}