package ar.inmobiliaria.alquileres.repositories.interfaces;
import ar.inmobiliaria.alquileres.entities.Cliente;
import ar.inmobiliaria.alquileres.entities.Propiedad;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface I_ClienteRepository {
    void save(Cliente cliente);
    void remove(Cliente cliente);
    void update(Cliente cliente);
    List<Cliente>getList();
    default Cliente getById(int codigo){
        return getList()
                .stream()
                .filter(c->c.getCodigoCliente()==codigo)
                .findFirst()
                .orElse(new Cliente());
    }
    default Cliente getByPropiedad(Propiedad propiedad){
        if(propiedad==null) return new Cliente();
        return  getList()
                .stream()
                .filter(a->a.getCodigoPropiedad().equals(propiedad.getCodigoPropiedad()))
                .findFirst()
                .orElse(new Cliente());
    }
    default Cliente getByCodigoPropiedad (String propiedad) {
        return getList()
                .stream()
                .filter(c -> c.getCodigoPropiedad().equals(propiedad))
                .findFirst()
                .orElse(new Cliente());
    }
    default List<Cliente> getLikeCodigoPropiedad (String propiedad) {
        if(propiedad==null) return new ArrayList();
        return getList()
                .stream()
                .filter(c->c.getCodigoPropiedad().toLowerCase().contains(propiedad.toLowerCase()))
                .collect(Collectors.toList());
    }
    default List<Cliente> getLikeNombre(String nombre){
        if(nombre==null) return new ArrayList();
        return getList()
                .stream()
                .filter(c->c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    default List<Cliente> getLikeApellido(String apellido){
        if(apellido==null) return new ArrayList();
        return getList()
                .stream()
                .filter(c->c.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
    default List<Cliente> getLikeNombreAndApellido(String nombre, String apellido){
        if(nombre==null || apellido==null) return new ArrayList();
        return getList()
                .stream()
                .filter(c->c.getNombre().toLowerCase().contains(nombre.toLowerCase())
                && c.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
    default int getCount() {
       return (int) getList()
               .stream()
               .count();
   }
}