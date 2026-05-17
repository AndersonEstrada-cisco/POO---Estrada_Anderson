public class Estudiante {
    public String nombre;
    public int edad;
    public double promedio;

    public Estudiante(String nombre, int edad, double promedio) throws EdadInvalidaException{

        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException(edad, " No se pudo registrar \n ** ERROR en la edad");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;

    }
}
