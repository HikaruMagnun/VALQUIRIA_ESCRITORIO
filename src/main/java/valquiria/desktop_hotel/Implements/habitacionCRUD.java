package Implements;


import Interface.HabitacionDAO;
import Modelo.habitacion;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class habitacionCRUD implements HabitacionDAO {
    private final conexion mysql= new conexion();
    private final Connection cn=mysql.conectar();
    private String sSQL="";

    
    @Override
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos={"Numero","Precio","Tipo","Piso"};
        String [] registro=new String[5];

        modelo = new DefaultTableModel(null,titulos);
        
        sSQL="SELECT * FROM habitaciones where tipo like '%"+buscar+"%' order by codigo_habitacion";
        
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while(rs.next()){
                registro[0]=rs.getString("codigo_habitacion");
                registro[1]=Double.toString(rs.getDouble("precio_dia"));
                registro[2]=rs.getString("tipo");
                registro[3]=String.valueOf(rs.getInt("piso"));
                

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    @Override
    public boolean insertar(habitacion dts){
        String sql = "INSERT INTO habitaciones (codigo_habitacion, piso, precio_dia, tipo) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement statement = cn.prepareStatement(sql);
            statement.setInt(1, dts.getIdhabitacion());
            statement.setInt(2, dts.getPiso());
            statement.setDouble(3,dts.getPrecio());
            statement.setString(4, dts.getTipo_habitacion());

            statement.executeUpdate();
            System.out.println("Habitación insertada correctamente.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
     public boolean editar(habitacion dts, int id){
        sSQL = "UPDATE habitaciones SET codigo_habitacion=?,piso = ?, precio_dia = ?, tipo = ? WHERE codigo_habitacion = ?";
        try {
            
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1,dts.getNum_habitacion());
            pst.setInt(2,dts.getPiso());
            pst.setDouble(3,dts.getPrecio());
            pst.setString(4,dts.getTipo_habitacion());
            pst.setInt(5,id);

            
            int n=pst.executeUpdate();
            
            if (n!=0) {
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
    public boolean eliminar(habitacion dts){
        String sql = "DELETE FROM habitaciones WHERE codigo_habitacion = ?";
        try {
            
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setInt(1,dts.getIdhabitacion());
            
            int n=pst.executeUpdate();
            
            if (n!=0) {
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
    public Object fitrar(String buscar) {
        DefaultTableModel modelo;
        
        String [] titulos={"ID","Numero","Piso","Tipo","Estado"};
        String [] registro=new String[5];

        
        sSQL="Select * from habitacion where numero = '"+buscar+"'";
        
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while(rs.next()){
                registro[0]=rs.getString("idhabitacion");
                registro[1]=rs.getString("numero");
                registro[2]=rs.getString("precio");
                registro[3]=rs.getString("estado");
                registro[4]=rs.getString("tipo");                
            }
            return registro;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    @Override
    public boolean editar(habitacion dts) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



        