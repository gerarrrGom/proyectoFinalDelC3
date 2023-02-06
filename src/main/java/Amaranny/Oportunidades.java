/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amaranny;

/**
 *
 * @author Amaranny
 */
public class Oportunidades {
    private String oportunidades;
    private String problemas;

    public Oportunidades(String oportunidades, String problemas) {
        this.oportunidades = oportunidades;
        this.problemas = problemas;
    }

    public String getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(String oportunidades) {
        this.oportunidades = oportunidades;
    }

    public String getProblemas() {
        return problemas;
    }

    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }
     @Override
    public String toString(){
        return oportunidades + " " + problemas + " " ;
}
}    
