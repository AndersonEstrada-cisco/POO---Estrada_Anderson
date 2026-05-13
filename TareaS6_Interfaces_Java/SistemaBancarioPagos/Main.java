public class Main {
    public static void main(String[] args) {
        Pagable efectivo = new PagoEfectivo();
        Pagable tarjeta = new PagoTarjeta();
        Pagable transfer = new Transferencia();

        System.out.println(" ---- Transacciones ----");
        efectivo.procesarPago(100);
        tarjeta.procesarPago(100);
        transfer.procesarPago(100);

        System.out.println("\n ---  Validación del Monto ---");
        efectivo.procesarPago(-50.0);
    }
}