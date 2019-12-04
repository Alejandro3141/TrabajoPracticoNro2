package ar.inmobiliaria.alquileres.repositories.interfaces;
import ar.inmobiliaria.alquileres.entities.Propiedad;
import ar.inmobiliaria.alquileres.enums.TipoInmueble;
import ar.inmobiliaria.alquileres.enums.Ubicacion;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface I_PropiedadRepository {
    void save(Propiedad propiedad);
    void remove(Propiedad propiedad);
    void update(Propiedad propiedad);
    List<Propiedad>getList();           
    
    default Propiedad getByCodigo(String codigo){
        return getList()
                .stream()
                .filter(c->c.getCodigoPropiedad().equals(codigo))
                .findFirst()
                .orElse(new Propiedad());
    }
    default List<Propiedad> getLikeCodigo (String codigo) {
        return getList()
                .stream()
                .filter(p->p.getCodigoPropiedad().toLowerCase().contains(codigo.toLowerCase()))
                .collect(Collectors.toList());
    }
    default List<Propiedad> getByUbicacion (Ubicacion ubicacion) {
        return getList()
                .stream()
                .filter(u->u.getUbicacion() == ubicacion)
                .collect(Collectors.toList());
    }
    
    default List<Propiedad> getBytipoInmueble (TipoInmueble tipoInmueble) {
        return getList()
                .stream()
                .filter(u->u.getTipoInmueble()== tipoInmueble)
                .collect(Collectors.toList());
    }
    
      default Propiedad max() {
       return getList()
               .stream()
               .max(Comparator.comparingDouble(Propiedad::getPrecioAlquiler))
               .get();
   }
   
   default Propiedad min() {
       return getList()
               .stream()
               .min(Comparator.comparingDouble(Propiedad::getPrecioAlquiler))
               .get();
   }
   
   default int getCount() {
       return (int) getList()
               .stream()
               .count();
   }
}