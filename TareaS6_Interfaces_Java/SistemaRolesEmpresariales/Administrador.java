public class Administrador implements Autenticable, Gestionable, Reportable {

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if (usuario.equals("admin") && clave.equals("admin")) {
            System.out.println(" Login exitoso para Administrador.");
            return true;
        } else {
            System.out.println(" Credenciales incorrectas.");
            return false;
        }
    }

    @Override
    public void gestionarDatos() {
        System.out.println(" Datos gestionados por el administrador");
    }

    @Override
    public void generarReporte() {
        System.out.println(" Reporte generado por el administrador");
    }

}