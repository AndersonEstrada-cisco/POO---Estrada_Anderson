public class EdadInvalidaException extends Exception{
    public int edadIngresada;

    public EdadInvalidaException(int edad, String mensajeDescriptivo) {
        super(mensajeDescriptivo);
        this.edadIngresada = edad;
    }
}
