public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void mostrarInformacion(){
        System.out.println("Titular: " + nombreTitular + "\n" + "Saldo: $" + saldo + "\n");
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
    }

    public void retirar(double monto){
        if(saldo>=monto){
            saldo = saldo - monto;
            System.out.println("Retiro Exitoso");
        }else{
            System.out.println("No hay fondos suficientes para un retiro");
        }
    }
}
