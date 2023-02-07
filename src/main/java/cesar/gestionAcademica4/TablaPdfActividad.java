/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.gestionAcademica4;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Font;
import java.util.LinkedList;

/**
 *
 * @author cesar
 */
public class TablaPdfActividad {

    private PdfPTable tabla;

    /*public PdfPTable tabla(Gestion n) {
        PdfPTable tabla = new PdfPTable(3);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE LA ACTVIDAD", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(3);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Nombre de la Actividad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Comision o puesto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Periodo"));
        tabla.addCell(celda1);

        

        celda1 = new PdfPCell(new Paragraph(n.getNombre()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getComision()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getPeriodo()));
        tabla.addCell(celda1);

      
        return tabla;
    }*/

    public PdfPTable tabla(LinkedList<Gestion> lista) {
        PdfPTable tabla = new PdfPTable(3);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE LA ACTIVIDAD", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(3);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Nombre de la actividad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Comision o puesto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Periodo"));
        tabla.addCell(celda1);

        

        for (int i = 0; i < lista.size(); i++) {
            Gestion p=lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getNombre()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getComision()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getPeriodo()));
            tabla.addCell(celda1);
        }

        return tabla;
    }
}
