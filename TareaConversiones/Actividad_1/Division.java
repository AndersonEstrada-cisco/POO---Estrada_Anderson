import java.util.Scanner;

public class Division {

    Scanner sc = new Scanner(System.in);
    public void dividir() {
        try {
            System.out.print(" Ingrese un numero: ");
            String entrada = sc.nextLine();

            // Transformo a numero
            int numero = Integer.parseInt(entrada);
            int resultado = 100 / numero;

            System.out.println(" El resultado es: " + resultado);


        } catch (NumberFormatException e) {
            System.out.println(" ** Debe ingresar un numero válido");
        } catch (ArithmeticException e) {
            System.out.println(" ** No se puede dividir entre cero.");
        } finally {
            System.out.println(" Programa finalizado correctamente ");
            sc.close();
        }
    }
}

