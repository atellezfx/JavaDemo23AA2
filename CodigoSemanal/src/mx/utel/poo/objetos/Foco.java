package mx.utel.poo.objetos;

public class Foco {

    private int lumenes;
    private Modelo tipo;

    public Foco(int lumenes, Modelo tipo) {
        this.lumenes = lumenes;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
//        String cadena = "Foco tipo %s con %d lm";
//        return cadena.formatted(tipo, lumenes);
//        return String.format("Foco tipo %s con %d lm", tipo, lumenes);
        return "Foco tipo %s con %d lm".formatted(tipo, lumenes);
    }
}
