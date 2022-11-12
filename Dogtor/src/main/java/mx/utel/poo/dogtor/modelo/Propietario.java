package mx.utel.poo.dogtor.modelo;

public record Propietario(String nombre, String apellidos, String telefono, String email) {

    @Override
    public String toString() {
        return "%s, %s".formatted( apellidos, nombre );
    }

}
