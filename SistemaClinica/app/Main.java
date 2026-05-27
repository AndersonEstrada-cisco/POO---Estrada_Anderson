package app;

import java.util.Scanner;
import modelo.Medico;
import modelo.Administrativo;
import Servicio.EmpleadoServicio;
import util.Validador;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpleadoServicio servicio = new EmpleadoServicio();

        while (true) {
            System.out.println("\n ========== CLINICA SALUD ==========");
            System.out.println(" 1. Registrar medico");
            System.out.println(" 2. Registrar administrativo");
            System.out.println(" 3. Mostrar empleados");
            System.out.println(" 4. Buscar por cedula");
            System.out.println(" 5. Reemplazar informacion");
            System.out.println(" 6. Eliminar registro");
            System.out.println(" 7. Calcular pagos");
            System.out.println(" 8. Mostrar estadísticas");
            System.out.println(" 9. Salir");
            System.out.print("Seleccione una opcion: ");

            String opcionStr = scanner.nextLine();
            int opcion = Validador.validarEnteroPositivo(opcionStr);

            // EL -1 ES PARA AVISAR QUE EL USUARIO IGRESÓ UN DATO INVALIDO

            if (opcion == -1 || opcion < 1 || opcion > 9) {
                System.out.println(" ** OPCION INVALIDA");
                continue;
            }

            if (opcion == 9) {
                System.out.println(" Saliendo...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print(" Cedula: ");
                    String cedulaMedico = scanner.nextLine();
                    if (!Validador.validarTexto(cedulaMedico)) {
                        break;
                    }
                    if (servicio.buscarCedulaRepetida(cedulaMedico)) {
                        System.out.println(" ** La cedula ya existe");
                        break;
                    }

                    System.out.print(" Nombre: ");
                    String nombreMedico = scanner.nextLine();
                    if (!Validador.validarTexto(nombreMedico)) {
                        break;
                    }

                    System.out.print(" Edad: ");
                    int edadMedico = Validador.validarEdad(scanner.nextLine());
                    if (edadMedico == -1) {
                        break;
                    }

                    System.out.print(" Telefono: ");
                    String telefonoMedico = scanner.nextLine();
                    if (!Validador.validarTelefono(telefonoMedico)) {
                        break;
                    }

                    System.out.print(" Correo: ");
                    String correoMedico = scanner.nextLine();
                    if (!Validador.validarCorreo(correoMedico)) {
                        break;
                    }

                    System.out.print(" Especialidad: ");
                    String especialidad = scanner.nextLine();
                    if (!Validador.validarTexto(especialidad)) {
                        break;
                    }

                    System.out.print(" Numero de pacientes atendidos: ");
                    int pacientesAtendidos = Validador.validarEnteroPositivo(scanner.nextLine());
                    if (pacientesAtendidos == -1) {
                        break;
                    }

                    System.out.print(" Valor de la consulta: ");
                    double valorConsulta = Validador.validarDoublePositivo(scanner.nextLine());
                    if (valorConsulta == -1) {
                        break;
                    }

                    servicio.registrarMedico(new Medico(cedulaMedico, nombreMedico, edadMedico, telefonoMedico, correoMedico, especialidad, pacientesAtendidos, valorConsulta));
                    break;

                case 2:
                    System.out.print(" Cedula: ");
                    String cedulaAdmin = scanner.nextLine();
                    if (!Validador.validarTexto(cedulaAdmin)) {
                        break;
                    }
                    if (servicio.buscarCedulaRepetida(cedulaAdmin)) {
                        System.out.println(" ** La cedula ya existe.");
                        break;
                    }

                    System.out.print("  Nombre: ");
                    String nombreAdmin = scanner.nextLine();
                    if (!Validador.validarTexto(nombreAdmin)) {
                        break;
                    }

                    System.out.print("  Edad: ");
                    int edadAdmin = Validador.validarEdad(scanner.nextLine());
                    if (edadAdmin == -1) {
                        break;
                    }

                    System.out.print("  Telefono: ");
                    String telefonoAdmin = scanner.nextLine();
                    if (!Validador.validarTelefono(telefonoAdmin)) {
                        break;
                    }

                    System.out.print("  Correo: ");
                    String correoAdmin = scanner.nextLine();
                    if (!Validador.validarCorreo(correoAdmin)) {
                        break;
                    }

                    System.out.print("  Departamento: ");
                    String departamento = scanner.nextLine();
                    if (!Validador.validarTexto(departamento)) {
                        break;
                    }

                    System.out.print("  Horas trabajadas: ");
                    int horasTrabajadas = Validador.validarEnteroPositivo(scanner.nextLine());
                    if (horasTrabajadas == -1) {
                        break;
                    }

                    System.out.print("  Valor por hora: ");
                    double valorHora = Validador.validarDoublePositivo(scanner.nextLine());
                    if (valorHora == -1) {
                        break;
                    }

                    servicio.registrarAdministrativo(new Administrativo(cedulaAdmin, nombreAdmin, edadAdmin, telefonoAdmin, correoAdmin, departamento, horasTrabajadas, valorHora));
                    break;

                case 3:
                    servicio.mostrarEmpleados();
                    break;

                case 4:
                    System.out.print("  Ingrese la cedula a buscar: ");
                    servicio.buscarPorCedula(scanner.nextLine());
                    break;

                case 5:
                    System.out.print("  Ingrese la cedula del registro a reemplazar: ");
                    String cedulaReemplazar = scanner.nextLine();
                    if (!Validador.validarTexto(cedulaReemplazar)) {
                        break;
                    }

                    System.out.println("  Seleccione el nuevo tipo (1. Medico | 2. Administrativo): ");
                    int tipo = Validador.validarEnteroPositivo(scanner.nextLine());
                    if (tipo != 1 && tipo != 2) {
                        System.out.println("  Tipo invalido.");
                        break;
                    }

                    System.out.print("  Nuevo Nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    if (!Validador.validarTexto(nuevoNombre)) {
                        break;
                    }

                    System.out.print("  Nueva Edad: ");
                    int nuevaEdad = Validador.validarEdad(scanner.nextLine());
                    if (nuevaEdad == -1) {
                        break;
                    }

                    System.out.print("  Nuevo Telefono: ");
                    String nuevoTelefono = scanner.nextLine();
                    if (!Validador.validarTelefono(nuevoTelefono)) {
                        break;
                    }

                    System.out.print("  Nuevo Correo: ");
                    String nuevoCorreo = scanner.nextLine();
                    if (!Validador.validarCorreo(nuevoCorreo)) {
                        break;
                    }

                    if (tipo == 1) {
                        System.out.print("  Nueva Especialidad: ");
                        String nuevaEspecialidad = scanner.nextLine();
                        if (!Validador.validarTexto(nuevaEspecialidad)) {
                            break;
                        }

                        System.out.print("  Pacientes: ");
                        int nuevosPacientes = Validador.validarEnteroPositivo(scanner.nextLine());
                        if (nuevosPacientes == -1) {
                            break;
                        }

                        System.out.print("  Valor consulta: ");
                        double nuevoValorConsulta = Validador.validarDoublePositivo(scanner.nextLine());
                        if (nuevoValorConsulta == -1) {
                            break;
                        }

                        servicio.reemplazarInformacion(cedulaReemplazar, new Medico(cedulaReemplazar, nuevoNombre, nuevaEdad, nuevoTelefono, nuevoCorreo, nuevaEspecialidad, nuevosPacientes, nuevoValorConsulta));
                    } else {
                        System.out.print("  Nuevo Departamento: ");
                        String nuevoDepartamento = scanner.nextLine();
                        if (!Validador.validarTexto(nuevoDepartamento)) {
                            break;
                        }

                        System.out.print("  Horas: ");
                        int nuevasHoras = Validador.validarEnteroPositivo(scanner.nextLine());
                        if (nuevasHoras == -1) {
                            break;
                        }

                        System.out.print("  Valor hora: ");
                        double nuevoValorHora = Validador.validarDoublePositivo(scanner.nextLine());
                        if (nuevoValorHora == -1) {
                            break;
                        }

                        servicio.reemplazarInformacion(cedulaReemplazar, new Administrativo(cedulaReemplazar, nuevoNombre, nuevaEdad, nuevoTelefono, nuevoCorreo, nuevoDepartamento, nuevasHoras, nuevoValorHora));
                    }
                    break;

                case 6:
                    System.out.print("  Ingrese la cedula PaRA eliminar: ");
                    servicio.eliminarRegistro(scanner.nextLine());
                    break;

                case 7:
                    servicio.calcularPagos();
                    break;

                case 8:
                    servicio.mostrarEstadisticas();
                    break;
            }
        }
    }
}
