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
public class ListaOpiniones {
    private LinkedList<Opiniones> opiniones;
    public ListaOpiniones() {
        opiniones = new LinkedList();
    }
    public LinkedList<Opiniones> getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(LinkedList<Opiniones> opiniones) {
        this.opiniones = opiniones;
    }

    

    public void agregar(Opiniones a) {
        opiniones.add(a);
    }

    public void editar(Opiniones a, Opiniones b) {
        for (int i = 0; i < opiniones.size(); i++) {
            if (a == obtener(i)) {
                eliminar(i);
                agregar(b);
                break;
            }
        }
    }

    public void eliminar(int indice) {
        opiniones.remove(indice);
    }

    public int total() {
        return opiniones.size();
    }

    public Opiniones obtener(int indice) {
        return opiniones.get(indice);
    }
}
