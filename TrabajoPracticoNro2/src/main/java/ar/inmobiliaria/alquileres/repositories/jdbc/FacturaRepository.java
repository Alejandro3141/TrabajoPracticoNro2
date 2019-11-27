package ar.inmobiliaria.alquileres.repositories.jdbc;
import ar.inmobiliaria.alquileres.entities.Factura;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_FacturaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FacturaRepository implements I_FacturaRepository {
    private List<Factura> list;
    private Connection conn;

    public FacturaRepository(List list) {
        this.list = list;
    }

    public FacturaRepository(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public void save(Factura factura) {
        if(factura==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "insert into facturas (codigoCliente, fecha, cuota, mora, monto) values (?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setInt(1, factura.getCodigoCliente());
            ps.setString(2, factura.getFecha());
            ps.setInt(3, factura.getCuota());
            ps.setDouble(4, factura.getMora());
            ps.setDouble(5, factura.getMonto());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) factura.setCodigoFactura(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Factura factura) {
        if(factura==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from facturas where codigoFactura=?")){
            ps.setInt(1, factura.getCodigoFactura());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Factura factura) {
        if(factura==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "update facturas set codigoCliente=?, fecha=?, cuota=?, mora=?, monto=? where codigoFactura=?"
        )) {
            ps.setInt(1, factura.getCodigoCliente());
            ps.setString(2, factura.getFecha());
            ps.setInt(3, factura.getCuota());
            ps.setDouble(4, factura.getMora());
            ps.setDouble(5, factura.getMonto());
            ps.setInt(6, factura.getCodigoFactura());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Factura> getList() {
        list = new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(
                "select * from facturas")) {
            while(rs.next()){
                list.add(new Factura(
                        rs.getInt("codigoFactura"),
                        rs.getInt("codigoCliente"),
                        rs.getString("fecha"),
                        rs.getInt("cuota"),
                        rs.getDouble("mora"),
                        rs.getDouble("monto")
                ));
            }
        } catch (Exception e) { e.printStackTrace();  }
        return list;
    }
    
}
