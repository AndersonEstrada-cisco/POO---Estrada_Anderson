public class Aguila extends Animal implements Volador{

    public Aguila(String nombre){
        setNombre();
    }

    @Override
    public void comer(){
        System.out.println(" Carroña ");
    }

    @Override
    public void hacerSonido(){
        System.out.println(" silva ");
    }

    @Override
    public void vuela(){
        System.out.println(" Puede volar");
    }

}
