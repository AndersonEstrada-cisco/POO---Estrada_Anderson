package MetodosVoid;
import java.util.Scanner;


public class PracticaDatosEstudiante {
    public String nombre;
    public String carrera;
    public int edad;


    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print(" ---- Registro de Estudiante ---- \n");
        System.out.print(" Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print(" Ingrese su carrera: ");
        carrera = sc.nextLine();

        System.out.print(" Ingrese su edad: ");
        edad = sc.nextInt();

    }

    public void mostrarDatos(){
        System.out.println("\n ---- Datos del Estudiante ----");
        System.out.print(" Nombre: " + nombre + "\n Carrera: " + carrera + "\n Edad: " + edad);
    }
}


