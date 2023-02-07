/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cesar.gestionAcademica4;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.pryfinalc3.pdf;
//import com.mycompany.pryfinalc3.pdf;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class FrmPdf extends javax.swing.JDialog {
        private Gestion g;
    /**
     * Creates new form FrmPdf
     */
    public FrmPdf(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        //String nombre=this.txtNombre.getText();
    }

    /**
     * This method is called from within the constructor to initialize the forWARNING: Do NOT modify this code.m.
     The content of this method is always
 regenerated by the Form Editor.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PDF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel1.setText("Introduce el nombre de tu PDF:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnCrear.setBackground(new java.awt.Color(108, 160, 220));
        btnCrear.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnCrear.setText("Crear PDF");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        btnAbrir.setBackground(new java.awt.Color(108, 160, 220));
        btnAbrir.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnAbrir.setText("Abrir PDF");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        jPanel1.add(btnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 360, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
         try {
            try {
                generarPdf(this.txtNombre.getText());
            } catch (IOException ex) {
                Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (DocumentException ex) {
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
              
                /*FileOutputStream archivo= null;
                try {
                archivo = new FileOutputStream("\\\\CESARJZB\\Users\\cesar\\Documents\\PDFSS" + this.txtNombre.getText()+ ".pdf");
                Document documento = new Document();
                
                PdfWriter.getInstance(documento,archivo);
                
                documento.open();
                
                BaseFont bf;
                
                bf = BaseFont.createFont(BaseFont.TIMES_ROMAN,BaseFont.CP1250,BaseFont.EMBEDDED);
                
                //Font f=new Font(bf,12,2,BaseColor.BLUE);
                TablaPdfActividad t=new TablaPdfActividad();
                
                LinkedList<Gestion> lista=new LinkedList();
                lista.add(g=new Gestion(g.getNombre(),g.getComision(),g.getPeriodo()));
                
                
                PdfPTable tab=t.tabla(lista);
                
                documento.add(tab);
                
                documento.close();
                JOptionPane.showMessageDialog(this, "El pdf ha sido creado correctamente");
                } catch (Exception ex) {
                Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                try {
                archivo.close();
                } catch (IOException ex) {
                Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
                }
                }  */  
    }//GEN-LAST:event_btnCrearMouseClicked
public void abrirPdf(String nombre){
        try {
            File f=new File("\\\\CESARJZB\\Users\\cesar\\Documents\\PDFSS" + nombre + ".pdf");
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex,"Atencion",2);
            
        }
        
    }
    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
      /* FrmRegistrar act=new FrmRegistrar(null,true);
       //act.setVisible(true);
            FileOutputStream archivo= null;
        try {
            archivo = new FileOutputStream("C:\\Users\\cesar\\OneDrive\\Escritorio\\");
            Document documento = new Document();
            
            PdfWriter.getInstance(documento,archivo);
            
            documento.open();
            
            BaseFont bf;
            
            bf = BaseFont.createFont(BaseFont.TIMES_ROMAN,BaseFont.CP1250,BaseFont.EMBEDDED);
            
            Font f=new Font(bf,12,2,BaseColor.BLUE);
            TablaPdfActividad t=new TablaPdfActividad();
            
            LinkedList<Gestion> lista=new LinkedList();
            g=new Gestion(g.getNombre(),g.getComision(),g.getPeriodo());
            
            
            
            
            
            PdfPTable tab=t.tabla(lista);
            
                documento.add(tab);
            
            documento.close();
            JOptionPane.showMessageDialog(this, "El pdf ha sido creado correctamente");
        } catch (Exception ex) {
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
      abrirPdf(this.txtNombre.getText());
    }//GEN-LAST:event_btnAbrirMouseClicked
public void generarPdf(String nombre) throws FileNotFoundException, DocumentException, IOException{
        /*if(!(this.txtNombre.getText().isEmpty()|| this.txtApellido.getText().isEmpty())){
            FileOutputStream archivo= new FileOutputStream("C:\\Users\\52281\\Documents\\PDFS" + nombre + ".pdf");
            Document documento = new Document();
            System.out.println("PRUEBA");
            PdfWriter.getInstance(documento,archivo);
            
            documento.open();
            System.out.println("PRUEBA2");
            BaseFont bf=BaseFont.createFont(BaseFont.TIMES_ROMAN,BaseFont.CP1250,BaseFont.EMBEDDED);
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
            TablaPdfActividades t=new TablaPdfActividades();
            PdfPTable tab=t.tabla(nombre, apellido, carrera, semestre, matricula);
            documento.add(tab);
            
            documento.close();
            //System.out.println("PruebA3");
            JOptionPane.showMessageDialog(this, "El pdf ha sido creado correctamente");
            
        }else{
            JOptionPane.showMessageDialog(this, "Debe llenar los campos");
            
        }*/
        Plantilla p=new Plantilla(this.txtNombre.getText());
        p.crearPlantilla();
       
        
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
            java.util.logging.Logger.getLogger(FrmPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPdf dialog = new FrmPdf(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
