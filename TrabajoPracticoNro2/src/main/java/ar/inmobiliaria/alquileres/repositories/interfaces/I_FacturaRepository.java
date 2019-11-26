package ar.inmobiliaria.alquileres.repositories.interfaces;
import ar.inmobiliaria.alquileres.entities.Cliente;
import ar.inmobiliaria.alquileres.entities.Factura;
import java.util.List;
import java.util.stream.Collectors;

public interface I_FacturaRepository {
    void save(Factura factura);
    void remove(Factura factura);
    void update(Factura factura);
    List<Factura> getList();
    
    default Factura getByCodigo(int codigo){
        return getList()
                .stream()
                .filter(c->c.getCodigoCliente()==codigo)
                .findFirst()
                .orElse(new Factura());
    }
    default Factura getByCliente(Cliente cliente){
        if(cliente==null) return new Factura();
        return  getList()
                .stream()
                .filter(f -> f.getCodigoCliente() == cliente.getCodigoCliente())
                .findFirst()
                .orElse(new Factura());
    }
    default Factura getByCodigoCliente (int codigo) {
        return getList()
                .stream()
                .filter(f -> f.getCodigoCliente() == codigo)
                .findFirst()
                .orElse(new Factura());
    }
    default List<Factura> getClientesMora() {
        return getList()
                .stream()
                .filter(f -> !(f.getMonto() > 0))
                .collect(Collectors.toList());
    }
    default int getCount() {
       return (int) getList()
               .stream()
               .count();
   }
}