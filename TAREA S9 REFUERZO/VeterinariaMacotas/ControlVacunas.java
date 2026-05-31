import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class ControlVacunas implements CrudVacuna {
    private HashSet<Mascota> setMascotas;
    private HashMap<String, String> mapaVacunas;

    public ControlVacunas() {
        this.setMascotas = new HashSet<>();
        this.mapaVacunas = new HashMap<>();
    }

    public Mascota buscarPorCodigo(String codigo) {
        for (Mascota m : setMascotas) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public void mostrarMascotas() {
        if (setMascotas.isEmpty()) {
            System.out.println(" No hay datos disponibles.");
            return;
        }
        for (Mascota m : setMascotas) {
            System.out.println(m);
        }
    }

    @Override
    public void registrarMascota(Mascota m) {
        boolean agregado = setMascotas.add(m);
        if (!agregado) {
            System.out.println(" Error: Ya existe una mascota con ese código.");
        } else {
            System.out.println(" Mascota registrada: " + m.getNombre());
        }
    }

    @Override
    public void registrarVacuna(String codigo, String vacuna) {
        if (buscarPorCodigo(codigo) == null) {
            System.out.println(" Error: No se puede vacunar una mascota inexistente.");
            return;
        }
        mapaVacunas.put(codigo, vacuna);
        System.out.println(" Vacuna registrada.");
    }

    @Override
    public void actualizarVacuna(String codigo, String nuevaVacuna) {
        if (!mapaVacunas.containsKey(codigo)) {
            System.out.println(" Error: No se puede actualizar una vacuna inexistente.");
            return;
        }
        mapaVacunas.put(codigo, nuevaVacuna);
        System.out.println(" Vacuna actualizada.");
    }

    @Override
    public void eliminarVacuna(String codigo) {
        if (!mapaVacunas.containsKey(codigo)) {
            System.out.println(" Error: No se puede eliminar una vacuna inexistente.");
            return;
        }
        mapaVacunas.remove(codigo);
        System.out.println(" Vacuna eliminada.");
    }

    @Override
    public void mostrarVacunas() {
        if (mapaVacunas.isEmpty()) {
            System.out.println(" No hay datos disponibles.");
            return;
        }
        for (Map.Entry<String, String> e : mapaVacunas.entrySet()) {
            System.out.println("Mascota: " + e.getKey() + " | Vacuna aplicada: " + e.getValue());
        }
    }
}
