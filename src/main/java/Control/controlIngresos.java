package Control;

import Modelado.Categorias;
import Modelado.Conexion;
import Modelado.Ingresos;
import Modelado.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class controlIngresos {

    Connection con;
    Conexion cing = new Conexion();
    Conexion ccat = new Conexion();
    Conexion cpro = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean reinicioIngresos(Ingresos ing) {
        String resetSQL = "ALTER TABLE ingresos AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO ingresos (nombreProducto, stock, idCategorias, fechaIngreso, idProveedor, precioCompra, precioVenta, importeCompra, importeVenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con = cing.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, ing.getNombreProducto());
            ps.setInt(2, ing.getStock());
            ps.setInt(3, ing.getIdCategorias());
            ps.setString(4, ing.getFechaIngreso());
            ps.setInt(5, ing.getIdProveedor());
            ps.setDouble(6, ing.getPrecioCompra());
            ps.setDouble(7, ing.getPrecioVenta());
            ps.setDouble(8, ing.getImporteCompra());
            ps.setDouble(9, ing.getImporteVenta());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean insertarIngresos(Ingresos ing) {
        String SQL = "INSERT INTO ingresos (nombreProducto, stock, idCategorias, fechaIngreso, idProveedor, precioCompra, precioVenta, importeCompra, importeVenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, ing.getNombreProducto());
            ps.setInt(2, ing.getStock());
            ps.setInt(3, ing.getIdCategorias());
            ps.setString(4, ing.getFechaIngreso());
            ps.setInt(5, ing.getIdProveedor());
            ps.setDouble(6, ing.getPrecioCompra());
            ps.setDouble(7, ing.getPrecioVenta());
            ps.setDouble(8, ing.getImporteCompra());
            ps.setDouble(9, ing.getImporteVenta());
            int n = ps.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex);
            return false;
        }
    }

    public List listarIngresos() {
        List<Ingresos> lista = new ArrayList<>();
        String SQL = "SELECT * FROM ingresos";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ingresos ing = new Ingresos();
                ing.setIdIngresos(rs.getInt(1));
                ing.setNombreProducto(rs.getString(2));
                ing.setStock(rs.getInt(3));
                ing.setIdCategorias(rs.getInt(4));
                ing.setFechaIngreso(rs.getString(5));
                ing.setIdProveedor(rs.getInt(6));
                ing.setPrecioCompra(rs.getFloat(7));
                ing.setPrecioVenta(rs.getFloat(8));
                ing.setImporteCompra(rs.getFloat(9));
                ing.setImporteVenta(rs.getFloat(10));
                lista.add(ing);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public boolean buscarIngresos(Ingresos ing) {
        String SQL = "SELECT * FROM ingresos WHERE idIngresos=?";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, ing.getIdIngresos());
            rs = ps.executeQuery();
            if (rs.next()) {
                ing.setIdIngresos(rs.getInt(1));
                ing.setNombreProducto(rs.getString(2));
                ing.setStock(rs.getInt(3));
                ing.setIdCategorias(rs.getInt(4));
                ing.setFechaIngreso(rs.getString(5));
                ing.setIdProveedor(rs.getInt(6));
                ing.setPrecioCompra(rs.getFloat(7));
                ing.setPrecioVenta(rs.getFloat(8));
                ing.setImporteCompra(rs.getFloat(9));
                ing.setImporteVenta(rs.getFloat(10));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editarIngresos(Ingresos ing) {
        String SQL = "UPDATE ingresos SET nombreProducto = ?, stock = ?, idCategorias = ?, fechaIngreso = ?, idProveedor = ?, precioCompra = ?, precioVenta = ?, importeCompra = ?, importeVenta = ? WHERE idIngresos = ?";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, ing.getNombreProducto());
            ps.setInt(2, ing.getStock());
            ps.setInt(3, ing.getIdCategorias());
            ps.setString(4, ing.getFechaIngreso());
            ps.setInt(5, ing.getIdProveedor());
            ps.setDouble(6, ing.getPrecioCompra());
            ps.setDouble(7, ing.getPrecioVenta());
            ps.setDouble(8, ing.getImporteCompra());
            ps.setDouble(9, ing.getImporteVenta());
            ps.setInt(10, ing.getIdIngresos());
            int n = ps.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminarIngresos(Ingresos ing) {
        String SQL = "DELETE FROM ingresos WHERE idIngresos=?";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, ing.getIdIngresos());
            int n = ps.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        }
    }

    public boolean buscarCategorias(Categorias cat) {
        String SQL = "SELECT * FROM categorias WHERE idCategorias=?";
        try {
            con = ccat.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, cat.getIdCategorias());
            rs = ps.executeQuery();
            if (rs.next()) {
                cat.setIdCategorias(rs.getInt(1));
                cat.setCategoria(rs.getString(2));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean buscarProveedores(Proveedores pro) {
        String SQL = "SELECT * FROM proveedor WHERE idProveedor = ?";
        try {
            con = cpro.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, pro.getIdProveedor());
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setIdProveedor(rs.getInt(1));
                pro.setNombreProveedor(rs.getString(2));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
