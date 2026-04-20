package Programas;

import MetodosMixtos.Pedidos;

public class MainPedido {
    public static void main(String[] args){

        Pedidos pedido1 = new Pedidos();
        pedido1.IngresoDeDatos();
        pedido1.calcularSubtotal();
        pedido1.calcularDescuento();
        pedido1.calcularTotal();

        pedido1.mostrarCuenta();
    }
}
