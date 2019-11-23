package ar.inmobiliaria.alquileres.tests;
import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.Contrato;
import ar.inmobiliaria.alquileres.enums.TiempoCuotas;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ContratoRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.ContratoRepository;
import java.sql.Connection;

public class TestContratoRepository {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()) {
            I_ContratoRepository cr = new ContratoRepository(conn);
            cr.getList().forEach(System.out::println);
        } catch (Exception e) {
        }
    }
}
