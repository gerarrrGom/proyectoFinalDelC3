/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amaranny;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Amaranny
 */
public class TablaPromocion extends AbstractTableModel{
    private ListaPromocion desarrollo;

    public TablaPromocion() {
        desarrollo=new ListaPromocion();
    }
    public void setDesarollo(ListaPromocion desarrollo){
        this.desarrollo=desarrollo;
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount(){
        return desarrollo.size();
    }    
    
    @Override
    public int getColumnCount(){
       return 4; 
    }
    
    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
            Promocion aux=desarrollo.getDesarrollo(rowIndex);
            switch(columnIndex){
                case 0: return aux.getActividad();
                case 1: return aux.getInstitucion();
                case 2: return aux.getHora();
                case 3: return aux.getProducto();
                default:return  "";
            }
        
    }
    
    @Override
    public String getColumnName(int col){
        switch(col){
            case 0: return "Activida";
            case 1: return "Institución";
            case 2: return "Hora";
            default: return "Producto";            
        }
    }
    
    @Override
    public Class getColumnClass(int col){
        return String.class;
    }
    
    @Override
    public boolean isCellEditable(int row,int col){
       return true; 
    }
    
    @Override
    public void setValueAt(Object value,int fila,int columna){
        Promocion aux= desarrollo.getDesarrollo(fila);
        switch(columna){
            case 0: aux.setActividad((String)value);
                    break;
            case 1: aux.setInstitucion((String)value);
                    break;
            case 2: aux.getHora();
                    break;
            default: aux.setProducto((String)value);
        }
        fireTableCellUpdated(fila,columna);
    }
    
    public void agregarDesarrollo(Promocion gestion){
        desarrollo.agregarDesarrollo(gestion);
        this.fireTableDataChanged();
    }
    
    public void eliminarDesarrollo(int indice){
        desarrollo.eliminarDesarrollo(indice);
        this.fireTableDataChanged();
    }   

    public ListaPromocion getDesarrollo() {
        return desarrollo;
    }
    
    
}

