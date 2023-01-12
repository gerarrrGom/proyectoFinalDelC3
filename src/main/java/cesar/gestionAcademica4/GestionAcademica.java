/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cesar.gestionAcademica4;

/**
 *
 * @author cesar
 */
public class GestionAcademica extends javax.swing.JDialog {

    /**
     * Creates new form GestionAcademica
     */
    public GestionAcademica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.txtBuscar.requestFocus();
        this.btnEditar.setVisible(false);
       this.btnEliminar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        txtBuscar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtComision = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFin = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTIÓN ACADÉMICA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Actividades"));
        jScrollPane1.setViewportView(textArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 370));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 160, -1));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Actividad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));
        getContentPane().add(txtActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Comisión o puesto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));
        getContentPane().add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Periodo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Inicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));
        getContentPane().add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Fin:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));
        getContentPane().add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 120, -1));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if(!txtBuscar.getText().isEmpty()){
            btnEditar.setVisible(true);
            btnEliminar.setVisible(true);
        }else{
            btnEditar.setVisible(false);
            btnEliminar.setVisible(false);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        //this.btnEditar.setVisible(false);
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        //this.btnEliminar.setVisible(false);
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked

    }//GEN-LAST:event_btnBuscarMouseClicked

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
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    // End of variables declaration//GEN-END:variables
}
