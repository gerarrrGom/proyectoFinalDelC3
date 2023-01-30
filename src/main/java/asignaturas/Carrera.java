/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class Carrera {
    private String nombre;
    private ListaSemestre s;

    public Carrera(String nombre, ListaSemestre s) {
        this.nombre = nombre;
        this.s = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaSemestre getS() {
        return s;
    }

    public void setS(ListaSemestre s) {
        this.s = s;
    }
    
    
}
