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
    public class ModeloIndicadores extends AbstractTableModel{

    private  ListaIndicadores Indicadores;

    public ModeloIndicadores() {
        Indicadores=new ListaIndicadores();
    }
    public void setIndicadores (ListaIndicadores indicadores){
        this.Indicadores= indicadores; 
        this.fireTableDataChanged();
    }

    public ListaIndicadores getIndicadores() {
        return Indicadores;
    }

    
    
    
    @Override
    public int getRowCount() {
        return Indicadores.total();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Indicadores aux=Indicadores.obtener(rowIndex);
        switch(columnIndex){
            case 0: return aux.getNumeroDeProyecto();
            case 1: return aux.getNumeroIndicador();
            default: return aux.getDescripcion();
        }  
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "NumeroDeProyecto";
            case 1: return "NumeroIndicador";
            default: return "Descripcion";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return int.class;
            case 1: return int.class;
            default: return String.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Indicadores aux=Indicadores.obtener(fila);
        switch(columna){
            case 0: aux.setNumeroDeProyecto((int)value);
                    break;
            case 1: aux.setNumeroIndicador((int)value);
                    break;
            default: aux.setDescripcion((String)value);
        }
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarIndicadores(Indicadores indicadores){
        Indicadores.agregar(indicadores);
        this.fireTableDataChanged();   
    }
    
    public void eliminarIndicadores(int indice){
        Indicadores.eliminar(indice);
        this.fireTableDataChanged(); 
    }
    
}

