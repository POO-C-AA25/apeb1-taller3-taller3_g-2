public class Problema4_EquipoCelularBase {
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMAC;
    private String infoIMEI;

    public Problema4_EquipoCelularBase(String sistemaOperativo, double tamanioPantalla, double costoInicial, double ivaPorcentaje, String direccionMAC, String infoIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMAC = direccionMAC;
        this.infoIMEI = infoIMEI;
    }

    public void calcularCostoFinal() {
        ivaCostoInicial = (costoInicial * ivaPorcentaje) / 100;
        costoFinal = costoInicial + ivaCostoInicial;
    }

    public String toString() {
        return String.format(
            "Sistema Operativo: %s\nTamaño Pantalla: %.2f pulgadas\nCosto Inicial: %.2f\nIVA (%%): %.2f\nIVA Costo Inicial: %.2f\nCosto Final: %.2f\nMAC: %s\nIMEI: %s",
            sistemaOperativo, tamanioPantalla, costoInicial, ivaPorcentaje, ivaCostoInicial, costoFinal, direccionMAC, infoIMEI
        );
    }
}
