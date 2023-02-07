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
public class tablaPdf {
     private PdfPTable tabla;

    public PdfPTable tabla(Oportunidades p) {
        PdfPTable tabla = new PdfPTable(2);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE OPORTUNIDADES", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(2);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("oportunidades"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("problemas"));
        tabla.addCell(celda1);


        celda1 = new PdfPCell(new Paragraph(p.getOportunidades()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getProblemas()));
        tabla.addCell(celda1);

       

        return tabla;
    }

    public PdfPTable tabla(LinkedList<Oportunidades> lista) {
        PdfPTable tabla = new PdfPTable(2);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE OPORTUNIDADES", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(2);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("oportunidades"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("problemas"));
        tabla.addCell(celda1);

        for (int i = 0; i < lista.size(); i++) {
            Oportunidades p=lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getOportunidades()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getProblemas()));
            tabla.addCell(celda1);

        }

        return tabla;
    }
}
