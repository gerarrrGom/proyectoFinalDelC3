/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yenedithm;

import javax.swing.table.AbstractTableModel;


public class ModeloTutorias extends AbstractTableModel{

    private  ListaTutorias tutorias;

    public ModeloTutorias() {
        tutorias=new ListaTutorias();
    }
    
    
    @Override
    public int getRowCount() {
        return tutorias.total();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tutoria aux=tutorias.obtener(rowIndex);
        switch(columnIndex){
            case 0: return aux.getNombre();
            case 1: return aux.getCarrera();
            case 2: return aux.getSemestre();
            default: return aux.getFechaR();
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "NOMBRE";
            case 1: return "CARRERA";
            case 2: return "SEMESTRE";
            default: return "FECHA DE REGISTRO";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return String.class;
            case 1: return String.class;
            case 2: return String.class;
            default: return String.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Tutoria aux=tutorias.obtener(fila);
        switch(columna){
            case 0: aux.setNombre((String)value);
                    break;
            case 1: aux.setCarrera((String)value);
                    break;
            case 2: aux.setSemestre((String)value);
                    break;
            default: aux.setFechaR((String)value);
        }
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarTutoria(Tutoria tutoria){
        tutorias.agregar(tutoria);
        this.fireTableDataChanged();   
    }
    
    public void eliminarTutoria(int indice){
        tutorias.eliminar(indice);
        this.fireTableDataChanged(); 
    }
}
