package Programas;

public class Paciente {
    public String nombre;
    public String id;
    public String tipoSeguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridad;

    public Paciente(String nombre, String id, String tipoSeguro, int edad, double costoConsulta, int numeroConsultas, int prioridad) {
        this.nombre = nombre;
        this.id = id;
        this.tipoSeguro = tipoSeguro;
        this.setEdad(edad);
        this.setCostoConsulta(costoConsulta);
        this.setNumeroConsultas(numeroConsultas);
        this.setPrioridad(prioridad);
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }

    }

    public double getCostoConsulta() {
        return this.costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        if (costoConsulta > (double)0.0F) {
            this.costoConsulta = costoConsulta;
        }

    }

    public int getNumeroConsultas() {
        return this.numeroConsultas;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        }

    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad <= 5) {
            this.prioridad = prioridad;
        }

    }

    public double calcularCostoTotal() {
        return this.costoConsulta * (double)this.numeroConsultas;
    }

    public double calcularDescuento() {
        double total = this.calcularCostoTotal();
        switch (this.tipoSeguro) {
            case "Basico" -> {
                return total * 0.1;
            }
            case "Premium" -> {
                return total * 0.2;
            }
            case "SinSeguro" -> {
                return (double)0.0F;
            }
            default -> {
                return (double)0.0F;
            }
        }
    }

    public double calcularCostoFinal() {
        return this.calcularCostoTotal() - this.calcularDescuento();
    }

    public String clasificarPrioridad() {
        if (this.prioridad >= 4) {
            return "Alta prioridad";
        } else {
            return this.prioridad >= 2 ? "Prioridad media" : "Prioridad baja";
        }
    }

    public String mensajeMedico() {
        String nivel = this.clasificarPrioridad();
        if (nivel.equals("Alta prioridad")) {
            return "Atención inmediata requerida";
        } else {
            return nivel.equals("Prioridad media") ? "Seguimiento necesario" : "Control regular";
        }
    }

    public void mostrarReporte() {
        System.out.println("------- REPORTE DEL PACIENTE ------");
        System.out.println(" Nombre: " + this.nombre);
        System.out.println(" ID: " + this.id);
        System.out.println(" Seguro: " + this.tipoSeguro);
        System.out.println(" Edad: " + this.edad);
        System.out.println(" Consultas: " + this.numeroConsultas);
        System.out.println(" Costo total: $" + this.calcularCostoTotal());
        System.out.println(" Descuento: $" + this.calcularDescuento());
        System.out.println(" Costo final: $" + this.calcularCostoFinal());
        System.out.println(" Clasificación: " + this.clasificarPrioridad());
        System.out.println(" Mensaje: " + this.mensajeMedico());
    }
}
