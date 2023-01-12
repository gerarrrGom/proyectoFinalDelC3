/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResumenActividades;

/**
 * @author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class Actividad extends ActividadesEnGeneral{
    private int HorasCicloA; 
    private int HorasCicloB;
    private int HorasCicloC;

    public Actividad(double indice, String actividad) {
        super(indice, actividad);
    }
    

    public int getHorasCicloA() {
        return HorasCicloA;
    }

    public void setHorasCicloA(int HorasCicloA) {
        this.HorasCicloA = HorasCicloA;
    }

    public int getHorasCicloB() {
        return HorasCicloB;
    }

    public void setHorasCicloB(int HorasCicloB) {
        this.HorasCicloB = HorasCicloB;
    }

    public int getHorasCicloC() {
        return HorasCicloC;
    }

    public void setHorasCicloC(int HorasCicloC) {
        this.HorasCicloC = HorasCicloC;
    }
    
    
    
    
}
