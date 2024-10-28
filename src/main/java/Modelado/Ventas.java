package Modelado;

import java.time.LocalDate;

public class Ventas {

    private int idVentas;
    private int cantidad;
    private LocalDate fechaVenta;
    private float subtotal;
    private float total;

    public Ventas() {
    }

    public Ventas(int idVentas, int cantidad, LocalDate fechaVenta, float subtotal, float total) {
        this.idVentas = idVentas;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
        this.subtotal = subtotal;
        this.total = total;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
