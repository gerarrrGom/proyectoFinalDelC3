/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amaranny;

import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author Amaranny
 */
public class BDDesarrollo {
    public LinkedList<Promocion> obtener(){
        LinkedList<Promocion> actividades=null;
        Amaranny.Archivo archivo=new Amaranny("gestion_actividades.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            actividades=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();
                String comision=tokens.nextToken();
                String periodo=tokens.nextToken();
                Promocion n=new Promocion(actividad,institucion,hora,producto);
                actividades.add(n);
                
            }
        }
        return actividades;
    }
    
    public boolean registrarDesarrollo(Promocion n){
        cesar.gestionAcademica4.Archivo archivo=new cesar.gestionAcademica4.Archivo("gestion_actividades.txt");
        return archivo.registrar(n.actividad()+ ";"
                    + n.getinstitucion()+ ";"
                    + n.gethora()+ ";"
                    + n.getproducto());
    }
    public void borrar(){
        Amaranny.Archivo archivo = new Amafranny.Archivo("gestion_actividades.txt");
        archivo.borrarContenido();
    }
}


