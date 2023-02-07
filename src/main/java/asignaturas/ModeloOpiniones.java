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
public class ModeloOpiniones extends AbstractTableModel {
    private ListaOpiniones opiniones;

    public ModeloOpiniones() {
        opiniones = new ListaOpiniones();
        
    }

    public void agregarOpiniones(Opiniones curso) {
        opiniones.agregar(curso);
        this.fireTableDataChanged();
    }

    public void editarOpiniones(Opiniones cursoModificar, Opiniones cursoNuevo) {
        opiniones.editar(cursoModificar, cursoNuevo);
        this.fireTableDataChanged();
    }

    public void eliminarOpiniones(int indice) {
        if (indice >= 0 && indice < this.getRowCount()) {
            opiniones.eliminar(indice);
        }

        this.fireTableDataChanged();
    }

    public ListaOpiniones listaOpinioneses() {
        return opiniones;
    }

    @Override
    public int getRowCount() {

        return opiniones.total();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Opiniones aux = opiniones.obtener(rowIndex);

        switch (columnIndex) {
            case 0:
                return aux.getProblema();
            default:
                return aux.getOportunidades();
        }
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "PROBLEMA";
            default:
                return "OPORTUNIDADES";
        }
    }

    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Opiniones aux = opiniones.obtener(fila);

        switch (columna) {
            case 0:
                aux.setProblema((String) value);
                break;
            default:
                aux.setOportunidades((String) value);
                break;
        }
        fireTableCellUpdated(fila, columna);

    }  
}
