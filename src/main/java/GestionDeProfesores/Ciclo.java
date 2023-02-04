
package GestionDeProfesores;

public class Ciclo {
    
    private String fechaInicio;
    private String fechaTérmino;
    private Periodo periodoA;
    private Periodo periodoB;
    private Periodo periodoZ;

    public Ciclo(String fechaInicio, String fechaTérmino) {
        this.fechaInicio = fechaInicio;
        this.fechaTérmino = fechaTérmino;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTérmino() {
        return fechaTérmino;
    }

    public void setFechaTérmino(String fechaTérmino) {
        this.fechaTérmino = fechaTérmino;
    }

    public Periodo getPeriodoA() {
        return periodoA;
    }

    public void setPeriodoA(Periodo periodoA) {
        this.periodoA = periodoA;
    }

    public Periodo getPeriodoB() {
        return periodoB;
    }

    public void setPeriodoB(Periodo periodoB) {
        this.periodoB = periodoB;
    }

    public Periodo getPeriodoZ() {
        return periodoZ;
    }

    public void setPeriodoZ(Periodo periodoZ) {
        this.periodoZ = periodoZ;
    }
    

}
