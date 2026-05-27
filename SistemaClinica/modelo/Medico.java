package modelo;

public class Medico extends Empleado {
    
    private String specialty;
    private int numeroPacientesAtendidos;
    private double valorConsulta;

    public Medico(String cedula, String nombre, int edad, String telefono, String correo, String specialty, int numeroPacientesAtendidos, double valorConsulta) {
        super(cedula, nombre, edad, telefono, correo);
        this.specialty = specialty;
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
        this.valorConsulta = valorConsulta;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getNumeroPacientesAtendidos() {
        return numeroPacientesAtendidos;
    }

    public void setNumeroPacientesAtendidos(int numeroPacientesAtendidos) {
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
    }

    
    public double getValorConsulta() {
        return valorConsulta;
    }

    
    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + specialty);
        System.out.println("Pacientes Atendidos: " + numeroPacientesAtendidos);
        System.out.println("Valor Consulta: " + valorConsulta);
        System.out.println("Pago Total: " + calcularPago());
    }

    
    @Override
    public double calcularPago() {
        return numeroPacientesAtendidos * valorConsulta;
    }
}
