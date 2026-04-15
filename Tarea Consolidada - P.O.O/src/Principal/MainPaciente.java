package Programas;

public class MainPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Anderson Estrada", "0102030405", "Premium", 19, (double)25.5F, 3, 4);
        p1.mostrarReporte();
    }
}
