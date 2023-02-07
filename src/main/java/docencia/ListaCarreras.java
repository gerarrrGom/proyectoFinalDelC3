/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;

import java.util.LinkedList;

/**
 *
 * @author cardo
 */
public class ListaCarreras {
     private LinkedList<Carrera> lista;
    public ListaCarreras(){
        lista = new LinkedList();
    }
    public Carrera getCarrera(int indice){
        return lista.get(indice);
    }
    public void eliminarCarrera(int indice){
        lista.remove(indice);
    }
    public int size(){
        return lista.size();
    }
    public void agregarCarrera(Carrera c){
        lista.add(c);
    }
}
