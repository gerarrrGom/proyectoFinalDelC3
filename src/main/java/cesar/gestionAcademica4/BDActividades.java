/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//@author Cesar Juventino Zepeda Barriga
 //* correo:cesar_zb12@hotmail.com
package cesar.gestionAcademica4;


import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDActividades{

    public LinkedList<Gestion> obtener(){
        LinkedList<Gestion> actividades=null;
        cesar.gestionAcademica4.Archivo archivo=new cesar.gestionAcademica4.Archivo("gestion_actividades.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            actividades=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();
                String comision=tokens.nextToken();
                String periodo=tokens.nextToken();
                Gestion n=new Gestion(nombre,comision,periodo);
                actividades.add(n);
                
            }
        }
        return actividades;
    }
    
    public boolean registrarActividad(Gestion n){
        cesar.gestionAcademica4.Archivo archivo=new cesar.gestionAcademica4.Archivo("gestion_actividades.txt");
        return archivo.registrar(n.getNombre()+ ";"
                    + n.getComision()+ ";"
                    + n.getPeriodo());
    }
    public void borrar(){
        cesar.gestionAcademica4.Archivo archivo = new cesar.gestionAcademica4.Archivo("gestion_actividades.txt");
        archivo.borrarContenido();
    }
}
