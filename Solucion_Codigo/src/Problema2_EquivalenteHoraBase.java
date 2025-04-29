public class Problema2_EquivalenteHoraBase {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public Problema2_EquivalenteHoraBase(double horas) {
        this.horas = horas;
    }

    public void calcularEquivalencias() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24;
    }

    public String toString() {
        return String.format("Horas: %.2f\nMinutos: %.2f\nSegundos: %.2f\nDías: %.2f",
                horas, minutos, segundos, dias);
    }
}
