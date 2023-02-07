/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProfesores;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.util.LinkedList;

/**
 *
 * @author Lenovo-80T6
 */
public class TablPdf {
    
    private PdfPTable tabla;

    public PdfPTable tabla(Profesor p) {
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Gestión de profesores", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(5);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Nombre"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Apellido Paterno"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Apellido Materno"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Grado Académico"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Cursos Impartidos"));
        tabla.addCell(celda1);
        

        celda1 = new PdfPCell(new Paragraph(p.getNombre()+ ""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getApellidoPaterno()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getApellidoMaterno()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getGradoAcademico()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getCursosImpartidos()+""));
        tabla.addCell(celda1);

        return tabla;
    }

    public PdfPTable tabla(LinkedList<Profesor> lista) {
        PdfPTable tabla = new PdfPTable(5);
        PdfPCell celda1 = new PdfPCell(new Paragraph("Gestión de profesores", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(5);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Nombre"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Apellido Paterno"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Apellido Materno"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Grado Academico"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Cursos Impartidos"));
        tabla.addCell(celda1);

        for (int i = 0; i < lista.size(); i++) {
            Profesor p = lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getNombre()+ ""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getApellidoPaterno()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getApellidoMaterno()+""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getGradoAcademico()+""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getCursosImpartidos()+""));
            tabla.addCell(celda1);
        }

        return tabla;
    }


}
