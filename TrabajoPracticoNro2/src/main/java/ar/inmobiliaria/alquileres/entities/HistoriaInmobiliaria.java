package ar.inmobiliaria.alquileres.entities;

public class HistoriaInmobiliaria {
    private String codigoPropiedad;
    private int codigoCliente;
    private String fechaRenovacion;
    private String fechaEgreso;

    public HistoriaInmobiliaria() {
    }

    public HistoriaInmobiliaria(String fechaRenovacion, String fechaEgreso) {
        this.fechaRenovacion = fechaRenovacion;
        this.fechaEgreso = fechaEgreso;
    }

    public HistoriaInmobiliaria(String codigoPropiedad, int codigoCliente, String fechaRenovacion, String fechaEgreso) {
        this.codigoPropiedad = codigoPropiedad;
        this.codigoCliente = codigoCliente;
        this.fechaRenovacion = fechaRenovacion;
        this.fechaEgreso = fechaEgreso;
    }

    @Override
    public String toString() {
        return "HistoriaInmobiliaria{" + "codigoPropiedad=" + codigoPropiedad + ", codigoCliente=" + codigoCliente + ", fechaRenovacion=" + fechaRenovacion + ", fechaEgreso=" + fechaEgreso + '}';
    }

    public String getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(String codigoPropiedad) {
        this.codigoPropiedad = codigoPropiedad;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(String fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
}
