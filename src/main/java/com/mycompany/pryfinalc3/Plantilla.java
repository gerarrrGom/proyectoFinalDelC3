/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryfinalc3;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mar
 */
public class Plantilla {
    private String nombre;
    private String apellido;
    private Document documento;
    private FileOutputStream archivo;
    //private Paragraph titulo;
    private Encabezado encabezado;
    

    public Plantilla(String nombre,String apellido) throws BadElementException, IOException {
        this.nombre = nombre;
        this.apellido=apellido;
        documento= new Document();
        encabezado=new Encabezado();   
    }
    
    public void crearPlantilla(){
        try {
            archivo = new FileOutputStream("C:\\Users\\52281\\Documents\\PDFS" + nombre + ".pdf");
            PdfWriter w=PdfWriter.getInstance(documento,archivo);
            Encabezado e=new Encabezado();
            documento.open();
            
            e.agregarEncabezado(w);
           
            documento.setMargins(3, 3, 527, 2);
            documento.add(new Paragraph("\n\n\n\n\nPROFESOR INVESTIGADOR:  "+ nombre + " " + apellido));
            documento.newPage();
            e.agregarEncabezado(w);
            BaseFont bf;
            
            bf = BaseFont.createFont(BaseFont.TIMES_ROMAN,BaseFont.CP1250,BaseFont.EMBEDDED);
            
            Font f=new Font(bf,12,2,BaseColor.BLUE);
            documento.newPage();
            e.agregarEncabezado(w);
            documento.newPage();
            e.agregarEncabezado(w);
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
