public class Estudiante {
    public String nombre;
    public int edad;

    private String carrera;
    private int creditos;

    public Estudiante(String nombre, int edad, String carrera, int creditos) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.creditos = creditos;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Créditos: " + creditos);
    }
}
