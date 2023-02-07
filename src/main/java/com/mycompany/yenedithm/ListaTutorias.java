/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yenedithm;

import java.util.LinkedList;


public class ListaTutorias {
    private LinkedList<Tutoria> tutorias;

    public ListaTutorias() {
        tutorias=new LinkedList();
    }
    
    public void agregar(Tutoria a){
        tutorias.add(a);
    }
    
    public void eliminar(int indice){
        tutorias.remove(indice);
    }           
    
    public int total(){
        return tutorias.size();
    }
    
    public Tutoria obtener(int indice){
        return tutorias.get(indice);
    }
}
