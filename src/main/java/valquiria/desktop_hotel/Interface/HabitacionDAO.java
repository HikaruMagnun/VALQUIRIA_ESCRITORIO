package valquiria.desktop_hotel.Interface;

import valquiria.desktop_hotel.Modelo.habitacion;
import javax.swing.table.DefaultTableModel;

public interface HabitacionDAO {
    public DefaultTableModel mostrar(String buscar);

    public boolean insertar(habitacion dts);

    public boolean editar(habitacion dts);

    public boolean eliminar(habitacion dts);

    public Object fitrar(String buscar);
}
