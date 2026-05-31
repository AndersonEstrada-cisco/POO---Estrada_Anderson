public class Mascota {
    private String codigo;
    private String nombre;
    private String tipo;
    private int edad;

    public Mascota() {
    }

    public Mascota(String codigo, String nombre, String tipo, int edad) {
        setCodigo(codigo);
        this.nombre = nombre;
        setTipo(tipo);
        setEdad(edad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException(" Error: El código no puede estar vacío.");
        }
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        if (tipo == null || (!tipo.equals("Perro") && !tipo.equals("Gato") && !tipo.equals("Conejo") && !tipo.equals("Otro"))) {
            throw new IllegalArgumentException("Error: El tipo debe ser Perro, Gato, Conejo u Otro.");
        }
        this.tipo = tipo;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        if (edad < 0 || edad > 20) {
            throw new IllegalArgumentException("Error: La edad debe estar entre 0 y 20.");
        }
        this.edad = edad;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Mascota)) return false;
        Mascota otra = (Mascota) obj;
        return this.codigo != null && this.codigo.equals(otra.codigo);
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Mascota{codigo='" + codigo + "', nombre='" + nombre + "', tipo='" + tipo + "', edad=" + edad + "}";
    }
}