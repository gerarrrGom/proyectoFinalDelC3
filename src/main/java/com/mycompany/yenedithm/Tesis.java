/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yenedithm;


public class Tesis {
    private String titulo;
    private String nombre;
    private String gradoObtener;
    private String porcentaje;
    private String fechaR;
    private String fechaTP;

    public Tesis(String titulo, String nombre, String gradoObtener, String porcentaje, String fechaR, String fechaTP) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.gradoObtener = gradoObtener;
        this.porcentaje = porcentaje;
        this.fechaR = fechaR;
        this.fechaTP = fechaTP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGradoObtener() {
        return gradoObtener;
    }

    public void setGradoObtener(String gradoObtener) {
        this.gradoObtener = gradoObtener;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getFechaTP() {
        return fechaTP;
    }

    public void setFechaTP(String fechaTP) {
        this.fechaTP = fechaTP;
    }
    
}
