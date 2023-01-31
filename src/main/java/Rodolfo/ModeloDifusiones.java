package Rodolfo;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 * @author el profe ariel
 * Creamos un modelo de tabla con los datos almacenados
 * En una clase que contiene una lista de elementos
 */
public class ModeloDifusiones extends AbstractTableModel{

    private  ListaDifusiones difusiones;

    public ModeloDifusiones() {
        difusiones=new ListaDifusiones();
    }
    
    
    @Override
    public int getRowCount() {
        return difusiones.total();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Difusion aux=difusiones.obtener(rowIndex);
        switch(columnIndex){
            case 0: return aux.getNombre();
            case 1: return aux.getFechaI();
            default: return aux.getFechaF();
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "NOMBRE";
            case 1: return "FECHA DE INICIO";
            default: return "FECHA FINAL";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return String.class;
            case 1: return String.class;
            default: return String.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Difusion aux=difusiones.obtener(fila);
        switch(columna){
            case 0: aux.setNombre((String)value);
                    break;
            case 1: aux.setFechaI((Date)value);
                    break;
            default: aux.setFechaF((Date)value);
        }
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarDifusion(Difusion difusion){
        difusiones.agregar(difusion);
        this.fireTableDataChanged();   
    }
    
    public void eliminarDifusion(int indice){
        difusiones.eliminar(indice);
        this.fireTableDataChanged(); 
    }
}
