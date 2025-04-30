public class Problema10_CandidatoPresidencial {
    public static void main(String[] args) {
        System.out.println("=== CANDIDATOS PRESIDENCIALES 2025 ===");
        CandidatoPresidencial candidatonull = new CandidatoPresidencial();
        candidatonull.validarEdadMinima();
        candidatonull.determinarTipoCandidato();
        System.out.println(candidatonull.toString());
        
        CandidatoPresidencial candidato1 = new CandidatoPresidencial();
        candidato1.setNombre("Xavier Hervas");
        candidato1.setEdad(34);
        candidato1.setPartidoPolitico("Izquierda Democrática");
        candidato1.setPlanGobierno("Reforma educativa y tecnológica");
        candidato1.setNumPropuestasClave(12);
        candidato1.validarEdadMinima();
        candidato1.determinarTipoCandidato();
        System.out.println(candidato1.toString());
        
        CandidatoPresidencial candidato2 = new CandidatoPresidencial("Luisa González", "Revolución Ciudadana");
        candidato2.setEdad(38);
        candidato2.setPlanGobierno("Seguridad ciudadana con enfoque comunitario");
        candidato2.setNumPropuestasClave(8);
        candidato2.validarEdadMinima();
        candidato2.determinarTipoCandidato();
        System.out.println(candidato2.toString());
        
        CandidatoPresidencial candidato3 = new CandidatoPresidencial("Daniel Noboa"
                , 42, "ADN", "Reactivación económica con enfoque en pymes y empleo juvenil", 15);        
        candidato3.validarEdadMinima();
        candidato3.determinarTipoCandidato();
        System.out.println(candidato3.toString());
    }
}

class CandidatoPresidencial {
    // Atributos
    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numPropuestasClave;
    private boolean validar;
    private String tipoCandidato;

    public CandidatoPresidencial() {
        // Constructor vacío
    }
    
    // Constructor medio completo
    public CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.edad = 0;
        this.planGobierno = "Plan no especificado";
        this.numPropuestasClave = 0;
    }
    
    // Constructor completo
    public CandidatoPresidencial(String nombre, int edad, String partidoPolitico, 
                                String planGobierno, int numPropuestasClave) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numPropuestasClave = numPropuestasClave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public int getNumPropuestasClave() {
        return numPropuestasClave;
    }

    public void setNumPropuestasClave(int numPropuestasClave) {
        this.numPropuestasClave = numPropuestasClave;
    }

    // Método para validar edad mínima (35 años según Constitución ecuatoriana)
    public boolean validarEdadMinima() {
        return this.validar = this.edad >= 35;
    }
    
    // Verificar si el candidate es elegible o no segu la edad
    public String determinarTipoCandidato() {
        return this.tipoCandidato = this.validar ? "Candidato Elegible" : "Candidato No Elegible, no cumple con la edad adecuada.";
    }

    @Override
    public String toString() {
        return "Candidato: " + nombre + 
                ", Edad: " + edad + 
                ", Partido Político: " +  partidoPolitico +
                ", Plan de Gobierno (Propuestas): " + planGobierno +
                ", Número de propuestas clave: " + numPropuestasClave +
                ", Candidato Elegible: " + tipoCandidato;        
    }
}