/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docencia;


import java.util.LinkedList;

/**
 *
 * @author cardo
 */
public class Carrera  {
    private int semestre;
    private LinkedList<Asignatura> asignaturas;
    // constructores y métodos
    public void agregarAsignatura(Asignatura a) {
        asignaturas.add(a);
    }
    
}
