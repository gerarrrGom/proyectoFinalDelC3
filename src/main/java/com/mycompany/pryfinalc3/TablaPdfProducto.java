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
import com.itextpdf.text.Font;
import java.util.LinkedList;

/**
 *
 * @author mar correo: maritzamedel2@gmail.com
 */
public class TablaPdfProducto {

    private PdfPTable tabla;

    public PdfPTable tabla(Producto p) {
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DEL PRODUCTO", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(5);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("codigo"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("nombre"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("descripción"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(" precio"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("existencias"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getCodigo()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getNombre()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getDescripcion()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getPrecio()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getExistencias()));
        tabla.addCell(celda1);

        return tabla;
    }

    public PdfPTable tabla(LinkedList<Producto> lista) {
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DEL PRODUCTO", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(5);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("codigo"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("nombre"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("descripción"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(" precio"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("existencias"));
        tabla.addCell(celda1);

        for (int i = 0; i < lista.size(); i++) {
            Producto p=lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getCodigo()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getNombre()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getDescripcion()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getPrecio()+ ""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getExistencias() + ""));
            tabla.addCell(celda1);
        }

        return tabla;
    }

}
