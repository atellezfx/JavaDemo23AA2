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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int edad() {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between(fechaNac, hoy);
        return per.getYears();
    }

    public void asignarPropietario(Propietario prop) {
        this.dueño = prop;
    }

    @Override
    public String toString() {
        String cadena = "Mascota[nombre='%s', tipo='%s', genero='%s', dueño='%s', edad='%d']";
        return cadena.formatted(nombre, especie, genero, dueño, edad());
    }
}
