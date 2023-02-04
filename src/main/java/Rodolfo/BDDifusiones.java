/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rodolfo;

import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author "el profe Ariel"
 */
public class BDDifusiones {

    public LinkedList<Difusion> obtener(){
        LinkedList<Difusion> difusiones=null;
        Archivo archivo=new Archivo("difusiones.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            difusiones=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();
                String fechaI=tokens.nextToken();
                String fechaF=tokens.nextToken();            
                difusiones.add(new Difusion(nombre, fechaI, fechaF));
            }
        }
        return difusiones;
    }
    
    public boolean registrarDifusion(Difusion d){
        Archivo archivo=new Archivo("difusiones.txt");
        return archivo.registrar(d.getNombre()+ ";"
                    + d.getFechaI()+ ";"
                    + d.getFechaF());
    }
    
    public void borrar(){
        Archivo archivo = new Archivo("comentarios.txt");
        archivo.borrarContenido();
    }
}