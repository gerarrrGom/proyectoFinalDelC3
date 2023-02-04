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
public class ListaCursosImpartidos {
    private LinkedList<CursosImpartidos> cursos;
   

    public ListaCursosImpartidos() {
        cursos=new LinkedList();
    }
    
    public void agregar(CursosImpartidos a){
        cursos.add(a);
    }
    public void editar(int indice,CursosImpartidos a){
        CursosImpartidos aux = obtener(indice);
        aux = a;
    }
    
    public void eliminar(int indice){
        cursos.remove(indice);
    }           
    
    public int total(){
        return cursos.size();
    }
    
    public CursosImpartidos obtener(int indice){
        return cursos.get(indice);
    }

    /*
    public void cargarCursos(){
        
    }
*/
}