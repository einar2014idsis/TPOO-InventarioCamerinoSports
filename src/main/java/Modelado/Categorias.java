package Modelado;

public class Categorias {

    private int idCategorias;
    private String categoria;

    public Categorias() {
    }

    public Categorias(int idCategorias, String categoria) {
        this.idCategorias = idCategorias;
        this.categoria = categoria;
    }

    public int getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(int idCategorias) {
        this.idCategorias = idCategorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
