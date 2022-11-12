package mx.utel.poo.fundamentos;

import java.util.Scanner;

public class Programa {

    private Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Programa prog = new Programa();
        int opcion = prog.imprimeMenu();
        int resultado = prog.realizaOperacion(opcion);
        System.out.printf("El resultado de la operación fué %d \n", resultado);
    }

    private int realizaOperacion(int opcion) {
        Operaciones oper = new Operaciones();
        int x = pedirEntero("Escribe el valor de x: ");
        int y = pedirEntero("Escribe el valor de y: ");
        // TODO: Explicar expresión switch
        return switch( opcion ) {
            case 1 -> oper.suma(x,y);
            case 2 -> oper.resta(x,y);
            case 3 -> oper.multiplica(x,y);
            case 4 -> oper.division(x,y);
            default -> 0;
        };
    }

    private int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        return scn.nextInt();
    }

    private int imprimeMenu() {
        String menu = """
                PROGRAMA CALCULADORA
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                Selecciona una opción: """;
        return pedirEntero(menu);
//        System.out.println("PROGRAMA CALCULADORA");
//        System.out.println("1. Suma");
//        System.out.println("2. Resta");
//        System.out.println("3. Multiplicación");
//        System.out.println("4. División");
//        return pedirEntero("Selecciona una opción: ");
    }

}
