public class Problema3_InstitucionEducativaEjecutor {
    public static void main(String[] args) {
        Problema3_InstitucionEducativaBase inst1 = new Problema3_InstitucionEducativaBase(
            "Colegio Nacional", "Pública", 500, 30, 2, 120.50
        );
        inst1.calcularPresupuesto();
        System.out.println(inst1.toString());

        System.out.println("-----------------------------");

        Problema3_InstitucionEducativaBase inst2 = new Problema3_InstitucionEducativaBase(
            "Instituto Privado", "Privada", 300, 25, 1, 250.75
        );
        inst2.calcularPresupuesto();
        System.out.println(inst2.toString());
    }
}
