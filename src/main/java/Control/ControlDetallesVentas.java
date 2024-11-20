package Control;

import Modelado.Conexion;
import Modelado.DetallesVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean registrarDeVentas(int idVentas, int idIngresos, int stockSalida, double importe) {
        String SQL = "INSERT INTO detallesVenta (idVentas, idIngresos, cantidad, importe) VALUES (?, ?, ?, ?)";

        try {
            con = cdv.conectar();  // Establece la conexión con la base de datos
            ps = con.prepareStatement(SQL);

            // Establece los valores en la consulta
            ps.setInt(1, idVentas);  // idVentas es un entero
            ps.setInt(2, idIngresos);  // idIngresos es un entero
            ps.setInt(3, stockSalida);  // cantidad (int)
            ps.setDouble(4, importe);  // importe (decimal), se usa setDouble porque es un valor decimal

            int n = ps.executeUpdate();  // Ejecuta la consulta

            return n != 0;  // Devuelve verdadero si la inserción fue exitosa
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);  // Muestra el error si ocurre
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
}
