
package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.DAOImpl.HabitacionDAOImpl;
import valquiria.desktop_hotel.Modelo.habitacion;
import javax.swing.JOptionPane;

public class FrmHabitacionUp extends javax.swing.JFrame {

    public FrmHabitacionUp() {
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
        Text4 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        comboTipo = new javax.swing.JComboBox<>();
        Text7 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        Text11 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtpiso = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Nueva Habitacion");
        jPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 10, 370));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Tipo Habitacion");
        jPanel4.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 300, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Precio");
        jPanel4.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, 10));

        comboTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "VIP", "Matrimonial", "Doble", "Solitaria", "Presidencial" }));
        jPanel4.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, -1));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Piso");
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

        txtprecio.setForeground(new java.awt.Color(102, 102, 102));
        txtprecio.setBorder(null);
        jPanel4.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 90, 30));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Numero");
        jPanel4.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtnumero.setForeground(new java.awt.Color(102, 102, 102));
        txtnumero.setBorder(null);
        jPanel4.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 300, 30));

        txtpiso.setForeground(new java.awt.Color(102, 102, 102));
        txtpiso.setBorder(null);
        jPanel4.add(txtpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 270, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 270, 10));

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

    private void btn_registrarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrarMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrarMouseEntered

    private void btn_registrarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrarMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_registrarMouseExited

    private void btn_registrarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_registrarMousePressed
        if (!validateInputs()) {
            return;
        }
        habitacion dts = new habitacion();
        HabitacionDAOImpl func = new HabitacionDAOImpl();

        dts.setNum_habitacion(Integer.parseInt(txtnumero.getText()));

        int spiso = comboTipo.getSelectedIndex();
        dts.setTipo_habitacion(comboTipo.getItemAt(spiso));

        dts.setPrecio(Double.parseDouble(txtprecio.getText()));
        dts.setPiso(Integer.parseInt(txtpiso.getText()));
        System.out.println("Se registro correctamente la habitacion");

        if (!func.insertar(dts)) {
            JOptionPane.showMessageDialog(rootPane, "El numero de Habitacion ya se registro");
        } else {
            FrmHabitacionVista newframe = new FrmHabitacionVista();
            newframe.setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_btn_registrarMousePressed

    private boolean validateInputs() {

        String regexEntero = "^\\d{1,9}$";
        String regexDouble = "^\\d{1,3}(\\.\\d{1,2})?$";

        if (!txtnumero.getText().matches(regexEntero)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Número Hab no válido");
            return false;
        }

        if (!txtprecio.getText().matches(regexDouble)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Precio no válido");
            return false;
        }

        if (!txtpiso.getText().matches(regexEntero)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Piso no válido");
            return false;
        }

        return true;
    }

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
            java.util.logging.Logger.getLogger(FrmHabitacionUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHabitacionUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title3;
    private javax.swing.JPanel body3;
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpiso;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
