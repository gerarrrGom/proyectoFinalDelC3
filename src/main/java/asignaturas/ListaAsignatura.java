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
public class ListaAsignatura {
    private  LinkedList<Asignaturas> lista;
    
    public ListaAsignatura(){
        lista = new LinkedList();
        
    }
    public boolean insertar(Asignaturas a){
        lista.add(a);
        return true;
    }
    public void eliminar (int indice){
        lista.remove(indice);
    }
    public int total(){
        return lista.size();
    }
    public Asignaturas getAsignatura(int indice){
        return lista.get(indice);
    }
    public int getPosicion(int numero){
        int posicion = -1;
        for(int i=0;i<total();i++){
            if(getAsignatura(i).getNumero().compareTo(numero)==0){
                posicion=i;
            }
        }
        return posicion;
    }
    public String imprimirAsignaturas(){
        String asignatura="";
        for(int i=0;i<total();i++){
            asignatura=asignatura+ lista.get(i).imprimirAsignatura() +"\n";
        }
        return asignatura;
    }
    public boolean editarAsignatura(String numero,Asignaturas nuevo){
        int i=getPosicion(numero);
        lista.set(i, nuevo);
        return true;
    }
    public Asignaturas getAsignatura(String numero){
        int i=getPosicion(numero);
        if(i>=0){
            return lista.get(i);
        }
        return null;
    }
    public boolean eliminar (String numero){
        int i=getPosicion(numero);
        lista.remove(i);
        return true;
    }
    
    /*public void consultarBD(){
        for(int i=0;i<5;i++){
            if(i % 2 ==0 ){
                lista.add(new Asignaturas(i+"", "asignatura"+i, "aps", i, "computacion"));
            }else{
                lista.add(new Asignaturas(i+"", "alumno"+i, "aps", i, "computacion"));
            }
        }
    }*/
}

    

