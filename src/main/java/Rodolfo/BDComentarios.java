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
public class BDComentarios {

    public LinkedList<Comentario> obtener(){
        LinkedList<Comentario> comentarios=null;
        Archivo archivo=new Archivo("comentarios.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            try{
                comentarios=new LinkedList();
                for(int i=0;i<lineas.size();i++){
                    String linea=lineas.get(i);
                    StringTokenizer tokens=new StringTokenizer(linea,";");
                    String cuerpo=tokens.nextToken();             
                    comentarios.add(new Comentario(cuerpo));
                }
            }catch(Exception ex){
                }
        }
        return comentarios;
    }
    
    public boolean registrarComentario(Comentario p){
        Archivo archivo=new Archivo("comentarios.txt");
        return archivo.registrar(p.getCuerpo()+";");
    }
    public void borrar(){
        Archivo archivo = new Archivo("comentarios.txt");
        archivo.borrarContenido();
    }
}