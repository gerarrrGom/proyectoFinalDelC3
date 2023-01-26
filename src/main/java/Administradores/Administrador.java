/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administradores;

import GestionDeProfesores.Profesor;

/**
 *
 * @author victo
 */
public class Administrador {
    private Profesor datos;
    private String contraseña;
    private String usuario;

    public Administrador(Profesor datos, String contraseña, String usuario) {
        this.datos = datos;
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public Profesor getDatos() {
        return datos;
    }

    public void setDatos(Profesor datos) {
        this.datos = datos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
