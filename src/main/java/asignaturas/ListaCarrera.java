/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

import java.util.LinkedList;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class ListaCarrera {
    private  LinkedList<Carrera> lista;
    
    public ListaCarrera(){
        lista = new LinkedList();
        
    }
    public void insertar(Carrera a){
        lista.add(a);
    }
    public void eliminar (int indice){
        lista.remove(indice);
    }
    public int total(){
        return lista.size();
    }
    public Carrera getCarrera(int indice){
        return lista.get(indice);
    }
}
    

