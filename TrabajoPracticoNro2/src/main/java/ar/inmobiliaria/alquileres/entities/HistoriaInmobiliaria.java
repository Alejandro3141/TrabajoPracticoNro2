package ar.inmobiliaria.alquileres.entities;
import java.sql.Date;

public class HistoriaInmobiliaria {
    private int codigoPropiedad;
    private int codigoCliente;
    private Date fechaRenovacion; // PREGUNTAR SI USO DATE?
    private Date fechaEgreso;

    public HistoriaInmobiliaria() {
    }

    public HistoriaInmobiliaria(Date fechaRenovacion, Date fechaEgreso) {
        this.fechaRenovacion = fechaRenovacion;
        this.fechaEgreso = fechaEgreso;
    }

    public HistoriaInmobiliaria(int codigoPropiedad, int codigoCliente, Date fechaRenovacion, Date fechaEgreso) {
        this.codigoPropiedad = codigoPropiedad;
        this.codigoCliente = codigoCliente;
        this.fechaRenovacion = fechaRenovacion;
        this.fechaEgreso = fechaEgreso;
    }

    @Override
    public String toString() {
        return "HistoriaInmobiliaria{" + "codigoPropiedad=" + codigoPropiedad + ", codigoCliente=" + codigoCliente + ", fechaRenovacion=" + fechaRenovacion + ", fechaEgreso=" + fechaEgreso + '}';
    }

    public int getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(int codigoPropiedad) {
        this.codigoPropiedad = codigoPropiedad;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(Date fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
}
