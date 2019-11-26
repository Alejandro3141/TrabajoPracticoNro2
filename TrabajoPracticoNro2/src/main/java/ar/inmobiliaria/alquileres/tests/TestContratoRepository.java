package ar.inmobiliaria.alquileres.tests;
import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.Contrato;
import ar.inmobiliaria.alquileres.enums.TiempoCuotas;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ContratoRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.ClienteRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.ContratoRepository;
import java.sql.Connection;

public class TestContratoRepository {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()) {
            I_ClienteRepository crl = new ClienteRepository(conn);
                    
            I_ContratoRepository cr = new ContratoRepository(conn);
            cr.getList().forEach(System.out::println);
            Contrato contrato = new Contrato(11, "2019-11-25", "2020-04-25", TiempoCuotas.Mensual, 5);
            
            // SAVE
            System.out.println();
            cr.save(contrato);
            cr.getList().forEach(System.out::println);
            // REMOVE
            System.out.println();
            cr.remove(cr.getByCodigo(1));
            cr.getList().forEach(System.out::println);
            // UPDATE
            System.out.println();
            contrato.setFechaFinal("2020-06-25");
            contrato.setNumeroCuotas(6);
            cr.update(contrato);
            cr.getList().forEach(System.out::println);
            //CONSULTAS
            System.out.println("\n" + "Conseguir un Contrato por Código:" + "\n" + cr.getByCodigo(10));
            System.out.println("\n" + "Conseguir un Contrato por Cliente:" + "\n" + cr.getByCliente(crl.getById(11)));
            System.out.println("\n" + "Conseguir un Contrato por código Cliente:" + "\n" + cr.getByCodigoCliente(11));
            System.out.println("\n" + "Cantidad de Contratos: " + cr.getCount());
        } catch (Exception e) { e.printStackTrace();}
    }
}
