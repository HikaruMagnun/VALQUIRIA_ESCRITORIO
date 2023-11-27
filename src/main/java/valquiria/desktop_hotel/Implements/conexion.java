package Implements;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    String url = "jdbc:postgresql://db.swgwmakcrwpgjfeiysse.supabase.co:5432/postgres";
        String usuario = "postgres";
        String contraseña = "BB8IBRjM33aELU8g";
    
    public conexion(){
    }
    
    public Connection conectar(){
        Connection link=null;
            
        try {
            Class.forName("org.postgresql.Driver");
            link=DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null,e);
        }
        return link;
    }
    
    public static void main(String[] args) {
        conexion prueba = new conexion();
        Connection conexion = prueba.conectar();

        if (conexion != null) {
            System.out.println("Conexión exitosa a la base de datos.");
            // Realiza más operaciones con la conexión si es necesario
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}
