package mx.utel.poo.estructuras;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public record Cliente(String nombre, LocalDate fechaNac) {

    public int edad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between( fechaNac, hoy );
        return periodo.getYears();
    }

    public Optional<RangoEdad> rango() {
        RangoEdad rangoCliente = null;
        for( RangoEdad re : RangoEdad.values() ) { // Ciclo For-Each
            if( re.estaEnRango( edad() ) ) rangoCliente = re;
        }
        return Optional.ofNullable(rangoCliente);
        // return null; // TODO: Explicar valores de tipo Optional
    }

}
