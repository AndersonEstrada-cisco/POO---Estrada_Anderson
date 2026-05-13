public class Certificado implements Imprimible {

    private String numeroCertificado;

    public Certificado(String numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }

    @Override
    public void imprimir() {
        System.out.println(" ---- Imprimiendo Certificado Oficial");
        System.out.println("  Numero de registro: " + numeroCertificado);
    }
}