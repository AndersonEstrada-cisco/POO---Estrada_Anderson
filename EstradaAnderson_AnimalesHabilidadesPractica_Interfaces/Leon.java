public class Leon extends Animal{

    public Leon(String nombre){
        setNombre();
    }

    @Override
    public void comer(){
        System.out.println(" Carne ");
    }

    @Override
    public void hacerSonido(){
        System.out.println(" Ruje ");
    }

}
