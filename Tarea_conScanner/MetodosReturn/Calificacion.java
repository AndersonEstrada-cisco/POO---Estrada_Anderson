package MetodosReturn;
import java.util.Scanner;

// Crear una clase Calificacion con nombre y tres notas. Calcular promedio y estado.

public class Calificacion {
    public String nombre;
    public double nota1, nota2, nota3;
    double promedio;

    public void IngresoDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ---- Datos Estudiante ---- ");
        System.out.print(" Estudiante: ");
        nombre = sc.nextLine();

        System.out.print(" Ingrese nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print(" Ingrese nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print(" Ingrese nota 3: ");
        nota3 = sc.nextDouble();

    }

    public double CalcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
        return promedio;
    }

    public String determinarEstado() {
        if (promedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

}
