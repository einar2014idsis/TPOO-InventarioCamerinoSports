package Modelado;

public class Ingresos {

    private int idIngresos;
    private String nombreProducto;
    private int stock;
    private String tallaNumero;
    private int idCategorias;
    private String fechaIngreso;
    private int idProveedor;
    private double precioCompra;
    private double precioVenta;
    private double importeCompra;
    private double importeVenta;

    public Ingresos() {
    }

    public Ingresos(int idIngresos, String nombreProducto, int stock, String tallaNumero, int idCategorias, String fechaIngreso, int idProveedor, double precioCompra, double precioVenta, double importeCompra, double importeVenta) {
        this.idIngresos = idIngresos;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.tallaNumero = tallaNumero;
        this.idCategorias = idCategorias;
        this.fechaIngreso = fechaIngreso;
        this.idProveedor = idProveedor;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.importeCompra = importeCompra;
        this.importeVenta = importeVenta;
    }

    public int getIdIngresos() {
        return idIngresos;
    }

    public void setIdIngresos(int idIngresos) {
        this.idIngresos = idIngresos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTallaNumero() {
        return tallaNumero;
    }

    public void setTallaNumero(String tallaNumero) {
        this.tallaNumero = tallaNumero;
    }

    public int getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(int idCategorias) {
        this.idCategorias = idCategorias;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getImporteCompra() {
        return importeCompra;
    }

    public void setImporteCompra(double importeCompra) {
        this.importeCompra = importeCompra;
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(double importeVenta) {
        this.importeVenta = importeVenta;
    }
    
}
