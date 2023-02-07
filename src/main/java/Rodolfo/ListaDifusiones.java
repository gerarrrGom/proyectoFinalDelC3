/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rodolfo;

import java.util.LinkedList;

/**
 *
 * @author REMEDIOS CONTRERAS
 */
public class ListaDifusiones {
    private LinkedList<Difusion> difusiones;

    public ListaDifusiones() {
        difusiones=new LinkedList();
    }
    
    public void agregar(Difusion a){
        difusiones.add(a);
    }
    
    public void eliminar(int indice){
        difusiones.remove(indice);
    }           
    
    public int total(){
        return difusiones.size();
    }
    
    public Difusion obtener(int indice){
        return difusiones.get(indice);
    }
}