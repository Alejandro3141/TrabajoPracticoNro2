package ar.inmobiliaria.alquileres.tests;

import ar.inmobiliaria.alquileres.connectors.Connector;
import ar.inmobiliaria.alquileres.entities.HistoriaInmobiliaria;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_HistoriaInmobiliariaRepository;
import ar.inmobiliaria.alquileres.repositories.jdbc.HistoriaInmobiliariaRepository;
import java.sql.Connection;

public class TestHistoriaInmobiliariaRepository {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()) {
            I_HistoriaInmobiliariaRepository hi = new HistoriaInmobiliariaRepository(conn);
            HistoriaInmobiliaria historia = new HistoriaInmobiliaria("Ca-02", 11, null, null);
            hi.getList().forEach(System.out::println);
            
            //SAVE
            System.out.println();
            hi.save(historia);
            hi.getList().forEach(System.out::println);
            //REMOVE
            System.out.println();
            hi.remove(hi.getByCodigoCliente(1));
            hi.getList().forEach(System.out::println);
            //UPDATE
            System.out.println();
            historia.setFechaRenovacion("2020-06-28");
            hi.update(historia);
            hi.getList().forEach(System.out::println);
            
            //CONSULTAS
            System.out.println("\n" + "Conseguir una historia por codigoPropiedad:" + "\n" + hi.getByCodigoPropiedad("Ca-02"));
            System.out.println("\n" + "Conseguir una historia por codigoCliente:" + "\n" + hi.getByCodigoCliente(2));
            System.out.println("\n" + "Conseguir una historia por codigoPropiedadYCliente:" + "\n" + hi.getByCodigoPropiedadAndCliente("Dep-01", 7));
            System.out.println("\n" + "Conseguir una historia por Fecha de Renovación:" + "\n" + hi.getByRenovados());
            System.out.println("\n" + "Conseguir una historia por Fecha de Egresados:" + "\n" + hi.getByEgresados());
        } catch (Exception e) { e.printStackTrace(); }
    }
}
