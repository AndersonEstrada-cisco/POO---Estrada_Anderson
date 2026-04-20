package Programas;

import MetodosReturn.Calificacion;

public class MainCalificacion {
    public static void main(String[] args){

        Calificacion estudiante1 = new Calificacion();

        estudiante1.IngresoDatos();
        double promedio = estudiante1.CalcularPromedio();
        String estado = estudiante1.determinarEstado();

        System.out.println(" ---- REPORTE ACADÉMICO ----");
        System.out.println(" Estudiante: " + estudiante1.nombre);
        System.out.println(" Pormedio: " + promedio);
        System.out.println(" EstadO: " + estado);
    }
}
