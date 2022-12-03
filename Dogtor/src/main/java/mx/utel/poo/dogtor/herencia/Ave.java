package mx.utel.poo.dogtor.herencia;

import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;

public final class Ave extends Mascota {

    public Ave(String nombre, Genero genero, Talla talla, LocalDate fechaNac) {
        super(nombre, genero, talla, fechaNac);
    }

    @Override
    public void comer() {
        System.out.println("El ave está comiendo alpiste");
    }

    @Override
    public void desplazarse() {
        System.out.println("El ave está volando");
    }

    @Override
    public void dormir() {
        System.out.println("El ave está durmiendo");
    }

    @Override
    public int edadHumana() {
        return -1;
    }
}
