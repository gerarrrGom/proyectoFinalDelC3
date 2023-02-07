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
public class TablaProyecto {

    private PdfPTable tabla;

    public PdfPTable tabla(Proyecto n) {
        PdfPTable tabla = new PdfPTable(9);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DE LA ACTVIDAD", FontFactory.getFont(
                "Arial", 16, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(9);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Numero de proyecto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Titulo del Proyecto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Responsabilidad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("FaceDeAprobacion"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("IstalacionPrincipal"));
        tabla.addCell(celda1);
                
        celda1 = new PdfPCell(new Paragraph("FechaDeInicioDelProyecto"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("FechaDeTerminaciónProgramadaDelProyecto"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("FechaDeTerminacónDelProyectoReprogramada"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("PorsentajeGlobalDelProy"));
        tabla.addCell(celda1);
       
        
        celda1 = new PdfPCell(new Paragraph(n.getNumeroDeProyecto()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getTitulosDelProyecto()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(n.getResponsabilidad()));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getFaceDeAprobacion()));
        tabla.addCell(celda1);
       
        celda1 = new PdfPCell(new Paragraph(n.getIstalacionPrincipal()));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getFechaDeInicioDelProyecto()+""));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getFechaDeTerminaciónProgramadaDelProyecto()+""));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getFechaDeTerminacónDelProyectoReprogramada()+""));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(n.getPorsentajeGlobalDelProy()));
        tabla.addCell(celda1);
        
        return tabla;
    }

        
        public PdfPTable tabla(LinkedList<Proyecto> lista) {
        PdfPTable tabla = new PdfPTable(9);
        PdfPCell celda1 = new PdfPCell(new Paragraph("DATOS DEL PROYECTO", FontFactory.getFont(
                "Arial", 14, Font.BOLD, BaseColor.GREEN)));

        celda1.setPadding(12);

        celda1.setColspan(9);
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Numero de proyecto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Titulo del Proyecto"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("Responsabilidad"));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph("FaceDeAprobacion"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("IstalacionPrincipal"));
        tabla.addCell(celda1);
                
        celda1 = new PdfPCell(new Paragraph("FechaDeInicioDelProyecto"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("FechaDeTerminaciónProgramadaDelProyecto"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("FechaDeTerminacónDelProyectoReprogramada"));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph("PorsentajeGlobalDelProy"));
        tabla.addCell(celda1);

        

        for (int i = 0; i < lista.size(); i++) {
            Proyecto p=lista.get(i);
                   
        celda1 = new PdfPCell(new Paragraph(p.getNumeroDeProyecto()+""));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getTitulosDelProyecto()));
        tabla.addCell(celda1);

        celda1 = new PdfPCell(new Paragraph(p.getResponsabilidad()));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(p.getFaceDeAprobacion()));
        tabla.addCell(celda1);
       
        celda1 = new PdfPCell(new Paragraph(p.getIstalacionPrincipal()));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(p.getFechaDeInicioDelProyecto()+""));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(p.getFechaDeTerminaciónProgramadaDelProyecto()+""));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(p.getFechaDeTerminacónDelProyectoReprogramada()+""));
        tabla.addCell(celda1);
        
        celda1 = new PdfPCell(new Paragraph(p.getPorsentajeGlobalDelProy()));
        tabla.addCell(celda1);
        }

        return tabla;
    }
}
