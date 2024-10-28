package Modelado;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con;
    String bd = "inventariocamerinosports";
    String url = "jdbc:mysql://127.0.0.1/" + bd;
    String user = "root";
    String pass = "";

    public Connection conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return con;
    }
}
