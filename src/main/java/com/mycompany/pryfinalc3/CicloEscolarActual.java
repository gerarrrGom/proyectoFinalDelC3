/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryfinalc3;

//import GestionDeProfesores.Ciclo;

/**
 *
 * @author mar
 */
public class CicloEscolarActual {
    private String inicio;
    private String termino;
    
    public CicloEscolarActual(){
        inicio="OCTUBRE DE 2022";
        termino="SEPTIEMBRE DE 2023";
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }
    public String getCicloEscolarActual(){
        return " DE " + inicio + " A  " + termino;
    }
    
    
}
