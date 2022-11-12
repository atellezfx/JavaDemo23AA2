package mx.utel.poo.dogtor.modelo;

import mx.utel.poo.dogtor.util.Especie;
import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;
import java.time.Period;

public class Mascota {

    private String nombre;
    private Talla talla;
    private Especie especie;
    private Genero genero;
    private LocalDate fechaNac;
    private Propietario dueño;

    public Mascota(String nombre, Especie especie, Genero genero, Talla talla, LocalDate fechaNac) {
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.talla = talla;
    }

    public int edad() {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between(fechaNac, hoy);
        return per.getYears();
    }

//    private int calcularEdad(int edadNatural) {
//        return switch(talla) {
//            case CHICA, MEDIANA -> 24 + ((edadNatural - 2) * 5);
//            case GRANDE -> 24 + ((edadNatural - 2) * 6);
//            case EXTRA_GRANDE -> 24 + ((edadNatural - 2) * 7);
//        };
//    }

    public void asignarPropietario(Propietario prop) {
        this.dueño = prop;
    }

    @Override
    public String toString() {
        String cadena = "Mascota[nombre='%s', tipo='%s', genero='%s', dueño='%s', edad='%d']";
        return cadena.formatted(nombre, especie, genero, dueño, edad());
    }
}
