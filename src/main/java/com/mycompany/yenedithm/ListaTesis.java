/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yenedithm;

import java.util.LinkedList;


public class ListaTesis {
    private LinkedList<Tesis> tesis;

    public ListaTesis() {
        tesis=new LinkedList();
    }
    
    public void agregar(Tesis a){
        tesis.add(a);
    }
    
    public void eliminar(int indice){
        tesis.remove(indice);
    }           
    
    public int total(){
        return tesis.size();
    }
    
    public Tesis obtener(int indice){
        return tesis.get(indice);
    }
}