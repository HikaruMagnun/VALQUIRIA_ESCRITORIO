
package valquiria.desktop_hotel.Interface;

import valquiria.desktop_hotel.Modelo.producto;
import javax.swing.table.DefaultTableModel;

public interface ProductoDAO {
    public DefaultTableModel mostrar(String buscar);

    public boolean insertar(producto dts);

    public boolean editar(producto dts);

    public boolean eliminar(producto dts);

    public Object filtrar(String buscar);
}
