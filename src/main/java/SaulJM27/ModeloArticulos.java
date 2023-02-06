/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Saul
 */
public class ModeloArticulos extends AbstractTableModel{

    private  ListaArticulos articulos;

    public ModeloArticulos() {
        articulos=new ListaArticulos();
    }
    public void setArticulos (ListaArticulos articulos){
        this.articulos= articulos; 
        this.fireTableDataChanged();
    }

    public ListaArticulos getArticulos() {
        return articulos;
    }

    
    
    
    @Override
    public int getRowCount() {
        return articulos.total();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Articulos aux=articulos.obtener(rowIndex);
        switch(columnIndex){
            case 0: return aux.getTitulo();
            case 1: return aux.getRevista();
            case 2: return aux.getFase();
            default: return aux.getFecha();

        }  
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "titulo";
            case 1: return "revista";
            case 2: return "Face";
            default: return "fecha";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return String.class;
            case 1: return String.class;
            case 2: return String.class;
            default: return int.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Articulos aux=articulos.obtener(fila);
        switch(columna){
            case 0: aux.setTitulo((String)value);
                    break;
            case 1: aux.setRevista((String)value);
                    break;
            case 2: aux.setFase((String)value);
                    break;
            default: aux.setFecha((int)value);
        }
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarArticulos(Articulos articulo){
        articulos.agregar(articulo);
        this.fireTableDataChanged();   
    }
    
    public void eliminarArticulos(int indice){
        articulos.eliminar(indice);
        this.fireTableDataChanged(); 
    }
    
}
