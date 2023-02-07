/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class ModeloAcuicultura extends AbstractTableModel  {

    private ListaCursos cursos;

    public ModeloAcuicultura() {
        cursos = new ListaCursos();
        
    }

    public void agregarCurso(Curso curso) {
        cursos.agregar(curso);
        this.fireTableDataChanged();
    }

    public void editarCurso(Curso cursoModificar, Curso cursoNuevo) {
        cursos.editar(cursoModificar, cursoNuevo);
        this.fireTableDataChanged();
    }

    public void eliminarCurso(int indice) {
        if (indice >= 0 && indice < this.getRowCount()) {
            cursos.eliminar(indice);
        }

        this.fireTableDataChanged();
    }

    public ListaCursos listaCursos() {
        return cursos;
    }

    @Override
    public int getRowCount() {

        return cursos.total();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Curso aux = cursos.obtener(rowIndex);

        switch (columnIndex) {
            case 0:
                return aux.getCarrera();
            case 1:
                return aux.getAsignatura();
            default:
                return aux.getSemestre();
        }
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "CARRERA";
            case 1:
                return "ASIGNATURA";
            default:
                return "SEMESTRE";
        }
    }

    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
                return Carrera.class;
            case 1:
                return Asignatura.class;
            default:
                return int.class;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Curso aux = cursos.obtener(fila);

        switch (columna) {
            case 0:
                aux.setCarrera((Carrera) value);
                break;
            case 1:
                aux.setAsignatura((Asignatura) value);
                break;
            default:
                aux.setSemestre((int) value);
                break;
        }
        fireTableCellUpdated(fila, columna);

    }  
}
