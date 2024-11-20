package Modelado;

public class DetallesVentas {
    private int idDetalles;
    private int idVentas;
    private int idIngresos;
    private int cantidad;
    private double importe;

    public DetallesVentas() {
    }

    public DetallesVentas(int idDetalles, int idVentas, int idIngresos, int cantidad, double importe) {
        this.idDetalles = idDetalles;
        this.idVentas = idVentas;
        this.idIngresos = idIngresos;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public int getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(int idDetalles) {
        this.idDetalles = idDetalles;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
