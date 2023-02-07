package Rodolfo;

import java.util.LinkedList;

/**
 *
 * @author "el profe Ariel"
 */
public class ListaComentarios {
    private LinkedList<Comentario> comentarios;

    public ListaComentarios() {
        comentarios=new LinkedList();
    }
    
    public void agregar(Comentario a){
        comentarios.add(a);
    }
    
    public void eliminar(int indice){
        comentarios.remove(indice);
    }           
    
    public int total(){
        return comentarios.size();
    }
    
    public Comentario obtener(int indice){
        return comentarios.get(indice);
    }
}
