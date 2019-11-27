package ar.inmobiliaria.alquileres.tests;
import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.Factura;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_FacturaRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.FacturaRepository;
import java.sql.Connection;

public class TestFacturaRepository {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()) {
            I_ClienteRepository cr = new ClienteRepository(conn);
            
            I_FacturaRepository fr = new FacturaRepository(conn);
            fr.getList().forEach(System.out::println);
            Factura factura = new Factura(11, "2019-11-25", 1, 0, 2500);
            
            // SAVE
            System.out.println();
            fr.save(factura);
            fr.getList().forEach(System.out::println);
            // REMOVE
            System.out.println();
            fr.remove(fr.getByCodigo(1));
            fr.getList().forEach(System.out::println);
            // UPDATE
            System.out.println();
            factura.setCuota(2);
            factura.setMonto(5000);
            fr.update(factura);
            fr.getList().forEach(System.out::println);
            
            //CONSULTAS
            System.out.println("\n" + "Conseguir una Factura por el Código: " + "\n" + fr.getByCodigo(2));
            System.out.println("\n" + "Conseguir una Factura por el Cliente:" + "\n" + fr.getByCliente(cr.getById(1)));
            System.out.println("\n" + "Conseguir una Factura por el CódigoCliente:" + "\n" + fr.getByCodigoCliente(2));
            System.out.println("\n" + "Conseguir Clientes en Mora:");
            fr.getClientesMora().forEach(System.out::println);
            System.out.println("\n" + "Conseguir cantidad de Facturas: " + fr.getCount());
        } catch (Exception e) { e.printStackTrace();}
    }
}