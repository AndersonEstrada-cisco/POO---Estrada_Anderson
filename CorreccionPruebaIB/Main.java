import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MOSTRAR DRONES CON DATOS QUEMADOS
        System.out.println("===== DRONES CON DATOS QUEMADOS =====");

        DronLiviano dronLiviano1 = new DronLiviano();
        DronCarga dronCarga1 = new DronCarga();
        DronEmergencia dronEmergencia1 = new DronEmergencia();

        dronLiviano1.mostrarInformacion();
        dronCarga1.mostrarInformacion();
        dronEmergencia1.mostrarInformacion();

        System.out.println("\n ===== CREACIÓN DE DRON =====");

        System.out.print(" Ingrese código: ");
        String codigo = sc.nextLine();

        System.out.print(" Ingrese modelo: ");
        String modelo = sc.nextLine();

        System.out.print(" Ingrese distancia (km): ");
        double distanciakm = sc.nextDouble();

        System.out.print(" Ingrese peso del paquete (kg): ");
        double pesoPaquete = sc.nextDouble();

        System.out.print(" Ingrese horas de vuelo: ");
        double horasVuelo = sc.nextDouble();

        /*  --- Dron de CARGA
        System.out.print("Ingrese costo por Kg adicional: ");
        double costoPorkg = sc.nextDouble();
        */


        /*  --- DRON DE EMERGENCIA
        System.out.print("Ingrese recargo de urgencia: ");
        double recargoUrgencia = sc.nextDouble();

        System.out.print("Ingrese nivel de prioridad 1-3: ");
        int nivelPrioridad = sc.nextInt();

         */

        DronLiviano dronLiviano2 = new DronLiviano(codigo, modelo, distanciakm, pesoPaquete, horasVuelo, 3.00, 2.0);
        dronLiviano2.mostrarInformacion();


    }
}