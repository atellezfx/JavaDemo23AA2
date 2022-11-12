package mx.utel.poo.objetos;

public enum Modelo {

    INCANDESCENTE, LED, FLUORESCENTE, XENON, HALOGENO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
