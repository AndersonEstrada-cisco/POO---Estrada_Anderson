package util;

public class Validador {

    public static boolean validarTexto(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            System.out.println(" ** No puede estar vacio.");
            return false;
        }
        return true;
    }

    public static boolean validarCorreo(String correo) {
        if (!validarTexto(correo) || !correo.contains("@")) {
            System.out.println(" ** El correo debe contener una @");
            return false;
        }
        return true;
    }

    public static boolean validarTelefono(String telefono) {
        if (!validarTexto(telefono)) {
            return false;
        }
        try {
            Long.parseLong(telefono);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(" ** El telefono solo debe contener numeros.");
            return false;
        }
    }

    public static int validarEdad(String edadStr) {
        try {
            int edad = Integer.parseInt(edadStr);
            if (edad <= 0 || edad >= 150) {
                System.out.println(" ** Edad Inválida");
                return -1;
            }
            return edad;
        } catch (NumberFormatException e) {
            System.out.println(" ** La edad debe ser un numero");
            return -1;
        }
    }


    public static int validarEnteroPositivo(String numeroStr) {
        try {
            int numero = Integer.parseInt(numeroStr);
            if (numero <= 0) {
                System.out.println(" ** El valor debe ser mayor a cero.");
                return -1;
            }
            return numero;
        } catch (NumberFormatException e) {
            System.out.println(" ** Debe ingresar un numero entero Vlido.");
            return -1;
        }
    }


    public static double validarDoublePositivo(String numeroStr) {
        try {
            double numero = Double.parseDouble(numeroStr);
            if (numero <= 0) {
                System.out.println(" ** El valor debe ser mayor a cero.");
                return -1;
            }
            return numero;
        } catch (NumberFormatException e) {
            System.out.println(" ** Debe ingresar un numero decimal valdo.");
            return -1;
        }
    }
}
