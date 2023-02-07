/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

/**
 *
 * @author Saul
 */
public class Indicadores {
    private int NumeroDeProyecto; 
    private int NumeroIndicador; 
    private String Descripcion;

    public Indicadores(int NumeroDeProyecto, int NumeroIndicador, String Descripcion) {
        this.NumeroDeProyecto = NumeroDeProyecto;
        this.NumeroIndicador = NumeroIndicador;
        this.Descripcion = Descripcion;
    }

    public int getNumeroDeProyecto() {
        return NumeroDeProyecto;
    }

    public void setNumeroDeProyecto(int NumeroDeProyecto) {
        this.NumeroDeProyecto = NumeroDeProyecto;
    }

    public int getNumeroIndicador() {
        return NumeroIndicador;
    }

    public void setNumeroIndicador(int NumeroIndicador) {
        this.NumeroIndicador = NumeroIndicador;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
