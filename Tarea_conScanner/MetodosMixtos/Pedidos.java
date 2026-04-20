package MetodosMixtos;

import java.util.Scanner;

public class Pedidos {
    public String cliente, plato;
    public double precio, total;
    public int cantidad;

    public void IngresoDeDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\n ---- PEDIDO ---- \n");
        System.out.print(" Ingrese el nombre del Cliente: ");
        cliente = sc.nextLine();

        System.out.print(" Ingrese el Plato: ");
        plato = sc.nextLine();

        System.out.print(" Ingrese el precio: ");
        precio = sc.nextDouble();

        System.out.print(" Ingrese la cantidad: ");
        cantidad = sc.nextInt();
    }

    public double calcularSubtotal(){
        return precio*cantidad;
    }

    public double calcularDescuento(){
        if(calcularSubtotal()>25){
            return calcularSubtotal()*0.10;
        } else {
            return 0;
        }
    }


    public double calcularTotal(){
        return calcularSubtotal() - calcularDescuento();
    }

    public void mostrarCuenta(){
        System.out.println("\n ---- CUENTA DEL PEDIDO ----");
        System.out.print(" Cliente: " + cliente);
        System.out.print("\n Plato  : " + plato);
        System.out.print("\n Cantidad  : " + cantidad);
        System.out.print("\n Subtotal  : $" + calcularSubtotal());
        System.out.print("\n Descuento : $" + calcularDescuento());
        System.out.print("\n Total     : $" + calcularTotal());
    }



}
