public class ParteD {

    public void ejecutar() {

        System.out.println(" PARTE D");
        System.out.println(" ---------- CASTING DE OBJETOS ----------");

        Perro miPerro = new Perro();

        Animal miAnimal = miPerro;
        miAnimal.hacerSonido();

        if (miAnimal instanceof Perro) {
            Perro perroCasteado = (Perro) miAnimal;
            perroCasteado.ladrar();

        } else {
            System.out.println("** No se puede hacer el casting.");
        }
        System.out.println(" ------------------------------------------");


    }
}