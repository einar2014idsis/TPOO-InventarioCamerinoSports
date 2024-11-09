package Modelado;

public class Ventas {

    private int idVentas;
    private int idIngresos;
    private int idClientes;
    private int cantidad;
    private String fechaVenta;
    private float subtotal;
    private float igv;
    private float total;

    public Ventas() {
    }

    public Ventas(int idVentas, int idIngresos, int idClientes, int cantidad, String fechaVenta, float subtotal, float igv, float total) {
        this.idVentas = idVentas;
        this.idIngresos = idIngresos;
        this.idClientes = idClientes;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdIngresos() {
        return idIngresos;
    }

    public void setIdIngresos(int idIngresos) {
        this.idIngresos = idIngresos;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}