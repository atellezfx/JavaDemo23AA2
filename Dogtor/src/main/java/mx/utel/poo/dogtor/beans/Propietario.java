package mx.utel.poo.dogtor.beans;

public class Propietario {

    private String nombre;
    private String telefono;
    private String email;

    public Propietario(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
