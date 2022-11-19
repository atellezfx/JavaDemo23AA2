package mx.utel.poo.estructuras;

import java.time.LocalDate;
import java.util.Scanner;

public class Programa {

    private Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Programa prog = new Programa();
        Banco bnk = new Banco("BBVA");
        prog.procesarSolicitud(bnk);
    }

    private void procesarSolicitud(Banco bnk) {
        System.out.println("========== SOLICITUD DE CRÉDITO ==========");
        System.out.print("Ingrese el monto solicitado: ");
        float monto = scn.nextFloat(); // No consume el enter del teclado
        Cliente cli = crearCliente();
        var optCred = bnk.solicitarCredito(cli, monto);
        if( optCred.isPresent() ) System.out.println(optCred.get()); // TODO: Explicar programación funcional
        else System.out.println("El crédito solicitado no fue aprobado");
    }

    private Cliente crearCliente() {
        System.out.print("Ingrese su nombre completo: ");
        String nombre = scn.next();
        System.out.print("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNac = LocalDate.parse( scn.next() );
        return new Cliente(nombre, fechaNac);
    }

}
