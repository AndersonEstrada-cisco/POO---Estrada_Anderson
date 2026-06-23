package org.example.sistemaaprendizajejava;

public class Trabajador {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String estadoCivil;
    private String jornada;
    private String cargo;

    public Trabajador() {
    }

    public Trabajador(String cedula, String nombre, String apellido, int edad, String correo,
                      String estadoCivil, String jornada, String cargo) {
        setCedula(cedula);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCorreo(correo);
        setEstadoCivil(estadoCivil);
        setJornada(jornada);
        setCargo(cargo);
    }

    public void setCedula(String cedula) { this.cedula = cedula; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setEstadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }
    public void setJornada(String jornada) { this.jornada = jornada; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public String getCorreo() { return correo; }
    public String getEstadoCivil() { return estadoCivil; }
    public String getJornada() { return jornada; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return "Trabajador{cedula='" + cedula + "', nombre='" + nombre + "', apellido='" + apellido +
                "', edad=" + edad + ", correo='" + correo + "', estadoCivil='" + estadoCivil +
                "', jornada='" + jornada + "', cargo='" + cargo + "'}";
    }
}
