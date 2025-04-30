import java.time.LocalDate;
import java.time.Period;

public class Problema9_EmprendimientoEjecutor {    
    public static void main(String[] args) {           
        System.out.println("==EMPRENDIMIENTOS==");
        Emprendimiento Emprendimientonull = new Emprendimiento();
        Emprendimientonull.calcularAniosAntiguedad();
        Emprendimientonull.determinarTipoNegocio();
        System.out.println("Emprendimiento null: " + Emprendimientonull.toString());

        Emprendimiento Emprendimiento1 = new Emprendimiento("Jugos del Valle",
                "1790408515001", 
                "Gastronomía", 
                "Eduardo Soto", 
                "Parroquia El Valle, Calle Esmeraldas y Puerto Bolívar",
                LocalDate.of(2010, 05, 13),
                100000.50);
        Emprendimiento1.calcularAniosAntiguedad();
        Emprendimiento1.determinarTipoNegocio();
        System.out.println("Emprendimiento 2: " + Emprendimiento1.toString());
        
        Emprendimiento Emprendimiento2 = new Emprendimiento("Bisutería Bibiana",
                "1102645687001", 
                "Moda", 
                "Bibiana Alulima", 
                "Parroquia Sucre, Avenida 10 de Agosto y Rocafuerte",
                LocalDate.of(2000, 9, 24),
                500.0);
        Emprendimiento2.calcularAniosAntiguedad();
        Emprendimiento2.determinarTipoNegocio();
        System.out.println("Emprendimiento 2: " + Emprendimiento2.toString());
    }
}

class Emprendimiento {
    private String nombreComercial;
    private String RUC;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private LocalDate fechaActividadInicio;
    private double capitalInicial;
    private int aniosAntiguedad;
    private String tipoNegocio;

    public Emprendimiento() {
        // Constructor Vacío
    }
    // Constructor con atributos
    public Emprendimiento(String nombreComercial, String RUC, String sectorEconomico,
                        String propietario, String ubicacion, LocalDate fechaActividadInicio,
                        double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.RUC = RUC;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaActividadInicio = fechaActividadInicio;
        this.capitalInicial = capitalInicial;
    }
    public void actualizarInformacion(String nombreComercial, String RUC, String sectorEconomico,
                                    String propietario, String ubicacion, LocalDate fechaActividadInicio,
                                    double capitalInicial, int aniosAntiguedad, String tipoNegocio) {
        this.nombreComercial = nombreComercial;
        this.RUC = RUC;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaActividadInicio = fechaActividadInicio;
        this.capitalInicial = capitalInicial;
        this.aniosAntiguedad = aniosAntiguedad;
        this.tipoNegocio = tipoNegocio;
    }
    
    // Método para calcular los Años de Antiguedad
    public int calcularAniosAntiguedad() {
        if (fechaActividadInicio == null) {
        return 0;
        }
        LocalDate fechaActual = LocalDate.now();
        Period diferencia = Period.between(fechaActividadInicio, fechaActual);
        this.aniosAntiguedad = diferencia.getYears();
        return this.aniosAntiguedad;
    }
    // Método para Determinar el Tipo de Negocio
    public String determinarTipoNegocio() {
        if (capitalInicial <= 0) {
            return this.tipoNegocio = "No tiene capital Inicial, por ende, no es una empresa.";
        } else if (capitalInicial <= 100000) {
            return this.tipoNegocio = "Microempresa";
        } else if (capitalInicial <= 1000000) {
            return this.tipoNegocio = "Pequeña empresa";
        } else if (capitalInicial <= 5000000) {
            return this.tipoNegocio = "Mediana empresa";
        } else {
            return this.tipoNegocio = "Gran Empresa";
        }
    }
    
    @ Override
    public String toString() {
        return "{Nombre Comercial = " + nombreComercial +
                ", RUC = " + RUC +
                ", Sector Económico = " + sectorEconomico +
                ", Propietario = " + propietario +
                ", Ubicación = " + ubicacion +
                ", Fecha de Inicio de Actividades Económicas = " + fechaActividadInicio +
                ", Capital Inicial = " + capitalInicial +
                ", Años de Antiguedad = " + aniosAntiguedad +
                ", Tipo de negocio = " + tipoNegocio + "}";
    }
}