
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
public class BDAdministradores {
        public LinkedList<Administrador> obtener(){
        LinkedList<Administrador> administradores=null;
        Archivo archivo=new Archivo("administradores.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            administradores=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();
                String usuario=tokens.nextToken();
                String contraseña=tokens.nextToken();
                Administrador n=new Administrador(new Profesor(nombre), contraseña, usuario);
                administradores.add(n);
                
            }
        }
        return administradores;
    }
    
    public boolean registrarProducto(Administrador a){
        Archivo archivo=new Archivo("administradores.txt");
        return archivo.registrar(a.getDatos().getNombre()+ ";"
                    + a.getUsuario()+ ";"
                    + a.getContraseña()+ ";");
    }
    public void borrar(){
        Archivo archivo = new Archivo("administradores.txt");
        archivo.borrarContenido();
    }
}

