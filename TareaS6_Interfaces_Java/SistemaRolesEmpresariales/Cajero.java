public class Cajero implements Autenticable, Gestionable {

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if (usuario.equals("cajero") && clave.equals("cajero")) {
            System.out.println(" Login exitoso para Cajero.");
            return true;
        } else {
            System.out.println(" Credenciales incorrectas.");
            return false;
        }
    }

    @Override
    public void gestionarDatos(){
        System.out.println(" Datos gestionados por el cajero");
    }
}
