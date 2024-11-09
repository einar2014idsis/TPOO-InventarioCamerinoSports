package Control;

import Modelado.Categorias;
import java.sql.Connection;
import Modelado.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlCategorias {

    Connection con;
    Conexion ccat = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean reinicioCategorias(Categorias cat) {
        String resetSQL = "ALTER TABLE categorias AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO categorias (categorias) VALUES (?)";

        try {
            con = ccat.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, cat.getCategoria());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean insertarCategorias(Categorias cat) {
        String SQL = "INSERT INTO categorias (categorias) VALUES (?)";
        try {
            con = ccat.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, cat.getCategoria());
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

    public List listarCategorias() {
        List<Categorias> lista = new ArrayList<>();
        String SQL = "SELECT * FROM categorias";
        try {
            con = ccat.conectar();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categorias cat = new Categorias();
                cat.setIdCategorias(rs.getInt(1));
                cat.setCategoria(rs.getString(2));
                lista.add(cat);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public boolean editarCategorias(Categorias cat) {
        String SQL = "UPDATE categorias SET categorias=? WHERE idCategorias=?";
        try {
            con = ccat.conectar();
            ps = con.prepareStatement(SQL);
            ps.setString(1, cat.getCategoria());
            ps.setInt(2, cat.getIdCategorias());
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

    public boolean eliminarCategorias(Categorias cat) {
        String SQL = "DELETE FROM categorias WHERE idCategorias=?";
        try {
            con = ccat.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, cat.getIdCategorias());
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
}
