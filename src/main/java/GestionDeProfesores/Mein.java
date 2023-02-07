/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProfesores;

/**
 *
 * @author Lenovo-80T6
 */
public class Mein {
    public static void main(String[] args) {
        String inicio = "3/10/2022";
        String fin = "30/9/2023";
        Periodo a = Periodo.parsePeriodo("3/10/2022-10/2/2023");
        Periodo b = Periodo.parsePeriodo("1/3/2023-30/6/2023");
        Periodo c = Periodo.parsePeriodo("31/7/2023-22/9/2023");
        
        
        Ciclo ciclo=new Ciclo(inicio,fin,a,b,c);
        BDCiclosYPeriodos bd= new BDCiclosYPeriodos();
        bd.registrarCiclo(ciclo);
    }
}
