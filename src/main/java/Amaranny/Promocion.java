/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amaranny;

/**
 *
 * @author Amaranny
 */
public class Promocion {
    private String actividad;
    private String institucion;
    private int hora;
    private String producto;

    public Promocion(String actividad, String institucion, int hora, String producto) {
        this.actividad = actividad;
        this.institucion = institucion;
        this.hora = hora;
        this.producto = producto;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
     
}
