package mx.utel.poo.evaluacion3;

import java.util.ArrayList;

public class GrandPrix {

    public static void main(String[] args) {
        GrandPrix prog = new GrandPrix();
        ArrayList<RacingCar> carros = prog.inscribirPilotos("Homero", "Krusty", "Lisa", "Maggie", "Bart");
        prog.iniciarCarrera( carros );
    }

    private ArrayList<RacingCar> inscribirPilotos(String ... nombres) {
        // Programación imperativa (estructurada)
        ArrayList<RacingCar> carros = new ArrayList<>();
        for( String nombre : nombres ) carros.add( new RacingCar(nombre) );
        return carros;
    }

    private void iniciarCarrera(ArrayList<RacingCar> carros) {
        // Programación imperativa (estructurada)
        for (RacingCar carro : carros) carro.start();
    }


}
