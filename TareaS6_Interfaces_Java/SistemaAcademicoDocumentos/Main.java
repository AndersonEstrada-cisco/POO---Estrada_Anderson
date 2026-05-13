public class Main {
    public static void main(String[] args) {
        Imprimible cert = new Certificado("CERTIFICADO 240 HORAS");
        Imprimible acta = new ActaNotas("Desarrollo de Software");
        Imprimible horario = new HorarioAcademico("2024B");

        cert.imprimir();
        acta.imprimir();
        horario.imprimir();
    }
}