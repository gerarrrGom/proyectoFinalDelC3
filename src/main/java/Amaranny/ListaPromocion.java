/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amaranny;

import java.util.LinkedList;

/**
 *
 * @author Amaranny
 */
public class ListaPromocion {
    private LinkedList<Promocion> lista;

    public ListaPromocion() {
        lista=new LinkedList();
    }
    
    public void agregarDesarrollo(Promocion p){
        lista.add(p);
    }
    public Promocion getDesarrollo(int indice){
        return lista.get(indice);
    }
    
    public void eliminarDesarrollo(int indice){
        lista.remove(indice);
    }
    
    public int size(){
        return lista.size();
    }
}
