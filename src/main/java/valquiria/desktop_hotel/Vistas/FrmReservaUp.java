/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Implements.huespedCRUD;
import Implements.reservaCRUD;
import Modelo.reserva;
public class FrmReservaUp extends javax.swing.JFrame {

    /**
     * Creates new form FrmReservaUp
     */
    public FrmReservaUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtfechainicio = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        comboestado = new javax.swing.JComboBox<>();
        txtfechafina = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Registrar Reserva");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Fecha Final");
        jPanel1.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 120, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

        txtfechainicio.setForeground(new java.awt.Color(102, 102, 102));
        txtfechainicio.setBorder(null);
        txtfechainicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfechainicioMousePressed(evt);
            }
        });
        txtfechainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechainicioActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 120, 30));

        btnnuevo.setBackground(new java.awt.Color(18, 90, 173));
        btnnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnnuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnuevoMousePressed(evt);
            }
        });
        btnnuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar");
        btnnuevo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel1.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 260, 50));

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
        jPanel1.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        comboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESERVADO", "PAGADO", "NO PAGADO" }));
        comboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboestadoActionPerformed(evt);
            }
        });
        jPanel1.add(comboestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 90, -1));

        txtfechafina.setForeground(new java.awt.Color(102, 102, 102));
        txtfechafina.setBorder(null);
        txtfechafina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfechafinaMousePressed(evt);
            }
        });
        txtfechafina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechafinaActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechafina, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 140, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 140, 10));

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
        jPanel1.add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechainicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfechainicioMousePressed
 
        
    }//GEN-LAST:event_txtfechainicioMousePressed

    private void txtfechainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechainicioActionPerformed

    private void btnnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevoMouseEntered

    }//GEN-LAST:event_btnnuevoMouseEntered

    private void btnnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevoMouseExited

    }//GEN-LAST:event_btnnuevoMouseExited

    private void btnnuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevoMousePressed
        reserva dts = new reserva();
        reservaCRUD func= new reservaCRUD();
        
        dts.setFechaIngreso(txtfechainicio.getText());
        dts.setFechaSalida(txtfechafina.getText());
        int sestado=comboestado.getSelectedIndex();
        dts.setIdCliente(Integer.parseInt(txtidpersona.getText()));
        dts.setEstado(comboestado.getItemAt(sestado));
        dts.setIdHabitacion(Integer.parseInt(txthabitacion.getText()));

        func.insertar(dts);
        
        FrmReservaVista newframe = new FrmReservaVista();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnuevoMousePressed

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMousePressed
       
    }//GEN-LAST:event_txtnombreMousePressed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void comboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboestadoActionPerformed

    private void txtfechafinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfechafinaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechafinaMousePressed

    private void txtfechafinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechafinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechafinaActionPerformed

    private void txtidpersonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidpersonaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpersonaMousePressed

    private void txtidpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpersonaActionPerformed

    private void txthabitacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthabitacionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthabitacionMousePressed

    private void txthabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthabitacionActionPerformed

    private void txtnumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnumeroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroMousePressed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        huespedCRUD husCRUD = new huespedCRUD();
        String cliente=husCRUD.filtrarCliente(Integer.parseInt(txtidpersona.getText()));
        txtnombre.setText(cliente);        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reservaCRUD func= new reservaCRUD();
        String numero = func.fitrarHab(txtnumero.getText());
        txthabitacion.setText(numero);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReservaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReservaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReservaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReservaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReservaUp().setVisible(true);
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
    private javax.swing.JPanel btnnuevo;
    private javax.swing.JComboBox<String> comboestado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtfechafina;
    private javax.swing.JTextField txtfechainicio;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}