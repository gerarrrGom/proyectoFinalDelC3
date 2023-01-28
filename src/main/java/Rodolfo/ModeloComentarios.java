package Rodolfo;

import javax.swing.table.AbstractTableModel;

/**
 * @author el profe ariel
 * Creamos un modelo de tabla con los datos almacenados
 * En una clase que contiene una lista de elementos
 */
public class ModeloComentarios extends AbstractTableModel{

    private  ListaComentarios comentarios;

    public ModeloComentarios() {
        comentarios=new ListaComentarios();
    }
    
    
    @Override
    public int getRowCount() {
        return comentarios.total();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Comentario aux=comentarios.obtener(rowIndex);
        return aux.getCuerpo();
    }
    
    @Override
    public String getColumnName(int col) {
        return "COMENTARIOS";
    }
    
    @Override
    public Class getColumnClass(int col) {
        return String.class;
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Comentario aux=comentarios.obtener(fila);
        aux.setCuerpo((String)value);
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarComentario(Comentario comentario){
        comentarios.agregar(comentario);
        this.fireTableDataChanged();   
    }
    
    public void eliminarComentario(int indice){
        comentarios.eliminar(indice);
        this.fireTableDataChanged(); 
    }
}
