package MetodosReturn;

import java.util.Scanner;

public class Planilla {
    public String cliente;
    public double consumo;
    public double costoConsumo, iva = 0.15, total;

    public void ingresoDatosCliente(){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Nombre del Cliente: ");
        cliente = sc.nextLine();

        System.out.print(" Consumo en kWh   : ");
        consumo = sc.nextDouble();

        System.out.print(" Costo por KW     : ");
        costoConsumo = sc.nextDouble();

    }

    public double CalculoSubtotal(){
        return consumo*costoConsumo;
    }

    public double CalculoIva(){
        return CalculoSubtotal()*iva;
    }

    public double ClcularTotal(){
        return (consumo*costoConsumo)+CalculoIva();
    }


}
