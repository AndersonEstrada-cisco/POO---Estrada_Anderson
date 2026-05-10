public class DronCarga extends Dron {
    private double costoPorKg;

    //Constructor con Datos quemados
    public DronCarga() {
        super("DC-000", "CargaBase", 5.0, 2.0, 1.0, 6.00);
        this.costoPorKg = 1.20;
    }

    //CONSTRUCTOR CON Scanner
    public DronCarga(String codigo, String modelo, double distanciakm, double pesoPaquete, double horasVuelo, double costoBase, double costoPorkg) {
        super(codigo, modelo, distanciakm, pesoPaquete, horasVuelo, 6);
        this.costoPorKg = costoPorkg;
    }

    public double getCostoPorKg() { return costoPorKg; }

    public void setCostoPorKg(double costoPorKg) {
        this.costoPorKg = costoPorKg;
    }

    @Override
    public boolean validarDatos() {
        if (getPesoPaquete() <= 30 && getHorasVuelo() <= 5) {
            return true;
        } else {
            System.out.println(" ** Los datos no cumplen con los parámetros para el Dron de Carga (Máx 30kg y 5 horas).");
            return false;
        }
    }

    @Override
    public double calcularCostoEntrega() {
        if (validarDatos()) {
            return costoBase + (getDistanciaKm() * 1.20) + (getPesoPaquete() * costoPorKg);
        } else {
            System.out.println(" ** No se puede calcular por los exceder los parametros de Dron de Carga.");
            return 0;
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n --- Dron de Carga ---");
        super.mostrarInformacion();
        System.out.println(" Costo por Kg: $" + costoPorKg + " | Límite horas: 5 h | Límite peso: 30 kg");

        double costoFinal = calcularCostoEntrega();

        if (costoFinal > 0) {
            System.out.println(" Costo de entrega: $" + costoFinal);
        } else {
            System.out.println(" Estado: ENTREGA RECHAZADA");
        }
    }
}