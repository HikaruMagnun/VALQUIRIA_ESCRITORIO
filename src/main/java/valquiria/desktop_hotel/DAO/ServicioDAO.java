
package valquiria.desktop_hotel.DAO;

import javax.swing.table.DefaultTableModel;

public interface ServicioDAO {
    public DefaultTableModel mostrar(String buscar);

    public boolean insertar(int id, int dts);

    public boolean editar(Boolean nuevoEstado, int id_alojamiento, int idServicio, int id);

    public boolean eliminar(int dts);

    public Object filtrar(String buscar);
}
