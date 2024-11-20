package Control;

import Modelado.Conexion;
import Modelado.Ingresos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlIngresos {

    Connection con;
    Conexion cing = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean reinicioIngresos(Ingresos ing) {
        String resetSQL = "ALTER TABLE ingresos AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO ingresos (nombreProducto, stock, tallaNumero, idCategorias, fechaIngreso, idProveedor, precioCompra, precioVenta, importeCompra, importeVenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, ing.getNombreProducto());
            ps.setInt(2, ing.getStock());
            ps.setString(3, ing.getTallaNumero());
            ps.setInt(4, ing.getIdCategorias());
            ps.setString(5, ing.getFechaIngreso());
            ps.setInt(6, ing.getIdProveedor());
            ps.setDouble(7, ing.getPrecioCompra());
            ps.setDouble(8, ing.getPrecioVenta());
            ps.setDouble(9, ing.getImporteCompra());
            ps.setDouble(10, ing.getImporteVenta());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean insertarIngresos(Ingresos ing) {
        String SQL = "INSERT INTO ingresos (nombreProducto, stock, tallaNumero, idCategorias, fechaIngreso, idProveedor, precioCompra, precioVenta, importeCompra, importeVenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, ing.getNombreProducto());
            ps.setInt(2, ing.getStock());
            ps.setString(3, ing.getTallaNumero());
            ps.setInt(4, ing.getIdCategorias());
            ps.setString(5, ing.getFechaIngreso());
            ps.setInt(6, ing.getIdProveedor());
            ps.setDouble(7, ing.getPrecioCompra());
            ps.setDouble(8, ing.getPrecioVenta());
            ps.setDouble(9, ing.getImporteCompra());
            ps.setDouble(10, ing.getImporteVenta());
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
                ing.setTallaNumero(rs.getString(4));
                ing.setIdCategorias(rs.getInt(5));
                ing.setFechaIngreso(rs.getString(6));
                ing.setIdProveedor(rs.getInt(7));
                ing.setPrecioCompra(rs.getFloat(8));
                ing.setPrecioVenta(rs.getFloat(9));
                ing.setImporteCompra(rs.getFloat(10));
                ing.setImporteVenta(rs.getFloat(11));
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
                ing.setTallaNumero(rs.getString(4));
                ing.setIdCategorias(rs.getInt(5));
                ing.setFechaIngreso(rs.getString(6));
                ing.setIdProveedor(rs.getInt(7));
                ing.setPrecioCompra(rs.getFloat(8));
                ing.setPrecioVenta(rs.getFloat(9));
                ing.setImporteCompra(rs.getFloat(10));
                ing.setImporteVenta(rs.getFloat(11));
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
        String SQL = "UPDATE ingresos SET nombreProducto = ?, stock = ?, tallaNumero = ?, idCategorias = ?, fechaIngreso = ?, idProveedor = ?, precioCompra = ?, precioVenta = ?, importeCompra = ?, importeVenta = ? WHERE idIngresos = ?";
        try {
            con = cing.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, ing.getNombreProducto());
            ps.setInt(2, ing.getStock());
            ps.setString(3, ing.getTallaNumero());
            ps.setInt(4, ing.getIdCategorias());
            ps.setString(5, ing.getFechaIngreso());
            ps.setInt(6, ing.getIdProveedor());
            ps.setDouble(7, ing.getPrecioCompra());
            ps.setDouble(8, ing.getPrecioVenta());
            ps.setDouble(9, ing.getImporteCompra());
            ps.setDouble(10, ing.getImporteVenta());
            ps.setInt(11, ing.getIdIngresos());
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
}
