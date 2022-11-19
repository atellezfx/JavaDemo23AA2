package mx.utel.poo.estructuras;

public enum RangoEdad {
    // JOVEN Tiene un rango de edad entre 18 y 24 años
    // ADULTO Tiene un rango de edad entre 25 y 59 años
    // SENIOR Tiene un rango de edad entre 60 y 80 años
    JOVEN(18,24), ADULTO(25,59), SENIOR(60,80);

    private int edadMin, edadMax;

    private RangoEdad(int edadMin, int edadMax) {
        this.edadMin = edadMin;
        this.edadMax = edadMax;
    }

    public boolean estaEnRango(int edad) {
        return (edad >= edadMin && edad <= edadMax);
    }

}
