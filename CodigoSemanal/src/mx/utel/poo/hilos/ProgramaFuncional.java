package mx.utel.poo.hilos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class ProgramaFuncional {

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>(6); // puede crecer

    public static void main(String[] args) {
        ProgramaFuncional prog = new ProgramaFuncional();
        // Contratando empleados del cafetal
        prog.contratar( MaestroTostador::new, "Xavier", "Eduardo");
        prog.contratar( Recolector::new, "Miguel", "Juan", "Diana", "Lucía");
        prog.iniciarJornadaLaboral();
    }

    private void iniciarJornadaLaboral() {
//        empleados.forEach( emp -> emp.start() );
        empleados.forEach( Empleado::start );
    }

    private void contratar(Function<String, Empleado> funcion,  String ... nombres) {
        var lista = Arrays.stream( nombres ).map( funcion ).toList();
        empleados.addAll( lista );
    }

}
