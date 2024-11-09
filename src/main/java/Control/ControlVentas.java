package Control;

import Modelado.Conexion;
import Modelado.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlVentas {

    Connection con;
    Conexion cven = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

   // public boolean reinicioVentas(Ventas ven) {
     //   String resetSQL = "ALTER TABLE ventas AUTO_INCREMENT = 1";
       // String insertSQL = "INSERT INTO ventas (idIngresos, idClientes, cantidad, fechaVenta, subtotal, igv, total) VALUES (?, ?, ?, ?, ?, ?, ?)";

        //try {
          //  con = cven.conectar();
            //ps = con.prepareStatement(resetSQL);
         //   ps.executeUpdate();
         //   ps = con.prepareStatement(insertSQL);
         //   ps.setInt(1, ven.getIdIngresos());
         //   ps.setInt(2, ven.getIdClientes());
         //   ps.setInt(3, ven.getCantidad());
         //   ps.setString(4, ven.getFechaVenta());
         //   ps.setDouble(5, ven.getSubtotal());
          //  ps.setDouble(6, ven.getIgv());
          //  ps.setDouble(7, ven.getTotal());
          //  int n = ps.executeUpdate();

            //return n != 0;
        //} catch (Exception ex) {
         //   JOptionPane.showMessageDialog(null, ex);
          //  return false;
        //}
    //}

    public boolean registrarVentas(Ventas ven) {
        String SQL = "INSERT INTO ventas (idIngresos, idClientes, cantidad, fechaVenta, subtotal, igv, total) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            con = cven.conectar();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, ven.getIdIngresos());
            ps.setInt(2, ven.getIdClientes());
            ps.setInt(3, ven.getCantidad());
            ps.setString(4, ven.getFechaVenta());
            ps.setDouble(5, ven.getSubtotal());
            ps.setDouble(6, ven.getIgv());
            ps.setDouble(7, ven.getTotal());
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
                ven.setIdIngresos(rs.getInt(2));
                ven.setIdClientes(rs.getInt(3));
                ven.setCantidad(rs.getInt(4));
                ven.setFechaVenta(rs.getString(5));
                ven.setSubtotal(rs.getFloat(6));
                ven.setIgv(rs.getFloat(7));
                ven.setTotal(rs.getFloat(8));
                lista.add(ven);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
}
