/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author cardo
 */
public class ModeloCursosImpartidos extends AbstractTableModel{
    private ListaCursosImpartidos cursos;
    public ModeloCursosImpartidos(){
        cursos=new ListaCursosImpartidos();
        //cursos.cargarCursos();
    }
     public void agregarCurso(CursosImpartidos curso){
        cursos.agregar(curso);
        this.fireTableDataChanged();   
    }
    public void editarCurso(int indice,CursosImpartidos curso){
        cursos.editar(indice,curso);
        this.fireTableDataChanged();   
    }
    public void eliminarCurso(int indice){
        if (indice >= 0 && indice < this.getRowCount()) {
            cursos.eliminar(indice);
        }
      
        this.fireTableDataChanged(); 
    }
    public ListaCursosImpartidos listaCursos(){
        return cursos;
    }
    @Override
    public int getRowCount() {
        
        return cursos.total();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CursosImpartidos aux=cursos.obtener(rowIndex);
        
        switch(columnIndex){
            case 0: return aux.getCarrera();
            case 1: return aux.getAsignatura();
            case 2: return aux.getSemestre();
            case 3: return aux.getCicloEscolar();
            case 4: return aux.getHoras();
            default: return aux.getNumAlumnos();
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "CARRERA";
            case 1: return "ASIGNATURA";
            case 2: return "SEMESTRE";
            case 3: return "CICLO ESCOLAR";
            case 4: return "HORAS POR SEMANA";
            default: return "ALUMNOS MATRICULADOS";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return Carrera.class;
            case 1: return Asignatura.class;
            case 2: return int.class;
            case 3: return String.class;
            case 4: return float.class;
             default: return int.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        CursosImpartidos aux=cursos.obtener(fila);
        
        switch(columna){
            case 0: aux.setCarrera((Carrera)value);
                    break;
            case 1: aux.setAsignatura((Asignatura)value);
                    break;
            case 2: aux.setSemestre((int)value);
                    break;
            case 3: aux.setCicloEscolar((String)value);
                    break;
            case 4: aux.setHoras((float)value);
                    break;
            default: aux.setNumAlumnos((int)value);
        }
        
        fireTableCellUpdated(fila, columna);
        
    }
    
   
}
