/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

/**
 *
 * @author Saul
 */

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Font;
import java.util.LinkedList;

public class TablaIndicadores {

    private PdfPTable tabla;

    public PdfPTable tabla(Indicadores n) {
        PdfPTable tabla = new PdfPTable(3);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE INDICADORES", FontFactory.getFont(
                "Arial", 16, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(3);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Numero De Proyecto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Numero Indicador"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Descripcion"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getNumeroDeProyecto()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getNumeroIndicador()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getDescripcion()));
        tabla.addCell(celda1);

       
        return tabla;
    }

        
        public PdfPTable tabla(LinkedList<Indicadores> lista) {
        PdfPTable tabla = new PdfPTable(3);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE INDICADORES", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(3);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Numero De Proyecto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Numero Indicador"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Descripcion"));
        tabla.addCell(celda1);
        
        for (int i = 0; i < lista.size(); i++) {
            Indicadores p=lista.get(i);
                   
  celda1 = new PdfPCell(new Paragraph(p.getNumeroDeProyecto()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getNumeroIndicador()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getDescripcion()));
        tabla.addCell(celda1);
        }

        return tabla;
    }
}
