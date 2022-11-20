package mx.utel.poo.dogtor.modelo;

import mx.utel.poo.dogtor.util.CalculadoraEdadHumana;
import mx.utel.poo.dogtor.util.Especie;
import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        Propietario dueño = new Propietario("Benito", "Bodoque", "5555-5555", "b.bodoque@correo.com");

        Mascota m1 = new Mascota("Denver", Especie.PERRO, Genero.MACHO, Talla.GRANDE,  LocalDate.parse("2014-11-08"));
        m1.asignarPropietario( dueño );

        Mascota m2 = new Mascota("Camy", Especie.PERRO, Genero.HEMBRA, Talla.GRANDE,  LocalDate.parse("2014-11-08"));
        m2.asignarPropietario( dueño );

        Mascota m3 = new Mascota("Kia", Especie.PERRO, Genero.HEMBRA, Talla.CHICA, LocalDate.parse("2016-01-14"));
        m3.asignarPropietario( dueño );

        CalculadoraEdadHumana calc = new CalculadoraEdadHumana();

        System.out.println(m1);
        System.out.printf("Edad humana de %s: %d años\n", m1.getNombre(), calc.edadHumana(m1) );
        System.out.println(m2);
        System.out.printf("Edad humana de %s: %d años\n", m2.getNombre(), calc.edadHumana(m2) );
        System.out.println(m3);
        System.out.printf("Edad humana de %s: %d años\n", m3.getNombre(), calc.edadHumana(m3) );




    }

}
