package mx.utel.poo.herencia;

public class VagonCisterna extends Vagon {

    private double largo, radio;

    public VagonCisterna(String contenido) {
        this(contenido, 4.3, 1.2);
    }

    public VagonCisterna(String contenido, double largo, double radio) {
        super(contenido);
        this.largo = largo;
        this.radio = radio;
    }

    @Override
    public double calcularVolumen() {
        double r2 = Math.pow( radio, 2 );
        return Math.PI * r2 * largo;
    }
}
