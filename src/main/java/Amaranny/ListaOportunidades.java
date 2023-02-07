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
public class ListaOportunidades {
    private LinkedList<Oportunidades> lista;

    public ListaOportunidades() {
        lista=new LinkedList();
    }
    public LinkedList<Oportunidades> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Oportunidades> lista) {
        this.lista = lista;
    }
    
    public void agregarOportunidades(Oportunidades p){
        lista.add(p);
    }
    public Oportunidades getOportunidades(int indice){
        return lista.get(indice);
    }
    
    public void eliminarOportunidades(int indice){
        lista.remove(indice);
    }
    
    public int size(){
        return lista.size();
    }
}

