import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("--- SISTEMA DE ROLES ---");
        System.out.println(" 1. Cajero\n 2. Administrador\n 3. Supervisor");
        System.out.print(" Seleccione: ");
        int opcion = sn.nextInt();

        Autenticable usuario = null;

        switch (opcion) {
            case 1:
                usuario = new Cajero();
                break;
            case 2:
                usuario = new Administrador();
                break;
            case 3:
                usuario = new Supervisor();
                break;
        }

        if (usuario != null) {
            System.out.print("\n\n Ingrese su usuario: ");
            String user = sn.next();
            System.out.print(" Ingrese su Clave: ");
            String password = sn.next();

            if (usuario.iniciarSesion(user, password)) {
                System.out.println(" Acceso concedido\n");

                if (usuario instanceof Gestionable g) {
                    g.gestionarDatos();
                }
                if (usuario instanceof Reportable r) {
                    r.generarReporte();
                }
            } else {
                System.out.println("Acceso denegado.");
            }
        }
    }
}

