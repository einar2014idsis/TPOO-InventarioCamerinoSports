package Control;

import java.sql.Connection;
import Modelado.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelado.Usuarios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlUsuarios {

    Connection con;
    Conexion cusu = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Usuarios login(String lUsuario, String lContraseña) {
        Usuarios us = new Usuarios();
        String SQL = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = SHA2(?, 256)";
        try {
            con = cusu.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, lUsuario);
            ps.setString(2, lContraseña);

            rs = ps.executeQuery();
            while (rs.next()) {
                us.setIdUsuario(rs.getInt(1));
                us.setNombreUsuario(rs.getString(2));
                us.setApellidoUsuario(rs.getString(3));
                us.setGeneroUsuario(rs.getString(4));
                us.setDniUsuario(rs.getInt(5));
                us.setDireccionUsuario(rs.getString(6));
                us.setTelefonoUsuario(rs.getInt(7));
                us.setTipoDeUsuario(rs.getString(8));
                us.setFechaInicio(rs.getString(9));
                us.setFechaNacimiento(rs.getString(10));
                us.setUsuario(rs.getString(11));
                us.setContraseña(rs.getString(12));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return us;
    }

    public boolean reinicioUsuarios(Usuarios usu) {
        String resetSQL = "ALTER TABLE usuarios AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO usuarios (nombreUsuario, apellidoUsuario, generoUsuario, dniUsuario, direccionUsuario, telefonoUsuario, tipoUsuario, fechaInicio, fechaNacimiento, usuario, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con = cusu.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, usu.getNombreUsuario());
            ps.setString(2, usu.getApellidoUsuario());
            ps.setString(3, usu.getGeneroUsuario());
            ps.setInt(4, usu.getDniUsuario());
            ps.setString(5, usu.getDireccionUsuario());
            ps.setInt(6, usu.getTelefonoUsuario());
            ps.setString(7, usu.getTipoDeUsuario());
            ps.setString(8, usu.getFechaInicio());
            ps.setString(9, usu.getFechaNacimiento());
            ps.setString(10, usu.getUsuario());
            ps.setString(11, usu.getContraseña());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean insertarUsuarios(Usuarios usu) {
        String SQL = "INSERT INTO usuarios (nombreUsuario, apellidoUsuario, generoUsuario, dniUsuario, direccionUsuario, telefonoUsuario, tipoUsuario, fechaInicio, fechaNacimiento, usuario, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, SHA2(?, 256))";
        try {
            con = cusu.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, usu.getNombreUsuario());
            ps.setString(2, usu.getApellidoUsuario());
            ps.setString(3, usu.getGeneroUsuario());
            ps.setInt(4, usu.getDniUsuario());
            ps.setString(5, usu.getDireccionUsuario());
            ps.setInt(6, usu.getTelefonoUsuario());
            ps.setString(7, usu.getTipoDeUsuario());
            ps.setString(8, usu.getFechaInicio());
            ps.setString(9, usu.getFechaNacimiento());
            ps.setString(10, usu.getUsuario());
            ps.setString(11, usu.getContraseña());
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

    public List listarUsuarios() {
        List<Usuarios> lista = new ArrayList<>();
        String SQL = "SELECT * FROM usuarios";
        try {
            con = cusu.conectar();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios us = new Usuarios();
                us.setIdUsuario(rs.getInt(1));
                us.setNombreUsuario(rs.getString(2));
                us.setApellidoUsuario(rs.getString(3));
                us.setGeneroUsuario(rs.getString(4));
                us.setDniUsuario(rs.getInt(5));
                us.setDireccionUsuario(rs.getString(6));
                us.setTelefonoUsuario(rs.getInt(7));
                us.setTipoDeUsuario(rs.getString(8));
                us.setFechaInicio(rs.getString(9));
                us.setFechaNacimiento(rs.getString(10));
                us.setUsuario(rs.getString(11));
                us.setContraseña(rs.getString(12));
                lista.add(us);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public boolean buscarUsuarios(Usuarios usu) {
        String SQL = "SELECT * FROM usuarios WHERE dniUsuario = ?";
        try {
            con = cusu.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, usu.getDniUsuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                usu.setIdUsuario(rs.getInt(1));
                usu.setNombreUsuario(rs.getString(2));
                usu.setApellidoUsuario(rs.getString(3));
                usu.setGeneroUsuario(rs.getString(4));
                usu.setDniUsuario(rs.getInt(5));
                usu.setDireccionUsuario(rs.getString(6));
                usu.setTelefonoUsuario(rs.getInt(7));
                usu.setTipoDeUsuario(rs.getString(8));
                usu.setFechaInicio(rs.getString(9));
                usu.setFechaNacimiento(rs.getString(10));
                usu.setUsuario(rs.getString(11));
                usu.setContraseña(rs.getString(12));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editarUsuarios(Usuarios usu) {
        String SQL = "UPDATE usuarios SET nombreUsuario = ?, apellidoUsuario = ?, generoUsuario = ?, direccionUsuario = ?, telefonoUsuario = ?, tipoUsuario = ?, fechaInicio = ?, fechaNacimiento = ?, usuario = ?, contraseña = ? OR dniUsuario = ?";
        try {
            con = cusu.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, usu.getNombreUsuario());
            ps.setString(2, usu.getApellidoUsuario());
            ps.setString(3, usu.getGeneroUsuario());
            ps.setInt(4, usu.getDniUsuario());
            ps.setString(5, usu.getDireccionUsuario());
            ps.setInt(6, usu.getTelefonoUsuario());
            ps.setString(7, usu.getTipoDeUsuario());
            ps.setString(8, usu.getFechaInicio());
            ps.setString(9, usu.getFechaNacimiento());
            ps.setString(10, usu.getUsuario());
            ps.setString(11, usu.getContraseña());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarUsuarios(Usuarios usu) {
        String SQL = "DELETE FROM usuarios WHERE dniCliente = ?";
        try {
            con = cusu.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, usu.getNombreUsuario());
            ps.setString(2, usu.getApellidoUsuario());
            ps.setString(3, usu.getGeneroUsuario());
            ps.setInt(4, usu.getDniUsuario());
            ps.setString(5, usu.getDireccionUsuario());
            ps.setInt(6, usu.getTelefonoUsuario());
            ps.setString(7, usu.getTipoDeUsuario());
            ps.setString(8, usu.getFechaInicio());
            ps.setString(9, usu.getFechaNacimiento());
            ps.setString(10, usu.getUsuario());
            ps.setString(11, usu.getContraseña());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        }
    }
}
