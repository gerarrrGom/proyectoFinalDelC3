/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pryfinalc3;

import SaulJM27.BDProyectsos;
import SaulJM27.Proyecto;

/**
 *
 * @author Lenovo-80T6
 */
public class PryFinalC3 {

    public static void main(String[] args) {
        BDProyectsos bd=new BDProyectsos();
        bd.registrarActividad(new Proyecto(0, "1", "2", "3", "4", 0, 0, 0, "hola"));
        
    }
}
