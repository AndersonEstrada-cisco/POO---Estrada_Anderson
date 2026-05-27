package Servicio;

import java.util.ArrayList;
import modelo.Empleado;
import modelo.Medico;
import modelo.Administrativo;

public class EmpleadoServicio {
    
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public boolean buscarCedulaRepetida(String cedula) {
        for (Empleado e : listaEmpleados) {
            if (e.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    
    public void registrarMedico(Medico medico) {
        if (buscarCedulaRepetida(medico.getCedula())) {
            System.out.println(" ** La cedula ya está registrada");
            return;
        }
        listaEmpleados.add(medico);
        System.out.println(" Medico registrado con exito");
    }

    
    public void registrarAdministrativo(Administrativo admin) {
        if (buscarCedulaRepetida(admin.getCedula())) {
            System.out.println(" ** La cedula ya esta registrada");
            return;
        }
        listaEmpleados.add(admin);
        System.out.println(" Administrativo registrado con exito");
    }
    

    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println(" No hay empleados registrados");
            return;
        }
        for (Empleado e : listaEmpleados) {
            e.mostrarInformacion();
            System.out.println("--------------------");
        }
    }
    

    public void buscarPorCedula(String cedula) {
        for (Empleado e : listaEmpleados) {
            if (e.getCedula().equals(cedula)) {
                e.mostrarInformacion();
                return;
            }
        }
        System.out.println("Registro NO encontrado");
    }
    

    public void reemplazarInformacion(String cedula, Empleado nuevoEmpleado) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(cedula)) {
                listaEmpleados.set(i, nuevoEmpleado);
                System.out.println(" Informacion reemplazada con exito");
                return;
            }
        }
        System.out.println(" Registro no encontrado");
    }

    
    public void eliminarRegistro(String cedula) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(cedula)) {
                listaEmpleados.remove(i);
                System.out.println(" Registro eliminad con exito");
                return;
            }
        }
        System.out.println(" Registro no encontrado");
    }
    

    public void calcularPagos() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay emplados para calcular pagos");
            return;
        }
        for (Empleado e : listaEmpleados) {
            System.out.println(" Empleado: " + e.getNombre() + " | Pago: " + e.calcularPago());
        }
    }

    
    public void mostrarEstadisticas() {
        int totalMedicos = 0;
        int totalAdmins = 0;
        double pagoMedicos = 0;
        double pagoAdmins = 0;
        Empleado mayorIngreso = null;

        for (Empleado e : listaEmpleados) {
            if (e instanceof Medico) {
                totalMedicos++;
                pagoMedicos += e.calcularPago();
                
            } else if (e instanceof Administrativo) {
                totalAdmins++;
                pagoAdmins += e.calcularPago();
            }

            if (mayorIngreso == null || e.calcularPago() > mayorIngreso.calcularPago()) {
                mayorIngreso = e;
            }
        }

        System.out.println("\n========= ESTADISTICAS =========");
        System.out.println(" Total medicos: " + totalMedicos);
        System.out.println(" Total administrativos: " + totalAdmins);
        System.out.println(" Total empleados: " + listaEmpleados.size());
        System.out.println(" Pago total medicos: " + pagoMedicos);
        System.out.println(" Pago total administrativos: " + pagoAdmins);
        if (mayorIngreso != null) {
            System.out.println(" Empleado con mayor ingreso: " + mayorIngreso.getNombre() + " (" + mayorIngreso.calcularPago() + ")");
        } else {
            System.out.println(" Empleado con mayor ingreso: NINGUNO");
        }
        
        
    }
}
