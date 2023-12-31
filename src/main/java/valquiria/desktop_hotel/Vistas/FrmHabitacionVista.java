package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.DAOImpl.HabitacionDAOImpl;
import valquiria.desktop_hotel.Modelo.habitacion;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtid;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtnumero;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtprecio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static valquiria.desktop_hotel.Vistas.FrmHabitacionDeleteEdit.txtpiso;

public class FrmHabitacionVista extends javax.swing.JFrame {

    public static String numero, precio, estado, id;
    public int hola;

    public FrmHabitacionVista() {
        initComponents();
        DefaultTableModel modelo;
        HabitacionDAOImpl func = new HabitacionDAOImpl();
        modelo = func.mostrar("");
        tablalistado.setModel(modelo);
        this.setLocationRelativeTo(null);
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
        btnnuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        Salir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body3.setBackground(new java.awt.Color(255, 255, 255));
        body3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(body3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Habitaciones");
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        btnnuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        jPanel4.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 80, -1));

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salir");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        Salir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        jPanel4.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 80, -1));

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

    private void txtbuscarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtbuscarMousePressed

    }// GEN-LAST:event_txtbuscarMousePressed

    private void txtbuscarMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtbuscarMouseReleased
        // nothing
    }// GEN-LAST:event_txtbuscarMouseReleased

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_searchMouseExited

    private void searchMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMousePressed
        DefaultTableModel modelo;
        HabitacionDAOImpl func = new HabitacionDAOImpl();
        modelo = func.mostrar(txtbuscar.getText());
        tablalistado.setModel(modelo);
    }// GEN-LAST:event_searchMousePressed

    private void btnactualizarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnactualizarMouseEntered

    }// GEN-LAST:event_btnactualizarMouseEntered

    private void btnactualizarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnactualizarMouseExited

    }// GEN-LAST:event_btnactualizarMouseExited

    private void btnactualizarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnactualizarMousePressed
        FrmHabitacionDeleteEdit f1 = new FrmHabitacionDeleteEdit();
        f1.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnactualizarMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MousePressed
        // Abrir sección
        FrmHabitacionUp f1 = new FrmHabitacionUp();
        f1.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel3MousePressed

    private void btnnuevoMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnnuevoMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btnnuevoMouseEntered

    private void btnnuevoMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnnuevoMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btnnuevoMouseExited

    private void btnnuevoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnnuevoMousePressed
        // Abrir sección
        FrmHabitacionUp f1 = new FrmHabitacionUp();
        f1.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnnuevoMousePressed

    private void actMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_actMousePressed
        // TODO add your handling code here:
        FrmHabitacionDeleteEdit f1 = new FrmHabitacionDeleteEdit();
        f1.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_actMousePressed

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablalistadoMousePressed
        if (evt.getClickCount() == 1) {
            int fila = tablalistado.getSelectedRow();

            id = tablalistado.getValueAt(fila, 0).toString();
            numero = tablalistado.getValueAt(fila, 0).toString();
            precio = tablalistado.getValueAt(fila, 1).toString();
            estado = tablalistado.getValueAt(fila, 3).toString();
            // FrmHabitacionDeleteEdit.txtid.setText("");
            // FrmHabitacionDeleteEdit.txtnumero.setText("");
            // FrmHabitacionDeleteEdit.txtestado.setText("");
            // FrmHabitacionDeleteEdit.txtprecio.setText("");

        }
    }// GEN-LAST:event_tablalistadoMousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MousePressed
        // Abrir sección

        this.dispose();
    }// GEN-LAST:event_jLabel5MousePressed

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SalirMouseEntered

    }// GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SalirMouseExited

    }// GEN-LAST:event_SalirMouseExited

    private void SalirMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SalirMousePressed

        this.dispose();
    }// GEN-LAST:event_SalirMousePressed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHabitacionVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Salir;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel act;
    private javax.swing.JPanel body3;
    private javax.swing.JPanel btnactualizar;
    private javax.swing.JPanel btnnuevo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel search;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
