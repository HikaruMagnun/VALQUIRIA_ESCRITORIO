package valquiria.desktop_hotel.Implements;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import valquiria.desktop_hotel.Interface.ReservaDAO;
import valquiria.desktop_hotel.Modelo.reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Piero
 */
public class reservaCRUD implements ReservaDAO {
    private final conexion mysql = new conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";

    @Override
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = { "ID", "IdCliente", "Huesped", "Numero", "Habitacion", "Fecha Ingreso", "Fecha Salida",
                "Precio", "Estado" };
        String[] registro = new String[9];
        modelo = new DefaultTableModel(null, titulos);

        String sql = "SELECT a.id, a.id_cliente, c.nombre || ' ' || c.apellido AS huesped, " +
                "h.codigo_habitacion AS numero, h.tipo AS tipo_habitacion, " +
                "a.fecha_alojamiento AS fecha_ingreso, a.fecha_alojamiento_vencimiento AS fecha_salida, " +
                "COALESCE(h.precio_dia, 0) AS precio, a.estado_reserva " +
                "FROM alojamientos a " +
                "JOIN clientes c ON a.id_cliente = c.nro_doc " +
                "LEFT JOIN habitaciones h ON a.id_habitacion = h.codigo_habitacion where c.nombre like '%" + buscar
                + "%'";

        try {
            Statement st = cn.createStatement();
            ResultSet resultSet = st.executeQuery(sql);

            while (resultSet.next()) {
                registro[0] = String.valueOf(resultSet.getInt("id"));
                registro[1] = String.valueOf(resultSet.getInt("id_cliente"));
                registro[2] = resultSet.getString("huesped");
                registro[3] = String.valueOf(resultSet.getInt("numero"));
                registro[4] = resultSet.getString("tipo_habitacion");
                registro[5] = resultSet.getString("fecha_ingreso");
                registro[6] = resultSet.getString("fecha_salida");
                registro[7] = resultSet.getString("precio");
                registro[8] = resultSet.getString("estado_reserva");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    @Override
    public boolean insertar(reserva dts) {
        sSQL = "INSERT INTO alojamientos (id_cliente, id_habitacion,fecha_realizado_alogamiento, fecha_alojamiento, fecha_alojamiento_vencimiento, estado_reserva) VALUES (?, ?, ?, ?,?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdCliente());
            pst.setInt(2, dts.getIdHabitacion());
            pst.setDate(3, Date.valueOf(LocalDate.now()));
            pst.setDate(4, Date.valueOf(dts.getFechaIngreso()));
            pst.setDate(5, Date.valueOf(dts.getFechaSalida()));
            pst.setString(6, dts.getEstado());

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
    public boolean editar(reserva dts) {
        sSQL = "update alojamientos  set id_cliente=?,id_habitacion=?,"
                + "fecha_alojamiento=?,fecha_alojamiento_vencimiento=?,estado_reserva=? "
                + " where id=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdCliente());
            pst.setInt(2, dts.getIdHabitacion());
            pst.setDate(3, Date.valueOf(dts.getFechaIngreso()));
            pst.setDate(4, Date.valueOf(dts.getFechaSalida()));
            pst.setString(5, dts.getEstado());
            pst.setInt(6, dts.getIdReserva());

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
    public boolean eliminar(reserva dts) {
        String sql = "DELETE FROM alojamientos WHERE id = ?";

        try {

            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setInt(1, dts.getIdReserva());

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
    public String fitrar(String id) {

        String huesped = "";

        sSQL = "Select nombre,apaterno from persona where idpersona = " + id;

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                huesped = rs.getString("nombre") + rs.getString("apaterno");
            }

            return huesped;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    @Override
    public String fitrarHab(String numero) {

        String tipo = "";

        sSQL = "Select codigo_habitacion  from habitaciones  where tipo = '" + numero + "' limit 1";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                tipo = rs.getString("codigo_habitacion");
            }
            return tipo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return tipo;
        }
    }

}
