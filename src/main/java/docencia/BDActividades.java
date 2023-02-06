/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docencia;

import ResumenActividades.Archivo;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author cardo
 */
public class BDActividades {

    public LinkedList<Actividades> obtener() {
        LinkedList<Actividades> actividades = null;
        Archivo archivo = new Archivo("actividades.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            try {
                actividades = new LinkedList();
                for (int i = 0; i < lineas.size(); i++) {
                    String linea = lineas.get(i);
                    StringTokenizer tokens = new StringTokenizer(linea, ";");
                    String nombre = tokens.nextToken();
                    String materiales = tokens.nextToken();
                    String descripcion = tokens.nextToken();
                    actividades.add(new Actividades(nombre, materiales, descripcion));
                }
            } catch (Exception ex) {
            }
        }
        return actividades;
    }

    public boolean registrarCurso(Actividades c) {
        Archivo archivo = new Archivo("actividades.txt");
        return archivo.registrar(c.getNombre() + ";" + c.getMateriales() + ";" + c.getDescripcion());
    }

    public void borrar() {
        Archivo archivo = new Archivo("actividades.txt");
        archivo.borrarContenido();

    }
}
