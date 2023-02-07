/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.gestionAcademica4;

/**
 *
 * @author cesar
 */
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
//import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mar
 */
public class Encabezado extends PdfPageEventHelper {

    @Override
    public void onOpenDocument(PdfWriter writer, Document document) {
        PdfTemplate t = writer.getDirectContent().createTemplate(50, 50);

        try {
            Image imagen = Image.getInstance(t);
            imagen.setRole(PdfName.ARTIFACT);
        } catch (DocumentException de) {
            throw new ExceptionConverter(de);
        }
    }

    @Override
    public void onEndPage(PdfWriter writer, Document document) {
        agregarEncabezado(writer);

    }
    public void agregarEncabezado(PdfWriter writer) {
        PdfPTable header = new PdfPTable(3);
        try {
            header.setWidths(new int[]{9, 50});
            header.setTotalWidth(527);
            header.setLockedWidth(true);
            header.getDefaultCell().setBorder(Rectangle.BOTTOM);
            header.getDefaultCell().setBorder(Rectangle.NO_BORDER);
            //add image
            Image logo = Image.getInstance("C:\\Users\\cesar\\Descargas\\LogoUnpa.jpg\\");
            logo.setWidthPercentage(10);
            header.addCell(logo);
            header.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
            // add text
            PdfPCell text = new PdfPCell();
            text.setPaddingBottom(15);
            text.setPaddingLeft(50);
            text.setBorder(Rectangle.NO_BORDER);
             BaseFont bf;
            
            bf = BaseFont.createFont(BaseFont.HELVETICA_BOLD,BaseFont.CP1250,BaseFont.EMBEDDED);
            Font f=new Font(bf,12,2,BaseColor.BLACK);
            text.addElement(new Phrase("GESTIÓN ACADÉMICA",f));

            header.addCell(text);
            // write content
            header.writeSelectedRows(0, -1, 34, 803, writer.getDirectContent());
        } catch (DocumentException de) {
            throw new ExceptionConverter(de);
        } catch (MalformedURLException e) {
            throw new ExceptionConverter(e);
        } catch (IOException e) {
            throw new ExceptionConverter(e);
        }
    }

    public void agregarHeader(Document d) throws DocumentException {
        Image imagen;
        try {
            imagen = Image.getInstance("C:\\Users\\cesar\\Descargas\\LogoUnpa.jpg\\");
            
            System.out.println("hola");
            imagen.scalePercent(75f);//esto es opcional para definir el tamaño de la imagen.
            imagen.setAlignment(Element.ALIGN_LEFT);
            d.add(imagen);
        } catch (BadElementException ex) {
            Logger.getLogger(Encabezado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Encabezado.class.getName()).log(Level.SEVERE, null, ex);
        }
        Paragraph texto=new Paragraph("Gestión Académica");
        texto.setAlignment(Element.ALIGN_RIGHT);
        BaseFont bf;
        try {
            bf = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1250, BaseFont.EMBEDDED);
            Font f=new Font(bf,12,2,BaseColor.BLUE);
            texto.setFont(new Font(f));
        } catch (IOException ex) {
            Logger.getLogger(Encabezado.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.add(texto);
    }

}