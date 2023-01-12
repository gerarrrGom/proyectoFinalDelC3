/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResumenActividades;

import java.util.LinkedList;

/**
 * @author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class ListaDeActividades {
    LinkedList<Actividad> listaDeActividades;

    public ListaDeActividades() {
        listaDeActividades = new LinkedList<>();
    }

    public LinkedList<Actividad> getListaDeActividades() {
        return listaDeActividades;
    }

    public void setListaDeActividades(LinkedList<Actividad> listaDeActividades) {
        this.listaDeActividades = listaDeActividades;
    }
    
    public void cargarActividades(){
        listaDeActividades.add(new Actividad(1,"Docencia"));
        listaDeActividades.add(new Actividad(1.1,"Clases frente a grupo"));
        listaDeActividades.add(new Actividad(1.2,"Apoyo docente: asesoría, elaboración de material didáctico, preparación de clases, etc."));
        listaDeActividades.add(new Actividad(2,"Formación de recursos humanos"));
        listaDeActividades.add(new Actividad(2.1,"Tutorías"));
        listaDeActividades.add(new Actividad(2.2,"Dirección de tesis *(Servicio Social)"));
        listaDeActividades.add(new Actividad(3,"Investigación y/o promoción al desarrollo"));
        listaDeActividades.add(new Actividad(4,"Gestión académica(comisiones, puestos, etc)"));
        listaDeActividades.add(new Actividad(5,"Difusión"));
    }
    public void agregarActividad(Actividad a){
        listaDeActividades.add(a);
    }
    public void eliminarActividad(double indice){
        for(int i=0;i< listaDeActividades.size();i++){
            if(indice==listaDeActividades.get(i).getIndice()){
                listaDeActividades.remove(i);
            }
        }
    }
    public boolean verificarHoras(){
        int horasA=0;
        int horasB=0;
        int horasC=0;
        
        for(Actividad a : listaDeActividades){
            horasA= horasA+ a.getHorasCicloA();
            horasB= horasB+ a.getHorasCicloB();
            horasC= horasC+ a.getHorasCicloC();
        }
        if(horasA<=40){
            if(horasB<=40){
                if(horasC<=40){
                    return true;
                }
            }
        }
        return false;
    }
    
}
