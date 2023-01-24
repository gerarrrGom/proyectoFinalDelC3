/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.gestionAcademica4;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cesar
 */
public class TablaGestion extends AbstractTableModel{
    private ListaGestion actividades;

    public TablaGestion() {
        actividades=new ListaGestion();
    }
    
    @Override
    public int getRowCount(){
        return actividades.size();
    }    
    
    @Override
    public int getColumnCount(){
       return 3; 
    }
    
    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
            Gestion aux=actividades.getActividad(rowIndex);
            switch(columnIndex){
                case 0: return aux.getNombre();
                case 1: return aux.getComision();
                case 2: return aux.getPeriodo();
                default:return  "";
            }
        
    }
    
    @Override
    public String getColumnName(int col){
        switch(col){
            case 0: return "Nombre de la Actividad";
            case 1: return "Comisión o puesto";
            default: return "Periodo";            
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
        Gestion aux= actividades.getActividad(fila);
        switch(columna){
            case 0: aux.setNombre((String)value);
                    break;
            case 1: aux.setComision((String)value);
                    break;
            default: aux.setPeriodo((String)value);
        }
        fireTableCellUpdated(fila,columna);
    }
    
    public void agregarActividad(Gestion gestion){
        actividades.agregarActividad(gestion);
        this.fireTableDataChanged();
    }
    
    public void eliminarActividad(int indice){
        actividades.eliminarActividad(indice);
        this.fireTableDataChanged();
    }   

    public ListaGestion getActividades() {
        return actividades;
    }
    
    
}
