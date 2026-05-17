public class ParteC {
    public void ejecutar(){
        String strInt = "2024";
        String strDoub = "98.6";
        String strbool = "false";

        System.out.println(" PARTE C");
        System.out.println(" ---------- CONVERSION CON STRINGS ----------");


        int numeroParseado = Integer.parseInt(strInt);
        System.out.println(" String transformado a numero entero: " + numeroParseado + " Y sumado 2: "+ (numeroParseado+2));

        double decimalParseado = Double.parseDouble(strDoub);
        System.out.println(" String transformado a double: " + decimalParseado + " Y sumado 1.4: " + (decimalParseado + 1.4));

        boolean boolParseado = Boolean.parseBoolean(strbool);
        System.out.println(" String transformado a boolean: " + boolParseado + " Y Contrario " + !boolParseado);


        System.out.println(" DEVUELTA A STRING");

        String IntStr = String.valueOf(numeroParseado);
        String DoubStr   = String.valueOf(decimalParseado);
        String BoolStr = String.valueOf(boolParseado);

        System.out.println(" Entero convertido a String: " + IntStr + IntStr);
        System.out.println(" Double convertido a String: " + DoubStr + DoubStr);
        System.out.println(" Boolean convertido a String: " + BoolStr + BoolStr);

        System.out.println(" ------------------------------------------");
    }
}
