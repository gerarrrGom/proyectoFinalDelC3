/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package SaulJM27;
import java.util.LinkedList;
import utilidades.ObjetosParaEditar;
/**
 *
 * @author Saul
 */
public class IndicadoresCuantitativos extends javax.swing.JDialog {
     private ModeloIndicadores I; 
    private BDIndicadores bd;
    /**
     * Creates new form IndicadoresCuantitativos
     */
    public IndicadoresCuantitativos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jButtonEliminar.setVisible(false); 
        this.jButtonEditar.setVisible(false); 
        I=new ModeloIndicadores(); 
        this.jTable1.setModel(I);
        bd=new BDIndicadores();
       LinkedList<Indicadores> lista=bd.obtener();
       for(int i=0;i<lista.size();i++){
          I.agregarIndicadores(lista.get(i));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 160));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButtonEditar.setText("Editar");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
            }
        });
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 230));

        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked
        CrearIndicadores n = new CrearIndicadores(null, true);
        n.setVisible(true);
        Indicadores c = n.regresaIndicadores();
        this.I.agregarIndicadores(c);
        for (int i = 0; i < I.getIndicadores().total(); i++) {
            bd.registrarActividad(I.getIndicadores().obtener(i));
        }             
    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
         ListaIndicadores indicadores = I.getIndicadores();
        bd.borrar();
        for (int i = 0; i <indicadores.size(); i++) {
            bd.registrarActividad(indicadores.getIndicadores(i));
        }
    }//GEN-LAST:event_jButtonGuardarMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
         int o=jTable1.getSelectedRow();
         I.eliminarIndicadores(o);
         this.jButtonEliminar.setVisible(false);
         this.jButtonEditar.setVisible(false);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         this.jButtonEliminar.setVisible(true);
         this.jButtonEditar.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
         int n = this.jTable1.getSelectedRow();
        ObjetosParaEditar.c = I.getIndicadores().obtener(n);
        CrearIndicadores a = new CrearIndicadores(null, true);
        a.setVisible(true);
        I.eliminarIndicadores(n);
        if (a.regresaIndicadores()!= null) {
            ListaIndicadores c;
            c = new ListaIndicadores();
            LinkedList p = I.getIndicadores().getIndicadores();
            p.add(n, a.regresaIndicadores());
            c.setLista(p);
            I.setIndicadores(c);
        }
    }//GEN-LAST:event_jButtonEditarMouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        int v=this.jTable1.getSelectedRow();
        I.eliminarIndicadores(v);
    }//GEN-LAST:event_jButtonEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(IndicadoresCuantitativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndicadoresCuantitativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndicadoresCuantitativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndicadoresCuantitativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IndicadoresCuantitativos dialog = new IndicadoresCuantitativos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
