/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.DAOImpl.ReservaDAOImpl;
import valquiria.desktop_hotel.Modelo.reserva;
import javax.swing.JOptionPane;

/**
 *
 * @author Piero
 */
public class FrmReservaEditDelete extends javax.swing.JFrame {

    public FrmReservaEditDelete() {
        initComponents();
        txtid.setEnabled(false);
        txtid.setText(FrmReservaVista.valoresReserva[0]);
        txtidpersona.setText(FrmReservaVista.valoresReserva[1]);
        txtnombre.setText(FrmReservaVista.valoresReserva[2]);
        txtnumero.setText(FrmReservaVista.valoresReserva[3]);
        txthabitacion.setText(FrmReservaVista.valoresReserva[4]);
        txtfechaInicio.setText(FrmReservaVista.valoresReserva[5]);
        txtfechaFinal.setText(FrmReservaVista.valoresReserva[6]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtfechaInicio = new javax.swing.JTextField();
        btneditar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        comboestado = new javax.swing.JComboBox<>();
        txtfechaFinal = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        txtidpersona = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txthabitacion = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("ActualizarReserva");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Fecha Final");
        jPanel1.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 120, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

        txtfechaInicio.setForeground(new java.awt.Color(102, 102, 102));
        txtfechaInicio.setBorder(null);
        txtfechaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfechaInicioMousePressed(evt);
            }
        });
        txtfechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaInicioActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 120, 30));

        btneditar.setBackground(new java.awt.Color(18, 90, 173));
        btneditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditarMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditarMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btneditarMousePressed(evt);
            }
        });
        btneditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar");
        btneditar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel1.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 230, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Huesped");
        jPanel1.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        txtnombre.setForeground(new java.awt.Color(102, 102, 102));
        txtnombre.setBorder(null);
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombreMousePressed(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Habitacion");
        jPanel1.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Estado");
        jPanel1.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        comboestado
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESERVADO", "PAGADO", "NO PAGADO" }));
        comboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboestadoActionPerformed(evt);
            }
        });
        jPanel1.add(comboestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 90, -1));

        txtfechaFinal.setForeground(new java.awt.Color(102, 102, 102));
        txtfechaFinal.setBorder(null);
        txtfechaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfechaFinalMousePressed(evt);
            }
        });
        txtfechaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaFinalActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 140, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 140, 10));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 70, -1));

        txtidpersona.setForeground(new java.awt.Color(102, 102, 102));
        txtidpersona.setBorder(null);
        txtidpersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtidpersonaMousePressed(evt);
            }
        });
        txtidpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpersonaActionPerformed(evt);
            }
        });
        jPanel1.add(txtidpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 70, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 70, 10));

        txthabitacion.setForeground(new java.awt.Color(102, 102, 102));
        txthabitacion.setBorder(null);
        txthabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txthabitacionMousePressed(evt);
            }
        });
        txthabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(txthabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 30));

        txtnumero.setForeground(new java.awt.Color(102, 102, 102));
        txtnumero.setBorder(null);
        txtnumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnumeroMousePressed(evt);
            }
        });
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 70, 30));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 70, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 10));

        jSeparator12.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 70, 10));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Fecha Inicio");
        jPanel1.add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        btneliminar.setBackground(new java.awt.Color(18, 90, 173));
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneliminarMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneliminarMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btneliminarMousePressed(evt);
            }
        });
        btneliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar");
        btneliminar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 230, 50));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 758, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 428, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtnumeroActionPerformed

    private void txtnumeroMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtnumeroMousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtnumeroMousePressed

    private void txthabitacionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txthabitacionActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txthabitacionActionPerformed

    private void txthabitacionMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txthabitacionMousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txthabitacionMousePressed

    private void txtidpersonaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtidpersonaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtidpersonaActionPerformed

    private void txtidpersonaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtidpersonaMousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtidpersonaMousePressed

    private void txtfechaFinalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtfechaFinalActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtfechaFinalActionPerformed

    private void txtfechaFinalMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtfechaFinalMousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtfechaFinalMousePressed

    private void comboestadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboestadoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_comboestadoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtnombreMousePressed
        if (txtnombre.getText().equals("Ingrese el nombre"))
            txtnombre.setText("");

    }// GEN-LAST:event_txtnombreMousePressed

    public boolean validateInputs() {
        String regexEntero = "^\\d{1,12}$";
        String regexDouble = "^\\d{1,3}(\\.\\d{1,2})?$";
        String regexFecha = "^(?!0000)[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";

        if (!txtfechaInicio.getText().matches(regexFecha)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Fecha Inicio no válido");
            return false;
        }

        if (!txtfechaFinal.getText().matches(regexFecha)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Fecha Final no válido");
            return false;
        }

        return true;
    }

    private void btneditarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneditarMousePressed
        if (!validateInputs()) {
            return;
        }
        reserva dts = new reserva();
        ReservaDAOImpl func = new ReservaDAOImpl();

        dts.setFechaIngreso(txtfechaInicio.getText());
        dts.setFechaSalida(txtfechaFinal.getText());
        int sestado = comboestado.getSelectedIndex();
        dts.setIdCliente(Integer.parseInt(txtidpersona.getText()));
        dts.setEstado(comboestado.getItemAt(sestado));
        dts.setIdHabitacion(Integer.parseInt(txtnumero.getText()));
        dts.setIdReserva(Integer.parseInt(txtid.getText()));

        if (func.editar(dts)) {
            JOptionPane.showConfirmDialog(rootPane, "El huesped se edito correctamente");
            txtid.setText("");
            txtnombre.setText("");
            txtfechaFinal.setText("");
            txtfechaInicio.setText("");
            txtidpersona.setText("");
            txtnumero.setText("");
        }

        FrmReservaVista newframe = new FrmReservaVista();
        newframe.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btneditarMousePressed

    private void btneditarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneditarMouseExited

    }// GEN-LAST:event_btneditarMouseExited

    private void btneditarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneditarMouseEntered

    }// GEN-LAST:event_btneditarMouseEntered

    private void txtfechaInicioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtfechaInicioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtfechaInicioActionPerformed

    private void txtfechaInicioMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtfechaInicioMousePressed

    }// GEN-LAST:event_txtfechaInicioMousePressed

    private void btneliminarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneliminarMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btneliminarMouseEntered

    private void btneliminarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneliminarMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btneliminarMouseExited

    private void btneliminarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneliminarMousePressed
        // TODO add your handling code here:
        reserva dts = new reserva();
        ReservaDAOImpl func = new ReservaDAOImpl();
        dts.setIdReserva(Integer.parseInt(txtid.getText()));
        System.out.println("Se elimino correctamente la habitacion");
        func.eliminar(dts);

        FrmReservaVista newframe = new FrmReservaVista();
        newframe.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btneliminarMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String regexEntero = "^\\d{1,12}$";

        if (!txtidpersona.getText().matches(regexEntero)) {
            JOptionPane.showMessageDialog(rootPane, "Campo Nro Doc no válido");
            return;
        }
        reserva dts = new reserva();
        ReservaDAOImpl func = new ReservaDAOImpl();

        txtnombre.setText(func.fitrar(txtidpersona.getText()));
        System.out.println("adada" + func.fitrar(txtidpersona.getText()));
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reserva dts = new reserva();
        ReservaDAOImpl func = new ReservaDAOImpl();

        txthabitacion.setText(func.fitrarHab(txtnumero.getText()));
    }// GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReservaEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReservaEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReservaEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReservaEditDelete.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReservaEditDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btneditar;
    private javax.swing.JPanel btneliminar;
    private javax.swing.JComboBox<String> comboestado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtfechaFinal;
    private javax.swing.JTextField txtfechaInicio;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
