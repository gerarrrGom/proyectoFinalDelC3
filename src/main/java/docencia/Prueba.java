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
public class Prueba {
    public static void main(String[] args) {
        
        BDCursosImpartidos bd=new BDCursosImpartidos();
        //bd.borrar();
        CursosImpartidos p = new CursosImpartidos(new Carrera("Ing.Computación"),new Asignatura("Estructura de Datos"),2,"A",5,100);
        CursosImpartidos c = new CursosImpartidos(new Carrera("Ing.Diseño"),new Asignatura("Estructura de Datos"),2,"A",5,100);
        bd.registrarCurso(c);
        LinkedList<CursosImpartidos> lista=bd.obtener();
        //System.out.println(lista.get(0));
        
        bd.registrarCurso(p);
        for (int i = lista.size()-1; i >0 ; i--) {
            System.out.println(lista.get(i));
        }
        
    }
}
