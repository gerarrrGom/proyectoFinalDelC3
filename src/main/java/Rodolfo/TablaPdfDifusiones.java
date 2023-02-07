/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rodolfo;

import cesar.gestionAcademica4.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Font;
import java.util.LinkedList;

/**
 *
 * @author Cesar Juventino Zepeda Barriga
 * correo:cesar_zb12@hotmail.com
 */
public class TablaPdfDifusiones {

    private PdfPTable tabla;

    public PdfPTable tabla(Difusion n) {
        PdfPTable tabla = new PdfPTable(3);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Difusiones", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(3);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("NOMBRE"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("FECHA DE INICIO"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("FECHA FINAL"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getNombre()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getFechaI()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getFechaF()));
        tabla.addCell(celda1);

      
        return tabla;
    }

    public PdfPTable tabla(LinkedList<Difusion> lista) {
        PdfPTable tabla = new PdfPTable(3);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Difusiones", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(3);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("NOMBRE"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("FECHA DE INICIO"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("FECHA FINAL"));
        tabla.addCell(celda1);

        

        for (int i = 0; i < lista.size(); i++) {
            Difusion p=lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getNombre()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getFechaI()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getFechaF()));
            tabla.addCell(celda1);
        }

        return tabla;
    }
}
