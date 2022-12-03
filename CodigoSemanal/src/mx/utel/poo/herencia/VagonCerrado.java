package mx.utel.poo.herencia;

public class VagonCerrado extends Vagon {

    private double ladoA, ladoB, largo;

    public VagonCerrado(String contenido) {
        this(contenido, 1.4, 1.2, 4.3 );
    }

    public VagonCerrado(String contenido, double ladoA, double ladoB, double largo) {
        super(contenido);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.largo = largo;
    }

    @Override
    public double calcularVolumen() {
        return ladoA * ladoB * largo;
    }

}
