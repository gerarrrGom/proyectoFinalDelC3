/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryfinalc3;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
//import java.awt.Font;
import com.itextpdf.text.Font;


/**
 *
 * @author mar
 * correo: maritzamedel2@gmail.com
 */
public class Tablas {
    private PdfPTable tabla;
    
    
    public PdfPTable tabla(String nombre,String apellido,String carrera, String semestre,String matricula){
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DOCENCIA", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);
        
        celda1.setColspan(5);
        tabla.addCell(celda1);
        
        /*celda1=new PdfPCell(new Paragraph("Nombre"));
        celda1.setColspan(5);
        tabla.addCell(celda1);*/
        celda1=new PdfPCell(new Paragraph("Nombre"));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph("Apellido"));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph("Carrera"));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph(" Semestre"));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph("Matricula"));
        tabla.addCell(celda1);
        
        /*celda1.setColspan(5);
        tabla.addCell(celda1);*/
        
        celda1=new PdfPCell(new Paragraph(nombre));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph(apellido));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph(carrera));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph(semestre));
        tabla.addCell(celda1);
        
        celda1=new PdfPCell(new Paragraph(matricula));
        tabla.addCell(celda1);
        
        return tabla;
    }
    
}
