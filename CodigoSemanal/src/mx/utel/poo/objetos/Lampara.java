package mx.utel.poo.objetos;

public class Lampara {

    private String marca;
    private Foco foco;
    private Bateria bateria;

    public Lampara(String marca, Foco foco) {
        this.marca = marca;
        this.foco = foco;
    }

    // Un método set sin la palabra set
    public void colocarBateria(Bateria bat) {
        bateria = bat;
    }

    @Override
    public String toString() {
        // String cadena = "Lámpara %s:\n\tmarca %s\n\t%s x2";
        // Ocupando String Blocks
        String cadena = """
                Lámpara %s:
                    ● %s
                    ● %s x2""";
        return cadena.formatted(marca, foco, bateria);
    }
}