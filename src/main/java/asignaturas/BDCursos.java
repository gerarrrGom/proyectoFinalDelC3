/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;
import java.util.LinkedList;
import java.util.StringTokenizer;


/**
 *
 * @author Reyna Ibañez Tome
 */
public class BDCursos {
    public LinkedList<Curso> obtener() {
        LinkedList<Curso> cursos = null;
        Archivo archivo=new Archivo("plan_de_estudios.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            try {
            cursos = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                    String linea = lineas.get(i);
                    StringTokenizer tokens = new StringTokenizer(linea, ";");
                    String carrera = tokens.nextToken();
                    String asignatura = tokens.nextToken();
                    int semestre = Integer.parseInt(tokens.nextToken());
                    String cicloEscolar = tokens.nextToken();
                    float horas = Float.parseFloat(tokens.nextToken());
                    int numAlumnos = Integer.parseInt(tokens.nextToken());
                    cursos.add(new Curso(new Carrera(carrera), new Asignatura(asignatura), semestre));
                }
            } catch (Exception ex) {
            }
        }
        return cursos;
    }
    
    public boolean registrarCarrera(Curso c){
        Archivo archivo=new Archivo("plan_de_estudios.txt");
        return archivo.registrar(c.getCarrera() + ";" + c.getAsignatura() + ";" + c.getSemestre());
    }
    public void borrar() {
        Archivo archivo = new Archivo("plan_de_estudios.txt");
        archivo.borrarContenido();

    }
    
}
