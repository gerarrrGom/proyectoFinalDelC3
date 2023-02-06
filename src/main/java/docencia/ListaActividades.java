/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;

import java.util.LinkedList;

/**
 *
 * @author cardo
 */
public class ListaActividades {

    private LinkedList<Actividades> actividades;

    public ListaActividades() {
        actividades = new LinkedList();
    }

    public void agregar(Actividades a) {
        actividades.add(a);
    }

    public void editar(Actividades a, Actividades b) {
        for (int i = 0; i < actividades.size(); i++) {
            if (a == obtener(i)) {
                eliminar(i);
                agregar(b);
                break;
            }
        }
    }

    public void eliminar(int indice) {
        actividades.remove(indice);
    }

    public int total() {
        return actividades.size();
    }

    public Actividades obtener(int indice) {
        return actividades.get(indice);
    }
}
