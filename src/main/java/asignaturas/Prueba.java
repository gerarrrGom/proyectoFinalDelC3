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
public class Prueba {
    public static void main(String[] args) {
        
        BDCursos bd=new BDCursos();
        //bd.borrar();
        
        Curso p = new Curso(new Carrera("Ing.Computación"),new Asignatura("hola"),2);
        bd.registrarCarrera(p);
        LinkedList<Curso> lista=bd.obtener();
        //System.out.println(lista.get(0));
        
        //bd.registrarCurso(p);
        for (int i = lista.size(); i >0 ; i--) {
            System.out.println(lista.get(i));
        }
    }
}
