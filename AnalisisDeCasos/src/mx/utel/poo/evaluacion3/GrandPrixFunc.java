package mx.utel.poo.evaluacion3;

import java.util.Arrays;
import java.util.stream.Stream;

public class GrandPrixFunc {

    public static void main(String[] args) {
        GrandPrixFunc prog = new GrandPrixFunc();
        Stream<RacingCar> carros = prog.inscribirPilotos("Homero", "Krusty", "Lisa", "Maggie", "Bart");
        prog.iniciarCarrera( carros );
    }

    private Stream<RacingCar> inscribirPilotos(String ... nombres) {
        // Programación funcional
        // return Arrays.stream( nombres ).map( nombre -> new RacingCar(nombre) );

        // Programación funcional con referencia de método
        return Arrays.stream( nombres ).map( RacingCar::new );
    }

    private void iniciarCarrera(Stream<RacingCar> carros) {
        // Programación funcional
        // carros.forEach( car -> car.start() );

        // Programación funcional con referencia de método
        carros.forEach( RacingCar::start );
    }

}
