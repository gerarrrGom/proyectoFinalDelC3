/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;

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
public class TablaPdfCursosImpartidos {

    private PdfPTable tabla;

    public PdfPTable tabla(CursosImpartidos p) {
        PdfPTable tabla = new PdfPTable(7);
        PdfPCell celda1 = new PdfPCell(new Paragraph("CURSOS IMPARTIDOS", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(7);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("CARRERA"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("ASIGNATURA"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("SEMESTRE"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo B"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("CICLO ESCOLAR"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("HORAS POR SEMANA"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("ALUMNOS MATRICULADOS"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getCarrera().getNombreCarrera()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getAsignatura().getNombre()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getSemestre() + ""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getCicloEscolar()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getHoras() + ""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getNumAlumnos() + ""));
        tabla.addCell(celda1);

        return tabla;
    }

    public PdfPTable tabla(LinkedList<CursosImpartidos> lista) {
        PdfPTable tabla = new PdfPTable(7);
        PdfPCell celda1 = new PdfPCell(new Paragraph("CURSOS IMPARTIDOS", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(7);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("CARRERA"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("ASIGNATURA"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("SEMESTRE"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Ciclo B"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("CICLO ESCOLAR"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("HORAS POR SEMANA"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("ALUMNOS MATRICULADOS"));
        tabla.addCell(celda1);

        for (int i = 0; i < lista.size(); i++) {
            CursosImpartidos p = lista.get(i);
            celda1 = new PdfPCell(new Paragraph(p.getCarrera().getNombreCarrera()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getAsignatura().getNombre()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getSemestre() + ""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getNumAlumnos() + ""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getCicloEscolar()));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getHoras() + ""));
            tabla.addCell(celda1);

            celda1 = new PdfPCell(new Paragraph(p.getNumAlumnos() + ""));
            tabla.addCell(celda1);
        }

        return tabla;
    }

}
