/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResumenActividades;

import SaulJM27.ListaProyectos;
import SaulJM27.Proyecto;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author victo
 */
public class ModeloActividadesAcademicas extends AbstractTableModel {

    private ListaDeActividades actividades;

    public ModeloActividadesAcademicas() {
        actividades = new ListaDeActividades();
    }

    public ListaDeActividades getActividades() {
        return actividades;
    }

    public void setActividades(ListaDeActividades actividades) {
        this.actividades = actividades;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return actividades.total();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Actividad aux = actividades.obtener(rowIndex);
        switch (columnIndex) {
            case 0:
                return aux.getIndice();
            case 1:
                return aux.getActividad();
            case 2:
                return aux.getHorasCicloA();
            case 3:
                return aux.getHorasCicloB();
            default:
                return aux.getHorasCicloC();
        }
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Indice";
            case 1:
                return "Actividad";
            case 2:
                return "Ciclo A";
            case 3:
                return "Ciclo B";
            default:
                return "Ciclo C";
        }
    }

    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
                return Double.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            default:
                return Integer.class;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col > 1;
    }

    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Actividad aux = actividades.obtener(fila);
        switch (columna) {
            case 0:
                aux.setIndice((double) value);
                break;
            case 1:
                aux.setActividad((String) value);
                break;
            case 2:
                aux.setHorasCicloA((int) value);
                break;
            case 3:
                aux.setHorasCicloB((int) value);
                break;
            default:
                aux.setHorasCicloC((int) value);
        }
        fireTableCellUpdated(fila, columna);
    }

    public void agregarActividad(Actividad actividad) {
        actividades.agregarActividad(actividad);
        this.fireTableDataChanged();
    }

    public void eliminarActividad(int indice) {
        actividades.eliminarActividad(indice);
        this.fireTableDataChanged();
    }

    public boolean verificarHoras(ModeloActividadesAcademicas t) {
        int horasA = 0;
        int horasB = 0;
        int horasC = 0;
        for (int i = 0; i < t.getRowCount(); i++) {
            horasA = horasA + Integer.parseInt(t.getValueAt(i, 2).toString());
            horasB = horasB + Integer.parseInt(t.getValueAt(i, 3).toString());
            horasC = horasC + Integer.parseInt(t.getValueAt(i, 4).toString());
        }
        return !(horasA > 40 || horasB > 40 || horasC > 40);
    }
    public boolean ordenar(){
        try{
            Collections.sort(actividades.getListaDeActividades());
            this.fireTableDataChanged();
        }catch(Exception e){
            return false;
        }
        return true;
    }

}
