/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProfesores;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo-80T6
 */
public class ModeloCiclosYPeriodos extends AbstractTableModel{
    private ListaCiclosYPeriodos ciclosYPeriodos;

    public ModeloCiclosYPeriodos(){
        ciclosYPeriodos =new ListaCiclosYPeriodos();
    }
    
    public int getRownCount(){
        return ciclosYPeriodos.size();
        
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    
}
   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        
        Ciclo aux= ciclosYPeriodos.getCiclosYPeriodos(rowIndex);
        switch(columnIndex){
            case 0: return aux.getFechaInicio ();
            case 1: return aux.getFechaTermino();
            case 2: return aux.getPeriodoA();
            case 3: return aux.getPeriodoB();
            case 4: return aux.getPeriodoZ();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int col){
        switch(col){
            case 0: return "Fecha De Inicio";
            case 1: return "Fecha De Término";
            case 2: return "PeriodoA";
            case 3: return "PeriodoB";
            case 4: return "PeriodoZ";
            default: return "";    
        }
    }
   
    @Override
    public Class getColumnClass(int col){
         switch(col){
            case 0: return String.class;
            case 1: return String.class;
            case 2: return String.class;
            case 3: return String.class;
            
            default:return String.class;
         }
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        return true;
    }
   
    @Override
    public void setValueAt(Object value, int fila, int columna){
            Ciclo aux= ciclosYPeriodos.getCiclosYPeriodos(fila);
            switch(columna){
            case 0: aux.setFechaInicio((String)value);
            break;
            case 1: aux.setFechaTermino((String)value);
            break;
            case 2: aux.setPeriodoA((Periodo)value);
            break;
            case 3: aux.setPeriodoB((Periodo)value);
            break;
            default: aux.setPeriodoZ((Periodo)value);
                
            }
            this.fireTableCellUpdated(fila, columna);
    }
    public void agregarCiclosYPeriodos(Ciclo c){
        ciclosYPeriodos.agregarCiclosYPeriodos(c);
        this.fireTableDataChanged();
    }
    public void eliminarCiclo(int indice){
        ciclosYPeriodos.eliminarCiclosYPeriodos(indice);
        this.fireTableDataChanged();
        
    }

    
    @Override
    public int getRowCount() {
        return ciclosYPeriodos.size();
    }
    public ListaCiclosYPeriodos getCiclosYPeriodos(){
        return ciclosYPeriodos;
    }
    
    
}
