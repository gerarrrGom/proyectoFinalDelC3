/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaulJM27;

import ResumenActividades.Archivo;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author Saul
 */
public class BDIndicadores {
    
    public LinkedList<Indicadores> obtener(){
        LinkedList<Indicadores> Cuantitativos=null;
        Archivo archivo=new Archivo("Indicadores.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        
        if(lineas!=null){
            Cuantitativos=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
              
                int  NumeroDeProyecto=Integer.parseInt(tokens.nextToken());
                int NumeroIndicador=Integer.parseInt(tokens.nextToken());
                String Descripcion=tokens.nextToken();
                Indicadores n=new Indicadores(NumeroDeProyecto, NumeroIndicador,Descripcion);
                Cuantitativos.add(n);
            }
        }
        return Cuantitativos;
    }
    
    public boolean registrarActividad(Indicadores n){
        Archivo archivo= new Archivo("Indicadores.txt");
        return archivo.registrar(n.getNumeroDeProyecto()+ ";"
                    + n.getNumeroIndicador()+ ";"
                    + n.getDescripcion());
        
    }
    public void borrar(){
        Archivo archivo=new Archivo("Indicadores.txt");
        archivo.borrarContenido();
    }
}
