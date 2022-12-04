package mx.utel.poo.dogtor.modelo;

import mx.utel.poo.dogtor.util.Especie;
import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;
import java.util.Scanner;

public class Programa {

    private final Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Propietario prop = new Propietario("Benito", "Bodoque", "5555-5555", "b.bodoque@correo.com");
        Programa prog = new Programa();
        Mascota[] mascotas = prog.iniciarAplicacion(prop);
        prog.imprimeDatos( mascotas );
    }

    private void imprimeDatos(Mascota[] mascotas) {
        for (Mascota msc : mascotas) {
            System.out.println(msc);
        }
    }

    private Mascota[] iniciarAplicacion(Propietario prop) {
        System.out.println("SISTEMA DE GESTIÓN VETERINARIA");
        System.out.print("¿Cuántas mascotas va a registrar?: ");
        int cantidad = scn.nextInt();
        Mascota[] mascotas = new Mascota[ cantidad ];
        for (int i = 0; i < mascotas.length; i++) {
            mascotas[i] = crearMascota();
            mascotas[i].asignarPropietario(prop);
        }
        return mascotas;
    }

    private Mascota crearMascota() {
        System.out.println("REGISTRANDO MASCOTA");
        System.out.print("Nombre: ");
        String nombre = scn.next();
        Especie especie = solicitarEspecie();
        Genero genero = solicitarGenero();
        Talla talla = solicitarTalla();
        LocalDate fechaNac = solicitarFechaNac();
        return new Mascota(nombre, especie, genero, talla, fechaNac);
    }

    private Especie solicitarEspecie() {
        System.out.println("""
            Seleccione la especie de la mascota;
                0. Perro
                1. Gato
                2. Ave
            Opción:\s""");
        int opcion = scn.nextInt();
        Especie[] especies = Especie.values();
        return especies[opcion];
    }

    private Genero solicitarGenero() {
        System.out.println("""
            Seleccione el género de la mascota
                0. Hembra
                1. Macho
            Opción:\s""");
        int opcion = scn.nextInt();
        Genero[] generos = Genero.values();
        return generos[opcion];
    }

    private Talla solicitarTalla() {
        System.out.println("""
            Seleccione la talla de la mascota
                0. Chica
                1. Mediana
                2. Grande
                3. Extra Grande
            Opción:\s""");
        int opcion = scn.nextInt();
        Talla[] tallas = Talla.values();
        return tallas[opcion];
    }

    private LocalDate solicitarFechaNac() {
        System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
        return LocalDate.parse( scn.next() );
    }


}
