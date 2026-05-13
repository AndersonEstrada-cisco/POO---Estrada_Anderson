public class PagoTarjeta implements Pagable {

    private final double comision = 0.05;

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double total = monto + (monto * comision);
            System.out.println(" Pago con Tarjeta: $" + monto + " + $" + (monto * comision) + " de comisión. Total: $" + total);
        } else {
            System.out.println(" *** Monto inválido para tarjeta");
        }
    }
}