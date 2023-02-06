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
public class ListaIndicadores {
    private LinkedList<Indicadores> Indicadores;
    private LinkedList<Indicadores> indicadores;

    public ListaIndicadores() {
        Indicadores=new LinkedList();
    }
    
    public void agregar(Indicadores n){
        Indicadores.add(n);
    }
    
    public void eliminar(int indice){
        Indicadores.remove(indice);
    }           
    
    public int total(){
        return indicadores.size();
    }
    
    public Indicadores obtener(int indice){
        return indicadores.get(indice);
    }
    public LinkedList<Indicadores>getIndicadores(){
        return indicadores; 
    }
     public void setLista(LinkedList<Indicadores> indicadores) {
        this.Indicadores = indicadores;
    }
    
    public void agregarIndicadores(Indicadores n){
        indicadores.add(n);
    }
    public Indicadores getIndicadores(int indice){
        return indicadores.get(indice);
    }
    
    public void eliminarIndicadores(int indice){
        indicadores.remove(indice);
    }
    
    public int size(){
        return indicadores.size();
    }
}

