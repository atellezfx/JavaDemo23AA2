package mx.utel.poo.intro;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String toString() {
        // TODO: Reemplazar código por cadena con formato
        // En esta línea 18 se crean 11 cadenas de texto
        return "Persona nombre: " + nombre + " apellido: " + apellido + ", edad: " + edad;
    }


}
