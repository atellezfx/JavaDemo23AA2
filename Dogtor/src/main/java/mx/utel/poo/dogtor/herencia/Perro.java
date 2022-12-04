package mx.utel.poo.dogtor.herencia;

import mx.utel.poo.dogtor.util.Genero;
import mx.utel.poo.dogtor.util.Talla;

import java.time.LocalDate;

public final class Perro extends Mascota {

    public Perro(String nombre, Genero genero, Talla talla, LocalDate fechaNac) {
        super(nombre, genero, talla, fechaNac);
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo un sirloin");
    }

    @Override
    public void desplazarse() {
        System.out.println("El perro está corriendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo");
    }

    @Override
    public int edadHumana() {
        CalculadoraEdadHumana calc = new CalculadoraEdadHumana();
        return calc.edadHumana( this );
    }

}
