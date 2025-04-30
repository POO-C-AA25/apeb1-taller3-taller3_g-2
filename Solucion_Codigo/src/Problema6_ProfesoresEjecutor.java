public class Problema6_ProfesoresEjecutor {
    public static void main(String[] args) {
        // Creación de objetos Profesores
        Profesores Profesor1 = new Profesores("Carlos", "Chuchuca", 1200.00, "1135689456");
        Profesor1.calcularSueldoTotal();
        System.out.println(Profesor1.toString());
        Profesores Profesor2 = new Profesores("Norman", "Armijos", 1050.00, "1154789630");
        Profesor2.calcularSueldoTotal();
        System.out.println(Profesor2.toString());        
        Profesores Profesor3 = new Profesores("Valeria", "León", 854.65, "1547895622");
        Profesor3.calcularSueldoTotal();
        System.out.println(Profesor3.toString());
        Profesores Profesor4 = new Profesores();
        Profesor4.calcularSueldoTotal();
        System.out.println(Profesor4.toString());
    }
}

class Profesores {
    // Atributos
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    // Constructores
    public Profesores() {
        // Constructor vacío
    }

    public Profesores(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    // Método para calcular sueldo total
    public double calcularSueldoTotal() {
        return this.sueldoTotal = this.sueldoBasico * 1.20;
    }

    @Override
    public String toString() {
        return String.format(
            "Profesor: %s %s - Cédula: %s | Sueldo Básico: $%,.2f | Sueldo Total: $%,.2f",
            this.nombre,
            this.apellido,
            this.cedula,
            this.sueldoBasico,
            this.sueldoTotal
        );
    }
}