public class ParteB {
    public void ejecutar(){
        double valorDouble = 45.89;
        float valorFloat = (float)valorDouble;
        int valorInt = (int)valorFloat;
        short valorShort = (short) valorInt;
        byte valorByte = (byte)valorShort;


        System.out.println(" PARTE B");
        System.out.println(" ---------- CONVERSION EXPLICITA ----------");
        System.out.println(" Double: " + valorDouble);
        System.out.println(" Float: " + valorFloat);
        System.out.println(" Int: " + valorInt);
        System.out.println(" Short: " + valorShort);
        System.out.println(" Byte: " + valorByte);
        System.out.println(" ------------------------------------------");
    }
}
