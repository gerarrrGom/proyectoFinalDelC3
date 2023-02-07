/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

import java.util.LinkedList;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class ListaAsignaturas {

    private LinkedList<Asignatura> lista;

    public ListaAsignaturas() {
        lista = new LinkedList();
    }

    public Asignatura getAsignatura(int indice) {
        return lista.get(indice);
    }

    public void eliminarAsignatura(int indice) {
        lista.remove(indice);
    }

    public int size() {
        return lista.size();
    }

    public void agregarAsignatura(Asignatura a) {
        lista.add(a);
    }
}
