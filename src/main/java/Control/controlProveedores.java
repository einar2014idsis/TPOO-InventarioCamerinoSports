package Control;

import Modelado.Conexion;
import Modelado.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class controlProveedores {

    Connection con;
    Conexion cpro = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean reinicioProveedores(Proveedores pro) {
        String resetSQL = "ALTER TABLE proveedor AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO proveedor (nombreProveedor, rucProveedor, telefonoProveedor, direccionProveedor, correoProveedor) VALUES (?, ?, ?, ?, ?)";

        try {
            con = cpro.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, pro.getNombreProveedor());
            ps.setString(2, pro.getRucProveedor());
            ps.setInt(3, pro.getTelefonoProveedor());
            ps.setString(4, pro.getDireccionProveedor());
            ps.setString(5, pro.getCorreoProveedor());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean insertarProveedores(Proveedores pro) {
        String SQL = "INSERT INTO proveedor (nombreProveedor, rucProveedor, telefonoProveedor, direccionProveedor, correoProveedor) VALUES (?, ?, ?, ?, ?)";
        try {
            con = cpro.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, pro.getNombreProveedor());
            ps.setString(2, pro.getRucProveedor());
            ps.setInt(3, pro.getTelefonoProveedor());
            ps.setString(4, pro.getDireccionProveedor());
            ps.setString(5, pro.getCorreoProveedor());
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

    public List listarProveedores() {
        List<Proveedores> lista = new ArrayList<>();
        String SQL = "SELECT * FROM proveedor";
        try {
            con = cpro.conectar();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedores cli = new Proveedores();
                cli.setIdProveedor(rs.getInt(1));
                cli.setNombreProveedor(rs.getString(2));
                cli.setRucProveedor(rs.getString(3));
                cli.setTelefonoProveedor(rs.getInt(4));
                cli.setDireccionProveedor(rs.getString(5));
                cli.setCorreoProveedor(rs.getString(6));
                lista.add(cli);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public boolean buscarProveedores(Proveedores pro) {
        String SQL = "SELECT * FROM proveedor WHERE rucProveedor = ?";
        try {
            con = cpro.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, pro.getRucProveedor());
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setIdProveedor(rs.getInt(1));
                pro.setNombreProveedor(rs.getString(2));
                pro.setRucProveedor(rs.getString(3));
                pro.setTelefonoProveedor(rs.getInt(4));
                pro.setDireccionProveedor(rs.getString(5));
                pro.setCorreoProveedor(rs.getString(6));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editarProveedores(Proveedores pro) {
        String SQL = "UPDATE proveedor SET nombreProveedor=?, telefonoProveedor=?, direccionProveedor=?, correoProveedor=? WHERE rucProveedor=?";
        try {
            con = cpro.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, pro.getNombreProveedor());
            ps.setInt(2, pro.getTelefonoProveedor());
            ps.setString(3, pro.getDireccionProveedor());
            ps.setString(4, pro.getCorreoProveedor());
            ps.setString(5, pro.getRucProveedor());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarProveedores(Proveedores pro) {
        String SQL = "DELETE FROM proveedor WHERE rucProveedor=?";
        try {
            con = cpro.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, pro.getRucProveedor());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        }
    }
}
