/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProfesores;

import java.util.LinkedList;

/**
 *
 * @author Gerardo
 */
public class ListaProfesores {
    
    private LinkedList<Profesor> lista;

        public ListaProfesores() {
            lista=new LinkedList<>();
        }
    public LinkedList<Profesor> getLista() {
        return lista;
    }
    
    public void setLista(LinkedList<Profesor> lista) {
        this.lista = lista;
    }
    public void agregarProfesor(Profesor p){
         lista.add(p);
    }   
    
    public Profesor getProfesor(int indice){
        return lista.get(indice);
     
     }
    public void eliminarProfesor(int indice){
        lista.remove(indice);
     
    }
    public int size(){
     return lista.size();
    
    }
    
 
}
