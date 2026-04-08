public class Profesor {
    public String nombre;
    public String titulo;
    private int edad;
    private int aniosExperiencia;

    public Profesor(String nombre, String titulo, int edad, int aniosExperiencia){
        this.nombre = nombre;
        this.titulo = titulo;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void mostrarProfesor(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Título: " + titulo + ", Años de Experiencia: " + aniosExperiencia);
    }

    public int aniosJubilacion(){
        int edadJubilacion = 65;
        return edadJubilacion - edad;
    }

}
