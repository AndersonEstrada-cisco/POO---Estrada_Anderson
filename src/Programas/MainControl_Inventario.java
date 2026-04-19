package Programas;

import Practica.Control_Inventario;

public class MainControl_Inventario {
    public static void main(String[] args) {
        Control_Inventario p1 = new Control_Inventario(
                "PRD-105",
                "Disco SSD 1TB",
                "Almacenamiento",
                89.50,
                12,
                8
        );
        p1.setPrecio(95);
        p1.setStock(5);
        p1.mostrarReporte();

    }
}
