public class Supervisor implements Autenticable, Reportable {

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return "supervisor".equals(usuario) && "supervisor".equals(clave);
    }

    @Override
    public void generarReporte() {
        System.out.println(" Reporte Generado por el supervisor");
    }
}