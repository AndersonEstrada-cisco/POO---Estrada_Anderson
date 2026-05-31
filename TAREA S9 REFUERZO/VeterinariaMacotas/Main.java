import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControlVacunas sistema = new ControlVacunas();
        int opcion;


        do {
            System.out.println("\n ------ VETERINARIA MENU ------");
            System.out.println(" 1. Registrar Mascota");
            System.out.println(" 2. Mostrar Mascotas");
            System.out.println(" 3. Registrar Vacuna");
            System.out.println(" 4. Actualizar Vacuna");
            System.out.println(" 5. Eliminar Vacuna");
            System.out.println(" 6. Mostrar Vacunas");
            System.out.println(" 10. Salir");
            System.out.print(" Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print(" Codigo: ");
                        String cod = sc.nextLine();

                        System.out.print(" Nombre: ");
                        String nom = sc.nextLine();

                        System.out.print(" Tipo (Perro, Gato, Conejo, otro): ");
                        String tipo = sc.nextLine();

                        System.out.print(" Edad (0-20): ");
                        int edad = sc.nextInt();

                        sc.nextLine();

                        Mascota nueva = new Mascota(cod, nom, tipo, edad);
                        sistema.registrarMascota(nueva);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    sistema.mostrarMascotas();
                    break;

                case 3:
                    System.out.print(" Codigo de la mascota: ");
                    String codVac = sc.nextLine();
                    System.out.print(" Nombre de la vacuna: ");
                    String vac = sc.nextLine();
                    sistema.registrarVacuna(codVac, vac);
                    break;

                case 4:
                    System.out.print(" Código de la mascota: ");
                    String codAct = sc.nextLine();
                    System.out.print(" Nueva vacuna: ");
                    String nVac = sc.nextLine();
                    sistema.actualizarVacuna(codAct, nVac);
                    break;

                case 5:
                    System.out.print(" Código de la mascota: ");
                    String codEli = sc.nextLine();
                    sistema.eliminarVacuna(codEli);
                    break;

                case 6:
                    sistema.mostrarVacunas();
                    break;

                case 10:
                    System.out.println(" Saliendo del sistema.");
                    break;

                default:
                    System.out.println(" Opcion no válida.");
            }
        } while (opcion != 10);
    }
}