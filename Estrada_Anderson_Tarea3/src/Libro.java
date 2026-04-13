public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("El libro se llama " + titulo + ", autor: " + autor + ", año: " + anioPublicacion);
    }
}