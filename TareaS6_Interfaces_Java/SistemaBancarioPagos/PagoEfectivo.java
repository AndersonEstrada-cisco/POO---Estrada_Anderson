public class PagoEfectivo implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println(" Pago en efectivo procesado por: $" + monto);
        } else {
            System.out.println(" *** El monto debe ser mayor a cero.");
        }
    }
}