package Vistas;


import Implements.habitacionCRUD;
import Implements.productoCRUD;
import Vistas.FrmHabitacionVista;
import Modelo.habitacion;
import javax.swing.JOptionPane;

public class FrmHabitacionDeleteEdit extends javax.swing.JFrame {

    public FrmHabitacionDeleteEdit() {
        initComponents();
        
        
        txtid.setEnabled(false);
        txtid.setText(FrmHabitacionVista.id);
        txtnumero.setText(FrmHabitacionVista.id);
        txtprecio.setText(FrmHabitacionVista.precio);
        txtpiso.setText(FrmHabitacionVista.estado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        body3 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        body4 = new javax.swing.JPanel();
        Title4 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        folio2 = new javax.swing.JTextField();
        Text8 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        folio4 = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtid = new javax.swing.JTextField();
        Text9 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        Text6 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Text10 = new javax.swing.JLabel();
        txtpiso = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        btn_eliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        folio1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 10, 370));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel5.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body4.setBackground(new java.awt.Color(255, 255, 255));
        body4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(body4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title4.setText("Acutalizar Habitacion");
        jPanel5.add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 10, 370));

        folio2.setForeground(new java.awt.Color(102, 102, 102));
        folio2.setBorder(null);
        folio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folio2MousePressed(evt);
            }
        });
        jPanel5.add(folio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Tipo Habitacion");
        jPanel5.add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

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

        jPanel5.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 200, 50));

        folio4.setForeground(new java.awt.Color(102, 102, 102));
        folio4.setBorder(null);
        folio4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folio4MousePressed(evt);
            }
        });
        jPanel5.add(folio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        txtnumero.setForeground(new java.awt.Color(102, 102, 102));
        txtnumero.setBorder(null);
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        jPanel5.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 270, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel5.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 270, 10));

        txtid.setForeground(new java.awt.Color(102, 102, 102));
        txtid.setBorder(null);
        jPanel5.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 60, 30));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Numero");
        jPanel5.add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        comboTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Matrimonial", "Doble", "Solitaria" }));
        jPanel5.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, -1));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Precio");
        jPanel5.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtprecio.setForeground(new java.awt.Color(102, 102, 102));
        txtprecio.setBorder(null);
        jPanel5.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 10));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Piso");
        jPanel5.add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        txtpiso.setForeground(new java.awt.Color(102, 102, 102));
        txtpiso.setBorder(null);
        jPanel5.add(txtpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 270, 30));

        jSeparator12.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 270, 10));

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

        jPanel5.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 200, -1));

        folio1.setForeground(new java.awt.Color(102, 102, 102));
        folio1.setBorder(null);
        folio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folio1MousePressed(evt);
            }
        });
        jPanel5.add(folio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void folio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folio1MousePressed
        
    }//GEN-LAST:event_folio1MousePressed

    private void btn_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMousePressed
        habitacion dts = new habitacion();
        habitacionCRUD func= new habitacionCRUD();
        dts.setIdhabitacion(Integer.parseInt(txtid.getText()));
        System.out.println("Se eelimino correctamente la habitacion");
        func.eliminar(dts);

        if(func.eliminar(dts)){
            JOptionPane.showConfirmDialog(rootPane, "La habitacion se edito correctamente");
            txtid.setText("");
            txtnumero.setText("");
            txtpiso.setText("");
            txtprecio.setText("");
            
        }
        FrmHabitacionVista newframe = new FrmHabitacionVista();
            newframe.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btn_eliminarMousePressed

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseExited

    }//GEN-LAST:event_btn_eliminarMouseExited

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered

    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void folio4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folio4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_folio4MousePressed

    private void btn_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMousePressed

        habitacion dts = new habitacion();
        habitacionCRUD func= new habitacionCRUD();

        dts.setNum_habitacion(Integer.parseInt(txtnumero.getText()));

        int spiso=comboTipo.getSelectedIndex();
        dts.setIdhabitacion(Integer.parseInt(txtnumero.getText()));
        dts.setTipo_habitacion(comboTipo.getItemAt(spiso));

        dts.setPrecio(Double.parseDouble(txtprecio.getText()));
        dts.setPiso(Integer.parseInt(txtpiso.getText()));
        System.out.println("Se edito correctamente la habitacion");

        if(func.editar(dts,Integer.parseInt(txtid.getText()))){
            JOptionPane.showConfirmDialog(rootPane, "La habitacion se edito correctamente");
            txtid.setText("");
            txtnumero.setText("");
            txtpiso.setText("");
            txtprecio.setText("");
            this.dispose();
        }
        
        FrmHabitacionVista newframe = new FrmHabitacionVista();
        newframe.setVisible(true);
        
    }//GEN-LAST:event_btn_editarMousePressed

    private void btn_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarMouseExited

    private void btn_editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseEntered

    }//GEN-LAST:event_btn_editarMouseEntered

    private void folio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folio2MousePressed

    }//GEN-LAST:event_folio2MousePressed

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
            java.util.logging.Logger.getLogger(FrmHabitacionDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHabitacionDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHabitacionDeleteEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title4;
    private javax.swing.JPanel body3;
    private javax.swing.JPanel body4;
    private javax.swing.JPanel btn_editar;
    private javax.swing.JPanel btn_eliminar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JTextField folio1;
    private javax.swing.JTextField folio2;
    private javax.swing.JTextField folio4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    public static javax.swing.JTextField txtid;
    public static javax.swing.JTextField txtnumero;
    public static javax.swing.JTextField txtpiso;
    public static javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
