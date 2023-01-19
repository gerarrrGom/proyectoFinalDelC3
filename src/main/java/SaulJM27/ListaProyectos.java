/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

import java.util.LinkedList;

/**
 *
 * @author Saul
 */
public class ListaProyectos {
    private LinkedList<Proyecto> proyectos;

    public ListaProyectos() {
        proyectos=new LinkedList();
    }
    
    public void agregar(Proyecto a){
        proyectos.add(a);
    }
    
    public void eliminar(int indice){
        proyectos.remove(indice);
    }           
    
    public int total(){
        return proyectos.size();
    }
    
    public Proyecto obtener(int indice){
        return proyectos.get(indice);
    }

}
