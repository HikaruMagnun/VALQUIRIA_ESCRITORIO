package valquiria.desktop_hotel.Implements;

import valquiria.desktop_hotel.Interface.ProductoDAO;
import valquiria.desktop_hotel.Modelo.producto;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class productoCRUD implements ProductoDAO {

    private final valquiria.desktop_hotel.Implements.conexion mysql = new valquiria.desktop_hotel.Implements.conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    public int totalregistros;

    @Override
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = { "ID", "Nombre", "Descripcion", "Tipo", "Precio Uninad", "Marca", "Stock" };
        String[] registro = new String[7];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "Select * from producto where nombre like '%" + buscar + "%' order by nombre";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idproducto");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("descripcion");
                registro[3] = rs.getString("tipo_producto");
                registro[4] = rs.getString("precio_unidad");
                registro[5] = rs.getString("marca");
                registro[6] = rs.getString("stock");

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
    public boolean insertar(producto dts) {
        sSQL = "insert  into producto (nombre,descripcion,tipo_producto,precio_unidad,marca,stock)" +
                "values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getTipo());
            pst.setDouble(4, dts.getPrecio());
            pst.setString(5, dts.getMarca());
            pst.setInt(6, dts.getStock());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    @Override
    public boolean editar(producto dts) {
        sSQL = "update producto set nombre=?, marca= ?, descripcion=?, tipo_producto=?, "
                + "precio_unidad=?, stock=? " + " where idproducto=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getMarca());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getTipo());
            pst.setDouble(5, dts.getPrecio());
            pst.setInt(6, dts.getStock());
            pst.setInt(7, dts.getIdProducto());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    @Override
    public boolean eliminar(producto dts) {
        sSQL = "delete from producto where idproducto=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, String.valueOf(dts.getIdProducto()));

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    @Override
    public Object filtrar(String buscar) {

        String[] registro = new String[7];
        totalregistros = 0;

        sSQL = "Select * from producto where idproducto = '" + buscar + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idproducto");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("descripcion");
                registro[3] = rs.getString("tipo_producto");
                registro[4] = rs.getString("precio_unidad");
                registro[5] = rs.getString("marca");
                registro[6] = rs.getString("stock");
            }
            return registro;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}