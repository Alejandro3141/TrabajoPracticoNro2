package ar.inmobiliaria.alquileres.repositories.interfaces;
import ar.inmobiliaria.alquileres.entities.Cliente;
import ar.inmobiliaria.alquileres.entities.Contrato;
import java.util.List;

public interface I_ContratoRepository {
    void save (Contrato contrato);
    void remove(Contrato contrato);
    void update(Contrato contrato);
    List<Contrato>getList();
    
    default Contrato getByCodigo (int codigo) {
        return getList()
                .stream()
                .filter(c -> c.getCodigoContrato() == codigo)
                .findFirst()
                .orElse(new Contrato());
    }
    default Contrato getByCliente (Cliente cliente) {
        return getList()
                .stream()
                .filter(c -> c.getCodigoCliente() == cliente.getCodigoCliente())
                .findFirst()
                .orElse(new Contrato());
    }
    default int getCount () {
        return (int) getList()
                .stream()
                .count();
    }
}
