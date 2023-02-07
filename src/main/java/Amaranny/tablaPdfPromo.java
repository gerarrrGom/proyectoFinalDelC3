/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amaranny;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Font;
import java.util.LinkedList;
/**
 *
 * @author Amaranny
 */
public class tablaPdfPromo {
    private PdfPTable tabla;

    public PdfPTable tabla(Promocion p) {
        PdfPTable tabla = new PdfPTable(4);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE OPORTUNIDADES", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(4);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("actividad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("institucion"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("hora"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("producto"));
        tabla.addCell(celda1);


        celda1 = new PdfPCell(new Paragraph(p.getActividad()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getInstitucion()));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(p.getHora()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getProducto()));
        tabla.addCell(celda1);

       

        return tabla;
    }

    public PdfPTable tabla(LinkedList<Promocion> lista) {
        PdfPTable tabla = new PdfPTable(4);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE OPORTUNIDADES", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(4);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("actividad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("institucion"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("hora"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("producto"));
        tabla.addCell(celda1);

        for (int i = 0; i < lista.size(); i++) {
            Promocion p=lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getActividad()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getInstitucion()));
            tabla.addCell(celda1);
            
            celda1 = new PdfPCell(new Paragraph(p.getHora()+""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getProducto()));
            tabla.addCell(celda1);

        }

        return tabla;
    }
}

