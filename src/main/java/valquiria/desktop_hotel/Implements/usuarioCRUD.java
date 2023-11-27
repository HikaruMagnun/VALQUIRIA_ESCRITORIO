/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implements;

import Interface.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Piero
 */
public class usuarioCRUD implements UsuarioDAO{
    private final conexion mysql= new conexion();
    private final Connection cn=mysql.conectar();
    private String sSQL="";
    private String sSQL2="";
    public int totalregistros;
    
    @Override
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos={"ID","Nombres","Ap. Paterno","T. Doc","N° Doc","Direccion","Telefono","Correo","Login","Password"};
        String [] registro=new String[10];
        totalregistros=0;
        modelo = new DefaultTableModel(null,titulos);
        
        sSQL="Select p.idpersona, p.nombre , p.apaterno, p.tipo_documento,p.numero_documento,p.direccion,p.telefono,p.correo,u.login,u.password"
               +" from persona p inner join usuario u on u.idpersona=p.idpersona where p.nombre like '%"+buscar+"%' order by p.idpersona";
        
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while(rs.next()){
                registro[0]=rs.getString("idpersona");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("apaterno");
                registro[3]=rs.getString("tipo_documento");
                registro[4]=rs.getString("numero_documento");
                registro[5]=rs.getString("direccion");
                registro[6]=rs.getString("telefono");
                registro[7]=rs.getString("correo");
                registro[8]=rs.getString("login");
                registro[9]=rs.getString("password");
                totalregistros+=1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    /*@Override
    public boolean insertar(usuario dts){
        sSQL = "insert  into persona (nombre,apaterno,tipo_documento,numero_documento,direccion,telefono,correo)"+
                "values(?,?,?,?,?,?,?)";
        
        sSQL2 = "insert into usuario (idpersona,login,password) "+"values((select idpersona from persona order by idpersona desc limit 1),?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            PreparedStatement pst2=cn.prepareStatement(sSQL2);
            pst.setString(1,dts.getNombre());
            pst.setString(2,dts.getApaterno());
            pst.setString(3,dts.getTipo_documento());
            pst.setString(4,dts.getNumero_documento());
            pst.setString(5,dts.getDireccion());
            pst.setString(6,dts.getTelefono());
            pst.setString(7,dts.getCorreo());
            

            pst2.setString(1,dts.getLogin());
            pst2.setString(2,dts.getPassword());

            
            int n=pst.executeUpdate();
            
            if (n!=0) {
                int n2= pst2.executeUpdate();
                if(n2 !=0){
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    @Override
     public boolean editar(usuario dts){
        sSQL = "update persona set nombre=?, apaterno= ?, tipo_documento=?, "
                + "numero_documento=?, direccion=?, telefono=?,correo=?"+
                " where idpersona=?";
        
        sSQL2 = "update usuario set  login=?, password=?"+
                " where idpersona=?";
        
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            PreparedStatement pst2=cn.prepareStatement(sSQL2);
            pst.setString(1,dts.getNombre());
            pst.setString(2,dts.getApaterno());
            pst.setString(3,dts.getTipo_documento());
            pst.setString(4,dts.getNumero_documento());
            pst.setString(5,dts.getDireccion());
            pst.setString(6,dts.getTelefono());
            pst.setString(7,dts.getCorreo());
            pst.setInt(8,dts.getIdpersona());
            
            pst2.setString(1,dts.getLogin());
            pst2.setString(2,dts.getPassword());
            pst2.setInt(3,dts.getIdpersona());

            
            int n=pst.executeUpdate();
            
            if (n!=0) {
                int n2= pst2.executeUpdate();
                if(n2 !=0){
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
     
    @Override 
    public boolean eliminar (usuario dts){
        sSQL = "delete from usuario where idpersona=?";
        sSQL2 = "delete from persona where idpersona=?";
        try {
            
            PreparedStatement pst=cn.prepareStatement(sSQL);
            PreparedStatement pst2=cn.prepareStatement(sSQL2);
            pst.setInt(1,dts.getIdpersona());
            pst2.setInt(1,dts.getIdpersona());
            
            int n=pst.executeUpdate();
            
            if (n!=0) {
                int n2= pst2.executeUpdate();
                if(n2 !=0){
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    */
    @Override
    public boolean login ( String usuario, String password){
        int resultado=0;
        sSQL = "select * from usuario where login ='"+usuario+"' and password='"+password+"' ";
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while(rs.next()){
                resultado=1;
                
                if(resultado==1){
                    return true;
                }   
            }
           
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return false;
    }
}
