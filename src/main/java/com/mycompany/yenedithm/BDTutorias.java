/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yenedithm;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class BDTutorias {

    public LinkedList<Tutoria> obtener(){
        LinkedList<Tutoria> tutorias=null;
        Archivo archivo=new Archivo("tutorias.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            try{
            tutorias=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();
                String carrera=tokens.nextToken();
                String semestre=tokens.nextToken();
                String fechaR=tokens.nextToken();
                tutorias.add(new Tutoria(nombre, carrera, semestre, fechaR));
            }
            }catch(Exception ex){
                
            }
        }
        return tutorias;
    }
    
    public boolean registrarTutoria(Tutoria t){
        Archivo archivo=new Archivo("tutorias.txt");
        return archivo.registrar(t.getNombre()+ ";"
                    + t.getCarrera()+ ";"
                    + t.getSemestre()+ ";"
                    + t.getFechaR());
    }
    
    public void borrar(){
        Archivo archivo = new Archivo("tutorias.txt");
        archivo.borrarContenido();
    }
}
