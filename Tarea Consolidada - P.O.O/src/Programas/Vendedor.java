package Programas;

public class Vendedor {
    public String nombre;
    public String area;
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimientoMeta;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimientoMeta) {
        this.nombre = nombre;
        this.area = area;
        this.setMontoVendido(montoVendido);
        this.setPorcentajeComision(porcentajeComision);
        this.setCumplimientoMeta(cumplimientoMeta);
    }

    public double getMontoVendido() {
        return this.montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        if (montoVendido >= (double)0.0F) {
            this.montoVendido = montoVendido;
        }

    }

    public double getPorcentajeComision() {
        return this.porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        if (porcentajeComision >= (double)0.0F) {
            this.porcentajeComision = porcentajeComision;
        }

    }

    public double getCumplimientoMeta() {
        return this.cumplimientoMeta;
    }

    public void setCumplimientoMeta(double cumplimientoMeta) {
        if (cumplimientoMeta >= (double)0.0F && cumplimientoMeta <= (double)100.0F) {
            this.cumplimientoMeta = cumplimientoMeta;
        }

    }

    public double calcularComision() {
        return this.montoVendido * (this.porcentajeComision / (double)100.0F);
    }

    public double calcularIngresoTotal() {
        return this.montoVendido + this.calcularComision();
    }

    public String obtenerEstadoCumplimiento() {
        if (this.cumplimientoMeta >= (double)90.0F) {
            return "Excelente";
        } else {
            return this.cumplimientoMeta >= (double)70.0F ? "Aceptable" : "Bajo";
        }
    }

    public String obtenerMensajeDesempeno() {
        switch (this.obtenerEstadoCumplimiento()) {
            case "Excelente" -> {
                return "Vendedor con desempeño sobresaliente";
            }
            case "Aceptable" -> {
                return "Vendedor con desempeño aceptable";
            }
            case "Bajo" -> {
                return "Se requiere seguimiento comercial";
            }
            default -> {
                return "Se requiere seguimiento comercial";
            }
        }
    }

    public void mostrarReporte() {
        System.out.println("----- REPORTE DE VENTA -----");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Área: " + this.area);
        System.out.println("Monto vendido: $" + this.montoVendido);
        System.out.println("Comisión: $" + this.calcularComision());
        System.out.println("Ingreso total: $" + this.calcularIngresoTotal());
        System.out.println("Cumplimiento: " + this.cumplimientoMeta + "%");
        System.out.println("Estado: " + this.obtenerEstadoCumplimiento());
        System.out.println("Mensaje: " + this.obtenerMensajeDesempeno());
    }
}
