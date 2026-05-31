import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ReservaCancha sistema = new ReservaCancha();
        int opcion;

        do {
            System.out.println("\n ------ MENU ---------");
            System.out.println(" 1. Registrar Cliente");
            System.out.println(" 2. Mostrar Clientes");
            System.out.println(" 3. Registrar Reserva");
            System.out.println(" 4. Actualizar Reserva");
            System.out.println(" 5. Eliminar Reserva");
            System.out.println(" 6. Mostrar Reservas");
            System.out.println(" 7. Total Horas Reservadas");
            System.out.println(" 8. Cliente con Mayor Reserva");
            System.out.println(" 9. Salir");
            System.out.print(" Opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print(" Nombre: ");
                        String nom = teclado.nextLine();

                        System.out.print(" Cédula (10 digitos): ");
                        String ced = teclado.nextLine();

                        System.out.print(" Edad ( 15-60 ): ");
                        int ed = teclado.nextInt();
                        teclado.nextLine();

                        System.out.print(" Teléfono (solo numeros): ");
                        String tel = teclado.nextLine();

                        Cliente nuevo = new Cliente(nom, ced, ed, tel);
                        sistema.registrarCliente(nuevo);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    sistema.mostrarClientes();
                    break;


                case 3:
                    System.out.print(" Cédula del cliente: ");
                    String cedRes = teclado.nextLine();
                    System.out.print("Horas (1-5): ");
                    int horas = teclado.nextInt();
                    sistema.registrarReserva(cedRes, horas);
                    break;


                case 4:
                    System.out.print(" Cédula del cliente: ");
                    String cedAct = teclado.nextLine();
                    System.out.print(" Nuevas Horas (1-5): ");
                    int nHoras = teclado.nextInt();
                    sistema.actualizarReserva(cedAct, nHoras);
                    break;


                case 5:
                    System.out.print(" Cédula del cliente: ");
                    String cedEli = teclado.nextLine();
                    sistema.eliminarReserva(cedEli);
                    break;


                case 6:
                    sistema.mostrarReservas();
                    break;


                case 7:
                    System.out.println(" Total de horas: " + sistema.calcularTotalHoras());
                    break;


                case 8:
                    System.out.println("Mayor reserva: " + sistema.clienteMayorReserva());
                    break;


                case 9:
                    System.out.println(" Saliendo del programa.");
                    break;


                default:
                    System.out.println(" Opción inválida.");
            }
        } while (opcion != 9);

        teclado.close();
    }
}