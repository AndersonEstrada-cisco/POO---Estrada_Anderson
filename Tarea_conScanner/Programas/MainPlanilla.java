package Programas;

import MetodosReturn.Planilla;

public class MainPlanilla {
    public static void main(String[] args){

        Planilla planilla1 = new Planilla();
        planilla1.ingresoDatosCliente();

        Double subtotal = planilla1.CalculoSubtotal();
        double iva = planilla1.CalculoIva();
        double total = planilla1.ClcularTotal();

        System.out.print("\n ---- PLANILLA DE LUZ ----");
        System.out.print("\n Cliente : " + planilla1.cliente);
        System.out.print("\n Subtotal: " + subtotal);
        System.out.print("\n IVA     : " + iva);
        System.out.print("\n Total   : " + total);


    }
}
