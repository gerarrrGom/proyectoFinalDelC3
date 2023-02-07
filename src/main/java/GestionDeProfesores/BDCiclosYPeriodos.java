
package GestionDeProfesores;

import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDCiclosYPeriodos {
    
     public LinkedList<Ciclo> obtener(){
        LinkedList<Ciclo> list=null;
         GestionDeProfesores.Archivo archivo=new GestionDeProfesores.Archivo("ciclosYperiodos.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            list=new LinkedList<>();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String fechaInicio=tokens.nextToken();
                String fechaTermino=tokens.nextToken();
                Periodo periodoA=Periodo.parsePeriodo(tokens.nextToken());
                Periodo periodoB=Periodo.parsePeriodo(tokens.nextToken());
                Periodo periodoZ=Periodo.parsePeriodo(tokens.nextToken());;
                Ciclo c=new Ciclo(fechaInicio, fechaTermino, periodoA, periodoB, periodoZ);
                list.add(c);
                
            }
        }
        return list;
    }
    
    public boolean registrarCiclo(Ciclo c){
        GestionDeProfesores.Archivo archivo=new GestionDeProfesores.Archivo("ciclosYPeriodos.txt");
        return archivo.registrar(c.getFechaInicio()+ ";"
                    + c.getFechaTermino()+ ";"
                    + c.getPeriodoA()+ ";"
                    + c.getPeriodoB()+";"
                    +c.getPeriodoB()+";"
                    +c.getPeriodoZ());
                    
    }
    public void borrar(){
        GestionDeProfesores.Archivo archivo = new GestionDeProfesores.Archivo("ciclosYPeriodos.txt");
        archivo.borrarContenido();
    }
}
    
