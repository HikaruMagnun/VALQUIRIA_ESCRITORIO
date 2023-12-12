package valquiria.desktop_hotel.DAOImpl;

import valquiria.desktop_hotel.Modelo.Servicio;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import valquiria.desktop_hotel.DAO.ServicioDAO;

public class ServicioDAOImpl implements ServicioDAO {

    private final valquiria.desktop_hotel.DAOImpl.conexion mysql = new valquiria.desktop_hotel.DAOImpl.conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    public int totalregistros;

    @Override
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = { "ID Solicitud", "ID Alojam.", "Cliente", "Nro Doc", "Habitacion", "Servicio", "Cantidad",
                "Estado" };
        String[] registro = new String[8];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        String sql = "SELECT\n" +
                "    ss.id, " +
                "    ss.id_alojamiento, " +
                "    c.nombre as nombre_cliente,\n" +
                "    c.nro_doc as nro_doc,\n" +
                "    h.codigo_habitacion,\n" +
                "    s.descripcion,\n" +
                "    ss.cantidad,\n" +
                "    ss.estado\n" +
                "FROM\n" +
                "    public.servicios_solicitados ss\n" +
                "JOIN\n" +
                "    public.alojamientos a ON ss.id_alojamiento = a.id\n" +
                "JOIN\n" +
                "    public.clientes c ON a.id_cliente = c.nro_doc\n" +
                "JOIN\n" +
                "    public.habitaciones h ON a.id_habitacion = h.codigo_habitacion\n" +
                "JOIN\n" +
                "    public.servicios s ON ss.id_servicio = s.id where CAST(h.codigo_habitacion AS VARCHAR) like '%"
                + buscar + "%'";

        try {
            Statement st = cn.createStatement();
            ResultSet resultSet = st.executeQuery(sql);

            while (resultSet.next()) {
                registro[0] = resultSet.getString("id");
                registro[1] = resultSet.getString("id_alojamiento");
                registro[2] = resultSet.getString("nombre_cliente");
                registro[3] = String.valueOf(resultSet.getInt("nro_doc"));
                registro[4] = String.valueOf(resultSet.getInt("codigo_habitacion"));
                registro[5] = resultSet.getString("descripcion");
                registro[6] = String.valueOf(resultSet.getInt("cantidad"));
                registro[7] = resultSet.getBoolean("estado") ? "Culminado" : "Pendiente";
                ;

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
    public boolean insertar(int idServicio, int idAlojamiento) {

        String sql = "INSERT INTO public.servicios_solicitados (id_servicio, id_alojamiento) VALUES (?, ?)";
        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setInt(1, idServicio);
            statement.setInt(2, idAlojamiento);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editar(Boolean nuevoEstado, int idServicio, int id_alojamiento, int id) {

        String sql = "UPDATE public.servicios_solicitados SET estado = ?,id_alojamiento=?,id_servicio=? WHERE id = ?";

        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setBoolean(1, nuevoEstado);
            statement.setInt(2, id_alojamiento);
            statement.setInt(3, idServicio);
            statement.setInt(4, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {

        String sql = "DELETE FROM public.servicios_solicitados WHERE id = ?";
        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
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

    public boolean crearServicio(Servicio servicio) {
        String sql = "INSERT INTO public.servicios (descripcion, precio, tipo_servicio) VALUES (?, ?, ?)";

        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setString(1, servicio.getDescripcion());
            statement.setDouble(2, servicio.getPrecio());
            statement.setString(3, servicio.getTipo_servicio());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public DefaultTableModel mostrarTipoServicios() {
        DefaultTableModel modelo;
        String[] titulos = { "ID", "Tipo", "Precio", "Descripcion" };
        String[] registro = new String[4];
        modelo = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM public.servicios";

        try {

            Statement statement = cn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                registro[0] = String.valueOf(resultSet.getInt("id"));
                registro[1] = resultSet.getString("tipo_servicio");
                registro[2] = String.valueOf(resultSet.getFloat("precio"));
                registro[3] = resultSet.getString("descripcion");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean actualizarTipoServicio(Servicio servicio) {
        String sql = "UPDATE public.servicios SET descripcion = ?, precio = ? ,tipo_servicio=? WHERE id = ?";
        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setString(1, servicio.getDescripcion());
            statement.setDouble(2, servicio.getPrecio());
            statement.setString(3, servicio.getTipo_servicio());
            statement.setInt(4, servicio.getId());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminarServicioTipo(int id) {

        String sql = "DELETE FROM public.servicios WHERE id = ?";
        try (PreparedStatement statement = cn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Servicio> obtenerTiposServiciosDesdeBD() {
        List<Servicio> tiposServicios = new ArrayList<>();

        String sql = "SELECT DISTINCT id,tipo_servicio FROM public.servicios";
        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Servicio s = new Servicio();
                s.setId(resultSet.getInt("id"));
                s.setTipo_servicio(resultSet.getString("tipo_servicio"));
                tiposServicios.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tiposServicios;
    }
}