package ar.inmobiliaria.alquileres.entities;
import ar.inmobiliaria.alquileres.enums.TiempoCuotas;

public class Contrato {
    private int codigoContrato;
    private int codigoCliente;
    private String fechaInicio;//Se lo va a tratar como String y luego se va a parsear como Date
    private String fechaFinal;
    private TiempoCuotas tiempoCuotas;
    private int numeroCuotas;

    public Contrato() {
    }

    public Contrato(int codigoCliente, String fechaInicio, String fechaFinal, TiempoCuotas tiempoCuotas, int numeroCuotas) {
        this.codigoCliente = codigoCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.tiempoCuotas = tiempoCuotas;
        this.numeroCuotas = numeroCuotas;
    }

    public Contrato(int codigoContrato, int codigoCliente, String fechaInicio, String fechaFinal, TiempoCuotas tiempoCuotas, int numeroCuotas) {
        this.codigoContrato = codigoContrato;
        this.codigoCliente = codigoCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.tiempoCuotas = tiempoCuotas;
        this.numeroCuotas = numeroCuotas;
    }

    @Override
    public String toString() {
        return "Contrato{" + "codigoContrato=" + codigoContrato + ", codigoCliente=" + codigoCliente + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", tiempoCuotas=" + tiempoCuotas + ", numeroCuotas=" + numeroCuotas + '}';
    }

    public int getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public TiempoCuotas getTiempoCuotas() {
        return tiempoCuotas;
    }

    public void setTiempoCuotas(TiempoCuotas tiempoCuotas) {
        this.tiempoCuotas = tiempoCuotas;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }
    
}
