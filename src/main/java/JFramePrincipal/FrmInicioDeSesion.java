/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFramePrincipal;

import Usuarios.Usuario;
import Usuarios.BDUsuarios;
import GestionDeProfesores.BDProfesores;
import utilidades.DatosEnEjecucion;

/**
 * @author Adrian Rubio 
 * rubioalvaradoadrian@gmail.com
 */
public class FrmInicioDeSesion extends javax.swing.JFrame {

    private BDUsuarios bd;
    private BDProfesores bd1;
    private boolean a;

    /**
     * Creates new form FrmInicioDeSesion
     */
    public FrmInicioDeSesion() {
        initComponents();
        bd = new BDUsuarios();
        this.jLabel3.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pswrdContraseña = new javax.swing.JPasswordField();
        btnVer = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("favor de iniciar sesión");
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, 30));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        txtUsuario.setToolTipText("Usuario dado a la institución");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, 30));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("usuario/contraseña incorrectos!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 240, 30));

        pswrdContraseña.setToolTipText("su contraseña");
        jPanel1.add(pswrdContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 30));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1490793853-user-interface15_82360.png"))); // NOI18N
        btnVer.setText(" ");
        btnVer.setToolTipText("ver Contraseña");
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMouseClicked(evt);
            }
        });
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 190));

        btnCancelar.setBackground(new java.awt.Color(141, 182, 205));
        btnCancelar.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Salir del  programa");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 100, 40));

        btnAceptar.setBackground(new java.awt.Color(141, 182, 205));
        btnAceptar.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Campos completos");
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
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        String usuario = this.txtUsuario.getText();
        char[] contraseña = this.pswrdContraseña.getPassword();
        String password = "";
        for (char c1 : contraseña) {
            password = password + c1;
        }
        for (Usuario u : bd.obtener()) {
            String usuario1 = u.getDatos().getUsuario();
            String contraseña1 = u.getDatos().getContraseña();
            if (usuario.compareTo(usuario1) == 0 && contraseña1.compareTo(password) == 0) {
                DatosEnEjecucion.u = u;
                switch (u.getPermisos()) {
                    case 0:
                        FrmPrincipalUsuarios f = new FrmPrincipalUsuarios();
                        f.setVisible(true);

                    default:
                        FrmPrincipalAdmin frame = new FrmPrincipalAdmin();
                        frame.setVisible(true);
                }

                this.setVisible(false);
            }
        }
        this.jLabel3.setVisible(true);
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseClicked
        char i = 42;
        if (a) {  // a es una variable boolean en true
            this.pswrdContraseña.setEchoChar((char) 0); // este método es el que hace visible el texto del jPasswordField
            a = false;
        } else {
            this.pswrdContraseña.setEchoChar(i); // i es el char
            a = true;
        }
    }//GEN-LAST:event_btnVerMouseClicked

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
            java.util.logging.Logger.getLogger(FrmInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pswrdContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
