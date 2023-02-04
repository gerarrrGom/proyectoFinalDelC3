
package GestionDeProfesores;

import java.util.LinkedList;

public class ListaCiclosYPeriodos {
  
    
    private LinkedList<Ciclo> lista;

        public ListaCiclosYPeriodos() {
            lista=new LinkedList<>();
        }
    public void agregarCiclosYPeriodos(Ciclo p){
         lista.add(p);
    }   
    
    public Ciclo getCiclosYPeriodos(int indice){
        return lista.get(indice);
     
     }
    public void eliminarCiclosYPeriodos(int indice){
        lista.remove(indice);
     
    }
    public int size(){
     return lista.size();
    
    }
    
 
}

