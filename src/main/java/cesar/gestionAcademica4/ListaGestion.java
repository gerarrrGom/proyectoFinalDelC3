/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.gestionAcademica4;

import java.util.LinkedList;

/**
 *
 * @author cesar
 */
public class ListaGestion {
    private LinkedList<Gestion> lista;

    public ListaGestion() {
        lista=new LinkedList();
    }
    
    public void agregarActividad(Gestion p){
        lista.add(p);
    }
    public Gestion getActividad(int indice){
        return lista.get(indice);
    }
    
    public void eliminarActividad(int indice){
        lista.remove(indice);
    }
    
    public int size(){
        return lista.size();
    }
    
}