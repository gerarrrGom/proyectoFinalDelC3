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
public class Carrera {
    private String nombreCarrera;
 

    public Carrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
        //this.semestres = semestres;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

     @Override
    public String toString(){
        return nombreCarrera+" "; 
    }
}
