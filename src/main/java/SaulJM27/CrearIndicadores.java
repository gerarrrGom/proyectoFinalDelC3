/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package SaulJM27;
import java.awt.Frame;
import utilidades.ObjetosParaEditar;
/**
 *
 * @author Saul
 */
public class CrearIndicadores extends javax.swing.JDialog {
    private Indicadores c;
    /**
     * Creates new form CrearIndicadores
     * @param parent
     */
    public CrearIndicadores(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if(ObjetosParaEditar.c!=null){
            c=ObjetosParaEditar.c;
            int n=c.getNumeroDeProyecto();
            this.jTextFieldNumeroDeProy.setText(n+"");
            int l=c.getNumeroIndicador();
            this.jTextFieldNumeroIndicador.setText(l+"");
            this.jTextFieldDescripcion.setText(c.getDescripcion());
        }
           this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNumeroDeProy = new javax.swing.JTextField();
        jTextFieldNumeroIndicador = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNumeroDeProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeProyActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroDeProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, 30));

        jTextFieldNumeroIndicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroIndicadorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroIndicador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, 30));
        getContentPane().add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, 30));

        jButton1.setText("Agregar al Archivo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel1.setText("Núm. Proyecto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel2.setText("Núm. indicador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroDeProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeProyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroDeProyActionPerformed

    private void jTextFieldNumeroIndicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroIndicadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroIndicadorActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int n=Integer.parseInt(this.jTextFieldNumeroDeProy.getText());
        int a=Integer.parseInt(this.jTextFieldNumeroIndicador.getText());
        String Descripcion=this.jTextFieldDescripcion.getText(); 
        c=new Indicadores(n, a,Descripcion);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(CrearIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearIndicadores dialog = new CrearIndicadores(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldNumeroDeProy;
    private javax.swing.JTextField jTextFieldNumeroIndicador;
    // End of variables declaration//GEN-END:variables

     public Indicadores regresaIndicadores() {
        return c; 
     }
}