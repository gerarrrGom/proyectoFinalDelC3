/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

import ResumenActividades.Archivo;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author Saul
 */
public class BDProyectsos {
    
    public LinkedList<Proyecto> obtener(){
        LinkedList<Proyecto> investigacion=null;
        Archivo archivo=new Archivo("proyectos.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        
        if(lineas!=null){
            investigacion=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                
                int numeroDeProyecto=Integer.parseInt(tokens.nextToken());
                String TitulosDelProyecto=tokens.nextToken();
                String Responsabilidad=tokens.nextToken();
                String FaceDeAprobacion=tokens.nextToken();
                String IstalacionPrincipal=tokens.nextToken();
                int  FechaDeInicioDelProyecto=Integer.parseInt(tokens.nextToken());
                int FechaDeTerminaci√≥nProgramadaDelProyecto=Integer.parseInt(tokens.nextToken());
                int FechaDeTerminac√≥nDelProyectoReprogramada=Integer.parseInt(tokens.nextToken());
                String PorsentajeGlobalDelProy=tokens.nextToken();
                Proyecto n=new Proyecto(numeroDeProyecto,TitulosDelProyecto,Responsabilidad,FaceDeAprobacion,IstalacionPrincipal,FechaDeInicioDelProyecto,FechaDeTerminaci√≥nProgramadaDelProyecto,FechaDeTerminac√≥nDelProyectoReprogramada,PorsentajeGlobalDelProy);
                investigacion.add(n);
                
            }
        }
        return investigacion;
    }
    
    public boolean registrarActividad(Proyecto n){
        Archivo archivo= new Archivo("proyectos.txt");
        return archivo.registrar(n.getNumeroDeProyecto()+ ";"
                    + n.getTitulosDelProyecto()+ ";"
                    + n.getResponsabilidad()+ ";"
                    + n.getFaceDeAprobacion()+ ";"
                    + n.getIstalacionPrincipal()+ ";"
                    + n.getFechaDeInicioDelProyecto()+ ";"
                    + n.getFechaDeTerminaci√≥nProgramadaDelProyecto()+ ";"
                    + n.getFechaDeTerminac√≥nDelProyectoReprogramada()+ ";"
                    + n.getPorsentajeGlobalDelProy());
        
    }
    public void borrar(){
        Archivo archivo=new Archivo("proyectos.txt");
        archivo.borrarContenido();
    }
}
