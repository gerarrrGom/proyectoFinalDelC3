/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yenedithm;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class BDTesis {

    public LinkedList<Tesis> obtener(){
        LinkedList<Tesis> tesis=null;
        Archivo archivo=new Archivo("tesis.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            tesis=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String titulo=tokens.nextToken();
                String nombre=tokens.nextToken();
                String gradoObtener=tokens.nextToken();            
                String porcentaje=tokens.nextToken();            
                String fechaR=tokens.nextToken();            
                String fechaTP=tokens.nextToken();            
                tesis.add(new Tesis(titulo, nombre, gradoObtener, porcentaje, fechaR, fechaTP));
            }
        }
        return tesis;
    }
    
    public boolean registrarTesis(Tesis t){
        Archivo archivo=new Archivo("tesis.txt");
        return archivo.registrar(t.getTitulo()+ ";"
                    + t.getNombre()+ ";"
                    + t.getGradoObtener()+ ";"
                    + t.getPorcentaje()+ ";"
                    + t.getFechaR()+ ";"
                    + t.getFechaTP());
    }
    
    public void borrar(){
        Archivo archivo = new Archivo("tesis.txt");
        archivo.borrarContenido();
    }
}
