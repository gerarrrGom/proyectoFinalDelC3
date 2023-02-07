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
public class ListaCursos {

    private LinkedList<Curso> cursos;
    public ListaCursos() {
        cursos = new LinkedList();
    }
    public LinkedList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(LinkedList<Curso> cursos) {
        this.cursos = cursos;
    }

    

    public void agregar(Curso a) {
        cursos.add(a);
    }

    public void editar(Curso a, Curso b) {
        for (int i = 0; i < cursos.size(); i++) {
            if (a == obtener(i)) {
                eliminar(i);
                agregar(b);
                break;
            }
        }
    }

    public void eliminar(int indice) {
        cursos.remove(indice);
    }

    public int total() {
        return cursos.size();
    }

    public Curso obtener(int indice) {
        return cursos.get(indice);
    }
}
