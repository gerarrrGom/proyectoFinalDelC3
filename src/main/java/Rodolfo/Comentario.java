/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rodolfo;

/**
 *
 * @author REMEDIOS CONTRERAS
 */
public class Comentario extends Object{
    String cuerpo;

    public Comentario(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String imprimirCuerpo(){
        return cuerpo;
    }

}
