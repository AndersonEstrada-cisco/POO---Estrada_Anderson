public class Cliente {
    private String nombre;
    private String cedula;
    private int edad;
    private String telefono;


    public Cliente() {}

    public Cliente(String nombre, String cedula, int edad, String telefono) {
        this.nombre = nombre;
        setCedula(cedula);
        setEdad(edad);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula == null || !cedula.matches("\\d{10}")) {
            throw new IllegalArgumentException(" CDebe tener 10 dígitos");
        }
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 15 || edad > 60) {
            throw new IllegalArgumentException(" Edad debe estar entre 15 y 60");
        }
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (!telefono.matches("\\d+")) {
            throw new IllegalArgumentException(" Teléfono solo puede contener números");
        }
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente otro = (Cliente) obj;
        return this.cedula.equals(otro.cedula);
    }

    @Override
    public int hashCode() {
        return cedula.hashCode();
    }

    @Override
    public String toString() {
        return "Cliente{cedula='" + cedula + "', nombre='" + nombre + "', edad=" + edad + ", telefono='" + telefono + "'}";
    }
}