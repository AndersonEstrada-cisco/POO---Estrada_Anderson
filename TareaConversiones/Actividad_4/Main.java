import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" ------- CONVERSIONES   -------");
        System.out.println(" Soporta(USD/EUR)");
        System.out.print(" Ingrese la cantidad: ");
        String cantidad = sc.nextLine();
        System.out.print(" De: ");
        String monedaOrigen = sc.nextLine();
        System.out.print("  A: ");
        String monedaDestino = sc.nextLine();

        try{
            double cantidadDouble = Double.parseDouble(cantidad);
            Conversion cambioMoneda = new Conversion(monedaOrigen, monedaDestino, cantidadDouble);

            //Resultado
            double resultadoFinal = cambioMoneda.calculo();
            System.out.println("\n--- RESULTADO ---");
            System.out.println(cantidadDouble + " " + monedaOrigen.toUpperCase() +
                    " equivalen a " + String.format("%.2f", resultadoFinal) + " " + monedaDestino.toUpperCase());

        } catch (NumberFormatException e){
            System.out.println(" ** DEBE INGRESAR NUMEROS");
        } catch (MonedaNoSoportadaException e){
            System.out.println(" Error:" + e.getMessage());
        } finally {
            System.out.println(" Programa Finalizado");
            sc.close();
        }
        
    }
}