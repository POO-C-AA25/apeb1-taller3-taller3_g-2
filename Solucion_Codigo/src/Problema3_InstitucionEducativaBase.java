public class Problema3_InstitucionEducativaBase {
    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastoPorEstudiante;
    private double presupuesto;

    public Problema3_InstitucionEducativaBase(String nombre, String tipoInstitucion, int numAlumnos, int numDocentes, int numSedes, double gastoPorEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastoPorEstudiante = gastoPorEstudiante;
    }

    public void calcularPresupuesto() {
        presupuesto = numAlumnos * gastoPorEstudiante;
    }

    public String toString() {
        return String.format(
            "Nombre: %s\nTipo: %s\nAlumnos: %d\nDocentes: %d\nSedes: %d\nGasto por Estudiante: %.2f\nPresupuesto: %.2f",
            nombre, tipoInstitucion, numAlumnos, numDocentes, numSedes, gastoPorEstudiante, presupuesto
        );
    }
}
