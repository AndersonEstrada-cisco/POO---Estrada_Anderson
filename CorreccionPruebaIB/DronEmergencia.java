public class DronEmergencia extends Dron {
    private double recargoUrgencia;
    private int nivelPrioridad;

    //CONSTRUCTOR CON DATOS QUEMADOS
    public DronEmergencia() {
        super("DE-000", "EmergenciaBase", 5.0, 2.0, 1.0, 8.00);
        this.recargoUrgencia = 15.00;
        this.nivelPrioridad = 1;
    }

    //CONSTRUCTOR CON Scanner
    public DronEmergencia(String codigo, String modelo, double distanciakm, double pesoPaquete, double horasVuelo, double costoBase, double recargoUrgencia, int nivelPrioridad) {
        super(codigo, modelo, distanciakm, pesoPaquete, horasVuelo, 8);
        this.recargoUrgencia = recargoUrgencia;
        this.nivelPrioridad = nivelPrioridad;
    }

    public double getRecargoUrgencia() { return recargoUrgencia; }

    public void setRecargoUrgencia(double recargoUrgencia) {
        this.recargoUrgencia = recargoUrgencia;
    }

    public int getNivelPrioridad() { return nivelPrioridad; }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    public boolean validarDatos() {
        if (getPesoPaquete() <= 10 && getHorasVuelo() <= 3 && (nivelPrioridad >= 1 && nivelPrioridad <= 3)) {
            return true;
        } else {
            System.out.println(" ** Los datos no cumplen con los parámetros para el Dron de Emergencia (Máx 10kg, 3 horas, Prioridad 1-3).");
            return false;
        }
    }

    @Override
    public double calcularCostoEntrega() {
        if (validarDatos()) {
            return costoBase + (getDistanciaKm() * 1.50) + (getPesoPaquete() * 0.90) + recargoUrgencia;
        } else {
            System.out.println(" ** No se puede calcular el costo porque los datos exceden los límites o prioridad inválida.");
            return 0.0;
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n--- Dron Emergencia ---");
        super.mostrarInformacion();
        System.out.println(" Nivel de prioridad: " + nivelPrioridad + " | Recargo de Urgencia: $" + recargoUrgencia);
        System.out.println(" LImite de horas: 3 h | Limite de peso: 10 kg");

        double costoFinal = calcularCostoEntrega();

        if (costoFinal > 0) {
            System.out.println(" Costo de entrega: $" + costoFinal);
        } else {
            System.out.println(" Estado: ENTREGA RECHAZADA");
        }
    }
}