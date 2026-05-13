public class Pinguino extends Animal implements Nadador{

    public Pinguino(String nombre){
        setNombre();
    }

    @Override
    public void comer(){
        System.out.println(" Peces ");
    }

    @Override
    public void hacerSonido(){
        System.out.println(" .. ");
    }

    @Override
    public void nada(){
        System.out.println(" El Pinguino nada");
    }
}

