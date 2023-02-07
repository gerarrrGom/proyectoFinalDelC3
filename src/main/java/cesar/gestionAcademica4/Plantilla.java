/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.gestionAcademica4;

/**
 *
 * @author cesar
 */
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
//import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
//import com.itextpdf.text.Header;
//import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
//import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.pryfinalc3.Encabezado;
import com.mycompany.pryfinalc3.pdf;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;

/**
 *
 * @author cesar
 */
public class Plantilla {
    private String nombre;
    private String comision;
    private String periodo;
    private Document documento;
    private FileOutputStream archivo;
    private Paragraph titulo;
    private Encabezado encabezado;
    

    public Plantilla(String nombre) throws BadElementException, IOException {
        this.nombre = nombre;
        this.comision=comision;
        this.periodo=periodo;
        documento= new Document();
        encabezado=new Encabezado();   
    }
    
    public void crearPlantilla(){
        try {
            archivo = new FileOutputStream("C:\\Users\\52281\\Downloand" + nombre + ".pdf");
            PdfWriter w=PdfWriter.getInstance(documento,archivo);
            Encabezado e=new Encabezado();
            documento.open();
            
            e.agregarEncabezado(w);
            
            
            documento.setMargins(3, 3, 527, 2);
            documento.add(new Paragraph("\n\n\n\n\nActividad:"+ nombre + " " ));
            /*comentar ESTO
            documento.newPage();
            e.agregarEncabezado(w);*/
            BaseFont bf;
            
            bf = BaseFont.createFont(BaseFont.TIMES_ROMAN,BaseFont.CP1250,BaseFont.EMBEDDED);
            
            Font f=new Font(bf,12,2,BaseColor.BLUE);
            Paragraph texto=new Paragraph("DATOS DE LA ACTIVIDAD");
            texto.setAlignment(1);
            documento.add(texto);
            
           /* documento.add(new Paragraph("Nombre: "+ nombre,f));
            documento.add(new Paragraph("Comision: "+ comision,f));
            documento.add(new Paragraph("Comision: "+ periodo,f));*/
 
            /*TablaPdfActividad t=new TablaPdfActividades();
            PdfPTable tab=tab(t);
            documento.add(tab);*/
            
            /*documento.newPage();
            e.agregarEncabezado(w);
            documento.newPage();
            e.agregarEncabezado(w);*/
            documento.close();
            JOptionPane.showMessageDialog(null, "El pdf ha sido creado correctamente");
            
        } catch (Exception ex) {
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
