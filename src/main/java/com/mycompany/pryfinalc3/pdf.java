/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pryfinalc3;

import com.itextpdf.text.BaseColor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author mar
 */
public class pdf extends javax.swing.JFrame {

    /**
     * Creates new form pdf
     */
    public pdf() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnAbrirPdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos UNPA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 290, 30));

        btnCrear.setText("Crear pdf");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        btnAbrirPdf.setText("Abrir Pdf");
        btnAbrirPdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirPdfMouseClicked(evt);
            }
        });
        getContentPane().add(btnAbrirPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 90, -1));

        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 20));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 290, 30));

        jLabel3.setText("Carrera");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        getContentPane().add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 290, 30));

        jLabel4.setText("Semestre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        getContentPane().add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 290, 30));

        jLabel5.setText("Matricula");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 290, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        try {
            try {
                System.out.println("hola");
                generarPdf(this.txtNombre.getText());
                System.out.println("holaaa");
            } catch (IOException ex) {
                Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (DocumentException ex) {
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCrearMouseClicked

    private void btnAbrirPdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirPdfMouseClicked
        abrirPdf(this.txtNombre.getText());
    }//GEN-LAST:event_btnAbrirPdfMouseClicked

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed
    public void generarPdf(String nombre) throws FileNotFoundException, DocumentException, IOException{
        if(!(this.txtNombre.getText().isEmpty()|| this.txtApellido.getText().isEmpty())){
            FileOutputStream archivo= new FileOutputStream("C:\\Users\\52281\\Documents\\PDFS" + nombre + ".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento,archivo);
            
            documento.open();
            BaseFont bf=BaseFont.createFont(BaseFont.MACROMAN,BaseFont.CP1250,BaseFont.EMBEDDED);
            Font f=new Font(bf,12,2,BaseColor.BLUE);
            Paragraph texto=new Paragraph("DATOS DEL ALUMNO");
            texto.setAlignment(1);
            documento.add(texto);
            
            documento.add(new Paragraph("Nombre: "+ this.txtNombre.getText(),f));
            documento.add(new Paragraph("Apellido: "+ this.txtApellido.getText(),f));
            documento.add(new Paragraph("Carrera: "+ this.txtCarrera.getText(),f));
            documento.add(new Paragraph("Semestre: "+ this.txtSemestre.getText(),f));
            documento.add(new Paragraph ("Matricula: "+ this.txtMatricula.getText(),f));
            
            String nombres=this.txtNombre.getText();
            String apellido=this.txtApellido.getText();
            String semestre=this.txtSemestre.getText();
            String carrera=this.txtCarrera.getText();
            String matricula=this.txtMatricula.getText();
            Tablas t=new Tablas();
            PdfPTable tab=t.tabla(nombre, apellido, carrera, semestre, matricula);
            documento.add(tab);
            
            documento.close();
            JOptionPane.showMessageDialog(this, "El pdf ha sido creado correctamente");
            
        }else{
            JOptionPane.showMessageDialog(this, "Debe llenar los campos");
            
        }
        
    }
    
    public void abrirPdf(String nombre){
        try {
            File f=new File("C:\\Users\\52281\\Documents\\PDFS" + nombre + ".pdf");
            Desktop.getDesktop().open(f);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex,"Atencion",2);
            
        }
    }
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
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pdf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirPdf;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
