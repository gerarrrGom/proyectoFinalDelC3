/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cesar.gestionAcademica4;

import java.util.Calendar;
import java.util.LinkedList;

/**
 *
 * @author cesar
 */
public class GestionAcademica extends javax.swing.JDialog {
    private TablaGestion t;
    private BDActividades bd;
    /**
     * Creates new form GestionAcademica
     */
    public GestionAcademica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.txtBuscar.requestFocus();
        this.btnEditar.setVisible(false);
       this.btnEliminar.setVisible(false);
       this.txtOtro.setVisible(false);
       t=new TablaGestion();
       this.jTable1.setModel(t);
       bd=new BDActividades();
       LinkedList<Gestion> lista=bd.obtener();
       for(int i=0;i<lista.size();i++){
           t.agregarActividad(lista.get(i));
       }
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
        txtComision = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jcomboActividad = new javax.swing.JComboBox<>();
        jdateInicio = new com.toedter.calendar.JDateChooser();
        jdateFin = new com.toedter.calendar.JDateChooser();
        txtOtro = new javax.swing.JTextField();
        btnPdf = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTIÓN ACADÉMICA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtComision.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComisionKeyReleased(evt);
            }
        });
        jPanel1.add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, 30));

        btnBuscar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 25));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Actividad:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Comisión o puesto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 140, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Periodo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Inicio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Fin:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnAgregar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 25));

        btnEditar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 80, 25));

        btnEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 80, 25));

        btnSalir.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSalir.setText("Salir y Guardar");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 120, 25));

        jcomboActividad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jcomboActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Radio", "Conferencia", "Foro", "Viaje", "otro" }));
        jcomboActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboActividadActionPerformed(evt);
            }
        });
        jPanel1.add(jcomboActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 170, 30));
        jPanel1.add(jdateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));
        jPanel1.add(jdateFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));
        jPanel1.add(txtOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, -1));

        btnPdf.setText("Crear PDF");
        jPanel1.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 390, 220));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
         ListaGestion actividades=t.getActividades();
        for(int i=0;i<actividades.size();i++){
            bd.registrarActividad(actividades.getActividad(i));
        }
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtComisionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComisionKeyReleased
       
    }//GEN-LAST:event_txtComisionKeyReleased

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if(!txtBuscar.getText().isEmpty()){
            btnEditar.setVisible(true);
            btnEliminar.setVisible(true);
        }else{
            btnEditar.setVisible(false);
            btnEliminar.setVisible(false);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        //String actividad=this.jcomboActividad.getItemAt(WIDTH);
        if(!this.txtOtro.isVisible()){
            String actividad = jcomboActividad.getSelectedItem().toString();
            String comision = this.txtComision.getText();
            String dia = Integer.toString(jdateInicio.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jdateInicio.getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(jdateInicio.getCalendar().get(Calendar.YEAR));
            String fecha = (dia + "/" + mes + "/" + year);
            String dia1 = Integer.toString(jdateFin.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes1 = Integer.toString(jdateFin.getCalendar().get(Calendar.MONTH) + 1);
            String year1 = Integer.toString(jdateFin.getCalendar().get(Calendar.YEAR));
            String fecha2 = (dia1 + "/" + mes1 + "/" + year1);
            String periodo = "Inicio:" + fecha + "     " + "Fin:" + fecha2;
            t.agregarActividad(new Gestion(actividad, comision, periodo));
        }else{
            String actividad2 = this.txtOtro.getText();
            String comision = this.txtComision.getText();
            String dia = Integer.toString(jdateInicio.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jdateInicio.getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(jdateInicio.getCalendar().get(Calendar.YEAR));
            String fecha = (dia + "/" + mes + "/" + year);
            String dia1 = Integer.toString(jdateFin.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes1 = Integer.toString(jdateFin.getCalendar().get(Calendar.MONTH) + 1);
            String year1 = Integer.toString(jdateFin.getCalendar().get(Calendar.YEAR));
            String fecha2 = (dia1 + "/" + mes1 + "/" + year1);
            String periodo = "Inicio:" + fecha + "     " + "Fin:" + fecha2;
            t.agregarActividad(new Gestion(actividad2, comision, periodo));
        }
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void jcomboActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboActividadActionPerformed
        if(this.jcomboActividad.getSelectedItem().toString().compareToIgnoreCase("otro")==0){
            this.txtOtro.setVisible(true);
            this.jcomboActividad.setVisible(false);
        }else{
             this.txtOtro.setVisible(false);
             this.jcomboActividad.setVisible(true);
         }
    }//GEN-LAST:event_jcomboActividadActionPerformed

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
            java.util.logging.Logger.getLogger(GestionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionAcademica dialog = new GestionAcademica(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcomboActividad;
    private com.toedter.calendar.JDateChooser jdateFin;
    private com.toedter.calendar.JDateChooser jdateInicio;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtOtro;
    // End of variables declaration//GEN-END:variables
}
