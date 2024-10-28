package Control;

import java.sql.Connection;
import Modelado.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelado.Usuarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class controlUsuarios {

    Connection con;
    Conexion cu = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Usuarios login(String lUsuario, String lContraseña) {
        Usuarios us = new Usuarios();
        String SQL = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = SHA2(?, 256)";
        try {
            con = cu.conectar();
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
                us.setCorreoUsuario(rs.getString(8));
                us.setTipoDeUsuario(rs.getString(9));
                us.setFechaInicio(rs.getString(10));
                us.setFechaNacimiento(rs.getString(11));
                us.setUsuario(rs.getString(12));
                us.setContraseña(rs.getString(13));
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
}
