package Control;

import Modelado.Conexion;
import Modelado.DetallesVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlDetallesVentas {

    Connection con;
    Conexion cdv = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean reinicioDeVentas(DetallesVentas dv) {
        String resetSQL = "ALTER TABLE detallesVenta AUTO_INCREMENT = 1";
        String insertSQL = "INSERT INTO detallesVenta (idVentas, idIngresos, cantidad, importe) VALUES (?, ?, ?, ?)";

        try {
            con = cdv.conectar();
            ps = con.prepareStatement(resetSQL);
            ps.executeUpdate();
            ps = con.prepareStatement(insertSQL);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdIngresos());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getImporte());
            int n = ps.executeUpdate();

            return n != 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean registrarDeVentas(int idVentas, int idIngresos, int stockSalida, double importe) {
        String SQL = "INSERT INTO detallesVenta (idVentas, idIngresos, cantidad, importe) VALUES (?, ?, ?, ?)";

        try {
            con = cdv.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, idVentas);
            ps.setInt(2, idIngresos);
            ps.setInt(3, stockSalida);
            ps.setDouble(4, importe);
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public List listarDeVentas() {
        List<DetallesVentas> lista = new ArrayList<>();
        String SQL = "SELECT * FROM ventas";
        try {
            con = cdv.conectar();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetallesVentas dv = new DetallesVentas();
                dv.setIdVentas(rs.getInt(1));
                dv.setIdIngresos(rs.getInt(2));
                dv.setCantidad(rs.getInt(4));
                dv.setImporte(rs.getFloat(5));
                lista.add(dv);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
}
