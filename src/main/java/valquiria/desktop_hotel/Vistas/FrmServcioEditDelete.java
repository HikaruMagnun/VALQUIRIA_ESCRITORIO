
package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.DAOImpl.ServicioDAOImpl;
import valquiria.desktop_hotel.Modelo.Servicio;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtnumero;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtpiso;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtprecio;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmServcioEditDelete extends javax.swing.JFrame {
    private static List<Servicio> serviciosList;

    public FrmServcioEditDelete() {
        initComponents();
        ServicioDAOImpl func = new ServicioDAOImpl();

        serviciosList = func.obtenerTiposServiciosDesdeBD();

        for (Servicio tipoServicio : serviciosList) {
            comboservicio.addItem(tipoServicio.getTipo_servicio());
        }
        txtid.setEnabled(false);
        txtid.setText(FrmServicioVista.valores[0]);
        txtNombre.setText(FrmServicioVista.valores[1]);
    }

    private int buscarServicio(String servicio) {

        for (Servicio tipoServicio : serviciosList) {
            if (tipoServicio.getTipo_servicio().equals(servicio)) {
                return tipoServicio.getId();
            }
        }

        return 0;
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
        jSeparator8 = new javax.swing.JSeparator();
        comboservicio = new javax.swing.JComboBox<>();
        Text11 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        comboestado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Servicio-Cliente");
        jPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 10, 370));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Servicio");
        jPanel4.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Estado");
        jPanel4.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 300, 10));

        comboservicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(comboservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 120, -1));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Nro alojamiento");
        jPanel4.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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
        jLabel6.setText("Guardar");
        btn_editar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        jPanel4.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 200, 50));
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 50, -1));

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(null);
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 30));

        comboestado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE", "CULMINADO" }));
        jPanel4.add(comboestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 120, -1));

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
                        .addGap(0, 430, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_eliminarMouseEntered

    }// GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_eliminarMouseExited

    }// GEN-LAST:event_btn_eliminarMouseExited

    private void btn_eliminarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_eliminarMousePressed
        ServicioDAOImpl func = new ServicioDAOImpl();

        if (func.eliminar(Integer.parseInt(txtid.getText()))) {
            JOptionPane.showConfirmDialog(rootPane, "El servicio del cliente se elimino scorrectamente");
            txtid.setText("");
            txtNombre.setText("");
        }

        FrmServicioVista newframe = new FrmServicioVista();
        newframe.setVisible(true);
        this.dispose();

    }// GEN-LAST:event_btn_eliminarMousePressed

    private boolean validateInputs() {

        String regexEntero = "^\\d{1,9}$";

        if (!txtNombre.getText().matches(regexEntero)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Número Alojamiento no válido");
            return false;
        }
        return true;
    }

    private void btn_editarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_editarMouseEntered

    }// GEN-LAST:event_btn_editarMouseEntered

    private void btn_editarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_editarMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_editarMouseExited

    private void btn_editarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_editarMousePressed
        if (!validateInputs()) {
            return;
        }
        if (txtid.getText().isEmpty() || txtid.getText() == null) {
            int spiso = comboservicio.getSelectedIndex();
            int idServicioTipo = 0;
            idServicioTipo = buscarServicio(comboservicio.getItemAt(spiso));
            ServicioDAOImpl func = new ServicioDAOImpl();

            if (func.insertar(idServicioTipo, Integer.parseInt(txtNombre.getText()))) {
                JOptionPane.showConfirmDialog(rootPane, "El producto se edito correctamente");
                txtid.setText("");
                txtNombre.setText("");
            }
            FrmServicioVista newframe = new FrmServicioVista();
            newframe.setVisible(true);
            this.dispose();
        } else {

            int spiso = comboservicio.getSelectedIndex();
            int idServicioTipo = 0;
            idServicioTipo = buscarServicio(comboservicio.getItemAt(spiso));
            ServicioDAOImpl func = new ServicioDAOImpl();
            int sestado = comboestado.getSelectedIndex();
            boolean estado = comboservicio.getItemAt(sestado) != "PENDIENTE";

            if (func.editar(estado, idServicioTipo, Integer.parseInt(txtNombre.getText()),
                    Integer.parseInt(txtid.getText()))) {
                JOptionPane.showConfirmDialog(rootPane, "El Servicio se edito correctamente");
                txtid.setText("");
                txtNombre.setText("");
            }
            FrmServicioVista newframe = new FrmServicioVista();
            newframe.setVisible(true);
            this.dispose();

        }

    }// GEN-LAST:event_btn_editarMousePressed

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
            java.util.logging.Logger.getLogger(FrmServcioEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmServcioEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmServcioEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmServcioEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmServcioEditDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Title3;
    private javax.swing.JPanel body3;
    private javax.swing.JPanel btn_editar;
    private javax.swing.JPanel btn_eliminar;
    private javax.swing.JComboBox<String> comboestado;
    private javax.swing.JComboBox<String> comboservicio;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
