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
public class BDOportunidades {
    public LinkedList<Oportunidades> obtener(){
        LinkedList<Oportunidades> actividades=null;
        Amaranny.Archivo archivo=new Amaranny.Archivo("oportunidades.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            actividades=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String oportunidades=tokens.nextToken();
                String problemas=tokens.nextToken();
                Oportunidades n=new Oportunidades(oportunidades,problemas);
                actividades.add(n);
            }
        }
        return actividades;
    }
    
    public boolean registrarOportunidades(Oportunidades n){
        Amaranny.Archivo archivo=new Amaranny.Archivo("oportunidades.txt");
        return archivo.registrar(n.getOportunidades()+";"+n.getProblemas());
    }
    public void borrar(){
        Amaranny.Archivo archivo = new Amaranny.Archivo("oportunidades.txt");
        archivo.borrarContenido();
    }
}

