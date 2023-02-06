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
public class ListaArticulos {
    private LinkedList<Articulos> articulos;
    private LinkedList<Articulos> Articulos;

    public ListaArticulos() {
        articulos=new LinkedList();
    }
    
    public void agregar(Articulos a){
        articulos.add(a);
    }
    
    public void eliminar(int indice){
        articulos.remove(indice);
    }           
    
    public int total(){
        return articulos.size();
    }
    
    public Articulos obtener(int indice){
        return articulos.get(indice);
    }
    public LinkedList<Articulos>getArticulos(){
        return articulos; 
    }
     public void setLista(LinkedList<Articulos> articulos) {
        this.Articulos = articulos;
    }
    
    public void agregarArticulos(Articulos a){
        articulos.add(a);
    }
    public Articulos getArticulos(int indice){
        return articulos.get(indice);
    }
    
    public void eliminarArticulos(int indice){
        articulos.remove(indice);
    }
    
    public int size(){
        return articulos.size();
    }
}

