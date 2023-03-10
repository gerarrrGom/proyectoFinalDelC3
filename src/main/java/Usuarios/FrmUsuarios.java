/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Usuarios;

import GestionDeProfesores.BDProfesores;
import GestionDeProfesores.ListaProfesores;
import GestionDeProfesores.Profesor;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import utilidades.DatosEnEjecucion;

/**
 *
 @author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class FrmUsuarios extends javax.swing.JInternalFrame {

    private DefaultListModel l;
    private BDUsuarios bd;
    private BDProfesores bd1;
    private LinkedList<Profesor> profe;
    private LinkedList<Usuario> usuarios;

    /**
     * Creates new form NewJInternalFrame
     */
    public FrmUsuarios() {
        initComponents();

        bd1 = new BDProfesores();
        profe = bd1.obtener();
        l = new DefaultListModel();
        this.jList1.setModel(l);
        bd = new BDUsuarios();
        this.closable = true;
        usuarios = new LinkedList<>();
        usuarios = bd.obtener();
        llenarLista();
        llenarCombo();

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
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cboProfesor = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(108, 160, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 390, 230));

        jPanel2.setBackground(new java.awt.Color(245, 245, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Profesor");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 20));

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("registrar a bd y salir");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 100, 40));

        jLabel4.setText("Permisos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", " " }));
        jComboBox1.setToolTipText("permisos del usuario");
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 70, -1));

        cboProfesor.setToolTipText("usuario a modificar");
        jPanel2.add(cboProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, -1));

        jButton2.setText("Registrar");
        jButton2.setToolTipText("ModificarPermisos");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 100, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 500, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        bd.borrar();
        llenarArchivo();

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        usuarios.add(new Usuario(profe.get(this.cboProfesor.getSelectedIndex()), Integer.parseInt(this.jComboBox1.getSelectedItem().toString())));
        llenarLista2();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int pos = this.jList1.getSelectedIndex();
        usuarios.remove(pos);
        llenarLista();
        llenarCombo();
    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboProfesor;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void llenarLista() {
        l.clear();
        if (!usuarios.isEmpty()) {
            for (Usuario a : usuarios) {
                l.addElement(a.getDatos().getUsuario() + " permisos: " + a.getPermisos());
            }
        }
    }

    private void llenarArchivo() {
        bd.borrar();
        for (Usuario a : usuarios) {
            bd.registrarUsuario(a);
        }
    }

    private void llenarCombo() {
        this.cboProfesor.removeAllItems();
        if (!profe.isEmpty()) {
            int i = 0;
            for (Profesor p : profe) {
                try {
                    if (usuarios.get(i).getDatos().getUsuario().compareTo(p.getUsuario()) == 0) {
                    } else {
                        this.cboProfesor.addItem(p.getUsuario());
                    }
                } catch (IndexOutOfBoundsException e) {
                    this.cboProfesor.addItem(p.getUsuario());
                }

            }
        }
    }

    private void llenarLista2() {
        try {
            l.clear();
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario u = usuarios.get(i);
                l.add(i, u.getDatos().getUsuario() + " permisos: " + u.getPermisos());
            }
        } catch (Exception e) {

        }
    }
}
