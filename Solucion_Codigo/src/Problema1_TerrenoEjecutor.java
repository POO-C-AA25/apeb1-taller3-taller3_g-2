public class Problema1_TerrenoEjecutor {
    public static void main(String[] args) {
        System.out.println("FORMA LARGA:");
        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valorMetroCuadrado = (Math.random() * 10) + 1;

        Problema1_TerrenoBase terreno1 = new Problema1_TerrenoBase();
        terreno1.setAncho(ancho);
        terreno1.setLargo(largo);
        terreno1.setValorMetroCuadrado(valorMetroCuadrado);
        terreno1.calcularArea();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1.toString());

        System.out.println("\nFORMA EFICIENTE:");
        Problema1_TerrenoBase terreno2 = new Problema1_TerrenoBase(8.9, 49.7, 5);
        terreno2.calcularArea();
        terreno2.calcularCostoTerreno();
        System.out.println(terreno2.toString());
    }
}

