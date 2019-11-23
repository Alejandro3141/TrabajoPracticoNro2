package ar.inmobiliaria.alquileres.repositories.jdbc;

import ar.inmobiliaria.alquileres.entities.Cliente;
import ar.inmobiliaria.alquileres.enums.TipoDocumento;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ClienteRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements I_ClienteRepository{
    private List list;
    private Connection conn;
    public ClienteRepository (List list){ this.list = list; }
    public ClienteRepository(Connection conn) { this.conn=conn; } 

    @Override
    public void save(Cliente cliente) {
        if(cliente==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "insert into clientes (codigoPropiedad,nombre,apellido,tipoDocumento,numeroDocumento,cuit_cuil,telefono,email,garantia,observacion) values (?,?,?,?,?,?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setString(1, cliente.getCodigoPropiedad());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getTipoDocumento().toString());
            ps.setString(5, cliente.getNumeroDocumento());
            ps.setString(6, cliente.getCuit_cuil());
            ps.setString(7, cliente.getTelefono());
            ps.setString(8, cliente.getEmail());
            ps.setDouble(9, cliente.getGarantia());
            ps.setString(10, cliente.getObservacion());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) cliente.setCodigoCliente(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Cliente cliente) {
        if(cliente==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from clientes where codigoCliente=?")){
            ps.setInt(1, cliente.getCodigoCliente());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Cliente cliente) {
        if(cliente==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "update clientes set codigoPropiedad=?, nombre=?, apellido=?, tipoDocumento=?, numeroDocumento=?, cuit_cuil=?, telefono=?, email=?, garantia=?, observacion=? where codigoCliente=?"
        )) {
            ps.setString(1, cliente.getCodigoPropiedad());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getTipoDocumento().toString());
            ps.setString(5, cliente.getNumeroDocumento());
            ps.setString(6, cliente.getCuit_cuil());
            ps.setString(7, cliente.getTelefono());
            ps.setString(8, cliente.getEmail());
            ps.setDouble(9, cliente.getGarantia());
            ps.setString(10, cliente.getObservacion());
            ps.setInt(11, cliente.getCodigoCliente());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Cliente> getList() {
        list = new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(
                "select * from clientes")) {
            while(rs.next()){
                list.add(new Cliente(
                        rs.getInt("codigoCliente"),
                        rs.getString("codigoPropiedad"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        TipoDocumento.valueOf(rs.getString("tipoDocumento")),
                        rs.getString("numeroDocumento"),
                        rs.getString("cuit_cuil"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getDouble("garantia"),
                        rs.getString("observacion")
                ));
            }
        } catch (Exception e) { e.printStackTrace();  }
        return list;
    }
}
