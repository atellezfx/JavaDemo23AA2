package mx.utel.poo.arreglos;

import java.time.LocalDate;
import java.time.Period;

public record Empleado(String nombre, double salario, LocalDate fechaNac) {
    
    public int edad() {
        LocalDate hoy = LocalDate.now();
        Period per = Period.between(fechaNac, hoy);
        return per.getYears();
    }

    @Override
    public String toString() {
        String cadena = "Empleado: %s, edad: %d años, salario: $%,.2f";
        return cadena.formatted(nombre, edad(), salario);
    }
}
