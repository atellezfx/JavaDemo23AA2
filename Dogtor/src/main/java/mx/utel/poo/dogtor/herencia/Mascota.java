package mx.utel.poo.dogtor.herencia;

import mx.utel.poo.dogtor.modelo.Propietario;
import mx.utel.poo.dogtor.util.Especie;
import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;
import java.time.Period;

public abstract sealed class Mascota implements Animal permits Perro, Gato, Ave  {

    private String nombre;
    private Talla talla;
    private Genero genero;
    private LocalDate fechaNac;

    public Mascota(String nombre, Genero genero, Talla talla, LocalDate fechaNac) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.talla = talla;
    }

    public Talla getTalla() {
        return talla;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public int edad() {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between(fechaNac, hoy);
        return per.getYears();
    }

    public abstract int edadHumana();

    @Override
    public String toString() {
        String nombreClase = this.getClass().getSimpleName();
        String cadena = "%s [nombre='%s', genero='%s', edad='%d', edadHumana='%d']";
        return cadena.formatted(nombreClase, nombre, genero, edad(), edadHumana());
    }
}
