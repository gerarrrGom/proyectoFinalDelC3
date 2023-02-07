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
        Amaranny.Archivo archivo=new Amaranny.Archivo("promocion.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            actividades=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String actividad=tokens.nextToken();
                String institucion=tokens.nextToken();
                int hora=Integer.parseInt(tokens.nextToken());
                String producto=tokens.nextToken();
                Promocion n=new Promocion(actividad,institucion,hora,producto);
                actividades.add(n);
            }
        }
        return actividades;
    }
    
    public boolean registrarDesarrollo(Promocion n){
        Amaranny.Archivo archivo=new Amaranny.Archivo("promocion.txt");
        return archivo.registrar(n.getActividad()+";"+n.getInstitucion()+";"+n.getHora()+";"+n.getProducto());
    }
    public void borrar(){
        Amaranny.Archivo archivo = new Amaranny.Archivo("promocion.txt");
        archivo.borrarContenido();
    }
}


