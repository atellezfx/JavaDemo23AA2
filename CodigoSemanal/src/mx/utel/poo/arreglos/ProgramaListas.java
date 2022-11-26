package mx.utel.poo.arreglos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaListas {

    private Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println("#############################");
        System.out.println("## PLANTILLA DE EMPLEADOS  ##");
        System.out.println("#############################");
        ProgramaListas prog = new ProgramaListas();
        ArrayList<Empleado> empleados = prog.crearLista();
        prog.imprimirLista(empleados);
    }

    private void imprimirLista(ArrayList<Empleado> empleados) {
        empleados.forEach(System.out::println);
    }

    private ArrayList<Empleado> crearLista() {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        String status = "s";
        while( status.equals("s") ) {
            empleados.add( crearEmpleado() );
            System.out.print("Deseas agregar más empleados (s/n)? ");
            status = scn.next();
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
