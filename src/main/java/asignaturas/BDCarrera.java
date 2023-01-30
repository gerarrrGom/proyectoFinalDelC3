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
public class BDCarrera {
    public LinkedList<Carrera> obtener(){
        LinkedList<Carrera> carreras=null;
        ListaSemestre semestres=null;
        ListaAsignatura asignaturas=null;
        
        Archivo archivo=new Archivo("plan_de_estudios.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            carreras=new LinkedList();
            semestres = new ListaSemestre();
            asignaturas = new ListaAsignatura();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String carrera=tokens.nextToken();
                for (int j = 0; j < 10; j++) {
                    int semestre =Integer.parseInt(tokens.nextToken());
                    for (int k = 0; k <5; k++) {
                        String asignatura=tokens.nextToken();
                        asignaturas.insertar(new Asignaturas(asignatura));
                    }
                    semestres.insertar(new Semestre(semestre,asignaturas)); 
                }                              
                carreras.add(new Carrera(carrera,semestres));
            }
        }
        return carreras;
    }
    
    public boolean registrarProducto(Carrera p){
        Archivo archivo=new Archivo("productos.txt");
        return archivo.registrar(p.getCodigo() + ";"
                    + p.getNombre() + ";"
                    + p.getDescripcion() + ";"
                    + p.getPrecio() + ";" + p.getExistencias());
    }
    
    
}
