public class Conversion {
    public String monedaOrigen;
    public String monedaDestino;
    public double cantidad;


    public Conversion(String monedaOrigen, String monedaDestino, double cantidad) throws MonedaNoSoportadaException {

        String origen = monedaOrigen.toUpperCase();
        String destino = monedaDestino.toUpperCase();

        if ((!origen.equals("USD")) && (!origen.equals("EUR")) ||
                (!destino.equals("USD") && (!destino.equals("EUR")))) {
            throw new MonedaNoSoportadaException(" ** TIPO DE MONEDA NO SOPORTADA");
        }

        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.cantidad = cantidad;
    }

    public double calculo() {
        String origen = monedaOrigen.toUpperCase();
        String destino = monedaDestino.toUpperCase();

        if (origen.equals(destino)) {
            return cantidad;
        }

        if (origen.equals("USD") && destino.equals("EUR")) {
            return this.cantidad * 0.862;
        } else {
            return this.cantidad * 1.16;
        }

    }

}



