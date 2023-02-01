/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cesar.gestionAcademica4;

import java.util.Calendar;

/**
 *
 * @author cesar
 */
public class FrmRegistrar extends javax.swing.JDialog {
    private Gestion t;
    private BDActividades bd;
    


    /**
     * Creates new form FrmRegistrar
     */
    public FrmRegistrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
       this.setLocationRelativeTo(null);
       this.txtOtro.setVisible(false);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcomboActividad = new javax.swing.JComboBox<>();
        jdateInicio = new com.toedter.calendar.JDateChooser();
        jdateFin = new com.toedter.calendar.JDateChooser();
        txtOtro = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtComision.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComisionKeyReleased(evt);
            }
        });
        jPanel1.add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Actividad:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Comisión o puesto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Periodo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Inicio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Fin:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jcomboActividad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jcomboActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Radio", "Conferencia", "Foro", "Viaje", "otro" }));
        jcomboActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboActividadActionPerformed(evt);
            }
        });
        jPanel1.add(jcomboActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, -1));
        jPanel1.add(jdateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));
        jPanel1.add(jdateFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));
        jPanel1.add(txtOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 190, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 460, 260));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComisionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComisionKeyReleased

    }//GEN-LAST:event_txtComisionKeyReleased

    private void jcomboActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboActividadActionPerformed
        if(this.jcomboActividad.getSelectedItem().toString().compareToIgnoreCase("otro")==0){
            this.txtOtro.setVisible(true);
            this.jcomboActividad.setVisible(false);
        }else{
            this.txtOtro.setVisible(false);
            this.jcomboActividad.setVisible(true);
        }
    }//GEN-LAST:event_jcomboActividadActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        if(!this.txtOtro.isVisible()){
            String actividad = (String) jcomboActividad.getSelectedItem();
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
            t=(new Gestion(actividad, comision, periodo));
            //this.jdateInicio.setDateFormatString(fecha);
            //this.jdateFin.setDateFormatString(fecha2);
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
            t=(new Gestion(actividad2, comision, periodo));
            //this.jdateInicio.setDateFormatString(fecha);
            //this.jdateFin.setDateFormatString(fecha2);
           
        }
        this.jcomboActividad.setVisible(true);
        this.txtOtro.setVisible(false);
        this.txtOtro.setText(null);
        this.txtComision.setText(null);
        //this.jdateInicio.setText(fecha);
       this.jdateInicio.setCalendar(null);
       this.jdateFin.setCalendar(null);
       this.dispose();
      
        
        
    
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       t=null;
       this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrar dialog = new FrmRegistrar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcomboActividad;
    private com.toedter.calendar.JDateChooser jdateFin;
    private com.toedter.calendar.JDateChooser jdateInicio;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtOtro;
    // End of variables declaration//GEN-END:variables
    public Gestion getT(){
        return t;
    }
}
