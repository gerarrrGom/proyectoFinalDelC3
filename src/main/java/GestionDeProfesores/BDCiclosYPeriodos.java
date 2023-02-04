
package GestionDeProfesores;

import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDCiclosYPeriodos {
    
     public LinkedList<Profesor> obtener(){
        LinkedList<Profesor> profesores=null;
         GestionDeProfesores.Archivo archivo=new GestionDeProfesores.Archivo("gestion_profesores.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            profesores=new LinkedList<>();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();
                String apellidoPaterno=tokens.nextToken();
                String apellidoMaterno=tokens.nextToken();
                String gradoAcademico=tokens.nextToken();
                String cursosImpartidos=tokens.nextToken();
                String contraseña=tokens.nextToken();
                String usuario=tokens.nextToken();
                Profesor p=new Profesor(nombre, apellidoPaterno, apellidoMaterno, gradoAcademico,  cursosImpartidos, contraseña, usuario);
                profesores.add(p);
                
            }
        }
        return profesores;
    }
    
    public boolean registrarActividad(Profesor p){
        GestionDeProfesores.Archivo archivo=new GestionDeProfesores.Archivo("gestion_profesores.txt");
        return archivo.registrar(p.getNombre()+ ";"
                    + p.getApellidoPaterno()+ ";"
                    + p.getApellidoMaterno()+ ";"
                    + p.getGradoAcademico() +";"
                    +p.getCursosImpartidos()+";"
                    +p.getContraseña()+ ";"
                    + p.getUsuario());
    }
    public void borrar(){
        GestionDeProfesores.Archivo archivo = new GestionDeProfesores.Archivo("gestion_profesores.txt");
        archivo.borrarContenido();
    }
}
    
