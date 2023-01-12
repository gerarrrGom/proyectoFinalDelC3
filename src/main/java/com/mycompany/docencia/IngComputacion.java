/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docencia;

/**
 *
 * @author cardo
 */
public class IngComputacion extends Carrera {
    public IngComputacion() {
        super();
        agregarAsignatura(new Asignatura("Programación Estructurada",1));
        agregarAsignatura(new Asignatura("Precálculo",1));
        agregarAsignatura(new Asignatura("Química para Ingeniería",1));
        agregarAsignatura(new Asignatura("Física para Ingeniería",1));
        agregarAsignatura(new Asignatura("Historia del Pensamiento Filosófico",1));
    }
}
