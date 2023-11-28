
package Interface;

import Modelo.persona;
import javax.swing.table.DefaultTableModel;


public interface HuespedDAO {
    public DefaultTableModel mostrar(String buscar) ;
    public boolean insertar(persona dts);
    public boolean editar(persona dts,Long id);
    public boolean eliminar (Long dts);
}