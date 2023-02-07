/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.gestionAcademica4;

/**
 *
 * @author Cesar Juventino Zepeda Barriga
 * correo:cesar_zb12@hotmail.com
 */
public class Gestion {
    private String nombre;
    private String comision;
    private String periodo;

    public Gestion(String nombre, String comision, String periodo) {
        this.nombre = nombre;
        this.comision = comision;
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
}
