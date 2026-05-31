import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafeteria sistema = new Cafeteria();
        int opcion;

        do {
            System.out.println("\n===== ===== SMART COFFEE ====== ========");
            System.out.println(" 1. Registrar cliente");
            System.out.println(" 2. Mostrar clientes");
            System.out.println(" 3. Registrar pedido");
            System.out.println(" 4. Actualizar pedido");
            System.out.println(" 5. Eliminar pedido");
            System.out.println(" 6. Mostrar promedio de consumo");
            System.out.println(" 7. Mostrar mejor cliente");
            System.out.println(" 8. Buscar cliente por correo");
            System.out.println(" 9. Mostrar pedidos registrados");
            System.out.println(" 10. Salir");
            System.out.print(" Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print(" Nombre: ");
                        String nom = sc.nextLine();
                        System.out.print(" Correo: ");
                        String corr = sc.nextLine();
                        System.out.print(" Edad: ");
                        int ed = sc.nextInt();
                        sc.nextLine();
                        System.out.print(" Codigo Cliente: ");
                        String cod = sc.nextLine();
                        System.out.print(" Membresia (Gold, Silver, Premium): ");
                        String mem = sc.nextLine();

                        Cliente nuevo = new Cliente(nom, corr, ed, cod, mem);
                        sistema.agregarCliente(nuevo);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    sistema.mostrarClientes();
                    break;
                case 3:
                    System.out.print("  Correo del cliente: ");
                    String cReg = sc.nextLine();
                    System.out.print("  Monto del consumo: ");
                    double conReg = sc.nextDouble();
                    sistema.registrarPedido(cReg, conReg);
                    break;
                case 4:
                    System.out.print("  Correo del cliente: ");
                    String cAct = sc.nextLine();
                    System.out.print("  Nuevo monto del consumo: ");
                    double conAct = sc.nextDouble();
                    sistema.actualizarPedido(cAct, conAct);
                    break;
                case 5:
                    System.out.print("  Correo del cliente: ");
                    String cEli = sc.nextLine();
                    sistema.eliminarPedido(cEli);
                    break;
                case 6:
                    double prom = sistema.promedioConsumo();
                    if (prom == 0.0) {
                        System.out.println("  No hay datos disponibles.");
                    } else {
                        System.out.println("  Promedio general de consumo: $" + prom);
                    }
                    break;
                case 7:
                    System.out.println("  Mejor cliente: " + sistema.mejorCliente());
                    break;
                case 8:
                    System.out.print("  Ingrese el correo a buscar: ");
                    String cBus = sc.nextLine();
                    Cliente encontrado = sistema.buscarClientePorCorreo(cBus);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("  Cliente no encontrado");
                    }
                    break;
                case 9:
                    sistema.mostrarPedidos();
                    break;
                case 10:
                    System.out.println("  Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 10);

        sc.close();
    }
}