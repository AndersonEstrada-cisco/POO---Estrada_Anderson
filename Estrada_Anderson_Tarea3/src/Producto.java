public class Producto {
    String nombre;
    double precio;
    int cantidad;

    // Constructor vacío
    public Producto(){
    }

    // Constructor con valores fijos
    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.25;
        this.cantidad = 2;
    }

    // Constructor con Parámetros
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void mostrarProducto(){
        System.out.println("Producto: " + nombre + "\n" + "Precio: $ " + precio + "\n" + "Cantidad: " + cantidad + "\n");
    }


}

