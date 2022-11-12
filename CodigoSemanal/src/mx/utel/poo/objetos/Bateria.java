package mx.utel.poo.objetos;

public record Bateria(float voltaje, int amperaje, boolean recargable) {

    @Override
    public String toString() {
        String cadena = "Bateria %.2f v, %d ma, %s";
        return cadena.formatted(voltaje, amperaje, recargable ? "recargable" : "alcalina" );
    }
}