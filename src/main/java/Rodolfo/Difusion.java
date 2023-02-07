/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rodolfo;

import java.util.Date;

/**
 *
 * @author Rodolfo Marinero
 */
public class Difusion extends Object{
    String nombre;
    String fechaI;
    String fechaF;

    public Difusion(String nombre, String fechaI, String fechaF) {
        this.nombre = nombre;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
