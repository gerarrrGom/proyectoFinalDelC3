/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package docencia;

import utilidades.ObjetosParaEditar;

/**
 *
 * @author cardo
 */
public class FrmActividades3 extends javax.swing.JDialog {

    private ModeloActividades modelo;
    private BDActividades bd;
    private CursosImpartidos c;

    /**
     * Creates new form FrmActividades3
     */
    public FrmActividades3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         bd = new BDActividades();
        modelo = new ModeloActividades();
        c = ObjetosParaEditar.curso;
        this.setTitle("Agrega actividades en "+ c.getCarrera().getNombreCarrera());
        this.tblActividad.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividad = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarActividad = new javax.swing.JButton();
        btnEditarActividad = new javax.swing.JButton();
        btnEliminarActividad = new javax.swing.JButton();
        btnGuardarActividad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblActividad.setBackground(new java.awt.Color(245, 245, 220));
        tblActividad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblActividad);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 270));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarActividad.setBackground(new java.awt.Color(153, 204, 255));
        btnAgregarActividad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAgregarActividad.setText("Agregar Actividad");
        btnAgregarActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 30));

        btnEditarActividad.setBackground(new java.awt.Color(153, 204, 255));
        btnEditarActividad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEditarActividad.setText("Editar Actividad");
        jPanel3.add(btnEditarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        btnEliminarActividad.setBackground(new java.awt.Color(153, 204, 255));
        btnEliminarActividad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEliminarActividad.setText("Eliminar Actividad");
        jPanel3.add(btnEliminarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 160, 30));

        btnGuardarActividad.setBackground(new java.awt.Color(153, 255, 255));
        btnGuardarActividad.setFont(new java.awt.Font("BodoniFLF", 1, 18)); // NOI18N
        btnGuardarActividad.setText("Guardar");
        btnGuardarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarActividadMouseClicked(evt);
            }
        });
        jPanel3.add(btnGuardarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 650, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarActividadMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnGuardarActividadMouseClicked

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
            java.util.logging.Logger.getLogger(FrmActividades3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmActividades3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmActividades3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmActividades3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmActividades3 dialog = new FrmActividades3(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarActividad;
    private javax.swing.JButton btnEditarActividad;
    private javax.swing.JButton btnEliminarActividad;
    private javax.swing.JButton btnGuardarActividad;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblActividad;
    // End of variables declaration//GEN-END:variables
}
