public abstract class Animal {

    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }



    public abstract void comer();
    public abstract void hacerSonido();

}

