package ar.inmobiliaria.alquileres.tests;

import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.Propiedad;
import ar.inmobiliaria.alquileres.enums.TipoInmueble;
import ar.inmobiliaria.alquileres.enums.Ubicacion;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_PropiedadRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.PropiedadRepository;
import java.sql.Connection;

public class TestPropiedadRepository {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()) {
            I_PropiedadRepository pr = new PropiedadRepository(conn);
            pr.getList().forEach(System.out::println);
            Propiedad propiedad = new Propiedad("Dep-06", Ubicacion.San_Martin, TipoInmueble.Departamento, 10000, "mono-ambiente");

            // Save
            System.out.println();
            pr.save(propiedad);
            pr.getList().forEach(System.out::println);
            // Remove
            System.out.println();
            pr.remove(pr.getByCodigo("Ca-01")); // No se puede eliminar una propiedad que tenga clientes
            pr.getList().forEach(System.out::println);
            // Propiedades sin clientes --> del TestConnection
            System.out.println();
            pr.remove(pr.getByCodigo("Hab-99"));
            pr.getList().forEach(System.out::println);
            // Update
            System.out.println();
            propiedad.setPrecioAlquiler(12000);
            propiedad.setDescripcion("loft");
            pr.update(propiedad);
            pr.getList().forEach(System.out::println);

            // Consultas
            System.out.println("\n" + "Conseguir una propiedad:");
            System.out.println(pr.getByCodigo("Dep-05"));
            System.out.println("\n" + "Propiedades por tipoInmueble:");
            pr.getBytipoInmueble(TipoInmueble.Departamento).forEach(System.out::println);
            System.out.println("\n" + "Propiedades por ubicacion:");
            pr.getByUbicacion(Ubicacion.San_Martin).forEach(System.out::println);
            System.out.println("\n" + "Propiedad/es con mayor/es ingreso/s:");
            pr
                .getList()
                .stream()
                .filter(v -> v.getPrecioAlquiler()== pr.max().getPrecioAlquiler())
                .forEach(System.out::println);
            System.out.println("\n" + "Propiedad/es con menor/es ingreso/s:");
            pr
                .getList()
                .stream()
                .filter(v -> v.getPrecioAlquiler()== pr.min().getPrecioAlquiler())
                .forEach(System.out::println);
            System.out.println("\n" + "Cantidad de Propiedades= " + pr.getCount());
        } catch (Exception e) { e.printStackTrace(); }
    }

}
