package mx.utel.poo.hilos;

import java.util.ArrayList;

public class ProgramaImperativo {

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>(6); // puede crecer

    public static void main(String[] args) {
        ProgramaImperativo prog = new ProgramaImperativo();
        // Contratando empleados del cafetal
        prog.contratarMaestrosTostadores("Xavier", "Eduardo");
        prog.contratarRecolectores("Miguel", "Juan", "Diana", "Lucía");
        prog.iniciarJornadaLaboral();
    }

    private void iniciarJornadaLaboral() {
        for( Empleado emp : empleados ) {
            emp.start();
        }
    }

    private void contratarMaestrosTostadores(String ... nombres) {
        for( String cad : nombres ) {
            empleados.add( new MaestroTostador(cad) );
        }
    }

    private void contratarRecolectores(String ... nombres) {
        for( String cad : nombres ) {
            empleados.add( new Recolector(cad) );
        }
    }

}
