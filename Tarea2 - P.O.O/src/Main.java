public class Main {
    public static void main(String[] args){
       Estudiante e1 = new Estudiante("Anderson", 19, "Desarrollo de Software", 13);
       e1.mostrarEstudiante();

       Profesor p1 = new Profesor("Juan Carlos", "Ingeniero en Software", 35, 5);
       System.out.println("Años restantes para jubilarse: " + p1.aniosJubilacion());
       p1.mostrarProfesor();

       Curso c1 = new Curso();
       c1.nombre = "Sistemas Operativos";
       c1.codigo = "TDSD253";
       c1.creditos = 3;
       c1.duracionHoras = 144;
       c1.mostrarCurso();


    }

}