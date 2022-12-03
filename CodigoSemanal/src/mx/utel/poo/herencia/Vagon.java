package mx.utel.poo.herencia;

public abstract class Vagon {

    private final String CONTENIDO;

    public Vagon(String contenido) {
        this.CONTENIDO = contenido;
    }

    public String obtenerContenido() {
        return CONTENIDO;
    }

    public String tipo() {
        // Ocupamos API Reflection para determinar el nombre de la clase
        String nombre = this.getClass().getSimpleName();
        return nombre.replace("Vagon", "").toLowerCase();
    }

    public abstract double calcularVolumen();

    @Override
    public String toString() {
        String cadena = "Vagón %s con un volúmen de %,.2f m3 cargado de %s";
        return cadena.formatted(tipo(), calcularVolumen(), CONTENIDO);
    }
}
