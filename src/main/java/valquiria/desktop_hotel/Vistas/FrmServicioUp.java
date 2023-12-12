
package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.DAOImpl.HabitacionDAOImpl;
import valquiria.desktop_hotel.DAOImpl.ServicioDAOImpl;
import valquiria.desktop_hotel.Modelo.Servicio;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtid;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtnumero;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtpiso;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtprecio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmServicioUp extends javax.swing.JFrame {
    public static String[] valoresService = new String[4];

    public FrmServicioUp() {
        initComponents();
        DefaultTableModel modelo;
        ServicioDAOImpl func = new ServicioDAOImpl();
        modelo = func.mostrarTipoServicios();
        tablalistadoservicios.setModel(modelo);
        this.setLocationRelativeTo(null);
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
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        folio1 = new javax.swing.JTextField();
        Text6 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btn_registrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        folio3 = new javax.swing.JTextField();
        Text11 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        btn_registrar1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistadoservicios = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        btn_registrar2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Registrar Servicio");
        jPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 10, 370));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Descripcion");
        jPanel4.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 360, 210, 10));

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
        jPanel4.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, 10));

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
        jLabel5.setText("Salir");
        btn_registrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, -1, 50));

        jPanel4.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 160, 30));

        folio3.setForeground(new java.awt.Color(102, 102, 102));
        folio3.setBorder(null);
        folio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folio3MousePressed(evt);
            }
        });
        jPanel4.add(folio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Tipo");
        jPanel4.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txttipo.setForeground(new java.awt.Color(102, 102, 102));
        txttipo.setBorder(null);
        jPanel4.add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 30));

        txtprecio.setForeground(new java.awt.Color(102, 102, 102));
        txtprecio.setBorder(null);
        jPanel4.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 30));
        jPanel4.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 300, 70));

        btn_registrar1.setBackground(new java.awt.Color(18, 90, 173));
        btn_registrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrar1MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrar1MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_registrar1MousePressed(evt);
            }
        });
        btn_registrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Eliminar");
        btn_registrar1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, -1, 50));

        jPanel4.add(btn_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 160, 30));

        tablalistadoservicios.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        tablalistadoservicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablalistadoserviciosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablalistadoservicios);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 350, 360));

        txtid.setForeground(new java.awt.Color(102, 102, 102));
        txtid.setBorder(null);
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 60, 30));

        btn_registrar2.setBackground(new java.awt.Color(18, 90, 173));
        btn_registrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrar2MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrar2MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_registrar2MousePressed(evt);
            }
        });
        btn_registrar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Guardar");
        btn_registrar2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, -1, 50));

        jPanel4.add(btn_registrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 160, 30));

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
        FrmServicioVista newframe = new FrmServicioVista();
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

    private void btn_registrar1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrar1MouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrar1MouseEntered

    private void btn_registrar1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrar1MouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrar1MouseExited

    private void btn_registrar1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrar1MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:

        ServicioDAOImpl func = new ServicioDAOImpl();
        if (func.eliminarServicioTipo(Integer.parseInt(txtid.getText()))) {
            JOptionPane.showConfirmDialog(rootPane, "La habitacion se elimino correctamente");
            txtid.setText("");
            txtdescripcion.setText("");
            txttipo.setText("");
            txtprecio.setText("");
            DefaultTableModel modelo;
            modelo = func.mostrarTipoServicios();
            tablalistadoservicios.setModel(modelo);
            this.setLocationRelativeTo(null);
        }

    }// GEN-LAST:event_btn_registrar1MousePressed

    private void tablalistadoserviciosMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablalistadoserviciosMousePressed
        if (evt.getClickCount() == 1) {
            int fila = tablalistadoservicios.getSelectedRow();

            for (int i = 0; i < valoresService.length; i++) {
                Object value = tablalistadoservicios.getValueAt(fila, i);
                if (value != null) {
                    valoresService[i] = value.toString();
                }
            }

            txtid.setText(valoresService[0]);
            txttipo.setText(valoresService[1]);
            txtdescripcion.setText(valoresService[3]);
            txtprecio.setText(valoresService[2]);
        }
    }// GEN-LAST:event_tablalistadoserviciosMousePressed

    private void btn_registrar2MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrar2MouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrar2MouseEntered

    private void btn_registrar2MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrar2MouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrar2MouseExited

    private boolean validateInputs() {

        String regexEntero = "^\\d{1,9}$";
        String regexDouble = "^\\d{1,3}(\\.\\d{1,2})?$";

        if (txttipo.getText() == null || txttipo.getText().isEmpty() || txttipo.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Campo Tipo no válido");
            return false;
        }

        if (!txtprecio.getText().matches(regexDouble)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Precio no válido");
            return false;
        }

        if (txtdescripcion.getText() == null || txtdescripcion.getText().isEmpty()
                || txtdescripcion.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Campo Descriptcion no válido");
            return false;
        }

        return true;
    }

    private void btn_registrar2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrar2MousePressed
        // TODO add your handling code here:
        if (!validateInputs()) {
            return;
        }

        if (txtid.getText().isEmpty() || txtid.getText() == null) {
            Servicio dts = new Servicio();
            ServicioDAOImpl func = new ServicioDAOImpl();

            /*
             * dts.setNombre(txtNombre.getText());
             * 
             * int spiso=combotipo.getSelectedIndex();
             * dts.setTipo(combotipo.getItemAt(spiso));
             * 
             * dts.setPrecio(Double.parseDouble(txtprecio.getText()));
             * dts.setMarca(txtmarca.getText());
             * dts.setStock(Integer.parseInt(txtstock.getText()));
             * dts.setDescripcion(txtdescripcion.getText());
             * System.out.println("Se registro correctamente el producto");
             * func.insertar(dts);
             */

            dts.setTipo_servicio(this.txttipo.getText());
            dts.setDescripcion(this.txtdescripcion.getText());
            dts.setPrecio(Double.valueOf(this.txtprecio.getText()));
            if (!func.crearServicio(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "No se pudo registrar el servicio correctamente");
                this.txtid.setText("");
                this.txtdescripcion.setText("");
                this.txttipo.setText("");
                this.txtprecio.setText("");
            } else {
                DefaultTableModel modelo;
                modelo = func.mostrarTipoServicios();
                tablalistadoservicios.setModel(modelo);
                this.setLocationRelativeTo(null);
            }

        } else {
            System.out.println("ACTUALIZANDOOOOOOO");
            Servicio dts = new Servicio();
            ServicioDAOImpl func = new ServicioDAOImpl();
            dts.setId(Integer.parseInt(this.txtid.getText()));
            dts.setTipo_servicio(this.txttipo.getText());
            dts.setDescripcion(this.txtdescripcion.getText());
            dts.setPrecio(Double.valueOf(this.txtprecio.getText()));
            if (!func.actualizarTipoServicio(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "No se pudo registrar el servicio correctamente");
                this.txtid.setText("");
                this.txtdescripcion.setText("");
                this.txttipo.setText("");
                this.txtprecio.setText("");
            } else {
                DefaultTableModel modelo;
                modelo = func.mostrarTipoServicios();
                tablalistadoservicios.setModel(modelo);
                this.setLocationRelativeTo(null);
            }

        }
    }// GEN-LAST:event_btn_registrar2MousePressed

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
            java.util.logging.Logger.getLogger(FrmServicioUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmServicioUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmServicioUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmServicioUp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmServicioUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Title3;
    private javax.swing.JPanel body3;
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JPanel btn_registrar1;
    private javax.swing.JPanel btn_registrar2;
    private javax.swing.JTextField folio1;
    private javax.swing.JTextField folio3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tablalistadoservicios;
    private javax.swing.JTextField txtdescripcion;
    public static javax.swing.JTextField txtid;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
