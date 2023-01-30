package asignaturas;
import java.util.LinkedList;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class ListaSemestre {
    private  LinkedList<Semestre> lista;
    
    public ListaSemestre(){
        lista = new LinkedList();
        
    }
    public void insertar(Semestre a){
        lista.add(a);
    }
    public void eliminar (int indice){
        lista.remove(indice);
    }
    public int total(){
        return lista.size();
    }
    public Semestre getSemestre(int indice){
        return lista.get(indice);
    }
}