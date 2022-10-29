package mx.utel.poo.dogtor.beans;

public class Mascota {

    private String nombre;
    private String tipo;
    private String genero;
    private Propietario dueño;

    public Mascota(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
    }

    public void asignarPropietario(Propietario prop) {
        this.dueño = prop;
    }

    @Override
    public String toString() {
        String cadena = "Mascota[nombre='%s', tipo='%s', genero='%s', dueño='%s']";
        return cadena.formatted(nombre, tipo, genero, dueño);
    }
}
