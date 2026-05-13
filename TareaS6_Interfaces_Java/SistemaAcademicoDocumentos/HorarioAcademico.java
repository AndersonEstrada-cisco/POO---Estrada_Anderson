public class HorarioAcademico implements Imprimible {

    private String periodoLectivo;

    public HorarioAcademico(String periodoLectivo) {
        this.periodoLectivo = periodoLectivo;
    }

    @Override
    public void imprimir() {
        System.out.println(" --- Listando Horario de Clases ");
        System.out.println(" Periodo: " + periodoLectivo);
    }
}