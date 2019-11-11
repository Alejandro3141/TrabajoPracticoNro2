package ar.inmobiliaria.alquileres.entities;
import ar.inmobiliaria.alquileres.enums.TipoDocumento;

public class Cliente {
    private int codigoCliente;
    private int codigoPropiedad;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String cuit_cuil;
    private String telefono;
    private String email;
    private double garantia;
    private String observacion;

    public Cliente() {
    }  

    public Cliente(int codigoPropiedad, String nombre, String apellido, TipoDocumento tipoDocumento, String numeroDocumento, String cuit_cuil, String telefono, String email, double garantia, String observacion) {
        this.codigoPropiedad = codigoPropiedad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.cuit_cuil = cuit_cuil;
        this.telefono = telefono;
        this.email = email;
        this.garantia = garantia;
        this.observacion = observacion;
    }

    public Cliente(int codigoCliente, int codigoPropiedad, String nombre, String apellido, TipoDocumento tipoDocumento, String numeroDocumento, String cuit_cuil, String telefono, String email, double garantia, String observacion) {
        this.codigoCliente = codigoCliente;
        this.codigoPropiedad = codigoPropiedad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.cuit_cuil = cuit_cuil;
        this.telefono = telefono;
        this.email = email;
        this.garantia = garantia;
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", codigoPropiedad=" + codigoPropiedad + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", cuit_cuil=" + cuit_cuil + ", telefono=" + telefono + ", email=" + email + ", garantia=" + garantia + ", observacion=" + observacion + '}';
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(int codigoPropiedad) {
        this.codigoPropiedad = codigoPropiedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCuit_cuil() {
        return cuit_cuil;
    }

    public void setCuit_cuil(String cuit_cuil) {
        this.cuit_cuil = cuit_cuil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGarantia() {
        return garantia;
    }

    public void setGarantia(double garantia) {
        this.garantia = garantia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
