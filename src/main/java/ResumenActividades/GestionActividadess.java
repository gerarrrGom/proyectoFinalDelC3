/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ResumenActividades;

import java.awt.AWTKeyStroke;
import java.awt.Component;
import java.awt.RenderingHints.Key;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class GestionActividadess extends javax.swing.JDialog {
    private ListaDeActividades a;
    private boolean situacion;
    private DefaultListModel l= new DefaultListModel(); 
    /**
     * Creates new form GestionActividadess
     */
    public GestionActividadess(java.awt.Frame parent, boolean modal,ListaDeActividades a) {
        super(parent, modal);
        initComponents();
        this.a=a;
        situacionBase();
        situacion=false;
        llenarActividades();
        this.listActividades.setModel(l);
        this.btnSalir.setSize(75, 25
        );
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
        jScrollPane2 = new javax.swing.JScrollPane();
        listActividades = new javax.swing.JList<>();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblActividad = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agrega/elimina actividades");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Actividades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listActividades.setToolTipText("Seleccionar Actividad");
        listActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listActividadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listActividades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 290));

        btnSalir.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(75, 25));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 80, 40));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblActividad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblActividad.setText("Actividad");
        lblActividad.setToolTipText("Nombre de la actividad");
        jPanel2.add(lblActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, -1));

        txtActividad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtActividadKeyPressed(evt);
            }
        });
        jPanel2.add(txtActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 350, 30));

        btnAgregar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAgregar.setText("+");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 80, 40));

        btnAceptar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Guardar la actividad");
        btnAceptar.setPreferredSize(new java.awt.Dimension(75, 25));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarKeyPressed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 80, 40));

        btnEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEliminar.setText("-");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 80, 40));

        btnCancelar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(75, 25));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 80, 40));

        txtIndice.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtIndice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndiceKeyPressed(evt);
            }
        });
        jPanel2.add(txtIndice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Indice:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 550, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        situacionBase();
        this.listActividades.clearSelection();
        this.txtIndice.requestFocus();
        this.txtIndice.setText("");
        this.txtActividad.setText("");
        this.btnAgregar.setVisible(false);
        this.txtActividad.setVisible(true);
        this.lblActividad.setVisible(true);
        this.btnCancelar.setVisible(true);
        this.btnAceptar.setVisible(true);
        this.situacion=false;
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        situacionBase();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        if(!situacion){
            try{
                this.a.agregarActividad(new Actividad(Double.parseDouble(this.txtIndice.getText()),this.txtActividad.getText()));
                Collections.sort(a.getListaDeActividades());
                llenarActividades();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Ingresa un indice valido");
            }
            
        }else{
            a.eliminarActividad(Double.parseDouble(this.txtIndice.getText()));
        }
        situacion=false;
        llenarActividades();
        situacionBase();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        this.btnCancelar.setVisible(true);
        this.btnAceptar.setVisible(true);    
        this.btnEliminar.setVisible(false);
        this.txtIndice.setEditable(false);
        this.txtActividad.setEditable(false);
        this.btnAgregar.setVisible(false);
        this.txtActividad.setVisible(true);
        this.lblActividad.setVisible(true);
        situacion=true;
            
            
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        situacionBase();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void listActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listActividadesMouseClicked
        
        int indice=this.listActividades.getAnchorSelectionIndex();
        l.get(indice);
        
        Actividad a1 = a.getListaDeActividades().get(indice);
        this.lblActividad.setVisible(true);
        this.txtActividad.setVisible(true);
        this.txtIndice.setText(a1.getIndice()+"");
        this.txtActividad.setText(a1.getActividad());
        this.btnEliminar.setVisible(true);
        
            
    }//GEN-LAST:event_listActividadesMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtIndiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndiceKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.txtActividad.requestFocus();
            }
        
    }//GEN-LAST:event_txtIndiceKeyPressed

    private void txtActividadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActividadKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
                btnAceptarKeyPressed(evt);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_txtActividadKeyPressed

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAceptarKeyPressed
        if(!situacion){
            try{
                this.a.agregarActividad(new Actividad(Double.parseDouble(this.txtIndice.getText()),this.txtActividad.getText()));
                Collections.sort(a.getListaDeActividades());
                llenarActividades();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Ingresa un indice valido");
            }
            
        }else{
            a.eliminarActividad(Double.parseDouble(this.txtIndice.getText()));
        }
        situacion=false;
        llenarActividades();
        situacionBase();
    }//GEN-LAST:event_btnAceptarKeyPressed

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
            java.util.logging.Logger.getLogger(GestionActividadess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionActividadess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionActividadess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionActividadess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionActividadess dialog = new GestionActividadess(new javax.swing.JFrame(), true,new ListaDeActividades());
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JList<String> listActividades;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtIndice;
    // End of variables declaration//GEN-END:variables
     private void situacionBase(){
        this.btnAceptar.setVisible(false);
        this.btnCancelar.setVisible(false);
        this.btnEliminar.setVisible(false);
        this.txtActividad.setVisible(false);
        this.txtActividad.setEditable(true);
        this.lblActividad.setVisible(false);
        this.txtIndice.setEditable(true);
        this.txtIndice.setText("");
        this.btnAgregar.setVisible(true);
    }
     private void llenarActividades(){
         l.setSize(0);
         int posicion=0;
         for(Actividad a1 : a.getListaDeActividades()){
            l.add(posicion,a1.getIndice()+".-"+a1.getActividad());
            posicion++;
         }
     }
     public ListaDeActividades regresarActividades(){
         return a;
     }

}
