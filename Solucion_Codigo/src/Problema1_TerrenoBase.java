public class Problema1_TerrenoBase {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;

    public Problema1_TerrenoBase() {}

    public Problema1_TerrenoBase(double ancho, double largo, double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCostoTerreno() {
        this.costoTerreno = this.area * this.valorMetroCuadrado;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double getArea() {
        return area;
    }

        public double getCostoTerreno() {
        return costoTerreno;
    }

    public String toString() {
        return String.format("Ancho: %.2f, Largo: %.2f, Valor x m2: %.2f, Area: %.2f, Costo: %.2f",
                ancho, largo, valorMetroCuadrado, area, costoTerreno);
    }
}
