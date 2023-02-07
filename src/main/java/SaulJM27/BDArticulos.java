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
public class BDArticulos {
    
    public LinkedList<Articulos> obtener(){
        LinkedList<Articulos> Articulos=null;
        Archivo archivo=new Archivo("Articulos.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        
        if(lineas!=null){
            Articulos=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
               
                String titulo=tokens.nextToken();
                String revista=tokens.nextToken();
                String fase=tokens.nextToken();
                int  fecha=Integer.parseInt(tokens.nextToken());
                Articulos n=new Articulos(titulo,revista,fase,fecha);
                Articulos.add(n);
                
            }
        }
        return Articulos;
    }
    
    public boolean registrarArticulos(Articulos n){
        Archivo archivo= new Archivo("Articulos.txt");
        return archivo.registrar(n.getTitulo()+ ";"
                    + n.getRevista()+ ";"
                    + n.getFase()+ ";"
                    + n.getFecha());
        
    }
    public void borrar(){
        Archivo archivo=new Archivo("Articulos.txt");
        archivo.borrarContenido();
    }
}
