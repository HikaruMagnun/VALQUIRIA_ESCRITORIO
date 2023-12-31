
package valquiria.desktop_hotel.DAO;

import javax.swing.table.DefaultTableModel;
import valquiria.desktop_hotel.Modelo.reserva;

public interface ReservaDAO {
    public DefaultTableModel mostrar(String buscar);

    public boolean insertar(reserva dts);

    public boolean editar(reserva dts);

    public boolean eliminar(reserva dts);

    public String fitrar(String buscar);

    public String fitrarHab(String buscar);
}
