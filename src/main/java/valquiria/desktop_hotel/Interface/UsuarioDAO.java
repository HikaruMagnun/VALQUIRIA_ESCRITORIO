/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package valquiria.desktop_hotel.Interface;

import javax.swing.table.DefaultTableModel;

public interface UsuarioDAO {

    public DefaultTableModel mostrar(String buscar);

    /*
     * public boolean insertar(usuario dts);
     * public boolean editar(usuario dts);
     * public boolean eliminar (usuario dts);
     */
    public boolean login(String usuario, String password);
}
