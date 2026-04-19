package MetodosVoid;
import java.util.Scanner;

public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;
    public double total;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ---- Registro de Producto ---- ");
        System.out.print(" Ingrese el Producto: ");
        nombre = sc.nextLine();

        System.out.print(" Ingrese el Precio: $ ");
        precio = sc.nextDouble();

        System.out.print(" Ingrese la Cantidad: ");
        cantidad = sc.nextInt();
    }

    public void mostrarFactura(){
        System.out.println("\n ---- FACTURA ---- ");
        System.out.println(" Producto: " + nombre);
        System.out.println(" Precio:   $" + precio);
        System.out.println(" Cantidad: " + cantidad);

        double Subtotal = precio*cantidad;

        if (Subtotal>1000){
            total = Subtotal - (Subtotal*0.10);
        } else {
            total = Subtotal;
        }

        System.out.println(" Total:    $" + total);

    }
}
