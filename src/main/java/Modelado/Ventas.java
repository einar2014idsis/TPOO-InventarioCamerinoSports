package Modelado;

public class Ventas {

    private int idVentas;
    private String numVenta;
    private int idClientes;
    private String fechaVenta;
    private float subtotal;
    private float igv;
    private float total;

    public Ventas() {
    }

    public Ventas(int idVentas, String numVenta, int idClientes, String fechaVenta, float subtotal, float igv, float total) {
        this.idVentas = idVentas;
        this.numVenta = numVenta;
        this.idClientes = idClientes;
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

    public String getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(String numVenta) {
        this.numVenta = numVenta;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
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
