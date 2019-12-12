package ar.inmobiliaria.alquileres.repositories.interfaces;
import ar.inmobiliaria.alquileres.entities.Cliente;
import ar.inmobiliaria.alquileres.entities.HistoriaInmobiliaria;
import java.util.List;
import java.util.stream.Collectors;

public interface I_HistoriaInmobiliariaRepository {
    void save(HistoriaInmobiliaria historiaInmobiliaria);         // insert into cursos () 
    void remove(HistoriaInmobiliaria historiaInmobiliaria);       // delete from cursos
    void update(HistoriaInmobiliaria historiaInmobiliaria);       // update cursos
    List<HistoriaInmobiliaria>getList();            // select * from cursos
    
    default HistoriaInmobiliaria getByCodigoPropiedad(String codigo){
        return getList()
                .stream()
                .filter(h->h.getCodigoPropiedad().equals(codigo))
                .findFirst()
                .orElse(new HistoriaInmobiliaria());
    }
    default HistoriaInmobiliaria getByCodigoCliente (int codigo) {
        return getList()
                .stream()
                .filter(h->h.getCodigoCliente() == codigo)
                .findFirst()
                .orElse(new HistoriaInmobiliaria());
    }
    // Nueva Consulta a Incorporar
    default List<HistoriaInmobiliaria> getByCliente (Cliente cliente) {
        return getList()
                .stream()
                .filter(h->h.getCodigoCliente() == cliente.getCodigoCliente())
                .collect(Collectors.toList());
    }
    default HistoriaInmobiliaria getByCodigoPropiedadAndCliente(String codigoPropiedad, int codigoCliente) {
        return getList()
                .stream()
                .filter(h->h.getCodigoPropiedad().equals(codigoPropiedad)
                && h.getCodigoCliente() == codigoCliente)
                .findFirst()
                .orElse(new HistoriaInmobiliaria());
    }
    default List<HistoriaInmobiliaria> getByEgresados() {
        return getList()
                .stream()
                .filter(h-> !(h.getFechaEgreso() == null))
                .collect(Collectors.toList());
    }
    default List<HistoriaInmobiliaria> getByRenovados() {
        return getList()
                .stream()
                .filter(h-> !(h.getFechaRenovacion() == null))
                .collect(Collectors.toList());
    }
    default int getCount() {
       return (int) getList()
               .stream()
               .count();
   }
}
