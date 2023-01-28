/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class Asignaturas {
    private  int numero;
    private String nombre;
    private int semestre;
    private String carrera;

    public Asignaturas(int numero, String nombre, int semestre, String carrera) {
        this.numero = numero;
        this.nombre = nombre;
        this.semestre = semestre;
        this.carrera = carrera;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String imprimirAsignatura(){
        return getNumero()+" "+getCarrera()+" "+getNombre()+" "+getSemestre();        
    }
}
    

