package Programas;

import MetodosVoid.Producto;

import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args){

        Producto p1 = new Producto();
        p1.ingresarDatos();
        p1.mostrarFactura();
    }
}
