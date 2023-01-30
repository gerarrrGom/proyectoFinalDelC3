/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

/**
 *
 * @author Reyna Ibañez Tome
 */
public class Semestre {
    
    private int numero;
    private  ListaAsignatura lista;

    public Semestre(int numero, ListaAsignatura lista) {
        this.numero = numero;
        this.lista = lista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ListaAsignatura getLista() {
        return lista;
    }

    public void setLista(ListaAsignatura lista) {
        this.lista = lista;
    }
    
    
    
}
