package mx.utel.poo.dogtor.beans;

import java.time.LocalDate;
import java.time.Period;

public class Mascota {

    private String nombre;
    private String talla; // TODO: Cambiar por una enumeración
    private String tipo; // TODO: Cambiar por una enumeración
    private String genero; // TODO: Cambiar por una enumeración
    private LocalDate fechaNac;
    private Propietario dueño;

    public Mascota(String nombre, String tipo, String genero, String talla, LocalDate fechaNac) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.talla = talla;
    }

    public int edad() {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between(fechaNac, hoy);
        return per.getYears();
    }

    public int edadHumana() {
        if( tipo.equalsIgnoreCase("Perro") ) {
            int edadNatural = edad();
            if( edadNatural == 1 ) return 16;
            if( edadNatural == 2 ) return 24;
            return calcularEdad( edadNatural );
        } else {
            return -1;
        }
    }

    private int calcularEdad(int edadNatural) {
        return switch(talla) {
            case "chica", "mediana" -> 24 + ((edadNatural - 2) * 5);
            case "grande" -> 24 + ((edadNatural - 2) * 6);
            case "extragrande" -> 24 + ((edadNatural - 2) * 7);
            default -> -1;
        };
    }

    public void asignarPropietario(Propietario prop) {
        this.dueño = prop;
    }

    @Override
    public String toString() {
        String cadena = "Mascota[nombre='%s', tipo='%s', genero='%s', dueño='%s', edad='%d', edadHumana='%d']";
        return cadena.formatted(nombre, tipo, genero, dueño, edad(), edadHumana());
    }
}
