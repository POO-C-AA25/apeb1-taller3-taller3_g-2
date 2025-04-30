public class Problema7_AutomotorEjecutor {
    public static void main(String[] args) {
        System.out.println("=== AUTOMOTORES REGISTRADOS ===");
        Automotor Duenio1 = new Automotor();
        Duenio1.calcularMatricula();
        System.out.println(Duenio1.toString());
        Automotor Duenio2 = new Automotor("1102587463", "Toyota", 2010, 25000.00);
        Duenio2.calcularMatricula();
        System.out.println(Duenio2.toString());
        Automotor Duenio3 = new Automotor("1104875296", "Hyundai", 1995, 18000.38);
        Duenio3.calcularMatricula();
        System.out.println(Duenio3.toString());      
    }
}

class Automotor {
    // Atributos
    private String cedulaDueño;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automotor() {
        // Constructor vacío
    }    
    
    // Constructor con parámetros
    public Automotor(String cedulaDueño, String marca, int anioFabricacion, double valorVehiculo) {
        this.cedulaDueño = cedulaDueño;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }
    
    // Método para calcular matrícula
    public double calcularMatricula() {
        int añosAntiguedad = java.time.Year.now().getValue() - this.anioFabricacion;
        return this.valorMatricula = 0.00002 * this.valorVehiculo * añosAntiguedad;
    }

    // toString
    @Override
    public String toString() {
        return String.format(
            "[Cédula: %s, Marca: %s, Año: %d, Valor: $%,.2f, Matrícula: $%,.2f]",
            cedulaDueño, marca, anioFabricacion, valorVehiculo, valorMatricula
        );
    }
}