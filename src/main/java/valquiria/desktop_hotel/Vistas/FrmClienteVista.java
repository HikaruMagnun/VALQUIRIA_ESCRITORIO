
package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.DAOImpl.HuespedDAOImpl;
import javax.swing.table.DefaultTableModel;

public class FrmClienteVista extends javax.swing.JFrame {
    public static String[] valoresCliente = new String[7];

    public FrmClienteVista() {
        initComponents();
        DefaultTableModel modelo;
        HuespedDAOImpl func = new HuespedDAOImpl();
        modelo = func.mostrar(txtbuscar.getText());
        tablalistado.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        body3 = new javax.swing.JPanel();
        Title3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtbuscar = new javax.swing.JTextField();
        search = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JPanel();
        act = new javax.swing.JLabel();
        Salir = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btnnuevo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Salir1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Huespedes");
        jPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(250, 10));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        txtbuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtbuscar.setBorder(null);
        txtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtbuscarMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtbuscarMouseReleased(evt);
            }
        });
        jPanel4.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        search.setBackground(new java.awt.Color(18, 90, 173));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
        });
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar");
        search.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        jPanel4.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        btnactualizar.setBackground(new java.awt.Color(18, 90, 173));
        btnactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnactualizarMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnactualizarMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnactualizarMousePressed(evt);
            }
        });
        btnactualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        act.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        act.setForeground(new java.awt.Color(255, 255, 255));
        act.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        act.setText("Actualizar");
        act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actMousePressed(evt);
            }
        });
        btnactualizar.add(act, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jPanel4.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 100, -1));

        Salir.setBackground(new java.awt.Color(18, 90, 173));
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirMousePressed(evt);
            }
        });
        Salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Salir");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        Salir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        jPanel4.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 80, -1));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablalistadoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablalistado);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 740, 280));

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nuevo");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        btnnuevo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        jPanel4.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 80, -1));

        Salir1.setBackground(new java.awt.Color(18, 90, 173));
        Salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Salir1MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Salir1MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                Salir1MousePressed(evt);
            }
        });
        Salir1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Servicio");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        Salir1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jPanel4.add(Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 80, -1));

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

    private void actMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_actMousePressed
        // TODO add your handling code here:
        FrmClienteDeleteEdit f1 = new FrmClienteDeleteEdit();
        f1.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_actMousePressed

    private void btnactualizarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnactualizarMouseEntered

    }// GEN-LAST:event_btnactualizarMouseEntered

    private void btnactualizarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnactualizarMouseExited

    }// GEN-LAST:event_btnactualizarMouseExited

    private void btnactualizarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnactualizarMousePressed
        FrmClienteDeleteEdit f6 = new FrmClienteDeleteEdit();
        f6.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnactualizarMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MousePressed
        // Abrir sección
        this.dispose();
    }// GEN-LAST:event_jLabel3MousePressed

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SalirMouseEntered

    }// GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SalirMouseExited

    }// GEN-LAST:event_SalirMouseExited

    private void SalirMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SalirMousePressed

        this.dispose();
    }// GEN-LAST:event_SalirMousePressed

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablalistadoMousePressed
        if (evt.getClickCount() == 1) {
            int fila = tablalistado.getSelectedRow();

            for (int i = 0; i < valoresCliente.length; i++) {
                Object value = tablalistado.getValueAt(fila, i);
                if (value != null) {
                    valoresCliente[i] = value.toString();
                }
            }

            // FrmHabitacionDeleteEdit.txtid.setText("");
            // FrmHabitacionDeleteEdit.txtnumero.setText("");
            // FrmHabitacionDeleteEdit.txtestado.setText("");
            // FrmHabitacionDeleteEdit.txtprecio.setText("");

        }
    }// GEN-LAST:event_tablalistadoMousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        FrmClienteUp f2 = new FrmClienteUp();
        f2.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel5MousePressed

    private void btnnuevoMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnnuevoMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btnnuevoMouseEntered

    private void btnnuevoMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnnuevoMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btnnuevoMouseExited

    private void btnnuevoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnnuevoMousePressed
        // TODO add your handling code here:
        FrmClienteUp f2 = new FrmClienteUp();
        f2.setVisible(true);
        this.dispose();

    }// GEN-LAST:event_btnnuevoMousePressed

    private void txtbuscarMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtbuscarMouseReleased

    }// GEN-LAST:event_txtbuscarMouseReleased

    private void txtbuscarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtbuscarMousePressed

    }// GEN-LAST:event_txtbuscarMousePressed

    private void searchMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMousePressed
        DefaultTableModel modelo;
        HuespedDAOImpl func = new HuespedDAOImpl();
        modelo = func.mostrar(txtbuscar.getText());
        tablalistado.setModel(modelo);
    }// GEN-LAST:event_searchMousePressed

    private void searchMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMouseExited

    }// GEN-LAST:event_searchMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMouseEntered

    }// GEN-LAST:event_searchMouseEntered

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel6MousePressed

    private void Salir1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Salir1MouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_Salir1MouseEntered

    private void Salir1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Salir1MouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_Salir1MouseExited

    private void Salir1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Salir1MousePressed
        // TODO add your handling code here:
        FrmServcioEditDelete f2 = new FrmServcioEditDelete();
        f2.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_Salir1MousePressed

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
            java.util.logging.Logger.getLogger(FrmClienteVista.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClienteVista.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClienteVista.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClienteVista.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClienteVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Salir;
    private javax.swing.JPanel Salir1;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel act;
    private javax.swing.JPanel body3;
    private javax.swing.JPanel btnactualizar;
    private javax.swing.JPanel btnnuevo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel search;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
