package Control;

import Modelado.Conexion;
import Modelado.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlVentas {

    Connection con;
    Conexion cven = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean reinicioVentas(Ventas ven) {
        String resetSQL = "ALTER TABLE ventas AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO ventas (numVenta, idClientes, fechaVenta, subtotal, igv, total) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            con = cven.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, ven.getNumVenta());
            ps.setInt(2, ven.getIdClientes());
            ps.setString(3, ven.getFechaVenta());
            ps.setDouble(4, ven.getSubtotal());
            ps.setDouble(5, ven.getIgv());
            ps.setDouble(6, ven.getTotal());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean registrarVentas(Ventas ven) {
        String SQL = "INSERT INTO ventas (numVenta, idClientes, fechaVenta, subtotal, igv, total) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            con = cven.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, ven.getNumVenta());
            ps.setInt(2, ven.getIdClientes());
            ps.setString(3, ven.getFechaVenta());
            ps.setDouble(4, ven.getSubtotal());
            ps.setDouble(5, ven.getIgv());
            ps.setDouble(6, ven.getTotal());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
            return false;
        }
    }

    public List listarVentas() {
        List<Ventas> lista = new ArrayList<>();
        String SQL = "SELECT * FROM ventas";
        try {
            con = cven.conectar();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ventas ven = new Ventas();
                ven.setIdVentas(rs.getInt(1));
                ven.setNumVenta(rs.getString(2));
                ven.setIdClientes(rs.getInt(3));
                ven.setFechaVenta(rs.getString(4));
                ven.setSubtotal(rs.getFloat(5));
                ven.setIgv(rs.getFloat(6));
                ven.setTotal(rs.getFloat(7));
                lista.add(ven);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public String numVenta() {
        String sql = "SELECT MAX(CAST(numVenta AS UNSIGNED)) FROM ventas";
        try {
            con = cven.conectar();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el número de venta: " + ex.getMessage());
        }
        return null;
    }
}
