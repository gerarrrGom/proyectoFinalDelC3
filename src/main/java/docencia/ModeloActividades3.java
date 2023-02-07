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
public class ModeloActividades3 extends AbstractTableModel {
    private ListaActividades actividades;

    public ModeloActividades3() {
        actividades = new ListaActividades();
    }

    public void agregarActividad(Actividades actividad) {
        actividades.agregar(actividad);
        this.fireTableDataChanged();
    }

    public void editarActividad(Actividades actividadModificar, Actividades actividadNuevo) {
        actividades.editar(actividadModificar, actividadNuevo);
        this.fireTableDataChanged();
    }

    public void eliminarActividad(int indice) {
        if (indice >= 0 && indice < this.getRowCount()) {
            actividades.eliminar(indice);
        }

        this.fireTableDataChanged();
    }

    public ListaActividades listaActividades() {
        return actividades;
    }

    @Override
    public int getRowCount() {

        return actividades.total();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Actividades aux = actividades.obtener(rowIndex);

        switch (columnIndex) {
            case 0:
                return aux.getNombre();
            case 1:
                return aux.getMateriales();
            default:
                return aux.getDescripcion();
        }
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "ACTIVIDAD";
            case 1:
                return "MATERIALES";
            default:
                return "DESCRIPCION";
        }
    }

    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
                return String.class;
            case 1:
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
        Actividades aux = actividades.obtener(fila);

        switch (columna) {
            case 0:
                aux.setNombre((String) value);
                break;
            case 1:
                aux.setMateriales((String) value);
                break;
            default:
                aux.setDescripcion((String) value);
        }

        fireTableCellUpdated(fila, columna);

    }
}
