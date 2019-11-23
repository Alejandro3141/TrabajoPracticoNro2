package ar.inmobiliaria.alquileres.repositories.jdbc;
import ar.inmobiliaria.alquileres.entities.Contrato;
import ar.inmobiliaria.alquileres.enums.TiempoCuotas;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_ContratoRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContratoRepository implements I_ContratoRepository {
    private List<Contrato> list;
    private Connection conn;

    public ContratoRepository(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public void save(Contrato contrato) {
        if(contrato==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "insert into contratos (codigoCliente, fechaInicio, fechaFinal, tiempoCuotas, numeroCuotas) values (?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setInt(1, contrato.getCodigoCliente());
            ps.setDate(2, contrato.getFechaInicio());
            ps.setDate(3, contrato.getFechaFinal());
            ps.setString(4, contrato.getTiempoCuotas().toString());
            ps.setInt(5, contrato.getNumeroCuotas());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) contrato.setCodigoContrato(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Contrato contrato) {
        if(contrato==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from contratos where codigoContrato=?")) {
            ps.setInt(1, contrato.getCodigoContrato());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Contrato contrato) {
        if(contrato==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "update contratos set codigoCliente=?, fechaInicio=?, fechaFinal=?, tiempoCuotas=?, numeroCuotas=? where codigoContrato=?"
        )) {
            ps.setInt(1, contrato.getCodigoCliente());
            ps.setDate(2, contrato.getFechaInicio());
            ps.setDate(3, contrato.getFechaFinal());
            ps.setString(4, contrato.getTiempoCuotas().toString());
            ps.setInt(5, contrato.getNumeroCuotas());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Contrato> getList() {
        list = new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(
                "select * from contratos")) {
            while(rs.next()){
                list.add(new Contrato(
                        rs.getInt("codigoContrato"),
                        rs.getInt("codigoCliente"),
                        rs.getDate("fechaInicio"),
                        rs.getDate("fechaFinal"),
                        TiempoCuotas.valueOf(rs.getString("tiempoCuotas")),
                        rs.getInt("numeroCuotas")
                ));
            }
        } catch (Exception e) { e.printStackTrace();  }
        return list;
    }
    
}
