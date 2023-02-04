
package Administradores;
import GestionDeProfesores.Profesor;
import ResumenActividades.Actividad;
import ResumenActividades.Archivo;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 @ author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class BDUsuarios {
        public LinkedList<Usuario> obtener(){
        LinkedList<Usuario> administradores=null;
        Archivo archivo=new Archivo("administradores.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            administradores=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();  
                int permiso=Integer.parseInt(tokens.nextToken());
                Usuario n=new Usuario(new Profesor(nombre),permiso);
                administradores.add(n);
                
            }
        }
        return administradores;
    }
    
    public boolean registrarProducto(Usuario a){
        Archivo archivo=new Archivo("usuarios.txt");
        return archivo.registrar(a.getDatos().getNombre()+ ";"
                    + a.getPermisos()+";");
    }
    public void borrar(){
        Archivo archivo = new Archivo("usuarios.txt");
        archivo.borrarContenido();
    }
}

