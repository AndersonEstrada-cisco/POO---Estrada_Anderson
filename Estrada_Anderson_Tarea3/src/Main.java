import java.beans.PropertyDescriptor;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombreCompleto = "Anderson";
        estudiante1.edad = 18;

        estudiante1.mostrarDatos();


       Libro libro1 = new Libro("Noches Blancas", "Fiódor Dostoyevski", 1848);
       Libro libro2 = new Libro("La metamorfosis", "Franz Kafka", 1915);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        Producto p1 = new Producto();
        p1.nombre = "Cuaderno";
        p1.precio = 2.5;
        p1.cantidad = 3;

        Producto p2 = new Producto("Helado");
        Producto p3 = new Producto("Jabón", 15,5);

        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();




        // CUENTA BANCARIA
        CuentaBancaria cuenta1 = new CuentaBancaria("Anderson", 1500);
        cuenta1.mostrarInformacion();

        cuenta1.depositar(35);
        cuenta1.mostrarInformacion();

        cuenta1.retirar(500);
        cuenta1.mostrarInformacion();





        // PROPUESTO 1
        Usuario user1 = new Usuario();
        user1.setUsername("Anderson2007");
        user1.setPassword("123456a");

        System.out.println("Usuario: " + user1.getUsername());


        // PROPUESTO 2
        Articulo articulo1 = new Articulo();
        articulo1.setNombre("Jabón");
        articulo1.setPrecio(2.15);

        System.out.println("Artículo: " + articulo1.getNombre());
        System.out.println("Precio: $" + articulo1.getPrecio());

    }
}