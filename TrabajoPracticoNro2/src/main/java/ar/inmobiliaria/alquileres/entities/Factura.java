package ar.inmobiliaria.alquileres.entities;

import java.text.DecimalFormat;

public class Factura {
    private int codigoFactura;
    private int codigoCliente;
    private String fecha;
    private int cuota;
    private double mora;
    private double monto;

    public Factura() {
    }

    public Factura(int codigoFactura, int codigoCliente, String fecha, int cuota, double mora, double monto) {
        this.codigoFactura = codigoFactura;
        this.codigoCliente = codigoCliente;
        this.fecha = fecha;
        this.cuota = cuota;
        this.mora = mora;
        this.monto = monto;
    }

    public Factura(int codigoCliente, String fecha, int cuota, double mora, double monto) {
        this.codigoCliente = codigoCliente;
        this.fecha = fecha;
        this.cuota = cuota;
        this.mora = mora;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigoFactura=" + codigoFactura + ", codigoCliente=" + codigoCliente + ", fecha=" + fecha + ", cuota=" + cuota + ", mora= $" + this.getDecimalFormatMora() + ", monto= $" + this.getDecimalFormatMonto() + '}';
    }

    private String getDecimalFormatMonto () {
        return new DecimalFormat("##,##0.00").format(this.getMonto());
    }
    
    private String getDecimalFormatMora () {
        return new DecimalFormat("##,##0.00").format(this.getMora());
    }
        
    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public double getMora() {
        return mora;
    }

    public void setMora(double mora) {
        this.mora = mora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
