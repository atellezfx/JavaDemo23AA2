package mx.utel.poo.dogtor.herencia;

import mx.utel.poo.dogtor.modelo.Propietario;
import mx.utel.poo.dogtor.util.Especie;
import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    private Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Propietario dueño = new Propietario("Benito", "Bodoque", "5555-5555", "b.bodoque@correo.com");
        Programa prog = new Programa();
        ArrayList<Mascota> mascotas = prog.iniciarAplicacion(dueño);
        prog.imprimeDatos( mascotas );
    }

    private void imprimeDatos(ArrayList<Mascota> mascotas) {
        for (Mascota msc : mascotas) {
            System.out.println(msc);
        }
    }

    private ArrayList<Mascota> iniciarAplicacion(Propietario dueño) {
        System.out.println("SISTEMA DE GESTIÓN VETERINARIA");
        ArrayList<Mascota> mascotas = new ArrayList<>();
        String opcion;
        do {
            Mascota msc = crearMascota();
            mascotas.add( msc );
            System.out.print("¿Desea agregar otra mascota? (s/n): ");
            opcion = scn.next();
        } while( opcion.equals("s") );
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
        return switch(especie) {
            case PERRO -> new Perro(nombre, genero, talla, fechaNac);
            case GATO -> new Gato(nombre, genero, talla, fechaNac);
            case AVE -> new Ave(nombre, genero, talla, fechaNac);
        };
    }

    private Especie solicitarEspecie() {
        System.out.println("Seleccione la especie de la mascota");
        System.out.println("0. Perro");
        System.out.println("1. Gato");
        System.out.println("2. Ave");
        System.out.print("Opción: ");
        int opcion = scn.nextInt();
        Especie[] especies = Especie.values();
        return especies[opcion];
    }

    private Genero solicitarGenero() {
        System.out.println("Seleccione el género de la mascota");
        System.out.println("0. Hembra");
        System.out.println("1. Macho");
        System.out.print("Opción: ");
        int opcion = scn.nextInt();
        Genero[] generos = Genero.values();
        return generos[opcion];
    }

    private Talla solicitarTalla() {
        System.out.println("Seleccione la talla de la mascota");
        System.out.println("0. Chica");
        System.out.println("1. Mediana");
        System.out.println("2. Grande");
        System.out.println("3. Extra Grande");
        System.out.print("Opción: ");
        int opcion = scn.nextInt();
        Talla[] tallas = Talla.values();
        return tallas[opcion];
    }

    private LocalDate solicitarFechaNac() {
        System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
        return LocalDate.parse( scn.next() );
    }




}
