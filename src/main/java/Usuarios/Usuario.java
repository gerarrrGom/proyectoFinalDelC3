/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import GestionDeProfesores.Profesor;

/**
 *
 * @author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class Usuario {
    private Profesor datos;
    private int permisos;

    public Usuario(Profesor datos,int permisos) {
        this.datos = datos;
        this.permisos=permisos;
    }

    public Profesor getDatos() {
        return datos;
    }

    public void setDatos(Profesor datos) {
        this.datos = datos;
    }

    public int getPermisos() {
        return permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }  
}
