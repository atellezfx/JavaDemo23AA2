package mx.utel.poo.arreglos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ArreglosSimples {

    private Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println("#############################");
        System.out.println("## PLANTILLA DE EMPLEADOS  ##");
        System.out.println("#############################");
        ArreglosSimples prog = new ArreglosSimples();
        Empleado[] empleados = prog.crearArreglo();
        prog.imprimirArreglo(empleados);
    }

    private void imprimirArreglo(Empleado[] empleados) {
        System.out.println("===============================================");
        System.out.println(">> Ocupando ciclo for tradicional");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]);
        }
        System.out.println("===============================================");
        System.out.println(">> Ocupando ciclo for/each"); // JDK 5
        for (Empleado e : empleados) {
            System.out.println(e);
        }
        System.out.println("===============================================");
        System.out.println(">> Ocupando programación funcional (1ª Forma)"); // JDK 8
        Arrays.stream( empleados )
//                .filter( e -> e.nombre().startsWith("B") )
//                .map( e -> e.nombre() )
                .forEach( e -> System.out.println(e));
        System.out.println("===============================================");
        System.out.println(">> Ocupando programación funcional (2ª Forma)"); // JDK 8
        Arrays.stream( empleados ).forEach( System.out::println );
    }

    private Empleado[] crearArreglo() {
        System.out.print("¿Cuántos empleados desea registrar?: ");
        int cantidad = scn.nextInt(); // NO CONSUME EL ENTER DEL BUFFER DEL TECLADO!!!
        Empleado[] empleados = new Empleado[ cantidad ];
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = crearEmpleado();
        }
        return empleados;
    }

    private Empleado crearEmpleado() {
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("###########################");
        System.out.print("Nombre: ");
        String nombre = scn.next();
        System.out.print("Salario: ");
        double salario = scn.nextDouble();
        System.out.print("Fecha de nacimiento  (yyyy-mm-dd): ");
        LocalDate fechaNac = LocalDate.parse( scn.next() );
        return new Empleado(nombre, salario, fechaNac);
    }


}
