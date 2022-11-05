package mx.utel.poo.dogtor.beans;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        Propietario dueño = new Propietario("Alejandro", "5555-5555", "alejandro@correo.com");

        Mascota m1 = new Mascota("Denver", "Perro", "Macho", "grande",  LocalDate.parse("2014-11-08"));
        m1.asignarPropietario( dueño );

        Mascota m2 = new Mascota("Camy", "Perro", "Hembra", "grande",  LocalDate.parse("2014-11-08"));
        m2.asignarPropietario( dueño );

        Mascota m3 = new Mascota("Kia", "Perro", "Hembra", "grande", LocalDate.parse("2016-01-14"));
        m3.asignarPropietario( dueño );

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }

}
