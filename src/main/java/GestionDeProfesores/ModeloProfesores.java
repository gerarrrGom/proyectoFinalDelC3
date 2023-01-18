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
public class ModeloProfesores extends AbstractTableModel{
    private ListaProfesores profesores;

    public ModeloProfesores(){
        profesores =new ListaProfesores();
    }
    
    public int getRownCount(){
        return profesores.size();
        
    }
    @Override
    public int getColumnCount(){
        return 3;
    
}
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        
        Profesor aux= profesores.getProfesor(rowIndex);
        switch(columnIndex){
            case 0: return aux.getNombre();
            case 1: return aux.getApellidoPaterno();
            case 2: return aux.getApellidoMaterno();
            case 3: return aux.getGradoAcademico();
            case 4: return aux.getCursosImpartidos();
            default: return "";
        }
    }
    @Override
    public String getColumnName(int col){
        switch(col){
            case 0: return "Nombre del docente";
            case 1: return "Apellido paterno";
            case 2: return "Apellido materno";
            case 3: return "Grado academico";
            default: return "Cursos impartidos";
            
        }
    }
    @Override
    public Class getColumnClass(int col){
        switch(col){
            case 0: return String.class;
            case 1: return String.class;
            case 2: return String.class;
            case 3: return String.class;
            default: return String.class;
        }
    }
    @Override
    public boolean isCellEditable(int row, int col){
        return true;
    }
    @Override
    public void setValueAt(Object value, int fila, int columna){
            Profesor aux= profesores.getProfesor(fila);
            switch(columna){
            case 0: aux.setNombre((String)value);
            break;
            case 1: aux.setApellidoPaterno((String)value);
            break;
            case 2: aux.setApellidoMaterno((String)value);
            break;
            case 3: aux.setGradoAcademico((String)value);
            break;
            default: aux.setCursosImpartidos((String)value);
                
            }
            fireTableCellUpdated(fila, columna);
    }
    public void agregarProfesor(Profesor profesor){
        profesores.agregarProfesor(profesor);
        this.fireTableDataChanged();
    }
    public void eliminarProfesor(int indice){
        profesores.eliminarProfesor(indice);
        this.fireTableDataChanged();
        
    }

    @Override
    public int getRowCount() {
        return profesores.size();
    }
    
}
