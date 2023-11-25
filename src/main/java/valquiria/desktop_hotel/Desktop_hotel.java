package valquiria.desktop_hotel;

import Modelo.Conexion;
import java.sql.Connection;

public class Desktop_hotel {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //RENOVAR EL CODIGO
        
        // Llamando al método conectar() desde la clase Conexion
        Connection conexion = Conexion.conectar();

        Conexion.cerrarConexion();
    }
    //comentario nuevo   
}
