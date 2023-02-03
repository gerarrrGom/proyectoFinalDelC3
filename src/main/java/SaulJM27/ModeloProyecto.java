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
    public class ModeloProyecto extends AbstractTableModel{

    private  ListaProyectos proyectos;

    public ModeloProyecto() {
        proyectos=new ListaProyectos();
    }
    public void setProyectos (ListaProyectos proyectos){
        this.proyectos= proyectos; 
        this.fireTableDataChanged();
    }

    public ListaProyectos getProyectos() {
        return proyectos;
    }

    
    
    
    @Override
    public int getRowCount() {
        return proyectos.total();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proyecto aux=proyectos.obtener(rowIndex);
        switch(columnIndex){
            case 0: return aux.getNumeroDeProyecto();
            case 1: return aux.getTitulosDelProyecto();
            case 2: return aux.getResponsabilidad();
            case 3: return aux.getFaceDeAprobacion();
            case 4: return aux.getIstalacionPrincipal();
            case 5: return aux.getFechaDeInicioDelProyecto();
            case 6: return aux.getFechaDeTerminaciónProgramadaDelProyecto();
            case 7: return aux.getFechaDeTerminacónDelProyectoReprogramada();
            default: return aux.getPorsentajeGlobalDelProy();
        }  
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "NumeroDeProyecto";
            case 1: return "TitulosDelProyecto";
            case 2: return "Responsabilidad";
            case 3: return "FaceDeAprobacion";
            case 4: return "IstalacionPrincipal";
            case 5: return "FechaDeInicioDelProyecto";
            case 6: return "FechaDeTerminaciónProgramadaDelProyecto";
            case 7: return "FechaDeTerminacónDelProyectoReprogramada";
            default: return "getPorsentajeGlobalDelProy";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return int.class;
            case 1: return String.class;
            case 2: return String.class;
            case 3: return String.class;
            case 4: return String.class;
            case 5: return int.class;
            case 6: return int.class;
            case 7: return int.class;
            default: return String.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Proyecto aux=proyectos.obtener(fila);
        switch(columna){
            case 0: aux.setNumeroDeProyecto((int)value);
                    break;
            case 1: aux.setTitulosDelProyecto((String)value);
                    break;
            case 2: aux.setResponsabilidad((String)value);
                    break;
            case 3: aux.setFaceDeAprobacion((String)value);
                    break;
            case 4: aux.setIstalacionPrincipal((String)value);
                    break;
            case 5: aux.setFechaDeInicioDelProyecto((int)value);
                    break;
            case 6: aux.setFechaDeTerminaciónProgramadaDelProyecto((int)value);
                    break;
            case 7: aux.setFechaDeTerminacónDelProyectoReprogramada((int)value);
                    break;
            default: aux.setPorsentajeGlobalDelProy((String)value);
        }
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarProyecto(Proyecto proyecto){
        proyectos.agregar(proyecto);
        this.fireTableDataChanged();   
    }
    
    public void eliminarProyecto(int indice){
        proyectos.eliminar(indice);
        this.fireTableDataChanged(); 
    }
    
}
