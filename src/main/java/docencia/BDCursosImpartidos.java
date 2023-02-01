/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;
import java.util.LinkedList;
import java.util.StringTokenizer;
/**
 *
 * @author cardo
 */
public class BDCursosImpartidos {
     public LinkedList<CursosImpartidos> obtener(){
        LinkedList<CursosImpartidos> cursos=null;
        Archivo archivo=new Archivo("cursosImpartidos.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            try{
                cursos=new LinkedList();
                for(int i=0;i<lineas.size();i++){
                    String linea=lineas.get(i);
                    StringTokenizer tokens=new StringTokenizer(linea,";");
                    String carrera=tokens.nextToken();
                    String asignatura=tokens.nextToken();
                    int semestre=Integer.parseInt(tokens.nextToken());
                    String cicloEscolar=tokens.nextToken();
                    float horas=Float.parseFloat(tokens.nextToken());
                    int numAlumnos =Integer.parseInt(tokens.nextToken());                
                    cursos.add(new CursosImpartidos(new Carrera(carrera),new Asignatura(asignatura),semestre, cicloEscolar, horas,numAlumnos));
                }
            }catch(Exception ex){                
            }
        }
        return cursos;
    }
    
    public boolean registrarCurso(CursosImpartidos c){
        Archivo archivo=new Archivo("cursosImpartidos.txt");
        return archivo.registrar( c.getCarrera() + ";"+ c.getAsignatura() + ";"+ c.getSemestre() + ";" + c.getCicloEscolar()+ ";" + c.getHoras()+ ";" + c.getNumAlumnos());
    }
    public void borrar(){
        Archivo archivo=new Archivo("cursosImpartidos.txt");
        archivo.borrarContenido();
        
    }
}
