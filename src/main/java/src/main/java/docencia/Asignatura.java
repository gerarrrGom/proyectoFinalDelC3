/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;

/**
 *
 * @author CarlosR
 * #email: cardozacarlosr@gmail.com
 */
public class Asignatura {
    private String nombre;
    private int semestre;
    public Asignatura(String nombre,int semestre) {
        this.nombre = nombre;
        this.semestre=semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
