public class ActaNotas implements Imprimible {
    private String carrera;

    public ActaNotas(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void imprimir() {
        System.out.println(" --- Generando Acta de Notas Finales");
        System.out.println(" Carrera: " + carrera);
    }
}