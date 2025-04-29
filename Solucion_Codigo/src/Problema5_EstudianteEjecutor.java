public class Problema5_EstudianteEjecutor {
    public static void main(String[] args) {
        Problema5_EstudianteBase estudiante1 = new Problema5_EstudianteBase(
            "Ana Ruiz",
            (Math.random() * 10),
            (Math.random() * 10),
            (Math.random() * 10)
        );
        estudiante1.calcularPromedio();
        estudiante1.determinarEstado();
        System.out.println(estudiante1.toString());

        System.out.println("-----------------------------");

        Problema5_EstudianteBase estudiante2 = new Problema5_EstudianteBase(
            "Carlos Pérez", 6.0, 7.0, 8.5
        );
        estudiante2.calcularPromedio();
        estudiante2.determinarEstado();
        System.out.println(estudiante2.toString());
    }
}
