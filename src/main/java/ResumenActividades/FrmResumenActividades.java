/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ResumenActividades;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 * @author Adrian Rubio rubioalvaradoadrian@gmail.com
 */
public class FrmResumenActividades extends javax.swing.JInternalFrame {

    private ModeloActividadesAcademicas t;
    BDHorasActividad bd;

    /**
     * Creates new form FrmResumenActividadess
     */
    public FrmResumenActividades() {
        initComponents();
        t = new ModeloActividadesAcademicas();
        this.tblActividades.setModel(t);
        bd = new BDHorasActividad();
        llenarTabla();
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
        tblActividades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setBackground(new java.awt.Color(39, 192, 65));
        setTitle("Llenar Horas/Semana");
        setOpaque(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblActividades.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        tblActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Indice", "Actividad Académica", "Ciclo A", "Ciclo B", "Ciclo V"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblActividades.setToolTipText("llenar los datos en Horas/Semana");
        tblActividades.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblActividades);
        tblActividades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblActividades.getColumnModel().getColumnCount() > 0) {
            tblActividades.getColumnModel().getColumn(0).setResizable(false);
            tblActividades.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblActividades.getColumnModel().getColumn(1).setResizable(false);
            tblActividades.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblActividades.getColumnModel().getColumn(2).setResizable(false);
            tblActividades.getColumnModel().getColumn(2).setPreferredWidth(25);
            tblActividades.getColumnModel().getColumn(3).setResizable(false);
            tblActividades.getColumnModel().getColumn(3).setPreferredWidth(25);
            tblActividades.getColumnModel().getColumn(4).setResizable(false);
            tblActividades.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 590, 310));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 50, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel2.setText("Horas-Semana");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 150, 20));

        btnRegistrar.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnRegistrar.setText("Guardar y Salir");
        btnRegistrar.setToolTipText("Guarda los datos y cierra la ventana");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 130, 50));

        btnAgregar.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnAgregar.setText("agregar/eliminar");
        btnAgregar.setToolTipText("agregar o eliminar de la tabla");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, 50));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        if (t.verificarHoras(t)) {
            bd.borrar();
            for (Actividad a2 : t.getActividades().getListaDeActividades()) {
                bd.registrarProducto(a2);
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "El conteo no puede ser mayor a 40 horas");
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        ListaDeActividades a = t.getActividades();
        GestionActividadess g = new GestionActividadess(null, true, a);
        g.setVisible(true);
        a = g.regresarActividades();
        t.setActividades(a);
        t.ordenar();
    }//GEN-LAST:event_btnAgregarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblActividades;
    // End of variables declaration//GEN-END:variables
    private void llenarTabla() {
        LinkedList<Actividad> lista = bd.obtener();
        for (Actividad a1 : lista) {
            t.agregarActividad(a1);
        }
    }
}
