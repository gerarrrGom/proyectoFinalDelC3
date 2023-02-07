/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.gestionAcademica4;

import java.util.LinkedList;

/**
 *
 * @author Cesar Juventino Zepeda Barriga
 * correo:cesar_zb12@hotmail.com
 */
public class ListaGestion {
    private LinkedList<Gestion> lista;

    public ListaGestion() {
        lista=new LinkedList();
    }

    public LinkedList<Gestion> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Gestion> lista) {
        this.lista = lista;
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
