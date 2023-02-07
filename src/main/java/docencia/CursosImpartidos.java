/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;

/**
 *
 * @author cardo
 */
public class CursosImpartidos {
    private Carrera carrera;
    private Asignatura asignatura;
    private int semestre;
    private String cicloEscolar;
    private float horas;
    private int numAlumnos;

    public CursosImpartidos(Carrera carrera, Asignatura asignatura, int semestre, String cicloEscolar, float horas, int numAlumnos) {
        this.carrera = carrera;
        this.asignatura = asignatura;
        this.semestre = semestre;
        this.cicloEscolar = cicloEscolar;
        this.horas = horas;
        this.numAlumnos = numAlumnos;
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

    public String getCicloEscolar() {
        return cicloEscolar;
    }

    public void setCicloEscolar(String cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
    @Override
    public String toString(){
        return carrera+" "+asignatura+" "+semestre+" "+cicloEscolar+" "+horas+" "+numAlumnos; 
    }
}
