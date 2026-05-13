public class Transferencia implements Pagable {

    private final double recargo = 2;

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println(" Transferencia enviada: $" + monto + ". Cargo por servicio: $" + recargo);
        } else {
            System.out.println(" *** Monto insuficiente.");
        }
    }
}