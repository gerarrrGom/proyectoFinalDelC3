/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author Saul
 */
public class BDProyectsos {
    
    public LinkedList<Proyecto> obtener(){
        LinkedList<Proyecto> investigacion=null;
        SaulJM27.Archivo archivo=new SaulJM27.Archivo("proyecto_investigacion.txt");
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
                int FechaDeTerminaciónProgramadaDelProyecto=Integer.parseInt(tokens.nextToken());
                int FechaDeTerminacónDelProyectoReprogramada=Integer.parseInt(tokens.nextToken());
                String PorsentajeGlobalDelProy=tokens.nextToken();

                String periodo=tokens.nextToken();
                Proyecto n=new Proyecto(numeroDeProyecto,TitulosDelProyecto,Responsabilidad,FaceDeAprobacion,IstalacionPrincipal,FechaDeInicioDelProyecto,FechaDeTerminaciónProgramadaDelProyecto,FechaDeTerminacónDelProyectoReprogramada,PorsentajeGlobalDelProy);
                investigacion.add(n);
                
            }
        }
        return investigacion;
    }
    
    public boolean registrarActividad(Proyecto n){
         SaulJM27.Archivo archivo=new SaulJM27.Archivo("proyecto_investigacion.txt");
        return archivo.registrar(n.getNumeroDeProyecto()+ ";"
                    + n.getTitulosDelProyecto()+ ";"
                    + n.getResponsabilidad()+ ";"
                    + n.getFaceDeAprobacion()+ ";"
                    + n.getIstalacionPrincipal()+ ";"
                    + n.getFechaDeInicioDelProyecto()+ ";"
                    + n.getFechaDeTerminaciónProgramadaDelProyecto()+ ";"
                    + n.getFechaDeTerminacónDelProyectoReprogramada()+ ";"
                    + n.getPorsentajeGlobalDelProy());
        
    }
    public void borrar(){
        SaulJM27.Archivo archivo=new SaulJM27.Archivo("proyecto_investigacion.txt");
        archivo.borrarContenido();
    }
}
