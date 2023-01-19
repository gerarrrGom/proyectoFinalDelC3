/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

/**
 *
 * @author Saul
 */
public class Proyecto {
    private int numeroDeProyecto; 
    private String TitulosDelProyecto; 
    private String Responsabilidad;
    private String FaceDeAprobacion; 
    private String IstalacionPrincipal;
    private int FechaDeInicioDelProyecto; 
    private int FechaDeTerminaciónProgramadaDelProyecto; 
    private int FechaDeTerminacónDelProyectoReprogramada; 
    private String PorsentajeGlobalDelProy; 


    public Proyecto(int numeroDeProyecto, String TitulosDelProyecto, String Responsabilidad, String FaceDeAprobacion, String IstalacionPrincipal, int FechaDeInicioDelProyecto, int FechaDeTerminaciónProgramadaDelProyecto, int FechaDeTerminacónDelProyectoReprogramada, String PorsentajeGlobalDelProy) {
        this.numeroDeProyecto = numeroDeProyecto;
        this.TitulosDelProyecto = TitulosDelProyecto;
        this.Responsabilidad = Responsabilidad;
        this.FaceDeAprobacion = FaceDeAprobacion;
        this.IstalacionPrincipal = IstalacionPrincipal;
        this.FechaDeInicioDelProyecto = FechaDeInicioDelProyecto;
        this.FechaDeTerminaciónProgramadaDelProyecto = FechaDeTerminaciónProgramadaDelProyecto;
        this.FechaDeTerminacónDelProyectoReprogramada = FechaDeTerminacónDelProyectoReprogramada;
        this.PorsentajeGlobalDelProy = PorsentajeGlobalDelProy;
    }

    public int getNumeroDeProyecto() {
        return numeroDeProyecto;
    }

    public void setNumeroDeProyecto(int numeroDeProyecto) {
        this.numeroDeProyecto = numeroDeProyecto;
    }

    public String getTitulosDelProyecto() {
        return TitulosDelProyecto;
    }

    public void setTitulosDelProyecto(String TitulosDelProyecto) {
        this.TitulosDelProyecto = TitulosDelProyecto;
    }

    public String getResponsabilidad() {
        return Responsabilidad;
    }

    public void setResponsabilidad(String Responsabilidad) {
        this.Responsabilidad = Responsabilidad;
    }

    public String getFaceDeAprobacion() {
        return FaceDeAprobacion;
    }

    public void setFaceDeAprobacion(String FaceDeAprobacion) {
        this.FaceDeAprobacion = FaceDeAprobacion;
    }

    public String getIstalacionPrincipal() {
        return IstalacionPrincipal;
    }

    public void setIstalacionPrincipal(String IstalacionPrincipal) {
        this.IstalacionPrincipal = IstalacionPrincipal;
    }

    public int getFechaDeInicioDelProyecto() {
        return FechaDeInicioDelProyecto;
    }

    public void setFechaDeInicioDelProyecto(int FechaDeInicioDelProyecto) {
        this.FechaDeInicioDelProyecto = FechaDeInicioDelProyecto;
    }

    public int getFechaDeTerminaciónProgramadaDelProyecto() {
        return FechaDeTerminaciónProgramadaDelProyecto;
    }

    public void setFechaDeTerminaciónProgramadaDelProyecto(int FechaDeTerminaciónProgramadaDelProyecto) {
        this.FechaDeTerminaciónProgramadaDelProyecto = FechaDeTerminaciónProgramadaDelProyecto;
    }

    public int getFechaDeTerminacónDelProyectoReprogramada() {
        return FechaDeTerminacónDelProyectoReprogramada;
    }

    public void setFechaDeTerminacónDelProyectoReprogramada(int FechaDeTerminacónDelProyectoReprogramada) {
        this.FechaDeTerminacónDelProyectoReprogramada = FechaDeTerminacónDelProyectoReprogramada;
    }

    public String getPorsentajeGlobalDelProy() {
        return PorsentajeGlobalDelProy;
    }

    public void setPorsentajeGlobalDelProy(String PorsentajeGlobalDelProy) {
        this.PorsentajeGlobalDelProy = PorsentajeGlobalDelProy;
    }
    
    
}
