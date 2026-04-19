package Programas;

import MetodosMixtos.Empleado;

public class MainEmpleado {
    public void main(String[] args){
        Empleado empleado1 = new Empleado();
        empleado1.IngresoDeDatos();
        empleado1.calcularSuelodo();
        empleado1.calcularBono();
        empleado1.calcularSueldoFinal();

        empleado1.mostrarReporte();


    }
}
