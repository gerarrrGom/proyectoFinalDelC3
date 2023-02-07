/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rodolfo;

import ResumenActividades.*;
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
public class TablaPdfComentarios {

    private PdfPTable tabla;

    public PdfPTable tabla(Comentario p) {
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Comentarios", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(5);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("COMENTARIOS"));
        tabla.addCell(celda1);
        celda1 = new PdfPCell(new Paragraph(p.getCuerpo()));
        tabla.addCell(celda1);

        return tabla;
    }

    public PdfPTable tabla(LinkedList<Comentario> lista) {
        PdfPTable tabla = new PdfPTable(1);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Comentarios", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(1);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Comentarios"));
        tabla.addCell(celda1);

        for (int i = 0; i < lista.size(); i++) {
            Comentario p = lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getCuerpo() + ""));
            tabla.addCell(celda1);
        }

        return tabla;
    }

}
