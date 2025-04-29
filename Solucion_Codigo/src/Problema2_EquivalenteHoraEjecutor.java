public class Problema2_EquivalenteHoraEjecutor {
    public static void main(String[] args) {
        Problema2_EquivalenteHoraBase eq1 = new Problema2_EquivalenteHoraBase((Math.random() * 48) + 1);
        eq1.calcularEquivalencias();
        System.out.println(eq1.toString());

        Problema2_EquivalenteHoraBase eq2 = new Problema2_EquivalenteHoraBase(10);
        eq2.calcularEquivalencias();
        System.out.println(eq2.toString());
    }
}
