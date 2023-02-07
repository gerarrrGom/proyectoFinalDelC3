/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yenedithm;

import javax.swing.table.AbstractTableModel;


public class ModeloTesis extends AbstractTableModel{

    private  ListaTesis tesis;

    public ModeloTesis() {
        tesis=new ListaTesis();
    }
    
    
    @Override
    public int getRowCount() {
        return tesis.total();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tesis aux=tesis.obtener(rowIndex);
        switch(columnIndex){
            case 0: return aux.getTitulo();
            case 1: return aux.getNombre();
            case 2: return aux.getGradoObtener();
            case 3: return aux.getPorcentaje();
            case 4: return aux.getFechaR();
            default: return aux.getFechaTP();
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "TITULO";
            case 1: return "NOMBRE";
            case 2: return "GRADO A OBTENER";
            case 3: return "PORCENTAJE";
            case 4: return "FECHA DE REGISTRO";
            default: return "FECHA PROGRAMADA DE TERMINACION";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return String.class;
            case 1: return String.class;
            case 2: return String.class;
            case 3: return String.class;
            case 4: return String.class;
            default: return String.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Tesis aux=tesis.obtener(fila);
        switch(columna){
            case 0: aux.setTitulo((String)value);
                    break;
            case 1: aux.setNombre((String)value);
                    break;
            case 2: aux.setGradoObtener((String)value);
                    break;
            case 3: aux.setPorcentaje((String)value);
                    break;
            case 4: aux.setFechaR((String)value);
                    break;
            default: aux.setFechaTP((String)value);
        }
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarTesis(Tesis tesis){
        this.tesis.agregar(tesis);
        this.fireTableDataChanged();   
    }
    
    public void eliminarTesis(int indice){
        tesis.eliminar(indice);
        this.fireTableDataChanged(); 
    }
}
