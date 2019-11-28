package ar.inmobiliaria.alquileres.repositories.jdbc;
import ar.inmobiliaria.alquileres.entities.HistoriaInmobiliaria;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_HistoriaInmobiliariaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HistoriaInmobiliariaRepository implements I_HistoriaInmobiliariaRepository{
    private List<HistoriaInmobiliaria> list;
    private Connection conn;

    public HistoriaInmobiliariaRepository(List list) {
        this.list = list;
    }
    public HistoriaInmobiliariaRepository(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public void save(HistoriaInmobiliaria historiaInmobiliaria) {
        if(historiaInmobiliaria==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "insert into historiaInmobiliaria (codigoPropiedad, codigoCliente, fechaRenovacion, fechaEgreso) values (?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setString(1, historiaInmobiliaria.getCodigoPropiedad());
            ps.setInt(2, historiaInmobiliaria.getCodigoCliente());
            ps.setString(3, historiaInmobiliaria.getFechaRenovacion());
            ps.setString(4, historiaInmobiliaria.getFechaEgreso());
            ps.execute();
            //ResultSet rs=ps.getGeneratedKeys(); // No es necesario generar el resultSet y setearlas xq ya se creo el códigoPropiedad y el códigoCliente
            //if(rs.next()) historiaInmobiliaria.setCodigoCliente(rs.getInt(1));
            //if(rs.next()) historiaInmobiliaria.setCodigoPropiedad(rs.getString(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(HistoriaInmobiliaria historiaInmobiliaria) {
        if(historiaInmobiliaria==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from historiaInmobiliaria where codigoPropiedad=? and codigoCliente=?")) {
            ps.setString(1, historiaInmobiliaria.getCodigoPropiedad());
            ps.setInt(2, historiaInmobiliaria.getCodigoCliente());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(HistoriaInmobiliaria historiaInmobiliaria) {
        if(historiaInmobiliaria==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "update historiaInmobiliaria set fechaRenovacion=?, fechaEgreso=? where codigoPropiedad=? and codigoCliente=?"
        )) {
            ps.setString(1, historiaInmobiliaria.getFechaRenovacion());
            ps.setString(2, historiaInmobiliaria.getFechaEgreso());
            ps.setString(3, historiaInmobiliaria.getCodigoPropiedad());
            ps.setInt(4, historiaInmobiliaria.getCodigoCliente());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<HistoriaInmobiliaria> getList() {
        list = new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(
                "select * from historiaInmobiliaria")) {
            while(rs.next()){
                list.add(new HistoriaInmobiliaria(
                        rs.getString("codigoPropiedad"),
                        rs.getInt("codigoCliente"),
                        rs.getString("fechaRenovacion"),
                        rs.getString("fechaEgreso")
                ));
            }
        } catch (Exception e) { e.printStackTrace();  }
        return list;
    }
    
}
