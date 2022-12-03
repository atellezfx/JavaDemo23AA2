package mx.utel.poo.dogtor.herencia;

import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;

public final class Gato extends Mascota {

    public Gato(String nombre, Genero genero, Talla talla, LocalDate fechaNac) {
        super(nombre, genero, talla, fechaNac);
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo whiskas");
    }

    @Override
    public void desplazarse() {
        System.out.println("El gato está caminando");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo");
    }

    @Override
    public int edadHumana() {
        CalculadoraEdadHumana calc = new CalculadoraEdadHumana();
        return calc.edadHumana(this);
    }
}
