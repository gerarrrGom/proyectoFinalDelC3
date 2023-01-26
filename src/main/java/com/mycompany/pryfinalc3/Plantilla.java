/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryfinalc3;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
    private Paragraph titulo;
    

    public Plantilla(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido=apellido;
        documento= new Document();
        titulo=new Paragraph("Informe anual de actividades. Octubre de 2022 a Febrero de 2023");
        
        
    }
    public void crearPlantilla(){
        try {
            archivo = new FileOutputStream("C:\\Users\\52281\\Documents\\PDFS" + nombre + ".pdf");
            PdfWriter.getInstance(documento,archivo);
           
            documento.open();
            
            Image logo=Image.getInstance("C:/Users/52281/Pictures/logoUnpa.jpg");
            
            logo.scaleToFit(100, 150);
            logo.setAlignment(Chunk.ALIGN_LEFT);
            documento.add(logo);
            titulo.setAlignment(2);
            
            
            documento.add(titulo);
            
            documento.add(new Paragraph("Profesor investigador:"+ nombre + " " + apellido));
            
            BaseFont bf;
            
            bf = BaseFont.createFont(BaseFont.TIMES_ROMAN,BaseFont.CP1250,BaseFont.EMBEDDED);
            
            Font f=new Font(bf,12,2,BaseColor.BLUE);
            Paragraph texto=new Paragraph("DATOS DEL ALUMNO");
            texto.setAlignment(1);
            documento.add(texto);
            
            documento.add(new Paragraph("Nombre: "+ nombre,f));
            documento.add(new Paragraph("Apellido: "+ apellido,f));
 
            Tablas t=new Tablas();
            PdfPTable tab=t.tabla(nombre, apellido,"",  "","");
            documento.add(tab);
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
