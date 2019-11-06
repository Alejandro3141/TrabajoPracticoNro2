package ar.inmobiliaria.alquileres.entities;
import ar.inmobiliaria.alquileres.enums.TipoInmueble;
import ar.inmobiliaria.alquileres.enums.Ubicacion;

public class Propiedad {
    private int codigoPropiedad;
    private Ubicacion ubicacion;
    private TipoInmueble tipoInmueble;
    private double precioAlquiler;
    private String descripcion;

    public Propiedad() {
    }

    public Propiedad(Ubicacion ubicacion, TipoInmueble tipoInmueble, double precioAlquiler, String descripcion) {
        this.ubicacion = ubicacion;
        this.tipoInmueble = tipoInmueble;
        this.precioAlquiler = precioAlquiler;
        this.descripcion = descripcion;
    }

    public Propiedad(int codigoPropiedad, Ubicacion ubicacion, TipoInmueble tipoInmueble, double precioAlquiler, String descripcion) {
        this.codigoPropiedad = codigoPropiedad;
        this.ubicacion = ubicacion;
        this.tipoInmueble = tipoInmueble;
        this.precioAlquiler = precioAlquiler;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "codigoPropiedad=" + codigoPropiedad + ", ubicacion=" + ubicacion + ", tipoInmueble=" + tipoInmueble + ", precioAlquiler=" + precioAlquiler + ", descripcion=" + descripcion + '}';
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public TipoInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(TipoInmueble tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public int getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(int codigoPropiedad) {
        this.codigoPropiedad = codigoPropiedad;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
