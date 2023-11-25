package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection connection = null;

    public static Connection conectar() {
        if (connection != null) {
            return connection;
        }

        String url = "jdbc:postgresql://db.swgwmakcrwpgjfeiysse.supabase.co:5432/postgres";
        String usuario = "postgres";
        String contrasena = "BB8IBRjM33aELU8g";

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa a la base de datos pe causaaaa gaaaaaaa.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al cargar el controlador de PostgreSQL: " + e.getMessage());
        } catch (SQLException e) {
            e.getStackTrace();
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        return connection;
    }

    public static void cerrarConexion() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
}