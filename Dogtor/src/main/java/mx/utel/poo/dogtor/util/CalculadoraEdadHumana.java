package mx.utel.poo.dogtor.util;

import mx.utel.poo.dogtor.modelo.Mascota;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdadHumana {

    public int edadHumana(Mascota m) {
        return switch( m.getEspecie() ) { // <--- EXPRESION SWITCH
            case PERRO -> edadHumanaPerro(m);
            case GATO -> edadHumanaGato(m);
            default -> -1;
        };
    }

    private int edadHumanaGato(Mascota m) {
        int edadNatural = m.edad();
        if( edadNatural <= 1 ) return edadGatoPorMeses( m );
        return 24 + ( (edadNatural-2) * 4 );
    }

    private int edadGatoPorMeses(Mascota m) {
        int meses = edadEnMeses(m.getFechaNac());
        if( meses <= 1 ) return meses;
        if( meses <= 3 ) return 3;
        if( meses <= 5 ) return 6;
        if( meses <= 7 ) return 9;
        if( meses <= 9 ) return 11;
        if( meses <= 11 ) return 13;
        if( meses == 12 ) return 15;
        return 20;
    }

    private int edadHumanaPerro(Mascota m) {
        int edadNatural = m.edad();
        if( edadNatural == 0 ) return edadPerroPorMeses(m);
        if( edadNatural <= 2 ) return 8 * (edadNatural + 1);
        return edadPerroPorTalla(m);
    }

    private int edadPerroPorMeses(Mascota m) {
        int meses = edadEnMeses(m.getFechaNac());
        if( meses <= 3 ) return meses;
        if( meses <= 5 ) return 6;
        if( meses <= 7 ) return 10;
        if( meses <= 9 ) return 12;
        return 14;
    }

    private int edadPerroPorTalla(Mascota m) {
        int diff = m.getTalla().getDiferencia();
        int edadNatural = m.edad();
        return 24 + ( (edadNatural - 2) * diff );
    }

    private int edadEnMeses( LocalDate fechaNac ) {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between( fechaNac, hoy );
        return per.getMonths();
    }


}
