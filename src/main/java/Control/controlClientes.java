package Control;

import Modelado.Clientes;
import Modelado.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlClientes {

    Connection con;
    Conexion ccli = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean reinicioClientes(Clientes cli) {
        String resetSQL = "ALTER TABLE clientes AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO clientes (nombreCliente, apellidoCliente, dniCliente, rucCliente, telefonoCliente) VALUES (?, ?, ?, ?, ?)";

        try {
            con = ccli.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, cli.getNombreCliente());
            ps.setString(2, cli.getApellidoCliente());
            ps.setInt(3, cli.getDniCliente());
            ps.setString(4, cli.getRucCliente());
            ps.setInt(5, cli.getTelefonoCliente());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean insertarClientes(Clientes cli) {
        String SQL = "INSERT INTO clientes (nombreCliente, apellidoCliente, dniCliente, rucCliente, telefonoCliente) VALUES (?, ?, ?, ?, ?)";
        try {
            con = ccli.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, cli.getNombreCliente());
            ps.setString(2, cli.getApellidoCliente());
            ps.setInt(3, cli.getDniCliente());
            ps.setString(4, cli.getRucCliente());
            ps.setInt(5, cli.getTelefonoCliente());
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

    public List listarClientes() {
        List<Clientes> lista = new ArrayList<>();
        String SQL = "SELECT * FROM clientes";
        try {
            con = ccli.conectar();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Clientes cli = new Clientes();
                cli.setIdClientes(rs.getInt(1));
                cli.setNombreCliente(rs.getString(2));
                cli.setApellidoCliente(rs.getString(3));
                cli.setDniCliente(rs.getInt(4));
                cli.setRucCliente(rs.getString(5));
                cli.setTelefonoCliente(rs.getInt(6));
                lista.add(cli);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public boolean buscarClientes(Clientes cli) {
        String SQL = "SELECT * FROM clientes WHERE dniCliente=? OR rucCliente=?";
        try {
            con = ccli.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, cli.getDniCliente());
            ps.setString(2, cli.getRucCliente());
            rs = ps.executeQuery();
            if (rs.next()) {
                cli.setIdClientes(rs.getInt(1));
                cli.setNombreCliente(rs.getString(2));
                cli.setApellidoCliente(rs.getString(3));
                cli.setDniCliente(rs.getInt(4));
                cli.setRucCliente(rs.getString(5));
                cli.setTelefonoCliente(rs.getInt(6));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editarClientes(Clientes cli) {
        String SQL = "UPDATE clientes SET nombreCliente=?, apellidoCliente=?, telefonoCliente=? WHERE dniCliente=? OR rucCliente=?";
        try {
            con = ccli.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, cli.getNombreCliente());
            ps.setString(2, cli.getApellidoCliente());
            ps.setInt(3, cli.getTelefonoCliente());
            ps.setInt(4, cli.getDniCliente());
            ps.setString(5, cli.getRucCliente());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarClientes(Clientes cli) {
        String SQL = "DELETE FROM clientes WHERE dniCliente=? OR rucCliente=?";
        try {
            con = ccli.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, cli.getDniCliente());
            ps.setString(2, cli.getRucCliente());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        }
    }
}
