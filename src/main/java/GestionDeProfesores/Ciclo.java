
package GestionDeProfesores;

public class Ciclo {
    
    private String fechaInicio;
    private String fechaTermino;
    private Periodo periodoA;
    private Periodo periodoB;
    private Periodo periodoZ;
    
     public Ciclo(String fechaInicio, String fechaTermino, Periodo periodoA, Periodo periodoB, Periodo periodoZ) {
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.periodoA = periodoA;
        this.periodoB = periodoB;
        this.periodoZ = periodoZ;
     
    }
     
     
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }


    public void setFechaTermino(String fechaTérmino) {
        this.fechaTermino = fechaTérmino;
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
