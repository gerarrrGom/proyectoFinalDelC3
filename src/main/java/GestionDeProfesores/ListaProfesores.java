/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProfesores;

import java.util.LinkedList;

/**
 *
 * @author Lenovo-80T6
 */
public class ListaProfesores {
    
    private LinkedList<Profesor> lista;

        public ListaProfesores() {
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