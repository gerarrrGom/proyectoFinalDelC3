/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResumenActividades;

import com.mycompany.pryfinalc3.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Font;
import java.util.LinkedList;

/**
 *
 * @author mar correo: maritzamedel2@gmail.com
 */
public class TablaPdfActividades {

    private PdfPTable tabla;

    public PdfPTable tabla(Actividad p) {
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Actividades y sus horas/semana", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(5);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Indice"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Actividad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo A"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo B"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo V"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getIndice() + ""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getActividad()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getHorasCicloA()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getHorasCicloB()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getHorasCicloC()+""));
        tabla.addCell(celda1);

        return tabla;
    }

    public PdfPTable tabla(LinkedList<Actividad> lista) {
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Actividades y sus horas/semana", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(5);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Indice"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Actividad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo A"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo B"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo V"));
        tabla.addCell(celda1);

        for (int i = 0; i < lista.size(); i++) {
            Actividad p = lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getIndice() + ""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getActividad()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getHorasCicloA()+""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getHorasCicloB()+""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getHorasCicloC()+""));
            tabla.addCell(celda1);
        }

        return tabla;
    }

}
