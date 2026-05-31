import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Cafeteria implements CrudPedido {
    private String nombreCafeteria;
    private HashSet<Cliente> clientes;
    private Map<String, Double> mapaPedidos;

    public Cafeteria() {
        this.nombreCafeteria = "Smart Coffee";
        this.clientes = new HashSet<>();
        this.mapaPedidos = new HashMap<>();
    }

    public void agregarCliente(Cliente c) {
        boolean agregado = clientes.add(c);
        if (!agregado) {
            System.out.println("Error: Ya existe un cliente con ese código de cliente.");
        } else {
            System.out.println("Cliente registrado exitosamente.");
        }
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay datos disponibles.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public Cliente buscarClientePorCorreo(String correo) {
        for (Cliente c : clientes) {
            if (c.getCorreo().equals(correo)) {
                return c;
            }
        }
        return null;
    }

    public void mostrarPedidos() {
        if (mapaPedidos.isEmpty()) {
            System.out.println("No hay datos disponibles.");
            return;
        }
        for (Map.Entry<String, Double> e : mapaPedidos.entrySet()) {
            System.out.println("Correo: " + e.getKey() + " -> Consumo: $" + e.getValue());
        }
    }

    @Override
    public void registrarPedido(String correo, double consumo) {
        if (buscarClientePorCorreo(correo) == null) {
            System.out.println("Error: No se permiten pedidos de clientes inexistentes.");
            return;
        }
        if (consumo <= 0) {
            System.out.println("Error: No se permiten consumos negativos o iguales a cero.");
            return;
        }
        mapaPedidos.put(correo, consumo);
        System.out.println("Pedido registrado correctamente.");
    }

    @Override
    public void actualizarPedido(String correo, double nuevoConsumo) {
        if (!mapaPedidos.containsKey(correo)) {
            System.out.println("Error: No se permiten actualizar pedidos inexistentes.");
            return;
        }
        if (nuevoConsumo <= 0) {
            System.out.println("Error: El consumo debe ser mayor a cero.");
            return;
        }
        mapaPedidos.put(correo, nuevoConsumo);
        System.out.println("Pedido actualizado correctamente.");
    }

    @Override
    public void eliminarPedido(String correo) {
        if (!mapaPedidos.containsKey(correo)) {
            System.out.println("Error: No se permiten eliminar pedidos inexistentes.");
            return;
        }
        mapaPedidos.remove(correo);
        System.out.println("Pedido eliminado correctamente.");
    }

    @Override
    public double promedioConsumo() {
        if (mapaPedidos.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (double consumo : mapaPedidos.values()) {
            suma += consumo;
        }
        return suma / mapaPedidos.size();
    }

    @Override
    public String mejorCliente() {
        if (mapaPedidos.isEmpty()) {
            return "No hay datos disponibles.";
        }
        String correoMax = null;
        double maxConsumo = -1.0;

        for (Map.Entry<String, Double> e : mapaPedidos.entrySet()) {
            if (e.getValue() > maxConsumo) {
                maxConsumo = e.getValue();
                correoMax = e.getKey();
            }
        }
        Cliente c = buscarClientePorCorreo(correoMax);
        if (c != null) {
            return c.getNombre() + " (" + correoMax + ") con un consumo de $" + maxConsumo;
        }
        return correoMax + " con un consumo de $" + maxConsumo;
    }
}