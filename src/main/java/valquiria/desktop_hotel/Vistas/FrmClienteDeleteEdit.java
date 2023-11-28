/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package valquiria.desktop_hotel.Vistas;

import valquiria.desktop_hotel.Implements.huespedCRUD;
import valquiria.desktop_hotel.Implements.habitacionCRUD;
import valquiria.desktop_hotel.Modelo.persona;
import valquiria.desktop_hotel.Modelo.habitacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Piero
 */
public class FrmClienteDeleteEdit extends javax.swing.JFrame {

    /**
     * Creates new form FrmClienteDeleteEdit
     */
    public FrmClienteDeleteEdit() {
        initComponents();
        txtid.setEnabled(false);
        txtcodigo.setEnabled(false);
        txtid.setText(FrmClienteVista.valoresCliente[3]);
        txtnombre.setText(FrmClienteVista.valoresCliente[0]);
        txtapellidos.setText(FrmClienteVista.valoresCliente[1]);
        txtnumero.setText(FrmClienteVista.valoresCliente[3]);
        txtdomicilio.setText(FrmClienteVista.valoresCliente[4]);
        txttelefono.setText(FrmClienteVista.valoresCliente[5]);
        txtcorreo.setText(FrmClienteVista.valoresCliente[6]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txttelefono = new javax.swing.JTextField();
        txtdomicilio = new javax.swing.JTextField();
        btneliminar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        combotipo = new javax.swing.JComboBox<>();
        Text6 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btneditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Actualizar Huesped");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Correo");
        jPanel1.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Domicilio");
        jPanel1.add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

        txttelefono.setForeground(new java.awt.Color(102, 102, 102));
        txttelefono.setText("Ingrese un número telefónico");
        txttelefono.setBorder(null);
        txttelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txttelefonoMousePressed(evt);
            }
        });
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 260, 30));

        txtdomicilio.setForeground(new java.awt.Color(102, 102, 102));
        txtdomicilio.setBorder(null);
        txtdomicilio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdomicilioMousePressed(evt);
            }
        });
        txtdomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdomicilioActionPerformed(evt);
            }
        });
        jPanel1.add(txtdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 260, 30));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar");
        btneliminar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 120, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        jPanel1.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

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
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Apellidos");
        jPanel1.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtapellidos.setForeground(new java.awt.Color(102, 102, 102));
        txtapellidos.setBorder(null);
        txtapellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtapellidosMousePressed(evt);
            }
        });
        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Tipo Documento");
        jPanel1.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

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
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 150, 10));

        combotipo
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC", "PASAPORTE", "CEDULA" }));
        jPanel1.add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, -1));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Teléfono");
        jPanel1.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        txtcorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtcorreo.setBorder(null);
        txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcorreoMousePressed(evt);
            }
        });
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 260, 10));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");
        btneditar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 120, 50));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 60, -1));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, -1));

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

    private void txttelefonoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txttelefonoMousePressed
        if (txtnombre.getText().equals("") || txtnombre.getText() == null || txtnombre.getText().equals(" "))
            txtnombre.setText("Ingrese el nombre");
        if (txtapellidos.getText().equals("") || txtapellidos.getText() == null || txtapellidos.getText().equals(" "))
            txtapellidos.setText("Ingrese el apellido paterno");
        if (txtnumero.getText().equals("") || txtnumero.getText() == null || txtnumero.getText().equals(" "))
            txtnumero.setText("Ingrese el apellido materno");
        if (txtdomicilio.getText().equals("") || txtdomicilio.getText() == null || txtdomicilio.getText().equals(" "))
            txtdomicilio.setText("Ingrese el domicilio");
        if (txttelefono.getText().equals("Ingrese un número telefónico"))
            txttelefono.setText("");
    }// GEN-LAST:event_txttelefonoMousePressed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txttelefonoActionPerformed

    private void txtdomicilioMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtdomicilioMousePressed

        if (txtnombre.getText().equals("") || txtnombre.getText() == null || txtnombre.getText().equals(" "))
            txtnombre.setText("Ingrese el nombre");
        if (txtapellidos.getText().equals("") || txtapellidos.getText() == null || txtapellidos.getText().equals(" "))
            txtapellidos.setText("Ingrese el apellido paterno");
        if (txtnumero.getText().equals("") || txtnumero.getText() == null || txtnumero.getText().equals(" "))
            txtnumero.setText("Ingrese el apellido materno");
        if (txtdomicilio.getText().equals("Ingrese el domicilio"))
            txtdomicilio.setText("");
        if (txttelefono.getText().equals("") || txttelefono.getText() == null || txttelefono.getText().equals(" "))
            txttelefono.setText("Ingrese un número telefónico");
    }// GEN-LAST:event_txtdomicilioMousePressed

    private void txtdomicilioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtdomicilioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtdomicilioActionPerformed

    private void btneliminarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneliminarMouseEntered

    }// GEN-LAST:event_btneliminarMouseEntered

    private void btneliminarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneliminarMouseExited

    }// GEN-LAST:event_btneliminarMouseExited

    private void btneliminarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneliminarMousePressed
        huespedCRUD func = new huespedCRUD();

        // Cracion de codigo aleatorio

        if (func.eliminar(Long.valueOf(txtid.getText()))) {
            JOptionPane.showConfirmDialog(rootPane, "El huesped se elimino correctamente");
            txtid.setText("");
            txtnombre.setText("");
            txtapellidos.setText("");
            txtdomicilio.setText("");
            txttelefono.setText("");
            txtcorreo.setText("");
            txtnumero.setText("");
        }
        FrmClienteVista newframe = new FrmClienteVista();
        newframe.setVisible(true);
        this.dispose();

    }// GEN-LAST:event_btneliminarMousePressed

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtnombreMousePressed
        if (txtnombre.getText().equals("Ingrese el nombre"))
            txtnombre.setText("");
        if (txtapellidos.getText().equals("") || txtapellidos.getText() == null || txtapellidos.getText().equals(" "))
            txtapellidos.setText("Ingrese el apellido paterno");
        if (txtnumero.getText().equals("") || txtnumero.getText() == null || txtnumero.getText().equals(" "))
            txtnumero.setText("Ingrese el apellido materno");
        if (txtdomicilio.getText().equals("") || txtdomicilio.getText() == null || txtdomicilio.getText().equals(" "))
            txtdomicilio.setText("Ingrese el domicilio");
        if (txttelefono.getText().equals("") || txttelefono.getText() == null || txttelefono.getText().equals(" "))
            txttelefono.setText("Ingrese un número telefónico");
    }// GEN-LAST:event_txtnombreMousePressed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidosMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtapellidosMousePressed
        if (txtnombre.getText().equals("") || txtnombre.getText() == null || txtnombre.getText().equals(" "))
            txtnombre.setText("Ingrese el nombre");
        if (txtapellidos.getText().equals("Ingrese el apellido paterno"))
            txtapellidos.setText("");
        if (txtnumero.getText().equals("") || txtnumero.getText() == null || txtnumero.getText().equals(" "))
            txtnumero.setText("Ingrese el apellido materno");
        if (txtdomicilio.getText().equals("") || txtdomicilio.getText() == null || txtdomicilio.getText().equals(" "))
            txtdomicilio.setText("Ingrese el domicilio");
        if (txttelefono.getText().equals("") || txttelefono.getText() == null || txttelefono.getText().equals(" "))
            txttelefono.setText("Ingrese un número telefónico");
    }// GEN-LAST:event_txtapellidosMousePressed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtapellidosActionPerformed

    private void txtnumeroMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtnumeroMousePressed
        if (txtnombre.getText().equals("") || txtnombre.getText() == null || txtnombre.getText().equals(" "))
            txtnombre.setText("Ingrese el nombre");
        if (txtnumero.getText().equals("Ingrese el apellido materno"))
            txtnumero.setText("");
        if (txtapellidos.getText().equals("") || txtapellidos.getText() == null || txtapellidos.getText().equals(" "))
            txtapellidos.setText("Ingrese el apellido paterno");
        if (txtdomicilio.getText().equals("") || txtdomicilio.getText() == null || txtdomicilio.getText().equals(" "))
            txtdomicilio.setText("Ingrese el domicilio");
        if (txttelefono.getText().equals("") || txttelefono.getText() == null || txttelefono.getText().equals(" "))
            txttelefono.setText("Ingrese un número telefónico");
    }// GEN-LAST:event_txtnumeroMousePressed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtnumeroActionPerformed

    private void txtcorreoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtcorreoMousePressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtcorreoMousePressed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtcorreoActionPerformed

    private void btneditarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneditarMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_btneditarMouseEntered

    private void btneditarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneditarMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_btneditarMouseExited

    private void btneditarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btneditarMousePressed
        // TODO add your handling code here:
        persona dts = new persona();
        huespedCRUD func = new huespedCRUD();

        dts.setCorreo(txtcorreo.getText());

        int stipo = combotipo.getSelectedIndex();

        dts.setTipo_doc(combotipo.getItemAt(stipo));
        dts.setTelefono(txttelefono.getText());
        dts.setDireccion(txtdomicilio.getText());
        dts.setNumero_documento(Long.valueOf(txtnumero.getText()));
        dts.setNombre(txtnombre.getText());
        dts.setApellidos(txtapellidos.getText());

        if (func.editar(dts, Long.valueOf(txtid.getText()))) {
            JOptionPane.showConfirmDialog(rootPane, "El huesped se edito correctamente");
            txtid.setText("");
            txtnombre.setText("");
            txtapellidos.setText("");
            txtdomicilio.setText("");
            txttelefono.setText("");
            txtcorreo.setText("");
            txtnumero.setText("");
            txtcodigo.setText("");
        }

        FrmClienteVista newframe = new FrmClienteVista();
        newframe.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btneditarMousePressed

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
            java.util.logging.Logger.getLogger(FrmClienteDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClienteDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClienteDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClienteDeleteEdit.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClienteDeleteEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btneditar;
    private javax.swing.JPanel btneliminar;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdomicilio;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
