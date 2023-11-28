
package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.Implements.productoCRUD;
import valquiria.desktop_hotel.Modelo.producto;
import javax.swing.JOptionPane;

public class FrmProductoUp extends javax.swing.JFrame {

    public FrmProductoUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        body3 = new javax.swing.JPanel();
        Title3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        folio1 = new javax.swing.JTextField();
        Text6 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        combotipo = new javax.swing.JComboBox<>();
        Text7 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        folio3 = new javax.swing.JTextField();
        Text11 = new javax.swing.JLabel();
        Text12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        txtmarca = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtprecio = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Nuevo Producto");
        jPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 10, 370));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Descripcion");
        jPanel4.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Tipo Producto");
        jPanel4.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 260, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, 10));

        folio1.setForeground(new java.awt.Color(102, 102, 102));
        folio1.setBorder(null);
        folio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folio1MousePressed(evt);
            }
        });
        jPanel4.add(folio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Precio");
        jPanel4.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 90, 10));

        combotipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Bebida" }));
        jPanel4.add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 120, -1));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Marca");
        jPanel4.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        btn_registrar.setBackground(new java.awt.Color(18, 90, 173));
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrarMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrarMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_registrarMousePressed(evt);
            }
        });
        btn_registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rregistrar");
        btn_registrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        jPanel4.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 200, 50));

        txtstock.setForeground(new java.awt.Color(102, 102, 102));
        txtstock.setBorder(null);
        jPanel4.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 90, 30));

        folio3.setForeground(new java.awt.Color(102, 102, 102));
        folio3.setBorder(null);
        folio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folio3MousePressed(evt);
            }
        });
        jPanel4.add(folio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Nombre");
        jPanel4.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Stock");
        jPanel4.add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(null);
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 30));

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
        jPanel4.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 758, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 758,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 428, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void folio3MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_folio3MousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_folio3MousePressed

    private void btn_registrarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrarMousePressed
        producto dts = new producto();
        productoCRUD func = new productoCRUD();

        dts.setNombre(txtNombre.getText());

        int spiso = combotipo.getSelectedIndex();
        dts.setTipo(combotipo.getItemAt(spiso));

        dts.setPrecio(Double.parseDouble(txtprecio.getText()));
        dts.setMarca(txtmarca.getText());
        dts.setStock(Integer.parseInt(txtstock.getText()));
        dts.setDescripcion(txtdescripcion.getText());
        System.out.println("Se registro correctamente el producto");
        func.insertar(dts);

        FrmProductoVista newframe = new FrmProductoVista();
        newframe.setVisible(true);
        this.dispose();

    }// GEN-LAST:event_btn_registrarMousePressed

    private void btn_registrarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrarMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrarMouseExited

    private void btn_registrarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrarMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrarMouseEntered

    private void folio1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_folio1MousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_folio1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProductoUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductoUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductoUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductoUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductoUp().setVisible(true);
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
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JTextField folio1;
    private javax.swing.JTextField folio3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
