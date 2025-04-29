public class Problema4_EquipoCelularEjecutor {
    public static void main(String[] args) {
        Problema4_EquipoCelularBase celular1 = new Problema4_EquipoCelularBase(
            "Android", 6.5, 300.00, 12, "00:1B:44:11:3A:B7", "356938035643809"
        );
        celular1.calcularCostoFinal();
        System.out.println(celular1.toString());

        System.out.println("-----------------------------");

        Problema4_EquipoCelularBase celular2 = new Problema4_EquipoCelularBase(
            "iOS", 5.8, 900.00, 15, "00:1A:79:34:2F:B8", "352099001761481"
        );
        celular2.calcularCostoFinal();
        System.out.println(celular2.toString());
    }
}
