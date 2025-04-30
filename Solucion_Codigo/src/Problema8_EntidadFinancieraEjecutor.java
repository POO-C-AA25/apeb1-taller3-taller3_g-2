public class Problema8_EntidadFinancieraEjecutor {
    public static void main(String[] args) {
        System.out.println("=== CHEQUES PROCESADOS ===");
        EntidadFinanciera Cheque1 = new EntidadFinanciera();
        Cheque1.calcularComisionBanco();
        System.out.println(Cheque1.toString());
        EntidadFinanciera Cheque2 = new EntidadFinanciera("Jorge Rivera", "Banco de Loja", (Math.random() * 100000) + 1);
        Cheque2.calcularComisionBanco();
        System.out.println(Cheque2.toString());
        EntidadFinanciera Cheque3 = new EntidadFinanciera("Bibiana Alulima", "Banco Pichincha", (Math.random() * 100000) + 1);
        Cheque3.calcularComisionBanco();
        System.out.println(Cheque3.toString());
    }
}

class EntidadFinanciera {
    // Atributos
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public EntidadFinanciera() {
        // Constructor vacío
    }
    
    // Constructor con parámetros
    public EntidadFinanciera(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    // Método para calcular comisión (0.002% del valor del cheque)
    public double calcularComisionBanco() {
        return this.comisionBanco = this.valorCheque * 0.00003;
    }

    // toString
    @Override
    public String toString() {
        return String.format(
            "[Cliente: %s, Banco: %s, Valor Cheque: $%,.2f, Comisión: $%,.2f]",
            nombreCliente, nombreBanco, valorCheque, comisionBanco
        );
    }
}
