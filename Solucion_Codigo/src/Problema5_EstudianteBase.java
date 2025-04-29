public class Problema5_EstudianteBase {
    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;
    private String estado;

    public Problema5_EstudianteBase(String nombre, double materia1, double materia2, double materia3) {
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public void determinarEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    public String toString() {
        return String.format("Estudiante: %s\nNotas: %.2f, %.2f, %.2f\nPromedio: %.2f\nEstado: %s",
                nombre, materia1, materia2, materia3, promedio, estado);
    }
}
