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

/**
 *
 * @author Cesar Juventino Zepeda Barriga
 * correo:cesar_zb12@hotmail.com
 */
public class TablaArticulos {

    private PdfPTable tabla;

    public PdfPTable tabla(Articulos n) {
        PdfPTable tabla = new PdfPTable(9);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DEL ARTICULO", FontFactory.getFont(
                "Arial", 16, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(4);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("titulo"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("revista"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("fase"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("fecha"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getTitulo()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getRevista()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getFase()));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getFecha()+""));
        tabla.addCell(celda1);
       
        return tabla;
    }

        
        public PdfPTable tabla(LinkedList<Articulos> lista) {
        PdfPTable tabla = new PdfPTable(4);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DEL ARTICULO", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(4);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("titulo"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("revista"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("fase"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("fecha"));
        tabla.addCell(celda1);

        

        for (int i = 0; i < lista.size(); i++) {
            Articulos p=lista.get(i);
                   
        celda1 = new PdfPCell(new Paragraph(p.getTitulo()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getRevista()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getFase()));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(p.getFecha()+""));
        tabla.addCell(celda1);
        }

        return tabla;
    }
}
