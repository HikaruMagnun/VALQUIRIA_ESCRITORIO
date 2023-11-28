package valquiria.desktop_hotel.Implements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import valquiria.desktop_hotel.Interface.HuespedDAO;
import valquiria.desktop_hotel.Modelo.persona;

public class huespedCRUD implements HuespedDAO {
    private final conexion postgres = new conexion();
    private final Connection cn = postgres.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public int totalregistros;

    @Override
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = { "Nombres", "Apellidos", "T. Doc", "N° Doc", "Direccion", "Telefono", "Correo" };
        String[] registro = new String[9];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * FROM clientes where nombre like '%" + buscar + "%' order by nro_doc";

        try {
            Statement st = cn.createStatement();
            ResultSet resultSet = st.executeQuery(sSQL);

            while (resultSet.next()) {
                registro[0] = resultSet.getString("nombre");
                registro[1] = resultSet.getString("apellido");
                registro[2] = resultSet.getString("tipo_documento");
                registro[3] = resultSet.getString("nro_doc");
                registro[4] = resultSet.getString("direccion");
                registro[5] = resultSet.getString("numero_telefono");
                registro[6] = resultSet.getString("correo");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    @Override
    public boolean insertar(persona dts) {
        String sql = "INSERT INTO clientes (nro_doc, tipo_documento,nombre, apellido,correo,numero_telefono,direccion) VALUES (?, ?, ?, ?, ?,?,?)";

        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setLong(1, dts.getNumero_documento());
            statement.setString(2, dts.getTipo_doc());
            statement.setString(3, dts.getNombre());
            statement.setString(4, dts.getApellidos());
            statement.setString(5, dts.getCorreo());
            statement.setString(6, dts.getDireccion());
            statement.setString(7, dts.getTelefono());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Persona insertada correctamente.");
                return true;
            } else {
                System.out.println("No se pudo insertar la persona.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /*
     * @Override
     * public boolean editar(huesped dts){
     * sSQL = "update persona set nombre=?, apaterno= ?, tipo_documento=?, "
     * + "numero_documento=?, direccion=?, telefono=?,correo=? "+
     * " where idpersona=?";
     * sSQL2="update cliente set  cod_cliente=?"+
     * "  where idpersona=?";
     * try {
     * PreparedStatement pst=cn.prepareStatement(sSQL);
     * PreparedStatement pst2=cn.prepareStatement(sSQL2);
     * pst.setString(1,dts.getNombre());
     * pst.setString(2,dts.getApaterno());
     * pst.setString(3,dts.getTipo_documento());
     * pst.setString(4,dts.getNumero_documento());
     * pst.setString(5,dts.getDireccion());
     * pst.setString(6,dts.getTelefono());
     * pst.setString(7,dts.getCorreo());
     * pst.setInt(8,dts.getIdpersona());
     * 
     * pst2.setString(1,dts.getCodigo());
     * pst2.setInt(2,dts.getIdpersona());
     * 
     * int n=pst.executeUpdate();
     * 
     * if (n!=0) {
     * int n2= pst2.executeUpdate();
     * if(n2 !=0){
     * return true;
     * }else{
     * return false;
     * }
     * } else {
     * return false;
     * }
     * 
     * } catch (SQLException e) {
     * JOptionPane.showConfirmDialog(null, e);
     * return false;
     * }
     * }
     * 
     * @Override
     * public boolean eliminar (huesped dts){
     * sSQL = "delete from cliente where idpersona=?";
     * sSQL2 = "delete from persona where idpersona=?";
     * try {
     * 
     * PreparedStatement pst=cn.prepareStatement(sSQL);
     * PreparedStatement pst2=cn.prepareStatement(sSQL2);
     * pst.setInt(1,dts.getIdpersona());
     * pst2.setInt(1,dts.getIdpersona());
     * 
     * int n=pst.executeUpdate();
     * 
     * if (n!=0) {
     * int n2= pst2.executeUpdate();
     * if(n2 !=0){
     * return true;
     * }else{
     * return false;
     * }
     * } else {
     * return false;
     * }
     * 
     * } catch (SQLException e) {
     * JOptionPane.showConfirmDialog(null, e);
     * return false;
     * }
     * }
     */
    public String filtrarCliente(int codCliente) {

        String sql = "SELECT nombre, apellido FROM clientes WHERE nro_doc = ?";

        try (PreparedStatement statement = cn.prepareStatement(sql)) {
            statement.setLong(1, codCliente);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellido: " + apellido);
                    return nombre + " " + apellido;
                } else {
                    System.out.println("Cliente no encontrado");
                }
            }
        } catch (SQLException ex) {
        }
        return "";
    }

    @Override
    public boolean eliminar(Long dts) {

        String sql = "DELETE FROM clientes WHERE nro_doc = ?";
        try {
            PreparedStatement statement = cn.prepareStatement(sql);

            statement.setLong(1, dts);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente eliminado correctamente.");
                return true;
            } else {
                System.out.println("No se encontró un cliente con el número de documento proporcionado.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editar(persona dts, Long id) {
        String sql = "UPDATE clientes SET nro_doc = ?,nombre = ?, apellido = ?, correo = ?, tipo_documento = ?, numero_telefono = ?, direccion = ? WHERE nro_doc = ?";

        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setLong(1, dts.getNumero_documento());
            statement.setString(2, dts.getNombre());
            statement.setString(3, dts.getApellidos());
            statement.setString(4, dts.getCorreo());
            statement.setString(5, dts.getTipo_doc());
            statement.setString(6, dts.getTelefono());
            statement.setString(7, dts.getDireccion());
            statement.setLong(8, id);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente actualizado correctamente.");
                return true;
            } else {
                System.out.println("No se encontró un cliente con el número de documento proporcionado.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
