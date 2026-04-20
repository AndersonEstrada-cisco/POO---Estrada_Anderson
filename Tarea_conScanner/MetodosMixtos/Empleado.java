package MetodosMixtos;
import java.util.Scanner;

public class Empleado {
    public String nombre;
    public int horasTrabajadas;
    public double pagoPorHora, bono=0.10;

    public void IngresoDeDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\n ---- DATOS EMPLEADOS ---- \n");
        System.out.print(" Ingrese el nombre del Empleado: ");
        nombre = sc.nextLine();

        System.out.print(" Ingrese las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        System.out.print(" Ingrese el pago por Hora: ");
        pagoPorHora = sc.nextDouble();
    }

    public double calcularSuelodo(){
        return horasTrabajadas*pagoPorHora;
    }

    public double calcularBono(){
        return calcularSuelodo()*bono;
    }

    public double calcularSueldoFinal(){
        return calcularSuelodo()+calcularBono();
    }

    public void mostrarReporte(){
        System.out.println("\n ---- Reporte de Empleado ----");
        System.out.print(" Empleado: " + nombre);
        System.out.print("\n Sueldo  : $" + calcularSuelodo());
        System.out.print("\n Bono    : $" + calcularBono());
        System.out.print("\n Sueldo Final    : $" + calcularSueldoFinal());
    }
}
