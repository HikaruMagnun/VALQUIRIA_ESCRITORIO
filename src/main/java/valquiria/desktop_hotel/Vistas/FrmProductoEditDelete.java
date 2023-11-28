
package Vistas;

import Implements.productoCRUD;
import Modelo.producto;
import javax.swing.JOptionPane;


public class FrmProductoEditDelete extends javax.swing.JFrame {

    public FrmProductoEditDelete() {
        initComponents();
        
        txtid.setEnabled(false);
        txtid.setText(FrmProductoVista.valores[0]);
        txtdescripcion.setText(FrmProductoVista.valores[2]);
        txtNombre.setText(FrmProductoVista.valores[1]);
        txtprecio.setText(FrmProductoVista.valores[4]);
        txtmarca.setText(FrmProductoVista.valores[5]);
        txtstock.setText(FrmProductoVista.valores[6]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        body3 = new javax.swing.JPanel();
        Title3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        combotipo = new javax.swing.JComboBox<>();
        Text7 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        Text11 = new javax.swing.JLabel();
        Text12 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        txtmarca = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtprecio = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Actualizar Producto");
        jPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 10, 370));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Descripcion");
        jPanel4.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Tipo Producto");
        jPanel4.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 300, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Precio");
        jPanel4.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 90, 10));

        combotipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Bebida" }));
        jPanel4.add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, -1));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Marca");
        jPanel4.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        txtstock.setForeground(new java.awt.Color(102, 102, 102));
        txtstock.setBorder(null);
        jPanel4.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 90, 30));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Nombre");
        jPanel4.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Stock");
        jPanel4.add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        txtdescripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtdescripcion.setBorder(null);
        jPanel4.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 30));

        jSeparator16.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 90, 10));

        txtmarca.setForeground(new java.awt.Color(102, 102, 102));
        txtmarca.setBorder(null);
        jPanel4.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 270, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 270, 10));

        txtprecio.setForeground(new java.awt.Color(102, 102, 102));
        txtprecio.setBorder(null);
        jPanel4.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 90, 30));

        btn_eliminar.setBackground(new java.awt.Color(18, 90, 173));
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarMousePressed(evt);
            }
        });
        btn_eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Eliminar");
        btn_eliminar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        jPanel4.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 200, -1));

        btn_editar.setBackground(new java.awt.Color(18, 90, 173));
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editarMousePressed(evt);
            }
        });
        btn_editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar");
        btn_editar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        jPanel4.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 200, 50));
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 50, -1));

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(null);
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered

    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseExited

    }//GEN-LAST:event_btn_eliminarMouseExited

    private void btn_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMousePressed
        producto dts = new producto();
        productoCRUD func= new productoCRUD();
        dts.setIdProducto(Integer.parseInt(txtid.getText()));
        System.out.println("Se elimino correctamente el producto");
        func.eliminar(dts);
        
        if(func.eliminar(dts)){
            JOptionPane.showConfirmDialog(rootPane, "El producto se elimino scorrectamente");
            txtid.setText("");
            txtdescripcion.setText("");
            txtNombre.setText("");
            txtprecio.setText("");
            txtstock.setText("");
            txtmarca.setText("");
        }
        
           FrmProductoVista newframe = new FrmProductoVista();
            newframe.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_btn_eliminarMousePressed

    private void btn_editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseEntered

    }//GEN-LAST:event_btn_editarMouseEntered

    private void btn_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarMouseExited

    private void btn_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMousePressed

        producto dts = new producto();
        productoCRUD func= new productoCRUD();

        dts.setNombre(txtdescripcion.getText());

        int spiso=combotipo.getSelectedIndex();
        dts.setIdProducto(Integer.parseInt(txtid.getText()));
        dts.setTipo(combotipo.getItemAt(spiso));
        dts.setMarca(txtmarca.getText());
        dts.setDescripcion(txtdescripcion.getText());
        dts.setPrecio(Double.parseDouble(txtprecio.getText()));
        dts.setStock(Integer.parseInt(txtstock.getText()));
        System.out.println("Se edito correctamente el producto");
        func.editar(dts);
        
        if(func.editar(dts)){
            JOptionPane.showConfirmDialog(rootPane, "El producto se edito correctamente");
            txtid.setText("");
            txtdescripcion.setText("");
            txtNombre.setText("");
            txtprecio.setText("");
            txtstock.setText("");
            txtmarca.setText("");

        }
             FrmProductoVista newframe = new FrmProductoVista();
            newframe.setVisible(true);
            this.dispose(); 

    }//GEN-LAST:event_btn_editarMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProductoEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductoEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductoEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductoEditDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductoEditDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title3;
    private javax.swing.JPanel body3;
    private javax.swing.JPanel btn_editar;
    private javax.swing.JPanel btn_eliminar;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
