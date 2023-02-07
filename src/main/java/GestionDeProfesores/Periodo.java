/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProfesores;

/**
 *
 * @author Gerardo
 */
public class Periodo {

    public Periodo(String fechaInicio, String fechaTérmino) {
        this.fechaInicio = fechaInicio;
        this.fechaTérmino = fechaTérmino;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTérmino() {
        return fechaTérmino;
    }

    public void setFechaTérmino(String fechaTérmino) {
        this.fechaTérmino = fechaTérmino;
    }
    private String fechaInicio;
    private String fechaTérmino;

    @Override
    public String toString() {
        return fechaInicio + "-" + fechaTérmino;
    }

    public static Periodo parsePeriodo(String s){
     Periodo p;
     String s1[]=s.split("-");
     return p=new Periodo(s1[0],s1[1]);
    }
}
