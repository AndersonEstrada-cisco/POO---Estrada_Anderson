public class DronLiviano extends Dron {

    private double limiteHoras;

    //Constructor con Datos quemados
    public DronLiviano() {
        super("DL-000", "LivianoBase", 5.0, 2.0, 1.0, 3.00);
        this.limiteHoras = 2.0;
    }

    //CONSTRUCTOR CON Scanner
    public DronLiviano(String codigo, String modelo, double distanciakm, double pesoPaquete, double horasVuelo, double costoBase, double limiteHoras) {
        super(codigo, modelo, distanciakm, pesoPaquete, horasVuelo, 3);
        this.limiteHoras = limiteHoras;
    }

    public double getLimiteHoras() { return limiteHoras; }
    public void setLimiteHoras(double limiteHoras) { this.limiteHoras = limiteHoras; }


    @Override
    public boolean validarDatos() {
        if (getPesoPaquete() <= 5.0 && getHorasVuelo() <= getLimiteHoras()) {
            return true;
        } else {
            System.out.println(" ** Los datos no cumplen con los parámetros para el Dron Liviano (Máx 5kg y " + getLimiteHoras() + " horas).");
            return false;
        }
    }

    @Override
    public double calcularCostoEntrega() {
        if (validarDatos()) {
            return costoBase + (getDistanciaKm() * 0.80) + (getPesoPaquete() * 0.50);
        } else {
            System.out.println(" ** No se puede calcular por los paráetros de Dron Liviano");
            return 0.0;
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n --- Dron Liviano ---");
        super.mostrarInformacion();
        System.out.println(" Límite de horas: " + getLimiteHoras() + " h | Límite de peso: 5 kg");

        double costoFinal = calcularCostoEntrega();

        if (costoFinal > 0) {
            System.out.println(" Costo de entrega: $" + costoFinal);
        } else {
            System.out.println(" Estado: ENTREGA RECHAZADA");
        }
    }
}