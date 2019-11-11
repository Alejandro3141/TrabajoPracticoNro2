package ar.inmobiliaria.alquileres.repositories.jdbc;
import ar.inmobiliaria.alquileres.entities.Propiedad;
import ar.inmobiliaria.alquileres.enums.TipoInmueble;
import ar.inmobiliaria.alquileres.enums.Ubicacion;
import ar.inmobiliaria.alquileres.repositories.interfaces.I_PropiedadesRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class PropiedadRepository implements I_PropiedadesRepository {
    private List<Propiedad> list;
    private Connection conn;
    
    public PropiedadRepository(List<Propiedad> list) {this.list = list;   }
    public PropiedadRepository(Connection conn) {    this.conn = conn;    }

    @Override
    public void save(Propiedad propiedad) {
        if(propiedad==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "insert into propiedades (codigoPropiedad, ubicacion, tipoInmueble, precioAlquiler, descripcion) values (?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setInt(1, propiedad.getCodigoPropiedad());
            ps.setString(2,propiedad.getUbicacion().toString());
            ps.setString(3, propiedad.getTipoInmueble().toString());
            ps.setDouble(4,propiedad.getPrecioAlquiler());
            ps.setString(5, propiedad.getDescripcion());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) propiedad.setCodigoPropiedad(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Propiedad propiedad) {
        if(propiedad==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from propiedades where codigoPropiedad=?")) {
            ps.setInt(1, propiedad.getCodigoPropiedad());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Propiedad propiedad) {
        if(propiedad==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "update propiedades set ubicacion=?, tipoInmueble=?, precioAlquiler=?, descripcion=? where codigoPropiedad=?"
        )) {
            ps.setString(1, propiedad.getUbicacion().toString());
            ps.setString(2, propiedad.getTipoInmueble().toString());
            ps.setDouble(3, propiedad.getPrecioAlquiler());
            ps.setString(4, propiedad.getDescripcion());
            ps.setInt(5, propiedad.getCodigoPropiedad());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Propiedad> getList() {
        try (ResultSet rs=conn.createStatement().executeQuery("select * from propiedades");) {
            while(rs.next()){
                list.add(new Propiedad(
                        rs.getInt("codigoPropiedad"),
                        Ubicacion.valueOf(rs.getString("ubicacion")),
                        TipoInmueble.valueOf(rs.getString("tipoInmueble")),
                        rs.getDouble("precioAlquiler"),
                        rs.getString("descripcion")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}
