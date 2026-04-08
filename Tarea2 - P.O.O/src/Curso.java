public class Curso {
    public String nombre;
    public String codigo;
    public int creditos;
    public int duracionHoras;

    public void mostrarCurso() {
        System.out.println("Nombre: " + nombre + ", Código: " + codigo + ", Créditos: " + creditos + ", Duración (horas): " + duracionHoras);
    }
}
