public class Main {
    public static void main(String[] args) {
        try {
            Estudiante e1 = new Estudiante("Anderson", 18, 8.5);
            System.out.println(" - El Estudiante " + e1.nombre + " Fue registrado");

            Estudiante e2 = new Estudiante("Miguel", 40, 9);
            System.out.println(" - El Estudiante " + e2.nombre + " Fue registrado");

            Estudiante e3 = new Estudiante("Jason", -5, 8.5);
            System.out.println(" - El Estudiante " + e3.nombre + " Fue registrado");

        } catch (EdadInvalidaException e) {
            System.out.println(" La edad " + e.edadIngresada + " es invalida");
            System.out.println( e.getMessage());
        }
    }
}