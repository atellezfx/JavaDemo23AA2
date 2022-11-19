package mx.utel.poo.estructuras;

public class Credito {

    private float monto;
    private float interes;

    public Credito(float monto, float interes) {
        this.monto = monto;
        this.interes = interes;
    }

    @Override
    public String toString() {
        int tasa = (int) (interes * 100);
        String cadena = "Crédito autorizado de $%,.2f con una tasa del %d%%";
        return cadena.formatted(monto, tasa);
    }
}
