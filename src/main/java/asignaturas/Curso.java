/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class Curso {

    private Carrera carrera;
    private Asignatura asignatura;
    private int semestre;

    public Curso(Carrera carrera, Asignatura asignatura, int semestre) {
        this.carrera = carrera;
        this.asignatura = asignatura;
        this.semestre = semestre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return carrera + " " + asignatura + " " + semestre + " ";
    }
}
