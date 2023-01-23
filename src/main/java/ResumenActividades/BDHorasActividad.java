/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResumenActividades;

import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 @ author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class BDHorasActividad{

    public LinkedList<Actividad> obtener(){
        LinkedList<Actividad> actividades=null;
        Archivo archivo=new Archivo("horas_actividad.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            actividades=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                double indice=Double.parseDouble(tokens.nextToken());
                String nombre=tokens.nextToken();
                int horasCicloA=Integer.parseInt(tokens.nextToken());
                int horasCicloB=Integer.parseInt(tokens.nextToken());
                int horasCicloC=Integer.parseInt(tokens.nextToken()); 
                Actividad n=new Actividad(indice,nombre);
                n.setHorasCicloA(horasCicloA);
                n.setHorasCicloB(horasCicloB);
                n.setHorasCicloC(horasCicloC);
                actividades.add(n);
                
            }
        }
        return actividades;
    }
    
    public boolean registrarProducto(Actividad p){
        Archivo archivo=new Archivo("horas_actividad.txt");
        return archivo.registrar(p.getIndice()+ ";"
                    + p.getActividad()+ ";"
                    + p.getHorasCicloA()+ ";"
                    + p.getHorasCicloB() + ";" + p.getHorasCicloC());
    }
    public void borrar(){
        Archivo archivo = new Archivo("horas_actividad.txt");
        archivo.borrarContenido();
    }
}