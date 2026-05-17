public class ParteA {
    public void ejecutar() {
        byte valorByte = 15;
        short valorShort = valorByte;
        int valorInt = valorShort;
        long valorLong = valorInt;
        float valorFloat = valorLong;
        double valorDuble = valorFloat;

        System.out.println(" PARTE A");
        System.out.println(" ---------- CONVERSION IMPLICITA ----------");
        System.out.println(" Valor en byte: " + valorByte);
        System.out.println(" Valor Double: " + valorDuble);
        System.out.println(" ------------------------------------------");
    }

}
