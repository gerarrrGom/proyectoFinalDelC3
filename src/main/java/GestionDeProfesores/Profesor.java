/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProfesores;

/**
 *
 * @author Lenovo-80T6
 */
public class Profesor {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String gradoAcademico;
    private String cursosImpartidos;

    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, String gradoAcademico, String cursosImpartidos) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno ;
        this.apellidoMaterno= apellidoMaterno;
        this.gradoAcademico = gradoAcademico;
        this.cursosImpartidos= cursosImpartidos;
    }
    //me tome la libertad de agregar un constructor que solo reciba el nombre del profesor para que mi parte del codigo funcione por ahora : -Adrian Rubio-
    public Profesor(String nombre) {
        this.nombre = nombre;
    }   
    //me tome la libertad de agregar un constructor que solo reciba el nombre del profesor para que mi parte del codigo funcione por ahora : -Adrian Rubio-
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getCursosImpartidos() {
        return cursosImpartidos;
    }

    public void setCursosImpartidos(String cursosImpartidos) {
        this.cursosImpartidos = cursosImpartidos;
    }

    
}
